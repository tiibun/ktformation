
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

        /**
        * [Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html)
        */
        fun configuration(init: Configuration.() -> Unit = {}): Configuration {
            return Configuration().also {
                it.init()
            }
        }
        /**
        * [EbsBlockDeviceConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html)
        */
        fun ebsBlockDeviceConfig(init: EbsBlockDeviceConfig.() -> Unit = {}): EbsBlockDeviceConfig {
            return EbsBlockDeviceConfig().also {
                it.init()
            }
        }
        /**
        * [EbsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html)
        */
        fun ebsConfiguration(init: EbsConfiguration.() -> Unit = {}): EbsConfiguration {
            return EbsConfiguration().also {
                it.init()
            }
        }
        /**
        * [InstanceFleetProvisioningSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html)
        */
        fun instanceFleetProvisioningSpecifications(init: InstanceFleetProvisioningSpecifications.() -> Unit = {}): InstanceFleetProvisioningSpecifications {
            return InstanceFleetProvisioningSpecifications().also {
                it.init()
            }
        }
        /**
        * [InstanceTypeConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html)
        */
        fun instanceTypeConfig(init: InstanceTypeConfig.() -> Unit = {}): InstanceTypeConfig {
            return InstanceTypeConfig().also {
                it.init()
            }
        }
        /**
        * [SpotProvisioningSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html)
        */
        fun spotProvisioningSpecification(init: SpotProvisioningSpecification.() -> Unit = {}): SpotProvisioningSpecification {
            return SpotProvisioningSpecification().also {
                it.init()
            }
        }
        /**
        * [VolumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html)
        */
        fun volumeSpecification(init: VolumeSpecification.() -> Unit = {}): VolumeSpecification {
            return VolumeSpecification().also {
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
    class Configuration {
            /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var classification: Any? = null

        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classification(value: String) {
          this.classification = value
        }
        
        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classification(value: IntrinsicFunction) {
          this.classification = value
        }

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var configurationProperties: Any? = null

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun configurationProperties(value: Map<String, Any>) {
          this.configurationProperties = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-configuration.html#cfn-elasticmapreduce-instancefleetconfig-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(vararg value: IntrinsicFunction) {
          this.configurations = value
        }

    }

    @CloudFormationMarker
    class EbsBlockDeviceConfig {
            /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        var volumeSpecification: Any? = null

        /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        fun volumeSpecification(value: VolumeSpecification) {
          this.volumeSpecification = value
        }
        
        /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        fun volumeSpecification(value: IntrinsicFunction) {
          this.volumeSpecification = value
        }

        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumesPerInstance: Any? = null

        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumesPerInstance(value: Int) {
          this.volumesPerInstance = value
        }
        
        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumesPerInstance(value: IntrinsicFunction) {
          this.volumesPerInstance = value
        }

    }

    @CloudFormationMarker
    class EbsConfiguration {
            /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        var ebsBlockDeviceConfigs: Any? = null

        /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        fun ebsBlockDeviceConfigs(value: List<EbsBlockDeviceConfig>) {
          this.ebsBlockDeviceConfigs = value
        }
        
        /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        fun ebsBlockDeviceConfigs(vararg value: IntrinsicFunction) {
          this.ebsBlockDeviceConfigs = value
        }

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsconfiguration.html#cfn-elasticmapreduce-instancefleetconfig-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: IntrinsicFunction) {
          this.ebsOptimized = value
        }

    }

    @CloudFormationMarker
    class InstanceFleetProvisioningSpecifications {
            /**
         * [spotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications-spotspecification)
         *
         * _Required_: yes
         *
         * _Type_: SpotProvisioningSpecification
         */
        var spotSpecification: Any? = null

        /**
         * [spotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications-spotspecification)
         *
         * _Required_: yes
         *
         * _Type_: SpotProvisioningSpecification
         */
        fun spotSpecification(value: SpotProvisioningSpecification) {
          this.spotSpecification = value
        }
        
        /**
         * [spotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications-spotspecification)
         *
         * _Required_: yes
         *
         * _Type_: SpotProvisioningSpecification
         */
        fun spotSpecification(value: IntrinsicFunction) {
          this.spotSpecification = value
        }

    }

    @CloudFormationMarker
    class InstanceTypeConfig {
            /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bidPrice: Any? = null

        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: String) {
          this.bidPrice = value
        }
        
        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: IntrinsicFunction) {
          this.bidPrice = value
        }

        /**
         * [bidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var bidPriceAsPercentageOfOnDemandPrice: Any? = null

        /**
         * [bidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun bidPriceAsPercentageOfOnDemandPrice(value: Double) {
          this.bidPriceAsPercentageOfOnDemandPrice = value
        }
        
        /**
         * [bidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun bidPriceAsPercentageOfOnDemandPrice(value: IntrinsicFunction) {
          this.bidPriceAsPercentageOfOnDemandPrice = value
        }

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(vararg value: IntrinsicFunction) {
          this.configurations = value
        }

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        var ebsConfiguration: Any? = null

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: EbsConfiguration) {
          this.ebsConfiguration = value
        }
        
        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: IntrinsicFunction) {
          this.ebsConfiguration = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var weightedCapacity: Any? = null

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun weightedCapacity(value: Int) {
          this.weightedCapacity = value
        }
        
        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancetypeconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfig-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun weightedCapacity(value: IntrinsicFunction) {
          this.weightedCapacity = value
        }

    }

    @CloudFormationMarker
    class SpotProvisioningSpecification {
            /**
         * [blockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var blockDurationMinutes: Any? = null

        /**
         * [blockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun blockDurationMinutes(value: Int) {
          this.blockDurationMinutes = value
        }
        
        /**
         * [blockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-blockdurationminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun blockDurationMinutes(value: IntrinsicFunction) {
          this.blockDurationMinutes = value
        }

        /**
         * [timeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var timeoutAction: Any? = null

        /**
         * [timeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeoutAction(value: String) {
          this.timeoutAction = value
        }
        
        /**
         * [timeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeoutAction(value: IntrinsicFunction) {
          this.timeoutAction = value
        }

        /**
         * [timeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var timeoutDurationMinutes: Any? = null

        /**
         * [timeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun timeoutDurationMinutes(value: Int) {
          this.timeoutDurationMinutes = value
        }
        
        /**
         * [timeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html#cfn-elasticmapreduce-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun timeoutDurationMinutes(value: IntrinsicFunction) {
          this.timeoutDurationMinutes = value
        }

    }

    @CloudFormationMarker
    class VolumeSpecification {
            /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var sizeInGB: Any? = null

        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInGB(value: Int) {
          this.sizeInGB = value
        }
        
        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInGB(value: IntrinsicFunction) {
          this.sizeInGB = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html#cfn-elasticmapreduce-instancefleetconfig-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeType(value: IntrinsicFunction) {
          this.volumeType = value
        }

    }

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
