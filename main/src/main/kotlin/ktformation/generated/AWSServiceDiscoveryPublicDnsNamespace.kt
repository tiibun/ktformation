
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceDiscovery::PublicDnsNamespace - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html)
 */
@CloudFormationMarker
class AWSServiceDiscoveryPublicDnsNamespace(logicalId: String) : Resource<AWSServiceDiscoveryPublicDnsNamespace.Properties>(logicalId, "AWS::ServiceDiscovery::PublicDnsNamespace") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsServiceDiscoveryPublicDnsNamespace(logicalId: String, init: AWSServiceDiscoveryPublicDnsNamespace.() -> Unit = {}): AWSServiceDiscoveryPublicDnsNamespace {
    return AWSServiceDiscoveryPublicDnsNamespace(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
