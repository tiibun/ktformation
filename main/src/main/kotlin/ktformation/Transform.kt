package ktformation

const val AWS_SERVERLESS_2016_10_31 = "AWS::Serverless-2016-10-31"

/**
 * [Transform - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-section-structure.html)
 * String | [AWSInclude]
 */
typealias Transform = Any

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html
 */
data class AWSInclude(val parameters: Parameters) {
    val name = "AWS::Include"

    class Parameters(val location: String)
}

fun awsInclude(location: String): AWSInclude = AWSInclude(AWSInclude.Parameters(location))

class FnTransform(vararg val includes: AWSInclude) : IntrinsicFunction {
    override val name = "Fn::Transform"
    override val value get() = includes
}
