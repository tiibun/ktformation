
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Alarm(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html#cfn-codedeploy-deploymentgroup-alarm-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class AlarmConfiguration(
            /**
             * [Alarms](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms)
             *
             * _Required_: no
             *
             * _Type_: List<Alarm>
             */
            val alarms: List<Alarm>? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [IgnorePollAlarmFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ignorePollAlarmFailure: Boolean? = null
    )

    class AutoRollbackConfiguration(
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [Events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration-events)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val events: List<String>? = null
    )

    class Deployment(
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [IgnoreApplicationStopFailures](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ignoreApplicationStopFailures: Boolean? = null,
            /**
             * [Revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision)
             *
             * _Required_: yes
             *
             * _Type_: RevisionLocation
             */
            val revision: RevisionLocation
    )

    class DeploymentStyle(
            /**
             * [DeploymentOption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymentoption)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val deploymentOption: String? = null,
            /**
             * [DeploymentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html#cfn-codedeploy-deploymentgroup-deploymentstyle-deploymenttype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val deploymentType: String? = null
    )

    class EC2TagFilter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html#cfn-properties-codedeploy-deploymentgroup-ec2tagfilters-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class ELBInfo(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-elbinfo.html#cfn-codedeploy-deploymentgroup-elbinfo-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class GitHubLocation(
            /**
             * [CommitId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val commitId: String,
            /**
             * [Repository](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val repository: String
    )

    class LoadBalancerInfo(
            /**
             * [ElbInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-elbinfolist)
             *
             * _Required_: no
             *
             * _Type_: List<ELBInfo>
             */
            val elbInfoList: List<ELBInfo>? = null,
            /**
             * [TargetGroupInfoList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo-targetgroupinfolist)
             *
             * _Required_: no
             *
             * _Type_: List<TargetGroupInfo>
             */
            val targetGroupInfoList: List<TargetGroupInfo>? = null
    )

    class RevisionLocation(
            /**
             * [GitHubLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation)
             *
             * _Required_: no
             *
             * _Type_: GitHubLocation
             */
            val gitHubLocation: GitHubLocation? = null,
            /**
             * [RevisionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val revisionType: String? = null,
            /**
             * [S3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location)
             *
             * _Required_: no
             *
             * _Type_: S3Location
             */
            val s3Location: S3Location? = null
    )

    class S3Location(
            /**
             * [Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [BundleType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bundleType: String? = null,
            /**
             * [ETag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val eTag: String? = null,
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val version: String? = null
    )

    class TagFilter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html#cfn-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class TargetGroupInfo(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html#cfn-codedeploy-deploymentgroup-targetgroupinfo-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class TriggerConfig(
            /**
             * [TriggerEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggerevents)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val triggerEvents: List<String>? = null,
            /**
             * [TriggerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggername)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val triggerName: String? = null,
            /**
             * [TriggerTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-triggerconfig.html#cfn-codedeploy-deploymentgroup-triggerconfig-triggertargetarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val triggerTargetArn: String? = null
    )

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
