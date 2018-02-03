
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceDiscovery::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
 */
@CloudFormationMarker
class AWSServiceDiscoveryInstance(logicalId: String) : Resource<AWSServiceDiscoveryInstance.Properties>(logicalId, "AWS::ServiceDiscovery::Instance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var instanceAttributes: Any? = null

        fun instanceAttributes(value: Json) {
          this.instanceAttributes = value
        }
        
        fun instanceAttributes(value: IntrinsicFunction) {
          this.instanceAttributes = value
        }
        
        @JvmField
        var instanceId: Any? = null

        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }
        
        @JvmField
        var serviceId: Any? = null

        fun serviceId(value: String) {
          this.serviceId = value
        }
        
        fun serviceId(value: IntrinsicFunction) {
          this.serviceId = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsServiceDiscoveryInstance(logicalId: String, init: AWSServiceDiscoveryInstance.() -> Unit = {}): AWSServiceDiscoveryInstance {
    return AWSServiceDiscoveryInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
