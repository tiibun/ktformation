package ktformation.generate

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.InstanceCreator
import com.google.gson.stream.JsonWriter
import java.io.File
import java.io.IOException
import java.io.StringWriter
import java.net.URL
import java.util.*
import java.util.zip.GZIPInputStream

/**
 * ResourceGenerator takes AWS CloudFormation Resource Specification
 * documents, and generates Kotlin classes and a JSON schema from them.
 */
class ResourceGenerator(val primaryUrl: String, val fragmentUrls: Map<String, String>, val results: ResourceGeneratorResults) {

    val gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .registerTypeAdapter(Map::class.java, InstanceCreator<Map<Any, Any>> {
                TreeMap()
            })
            .setPrettyPrinting()
            .create()
    /**
     * Generate generates Kotlin classes and a JSON schema from the AWS CloudFormation
     * Resource Specifications provided to NewResourceGenerator
     */
    fun generate() {

        // Process the primary template first, since the primary template resources
        // are added to the JSON schema for fragment transform specs
        println("Downloading cloudformation specification from $primaryUrl")
        val primaryData = downloadSpec(primaryUrl)
        val primarySpec = processSpec(primaryData)
        generateJSONSchema("cloudformation", primarySpec)

        for ((name, url) in fragmentUrls) {
            println("Downloading $name specification from $url")
            val data = downloadSpec(url)
            val spec = processSpec(data)
            // Append main CloudFormation schema resource types and property types to this fragment
            for ((k, v) in primarySpec.resourceTypes) {
                spec.resourceTypes[k] = v
            }
            for ((k, v) in primarySpec.propertyTypes) {
                spec.propertyTypes[k] = v
            }
            generateJSONSchema(name, spec)
        }
    }

    fun downloadSpec(location: String): String {
        return if (location.startsWith("http")) {
            URL(location).openStream().let { GZIPInputStream(it).bufferedReader().readText() }
        } else {
            ResourceGenerator::class.java.classLoader.getResource(location).readText()
        }
    }

    fun processSpec(data: String): CloudFormationResourceSpecification {

        // Unmarshall the JSON specification
        val spec = gson.fromJson(data, CloudFormationResourceSpecification::class.java)

        // Write all of the resources in the spec file
        spec.resourceTypes.forEach { name, resource ->
            generateResources(name, resource, false, spec)
        }

        // Write all of the custom types in the spec file
        spec.propertyTypes.forEach { name, resource ->
            generateResources(name, resource, true, spec)
        }

        return spec
    }

    private fun generateResources(name: String, resource: Resource, isCustomProperty: Boolean, spec: CloudFormationResourceSpecification) {

        log(LogLevel.INFO, "generate $name")

        val resourceTemplate = TemplateRepository.load("templates/ResourceTemplate.kts")

        // Pass in the following information into the template
        val sname = structName(name)
        val structNameParts = name.split(".")
        val basename = structName(structNameParts[0])

        val templateData = mapOf(
                "name" to name,
                "structName" to sname,
                "basename" to basename,
                "resource" to resource,
                "isCustomProperty" to isCustomProperty,
                "version" to spec.resourceSpecificationVersion
        )

        // Execute the template, writing it to a buffer
        val buf = try {
            resourceTemplate.putAll(templateData).eval()
        } catch (e: Exception) {
            log(LogLevel.ERROR, "failed to generate resource $name")
            throw e
        }

        // Check if the file has changed since the last time generate ran
        val fn = "../cloudformation/${filename(name)}"
        val current = File(fn).takeIf { it.exists() }?.readText()

        if (buf != current) {
            // Write the file contents out
            try {
                File(fn).writeText(buf)
            } catch (e: IOException) {
                log(LogLevel.ERROR, "failed to write resource file $fn")
                throw e
            }

            // Log the updated resource name to the results
            results.updatedResources[fn] = name
        }

        results.processedCount++
    }

    fun generateJSONSchema(specname: String, spec: CloudFormationResourceSpecification) {

        log(LogLevel.INFO, "generate $specname")

        val schemaTemplate = TemplateRepository.load("templates/SchemaTemplate.kts")

        // Execute the template, writing it to file
        val buf = try {
            schemaTemplate.put("spec", spec).eval()
        } catch (e: Exception) {
            log(LogLevel.ERROR, "failed to generate JSON schema")
            throw e
        }

        // Parse it to JSON objects and back again to format it
        val j = try {
            gson.fromJson(buf, TreeMap::class.java)
        } catch (e: Exception) {
            log(LogLevel.ERROR, "failed to unmarshal JSON schema")
            throw e
        }

        val formatted = try {
            val writer = StringWriter()
            gson.toJson(j, j::class.java, JsonWriter(writer).apply { setIndent("    ") })
            writer.toString()
        } catch (e: Exception) {
            log(LogLevel.ERROR, "failed to marshal JSON schema")
            throw e
        }

        val filename = "../schema/$specname.schema.json"
        try {
            File(filename).writeText(formatted)
        } catch (e: IOException) {
            log(LogLevel.ERROR, "failed to write JSON schema")
            throw e
        }

        results.updatedSchemas[filename] = specname
    }
}

// ResourceGeneratorResults contains a summary of the items generated
class ResourceGeneratorResults(val updatedResources: MutableMap<String, String> = HashMap(),
                               val updatedSchemas: MutableMap<String, String> = HashMap(),
                               var processedCount: Int = 0)

// NewResourceGenerator contains a primary AWS CloudFormation Resource Specification
// document and an array of fragment Resource Specification documents (such as transforms),
// and generates Kotlin classes and a JSON schema from them.
// The input can be a mix of URLs (https://) or files (file://).
fun newResourceGenerator(primaryUrl: String, fragmentUrls: Map<String, String>) =
        ResourceGenerator(
                primaryUrl,
                fragmentUrls,
                ResourceGeneratorResults()
        )

fun generatePolymorphicProperty(name: String, property: Property) {

    // Open the polymorphic property template
    val tmpl = TemplateRepository.load("templates/PolymorphicPropertyTemplate.kts")

    val nameParts = name.split("_")

    val types = listOf(property.primitiveTypes,
            property.primitiveItemTypes,
            property.itemTypes,
            property.types).filterNotNull().flatten()

    val templateData = mapOf(
            "name" to name,
            "basename" to nameParts[0],
            "property" to property,
            "typesJoined" to conjoin("or", types)
    )

    // Execute the template, writing it to file
    val buf = try {
        tmpl.putAll(templateData).eval()
    } catch (e: Exception) {
        log(LogLevel.ERROR, "Failed to generate polymorphic property $name")
        throw e
    }

    // Write the file out
    try {
        File("../cloudformation/${filename(name)}").writeText(buf)
    } catch (e: Exception) {
        log(LogLevel.ERROR, "Failed to write JSON schema")
        throw e
    }
}

fun conjoin(conj: String, items: List<String>): String {
    if (items.isEmpty()) {
        return ""
    }
    if (items.size == 1) {
        return items[0]
    }
    if (items.size == 2) { // "a and b" not "a, and b"
        return items.joinToString(" $conj ")
    }

    val sep = ", "
    val pieces = arrayListOf(items[0])
    for (item in items.slice(1..(items.size - 2))) {
        pieces.addAll(listOf(sep, item))
    }
    pieces.addAll(listOf(sep, conj, " ", items.last()))

    return pieces.joinToString("")
}
