
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::LaunchConfiguration - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html)
 */
@CloudFormationMarker
class AWSAutoScalingLaunchConfiguration(logicalId: String) : Resource<AWSAutoScalingLaunchConfiguration.Properties>(logicalId, "AWS::AutoScaling::LaunchConfiguration") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var associatePublicIpAddress: Any? = null

        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: Boolean) {
          this.associatePublicIpAddress = value
        }
        
        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: IntrinsicFunction) {
          this.associatePublicIpAddress = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        @JvmField
        var blockDeviceMappings: Any? = null

        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(vararg value: IntrinsicFunction) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [classicLinkVPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var classicLinkVPCId: Any? = null

        /**
         * [classicLinkVPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classicLinkVPCId(value: String) {
          this.classicLinkVPCId = value
        }
        
        /**
         * [classicLinkVPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classicLinkVPCId(value: IntrinsicFunction) {
          this.classicLinkVPCId = value
        }
        
        /**
         * [classicLinkVPCSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var classicLinkVPCSecurityGroups: Any? = null

        /**
         * [classicLinkVPCSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun classicLinkVPCSecurityGroups(value: List<String>) {
          this.classicLinkVPCSecurityGroups = value
        }
        
        /**
         * [classicLinkVPCSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun classicLinkVPCSecurityGroups(vararg value: IntrinsicFunction) {
          this.classicLinkVPCSecurityGroups = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: IntrinsicFunction) {
          this.ebsOptimized = value
        }
        
        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var iamInstanceProfile: Any? = null

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iamInstanceProfile(value: String) {
          this.iamInstanceProfile = value
        }
        
        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iamInstanceProfile(value: IntrinsicFunction) {
          this.iamInstanceProfile = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var imageId: Any? = null

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun imageId(value: String) {
          this.imageId = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun imageId(value: IntrinsicFunction) {
          this.imageId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }
        
        /**
         * [instanceMonitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var instanceMonitoring: Any? = null

        /**
         * [instanceMonitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun instanceMonitoring(value: Boolean) {
          this.instanceMonitoring = value
        }
        
        /**
         * [instanceMonitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun instanceMonitoring(value: IntrinsicFunction) {
          this.instanceMonitoring = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }
        
        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kernelId: Any? = null

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: String) {
          this.kernelId = value
        }
        
        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: IntrinsicFunction) {
          this.kernelId = value
        }
        
        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var keyName: Any? = null

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: String) {
          this.keyName = value
        }
        
        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: IntrinsicFunction) {
          this.keyName = value
        }
        
        /**
         * [launchConfigurationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var launchConfigurationName: Any? = null

        /**
         * [launchConfigurationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchConfigurationName(value: String) {
          this.launchConfigurationName = value
        }
        
        /**
         * [launchConfigurationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchConfigurationName(value: IntrinsicFunction) {
          this.launchConfigurationName = value
        }
        
        /**
         * [placementTenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var placementTenancy: Any? = null

        /**
         * [placementTenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun placementTenancy(value: String) {
          this.placementTenancy = value
        }
        
        /**
         * [placementTenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun placementTenancy(value: IntrinsicFunction) {
          this.placementTenancy = value
        }
        
        /**
         * [ramDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ramDiskId: Any? = null

        /**
         * [ramDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramDiskId(value: String) {
          this.ramDiskId = value
        }
        
        /**
         * [ramDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramDiskId(value: IntrinsicFunction) {
          this.ramDiskId = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }
        
        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var spotPrice: Any? = null

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: String) {
          this.spotPrice = value
        }
        
        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: IntrinsicFunction) {
          this.spotPrice = value
        }
        
        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var userData: Any? = null

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: String) {
          this.userData = value
        }
        
        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: IntrinsicFunction) {
          this.userData = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BlockDevice(
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-deleteonterm)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-encrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val encrypted: Boolean? = null,
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SnapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-snapshotid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val snapshotId: String? = null,
            /**
             * [VolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumesize)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumeSize: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-template.html#cfn-as-launchconfig-blockdev-template-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

    class BlockDeviceMapping(
            /**
             * [DeviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-devicename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val deviceName: String,
            /**
             * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-ebs)
             *
             * _Required_: no
             *
             * _Type_: BlockDevice
             */
            val ebs: BlockDevice? = null,
            /**
             * [NoDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-nodevice)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val noDevice: Boolean? = null,
            /**
             * [VirtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html#cfn-as-launchconfig-blockdev-mapping-virtualname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val virtualName: String? = null
    )

}

/**
 * [AWS::AutoScaling::LaunchConfiguration - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html)
 */
fun Resources.awsAutoScalingLaunchConfiguration(logicalId: String, init: AWSAutoScalingLaunchConfiguration.() -> Unit = {}): AWSAutoScalingLaunchConfiguration {
    return AWSAutoScalingLaunchConfiguration(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
