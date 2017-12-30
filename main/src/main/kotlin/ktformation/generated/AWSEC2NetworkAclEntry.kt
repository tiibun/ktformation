
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkAclEntry - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html)
 */
@CloudFormationMarker
class AWSEC2NetworkAclEntry(logicalId: String) : Resource<AWSEC2NetworkAclEntry.Properties>(logicalId, "AWS::EC2::NetworkAclEntry") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cidrBlock: Any? = null
        fun cidrBlock(value: String) { this.cidrBlock = value }
        fun cidrBlock(value: IntrinsicFunction) { this.cidrBlock = value }
        @JvmField var egress: Any? = null
        fun egress(value: Boolean) {
            this.egress = value
        }
        fun egress(value: IntrinsicFunction) { this.egress = value }
        @JvmField var icmp: Any? = null
        fun icmp(value: Icmp) {
            this.icmp = value
        }
        fun icmp(value: IntrinsicFunction) { this.icmp = value }
        @JvmField var ipv6CidrBlock: Any? = null
        fun ipv6CidrBlock(value: String) {
            this.ipv6CidrBlock = value
        }
        fun ipv6CidrBlock(value: IntrinsicFunction) { this.ipv6CidrBlock = value }
        @JvmField var networkAclId: Any? = null
        fun networkAclId(value: String) { this.networkAclId = value }
        fun networkAclId(value: IntrinsicFunction) { this.networkAclId = value }
        @JvmField var portRange: Any? = null
        fun portRange(value: PortRange) {
            this.portRange = value
        }
        fun portRange(value: IntrinsicFunction) { this.portRange = value }
        @JvmField var protocol: Any? = null
        fun protocol(value: Int) { this.protocol = value }
        fun protocol(value: IntrinsicFunction) { this.protocol = value }
        @JvmField var ruleAction: Any? = null
        fun ruleAction(value: String) { this.ruleAction = value }
        fun ruleAction(value: IntrinsicFunction) { this.ruleAction = value }
        @JvmField var ruleNumber: Any? = null
        fun ruleNumber(value: Int) { this.ruleNumber = value }
        fun ruleNumber(value: IntrinsicFunction) { this.ruleNumber = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Icmp(
            val code: Int? = null,
            val type: Int? = null
    )

    class PortRange(
            val from: Int? = null,
            val to: Int? = null
    )

}

fun Resources.awsEC2NetworkAclEntry(logicalId: String, init: AWSEC2NetworkAclEntry.() -> Unit = {}): AWSEC2NetworkAclEntry {
    return AWSEC2NetworkAclEntry(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
