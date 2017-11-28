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
)
