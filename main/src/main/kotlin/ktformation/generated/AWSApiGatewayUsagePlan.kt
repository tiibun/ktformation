
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::UsagePlan - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
 */
@CloudFormationMarker
class AWSApiGatewayUsagePlan(logicalId: String) : Resource<AWSApiGatewayUsagePlan.Properties>(logicalId, "AWS::ApiGateway::UsagePlan") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var apiStages: Any? = null
        fun apiStages(value: List<ApiStage>) {
            this.apiStages = value
        }
        fun apiStages(vararg value: IntrinsicFunction) { this.apiStages = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var quota: Any? = null
        fun quota(value: QuotaSettings) {
            this.quota = value
        }
        fun quota(value: IntrinsicFunction) { this.quota = value }
        @JvmField var throttle: Any? = null
        fun throttle(value: ThrottleSettings) {
            this.throttle = value
        }
        fun throttle(value: IntrinsicFunction) { this.throttle = value }
        @JvmField var usagePlanName: Any? = null
        fun usagePlanName(value: String) {
            this.usagePlanName = value
        }
        fun usagePlanName(value: IntrinsicFunction) { this.usagePlanName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ApiStage(
            val apiId: String? = null,
            val stage: String? = null
    )

    class QuotaSettings(
            val limit: Int? = null,
            val offset: Int? = null,
            val period: String? = null
    )

    class ThrottleSettings(
            val burstLimit: Int? = null,
            val rateLimit: Double? = null
    )

}

fun Resources.awsApiGatewayUsagePlan(logicalId: String, init: AWSApiGatewayUsagePlan.() -> Unit = {}): AWSApiGatewayUsagePlan {
    return AWSApiGatewayUsagePlan(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
