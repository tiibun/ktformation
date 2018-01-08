
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
 */
@CloudFormationMarker
class AWSEC2SecurityGroup(logicalId: String) : Resource<AWSEC2SecurityGroup.Properties>(logicalId, "AWS::EC2::SecurityGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var groupDescription: Any? = null

        fun groupDescription(value: String) {
          this.groupDescription = value
        }
        fun groupDescription(value: IntrinsicFunction) {
  this.groupDescription = value
}
        @JvmField
        var groupName: Any? = null

        fun groupName(value: String) {
          this.groupName = value
        }
        fun groupName(value: IntrinsicFunction) {
  this.groupName = value
}
        @JvmField
        var securityGroupEgress: Any? = null

        fun securityGroupEgress(value: List<Egress>) {
          this.securityGroupEgress = value
        }
        fun securityGroupEgress(vararg value: IntrinsicFunction) {
  this.securityGroupEgress = value
}
        @JvmField
        var securityGroupIngress: Any? = null

        fun securityGroupIngress(value: List<Ingress>) {
          this.securityGroupIngress = value
        }
        fun securityGroupIngress(vararg value: IntrinsicFunction) {
  this.securityGroupIngress = value
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


    class Egress(
            val cidrIp: String? = null,
            val cidrIpv6: String? = null,
            val description: String? = null,
            val destinationPrefixListId: String? = null,
            val destinationSecurityGroupId: String? = null,
            val fromPort: Int? = null,
            val ipProtocol: String,
            val toPort: Int? = null
    )

    class Ingress(
            val cidrIp: String? = null,
            val cidrIpv6: String? = null,
            val description: String? = null,
            val fromPort: Int? = null,
            val ipProtocol: String,
            val sourceSecurityGroupId: String? = null,
            val sourceSecurityGroupName: String? = null,
            val sourceSecurityGroupOwnerId: String? = null,
            val toPort: Int? = null
    )

}

fun Resources.awsEC2SecurityGroup(logicalId: String, init: AWSEC2SecurityGroup.() -> Unit = {}): AWSEC2SecurityGroup {
    return AWSEC2SecurityGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
