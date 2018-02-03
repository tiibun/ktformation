
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
 */
@CloudFormationMarker
class AWSWAFWebACL(logicalId: String) : Resource<AWSWAFWebACL.Properties>(logicalId, "AWS::WAF::WebACL") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var defaultAction: Any? = null

        fun defaultAction(value: WafAction) {
          this.defaultAction = value
        }
        
        fun defaultAction(value: IntrinsicFunction) {
          this.defaultAction = value
        }
        
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
        var rules: Any? = null

        fun rules(value: List<ActivatedRule>) {
          this.rules = value
        }
        
        fun rules(vararg value: IntrinsicFunction) {
          this.rules = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ActivatedRule(
            val action: WafAction,
            val priority: Int,
            val ruleId: String
    )

    class WafAction(
            val type: String
    )

}

fun Resources.awsWAFWebACL(logicalId: String, init: AWSWAFWebACL.() -> Unit = {}): AWSWAFWebACL {
    return AWSWAFWebACL(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
