
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::EIPAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html)
 */
@CloudFormationMarker
class AWSEC2EIPAssociation(logicalId: String) : Resource<AWSEC2EIPAssociation.Properties>(logicalId, "AWS::EC2::EIPAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var allocationId: Any? = null
        fun allocationId(value: String) {
            this.allocationId = value
        }
        fun allocationId(value: IntrinsicFunction) { this.allocationId = value }
        @JvmField var eIP: Any? = null
        fun eIP(value: String) {
            this.eIP = value
        }
        fun eIP(value: IntrinsicFunction) { this.eIP = value }
        @JvmField var instanceId: Any? = null
        fun instanceId(value: String) {
            this.instanceId = value
        }
        fun instanceId(value: IntrinsicFunction) { this.instanceId = value }
        @JvmField var networkInterfaceId: Any? = null
        fun networkInterfaceId(value: String) {
            this.networkInterfaceId = value
        }
        fun networkInterfaceId(value: IntrinsicFunction) { this.networkInterfaceId = value }
        @JvmField var privateIpAddress: Any? = null
        fun privateIpAddress(value: String) {
            this.privateIpAddress = value
        }
        fun privateIpAddress(value: IntrinsicFunction) { this.privateIpAddress = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2EIPAssociation(logicalId: String, init: AWSEC2EIPAssociation.() -> Unit = {}): AWSEC2EIPAssociation {
    return AWSEC2EIPAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
