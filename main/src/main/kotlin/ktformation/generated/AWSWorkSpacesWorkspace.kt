
package ktformation.generated

import ktformation.*

/**
 * [AWS::WorkSpaces::Workspace - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
 */
@CloudFormationMarker
class AWSWorkSpacesWorkspace(logicalId: String) : Resource<AWSWorkSpacesWorkspace.Properties>(logicalId, "AWS::WorkSpaces::Workspace") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [bundleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var bundleId: Any? = null

        /**
         * [bundleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bundleId(value: String) {
          this.bundleId = value
        }
        
        /**
         * [bundleId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-bundleid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bundleId(value: IntrinsicFunction) {
          this.bundleId = value
        }

        /**
         * [directoryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var directoryId: Any? = null

        /**
         * [directoryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun directoryId(value: String) {
          this.directoryId = value
        }
        
        /**
         * [directoryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-directoryid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun directoryId(value: IntrinsicFunction) {
          this.directoryId = value
        }

        /**
         * [rootVolumeEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var rootVolumeEncryptionEnabled: Any? = null

        /**
         * [rootVolumeEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun rootVolumeEncryptionEnabled(value: Boolean) {
          this.rootVolumeEncryptionEnabled = value
        }
        
        /**
         * [rootVolumeEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-rootvolumeencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun rootVolumeEncryptionEnabled(value: IntrinsicFunction) {
          this.rootVolumeEncryptionEnabled = value
        }

        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var userName: Any? = null

        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userName(value: String) {
          this.userName = value
        }
        
        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userName(value: IntrinsicFunction) {
          this.userName = value
        }

        /**
         * [userVolumeEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var userVolumeEncryptionEnabled: Any? = null

        /**
         * [userVolumeEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun userVolumeEncryptionEnabled(value: Boolean) {
          this.userVolumeEncryptionEnabled = value
        }
        
        /**
         * [userVolumeEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-uservolumeencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun userVolumeEncryptionEnabled(value: IntrinsicFunction) {
          this.userVolumeEncryptionEnabled = value
        }

        /**
         * [volumeEncryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var volumeEncryptionKey: Any? = null

        /**
         * [volumeEncryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeEncryptionKey(value: String) {
          this.volumeEncryptionKey = value
        }
        
        /**
         * [volumeEncryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html#cfn-workspaces-workspace-volumeencryptionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeEncryptionKey(value: IntrinsicFunction) {
          this.volumeEncryptionKey = value
        }


    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::WorkSpaces::Workspace - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
 */
fun Resources.awsWorkSpacesWorkspace(logicalId: String, init: AWSWorkSpacesWorkspace.() -> Unit = {}): AWSWorkSpacesWorkspace {
    return AWSWorkSpacesWorkspace(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
