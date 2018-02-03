
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::ElasticLoadBalancerAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html)
 */
@CloudFormationMarker
class AWSOpsWorksElasticLoadBalancerAttachment(logicalId: String) : Resource<AWSOpsWorksElasticLoadBalancerAttachment.Properties>(logicalId, "AWS::OpsWorks::ElasticLoadBalancerAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [elasticLoadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var elasticLoadBalancerName: Any? = null

        /**
         * [elasticLoadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun elasticLoadBalancerName(value: String) {
          this.elasticLoadBalancerName = value
        }
        
        /**
         * [elasticLoadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-elbname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun elasticLoadBalancerName(value: IntrinsicFunction) {
          this.elasticLoadBalancerName = value
        }
        
        /**
         * [layerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var layerId: Any? = null

        /**
         * [layerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun layerId(value: String) {
          this.layerId = value
        }
        
        /**
         * [layerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html#cfn-opsworks-elbattachment-layerid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::OpsWorks::ElasticLoadBalancerAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html)
 */
fun Resources.awsOpsWorksElasticLoadBalancerAttachment(logicalId: String, init: AWSOpsWorksElasticLoadBalancerAttachment.() -> Unit = {}): AWSOpsWorksElasticLoadBalancerAttachment {
    return AWSOpsWorksElasticLoadBalancerAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
