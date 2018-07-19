
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

        /**
        * [BlockDeviceMapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html)
        */
        fun blockDeviceMapping(init: BlockDeviceMapping.() -> Unit = {}): BlockDeviceMapping {
            return BlockDeviceMapping().also {
                it.init()
            }
        }
        /**
        * [EbsBlockDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html)
        */
        fun ebsBlockDevice(init: EbsBlockDevice.() -> Unit = {}): EbsBlockDevice {
            return EbsBlockDevice().also {
                it.init()
            }
        }
        /**
        * [TimeBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html)
        */
        fun timeBasedAutoScaling(init: TimeBasedAutoScaling.() -> Unit = {}): TimeBasedAutoScaling {
            return TimeBasedAutoScaling().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class BlockDeviceMapping {
            /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deviceName: Any? = null

        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deviceName(value: String) {
          this.deviceName = value
        }
        
        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deviceName(value: IntrinsicFunction) {
          this.deviceName = value
        }

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: EbsBlockDevice
         */
        var ebs: Any? = null

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: EbsBlockDevice
         */
        fun ebs(value: EbsBlockDevice) {
          this.ebs = value
        }
        
        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: EbsBlockDevice
         */
        fun ebs(value: IntrinsicFunction) {
          this.ebs = value
        }

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var noDevice: Any? = null

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noDevice(value: String) {
          this.noDevice = value
        }
        
        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noDevice(value: IntrinsicFunction) {
          this.noDevice = value
        }

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var virtualName: Any? = null

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualName(value: String) {
          this.virtualName = value
        }
        
        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualName(value: IntrinsicFunction) {
          this.virtualName = value
        }

    }

    @CloudFormationMarker
    class EbsBlockDevice {
            /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var snapshotId: Any? = null

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: String) {
          this.snapshotId = value
        }
        
        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: IntrinsicFunction) {
          this.snapshotId = value
        }

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumeSize: Any? = null

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: Int) {
          this.volumeSize = value
        }
        
        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: IntrinsicFunction) {
          this.volumeSize = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: IntrinsicFunction) {
          this.volumeType = value
        }

    }

    @CloudFormationMarker
    class TimeBasedAutoScaling {
            /**
         * [friday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var friday: Any? = null

        /**
         * [friday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun friday(value: Map<String, Any>) {
          this.friday = value
        }
        
        /**
         * [monday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var monday: Any? = null

        /**
         * [monday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun monday(value: Map<String, Any>) {
          this.monday = value
        }
        
        /**
         * [saturday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var saturday: Any? = null

        /**
         * [saturday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun saturday(value: Map<String, Any>) {
          this.saturday = value
        }
        
        /**
         * [sunday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var sunday: Any? = null

        /**
         * [sunday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun sunday(value: Map<String, Any>) {
          this.sunday = value
        }
        
        /**
         * [thursday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var thursday: Any? = null

        /**
         * [thursday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun thursday(value: Map<String, Any>) {
          this.thursday = value
        }
        
        /**
         * [tuesday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var tuesday: Any? = null

        /**
         * [tuesday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun tuesday(value: Map<String, Any>) {
          this.tuesday = value
        }
        
        /**
         * [wednesday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var wednesday: Any? = null

        /**
         * [wednesday](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun wednesday(value: Map<String, Any>) {
          this.wednesday = value
        }
        
    }

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
