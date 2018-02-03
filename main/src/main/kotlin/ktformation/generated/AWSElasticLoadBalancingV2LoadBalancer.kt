
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::LoadBalancer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2LoadBalancer(logicalId: String) : Resource<AWSElasticLoadBalancingV2LoadBalancer.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::LoadBalancer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var ipAddressType: Any? = null

        fun ipAddressType(value: String) {
          this.ipAddressType = value
        }
        
        fun ipAddressType(value: IntrinsicFunction) {
          this.ipAddressType = value
        }
        
        @JvmField
        var loadBalancerAttributes: Any? = null

        fun loadBalancerAttributes(value: List<LoadBalancerAttribute>) {
          this.loadBalancerAttributes = value
        }
        
        fun loadBalancerAttributes(vararg value: IntrinsicFunction) {
          this.loadBalancerAttributes = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var scheme: Any? = null

        fun scheme(value: String) {
          this.scheme = value
        }
        
        fun scheme(value: IntrinsicFunction) {
          this.scheme = value
        }
        
        @JvmField
        var securityGroups: Any? = null

        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }
        
        @JvmField
        var subnetMappings: Any? = null

        fun subnetMappings(value: List<SubnetMapping>) {
          this.subnetMappings = value
        }
        
        fun subnetMappings(vararg value: IntrinsicFunction) {
          this.subnetMappings = value
        }
        
        @JvmField
        var subnets: Any? = null

        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        @JvmField
        var type: Any? = null

        fun type(value: String) {
          this.type = value
        }
        
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
            val key: String? = null,
            val value: String? = null
    )

    class SubnetMapping(
            val allocationId: String,
            val subnetId: String
    )

}

fun Resources.awsElasticLoadBalancingV2LoadBalancer(logicalId: String, init: AWSElasticLoadBalancingV2LoadBalancer.() -> Unit = {}): AWSElasticLoadBalancingV2LoadBalancer {
    return AWSElasticLoadBalancingV2LoadBalancer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
