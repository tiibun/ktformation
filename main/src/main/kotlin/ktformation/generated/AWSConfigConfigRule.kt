
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

        /**
        * [Scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html)
        */
        fun scope(init: Scope.() -> Unit = {}): Scope {
            return Scope().also {
                it.init()
            }
        }
        /**
        * [Source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html)
        */
        fun source(init: Source.() -> Unit = {}): Source {
            return Source().also {
                it.init()
            }
        }
        /**
        * [SourceDetail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html)
        */
        fun sourceDetail(init: SourceDetail.() -> Unit = {}): SourceDetail {
            return SourceDetail().also {
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
    class Scope {
            /**
         * [complianceResourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var complianceResourceId: Any? = null

        /**
         * [complianceResourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun complianceResourceId(value: String) {
          this.complianceResourceId = value
        }
        
        /**
         * [complianceResourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun complianceResourceId(value: IntrinsicFunction) {
          this.complianceResourceId = value
        }

        /**
         * [complianceResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var complianceResourceTypes: Any? = null

        /**
         * [complianceResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun complianceResourceTypes(value: List<String>) {
          this.complianceResourceTypes = value
        }
        
        /**
         * [complianceResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-complianceresourcetypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun complianceResourceTypes(vararg value: IntrinsicFunction) {
          this.complianceResourceTypes = value
        }

        /**
         * [tagKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tagKey: Any? = null

        /**
         * [tagKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tagKey(value: String) {
          this.tagKey = value
        }
        
        /**
         * [tagKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tagKey(value: IntrinsicFunction) {
          this.tagKey = value
        }

        /**
         * [tagValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tagValue: Any? = null

        /**
         * [tagValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tagValue(value: String) {
          this.tagValue = value
        }
        
        /**
         * [tagValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html#cfn-config-configrule-scope-tagvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tagValue(value: IntrinsicFunction) {
          this.tagValue = value
        }

    }

    @CloudFormationMarker
    class Source {
            /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var owner: Any? = null

        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun owner(value: String) {
          this.owner = value
        }
        
        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun owner(value: IntrinsicFunction) {
          this.owner = value
        }

        /**
         * [sourceDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails)
         *
         * _Required_: no
         *
         * _Type_: List<SourceDetail>
         */
        var sourceDetails: Any? = null

        /**
         * [sourceDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails)
         *
         * _Required_: no
         *
         * _Type_: List<SourceDetail>
         */
        fun sourceDetails(value: List<SourceDetail>) {
          this.sourceDetails = value
        }
        
        /**
         * [sourceDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourcedetails)
         *
         * _Required_: no
         *
         * _Type_: List<SourceDetail>
         */
        fun sourceDetails(vararg value: IntrinsicFunction) {
          this.sourceDetails = value
        }

        /**
         * [sourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sourceIdentifier: Any? = null

        /**
         * [sourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sourceIdentifier(value: String) {
          this.sourceIdentifier = value
        }
        
        /**
         * [sourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html#cfn-config-configrule-source-sourceidentifier)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sourceIdentifier(value: IntrinsicFunction) {
          this.sourceIdentifier = value
        }

    }

    @CloudFormationMarker
    class SourceDetail {
            /**
         * [eventSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var eventSource: Any? = null

        /**
         * [eventSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eventSource(value: String) {
          this.eventSource = value
        }
        
        /**
         * [eventSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eventSource(value: IntrinsicFunction) {
          this.eventSource = value
        }

        /**
         * [maximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var maximumExecutionFrequency: Any? = null

        /**
         * [maximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maximumExecutionFrequency(value: String) {
          this.maximumExecutionFrequency = value
        }
        
        /**
         * [maximumExecutionFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maximumExecutionFrequency(value: IntrinsicFunction) {
          this.maximumExecutionFrequency = value
        }

        /**
         * [messageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var messageType: Any? = null

        /**
         * [messageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun messageType(value: String) {
          this.messageType = value
        }
        
        /**
         * [messageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun messageType(value: IntrinsicFunction) {
          this.messageType = value
        }

    }

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
