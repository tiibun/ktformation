
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodePipeline::Webhook - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html)
 */
@CloudFormationMarker
class AWSCodePipelineWebhook(logicalId: String) : Resource<AWSCodePipelineWebhook.Properties>(logicalId, "AWS::CodePipeline::Webhook") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [authentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var authentication: Any? = null

        /**
         * [authentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authentication(value: String) {
          this.authentication = value
        }
        
        /**
         * [authentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authentication(value: IntrinsicFunction) {
          this.authentication = value
        }

        /**
         * [authenticationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authenticationconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: WebhookAuthConfiguration
         */
        @JvmField
        var authenticationConfiguration: Any? = null

        /**
         * [authenticationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authenticationconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: WebhookAuthConfiguration
         */
        fun authenticationConfiguration(value: WebhookAuthConfiguration) {
          this.authenticationConfiguration = value
        }
        
        /**
         * [authenticationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authenticationconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: WebhookAuthConfiguration
         */
        fun authenticationConfiguration(value: IntrinsicFunction) {
          this.authenticationConfiguration = value
        }

        /**
         * [filters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters)
         *
         * _Required_: yes
         *
         * _Type_: List<WebhookFilterRule>
         */
        @JvmField
        var filters: Any? = null

        /**
         * [filters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters)
         *
         * _Required_: yes
         *
         * _Type_: List<WebhookFilterRule>
         */
        fun filters(value: List<WebhookFilterRule>) {
          this.filters = value
        }
        
        /**
         * [filters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters)
         *
         * _Required_: yes
         *
         * _Type_: List<WebhookFilterRule>
         */
        fun filters(vararg value: IntrinsicFunction) {
          this.filters = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [registerWithThirdParty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var registerWithThirdParty: Any? = null

        /**
         * [registerWithThirdParty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun registerWithThirdParty(value: Boolean) {
          this.registerWithThirdParty = value
        }
        
        /**
         * [registerWithThirdParty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun registerWithThirdParty(value: IntrinsicFunction) {
          this.registerWithThirdParty = value
        }

        /**
         * [targetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var targetAction: Any? = null

        /**
         * [targetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetAction(value: String) {
          this.targetAction = value
        }
        
        /**
         * [targetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetAction(value: IntrinsicFunction) {
          this.targetAction = value
        }

        /**
         * [targetPipeline](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var targetPipeline: Any? = null

        /**
         * [targetPipeline](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetPipeline(value: String) {
          this.targetPipeline = value
        }
        
        /**
         * [targetPipeline](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetPipeline(value: IntrinsicFunction) {
          this.targetPipeline = value
        }

        /**
         * [targetPipelineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var targetPipelineVersion: Any? = null

        /**
         * [targetPipelineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun targetPipelineVersion(value: Int) {
          this.targetPipelineVersion = value
        }
        
        /**
         * [targetPipelineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun targetPipelineVersion(value: IntrinsicFunction) {
          this.targetPipelineVersion = value
        }

        /**
        * [WebhookAuthConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html)
        */
        fun webhookAuthConfiguration(init: WebhookAuthConfiguration.() -> Unit = {}): WebhookAuthConfiguration {
            return WebhookAuthConfiguration().also {
                it.init()
            }
        }
        /**
        * [WebhookFilterRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html)
        */
        fun webhookFilterRule(init: WebhookFilterRule.() -> Unit = {}): WebhookFilterRule {
            return WebhookFilterRule().also {
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
    class WebhookAuthConfiguration {
            /**
         * [allowedIPRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var allowedIPRange: Any? = null

        /**
         * [allowedIPRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allowedIPRange(value: String) {
          this.allowedIPRange = value
        }
        
        /**
         * [allowedIPRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allowedIPRange(value: IntrinsicFunction) {
          this.allowedIPRange = value
        }

        /**
         * [secretToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var secretToken: Any? = null

        /**
         * [secretToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun secretToken(value: String) {
          this.secretToken = value
        }
        
        /**
         * [secretToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun secretToken(value: IntrinsicFunction) {
          this.secretToken = value
        }

    }

    @CloudFormationMarker
    class WebhookFilterRule {
            /**
         * [jsonPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var jsonPath: Any? = null

        /**
         * [jsonPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jsonPath(value: String) {
          this.jsonPath = value
        }
        
        /**
         * [jsonPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jsonPath(value: IntrinsicFunction) {
          this.jsonPath = value
        }

        /**
         * [matchEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var matchEquals: Any? = null

        /**
         * [matchEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun matchEquals(value: String) {
          this.matchEquals = value
        }
        
        /**
         * [matchEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun matchEquals(value: IntrinsicFunction) {
          this.matchEquals = value
        }

    }

}

/**
 * [AWS::CodePipeline::Webhook - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html)
 */
fun Resources.awsCodePipelineWebhook(logicalId: String, init: AWSCodePipelineWebhook.() -> Unit = {}): AWSCodePipelineWebhook {
    return AWSCodePipelineWebhook(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
