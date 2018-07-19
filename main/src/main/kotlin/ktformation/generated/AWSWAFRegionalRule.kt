
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html)
 */
@CloudFormationMarker
class AWSWAFRegionalRule(logicalId: String) : Resource<AWSWAFRegionalRule.Properties>(logicalId, "AWS::WAFRegional::Rule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [predicates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
         *
         * _Required_: no
         *
         * _Type_: List<Predicate>
         */
        @JvmField
        var predicates: Any? = null

        /**
         * [predicates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
         *
         * _Required_: no
         *
         * _Type_: List<Predicate>
         */
        fun predicates(value: List<Predicate>) {
          this.predicates = value
        }
        
        /**
         * [predicates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html#cfn-wafregional-rule-predicates)
         *
         * _Required_: no
         *
         * _Type_: List<Predicate>
         */
        fun predicates(vararg value: IntrinsicFunction) {
          this.predicates = value
        }

        /**
        * [Predicate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html)
        */
        fun predicate(init: Predicate.() -> Unit = {}): Predicate {
            return Predicate().also {
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
    class Predicate {
            /**
         * [dataId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dataId: Any? = null

        /**
         * [dataId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dataId(value: String) {
          this.dataId = value
        }
        
        /**
         * [dataId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-dataid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dataId(value: IntrinsicFunction) {
          this.dataId = value
        }

        /**
         * [negated](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var negated: Any? = null

        /**
         * [negated](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun negated(value: Boolean) {
          this.negated = value
        }
        
        /**
         * [negated](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-negated)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun negated(value: IntrinsicFunction) {
          this.negated = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-rule-predicate.html#cfn-wafregional-rule-predicate-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

}

/**
 * [AWS::WAFRegional::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html)
 */
fun Resources.awsWAFRegionalRule(logicalId: String, init: AWSWAFRegionalRule.() -> Unit = {}): AWSWAFRegionalRule {
    return AWSWAFRegionalRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
