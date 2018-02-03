
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::ConfigRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
 */
@CloudFormationMarker
class AWSConfigConfigRule(logicalId: String) : Resource<AWSConfigConfigRule.Properties>(logicalId, "AWS::Config::ConfigRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [configRuleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var configRuleName: Any? = null

        /**
         * [configRuleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun configRuleName(value: String) {
          this.configRuleName = value
        }
        
        /**
         * [configRuleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun configRuleName(value: IntrinsicFunction) {
          this.configRuleName = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [inputParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var inputParameters: Any? = null

        /**
         * [inputParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun inputParameters(value: Json) {
          this.inputParameters = value
        }
        
        /**
         * [inputParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun inputParameters(value: IntrinsicFunction) {
          this.inputParameters = value
        }
        
        /**
         * [maximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var maximumExecutionFrequency: Any? = null

        /**
         * [maximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maximumExecutionFrequency(value: String) {
          this.maximumExecutionFrequency = value
        }
        
        /**
         * [maximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maximumExecutionFrequency(value: IntrinsicFunction) {
          this.maximumExecutionFrequency = value
        }
        
        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
         *
         * _Required_: no
         *
         * _Type_: Scope
         */
        @JvmField
        var scope: Any? = null

        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
         *
         * _Required_: no
         *
         * _Type_: Scope
         */
        fun scope(value: Scope) {
          this.scope = value
        }
        
        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
         *
         * _Required_: no
         *
         * _Type_: Scope
         */
        fun scope(value: IntrinsicFunction) {
          this.scope = value
        }
        
        /**
         * [source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
         *
         * _Required_: yes
         *
         * _Type_: Source
         */
        @JvmField
        var source: Any? = null

        /**
         * [source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
         *
         * _Required_: yes
         *
         * _Type_: Source
         */
        fun source(value: Source) {
          this.source = value
        }
        
        /**
         * [source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
         *
         * _Required_: yes
         *
         * _Type_: Source
         */
        fun source(value: IntrinsicFunction) {
          this.source = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Scope(
            /**
             * [ComplianceResourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val complianceResourceId: String? = null,
            /**
             * [ComplianceResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val complianceResourceTypes: List<String>? = null,
            /**
             * [TagKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tagKey: String? = null,
            /**
             * [TagValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tagValue: String? = null
    )

    class Source(
            /**
             * [Owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val owner: String,
            /**
             * [SourceDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails)
             *
             * _Required_: no
             *
             * _Type_: List<SourceDetail>
             */
            val sourceDetails: List<SourceDetail>? = null,
            /**
             * [SourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sourceIdentifier: String
    )

    class SourceDetail(
            /**
             * [EventSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val eventSource: String,
            /**
             * [MaximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val maximumExecutionFrequency: String? = null,
            /**
             * [MessageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val messageType: String
    )

}

/**
 * [AWS::Config::ConfigRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
 */
fun Resources.awsConfigConfigRule(logicalId: String, init: AWSConfigConfigRule.() -> Unit = {}): AWSConfigConfigRule {
    return AWSConfigConfigRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
