
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::ElasticLoadBalancerAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html)
 */
@CloudFormationMarker
class AWSOpsWorksElasticLoadBalancerAttachment(logicalId: String) : Resource<AWSOpsWorksElasticLoadBalancerAttachment.Properties>(logicalId, "AWS::OpsWorks::ElasticLoadBalancerAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var elasticLoadBalancerName: Any? = null

        fun elasticLoadBalancerName(value: String) {
          this.elasticLoadBalancerName = value
        }
        
        fun elasticLoadBalancerName(value: IntrinsicFunction) {
          this.elasticLoadBalancerName = value
        }
        
        @JvmField
        var layerId: Any? = null

        fun layerId(value: String) {
          this.layerId = value
        }
        
        fun layerId(value: IntrinsicFunction) {
          this.layerId = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsOpsWorksElasticLoadBalancerAttachment(logicalId: String, init: AWSOpsWorksElasticLoadBalancerAttachment.() -> Unit = {}): AWSOpsWorksElasticLoadBalancerAttachment {
    return AWSOpsWorksElasticLoadBalancerAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
