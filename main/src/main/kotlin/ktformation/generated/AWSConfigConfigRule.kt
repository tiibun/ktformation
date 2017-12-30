
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::ConfigRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
 */
@CloudFormationMarker
class AWSConfigConfigRule(logicalId: String) : Resource<AWSConfigConfigRule.Properties>(logicalId, "AWS::Config::ConfigRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var configRuleName: Any? = null
        fun configRuleName(value: String) {
            this.configRuleName = value
        }
        fun configRuleName(value: IntrinsicFunction) { this.configRuleName = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var inputParameters: Any? = null
        fun inputParameters(value: Json) {
            this.inputParameters = value
        }
        fun inputParameters(value: IntrinsicFunction) { this.inputParameters = value }
        @JvmField var maximumExecutionFrequency: Any? = null
        fun maximumExecutionFrequency(value: String) {
            this.maximumExecutionFrequency = value
        }
        fun maximumExecutionFrequency(value: IntrinsicFunction) { this.maximumExecutionFrequency = value }
        @JvmField var scope: Any? = null
        fun scope(value: Scope) {
            this.scope = value
        }
        fun scope(value: IntrinsicFunction) { this.scope = value }
        @JvmField var source: Any? = null
        fun source(value: Source) { this.source = value }
        fun source(value: IntrinsicFunction) { this.source = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Scope(
            val complianceResourceId: String? = null,
            val complianceResourceTypes: List<String>? = null,
            val tagKey: String? = null,
            val tagValue: String? = null
    )

    class Source(
            val owner: String,
            val sourceDetails: List<SourceDetail>? = null,
            val sourceIdentifier: String
    )

    class SourceDetail(
            val eventSource: String,
            val maximumExecutionFrequency: String? = null,
            val messageType: String
    )

}

fun Resources.awsConfigConfigRule(logicalId: String, init: AWSConfigConfigRule.() -> Unit = {}): AWSConfigConfigRule {
    return AWSConfigConfigRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
