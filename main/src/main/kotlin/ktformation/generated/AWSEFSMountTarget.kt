
package ktformation.generated

import ktformation.*

/**
 * [AWS::EFS::MountTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 */
@CloudFormationMarker
class AWSEFSMountTarget(logicalId: String) : Resource<AWSEFSMountTarget.Properties>(logicalId, "AWS::EFS::MountTarget") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var fileSystemId: Any? = null
        fun fileSystemId(value: String) { this.fileSystemId = value }
        fun fileSystemId(value: IntrinsicFunction) { this.fileSystemId = value }
        @JvmField var ipAddress: Any? = null
        fun ipAddress(value: String?) { this.ipAddress = value }
        fun ipAddress(value: IntrinsicFunction) { this.ipAddress = value }
        @JvmField var securityGroups: Any? = null
        fun securityGroups(value: List<String>) { this.securityGroups = value }
        fun securityGroups(vararg value: IntrinsicFunction) { this.securityGroups = value }
        @JvmField var subnetId: Any? = null
        fun subnetId(value: String) { this.subnetId = value }
        fun subnetId(value: IntrinsicFunction) { this.subnetId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEFSMountTarget(logicalId: String, init: AWSEFSMountTarget.() -> Unit = {}): AWSEFSMountTarget {
    return AWSEFSMountTarget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
