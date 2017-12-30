
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::LaunchConfiguration - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html)
 */
@CloudFormationMarker
class AWSAutoScalingLaunchConfiguration(logicalId: String) : Resource<AWSAutoScalingLaunchConfiguration.Properties>(logicalId, "AWS::AutoScaling::LaunchConfiguration") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var associatePublicIpAddress: Any? = null
        fun associatePublicIpAddress(value: Boolean) {
            this.associatePublicIpAddress = value
        }
        fun associatePublicIpAddress(value: IntrinsicFunction) { this.associatePublicIpAddress = value }
        @JvmField var blockDeviceMappings: Any? = null
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
            this.blockDeviceMappings = value
        }
        fun blockDeviceMappings(vararg value: IntrinsicFunction) { this.blockDeviceMappings = value }
        @JvmField var classicLinkVPCId: Any? = null
        fun classicLinkVPCId(value: String) {
            this.classicLinkVPCId = value
        }
        fun classicLinkVPCId(value: IntrinsicFunction) { this.classicLinkVPCId = value }
        @JvmField var classicLinkVPCSecurityGroups: Any? = null
        fun classicLinkVPCSecurityGroups(value: List<String>) {
            this.classicLinkVPCSecurityGroups = value
        }
        fun classicLinkVPCSecurityGroups(vararg value: IntrinsicFunction) { this.classicLinkVPCSecurityGroups = value }
        @JvmField var ebsOptimized: Any? = null
        fun ebsOptimized(value: Boolean) {
            this.ebsOptimized = value
        }
        fun ebsOptimized(value: IntrinsicFunction) { this.ebsOptimized = value }
        @JvmField var iamInstanceProfile: Any? = null
        fun iamInstanceProfile(value: String) {
            this.iamInstanceProfile = value
        }
        fun iamInstanceProfile(value: IntrinsicFunction) { this.iamInstanceProfile = value }
        @JvmField var imageId: Any? = null
        fun imageId(value: String) { this.imageId = value }
        fun imageId(value: IntrinsicFunction) { this.imageId = value }
        @JvmField var instanceId: Any? = null
        fun instanceId(value: String) {
            this.instanceId = value
        }
        fun instanceId(value: IntrinsicFunction) { this.instanceId = value }
        @JvmField var instanceMonitoring: Any? = null
        fun instanceMonitoring(value: Boolean) {
            this.instanceMonitoring = value
        }
        fun instanceMonitoring(value: IntrinsicFunction) { this.instanceMonitoring = value }
        @JvmField var instanceType: Any? = null
        fun instanceType(value: String) { this.instanceType = value }
        fun instanceType(value: IntrinsicFunction) { this.instanceType = value }
        @JvmField var kernelId: Any? = null
        fun kernelId(value: String) {
            this.kernelId = value
        }
        fun kernelId(value: IntrinsicFunction) { this.kernelId = value }
        @JvmField var keyName: Any? = null
        fun keyName(value: String) {
            this.keyName = value
        }
        fun keyName(value: IntrinsicFunction) { this.keyName = value }
        @JvmField var placementTenancy: Any? = null
        fun placementTenancy(value: String) {
            this.placementTenancy = value
        }
        fun placementTenancy(value: IntrinsicFunction) { this.placementTenancy = value }
        @JvmField var ramDiskId: Any? = null
        fun ramDiskId(value: String) {
            this.ramDiskId = value
        }
        fun ramDiskId(value: IntrinsicFunction) { this.ramDiskId = value }
        @JvmField var securityGroups: Any? = null
        fun securityGroups(value: List<String>) {
            this.securityGroups = value
        }
        fun securityGroups(vararg value: IntrinsicFunction) { this.securityGroups = value }
        @JvmField var spotPrice: Any? = null
        fun spotPrice(value: String) {
            this.spotPrice = value
        }
        fun spotPrice(value: IntrinsicFunction) { this.spotPrice = value }
        @JvmField var userData: Any? = null
        fun userData(value: String) {
            this.userData = value
        }
        fun userData(value: IntrinsicFunction) { this.userData = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BlockDevice(
            val deleteOnTermination: Boolean? = null,
            val encrypted: Boolean? = null,
            val iops: Int? = null,
            val snapshotId: String? = null,
            val volumeSize: Int? = null,
            val volumeType: String? = null
    )

    class BlockDeviceMapping(
            val deviceName: String,
            val ebs: BlockDevice? = null,
            val noDevice: Boolean? = null,
            val virtualName: String? = null
    )

}

fun Resources.awsAutoScalingLaunchConfiguration(logicalId: String, init: AWSAutoScalingLaunchConfiguration.() -> Unit = {}): AWSAutoScalingLaunchConfiguration {
    return AWSAutoScalingLaunchConfiguration(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
