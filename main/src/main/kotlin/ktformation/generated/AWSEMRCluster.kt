
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
 */
@CloudFormationMarker
class AWSEMRCluster(logicalId: String) : Resource<AWSEMRCluster.Properties>(logicalId, "AWS::EMR::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var additionalInfo: Any? = null

        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun additionalInfo(value: Json) {
          this.additionalInfo = value
        }
        
        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun additionalInfo(value: IntrinsicFunction) {
          this.additionalInfo = value
        }

        /**
         * [applications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications)
         *
         * _Required_: no
         *
         * _Type_: List<Application>
         */
        @JvmField
        var applications: Any? = null

        /**
         * [applications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications)
         *
         * _Required_: no
         *
         * _Type_: List<Application>
         */
        fun applications(value: List<Application>) {
          this.applications = value
        }
        
        /**
         * [applications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-applications)
         *
         * _Required_: no
         *
         * _Type_: List<Application>
         */
        fun applications(vararg value: IntrinsicFunction) {
          this.applications = value
        }

        /**
         * [autoScalingRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var autoScalingRole: Any? = null

        /**
         * [autoScalingRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoScalingRole(value: String) {
          this.autoScalingRole = value
        }
        
        /**
         * [autoScalingRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-autoscalingrole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoScalingRole(value: IntrinsicFunction) {
          this.autoScalingRole = value
        }

        /**
         * [bootstrapActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions)
         *
         * _Required_: no
         *
         * _Type_: List<BootstrapActionConfig>
         */
        @JvmField
        var bootstrapActions: Any? = null

        /**
         * [bootstrapActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions)
         *
         * _Required_: no
         *
         * _Type_: List<BootstrapActionConfig>
         */
        fun bootstrapActions(value: List<BootstrapActionConfig>) {
          this.bootstrapActions = value
        }
        
        /**
         * [bootstrapActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-bootstrapactions)
         *
         * _Required_: no
         *
         * _Type_: List<BootstrapActionConfig>
         */
        fun bootstrapActions(vararg value: IntrinsicFunction) {
          this.bootstrapActions = value
        }

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        @JvmField
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(vararg value: IntrinsicFunction) {
          this.configurations = value
        }

        /**
         * [customAmiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var customAmiId: Any? = null

        /**
         * [customAmiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customAmiId(value: String) {
          this.customAmiId = value
        }
        
        /**
         * [customAmiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-customamiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customAmiId(value: IntrinsicFunction) {
          this.customAmiId = value
        }

        /**
         * [ebsRootVolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var ebsRootVolumeSize: Any? = null

        /**
         * [ebsRootVolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ebsRootVolumeSize(value: Int) {
          this.ebsRootVolumeSize = value
        }
        
        /**
         * [ebsRootVolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-ebsrootvolumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ebsRootVolumeSize(value: IntrinsicFunction) {
          this.ebsRootVolumeSize = value
        }

        /**
         * [instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-instances)
         *
         * _Required_: yes
         *
         * _Type_: JobFlowInstancesConfig
         */
        @JvmField
        var instances: Any? = null

        /**
         * [instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-instances)
         *
         * _Required_: yes
         *
         * _Type_: JobFlowInstancesConfig
         */
        fun instances(value: JobFlowInstancesConfig) {
          this.instances = value
        }
        
        /**
         * [instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-instances)
         *
         * _Required_: yes
         *
         * _Type_: JobFlowInstancesConfig
         */
        fun instances(value: IntrinsicFunction) {
          this.instances = value
        }

        /**
         * [jobFlowRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var jobFlowRole: Any? = null

        /**
         * [jobFlowRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jobFlowRole(value: String) {
          this.jobFlowRole = value
        }
        
        /**
         * [jobFlowRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-jobflowrole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jobFlowRole(value: IntrinsicFunction) {
          this.jobFlowRole = value
        }

        /**
         * [logUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var logUri: Any? = null

        /**
         * [logUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logUri(value: String) {
          this.logUri = value
        }
        
        /**
         * [logUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-loguri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logUri(value: IntrinsicFunction) {
          this.logUri = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [releaseLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var releaseLabel: Any? = null

        /**
         * [releaseLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun releaseLabel(value: String) {
          this.releaseLabel = value
        }
        
        /**
         * [releaseLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-releaselabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun releaseLabel(value: IntrinsicFunction) {
          this.releaseLabel = value
        }

        /**
         * [scaleDownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scaleDownBehavior: Any? = null

        /**
         * [scaleDownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scaleDownBehavior(value: String) {
          this.scaleDownBehavior = value
        }
        
        /**
         * [scaleDownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-scaledownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scaleDownBehavior(value: IntrinsicFunction) {
          this.scaleDownBehavior = value
        }

        /**
         * [securityConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var securityConfiguration: Any? = null

        /**
         * [securityConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun securityConfiguration(value: String) {
          this.securityConfiguration = value
        }
        
        /**
         * [securityConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-securityconfiguration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun securityConfiguration(value: IntrinsicFunction) {
          this.securityConfiguration = value
        }

        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceRole: Any? = null

        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRole(value: String) {
          this.serviceRole = value
        }
        
        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRole(value: IntrinsicFunction) {
          this.serviceRole = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [visibleToAllUsers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var visibleToAllUsers: Any? = null

        /**
         * [visibleToAllUsers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun visibleToAllUsers(value: Boolean) {
          this.visibleToAllUsers = value
        }
        
        /**
         * [visibleToAllUsers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html#cfn-elasticmapreduce-cluster-visibletoallusers)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun visibleToAllUsers(value: IntrinsicFunction) {
          this.visibleToAllUsers = value
        }

        /**
        * [Application](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html)
        */
        fun application(init: Application.() -> Unit = {}): Application {
            return Application().also {
                it.init()
            }
        }
        /**
        * [AutoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html)
        */
        fun autoScalingPolicy(init: AutoScalingPolicy.() -> Unit = {}): AutoScalingPolicy {
            return AutoScalingPolicy().also {
                it.init()
            }
        }
        /**
        * [BootstrapActionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html)
        */
        fun bootstrapActionConfig(init: BootstrapActionConfig.() -> Unit = {}): BootstrapActionConfig {
            return BootstrapActionConfig().also {
                it.init()
            }
        }
        /**
        * [CloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html)
        */
        fun cloudWatchAlarmDefinition(init: CloudWatchAlarmDefinition.() -> Unit = {}): CloudWatchAlarmDefinition {
            return CloudWatchAlarmDefinition().also {
                it.init()
            }
        }
        /**
        * [Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html)
        */
        fun configuration(init: Configuration.() -> Unit = {}): Configuration {
            return Configuration().also {
                it.init()
            }
        }
        /**
        * [EbsBlockDeviceConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html)
        */
        fun ebsBlockDeviceConfig(init: EbsBlockDeviceConfig.() -> Unit = {}): EbsBlockDeviceConfig {
            return EbsBlockDeviceConfig().also {
                it.init()
            }
        }
        /**
        * [EbsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html)
        */
        fun ebsConfiguration(init: EbsConfiguration.() -> Unit = {}): EbsConfiguration {
            return EbsConfiguration().also {
                it.init()
            }
        }
        /**
        * [InstanceFleetConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html)
        */
        fun instanceFleetConfig(init: InstanceFleetConfig.() -> Unit = {}): InstanceFleetConfig {
            return InstanceFleetConfig().also {
                it.init()
            }
        }
        /**
        * [InstanceFleetProvisioningSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html)
        */
        fun instanceFleetProvisioningSpecifications(init: InstanceFleetProvisioningSpecifications.() -> Unit = {}): InstanceFleetProvisioningSpecifications {
            return InstanceFleetProvisioningSpecifications().also {
                it.init()
            }
        }
        /**
        * [InstanceGroupConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html)
        */
        fun instanceGroupConfig(init: InstanceGroupConfig.() -> Unit = {}): InstanceGroupConfig {
            return InstanceGroupConfig().also {
                it.init()
            }
        }
        /**
        * [InstanceTypeConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html)
        */
        fun instanceTypeConfig(init: InstanceTypeConfig.() -> Unit = {}): InstanceTypeConfig {
            return InstanceTypeConfig().also {
                it.init()
            }
        }
        /**
        * [JobFlowInstancesConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html)
        */
        fun jobFlowInstancesConfig(init: JobFlowInstancesConfig.() -> Unit = {}): JobFlowInstancesConfig {
            return JobFlowInstancesConfig().also {
                it.init()
            }
        }
        /**
        * [MetricDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html)
        */
        fun metricDimension(init: MetricDimension.() -> Unit = {}): MetricDimension {
            return MetricDimension().also {
                it.init()
            }
        }
        /**
        * [PlacementType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html)
        */
        fun placementType(init: PlacementType.() -> Unit = {}): PlacementType {
            return PlacementType().also {
                it.init()
            }
        }
        /**
        * [ScalingAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html)
        */
        fun scalingAction(init: ScalingAction.() -> Unit = {}): ScalingAction {
            return ScalingAction().also {
                it.init()
            }
        }
        /**
        * [ScalingConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html)
        */
        fun scalingConstraints(init: ScalingConstraints.() -> Unit = {}): ScalingConstraints {
            return ScalingConstraints().also {
                it.init()
            }
        }
        /**
        * [ScalingRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html)
        */
        fun scalingRule(init: ScalingRule.() -> Unit = {}): ScalingRule {
            return ScalingRule().also {
                it.init()
            }
        }
        /**
        * [ScalingTrigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html)
        */
        fun scalingTrigger(init: ScalingTrigger.() -> Unit = {}): ScalingTrigger {
            return ScalingTrigger().also {
                it.init()
            }
        }
        /**
        * [ScriptBootstrapActionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html)
        */
        fun scriptBootstrapActionConfig(init: ScriptBootstrapActionConfig.() -> Unit = {}): ScriptBootstrapActionConfig {
            return ScriptBootstrapActionConfig().also {
                it.init()
            }
        }
        /**
        * [SimpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html)
        */
        fun simpleScalingPolicyConfiguration(init: SimpleScalingPolicyConfiguration.() -> Unit = {}): SimpleScalingPolicyConfiguration {
            return SimpleScalingPolicyConfiguration().also {
                it.init()
            }
        }
        /**
        * [SpotProvisioningSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html)
        */
        fun spotProvisioningSpecification(init: SpotProvisioningSpecification.() -> Unit = {}): SpotProvisioningSpecification {
            return SpotProvisioningSpecification().also {
                it.init()
            }
        }
        /**
        * [VolumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html)
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
    class Application {
            /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var additionalInfo: Any? = null

        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun additionalInfo(value: Map<String, Any>) {
          this.additionalInfo = value
        }
        
        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var args: Any? = null

        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun args(value: List<String>) {
          this.args = value
        }
        
        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun args(vararg value: IntrinsicFunction) {
          this.args = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-version)
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
    class AutoScalingPolicy {
            /**
         * [constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-constraints)
         *
         * _Required_: yes
         *
         * _Type_: ScalingConstraints
         */
        var constraints: Any? = null

        /**
         * [constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-constraints)
         *
         * _Required_: yes
         *
         * _Type_: ScalingConstraints
         */
        fun constraints(value: ScalingConstraints) {
          this.constraints = value
        }
        
        /**
         * [constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-constraints)
         *
         * _Required_: yes
         *
         * _Type_: ScalingConstraints
         */
        fun constraints(value: IntrinsicFunction) {
          this.constraints = value
        }

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingRule>
         */
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingRule>
         */
        fun rules(value: List<ScalingRule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingRule>
         */
        fun rules(vararg value: IntrinsicFunction) {
          this.rules = value
        }

    }

    @CloudFormationMarker
    class BootstrapActionConfig {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [scriptBootstrapAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-scriptbootstrapaction)
         *
         * _Required_: yes
         *
         * _Type_: ScriptBootstrapActionConfig
         */
        var scriptBootstrapAction: Any? = null

        /**
         * [scriptBootstrapAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-scriptbootstrapaction)
         *
         * _Required_: yes
         *
         * _Type_: ScriptBootstrapActionConfig
         */
        fun scriptBootstrapAction(value: ScriptBootstrapActionConfig) {
          this.scriptBootstrapAction = value
        }
        
        /**
         * [scriptBootstrapAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-scriptbootstrapaction)
         *
         * _Required_: yes
         *
         * _Type_: ScriptBootstrapActionConfig
         */
        fun scriptBootstrapAction(value: IntrinsicFunction) {
          this.scriptBootstrapAction = value
        }

    }

    @CloudFormationMarker
    class CloudWatchAlarmDefinition {
            /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var comparisonOperator: Any? = null

        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: String) {
          this.comparisonOperator = value
        }
        
        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: IntrinsicFunction) {
          this.comparisonOperator = value
        }

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        var dimensions: Any? = null

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(value: List<MetricDimension>) {
          this.dimensions = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(vararg value: IntrinsicFunction) {
          this.dimensions = value
        }

        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var evaluationPeriods: Any? = null

        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun evaluationPeriods(value: Int) {
          this.evaluationPeriods = value
        }
        
        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun evaluationPeriods(value: IntrinsicFunction) {
          this.evaluationPeriods = value
        }

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var period: Any? = null

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun period(value: Int) {
          this.period = value
        }
        
        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun period(value: IntrinsicFunction) {
          this.period = value
        }

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var statistic: Any? = null

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statistic(value: String) {
          this.statistic = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statistic(value: IntrinsicFunction) {
          this.statistic = value
        }

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var threshold: Any? = null

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: Double) {
          this.threshold = value
        }
        
        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: IntrinsicFunction) {
          this.threshold = value
        }

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: IntrinsicFunction) {
          this.unit = value
        }

    }

    @CloudFormationMarker
    class Configuration {
            /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var classification: Any? = null

        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classification(value: String) {
          this.classification = value
        }
        
        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classification(value: IntrinsicFunction) {
          this.classification = value
        }

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var configurationProperties: Any? = null

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun configurationProperties(value: Map<String, Any>) {
          this.configurationProperties = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations)
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
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        var volumeSpecification: Any? = null

        /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        fun volumeSpecification(value: VolumeSpecification) {
          this.volumeSpecification = value
        }
        
        /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        fun volumeSpecification(value: IntrinsicFunction) {
          this.volumeSpecification = value
        }

        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumesPerInstance: Any? = null

        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumesPerInstance(value: Int) {
          this.volumesPerInstance = value
        }
        
        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance)
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
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        var ebsBlockDeviceConfigs: Any? = null

        /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        fun ebsBlockDeviceConfigs(value: List<EbsBlockDeviceConfig>) {
          this.ebsBlockDeviceConfigs = value
        }
        
        /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        fun ebsBlockDeviceConfigs(vararg value: IntrinsicFunction) {
          this.ebsBlockDeviceConfigs = value
        }

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized)
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
    class InstanceFleetConfig {
            /**
         * [instanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceTypeConfig>
         */
        var instanceTypeConfigs: Any? = null

        /**
         * [instanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceTypeConfig>
         */
        fun instanceTypeConfigs(value: List<InstanceTypeConfig>) {
          this.instanceTypeConfigs = value
        }
        
        /**
         * [instanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceTypeConfig>
         */
        fun instanceTypeConfigs(vararg value: IntrinsicFunction) {
          this.instanceTypeConfigs = value
        }

        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetProvisioningSpecifications
         */
        var launchSpecifications: Any? = null

        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetProvisioningSpecifications
         */
        fun launchSpecifications(value: InstanceFleetProvisioningSpecifications) {
          this.launchSpecifications = value
        }
        
        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetProvisioningSpecifications
         */
        fun launchSpecifications(value: IntrinsicFunction) {
          this.launchSpecifications = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [targetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var targetOnDemandCapacity: Any? = null

        /**
         * [targetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetOnDemandCapacity(value: Int) {
          this.targetOnDemandCapacity = value
        }
        
        /**
         * [targetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetOnDemandCapacity(value: IntrinsicFunction) {
          this.targetOnDemandCapacity = value
        }

        /**
         * [targetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var targetSpotCapacity: Any? = null

        /**
         * [targetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetSpotCapacity(value: Int) {
          this.targetSpotCapacity = value
        }
        
        /**
         * [targetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun targetSpotCapacity(value: IntrinsicFunction) {
          this.targetSpotCapacity = value
        }

    }

    @CloudFormationMarker
    class InstanceFleetProvisioningSpecifications {
            /**
         * [spotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-cluster-instancefleetprovisioningspecifications-spotspecification)
         *
         * _Required_: yes
         *
         * _Type_: SpotProvisioningSpecification
         */
        var spotSpecification: Any? = null

        /**
         * [spotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-cluster-instancefleetprovisioningspecifications-spotspecification)
         *
         * _Required_: yes
         *
         * _Type_: SpotProvisioningSpecification
         */
        fun spotSpecification(value: SpotProvisioningSpecification) {
          this.spotSpecification = value
        }
        
        /**
         * [spotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-cluster-instancefleetprovisioningspecifications-spotspecification)
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
    class InstanceGroupConfig {
            /**
         * [autoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-autoscalingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingPolicy
         */
        var autoScalingPolicy: Any? = null

        /**
         * [autoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-autoscalingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingPolicy
         */
        fun autoScalingPolicy(value: AutoScalingPolicy) {
          this.autoScalingPolicy = value
        }
        
        /**
         * [autoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-autoscalingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingPolicy
         */
        fun autoScalingPolicy(value: IntrinsicFunction) {
          this.autoScalingPolicy = value
        }

        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bidPrice: Any? = null

        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: String) {
          this.bidPrice = value
        }
        
        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: IntrinsicFunction) {
          this.bidPrice = value
        }

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(vararg value: IntrinsicFunction) {
          this.configurations = value
        }

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        var ebsConfiguration: Any? = null

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: EbsConfiguration) {
          this.ebsConfiguration = value
        }
        
        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: IntrinsicFunction) {
          this.ebsConfiguration = value
        }

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var instanceCount: Any? = null

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun instanceCount(value: Int) {
          this.instanceCount = value
        }
        
        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun instanceCount(value: IntrinsicFunction) {
          this.instanceCount = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var market: Any? = null

        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: String) {
          this.market = value
        }
        
        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: IntrinsicFunction) {
          this.market = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name)
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
    class InstanceTypeConfig {
            /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bidPrice: Any? = null

        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: String) {
          this.bidPrice = value
        }
        
        /**
         * [bidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bidPrice(value: IntrinsicFunction) {
          this.bidPrice = value
        }

        /**
         * [bidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var bidPriceAsPercentageOfOnDemandPrice: Any? = null

        /**
         * [bidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun bidPriceAsPercentageOfOnDemandPrice(value: Double) {
          this.bidPriceAsPercentageOfOnDemandPrice = value
        }
        
        /**
         * [bidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun bidPriceAsPercentageOfOnDemandPrice(value: IntrinsicFunction) {
          this.bidPriceAsPercentageOfOnDemandPrice = value
        }

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(vararg value: IntrinsicFunction) {
          this.configurations = value
        }

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        var ebsConfiguration: Any? = null

        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: EbsConfiguration) {
          this.ebsConfiguration = value
        }
        
        /**
         * [ebsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-ebsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EbsConfiguration
         */
        fun ebsConfiguration(value: IntrinsicFunction) {
          this.ebsConfiguration = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var weightedCapacity: Any? = null

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun weightedCapacity(value: Int) {
          this.weightedCapacity = value
        }
        
        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity)
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
    class JobFlowInstancesConfig {
            /**
         * [additionalMasterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var additionalMasterSecurityGroups: Any? = null

        /**
         * [additionalMasterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun additionalMasterSecurityGroups(value: List<String>) {
          this.additionalMasterSecurityGroups = value
        }
        
        /**
         * [additionalMasterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun additionalMasterSecurityGroups(vararg value: IntrinsicFunction) {
          this.additionalMasterSecurityGroups = value
        }

        /**
         * [additionalSlaveSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var additionalSlaveSecurityGroups: Any? = null

        /**
         * [additionalSlaveSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun additionalSlaveSecurityGroups(value: List<String>) {
          this.additionalSlaveSecurityGroups = value
        }
        
        /**
         * [additionalSlaveSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun additionalSlaveSecurityGroups(vararg value: IntrinsicFunction) {
          this.additionalSlaveSecurityGroups = value
        }

        /**
         * [coreInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancefleet)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetConfig
         */
        var coreInstanceFleet: Any? = null

        /**
         * [coreInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancefleet)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetConfig
         */
        fun coreInstanceFleet(value: InstanceFleetConfig) {
          this.coreInstanceFleet = value
        }
        
        /**
         * [coreInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancefleet)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetConfig
         */
        fun coreInstanceFleet(value: IntrinsicFunction) {
          this.coreInstanceFleet = value
        }

        /**
         * [coreInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancegroup)
         *
         * _Required_: no
         *
         * _Type_: InstanceGroupConfig
         */
        var coreInstanceGroup: Any? = null

        /**
         * [coreInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancegroup)
         *
         * _Required_: no
         *
         * _Type_: InstanceGroupConfig
         */
        fun coreInstanceGroup(value: InstanceGroupConfig) {
          this.coreInstanceGroup = value
        }
        
        /**
         * [coreInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancegroup)
         *
         * _Required_: no
         *
         * _Type_: InstanceGroupConfig
         */
        fun coreInstanceGroup(value: IntrinsicFunction) {
          this.coreInstanceGroup = value
        }

        /**
         * [ec2KeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ec2KeyName: Any? = null

        /**
         * [ec2KeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ec2KeyName(value: String) {
          this.ec2KeyName = value
        }
        
        /**
         * [ec2KeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ec2KeyName(value: IntrinsicFunction) {
          this.ec2KeyName = value
        }

        /**
         * [ec2SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ec2SubnetId: Any? = null

        /**
         * [ec2SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ec2SubnetId(value: String) {
          this.ec2SubnetId = value
        }
        
        /**
         * [ec2SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ec2SubnetId(value: IntrinsicFunction) {
          this.ec2SubnetId = value
        }

        /**
         * [emrManagedMasterSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var emrManagedMasterSecurityGroup: Any? = null

        /**
         * [emrManagedMasterSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emrManagedMasterSecurityGroup(value: String) {
          this.emrManagedMasterSecurityGroup = value
        }
        
        /**
         * [emrManagedMasterSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emrManagedMasterSecurityGroup(value: IntrinsicFunction) {
          this.emrManagedMasterSecurityGroup = value
        }

        /**
         * [emrManagedSlaveSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var emrManagedSlaveSecurityGroup: Any? = null

        /**
         * [emrManagedSlaveSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emrManagedSlaveSecurityGroup(value: String) {
          this.emrManagedSlaveSecurityGroup = value
        }
        
        /**
         * [emrManagedSlaveSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emrManagedSlaveSecurityGroup(value: IntrinsicFunction) {
          this.emrManagedSlaveSecurityGroup = value
        }

        /**
         * [hadoopVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var hadoopVersion: Any? = null

        /**
         * [hadoopVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hadoopVersion(value: String) {
          this.hadoopVersion = value
        }
        
        /**
         * [hadoopVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hadoopVersion(value: IntrinsicFunction) {
          this.hadoopVersion = value
        }

        /**
         * [masterInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancefleet)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetConfig
         */
        var masterInstanceFleet: Any? = null

        /**
         * [masterInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancefleet)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetConfig
         */
        fun masterInstanceFleet(value: InstanceFleetConfig) {
          this.masterInstanceFleet = value
        }
        
        /**
         * [masterInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancefleet)
         *
         * _Required_: no
         *
         * _Type_: InstanceFleetConfig
         */
        fun masterInstanceFleet(value: IntrinsicFunction) {
          this.masterInstanceFleet = value
        }

        /**
         * [masterInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancegroup)
         *
         * _Required_: no
         *
         * _Type_: InstanceGroupConfig
         */
        var masterInstanceGroup: Any? = null

        /**
         * [masterInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancegroup)
         *
         * _Required_: no
         *
         * _Type_: InstanceGroupConfig
         */
        fun masterInstanceGroup(value: InstanceGroupConfig) {
          this.masterInstanceGroup = value
        }
        
        /**
         * [masterInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancegroup)
         *
         * _Required_: no
         *
         * _Type_: InstanceGroupConfig
         */
        fun masterInstanceGroup(value: IntrinsicFunction) {
          this.masterInstanceGroup = value
        }

        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-placement)
         *
         * _Required_: no
         *
         * _Type_: PlacementType
         */
        var placement: Any? = null

        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-placement)
         *
         * _Required_: no
         *
         * _Type_: PlacementType
         */
        fun placement(value: PlacementType) {
          this.placement = value
        }
        
        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-placement)
         *
         * _Required_: no
         *
         * _Type_: PlacementType
         */
        fun placement(value: IntrinsicFunction) {
          this.placement = value
        }

        /**
         * [serviceAccessSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serviceAccessSecurityGroup: Any? = null

        /**
         * [serviceAccessSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceAccessSecurityGroup(value: String) {
          this.serviceAccessSecurityGroup = value
        }
        
        /**
         * [serviceAccessSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceAccessSecurityGroup(value: IntrinsicFunction) {
          this.serviceAccessSecurityGroup = value
        }

        /**
         * [terminationProtected](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var terminationProtected: Any? = null

        /**
         * [terminationProtected](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun terminationProtected(value: Boolean) {
          this.terminationProtected = value
        }
        
        /**
         * [terminationProtected](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun terminationProtected(value: IntrinsicFunction) {
          this.terminationProtected = value
        }

    }

    @CloudFormationMarker
    class MetricDimension {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class PlacementType {
            /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

    }

    @CloudFormationMarker
    class ScalingAction {
            /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var market: Any? = null

        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: String) {
          this.market = value
        }
        
        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: IntrinsicFunction) {
          this.market = value
        }

        /**
         * [simpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-simplescalingpolicyconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: SimpleScalingPolicyConfiguration
         */
        var simpleScalingPolicyConfiguration: Any? = null

        /**
         * [simpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-simplescalingpolicyconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: SimpleScalingPolicyConfiguration
         */
        fun simpleScalingPolicyConfiguration(value: SimpleScalingPolicyConfiguration) {
          this.simpleScalingPolicyConfiguration = value
        }
        
        /**
         * [simpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-simplescalingpolicyconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: SimpleScalingPolicyConfiguration
         */
        fun simpleScalingPolicyConfiguration(value: IntrinsicFunction) {
          this.simpleScalingPolicyConfiguration = value
        }

    }

    @CloudFormationMarker
    class ScalingConstraints {
            /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var maxCapacity: Any? = null

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: IntrinsicFunction) {
          this.maxCapacity = value
        }

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var minCapacity: Any? = null

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        
        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: IntrinsicFunction) {
          this.minCapacity = value
        }

    }

    @CloudFormationMarker
    class ScalingRule {
            /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-action)
         *
         * _Required_: yes
         *
         * _Type_: ScalingAction
         */
        var action: Any? = null

        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-action)
         *
         * _Required_: yes
         *
         * _Type_: ScalingAction
         */
        fun action(value: ScalingAction) {
          this.action = value
        }
        
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-action)
         *
         * _Required_: yes
         *
         * _Type_: ScalingAction
         */
        fun action(value: IntrinsicFunction) {
          this.action = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-trigger)
         *
         * _Required_: yes
         *
         * _Type_: ScalingTrigger
         */
        var trigger: Any? = null

        /**
         * [trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-trigger)
         *
         * _Required_: yes
         *
         * _Type_: ScalingTrigger
         */
        fun trigger(value: ScalingTrigger) {
          this.trigger = value
        }
        
        /**
         * [trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-trigger)
         *
         * _Required_: yes
         *
         * _Type_: ScalingTrigger
         */
        fun trigger(value: IntrinsicFunction) {
          this.trigger = value
        }

    }

    @CloudFormationMarker
    class ScalingTrigger {
            /**
         * [cloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html#cfn-elasticmapreduce-cluster-scalingtrigger-cloudwatchalarmdefinition)
         *
         * _Required_: yes
         *
         * _Type_: CloudWatchAlarmDefinition
         */
        var cloudWatchAlarmDefinition: Any? = null

        /**
         * [cloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html#cfn-elasticmapreduce-cluster-scalingtrigger-cloudwatchalarmdefinition)
         *
         * _Required_: yes
         *
         * _Type_: CloudWatchAlarmDefinition
         */
        fun cloudWatchAlarmDefinition(value: CloudWatchAlarmDefinition) {
          this.cloudWatchAlarmDefinition = value
        }
        
        /**
         * [cloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html#cfn-elasticmapreduce-cluster-scalingtrigger-cloudwatchalarmdefinition)
         *
         * _Required_: yes
         *
         * _Type_: CloudWatchAlarmDefinition
         */
        fun cloudWatchAlarmDefinition(value: IntrinsicFunction) {
          this.cloudWatchAlarmDefinition = value
        }

    }

    @CloudFormationMarker
    class ScriptBootstrapActionConfig {
            /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var args: Any? = null

        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun args(value: List<String>) {
          this.args = value
        }
        
        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun args(vararg value: IntrinsicFunction) {
          this.args = value
        }

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }

    }

    @CloudFormationMarker
    class SimpleScalingPolicyConfiguration {
            /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var adjustmentType: Any? = null

        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: String) {
          this.adjustmentType = value
        }
        
        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: IntrinsicFunction) {
          this.adjustmentType = value
        }

        /**
         * [coolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var coolDown: Any? = null

        /**
         * [coolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun coolDown(value: Int) {
          this.coolDown = value
        }
        
        /**
         * [coolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun coolDown(value: IntrinsicFunction) {
          this.coolDown = value
        }

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var scalingAdjustment: Any? = null

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: Int) {
          this.scalingAdjustment = value
        }
        
        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: IntrinsicFunction) {
          this.scalingAdjustment = value
        }

    }

    @CloudFormationMarker
    class SpotProvisioningSpecification {
            /**
         * [blockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var blockDurationMinutes: Any? = null

        /**
         * [blockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun blockDurationMinutes(value: Int) {
          this.blockDurationMinutes = value
        }
        
        /**
         * [blockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun blockDurationMinutes(value: IntrinsicFunction) {
          this.blockDurationMinutes = value
        }

        /**
         * [timeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var timeoutAction: Any? = null

        /**
         * [timeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeoutAction(value: String) {
          this.timeoutAction = value
        }
        
        /**
         * [timeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeoutAction(value: IntrinsicFunction) {
          this.timeoutAction = value
        }

        /**
         * [timeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var timeoutDurationMinutes: Any? = null

        /**
         * [timeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun timeoutDurationMinutes(value: Int) {
          this.timeoutDurationMinutes = value
        }
        
        /**
         * [timeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes)
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
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var sizeInGB: Any? = null

        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInGB(value: Int) {
          this.sizeInGB = value
        }
        
        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInGB(value: IntrinsicFunction) {
          this.sizeInGB = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-volumetype)
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
 * [AWS::EMR::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
 */
fun Resources.awsEMRCluster(logicalId: String, init: AWSEMRCluster.() -> Unit = {}): AWSEMRCluster {
    return AWSEMRCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
