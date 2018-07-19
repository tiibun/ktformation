
package ktformation.generated

import ktformation.*

/**
 * [AWS::EFS::MountTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 */
@CloudFormationMarker
class AWSEFSMountTarget(logicalId: String) : Resource<AWSEFSMountTarget.Properties>(logicalId, "AWS::EFS::MountTarget") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [fileSystemId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var fileSystemId: Any? = null

        /**
         * [fileSystemId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun fileSystemId(value: String) {
          this.fileSystemId = value
        }
        
        /**
         * [fileSystemId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun fileSystemId(value: IntrinsicFunction) {
          this.fileSystemId = value
        }

        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ipAddress: Any? = null

        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipAddress(value: String) {
          this.ipAddress = value
        }
        
        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipAddress(value: IntrinsicFunction) {
          this.ipAddress = value
        }

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
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
 * [AWS::EFS::MountTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 */
fun Resources.awsEFSMountTarget(logicalId: String, init: AWSEFSMountTarget.() -> Unit = {}): AWSEFSMountTarget {
    return AWSEFSMountTarget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
