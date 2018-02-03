
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeDeploy::DeploymentGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 */
@CloudFormationMarker
class AWSCodeDeployDeploymentGroup(logicalId: String) : Resource<AWSCodeDeployDeploymentGroup.Properties>(logicalId, "AWS::CodeDeploy::DeploymentGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var alarmConfiguration: Any? = null

        fun alarmConfiguration(value: AlarmConfiguration) {
          this.alarmConfiguration = value
        }
        
        fun alarmConfiguration(value: IntrinsicFunction) {
          this.alarmConfiguration = value
        }
        
        @JvmField
        var applicationName: Any? = null

        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        @JvmField
        var autoRollbackConfiguration: Any? = null

        fun autoRollbackConfiguration(value: AutoRollbackConfiguration) {
          this.autoRollbackConfiguration = value
        }
        
        fun autoRollbackConfiguration(value: IntrinsicFunction) {
          this.autoRollbackConfiguration = value
        }
        
        @JvmField
        var autoScalingGroups: Any? = null

        fun autoScalingGroups(value: List<String>) {
          this.autoScalingGroups = value
        }
        
        fun autoScalingGroups(vararg value: IntrinsicFunction) {
          this.autoScalingGroups = value
        }
        
        @JvmField
        var deployment: Any? = null

        fun deployment(value: Deployment) {
          this.deployment = value
        }
        
        fun deployment(value: IntrinsicFunction) {
          this.deployment = value
        }
        
        @JvmField
        var deploymentConfigName: Any? = null

        fun deploymentConfigName(value: String) {
          this.deploymentConfigName = value
        }
        
        fun deploymentConfigName(value: IntrinsicFunction) {
          this.deploymentConfigName = value
        }
        
        @JvmField
        var deploymentGroupName: Any? = null

        fun deploymentGroupName(value: String) {
          this.deploymentGroupName = value
        }
        
        fun deploymentGroupName(value: IntrinsicFunction) {
          this.deploymentGroupName = value
        }
        
        @JvmField
        var deploymentStyle: Any? = null

        fun deploymentStyle(value: DeploymentStyle) {
          this.deploymentStyle = value
        }
        
        fun deploymentStyle(value: IntrinsicFunction) {
          this.deploymentStyle = value
        }
        
        @JvmField
        var ec2TagFilters: Any? = null

        fun ec2TagFilters(value: List<EC2TagFilter>) {
          this.ec2TagFilters = value
        }
        
        fun ec2TagFilters(vararg value: IntrinsicFunction) {
          this.ec2TagFilters = value
        }
        
        @JvmField
        var loadBalancerInfo: Any? = null

        fun loadBalancerInfo(value: LoadBalancerInfo) {
          this.loadBalancerInfo = value
        }
        
        fun loadBalancerInfo(value: IntrinsicFunction) {
          this.loadBalancerInfo = value
        }
        
        @JvmField
        var onPremisesInstanceTagFilters: Any? = null

        fun onPremisesInstanceTagFilters(value: List<TagFilter>) {
          this.onPremisesInstanceTagFilters = value
        }
        
        fun onPremisesInstanceTagFilters(vararg value: IntrinsicFunction) {
          this.onPremisesInstanceTagFilters = value
        }
        
        @JvmField
        var serviceRoleArn: Any? = null

        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        
        fun serviceRoleArn(value: IntrinsicFunction) {
          this.serviceRoleArn = value
        }
        
        @JvmField
        var triggerConfigurations: Any? = null

        fun triggerConfigurations(value: List<TriggerConfig>) {
          this.triggerConfigurations = value
        }
        
        fun triggerConfigurations(vararg value: IntrinsicFunction) {
          this.triggerConfigurations = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Alarm(
            val name: String? = null
    )

    class AlarmConfiguration(
            val alarms: List<Alarm>? = null,
            val enabled: Boolean? = null,
            val ignorePollAlarmFailure: Boolean? = null
    )

    class AutoRollbackConfiguration(
            val enabled: Boolean? = null,
            val events: List<String>? = null
    )

    class Deployment(
            val description: String? = null,
            val ignoreApplicationStopFailures: Boolean? = null,
            val revision: RevisionLocation
    )

    class DeploymentStyle(
            val deploymentOption: String? = null,
            val deploymentType: String? = null
    )

    class EC2TagFilter(
            val key: String? = null,
            val type: String? = null,
            val value: String? = null
    )

    class ELBInfo(
            val name: String? = null
    )

    class GitHubLocation(
            val commitId: String,
            val repository: String
    )

    class LoadBalancerInfo(
            val elbInfoList: List<ELBInfo>? = null,
            val targetGroupInfoList: List<TargetGroupInfo>? = null
    )

    class RevisionLocation(
            val gitHubLocation: GitHubLocation? = null,
            val revisionType: String? = null,
            val s3Location: S3Location? = null
    )

    class S3Location(
            val bucket: String,
            val bundleType: String? = null,
            val eTag: String? = null,
            val key: String,
            val version: String? = null
    )

    class TagFilter(
            val key: String? = null,
            val type: String? = null,
            val value: String? = null
    )

    class TargetGroupInfo(
            val name: String? = null
    )

    class TriggerConfig(
            val triggerEvents: List<String>? = null,
            val triggerName: String? = null,
            val triggerTargetArn: String? = null
    )

}

fun Resources.awsCodeDeployDeploymentGroup(logicalId: String, init: AWSCodeDeployDeploymentGroup.() -> Unit = {}): AWSCodeDeployDeploymentGroup {
    return AWSCodeDeployDeploymentGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
