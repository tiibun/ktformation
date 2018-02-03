
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::InstanceGroupConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
 */
@CloudFormationMarker
class AWSEMRInstanceGroupConfig(logicalId: String) : Resource<AWSEMRInstanceGroupConfig.Properties>(logicalId, "AWS::EMR::InstanceGroupConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingPolicy
         */
        @JvmField
        var autoScalingPolicy: Any? = null

        /**
         * [autoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingPolicy
         */
        fun autoScalingPolicy(value: AutoScalingPolicy) {
          this.autoScalingPolicy = value
        }
        
        /**
         * [autoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingPolicy
         */
        fun autoScalingPolicy(value: IntrinsicFunction) {
          this.autoScalingPolicy = value
        }
        
        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var bidPrice: Any? = null

        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: String) {
          this.bidPrice = value
        }
        
        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: IntrinsicFunction) {
          this.bidPrice = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        @JvmField
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(vararg value: IntrinsicFunction) {
          this.configurations = value
        }
        
        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        @JvmField
        var ebsConfiguration: Any? = null

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: EbsConfiguration) {
          this.ebsConfiguration = value
        }
        
        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: IntrinsicFunction) {
          this.ebsConfiguration = value
        }
        
        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var instanceCount: Any? = null

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun instanceCount(value: Int) {
          this.instanceCount = value
        }
        
        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfiginstancecount-)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun instanceCount(value: IntrinsicFunction) {
          this.instanceCount = value
        }
        
        /**
         * [instanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceRole: Any? = null

        /**
         * [instanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceRole(value: String) {
          this.instanceRole = value
        }
        
        /**
         * [instanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceRole(value: IntrinsicFunction) {
          this.instanceRole = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }
        
        /**
         * [jobFlowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var jobFlowId: Any? = null

        /**
         * [jobFlowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jobFlowId(value: String) {
          this.jobFlowId = value
        }
        
        /**
         * [jobFlowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jobFlowId(value: IntrinsicFunction) {
          this.jobFlowId = value
        }
        
        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var market: Any? = null

        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: String) {
          this.market = value
        }
        
        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: IntrinsicFunction) {
          this.market = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AutoScalingPolicy(
            /**
             * [Constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-constraints)
             *
             * _Required_: yes
             *
             * _Type_: ScalingConstraints
             */
            val constraints: ScalingConstraints,
            /**
             * [Rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules)
             *
             * _Required_: yes
             *
             * _Type_: List<ScalingRule>
             */
            val rules: List<ScalingRule>
    )

    class CloudWatchAlarmDefinition(
            /**
             * [ComparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-comparisonoperator)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val comparisonOperator: String,
            /**
             * [Dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-dimensions)
             *
             * _Required_: no
             *
             * _Type_: List<MetricDimension>
             */
            val dimensions: List<MetricDimension>? = null,
            /**
             * [EvaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-evaluationperiods)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val evaluationPeriods: Int? = null,
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-namespace)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val namespace: String? = null,
            /**
             * [Period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-period)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val period: Int,
            /**
             * [Statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-statistic)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val statistic: String? = null,
            /**
             * [Threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-threshold)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val threshold: Double,
            /**
             * [Unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-unit)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val unit: String? = null
    )

    class Configuration(
            /**
             * [Classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val classification: String? = null,
            /**
             * [ConfigurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val configurationProperties: Map<String, Any>? = null,
            /**
             * [Configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations)
             *
             * _Required_: no
             *
             * _Type_: List<Configuration>
             */
            val configurations: List<Configuration>? = null
    )

    class EbsBlockDeviceConfig(
            /**
             * [VolumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification)
             *
             * _Required_: yes
             *
             * _Type_: VolumeSpecification
             */
            val volumeSpecification: VolumeSpecification,
            /**
             * [VolumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumesPerInstance: Int? = null
    )

    class EbsConfiguration(
            /**
             * [EbsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs)
             *
             * _Required_: no
             *
             * _Type_: List<EbsBlockDeviceConfig>
             */
            val ebsBlockDeviceConfigs: List<EbsBlockDeviceConfig>? = null,
            /**
             * [EbsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ebsOptimized: Boolean? = null
    )

    class MetricDimension(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class ScalingAction(
            /**
             * [Market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val market: String? = null,
            /**
             * [SimpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-simplescalingpolicyconfiguration)
             *
             * _Required_: yes
             *
             * _Type_: SimpleScalingPolicyConfiguration
             */
            val simpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
    )

    class ScalingConstraints(
            /**
             * [MaxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val maxCapacity: Int,
            /**
             * [MinCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val minCapacity: Int
    )

    class ScalingRule(
            /**
             * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-action)
             *
             * _Required_: yes
             *
             * _Type_: ScalingAction
             */
            val action: ScalingAction,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-trigger)
             *
             * _Required_: yes
             *
             * _Type_: ScalingTrigger
             */
            val trigger: ScalingTrigger
    )

    class ScalingTrigger(
            /**
             * [CloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html#cfn-elasticmapreduce-instancegroupconfig-scalingtrigger-cloudwatchalarmdefinition)
             *
             * _Required_: yes
             *
             * _Type_: CloudWatchAlarmDefinition
             */
            val cloudWatchAlarmDefinition: CloudWatchAlarmDefinition
    )

    class SimpleScalingPolicyConfiguration(
            /**
             * [AdjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-adjustmenttype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val adjustmentType: String? = null,
            /**
             * [CoolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-cooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val coolDown: Int? = null,
            /**
             * [ScalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-scalingadjustment)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val scalingAdjustment: Int
    )

    class VolumeSpecification(
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-sizeingb)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val sizeInGB: Int,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-volumetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val volumeType: String
    )

}

/**
 * [AWS::EMR::InstanceGroupConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
 */
fun Resources.awsEMRInstanceGroupConfig(logicalId: String, init: AWSEMRInstanceGroupConfig.() -> Unit = {}): AWSEMRInstanceGroupConfig {
    return AWSEMRInstanceGroupConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
