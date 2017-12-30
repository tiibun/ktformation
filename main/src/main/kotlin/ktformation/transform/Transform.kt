package ktformation.transform

import ktformation.CloudFormation
import ktformation.Transform

const val AWS_SERVERLESS_2016_10_31 = "AWS::Serverless-2016-10-31"

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html
 */
data class AWSInclude(val parameters: Parameters) {
    val name = "AWS::Include"

    class Parameters(val location: String)
}

fun awsInclude(location: String): AWSInclude = AWSInclude(AWSInclude.Parameters(location))

fun CloudFormation.transform(serverless: String): Transform {
    transform = serverless
    return transform as Transform
}

fun CloudFormation.transform(init: () -> AWSInclude): Transform {
    transform = init()
    return transform as Transform
}
