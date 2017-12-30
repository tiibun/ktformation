
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html)
 */
@CloudFormationMarker
class AWSOpsWorksInstance(logicalId: String) : Resource<AWSOpsWorksInstance.Properties>(logicalId, "AWS::OpsWorks::Instance") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var agentVersion: Any? = null
        fun agentVersion(value: String) {
            this.agentVersion = value
        }
        fun agentVersion(value: IntrinsicFunction) { this.agentVersion = value }
        @JvmField var amiId: Any? = null
        fun amiId(value: String) {
            this.amiId = value
        }
        fun amiId(value: IntrinsicFunction) { this.amiId = value }
        @JvmField var architecture: Any? = null
        fun architecture(value: String) {
            this.architecture = value
        }
        fun architecture(value: IntrinsicFunction) { this.architecture = value }
        @JvmField var autoScalingType: Any? = null
        fun autoScalingType(value: String) {
            this.autoScalingType = value
        }
        fun autoScalingType(value: IntrinsicFunction) { this.autoScalingType = value }
        @JvmField var availabilityZone: Any? = null
        fun availabilityZone(value: String) {
            this.availabilityZone = value
        }
        fun availabilityZone(value: IntrinsicFunction) { this.availabilityZone = value }
        @JvmField var blockDeviceMappings: Any? = null
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
            this.blockDeviceMappings = value
        }
        fun blockDeviceMappings(vararg value: IntrinsicFunction) { this.blockDeviceMappings = value }
        @JvmField var ebsOptimized: Any? = null
        fun ebsOptimized(value: Boolean) {
            this.ebsOptimized = value
        }
        fun ebsOptimized(value: IntrinsicFunction) { this.ebsOptimized = value }
        @JvmField var elasticIps: Any? = null
        fun elasticIps(value: List<String>) {
            this.elasticIps = value
        }
        fun elasticIps(vararg value: IntrinsicFunction) { this.elasticIps = value }
        @JvmField var hostname: Any? = null
        fun hostname(value: String) {
            this.hostname = value
        }
        fun hostname(value: IntrinsicFunction) { this.hostname = value }
        @JvmField var installUpdatesOnBoot: Any? = null
        fun installUpdatesOnBoot(value: Boolean) {
            this.installUpdatesOnBoot = value
        }
        fun installUpdatesOnBoot(value: IntrinsicFunction) { this.installUpdatesOnBoot = value }
        @JvmField var instanceType: Any? = null
        fun instanceType(value: String) { this.instanceType = value }
        fun instanceType(value: IntrinsicFunction) { this.instanceType = value }
        @JvmField var layerIds: Any? = null
        fun layerIds(value: List<String>) { this.layerIds = value }
        fun layerIds(vararg value: IntrinsicFunction) { this.layerIds = value }
        @JvmField var os: Any? = null
        fun os(value: String) {
            this.os = value
        }
        fun os(value: IntrinsicFunction) { this.os = value }
        @JvmField var rootDeviceType: Any? = null
        fun rootDeviceType(value: String) {
            this.rootDeviceType = value
        }
        fun rootDeviceType(value: IntrinsicFunction) { this.rootDeviceType = value }
        @JvmField var sshKeyName: Any? = null
        fun sshKeyName(value: String) {
            this.sshKeyName = value
        }
        fun sshKeyName(value: IntrinsicFunction) { this.sshKeyName = value }
        @JvmField var stackId: Any? = null
        fun stackId(value: String) { this.stackId = value }
        fun stackId(value: IntrinsicFunction) { this.stackId = value }
        @JvmField var subnetId: Any? = null
        fun subnetId(value: String) {
            this.subnetId = value
        }
        fun subnetId(value: IntrinsicFunction) { this.subnetId = value }
        @JvmField var tenancy: Any? = null
        fun tenancy(value: String) {
            this.tenancy = value
        }
        fun tenancy(value: IntrinsicFunction) { this.tenancy = value }
        @JvmField var timeBasedAutoScaling: Any? = null
        fun timeBasedAutoScaling(value: TimeBasedAutoScaling) {
            this.timeBasedAutoScaling = value
        }
        fun timeBasedAutoScaling(value: IntrinsicFunction) { this.timeBasedAutoScaling = value }
        @JvmField var virtualizationType: Any? = null
        fun virtualizationType(value: String) {
            this.virtualizationType = value
        }
        fun virtualizationType(value: IntrinsicFunction) { this.virtualizationType = value }
        @JvmField var volumes: Any? = null
        fun volumes(value: List<String>) {
            this.volumes = value
        }
        fun volumes(vararg value: IntrinsicFunction) { this.volumes = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BlockDeviceMapping(
            val deviceName: String? = null,
            val ebs: EbsBlockDevice? = null,
            val noDevice: String? = null,
            val virtualName: String? = null
    )

    class EbsBlockDevice(
            val deleteOnTermination: Boolean? = null,
            val iops: Int? = null,
            val snapshotId: String? = null,
            val volumeSize: Int? = null,
            val volumeType: String? = null
    )

    class TimeBasedAutoScaling(
            val friday: Map<String, Any>? = null,
            val monday: Map<String, Any>? = null,
            val saturday: Map<String, Any>? = null,
            val sunday: Map<String, Any>? = null,
            val thursday: Map<String, Any>? = null,
            val tuesday: Map<String, Any>? = null,
            val wednesday: Map<String, Any>? = null
    )

}

fun Resources.awsOpsWorksInstance(logicalId: String, init: AWSOpsWorksInstance.() -> Unit = {}): AWSOpsWorksInstance {
    return AWSOpsWorksInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
