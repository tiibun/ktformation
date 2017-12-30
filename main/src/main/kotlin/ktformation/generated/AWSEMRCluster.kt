
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
 */
@CloudFormationMarker
class AWSEMRCluster(logicalId: String) : Resource<AWSEMRCluster.Properties>(logicalId, "AWS::EMR::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var additionalInfo: Any? = null
        fun additionalInfo(value: Json) {
            this.additionalInfo = value
        }
        fun additionalInfo(value: IntrinsicFunction) { this.additionalInfo = value }
        @JvmField var applications: Any? = null
        fun applications(value: List<Application>) {
            this.applications = value
        }
        fun applications(vararg value: IntrinsicFunction) { this.applications = value }
        @JvmField var autoScalingRole: Any? = null
        fun autoScalingRole(value: String) {
            this.autoScalingRole = value
        }
        fun autoScalingRole(value: IntrinsicFunction) { this.autoScalingRole = value }
        @JvmField var bootstrapActions: Any? = null
        fun bootstrapActions(value: List<BootstrapActionConfig>) {
            this.bootstrapActions = value
        }
        fun bootstrapActions(vararg value: IntrinsicFunction) { this.bootstrapActions = value }
        @JvmField var configurations: Any? = null
        fun configurations(value: List<Configuration>) {
            this.configurations = value
        }
        fun configurations(vararg value: IntrinsicFunction) { this.configurations = value }
        @JvmField var customAmiId: Any? = null
        fun customAmiId(value: String) {
            this.customAmiId = value
        }
        fun customAmiId(value: IntrinsicFunction) { this.customAmiId = value }
        @JvmField var ebsRootVolumeSize: Any? = null
        fun ebsRootVolumeSize(value: Int) {
            this.ebsRootVolumeSize = value
        }
        fun ebsRootVolumeSize(value: IntrinsicFunction) { this.ebsRootVolumeSize = value }
        @JvmField var instances: Any? = null
        fun instances(value: JobFlowInstancesConfig) { this.instances = value }
        fun instances(value: IntrinsicFunction) { this.instances = value }
        @JvmField var jobFlowRole: Any? = null
        fun jobFlowRole(value: String) { this.jobFlowRole = value }
        fun jobFlowRole(value: IntrinsicFunction) { this.jobFlowRole = value }
        @JvmField var logUri: Any? = null
        fun logUri(value: String) {
            this.logUri = value
        }
        fun logUri(value: IntrinsicFunction) { this.logUri = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var releaseLabel: Any? = null
        fun releaseLabel(value: String) {
            this.releaseLabel = value
        }
        fun releaseLabel(value: IntrinsicFunction) { this.releaseLabel = value }
        @JvmField var scaleDownBehavior: Any? = null
        fun scaleDownBehavior(value: String) {
            this.scaleDownBehavior = value
        }
        fun scaleDownBehavior(value: IntrinsicFunction) { this.scaleDownBehavior = value }
        @JvmField var securityConfiguration: Any? = null
        fun securityConfiguration(value: String) {
            this.securityConfiguration = value
        }
        fun securityConfiguration(value: IntrinsicFunction) { this.securityConfiguration = value }
        @JvmField var serviceRole: Any? = null
        fun serviceRole(value: String) { this.serviceRole = value }
        fun serviceRole(value: IntrinsicFunction) { this.serviceRole = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var visibleToAllUsers: Any? = null
        fun visibleToAllUsers(value: Boolean) {
            this.visibleToAllUsers = value
        }
        fun visibleToAllUsers(value: IntrinsicFunction) { this.visibleToAllUsers = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Application(
            val additionalInfo: Map<String, Any>? = null,
            val args: List<String>? = null,
            val name: String? = null,
            val version: String? = null
    )

    class AutoScalingPolicy(
            val constraints: ScalingConstraints,
            val rules: List<ScalingRule>
    )

    class BootstrapActionConfig(
            val name: String,
            val scriptBootstrapAction: ScriptBootstrapActionConfig
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
            val configurationProperties: Map<String, Any>? = null,
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

    class InstanceFleetConfig(
            val instanceTypeConfigs: List<InstanceTypeConfig>? = null,
            val launchSpecifications: InstanceFleetProvisioningSpecifications? = null,
            val name: String? = null,
            val targetOnDemandCapacity: Int? = null,
            val targetSpotCapacity: Int? = null
    )

    class InstanceFleetProvisioningSpecifications(
            val spotSpecification: SpotProvisioningSpecification
    )

    class InstanceGroupConfig(
            val autoScalingPolicy: AutoScalingPolicy? = null,
            val bidPrice: String? = null,
            val configurations: List<Configuration>? = null,
            val ebsConfiguration: EbsConfiguration? = null,
            val instanceCount: Int,
            val instanceType: String,
            val market: String? = null,
            val name: String? = null
    )

    class InstanceTypeConfig(
            val bidPrice: String? = null,
            val bidPriceAsPercentageOfOnDemandPrice: Double? = null,
            val configurations: List<Configuration>? = null,
            val ebsConfiguration: EbsConfiguration? = null,
            val instanceType: String,
            val weightedCapacity: Int? = null
    )

    class JobFlowInstancesConfig(
            val additionalMasterSecurityGroups: List<String>? = null,
            val additionalSlaveSecurityGroups: List<String>? = null,
            val coreInstanceFleet: InstanceFleetConfig? = null,
            val coreInstanceGroup: InstanceGroupConfig? = null,
            val ec2KeyName: String? = null,
            val ec2SubnetId: String? = null,
            val emrManagedMasterSecurityGroup: String? = null,
            val emrManagedSlaveSecurityGroup: String? = null,
            val hadoopVersion: String? = null,
            val masterInstanceFleet: InstanceFleetConfig? = null,
            val masterInstanceGroup: InstanceGroupConfig? = null,
            val placement: PlacementType? = null,
            val serviceAccessSecurityGroup: String? = null,
            val terminationProtected: Boolean? = null
    )

    class MetricDimension(
            val key: String,
            val value: String
    )

    class PlacementType(
            val availabilityZone: String
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

    class ScriptBootstrapActionConfig(
            val args: List<String>? = null,
            val path: String
    )

    class SimpleScalingPolicyConfiguration(
            val adjustmentType: String? = null,
            val coolDown: Int? = null,
            val scalingAdjustment: Int
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

fun Resources.awsEMRCluster(logicalId: String, init: AWSEMRCluster.() -> Unit = {}): AWSEMRCluster {
    return AWSEMRCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
