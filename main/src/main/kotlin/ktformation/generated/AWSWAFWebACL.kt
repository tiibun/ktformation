
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
 */
@CloudFormationMarker
class AWSWAFWebACL(logicalId: String) : Resource<AWSWAFWebACL.Properties>(logicalId, "AWS::WAF::WebACL") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
         *
         * _Required_: yes
         *
         * _Type_: WafAction
         */
        @JvmField
        var defaultAction: Any? = null

        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
         *
         * _Required_: yes
         *
         * _Type_: WafAction
         */
        fun defaultAction(value: WafAction) {
          this.defaultAction = value
        }
        
        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-defaultaction)
         *
         * _Required_: yes
         *
         * _Type_: WafAction
         */
        fun defaultAction(value: IntrinsicFunction) {
          this.defaultAction = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
         *
         * _Required_: no
         *
         * _Type_: List<ActivatedRule>
         */
        @JvmField
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
         *
         * _Required_: no
         *
         * _Type_: List<ActivatedRule>
         */
        fun rules(value: List<ActivatedRule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html#cfn-waf-webacl-rules)
         *
         * _Required_: no
         *
         * _Type_: List<ActivatedRule>
         */
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
            /**
             * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-action)
             *
             * _Required_: yes
             *
             * _Type_: WafAction
             */
            val action: WafAction,
            /**
             * [Priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val priority: Int,
            /**
             * [RuleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ruleId: String
    )

    class WafAction(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html#cfn-waf-webacl-action-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

}

/**
 * [AWS::WAF::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
 */
fun Resources.awsWAFWebACL(logicalId: String, init: AWSWAFWebACL.() -> Unit = {}): AWSWAFWebACL {
    return AWSWAFWebACL(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
