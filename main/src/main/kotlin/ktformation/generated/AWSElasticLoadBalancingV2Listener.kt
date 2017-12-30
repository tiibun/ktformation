
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::Listener - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2Listener(logicalId: String) : Resource<AWSElasticLoadBalancingV2Listener.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::Listener") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var certificates: Any? = null
        fun certificates(value: List<Certificate>) {
            this.certificates = value
        }
        fun certificates(vararg value: IntrinsicFunction) { this.certificates = value }
        @JvmField var defaultActions: Any? = null
        fun defaultActions(value: List<Action>) { this.defaultActions = value }
        fun defaultActions(vararg value: IntrinsicFunction) { this.defaultActions = value }
        @JvmField var loadBalancerArn: Any? = null
        fun loadBalancerArn(value: String) { this.loadBalancerArn = value }
        fun loadBalancerArn(value: IntrinsicFunction) { this.loadBalancerArn = value }
        @JvmField var port: Any? = null
        fun port(value: Int) { this.port = value }
        fun port(value: IntrinsicFunction) { this.port = value }
        @JvmField var protocol: Any? = null
        fun protocol(value: String) { this.protocol = value }
        fun protocol(value: IntrinsicFunction) { this.protocol = value }
        @JvmField var sslPolicy: Any? = null
        fun sslPolicy(value: String) {
            this.sslPolicy = value
        }
        fun sslPolicy(value: IntrinsicFunction) { this.sslPolicy = value }
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

    class Certificate(
            val certificateArn: String? = null
    )

}

fun Resources.awsElasticLoadBalancingV2Listener(logicalId: String, init: AWSElasticLoadBalancingV2Listener.() -> Unit = {}): AWSElasticLoadBalancingV2Listener {
    return AWSElasticLoadBalancingV2Listener(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
