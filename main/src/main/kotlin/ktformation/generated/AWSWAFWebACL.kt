
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

        /**
        * [ActivatedRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html)
        */
        fun activatedRule(init: ActivatedRule.() -> Unit = {}): ActivatedRule {
            return ActivatedRule().also {
                it.init()
            }
        }
        /**
        * [WafAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html)
        */
        fun wafAction(init: WafAction.() -> Unit = {}): WafAction {
            return WafAction().also {
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
    class ActivatedRule {
            /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-action)
         *
         * _Required_: yes
         *
         * _Type_: WafAction
         */
        var action: Any? = null

        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-action)
         *
         * _Required_: yes
         *
         * _Type_: WafAction
         */
        fun action(value: WafAction) {
          this.action = value
        }
        
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-action)
         *
         * _Required_: yes
         *
         * _Type_: WafAction
         */
        fun action(value: IntrinsicFunction) {
          this.action = value
        }

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var priority: Any? = null

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: Int) {
          this.priority = value
        }
        
        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: IntrinsicFunction) {
          this.priority = value
        }

        /**
         * [ruleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ruleId: Any? = null

        /**
         * [ruleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ruleId(value: String) {
          this.ruleId = value
        }
        
        /**
         * [ruleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ruleId(value: IntrinsicFunction) {
          this.ruleId = value
        }

    }

    @CloudFormationMarker
    class WafAction {
            /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html#cfn-waf-webacl-action-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html#cfn-waf-webacl-action-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html#cfn-waf-webacl-action-type)
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
 * [AWS::WAF::WebACL - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
 */
fun Resources.awsWAFWebACL(logicalId: String, init: AWSWAFWebACL.() -> Unit = {}): AWSWAFWebACL {
    return AWSWAFWebACL(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
