
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::ListenerRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2ListenerRule(logicalId: String) : Resource<AWSElasticLoadBalancingV2ListenerRule.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::ListenerRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        @JvmField
        var actions: Any? = null

        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun actions(value: List<Action>) {
          this.actions = value
        }
        
        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun actions(vararg value: IntrinsicFunction) {
          this.actions = value
        }

        /**
         * [conditions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
         *
         * _Required_: yes
         *
         * _Type_: List<RuleCondition>
         */
        @JvmField
        var conditions: Any? = null

        /**
         * [conditions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
         *
         * _Required_: yes
         *
         * _Type_: List<RuleCondition>
         */
        fun conditions(value: List<RuleCondition>) {
          this.conditions = value
        }
        
        /**
         * [conditions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
         *
         * _Required_: yes
         *
         * _Type_: List<RuleCondition>
         */
        fun conditions(vararg value: IntrinsicFunction) {
          this.conditions = value
        }

        /**
         * [listenerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var listenerArn: Any? = null

        /**
         * [listenerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun listenerArn(value: String) {
          this.listenerArn = value
        }
        
        /**
         * [listenerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun listenerArn(value: IntrinsicFunction) {
          this.listenerArn = value
        }

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var priority: Any? = null

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: Int) {
          this.priority = value
        }
        
        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: IntrinsicFunction) {
          this.priority = value
        }

        /**
        * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html)
        */
        fun action(init: Action.() -> Unit = {}): Action {
            return Action().also {
                it.init()
            }
        }
        /**
        * [RuleCondition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html)
        */
        fun ruleCondition(init: RuleCondition.() -> Unit = {}): RuleCondition {
            return RuleCondition().also {
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
    class Action {
            /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var targetGroupArn: Any? = null

        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetGroupArn(value: String) {
          this.targetGroupArn = value
        }
        
        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetGroupArn(value: IntrinsicFunction) {
          this.targetGroupArn = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class RuleCondition {
            /**
         * [field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var field: Any? = null

        /**
         * [field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun field(value: String) {
          this.field = value
        }
        
        /**
         * [field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun field(value: IntrinsicFunction) {
          this.field = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

}

/**
 * [AWS::ElasticLoadBalancingV2::ListenerRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
 */
fun Resources.awsElasticLoadBalancingV2ListenerRule(logicalId: String, init: AWSElasticLoadBalancingV2ListenerRule.() -> Unit = {}): AWSElasticLoadBalancingV2ListenerRule {
    return AWSElasticLoadBalancingV2ListenerRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
