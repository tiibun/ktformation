
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::ListenerCertificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2ListenerCertificate(logicalId: String) : Resource<AWSElasticLoadBalancingV2ListenerCertificate.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::ListenerCertificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [certificates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
         *
         * _Required_: yes
         *
         * _Type_: List<Certificate>
         */
        @JvmField
        var certificates: Any? = null

        /**
         * [certificates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
         *
         * _Required_: yes
         *
         * _Type_: List<Certificate>
         */
        fun certificates(value: List<Certificate>) {
          this.certificates = value
        }
        
        /**
         * [certificates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
         *
         * _Required_: yes
         *
         * _Type_: List<Certificate>
         */
        fun certificates(vararg value: IntrinsicFunction) {
          this.certificates = value
        }
        
        /**
         * [listenerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var listenerArn: Any? = null

        /**
         * [listenerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun listenerArn(value: String) {
          this.listenerArn = value
        }
        
        /**
         * [listenerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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
            /**
             * [CertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val certificateArn: String? = null
    )

}

/**
 * [AWS::ElasticLoadBalancingV2::ListenerCertificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
 */
fun Resources.awsElasticLoadBalancingV2ListenerCertificate(logicalId: String, init: AWSElasticLoadBalancingV2ListenerCertificate.() -> Unit = {}): AWSElasticLoadBalancingV2ListenerCertificate {
    return AWSElasticLoadBalancingV2ListenerCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
