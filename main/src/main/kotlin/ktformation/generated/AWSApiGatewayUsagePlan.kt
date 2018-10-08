
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

        /**
        * [ApiStage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html)
        */
        fun apiStage(init: ApiStage.() -> Unit = {}): ApiStage {
            return ApiStage().also {
                it.init()
            }
        }
        /**
        * [QuotaSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html)
        */
        fun quotaSettings(init: QuotaSettings.() -> Unit = {}): QuotaSettings {
            return QuotaSettings().also {
                it.init()
            }
        }
        /**
        * [ThrottleSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html)
        */
        fun throttleSettings(init: ThrottleSettings.() -> Unit = {}): ThrottleSettings {
            return ThrottleSettings().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class ApiStage {
            /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var apiId: Any? = null

        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun apiId(value: String) {
          this.apiId = value
        }
        
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun apiId(value: IntrinsicFunction) {
          this.apiId = value
        }

        /**
         * [stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var stage: Any? = null

        /**
         * [stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stage(value: String) {
          this.stage = value
        }
        
        /**
         * [stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stage(value: IntrinsicFunction) {
          this.stage = value
        }

        /**
         * [throttle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var throttle: Any? = null

        /**
         * [throttle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun throttle(value: Map<String, Any>) {
          this.throttle = value
        }
        
    }

    @CloudFormationMarker
    class QuotaSettings {
            /**
         * [limit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var limit: Any? = null

        /**
         * [limit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun limit(value: Int) {
          this.limit = value
        }
        
        /**
         * [limit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun limit(value: IntrinsicFunction) {
          this.limit = value
        }

        /**
         * [offset](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var offset: Any? = null

        /**
         * [offset](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun offset(value: Int) {
          this.offset = value
        }
        
        /**
         * [offset](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun offset(value: IntrinsicFunction) {
          this.offset = value
        }

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var period: Any? = null

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun period(value: String) {
          this.period = value
        }
        
        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun period(value: IntrinsicFunction) {
          this.period = value
        }

    }

    @CloudFormationMarker
    class ThrottleSettings {
            /**
         * [burstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var burstLimit: Any? = null

        /**
         * [burstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun burstLimit(value: Int) {
          this.burstLimit = value
        }
        
        /**
         * [burstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun burstLimit(value: IntrinsicFunction) {
          this.burstLimit = value
        }

        /**
         * [rateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var rateLimit: Any? = null

        /**
         * [rateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun rateLimit(value: Double) {
          this.rateLimit = value
        }
        
        /**
         * [rateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun rateLimit(value: IntrinsicFunction) {
          this.rateLimit = value
        }

    }

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
