
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkInterfaceAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html)
 */
@CloudFormationMarker
class AWSEC2NetworkInterfaceAttachment(logicalId: String) : Resource<AWSEC2NetworkInterfaceAttachment.Properties>(logicalId, "AWS::EC2::NetworkInterfaceAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var deleteOnTermination: Any? = null
        fun deleteOnTermination(value: Boolean) {
            this.deleteOnTermination = value
        }
        fun deleteOnTermination(value: IntrinsicFunction) { this.deleteOnTermination = value }
        @JvmField var deviceIndex: Any? = null
        fun deviceIndex(value: String) { this.deviceIndex = value }
        fun deviceIndex(value: IntrinsicFunction) { this.deviceIndex = value }
        @JvmField var instanceId: Any? = null
        fun instanceId(value: String) { this.instanceId = value }
        fun instanceId(value: IntrinsicFunction) { this.instanceId = value }
        @JvmField var networkInterfaceId: Any? = null
        fun networkInterfaceId(value: String) { this.networkInterfaceId = value }
        fun networkInterfaceId(value: IntrinsicFunction) { this.networkInterfaceId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2NetworkInterfaceAttachment(logicalId: String, init: AWSEC2NetworkInterfaceAttachment.() -> Unit = {}): AWSEC2NetworkInterfaceAttachment {
    return AWSEC2NetworkInterfaceAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
