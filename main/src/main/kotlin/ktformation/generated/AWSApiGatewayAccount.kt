
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Account - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
 */
@CloudFormationMarker
class AWSApiGatewayAccount(logicalId: String) : Resource<AWSApiGatewayAccount.Properties>(logicalId, "AWS::ApiGateway::Account") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cloudWatchRoleArn: Any? = null
        fun cloudWatchRoleArn(value: String?) { this.cloudWatchRoleArn = value }
        fun cloudWatchRoleArn(value: IntrinsicFunction) { this.cloudWatchRoleArn = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayAccount(logicalId: String, init: AWSApiGatewayAccount.() -> Unit = {}): AWSApiGatewayAccount {
    return AWSApiGatewayAccount(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
