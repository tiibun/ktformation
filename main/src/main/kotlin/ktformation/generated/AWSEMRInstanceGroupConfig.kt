
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::InstanceGroupConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
 */
@CloudFormationMarker
class AWSEMRInstanceGroupConfig(logicalId: String) : Resource<AWSEMRInstanceGroupConfig.Properties>(logicalId, "AWS::EMR::InstanceGroupConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var autoScalingPolicy: Any? = null
        fun autoScalingPolicy(value: AutoScalingPolicy?) { this.autoScalingPolicy = value }
        fun autoScalingPolicy(value: IntrinsicFunction) { this.autoScalingPolicy = value }
        @JvmField var bidPrice: Any? = null
        fun bidPrice(value: String?) { this.bidPrice = value }
        fun bidPrice(value: IntrinsicFunction) { this.bidPrice = value }
        @JvmField var configurations: Any? = null
        fun configurations(value: List<Configuration>?) { this.configurations = value }
        fun configurations(vararg value: IntrinsicFunction) { this.configurations = value }
        @JvmField var ebsConfiguration: Any? = null
        fun ebsConfiguration(value: EbsConfiguration?) { this.ebsConfiguration = value }
        fun ebsConfiguration(value: IntrinsicFunction) { this.ebsConfiguration = value }
        @JvmField var instanceCount: Any? = null
        fun instanceCount(value: Int) { this.instanceCount = value }
        fun instanceCount(value: IntrinsicFunction) { this.instanceCount = value }
        @JvmField var instanceRole: Any? = null
        fun instanceRole(value: String) { this.instanceRole = value }
        fun instanceRole(value: IntrinsicFunction) { this.instanceRole = value }
        @JvmField var instanceType: Any? = null
        fun instanceType(value: String) { this.instanceType = value }
        fun instanceType(value: IntrinsicFunction) { this.instanceType = value }
        @JvmField var jobFlowId: Any? = null
        fun jobFlowId(value: String) { this.jobFlowId = value }
        fun jobFlowId(value: IntrinsicFunction) { this.jobFlowId = value }
        @JvmField var market: Any? = null
        fun market(value: String?) { this.market = value }
        fun market(value: IntrinsicFunction) { this.market = value }
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AutoScalingPolicy(
            val constraints: ScalingConstraints,
            val rules: List<ScalingRule>
    )

    class CloudWatchAlarmDefinition(
            val comparisonOperator: String,
            val dimensions: List<MetricDimension>? = null,
            val evaluationPeriods: Int? = null,
            val metricName: String,
            val namespace: String? = null,
            val period: Int,
            val statistic: String? = null,
            val threshold: Double,
            val unit: String? = null
    )

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

    class MetricDimension(
            val key: String,
            val value: String
    )

    class ScalingAction(
            val market: String? = null,
            val simpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
    )

    class ScalingConstraints(
            val maxCapacity: Int,
            val minCapacity: Int
    )

    class ScalingRule(
            val action: ScalingAction,
            val description: String? = null,
            val name: String,
            val trigger: ScalingTrigger
    )

    class ScalingTrigger(
            val cloudWatchAlarmDefinition: CloudWatchAlarmDefinition
    )

    class SimpleScalingPolicyConfiguration(
            val adjustmentType: String? = null,
            val coolDown: Int? = null,
            val scalingAdjustment: Int
    )

    class VolumeSpecification(
            val iops: Int? = null,
            val sizeInGB: Int,
            val volumeType: String
    )

}

fun Resources.awsEMRInstanceGroupConfig(logicalId: String, init: AWSEMRInstanceGroupConfig.() -> Unit = {}): AWSEMRInstanceGroupConfig {
    return AWSEMRInstanceGroupConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
