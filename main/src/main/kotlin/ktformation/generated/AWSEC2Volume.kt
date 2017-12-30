
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Volume - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
 */
@CloudFormationMarker
class AWSEC2Volume(logicalId: String) : Resource<AWSEC2Volume.Properties>(logicalId, "AWS::EC2::Volume") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var autoEnableIO: Any? = null
        fun autoEnableIO(value: Boolean) {
            this.autoEnableIO = value
        }
        fun autoEnableIO(value: IntrinsicFunction) { this.autoEnableIO = value }
        @JvmField var availabilityZone: Any? = null
        fun availabilityZone(value: String) { this.availabilityZone = value }
        fun availabilityZone(value: IntrinsicFunction) { this.availabilityZone = value }
        @JvmField var encrypted: Any? = null
        fun encrypted(value: Boolean) {
            this.encrypted = value
        }
        fun encrypted(value: IntrinsicFunction) { this.encrypted = value }
        @JvmField var iops: Any? = null
        fun iops(value: Int) {
            this.iops = value
        }
        fun iops(value: IntrinsicFunction) { this.iops = value }
        @JvmField var kmsKeyId: Any? = null
        fun kmsKeyId(value: String) {
            this.kmsKeyId = value
        }
        fun kmsKeyId(value: IntrinsicFunction) { this.kmsKeyId = value }
        @JvmField var size: Any? = null
        fun size(value: Int) {
            this.size = value
        }
        fun size(value: IntrinsicFunction) { this.size = value }
        @JvmField var snapshotId: Any? = null
        fun snapshotId(value: String) {
            this.snapshotId = value
        }
        fun snapshotId(value: IntrinsicFunction) { this.snapshotId = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var volumeType: Any? = null
        fun volumeType(value: String) {
            this.volumeType = value
        }
        fun volumeType(value: IntrinsicFunction) { this.volumeType = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2Volume(logicalId: String, init: AWSEC2Volume.() -> Unit = {}): AWSEC2Volume {
    return AWSEC2Volume(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
