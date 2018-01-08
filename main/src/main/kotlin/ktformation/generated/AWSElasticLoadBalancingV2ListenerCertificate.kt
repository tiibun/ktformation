
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::ListenerCertificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2ListenerCertificate(logicalId: String) : Resource<AWSElasticLoadBalancingV2ListenerCertificate.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::ListenerCertificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var certificates: Any? = null

        fun certificates(value: List<Certificate>) {
          this.certificates = value
        }
        fun certificates(vararg value: IntrinsicFunction) {
  this.certificates = value
}
        @JvmField
        var listenerArn: Any? = null

        fun listenerArn(value: String) {
          this.listenerArn = value
        }
        fun listenerArn(value: IntrinsicFunction) {
  this.listenerArn = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Certificate(
            val certificateArn: String? = null
    )

}

fun Resources.awsElasticLoadBalancingV2ListenerCertificate(logicalId: String, init: AWSElasticLoadBalancingV2ListenerCertificate.() -> Unit = {}): AWSElasticLoadBalancingV2ListenerCertificate {
    return AWSElasticLoadBalancingV2ListenerCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
