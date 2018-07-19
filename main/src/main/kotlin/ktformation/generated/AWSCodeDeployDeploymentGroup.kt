
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeDeploy::DeploymentGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 */
@CloudFormationMarker
class AWSCodeDeployDeploymentGroup(logicalId: String) : Resource<AWSCodeDeployDeploymentGroup.Properties>(logicalId, "AWS::CodeDeploy::DeploymentGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [alarmConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AlarmConfiguration
         */
        @JvmField
        var alarmConfiguration: Any? = null

        /**
         * [alarmConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AlarmConfiguration
         */
        fun alarmConfiguration(value: AlarmConfiguration) {
          this.alarmConfiguration = value
        }
        
        /**
         * [alarmConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AlarmConfiguration
         */
        fun alarmConfiguration(value: IntrinsicFunction) {
          this.alarmConfiguration = value
        }

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }

        /**
         * [autoRollbackConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AutoRollbackConfiguration
         */
        @JvmField
        var autoRollbackConfiguration: Any? = null

        /**
         * [autoRollbackConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AutoRollbackConfiguration
         */
        fun autoRollbackConfiguration(value: AutoRollbackConfiguration) {
          this.autoRollbackConfiguration = value
        }
        
        /**
         * [autoRollbackConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AutoRollbackConfiguration
         */
        fun autoRollbackConfiguration(value: IntrinsicFunction) {
          this.autoRollbackConfiguration = value
        }

        /**
         * [autoScalingGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var autoScalingGroups: Any? = null

        /**
         * [autoScalingGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun autoScalingGroups(value: List<String>) {
          this.autoScalingGroups = value
        }
        
        /**
         * [autoScalingGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun autoScalingGroups(vararg value: IntrinsicFunction) {
          this.autoScalingGroups = value
        }

        /**
         * [deployment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
         *
         * _Required_: no
         *
         * _Type_: Deployment
         */
        @JvmField
        var deployment: Any? = null

        /**
         * [deployment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
         *
         * _Required_: no
         *
         * _Type_: Deployment
         */
        fun deployment(value: Deployment) {
          this.deployment = value
        }
        
        /**
         * [deployment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
         *
         * _Required_: no
         *
         * _Type_: Deployment
         */
        fun deployment(value: IntrinsicFunction) {
          this.deployment = value
        }

        /**
         * [deploymentConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var deploymentConfigName: Any? = null

        /**
         * [deploymentConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentConfigName(value: String) {
          this.deploymentConfigName = value
        }
        
        /**
         * [deploymentConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentConfigName(value: IntrinsicFunction) {
          this.deploymentConfigName = value
        }

        /**
         * [deploymentGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var deploymentGroupName: Any? = null

        /**
         * [deploymentGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentGroupName(value: String) {
          this.deploymentGroupName = value
        }
        
        /**
         * [deploymentGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentGroupName(value: IntrinsicFunction) {
          this.deploymentGroupName = value
        }

        /**
         * [deploymentStyle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
         *
         * _Required_: no
         *
         * _Type_: DeploymentStyle
         */
        @JvmField
        var deploymentStyle: Any? = null

        /**
         * [deploymentStyle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
         *
         * _Required_: no
         *
         * _Type_: DeploymentStyle
         */
        fun deploymentStyle(value: DeploymentStyle) {
          this.deploymentStyle = value
        }
        
        /**
         * [deploymentStyle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
         *
         * _Required_: no
         *
         * _Type_: DeploymentStyle
         */
        fun deploymentStyle(value: IntrinsicFunction) {
          this.deploymentStyle = value
        }

        /**
         * [ec2TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<EC2TagFilter>
         */
        @JvmField
        var ec2TagFilters: Any? = null

        /**
         * [ec2TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<EC2TagFilter>
         */
        fun ec2TagFilters(value: List<EC2TagFilter>) {
          this.ec2TagFilters = value
        }
        
        /**
         * [ec2TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<EC2TagFilter>
         */
        fun ec2TagFilters(vararg value: IntrinsicFunction) {
          this.ec2TagFilters = value
        }

        /**
         * [loadBalancerInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
         *
         * _Required_: no
         *
         * _Type_: LoadBalancerInfo
         */
        @JvmField
        var loadBalancerInfo: Any? = null

        /**
         * [loadBalancerInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
         *
         * _Required_: no
         *
         * _Type_: LoadBalancerInfo
         */
        fun loadBalancerInfo(value: LoadBalancerInfo) {
          this.loadBalancerInfo = value
        }
        
        /**
         * [loadBalancerInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
         *
         * _Required_: no
         *
         * _Type_: LoadBalancerInfo
         */
        fun loadBalancerInfo(value: IntrinsicFunction) {
          this.loadBalancerInfo = value
        }

        /**
         * [onPremisesInstanceTagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        @JvmField
        var onPremisesInstanceTagFilters: Any? = null

        /**
         * [onPremisesInstanceTagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun onPremisesInstanceTagFilters(value: List<TagFilter>) {
          this.onPremisesInstanceTagFilters = value
        }
        
        /**
         * [onPremisesInstanceTagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun onPremisesInstanceTagFilters(vararg value: IntrinsicFunction) {
          this.onPremisesInstanceTagFilters = value
        }

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceRoleArn: Any? = null

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        
        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: IntrinsicFunction) {
          this.serviceRoleArn = value
        }

        /**
         * [triggerConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<TriggerConfig>
         */
        @JvmField
        var triggerConfigurations: Any? = null

        /**
         * [triggerConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<TriggerConfig>
         */
        fun triggerConfigurations(value: List<TriggerConfig>) {
          this.triggerConfigurations = value
        }
        
        /**
         * [triggerConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<TriggerConfig>
         */
        fun triggerConfigurations(vararg value: IntrinsicFunction) {
          this.triggerConfigurations = value
        }

        /**
        * [Alarm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html)
        */
        fun alarm(init: Alarm.() -> Unit = {}): Alarm {
            return Alarm().also {
                it.init()
            }
        }
        /**
        * [AlarmConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html)
        */
        fun alarmConfiguration(init: AlarmConfiguration.() -> Unit = {}): AlarmConfiguration {
            return AlarmConfiguration().also {
                it.init()
            }
        }
        /**
        * [AutoRollbackConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html)
        */
        fun autoRollbackConfiguration(init: AutoRollbackConfiguration.() -> Unit = {}): AutoRollbackConfiguration {
            return AutoRollbackConfiguration().also {
                it.init()
            }
        }
        /**
        * [Deployment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html)
        */
        fun deployment(init: Deployment.() -> Unit = {}): Deployment {
            return Deployment().also {
                it.init()
            }
        }
        /**
        * [DeploymentStyle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html)
        */
        fun deploymentStyle(init: DeploymentStyle.() -> Unit = {}): DeploymentStyle {
            return DeploymentStyle().also {
                it.init()
            }
        }
        /**
        * [EC2TagFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html)
        */
        fun eC2TagFilter(init: EC2TagFilter.() -> Unit = {}): EC2TagFilter {
            return EC2TagFilter().also {
                it.init()
            }
        }
        /**
        * [ELBInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html)
        */
        fun eLBInfo(init: ELBInfo.() -> Unit = {}): ELBInfo {
            return ELBInfo().also {
                it.init()
            }
        }
        /**
        * [GitHubLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html)
        */
        fun gitHubLocation(init: GitHubLocation.() -> Unit = {}): GitHubLocation {
            return GitHubLocation().also {
                it.init()
            }
        }
        /**
        * [LoadBalancerInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html)
        */
        fun loadBalancerInfo(init: LoadBalancerInfo.() -> Unit = {}): LoadBalancerInfo {
            return LoadBalancerInfo().also {
                it.init()
            }
        }
        /**
        * [RevisionLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html)
        */
        fun revisionLocation(init: RevisionLocation.() -> Unit = {}): RevisionLocation {
            return RevisionLocation().also {
                it.init()
            }
        }
        /**
        * [S3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html)
        */
        fun s3Location(init: S3Location.() -> Unit = {}): S3Location {
            return S3Location().also {
                it.init()
            }
        }
        /**
        * [TagFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html)
        */
        fun tagFilter(init: TagFilter.() -> Unit = {}): TagFilter {
            return TagFilter().also {
                it.init()
            }
        }
        /**
        * [TargetGroupInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html)
        */
        fun targetGroupInfo(init: TargetGroupInfo.() -> Unit = {}): TargetGroupInfo {
            return TargetGroupInfo().also {
                it.init()
            }
        }
        /**
        * [TriggerConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html)
        */
        fun triggerConfig(init: TriggerConfig.() -> Unit = {}): TriggerConfig {
            return TriggerConfig().also {
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
    class Alarm {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html#cfn-codedeploy-deploymentgroup-alarm-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html#cfn-codedeploy-deploymentgroup-alarm-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html#cfn-codedeploy-deploymentgroup-alarm-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class AlarmConfiguration {
            /**
         * [alarms](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms)
         *
         * _Required_: no
         *
         * _Type_: List<Alarm>
         */
        var alarms: Any? = null

        /**
         * [alarms](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms)
         *
         * _Required_: no
         *
         * _Type_: List<Alarm>
         */
        fun alarms(value: List<Alarm>) {
          this.alarms = value
        }
        
        /**
         * [alarms](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms)
         *
         * _Required_: no
         *
         * _Type_: List<Alarm>
         */
        fun alarms(vararg value: IntrinsicFunction) {
          this.alarms = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [ignorePollAlarmFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ignorePollAlarmFailure: Any? = null

        /**
         * [ignorePollAlarmFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ignorePollAlarmFailure(value: Boolean) {
          this.ignorePollAlarmFailure = value
        }
        
        /**
         * [ignorePollAlarmFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ignorePollAlarmFailure(value: IntrinsicFunction) {
          this.ignorePollAlarmFailure = value
        }

    }

    @CloudFormationMarker
    class AutoRollbackConfiguration {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var events: Any? = null

        /**
         * [events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun events(value: List<String>) {
          this.events = value
        }
        
        /**
         * [events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun events(vararg value: IntrinsicFunction) {
          this.events = value
        }

    }

    @CloudFormationMarker
    class Deployment {
            /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [ignoreApplicationStopFailures](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ignoreApplicationStopFailures: Any? = null

        /**
         * [ignoreApplicationStopFailures](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ignoreApplicationStopFailures(value: Boolean) {
          this.ignoreApplicationStopFailures = value
        }
        
        /**
         * [ignoreApplicationStopFailures](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ignoreApplicationStopFailures(value: IntrinsicFunction) {
          this.ignoreApplicationStopFailures = value
        }

        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision)
         *
         * _Required_: yes
         *
         * _Type_: RevisionLocation
         */
        var revision: Any? = null

        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision)
         *
         * _Required_: yes
         *
         * _Type_: RevisionLocation
         */
        fun revision(value: RevisionLocation) {
          this.revision = value
        }
        
        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision)
         *
         * _Required_: yes
         *
         * _Type_: RevisionLocation
         */
        fun revision(value: IntrinsicFunction) {
          this.revision = value
        }

    }

    @CloudFormationMarker
    class DeploymentStyle {
            /**
         * [deploymentOption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deploymentOption: Any? = null

        /**
         * [deploymentOption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentOption(value: String) {
          this.deploymentOption = value
        }
        
        /**
         * [deploymentOption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentOption(value: IntrinsicFunction) {
          this.deploymentOption = value
        }

        /**
         * [deploymentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deploymentType: Any? = null

        /**
         * [deploymentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentType(value: String) {
          this.deploymentType = value
        }
        
        /**
         * [deploymentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentType(value: IntrinsicFunction) {
          this.deploymentType = value
        }

    }

    @CloudFormationMarker
    class EC2TagFilter {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class ELBInfo {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html#cfn-codedeploy-deploymentgroup-elbinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html#cfn-codedeploy-deploymentgroup-elbinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html#cfn-codedeploy-deploymentgroup-elbinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class GitHubLocation {
            /**
         * [commitId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var commitId: Any? = null

        /**
         * [commitId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun commitId(value: String) {
          this.commitId = value
        }
        
        /**
         * [commitId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun commitId(value: IntrinsicFunction) {
          this.commitId = value
        }

        /**
         * [repository](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var repository: Any? = null

        /**
         * [repository](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun repository(value: String) {
          this.repository = value
        }
        
        /**
         * [repository](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun repository(value: IntrinsicFunction) {
          this.repository = value
        }

    }

    @CloudFormationMarker
    class LoadBalancerInfo {
            /**
         * [elbInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist)
         *
         * _Required_: no
         *
         * _Type_: List<ELBInfo>
         */
        var elbInfoList: Any? = null

        /**
         * [elbInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist)
         *
         * _Required_: no
         *
         * _Type_: List<ELBInfo>
         */
        fun elbInfoList(value: List<ELBInfo>) {
          this.elbInfoList = value
        }
        
        /**
         * [elbInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist)
         *
         * _Required_: no
         *
         * _Type_: List<ELBInfo>
         */
        fun elbInfoList(vararg value: IntrinsicFunction) {
          this.elbInfoList = value
        }

        /**
         * [targetGroupInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist)
         *
         * _Required_: no
         *
         * _Type_: List<TargetGroupInfo>
         */
        var targetGroupInfoList: Any? = null

        /**
         * [targetGroupInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist)
         *
         * _Required_: no
         *
         * _Type_: List<TargetGroupInfo>
         */
        fun targetGroupInfoList(value: List<TargetGroupInfo>) {
          this.targetGroupInfoList = value
        }
        
        /**
         * [targetGroupInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist)
         *
         * _Required_: no
         *
         * _Type_: List<TargetGroupInfo>
         */
        fun targetGroupInfoList(vararg value: IntrinsicFunction) {
          this.targetGroupInfoList = value
        }

    }

    @CloudFormationMarker
    class RevisionLocation {
            /**
         * [gitHubLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation)
         *
         * _Required_: no
         *
         * _Type_: GitHubLocation
         */
        var gitHubLocation: Any? = null

        /**
         * [gitHubLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation)
         *
         * _Required_: no
         *
         * _Type_: GitHubLocation
         */
        fun gitHubLocation(value: GitHubLocation) {
          this.gitHubLocation = value
        }
        
        /**
         * [gitHubLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation)
         *
         * _Required_: no
         *
         * _Type_: GitHubLocation
         */
        fun gitHubLocation(value: IntrinsicFunction) {
          this.gitHubLocation = value
        }

        /**
         * [revisionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var revisionType: Any? = null

        /**
         * [revisionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revisionType(value: String) {
          this.revisionType = value
        }
        
        /**
         * [revisionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revisionType(value: IntrinsicFunction) {
          this.revisionType = value
        }

        /**
         * [s3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        var s3Location: Any? = null

        /**
         * [s3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        fun s3Location(value: S3Location) {
          this.s3Location = value
        }
        
        /**
         * [s3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        fun s3Location(value: IntrinsicFunction) {
          this.s3Location = value
        }

    }

    @CloudFormationMarker
    class S3Location {
            /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [bundleType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bundleType: Any? = null

        /**
         * [bundleType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bundleType(value: String) {
          this.bundleType = value
        }
        
        /**
         * [bundleType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bundleType(value: IntrinsicFunction) {
          this.bundleType = value
        }

        /**
         * [eTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var eTag: Any? = null

        /**
         * [eTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eTag(value: String) {
          this.eTag = value
        }
        
        /**
         * [eTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eTag(value: IntrinsicFunction) {
          this.eTag = value
        }

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

    @CloudFormationMarker
    class TagFilter {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class TargetGroupInfo {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html#cfn-codedeploy-deploymentgroup-targetgroupinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html#cfn-codedeploy-deploymentgroup-targetgroupinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html#cfn-codedeploy-deploymentgroup-targetgroupinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class TriggerConfig {
            /**
         * [triggerEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var triggerEvents: Any? = null

        /**
         * [triggerEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun triggerEvents(value: List<String>) {
          this.triggerEvents = value
        }
        
        /**
         * [triggerEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun triggerEvents(vararg value: IntrinsicFunction) {
          this.triggerEvents = value
        }

        /**
         * [triggerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var triggerName: Any? = null

        /**
         * [triggerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun triggerName(value: String) {
          this.triggerName = value
        }
        
        /**
         * [triggerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun triggerName(value: IntrinsicFunction) {
          this.triggerName = value
        }

        /**
         * [triggerTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var triggerTargetArn: Any? = null

        /**
         * [triggerTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun triggerTargetArn(value: String) {
          this.triggerTargetArn = value
        }
        
        /**
         * [triggerTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun triggerTargetArn(value: IntrinsicFunction) {
          this.triggerTargetArn = value
        }

    }

}

/**
 * [AWS::CodeDeploy::DeploymentGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 */
fun Resources.awsCodeDeployDeploymentGroup(logicalId: String, init: AWSCodeDeployDeploymentGroup.() -> Unit = {}): AWSCodeDeployDeploymentGroup {
    return AWSCodeDeployDeploymentGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
