
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html)
 */
@CloudFormationMarker
class AWSOpsWorksInstance(logicalId: String) : Resource<AWSOpsWorksInstance.Properties>(logicalId, "AWS::OpsWorks::Instance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [agentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var agentVersion: Any? = null

        /**
         * [agentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun agentVersion(value: String) {
          this.agentVersion = value
        }
        
        /**
         * [agentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun agentVersion(value: IntrinsicFunction) {
          this.agentVersion = value
        }
        
        /**
         * [amiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var amiId: Any? = null

        /**
         * [amiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun amiId(value: String) {
          this.amiId = value
        }
        
        /**
         * [amiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun amiId(value: IntrinsicFunction) {
          this.amiId = value
        }
        
        /**
         * [architecture](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var architecture: Any? = null

        /**
         * [architecture](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun architecture(value: String) {
          this.architecture = value
        }
        
        /**
         * [architecture](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun architecture(value: IntrinsicFunction) {
          this.architecture = value
        }
        
        /**
         * [autoScalingType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var autoScalingType: Any? = null

        /**
         * [autoScalingType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoScalingType(value: String) {
          this.autoScalingType = value
        }
        
        /**
         * [autoScalingType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoScalingType(value: IntrinsicFunction) {
          this.autoScalingType = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        @JvmField
        var blockDeviceMappings: Any? = null

        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(vararg value: IntrinsicFunction) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: IntrinsicFunction) {
          this.ebsOptimized = value
        }
        
        /**
         * [elasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var elasticIps: Any? = null

        /**
         * [elasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun elasticIps(value: List<String>) {
          this.elasticIps = value
        }
        
        /**
         * [elasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun elasticIps(vararg value: IntrinsicFunction) {
          this.elasticIps = value
        }
        
        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostname: Any? = null

        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostname(value: String) {
          this.hostname = value
        }
        
        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostname(value: IntrinsicFunction) {
          this.hostname = value
        }
        
        /**
         * [installUpdatesOnBoot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var installUpdatesOnBoot: Any? = null

        /**
         * [installUpdatesOnBoot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun installUpdatesOnBoot(value: Boolean) {
          this.installUpdatesOnBoot = value
        }
        
        /**
         * [installUpdatesOnBoot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun installUpdatesOnBoot(value: IntrinsicFunction) {
          this.installUpdatesOnBoot = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }
        
        /**
         * [layerIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var layerIds: Any? = null

        /**
         * [layerIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun layerIds(value: List<String>) {
          this.layerIds = value
        }
        
        /**
         * [layerIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun layerIds(vararg value: IntrinsicFunction) {
          this.layerIds = value
        }
        
        /**
         * [os](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var os: Any? = null

        /**
         * [os](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun os(value: String) {
          this.os = value
        }
        
        /**
         * [os](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun os(value: IntrinsicFunction) {
          this.os = value
        }
        
        /**
         * [rootDeviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var rootDeviceType: Any? = null

        /**
         * [rootDeviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rootDeviceType(value: String) {
          this.rootDeviceType = value
        }
        
        /**
         * [rootDeviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rootDeviceType(value: IntrinsicFunction) {
          this.rootDeviceType = value
        }
        
        /**
         * [sshKeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sshKeyName: Any? = null

        /**
         * [sshKeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshKeyName(value: String) {
          this.sshKeyName = value
        }
        
        /**
         * [sshKeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshKeyName(value: IntrinsicFunction) {
          this.sshKeyName = value
        }
        
        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var stackId: Any? = null

        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: String) {
          this.stackId = value
        }
        
        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: IntrinsicFunction) {
          this.stackId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }
        
        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var tenancy: Any? = null

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: String) {
          this.tenancy = value
        }
        
        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: IntrinsicFunction) {
          this.tenancy = value
        }
        
        /**
         * [timeBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * _Required_: no
         *
         * _Type_: TimeBasedAutoScaling
         */
        @JvmField
        var timeBasedAutoScaling: Any? = null

        /**
         * [timeBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * _Required_: no
         *
         * _Type_: TimeBasedAutoScaling
         */
        fun timeBasedAutoScaling(value: TimeBasedAutoScaling) {
          this.timeBasedAutoScaling = value
        }
        
        /**
         * [timeBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * _Required_: no
         *
         * _Type_: TimeBasedAutoScaling
         */
        fun timeBasedAutoScaling(value: IntrinsicFunction) {
          this.timeBasedAutoScaling = value
        }
        
        /**
         * [virtualizationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var virtualizationType: Any? = null

        /**
         * [virtualizationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualizationType(value: String) {
          this.virtualizationType = value
        }
        
        /**
         * [virtualizationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualizationType(value: IntrinsicFunction) {
          this.virtualizationType = value
        }
        
        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var volumes: Any? = null

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun volumes(value: List<String>) {
          this.volumes = value
        }
        
        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun volumes(vararg value: IntrinsicFunction) {
          this.volumes = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BlockDeviceMapping(
            /**
             * [DeviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val deviceName: String? = null,
            /**
             * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-ebs)
             *
             * _Required_: no
             *
             * _Type_: EbsBlockDevice
             */
            val ebs: EbsBlockDevice? = null,
            /**
             * [NoDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val noDevice: String? = null,
            /**
             * [VirtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val virtualName: String? = null
    )

    class EbsBlockDevice(
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SnapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val snapshotId: String? = null,
            /**
             * [VolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumeSize: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

    class TimeBasedAutoScaling(
            /**
             * [Friday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val friday: Map<String, Any>? = null,
            /**
             * [Monday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val monday: Map<String, Any>? = null,
            /**
             * [Saturday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val saturday: Map<String, Any>? = null,
            /**
             * [Sunday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val sunday: Map<String, Any>? = null,
            /**
             * [Thursday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val thursday: Map<String, Any>? = null,
            /**
             * [Tuesday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val tuesday: Map<String, Any>? = null,
            /**
             * [Wednesday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val wednesday: Map<String, Any>? = null
    )

}

/**
 * [AWS::OpsWorks::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html)
 */
fun Resources.awsOpsWorksInstance(logicalId: String, init: AWSOpsWorksInstance.() -> Unit = {}): AWSOpsWorksInstance {
    return AWSOpsWorksInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
