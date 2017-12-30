
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html)
 */
@CloudFormationMarker
class AWSEC2SecurityGroupIngress(logicalId: String) : Resource<AWSEC2SecurityGroupIngress.Properties>(logicalId, "AWS::EC2::SecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cidrIp: Any? = null
        fun cidrIp(value: String) {
            this.cidrIp = value
        }
        fun cidrIp(value: IntrinsicFunction) { this.cidrIp = value }
        @JvmField var cidrIpv6: Any? = null
        fun cidrIpv6(value: String) {
            this.cidrIpv6 = value
        }
        fun cidrIpv6(value: IntrinsicFunction) { this.cidrIpv6 = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var fromPort: Any? = null
        fun fromPort(value: Int) {
            this.fromPort = value
        }
        fun fromPort(value: IntrinsicFunction) { this.fromPort = value }
        @JvmField var groupId: Any? = null
        fun groupId(value: String) {
            this.groupId = value
        }
        fun groupId(value: IntrinsicFunction) { this.groupId = value }
        @JvmField var groupName: Any? = null
        fun groupName(value: String) {
            this.groupName = value
        }
        fun groupName(value: IntrinsicFunction) { this.groupName = value }
        @JvmField var ipProtocol: Any? = null
        fun ipProtocol(value: String) { this.ipProtocol = value }
        fun ipProtocol(value: IntrinsicFunction) { this.ipProtocol = value }
        @JvmField var sourceSecurityGroupId: Any? = null
        fun sourceSecurityGroupId(value: String) {
            this.sourceSecurityGroupId = value
        }
        fun sourceSecurityGroupId(value: IntrinsicFunction) { this.sourceSecurityGroupId = value }
        @JvmField var sourceSecurityGroupName: Any? = null
        fun sourceSecurityGroupName(value: String) {
            this.sourceSecurityGroupName = value
        }
        fun sourceSecurityGroupName(value: IntrinsicFunction) { this.sourceSecurityGroupName = value }
        @JvmField var sourceSecurityGroupOwnerId: Any? = null
        fun sourceSecurityGroupOwnerId(value: String) {
            this.sourceSecurityGroupOwnerId = value
        }
        fun sourceSecurityGroupOwnerId(value: IntrinsicFunction) { this.sourceSecurityGroupOwnerId = value }
        @JvmField var toPort: Any? = null
        fun toPort(value: Int) {
            this.toPort = value
        }
        fun toPort(value: IntrinsicFunction) { this.toPort = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2SecurityGroupIngress(logicalId: String, init: AWSEC2SecurityGroupIngress.() -> Unit = {}): AWSEC2SecurityGroupIngress {
    return AWSEC2SecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
