
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
 */
@CloudFormationMarker
class AWSWAFRegionalWebACL(logicalId: String) : Resource<AWSWAFRegionalWebACL.Properties>(logicalId, "AWS::WAFRegional::WebACL") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
         *
         * _Required_: yes
         *
         * _Type_: Action
         */
        @JvmField
        var defaultAction: Any? = null

        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
         *
         * _Required_: yes
         *
         * _Type_: Action
         */
        fun defaultAction(value: Action) {
          this.defaultAction = value
        }
        
        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
         *
         * _Required_: yes
         *
         * _Type_: Action
         */
        fun defaultAction(value: IntrinsicFunction) {
          this.defaultAction = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
         *
         * _Required_: no
         *
         * _Type_: List<Rule>
         */
        @JvmField
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
         *
         * _Required_: no
         *
         * _Type_: List<Rule>
         */
        fun rules(value: List<Rule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
         *
         * _Required_: no
         *
         * _Type_: List<Rule>
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


    class Action(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html#cfn-wafregional-webacl-action-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class Rule(
            /**
             * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-action)
             *
             * _Required_: yes
             *
             * _Type_: Action
             */
            val action: Action,
            /**
             * [Priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-priority)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val priority: Int,
            /**
             * [RuleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html#cfn-wafregional-webacl-rule-ruleid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ruleId: String
    )

}

/**
 * [AWS::WAFRegional::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
 */
fun Resources.awsWAFRegionalWebACL(logicalId: String, init: AWSWAFRegionalWebACL.() -> Unit = {}): AWSWAFRegionalWebACL {
    return AWSWAFRegionalWebACL(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
