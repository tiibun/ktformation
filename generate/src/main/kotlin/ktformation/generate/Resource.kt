package ktformation.generate

/**
 * Resource represents an AWS CloudFormation resource such as AWS::EC2::Instance
 *
 * @property documentation Documentation is a link to the AWS CloudFormation User Guide for information about the resource.
 * @property properties Properties are a list of property specifications for the resource. For details, see:
 *      http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-resource-specification-format.html#cfn-resource-specification-eval-propertytypes
 */
data class Resource(
        val documentation: String,
        val properties: Map<String, Property>
) {

    /**
     * Schema returns a JSON Schema for the resource (as a string)
     */
    fun schema(name: String, isCustomProperty: Boolean): String {

        val schemaResourceTemplate = TemplateRepository.load("templates/SchemaResourceTemplate.kts")

        val templateData = mapOf(
                "name" to name,
                "resource" to this,
                "isCustomProperty" to isCustomProperty
        )

        // Execute the template, writing it to the buffer
        val buf = try {
            schemaResourceTemplate.putAll(templateData).eval()
        } catch (e: Exception) {
            log(LogLevel.ERROR, "Error: Failed to generate resource $name")
            throw e
        }

        return buf
    }

    /**
     * Required returns a comma separated list of the required properties for this resource
     */
    val required: String
        get() = properties.filter { (_, property) -> property.required }.map { (name, _) -> "\"$name\"" }
                .sorted().joinToString(", ")
}