
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceDiscovery::PrivateDnsNamespace - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html)
 */
@CloudFormationMarker
class AWSServiceDiscoveryPrivateDnsNamespace(logicalId: String) : Resource<AWSServiceDiscoveryPrivateDnsNamespace.Properties>(logicalId, "AWS::ServiceDiscovery::PrivateDnsNamespace") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var vpc: Any? = null
        fun vpc(value: String) { this.vpc = value }
        fun vpc(value: IntrinsicFunction) { this.vpc = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsServiceDiscoveryPrivateDnsNamespace(logicalId: String, init: AWSServiceDiscoveryPrivateDnsNamespace.() -> Unit = {}): AWSServiceDiscoveryPrivateDnsNamespace {
    return AWSServiceDiscoveryPrivateDnsNamespace(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
