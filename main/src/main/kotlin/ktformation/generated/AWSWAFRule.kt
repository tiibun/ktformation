
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html)
 */
@CloudFormationMarker
class AWSWAFRule(logicalId: String) : Resource<AWSWAFRule.Properties>(logicalId, "AWS::WAF::Rule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [predicates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * _Required_: no
         *
         * _Type_: List<Predicate>
         */
        @JvmField
        var predicates: Any? = null

        /**
         * [predicates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * _Required_: no
         *
         * _Type_: List<Predicate>
         */
        fun predicates(value: List<Predicate>) {
          this.predicates = value
        }
        
        /**
         * [predicates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
         *
         * _Required_: no
         *
         * _Type_: List<Predicate>
         */
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
            /**
             * [DataId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicates.html#cfn-waf-rule-predicates-dataid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dataId: String,
            /**
             * [Negated](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicates.html#cfn-waf-rule-predicates-negated)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val negated: Boolean,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-rule-predicates.html#cfn-waf-rule-predicates-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

}

/**
 * [AWS::WAF::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html)
 */
fun Resources.awsWAFRule(logicalId: String, init: AWSWAFRule.() -> Unit = {}): AWSWAFRule {
    return AWSWAFRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
