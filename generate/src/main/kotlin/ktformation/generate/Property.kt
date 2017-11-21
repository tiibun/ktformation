package ktformation.generate

/**
 * Property represents an AWS CloudFormation resource property
 *
 * @property documentation A link to the AWS CloudFormation User Guide that provides information about the property.
 * @property duplicatesAllowed If the value of the type field is List,
 *      indicates whether AWS CloudFormation allows duplicate values.
 *      If the value is true, AWS CloudFormation ignores duplicate values. If the value is false,
 *      AWS CloudFormation returns an error if you submit duplicate values.
 * @property itemType If the value of the type field is List or Map, indicates the type of list or map if they contain
 *      non-primitive types. Otherwise, this field is omitted. For lists or maps that contain primitive types,
 *      the primitiveItemType property indicates the valid value type.
 *      A subproperty name is a valid item type. For example, if the type value is List and
 *      the item type value is PortMapping, you can specify a list of port mapping properties.
 * @property primitiveItemType If the value of the type field is List or Map, indicates the type of list or map
 *      if they contain primitive types. Otherwise, this field is omitted. For lists or maps that contain non-primitive
 *      types, the itemType property indicates the valid value type. The valid primitive types for lists and maps are
 *      String, Long, Integer, Double, Boolean, or Timestamp.
 *      For example, if the type value is List and the item type value is String,
 *      you can specify a list of strings for the property.
 *      If the type value is Map and the item type value is Boolean,
 *      you can specify a string to Boolean mapping for the property.
 * @property primitiveType For primitive values, the valid primitive type for the property.
 *      A primitive type is a basic data type for resource property values.
 *      The valid primitive types are String, Long, Integer, Double, Boolean, Timestamp or Json.
 *      If valid values are a non-primitive type, this field is omitted and the type field indicates
 *      the valid value type.
 * @property required indicates whether the property is required.
 * @property type For non-primitive types, valid values for the property.
 *      The valid types are a subproperty name, List or Map.
 *      If valid values are a primitive type, this field is omitted and the primitiveType field indicates
 *      the valid value type. A list is a comma-separated list of values. A map is a set of key-value pairs,
 *      where the keys are always strings. The value type for lists and maps are indicated by the itemType or
 *      primitiveItemType field.
 * @property updateType During a stack update, the update behavior when you add, remove, or modify the property.
 *      AWS CloudFormation replaces the resource when you change Immutable properties. AWS CloudFormation doesn't
 *      replace the resource when you change mutable properties. Conditional updates can be mutable or immutable,
 *      depending on, for example, which other properties you updated. For more information, see the relevant resource
 *      type documentation.
 */
data class Property(
        val documentation: String,
        val duplicatesAllowed: Boolean,
        val itemType: String?,
        val primitiveItemType: String?,
        val primitiveType: String?,
        val required: Boolean,
        val type: String?,
        val updateType: String,
        val primitiveTypes: MutableList<String>?,
        val primitiveItemTypes: MutableList<String>?,
        val itemTypes: MutableList<String>?,
        val types: MutableList<String>?
) {

    // schema returns a JSON schema for the resource (as a string)
    fun schema(name: String, parent: String): String {

        val schemaPropertyTemplate = TemplateRepository.load("templates/SchemaPropertyTemplate.kts")

        val parentpaths = parent.split(".")

        val templateData = mapOf(
                "name" to name,
                "parent" to parentpaths[0],
                "property" to this
        )

        // Execute the template, writing it to the buffer
        try {
            return schemaPropertyTemplate.putAll(templateData).eval()
        } catch (e: Exception) {
            log(LogLevel.ERROR, "Error: Failed to generate property $name")
            throw e
        }
    }

    // isPolymorphic checks whether a property can be multiple different types
    fun isPolymorphic(): Boolean {
        return primitiveTypes?.isNotEmpty() ?: false ||
                primitiveItemTypes?.isNotEmpty() ?: false ||
                itemTypes?.isNotEmpty() ?: false ||
                types?.isNotEmpty() ?: false
    }

    // isPrimitive checks whether a property is a primitive type
    fun isPrimitive() = !primitiveType.isNullOrEmpty()

    // isMap checks whether a property should be a map (map[string]...)
    fun isMap() = type == "Map"

    // isMapOfPrimitives checks whether a map contains primitive values
    fun isMapOfPrimitives() = isMap() && !primitiveItemType.isNullOrEmpty()

    // isList checks whether a property should be a list ([]...)
    fun isList() = type == "List"

    // isListOfPrimitives checks whether a list containers primitive values
    fun isListOfPrimitives() = isList() && !primitiveItemType.isNullOrEmpty()

    // isCustomType checks wither a property is a custom type
    fun isCustomType() = primitiveType.isNullOrEmpty() && itemType.isNullOrEmpty() && primitiveItemType.isNullOrEmpty()

    // goType returns the correct type for this property
    // within a Go struct. For example, []string or map[string]AWSLambdaFunction_VpcConfig
    fun goType(basename: String, name: String): String {

        if (isPolymorphic()) {

            generatePolymorphicProperty(basename + "_" + name, this)
            return basename + "_" + name

        }

        if (isMap()) {

            if (isMapOfPrimitives()) {
                return "map[string]" + convertTypeToGo(primitiveItemType!!)
            }

            if (itemType == "Tag") {
                return "map[string]Tag"
            }

            return "map[string]" + basename + "_" + itemType

        }

        if (isList()) {

            if (isListOfPrimitives()) {
                return "[]" + convertTypeToGo(primitiveItemType!!)
            }

            if (itemType == "Tag") {
                return "[]Tag"
            }

            return "[]" + basename + "_" + itemType

        }

        if (isCustomType()) {
            return basename + "_" + type
        }

        // Must be a primitive value
        return convertTypeToGo(primitiveType!!)

    }

    // getJSONPrimitiveType returns the correct primitive property type for a JSON schema.
    // If the property is a list/map, then it will return the type of the items.
    fun getJSONPrimitiveType(): String {

        if (isPrimitive()) {
            return convertTypeToJSON(primitiveType!!)
        }

        if (isMap() && isMapOfPrimitives()) {
            return convertTypeToJSON(primitiveItemType!!)
        }

        if (isList() && isListOfPrimitives()) {
            return convertTypeToJSON(primitiveItemType!!)
        }

        return "unknown"

    }
}

fun convertTypeToGo(pt: String) =
        when (pt) {
            "String" -> "string"
            "Long" -> "int64"
            "Integer" -> "int"
            "Double" -> "float64"
            "Boolean" -> "bool"
            "Timestamp" -> "string"
            "Json" -> "interface{}"
            else -> pt
        }


fun convertTypeToJSON(name: String) =
        when (name) {
            "String" -> "string"
            "Long" -> "number"
            "Integer" -> "number"
            "Double" -> "number"
            "Boolean" -> "boolean"
            "Timestamp" -> "string"
            "Json" -> "object"
            else -> name
        }

