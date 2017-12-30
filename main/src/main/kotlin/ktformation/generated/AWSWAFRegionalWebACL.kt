
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
 */
@CloudFormationMarker
class AWSWAFRegionalWebACL(logicalId: String) : Resource<AWSWAFRegionalWebACL.Properties>(logicalId, "AWS::WAFRegional::WebACL") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var defaultAction: Any? = null
        fun defaultAction(value: Action) { this.defaultAction = value }
        fun defaultAction(value: IntrinsicFunction) { this.defaultAction = value }
        @JvmField var metricName: Any? = null
        fun metricName(value: String) { this.metricName = value }
        fun metricName(value: IntrinsicFunction) { this.metricName = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var rules: Any? = null
        fun rules(value: List<Rule>) {
            this.rules = value
        }
        fun rules(vararg value: IntrinsicFunction) { this.rules = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Action(
            val type: String
    )

    class Rule(
            val action: Action,
            val priority: Int,
            val ruleId: String
    )

}

fun Resources.awsWAFRegionalWebACL(logicalId: String, init: AWSWAFRegionalWebACL.() -> Unit = {}): AWSWAFRegionalWebACL {
    return AWSWAFRegionalWebACL(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
