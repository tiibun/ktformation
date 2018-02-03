
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SecurityGroupEgress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html)
 */
@CloudFormationMarker
class AWSEC2SecurityGroupEgress(logicalId: String) : Resource<AWSEC2SecurityGroupEgress.Properties>(logicalId, "AWS::EC2::SecurityGroupEgress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cidrIp: Any? = null

        fun cidrIp(value: String) {
          this.cidrIp = value
        }
        
        fun cidrIp(value: IntrinsicFunction) {
          this.cidrIp = value
        }
        
        @JvmField
        var cidrIpv6: Any? = null

        fun cidrIpv6(value: String) {
          this.cidrIpv6 = value
        }
        
        fun cidrIpv6(value: IntrinsicFunction) {
          this.cidrIpv6 = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var destinationPrefixListId: Any? = null

        fun destinationPrefixListId(value: String) {
          this.destinationPrefixListId = value
        }
        
        fun destinationPrefixListId(value: IntrinsicFunction) {
          this.destinationPrefixListId = value
        }
        
        @JvmField
        var destinationSecurityGroupId: Any? = null

        fun destinationSecurityGroupId(value: String) {
          this.destinationSecurityGroupId = value
        }
        
        fun destinationSecurityGroupId(value: IntrinsicFunction) {
          this.destinationSecurityGroupId = value
        }
        
        @JvmField
        var fromPort: Any? = null

        fun fromPort(value: Int) {
          this.fromPort = value
        }
        
        fun fromPort(value: IntrinsicFunction) {
          this.fromPort = value
        }
        
        @JvmField
        var groupId: Any? = null

        fun groupId(value: String) {
          this.groupId = value
        }
        
        fun groupId(value: IntrinsicFunction) {
          this.groupId = value
        }
        
        @JvmField
        var ipProtocol: Any? = null

        fun ipProtocol(value: String) {
          this.ipProtocol = value
        }
        
        fun ipProtocol(value: IntrinsicFunction) {
          this.ipProtocol = value
        }
        
        @JvmField
        var toPort: Any? = null

        fun toPort(value: Int) {
          this.toPort = value
        }
        
        fun toPort(value: IntrinsicFunction) {
          this.toPort = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2SecurityGroupEgress(logicalId: String, init: AWSEC2SecurityGroupEgress.() -> Unit = {}): AWSEC2SecurityGroupEgress {
    return AWSEC2SecurityGroupEgress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
