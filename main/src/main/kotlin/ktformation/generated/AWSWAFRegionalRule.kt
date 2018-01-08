
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html)
 */
@CloudFormationMarker
class AWSWAFRegionalRule(logicalId: String) : Resource<AWSWAFRegionalRule.Properties>(logicalId, "AWS::WAFRegional::Rule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var metricName: Any? = null

        fun metricName(value: String) {
          this.metricName = value
        }
        fun metricName(value: IntrinsicFunction) {
  this.metricName = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var predicates: Any? = null

        fun predicates(value: List<Predicate>) {
          this.predicates = value
        }
        fun predicates(vararg value: IntrinsicFunction) {
  this.predicates = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Predicate(
            val dataId: String,
            val negated: Boolean,
            val type: String
    )

}

fun Resources.awsWAFRegionalRule(logicalId: String, init: AWSWAFRegionalRule.() -> Unit = {}): AWSWAFRegionalRule {
    return AWSWAFRegionalRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
