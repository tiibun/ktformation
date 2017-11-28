
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::UsagePlanKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
@CloudFormationMarker
class AWSApiGatewayUsagePlanKey(logicalId: String) : Resource<AWSApiGatewayUsagePlanKey.Properties>(logicalId, "AWS::ApiGateway::UsagePlanKey") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var keyId: Any? = null
        fun keyId(value: String) { this.keyId = value }
        fun keyId(value: IntrinsicFunction) { this.keyId = value }
        @JvmField var keyType: Any? = null
        fun keyType(value: String) { this.keyType = value }
        fun keyType(value: IntrinsicFunction) { this.keyType = value }
        @JvmField var usagePlanId: Any? = null
        fun usagePlanId(value: String) { this.usagePlanId = value }
        fun usagePlanId(value: IntrinsicFunction) { this.usagePlanId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayUsagePlanKey(logicalId: String, init: AWSApiGatewayUsagePlanKey.() -> Unit = {}): AWSApiGatewayUsagePlanKey {
    return AWSApiGatewayUsagePlanKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
