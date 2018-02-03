
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Action(
            /**
             * [TargetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val targetGroupArn: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class RuleCondition(
            /**
             * [Field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-field)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val field: String? = null,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-conditions.html#cfn-elasticloadbalancingv2-listenerrule-conditions-values)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val values: List<String>? = null
    )

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
