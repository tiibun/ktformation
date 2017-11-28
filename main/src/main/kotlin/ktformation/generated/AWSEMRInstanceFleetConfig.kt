
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::InstanceFleetConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html)
 */
@CloudFormationMarker
class AWSEMRInstanceFleetConfig(logicalId: String) : Resource<AWSEMRInstanceFleetConfig.Properties>(logicalId, "AWS::EMR::InstanceFleetConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var clusterId: Any? = null
        fun clusterId(value: String) { this.clusterId = value }
        fun clusterId(value: IntrinsicFunction) { this.clusterId = value }
        @JvmField var instanceFleetType: Any? = null
        fun instanceFleetType(value: String) { this.instanceFleetType = value }
        fun instanceFleetType(value: IntrinsicFunction) { this.instanceFleetType = value }
        @JvmField var instanceTypeConfigs: Any? = null
        fun instanceTypeConfigs(value: List<InstanceTypeConfig>?) { this.instanceTypeConfigs = value }
        fun instanceTypeConfigs(vararg value: IntrinsicFunction) { this.instanceTypeConfigs = value }
        @JvmField var launchSpecifications: Any? = null
        fun launchSpecifications(value: InstanceFleetProvisioningSpecifications?) { this.launchSpecifications = value }
        fun launchSpecifications(value: IntrinsicFunction) { this.launchSpecifications = value }
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var targetOnDemandCapacity: Any? = null
        fun targetOnDemandCapacity(value: Int?) { this.targetOnDemandCapacity = value }
        fun targetOnDemandCapacity(value: IntrinsicFunction) { this.targetOnDemandCapacity = value }
        @JvmField var targetSpotCapacity: Any? = null
        fun targetSpotCapacity(value: Int?) { this.targetSpotCapacity = value }
        fun targetSpotCapacity(value: IntrinsicFunction) { this.targetSpotCapacity = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Configuration(
            val classification: String? = null,
            val configurationProperties: Map<String, String>? = null,
            val configurations: List<Configuration>? = null
    )

    class EbsBlockDeviceConfig(
            val volumeSpecification: VolumeSpecification,
            val volumesPerInstance: Int? = null
    )

    class EbsConfiguration(
            val ebsBlockDeviceConfigs: List<EbsBlockDeviceConfig>? = null,
            val ebsOptimized: Boolean? = null
    )

    class InstanceFleetProvisioningSpecifications(
            val spotSpecification: SpotProvisioningSpecification
    )

    class InstanceTypeConfig(
            val bidPrice: String? = null,
            val bidPriceAsPercentageOfOnDemandPrice: Double? = null,
            val configurations: List<Configuration>? = null,
            val ebsConfiguration: EbsConfiguration? = null,
            val instanceType: String,
            val weightedCapacity: Int? = null
    )

    class SpotProvisioningSpecification(
            val blockDurationMinutes: Int? = null,
            val timeoutAction: String,
            val timeoutDurationMinutes: Int
    )

    class VolumeSpecification(
            val iops: Int? = null,
            val sizeInGB: Int,
            val volumeType: String
    )

}

fun Resources.awsEMRInstanceFleetConfig(logicalId: String, init: AWSEMRInstanceFleetConfig.() -> Unit = {}): AWSEMRInstanceFleetConfig {
    return AWSEMRInstanceFleetConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
