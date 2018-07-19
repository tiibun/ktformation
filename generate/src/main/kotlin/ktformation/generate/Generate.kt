package ktformation.generate

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.InstanceCreator
import java.io.File
import java.io.IOException
import java.net.URL
import java.util.*
import java.util.zip.GZIPInputStream

/**
 * ResourceGenerator takes AWS CloudFormation Resource Specification
 * documents, and generates Kotlin classes and a JSON schema from them.
 */
class ResourceGenerator(val primaryUrl: String, val fragmentUrls: Map<String, String>, val results: ResourceGeneratorResults) {

    val gson: Gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
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
            generateResources(name, resource, spec)
        }

        return spec
    }

    private fun generateResources(name: String, resource: Resource, spec: CloudFormationResourceSpecification) {

        log(LogLevel.INFO, "generate $name")

        val resourceTemplate = TemplateRepository.load("templates/ResourceTemplate.kts")

        val templateData = mapOf(
                "name" to name,
                "resource" to resource,
                "subproperties" to spec.propertyTypes.filterKeys { it.startsWith("$name.") }
                        .mapKeys { it.key.removePrefix("$name.") }
        )

        // Execute the template, writing it to a buffer
        val buf = try {
            resourceTemplate.putAll(templateData).eval()
        } catch (e: Exception) {
            log(LogLevel.ERROR, "failed to generate resource $name")
            throw e
        }

        // Check if the file has changed since the last time generate ran
        val fn = "../main/src/main/kotlin/ktformation/generated/${filename(name)}"
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
}

// ResourceGeneratorResults contains a summary of the items generated
class ResourceGeneratorResults(val updatedResources: MutableMap<String, String> = HashMap(),
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
