
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::UsagePlan - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
 */
@CloudFormationMarker
class AWSApiGatewayUsagePlan(logicalId: String) : Resource<AWSApiGatewayUsagePlan.Properties>(logicalId, "AWS::ApiGateway::UsagePlan") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [apiStages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
         *
         * _Required_: no
         *
         * _Type_: List<ApiStage>
         */
        @JvmField
        var apiStages: Any? = null

        /**
         * [apiStages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
         *
         * _Required_: no
         *
         * _Type_: List<ApiStage>
         */
        fun apiStages(value: List<ApiStage>) {
          this.apiStages = value
        }
        
        /**
         * [apiStages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages)
         *
         * _Required_: no
         *
         * _Type_: List<ApiStage>
         */
        fun apiStages(vararg value: IntrinsicFunction) {
          this.apiStages = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [quota](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
         *
         * _Required_: no
         *
         * _Type_: QuotaSettings
         */
        @JvmField
        var quota: Any? = null

        /**
         * [quota](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
         *
         * _Required_: no
         *
         * _Type_: QuotaSettings
         */
        fun quota(value: QuotaSettings) {
          this.quota = value
        }
        
        /**
         * [quota](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-quota)
         *
         * _Required_: no
         *
         * _Type_: QuotaSettings
         */
        fun quota(value: IntrinsicFunction) {
          this.quota = value
        }
        
        /**
         * [throttle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
         *
         * _Required_: no
         *
         * _Type_: ThrottleSettings
         */
        @JvmField
        var throttle: Any? = null

        /**
         * [throttle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
         *
         * _Required_: no
         *
         * _Type_: ThrottleSettings
         */
        fun throttle(value: ThrottleSettings) {
          this.throttle = value
        }
        
        /**
         * [throttle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-throttle)
         *
         * _Required_: no
         *
         * _Type_: ThrottleSettings
         */
        fun throttle(value: IntrinsicFunction) {
          this.throttle = value
        }
        
        /**
         * [usagePlanName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var usagePlanName: Any? = null

        /**
         * [usagePlanName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun usagePlanName(value: String) {
          this.usagePlanName = value
        }
        
        /**
         * [usagePlanName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun usagePlanName(value: IntrinsicFunction) {
          this.usagePlanName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ApiStage(
            /**
             * [ApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val apiId: String? = null,
            /**
             * [Stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val stage: String? = null
    )

    class QuotaSettings(
            /**
             * [Limit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val limit: Int? = null,
            /**
             * [Offset](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val offset: Int? = null,
            /**
             * [Period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val period: String? = null
    )

    class ThrottleSettings(
            /**
             * [BurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val burstLimit: Int? = null,
            /**
             * [RateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val rateLimit: Double? = null
    )

}

/**
 * [AWS::ApiGateway::UsagePlan - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html)
 */
fun Resources.awsApiGatewayUsagePlan(logicalId: String, init: AWSApiGatewayUsagePlan.() -> Unit = {}): AWSApiGatewayUsagePlan {
    return AWSApiGatewayUsagePlan(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
