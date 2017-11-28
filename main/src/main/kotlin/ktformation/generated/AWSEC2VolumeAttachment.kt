
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VolumeAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html)
 */
@CloudFormationMarker
class AWSEC2VolumeAttachment(logicalId: String) : Resource<AWSEC2VolumeAttachment.Properties>(logicalId, "AWS::EC2::VolumeAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var device: Any? = null
        fun device(value: String) { this.device = value }
        fun device(value: IntrinsicFunction) { this.device = value }
        @JvmField var instanceId: Any? = null
        fun instanceId(value: String) { this.instanceId = value }
        fun instanceId(value: IntrinsicFunction) { this.instanceId = value }
        @JvmField var volumeId: Any? = null
        fun volumeId(value: String) { this.volumeId = value }
        fun volumeId(value: IntrinsicFunction) { this.volumeId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2VolumeAttachment(logicalId: String, init: AWSEC2VolumeAttachment.() -> Unit = {}): AWSEC2VolumeAttachment {
    return AWSEC2VolumeAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
