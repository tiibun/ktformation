
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::Listener - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2Listener(logicalId: String) : Resource<AWSElasticLoadBalancingV2Listener.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::Listener") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [certificates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * _Required_: no
         *
         * _Type_: List<Certificate>
         */
        @JvmField
        var certificates: Any? = null

        /**
         * [certificates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * _Required_: no
         *
         * _Type_: List<Certificate>
         */
        fun certificates(value: List<Certificate>) {
          this.certificates = value
        }
        
        /**
         * [certificates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * _Required_: no
         *
         * _Type_: List<Certificate>
         */
        fun certificates(vararg value: IntrinsicFunction) {
          this.certificates = value
        }

        /**
         * [defaultActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        @JvmField
        var defaultActions: Any? = null

        /**
         * [defaultActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun defaultActions(value: List<Action>) {
          this.defaultActions = value
        }
        
        /**
         * [defaultActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun defaultActions(vararg value: IntrinsicFunction) {
          this.defaultActions = value
        }

        /**
         * [loadBalancerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var loadBalancerArn: Any? = null

        /**
         * [loadBalancerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun loadBalancerArn(value: String) {
          this.loadBalancerArn = value
        }
        
        /**
         * [loadBalancerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun loadBalancerArn(value: IntrinsicFunction) {
          this.loadBalancerArn = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

        /**
         * [sslPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sslPolicy: Any? = null

        /**
         * [sslPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sslPolicy(value: String) {
          this.sslPolicy = value
        }
        
        /**
         * [sslPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sslPolicy(value: IntrinsicFunction) {
          this.sslPolicy = value
        }

        /**
        * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html)
        */
        fun action(init: Action.() -> Unit = {}): Action {
            return Action().also {
                it.init()
            }
        }
        /**
        * [Certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html)
        */
        fun certificate(init: Certificate.() -> Unit = {}): Certificate {
            return Certificate().also {
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
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var targetGroupArn: Any? = null

        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetGroupArn(value: String) {
          this.targetGroupArn = value
        }
        
        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetGroupArn(value: IntrinsicFunction) {
          this.targetGroupArn = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type)
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
    class Certificate {
            /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var certificateArn: Any? = null

        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateArn(value: String) {
          this.certificateArn = value
        }
        
        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateArn(value: IntrinsicFunction) {
          this.certificateArn = value
        }

    }

}

/**
 * [AWS::ElasticLoadBalancingV2::Listener - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
 */
fun Resources.awsElasticLoadBalancingV2Listener(logicalId: String, init: AWSElasticLoadBalancingV2Listener.() -> Unit = {}): AWSElasticLoadBalancingV2Listener {
    return AWSElasticLoadBalancingV2Listener(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
