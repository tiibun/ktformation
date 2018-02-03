
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::InstanceFleetConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html)
 */
@CloudFormationMarker
class AWSEMRInstanceFleetConfig(logicalId: String) : Resource<AWSEMRInstanceFleetConfig.Properties>(logicalId, "AWS::EMR::InstanceFleetConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [clusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var clusterId: Any? = null

        /**
         * [clusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterId(value: String) {
          this.clusterId = value
        }
        
        /**
         * [clusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterId(value: IntrinsicFunction) {
          this.clusterId = value
        }
        
        /**
         * [instanceFleetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceFleetType: Any? = null

        /**
         * [instanceFleetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceFleetType(value: String) {
          this.instanceFleetType = value
        }
        
        /**
         * [instanceFleetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceFleetType(value: IntrinsicFunction) {
          this.instanceFleetType = value
        }
        
        /**
         * [instanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceTypeConfig>
         */
        @JvmField
        var instanceTypeConfigs: Any? = null

        /**
         * [instanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceTypeConfig>
         */
        fun instanceTypeConfigs(value: List<InstanceTypeConfig>) {
          this.instanceTypeConfigs = value
        }
        
        /**
         * [instanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceTypeConfig>
         */
        fun instanceTypeConfigs(vararg value: IntrinsicFunction) {
          this.instanceTypeConfigs = value
        }
        
        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetProvisioningSpecifications
         */
        @JvmField
        var launchSpecifications: Any? = null

        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetProvisioningSpecifications
         */
        fun launchSpecifications(value: InstanceFleetProvisioningSpecifications) {
          this.launchSpecifications = value
        }
        
        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetProvisioningSpecifications
         */
        fun launchSpecifications(value: IntrinsicFunction) {
          this.launchSpecifications = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [targetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var targetOnDemandCapacity: Any? = null

        /**
         * [targetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetOnDemandCapacity(value: Int) {
          this.targetOnDemandCapacity = value
        }
        
        /**
         * [targetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetOnDemandCapacity(value: IntrinsicFunction) {
          this.targetOnDemandCapacity = value
        }
        
        /**
         * [targetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var targetSpotCapacity: Any? = null

        /**
         * [targetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetSpotCapacity(value: Int) {
          this.targetSpotCapacity = value
        }
        
        /**
         * [targetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetSpotCapacity(value: IntrinsicFunction) {
          this.targetSpotCapacity = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Configuration(
            /**
             * [Classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-classification)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val classification: String? = null,
            /**
             * [ConfigurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurationproperties)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val configurationProperties: Map<String, Any>? = null,
            /**
             * [Configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurations)
             *
             * _Required_: no
             *
             * _Type_: List<Configuration>
             */
            val configurations: List<Configuration>? = null
    )

    class EbsBlockDeviceConfig(
            /**
             * [VolumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumespecification)
             *
             * _Required_: yes
             *
             * _Type_: VolumeSpecification
             */
            val volumeSpecification: VolumeSpecification,
            /**
             * [VolumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumesPerInstance: Int? = null
    )

    class EbsConfiguration(
            /**
             * [EbsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsblockdeviceconfigs)
             *
             * _Required_: no
             *
             * _Type_: List<EbsBlockDeviceConfig>
             */
            val ebsBlockDeviceConfigs: List<EbsBlockDeviceConfig>? = null,
            /**
             * [EbsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsoptimized)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ebsOptimized: Boolean? = null
    )

    class InstanceFleetProvisioningSpecifications(
            /**
             * [SpotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications-spotspecification)
             *
             * _Required_: yes
             *
             * _Type_: SpotProvisioningSpecification
             */
            val spotSpecification: SpotProvisioningSpecification
    )

    class InstanceTypeConfig(
            /**
             * [BidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bidPrice: String? = null,
            /**
             * [BidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val bidPriceAsPercentageOfOnDemandPrice: Double? = null,
            /**
             * [Configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations)
             *
             * _Required_: no
             *
             * _Type_: List<Configuration>
             */
            val configurations: List<Configuration>? = null,
            /**
             * [EbsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-ebsconfiguration)
             *
             * _Required_: no
             *
             * _Type_: EbsConfiguration
             */
            val ebsConfiguration: EbsConfiguration? = null,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instanceType: String,
            /**
             * [WeightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val weightedCapacity: Int? = null
    )

    class SpotProvisioningSpecification(
            /**
             * [BlockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val blockDurationMinutes: Int? = null,
            /**
             * [TimeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val timeoutAction: String,
            /**
             * [TimeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val timeoutDurationMinutes: Int
    )

    class VolumeSpecification(
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-sizeingb)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val sizeInGB: Int,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-volumetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val volumeType: String
    )

}

/**
 * [AWS::EMR::InstanceFleetConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html)
 */
fun Resources.awsEMRInstanceFleetConfig(logicalId: String, init: AWSEMRInstanceFleetConfig.() -> Unit = {}): AWSEMRInstanceFleetConfig {
    return AWSEMRInstanceFleetConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
