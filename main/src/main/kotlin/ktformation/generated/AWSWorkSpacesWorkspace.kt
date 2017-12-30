
package ktformation.generated

import ktformation.*

/**
 * [AWS::WorkSpaces::Workspace - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
 */
@CloudFormationMarker
class AWSWorkSpacesWorkspace(logicalId: String) : Resource<AWSWorkSpacesWorkspace.Properties>(logicalId, "AWS::WorkSpaces::Workspace") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var bundleId: Any? = null
        fun bundleId(value: String) { this.bundleId = value }
        fun bundleId(value: IntrinsicFunction) { this.bundleId = value }
        @JvmField var directoryId: Any? = null
        fun directoryId(value: String) { this.directoryId = value }
        fun directoryId(value: IntrinsicFunction) { this.directoryId = value }
        @JvmField var rootVolumeEncryptionEnabled: Any? = null
        fun rootVolumeEncryptionEnabled(value: Boolean) {
            this.rootVolumeEncryptionEnabled = value
        }
        fun rootVolumeEncryptionEnabled(value: IntrinsicFunction) { this.rootVolumeEncryptionEnabled = value }
        @JvmField var userName: Any? = null
        fun userName(value: String) { this.userName = value }
        fun userName(value: IntrinsicFunction) { this.userName = value }
        @JvmField var userVolumeEncryptionEnabled: Any? = null
        fun userVolumeEncryptionEnabled(value: Boolean) {
            this.userVolumeEncryptionEnabled = value
        }
        fun userVolumeEncryptionEnabled(value: IntrinsicFunction) { this.userVolumeEncryptionEnabled = value }
        @JvmField var volumeEncryptionKey: Any? = null
        fun volumeEncryptionKey(value: String) {
            this.volumeEncryptionKey = value
        }
        fun volumeEncryptionKey(value: IntrinsicFunction) { this.volumeEncryptionKey = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsWorkSpacesWorkspace(logicalId: String, init: AWSWorkSpacesWorkspace.() -> Unit = {}): AWSWorkSpacesWorkspace {
    return AWSWorkSpacesWorkspace(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
