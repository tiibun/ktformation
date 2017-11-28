
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkInterface - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html)
 */
@CloudFormationMarker
class AWSEC2NetworkInterface(logicalId: String) : Resource<AWSEC2NetworkInterface.Properties>(logicalId, "AWS::EC2::NetworkInterface") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var groupSet: Any? = null
        fun groupSet(value: List<String>?) { this.groupSet = value }
        fun groupSet(vararg value: IntrinsicFunction) { this.groupSet = value }
        @JvmField var interfaceType: Any? = null
        fun interfaceType(value: String?) { this.interfaceType = value }
        fun interfaceType(value: IntrinsicFunction) { this.interfaceType = value }
        @JvmField var ipv6AddressCount: Any? = null
        fun ipv6AddressCount(value: Int?) { this.ipv6AddressCount = value }
        fun ipv6AddressCount(value: IntrinsicFunction) { this.ipv6AddressCount = value }
        @JvmField var ipv6Addresses: Any? = null
        fun ipv6Addresses(value: InstanceIpv6Address?) { this.ipv6Addresses = value }
        fun ipv6Addresses(value: IntrinsicFunction) { this.ipv6Addresses = value }
        @JvmField var privateIpAddress: Any? = null
        fun privateIpAddress(value: String?) { this.privateIpAddress = value }
        fun privateIpAddress(value: IntrinsicFunction) { this.privateIpAddress = value }
        @JvmField var privateIpAddresses: Any? = null
        fun privateIpAddresses(value: List<PrivateIpAddressSpecification>?) { this.privateIpAddresses = value }
        fun privateIpAddresses(vararg value: IntrinsicFunction) { this.privateIpAddresses = value }
        @JvmField var secondaryPrivateIpAddressCount: Any? = null
        fun secondaryPrivateIpAddressCount(value: Int?) { this.secondaryPrivateIpAddressCount = value }
        fun secondaryPrivateIpAddressCount(value: IntrinsicFunction) { this.secondaryPrivateIpAddressCount = value }
        @JvmField var sourceDestCheck: Any? = null
        fun sourceDestCheck(value: Boolean?) { this.sourceDestCheck = value }
        fun sourceDestCheck(value: IntrinsicFunction) { this.sourceDestCheck = value }
        @JvmField var subnetId: Any? = null
        fun subnetId(value: String) { this.subnetId = value }
        fun subnetId(value: IntrinsicFunction) { this.subnetId = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class InstanceIpv6Address(
            val ipv6Address: String
    )

    class PrivateIpAddressSpecification(
            val primary: Boolean,
            val privateIpAddress: String
    )

}

fun Resources.awsEC2NetworkInterface(logicalId: String, init: AWSEC2NetworkInterface.() -> Unit = {}): AWSEC2NetworkInterface {
    return AWSEC2NetworkInterface(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
