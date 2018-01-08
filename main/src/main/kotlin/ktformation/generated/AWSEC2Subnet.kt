
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Subnet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
@CloudFormationMarker
class AWSEC2Subnet(logicalId: String) : Resource<AWSEC2Subnet.Properties>(logicalId, "AWS::EC2::Subnet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var assignIpv6AddressOnCreation: Any? = null

        fun assignIpv6AddressOnCreation(value: Boolean) {
          this.assignIpv6AddressOnCreation = value
        }
        fun assignIpv6AddressOnCreation(value: IntrinsicFunction) {
  this.assignIpv6AddressOnCreation = value
}
        @JvmField
        var availabilityZone: Any? = null

        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        fun availabilityZone(value: IntrinsicFunction) {
  this.availabilityZone = value
}
        @JvmField
        var cidrBlock: Any? = null

        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        fun cidrBlock(value: IntrinsicFunction) {
  this.cidrBlock = value
}
        @JvmField
        var ipv6CidrBlock: Any? = null

        fun ipv6CidrBlock(value: String) {
          this.ipv6CidrBlock = value
        }
        fun ipv6CidrBlock(value: IntrinsicFunction) {
  this.ipv6CidrBlock = value
}
        @JvmField
        var mapPublicIpOnLaunch: Any? = null

        fun mapPublicIpOnLaunch(value: Boolean) {
          this.mapPublicIpOnLaunch = value
        }
        fun mapPublicIpOnLaunch(value: IntrinsicFunction) {
  this.mapPublicIpOnLaunch = value
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
        var vpcId: Any? = null

        fun vpcId(value: String) {
          this.vpcId = value
        }
        fun vpcId(value: IntrinsicFunction) {
  this.vpcId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2Subnet(logicalId: String, init: AWSEC2Subnet.() -> Unit = {}): AWSEC2Subnet {
    return AWSEC2Subnet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
