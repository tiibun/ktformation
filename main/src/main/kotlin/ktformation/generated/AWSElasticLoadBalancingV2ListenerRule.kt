
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::ListenerRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2ListenerRule(logicalId: String) : Resource<AWSElasticLoadBalancingV2ListenerRule.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::ListenerRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var actions: Any? = null
        fun actions(value: List<Action>) { this.actions = value }
        fun actions(vararg value: IntrinsicFunction) { this.actions = value }
        @JvmField var conditions: Any? = null
        fun conditions(value: List<RuleCondition>) { this.conditions = value }
        fun conditions(vararg value: IntrinsicFunction) { this.conditions = value }
        @JvmField var listenerArn: Any? = null
        fun listenerArn(value: String) { this.listenerArn = value }
        fun listenerArn(value: IntrinsicFunction) { this.listenerArn = value }
        @JvmField var priority: Any? = null
        fun priority(value: Int) { this.priority = value }
        fun priority(value: IntrinsicFunction) { this.priority = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Action(
            val targetGroupArn: String,
            val type: String
    )

    class RuleCondition(
            val field: String? = null,
            val values: List<String>? = null
    )

}

fun Resources.awsElasticLoadBalancingV2ListenerRule(logicalId: String, init: AWSElasticLoadBalancingV2ListenerRule.() -> Unit = {}): AWSElasticLoadBalancingV2ListenerRule {
    return AWSElasticLoadBalancingV2ListenerRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
