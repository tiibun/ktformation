
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::LoadBalancer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2LoadBalancer(logicalId: String) : Resource<AWSElasticLoadBalancingV2LoadBalancer.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::LoadBalancer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [ipAddressType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ipAddressType: Any? = null

        /**
         * [ipAddressType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipAddressType(value: String) {
          this.ipAddressType = value
        }
        
        /**
         * [ipAddressType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipAddressType(value: IntrinsicFunction) {
          this.ipAddressType = value
        }
        
        /**
         * [loadBalancerAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
         *
         * _Required_: no
         *
         * _Type_: List<LoadBalancerAttribute>
         */
        @JvmField
        var loadBalancerAttributes: Any? = null

        /**
         * [loadBalancerAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
         *
         * _Required_: no
         *
         * _Type_: List<LoadBalancerAttribute>
         */
        fun loadBalancerAttributes(value: List<LoadBalancerAttribute>) {
          this.loadBalancerAttributes = value
        }
        
        /**
         * [loadBalancerAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
         *
         * _Required_: no
         *
         * _Type_: List<LoadBalancerAttribute>
         */
        fun loadBalancerAttributes(vararg value: IntrinsicFunction) {
          this.loadBalancerAttributes = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [scheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-scheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scheme: Any? = null

        /**
         * [scheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-scheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheme(value: String) {
          this.scheme = value
        }
        
        /**
         * [scheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-scheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheme(value: IntrinsicFunction) {
          this.scheme = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }
        
        /**
         * [subnetMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmappings)
         *
         * _Required_: no
         *
         * _Type_: List<SubnetMapping>
         */
        @JvmField
        var subnetMappings: Any? = null

        /**
         * [subnetMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmappings)
         *
         * _Required_: no
         *
         * _Type_: List<SubnetMapping>
         */
        fun subnetMappings(value: List<SubnetMapping>) {
          this.subnetMappings = value
        }
        
        /**
         * [subnetMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmappings)
         *
         * _Required_: no
         *
         * _Type_: List<SubnetMapping>
         */
        fun subnetMappings(vararg value: IntrinsicFunction) {
          this.subnetMappings = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnets: Any? = null

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LoadBalancerAttribute(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattributes.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattributes.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class SubnetMapping(
            /**
             * [AllocationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-allocationid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val allocationId: String,
            /**
             * [SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-subnetid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val subnetId: String
    )

}

/**
 * [AWS::ElasticLoadBalancingV2::LoadBalancer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html)
 */
fun Resources.awsElasticLoadBalancingV2LoadBalancer(logicalId: String, init: AWSElasticLoadBalancingV2LoadBalancer.() -> Unit = {}): AWSElasticLoadBalancingV2LoadBalancer {
    return AWSElasticLoadBalancingV2LoadBalancer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
