
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Application(
            /**
             * [AdditionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-additionalinfo)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val additionalInfo: Map<String, Any>? = null,
            /**
             * [Args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-args)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val args: List<String>? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-application.html#cfn-elasticmapreduce-cluster-application-version)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val version: String? = null
    )

    class AutoScalingPolicy(
            /**
             * [Constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-constraints)
             *
             * _Required_: yes
             *
             * _Type_: ScalingConstraints
             */
            val constraints: ScalingConstraints,
            /**
             * [Rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-autoscalingpolicy.html#cfn-elasticmapreduce-cluster-autoscalingpolicy-rules)
             *
             * _Required_: yes
             *
             * _Type_: List<ScalingRule>
             */
            val rules: List<ScalingRule>
    )

    class BootstrapActionConfig(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [ScriptBootstrapAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-bootstrapactionconfig.html#cfn-elasticmapreduce-cluster-bootstrapactionconfig-scriptbootstrapaction)
             *
             * _Required_: yes
             *
             * _Type_: ScriptBootstrapActionConfig
             */
            val scriptBootstrapAction: ScriptBootstrapActionConfig
    )

    class CloudWatchAlarmDefinition(
            /**
             * [ComparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-comparisonoperator)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val comparisonOperator: String,
            /**
             * [Dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-dimensions)
             *
             * _Required_: no
             *
             * _Type_: List<MetricDimension>
             */
            val dimensions: List<MetricDimension>? = null,
            /**
             * [EvaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-evaluationperiods)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val evaluationPeriods: Int? = null,
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-namespace)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val namespace: String? = null,
            /**
             * [Period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-period)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val period: Int,
            /**
             * [Statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-statistic)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val statistic: String? = null,
            /**
             * [Threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-threshold)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val threshold: Double,
            /**
             * [Unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-cluster-cloudwatchalarmdefinition-unit)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val unit: String? = null
    )

    class Configuration(
            /**
             * [Classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-classification)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val classification: String? = null,
            /**
             * [ConfigurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurationproperties)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val configurationProperties: Map<String, Any>? = null,
            /**
             * [Configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-configuration.html#cfn-elasticmapreduce-cluster-configuration-configurations)
             *
             * _Required_: no
             *
             * _Type_: List<Configuration>
             */
            val configurations: List<Configuration>? = null
    )

    class EbsBlockDeviceConfig(
            /**
             * [VolumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumespecification)
             *
             * _Required_: yes
             *
             * _Type_: VolumeSpecification
             */
            val volumeSpecification: VolumeSpecification,
            /**
             * [VolumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumesPerInstance: Int? = null
    )

    class EbsConfiguration(
            /**
             * [EbsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs)
             *
             * _Required_: no
             *
             * _Type_: List<EbsBlockDeviceConfig>
             */
            val ebsBlockDeviceConfigs: List<EbsBlockDeviceConfig>? = null,
            /**
             * [EbsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ebsOptimized: Boolean? = null
    )

    class InstanceFleetConfig(
            /**
             * [InstanceTypeConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs)
             *
             * _Required_: no
             *
             * _Type_: List<InstanceTypeConfig>
             */
            val instanceTypeConfigs: List<InstanceTypeConfig>? = null,
            /**
             * [LaunchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-launchspecifications)
             *
             * _Required_: no
             *
             * _Type_: InstanceFleetProvisioningSpecifications
             */
            val launchSpecifications: InstanceFleetProvisioningSpecifications? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [TargetOnDemandCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val targetOnDemandCapacity: Int? = null,
            /**
             * [TargetSpotCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val targetSpotCapacity: Int? = null
    )

    class InstanceFleetProvisioningSpecifications(
            /**
             * [SpotSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html#cfn-elasticmapreduce-cluster-instancefleetprovisioningspecifications-spotspecification)
             *
             * _Required_: yes
             *
             * _Type_: SpotProvisioningSpecification
             */
            val spotSpecification: SpotProvisioningSpecification
    )

    class InstanceGroupConfig(
            /**
             * [AutoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-autoscalingpolicy)
             *
             * _Required_: no
             *
             * _Type_: AutoScalingPolicy
             */
            val autoScalingPolicy: AutoScalingPolicy? = null,
            /**
             * [BidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-bidprice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bidPrice: String? = null,
            /**
             * [Configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-configurations)
             *
             * _Required_: no
             *
             * _Type_: List<Configuration>
             */
            val configurations: List<Configuration>? = null,
            /**
             * [EbsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-ebsconfiguration)
             *
             * _Required_: no
             *
             * _Type_: EbsConfiguration
             */
            val ebsConfiguration: EbsConfiguration? = null,
            /**
             * [InstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancecount)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val instanceCount: Int,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-instancetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instanceType: String,
            /**
             * [Market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-market)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val market: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html#cfn-elasticmapreduce-cluster-instancegroupconfig-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class InstanceTypeConfig(
            /**
             * [BidPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidprice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bidPrice: String? = null,
            /**
             * [BidPriceAsPercentageOfOnDemandPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val bidPriceAsPercentageOfOnDemandPrice: Double? = null,
            /**
             * [Configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-configurations)
             *
             * _Required_: no
             *
             * _Type_: List<Configuration>
             */
            val configurations: List<Configuration>? = null,
            /**
             * [EbsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-ebsconfiguration)
             *
             * _Required_: no
             *
             * _Type_: EbsConfiguration
             */
            val ebsConfiguration: EbsConfiguration? = null,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-instancetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instanceType: String,
            /**
             * [WeightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancetypeconfig.html#cfn-elasticmapreduce-cluster-instancetypeconfig-weightedcapacity)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val weightedCapacity: Int? = null
    )

    class JobFlowInstancesConfig(
            /**
             * [AdditionalMasterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val additionalMasterSecurityGroups: List<String>? = null,
            /**
             * [AdditionalSlaveSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val additionalSlaveSecurityGroups: List<String>? = null,
            /**
             * [CoreInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancefleet)
             *
             * _Required_: no
             *
             * _Type_: InstanceFleetConfig
             */
            val coreInstanceFleet: InstanceFleetConfig? = null,
            /**
             * [CoreInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-coreinstancegroup)
             *
             * _Required_: no
             *
             * _Type_: InstanceGroupConfig
             */
            val coreInstanceGroup: InstanceGroupConfig? = null,
            /**
             * [Ec2KeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ec2KeyName: String? = null,
            /**
             * [Ec2SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ec2SubnetId: String? = null,
            /**
             * [EmrManagedMasterSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val emrManagedMasterSecurityGroup: String? = null,
            /**
             * [EmrManagedSlaveSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val emrManagedSlaveSecurityGroup: String? = null,
            /**
             * [HadoopVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hadoopVersion: String? = null,
            /**
             * [MasterInstanceFleet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancefleet)
             *
             * _Required_: no
             *
             * _Type_: InstanceFleetConfig
             */
            val masterInstanceFleet: InstanceFleetConfig? = null,
            /**
             * [MasterInstanceGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-masterinstancegroup)
             *
             * _Required_: no
             *
             * _Type_: InstanceGroupConfig
             */
            val masterInstanceGroup: InstanceGroupConfig? = null,
            /**
             * [Placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-placement)
             *
             * _Required_: no
             *
             * _Type_: PlacementType
             */
            val placement: PlacementType? = null,
            /**
             * [ServiceAccessSecurityGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serviceAccessSecurityGroup: String? = null,
            /**
             * [TerminationProtected](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val terminationProtected: Boolean? = null
    )

    class MetricDimension(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-metricdimension.html#cfn-elasticmapreduce-cluster-metricdimension-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class PlacementType(
            /**
             * [AvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html#cfn-elasticmapreduce-cluster-placementtype-availabilityzone)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val availabilityZone: String
    )

    class ScalingAction(
            /**
             * [Market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val market: String? = null,
            /**
             * [SimpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-simplescalingpolicyconfiguration)
             *
             * _Required_: yes
             *
             * _Type_: SimpleScalingPolicyConfiguration
             */
            val simpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
    )

    class ScalingConstraints(
            /**
             * [MaxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-maxcapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val maxCapacity: Int,
            /**
             * [MinCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingconstraints.html#cfn-elasticmapreduce-cluster-scalingconstraints-mincapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val minCapacity: Int
    )

    class ScalingRule(
            /**
             * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-action)
             *
             * _Required_: yes
             *
             * _Type_: ScalingAction
             */
            val action: ScalingAction,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html#cfn-elasticmapreduce-cluster-scalingrule-trigger)
             *
             * _Required_: yes
             *
             * _Type_: ScalingTrigger
             */
            val trigger: ScalingTrigger
    )

    class ScalingTrigger(
            /**
             * [CloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingtrigger.html#cfn-elasticmapreduce-cluster-scalingtrigger-cloudwatchalarmdefinition)
             *
             * _Required_: yes
             *
             * _Type_: CloudWatchAlarmDefinition
             */
            val cloudWatchAlarmDefinition: CloudWatchAlarmDefinition
    )

    class ScriptBootstrapActionConfig(
            /**
             * [Args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-args)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val args: List<String>? = null,
            /**
             * [Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scriptbootstrapactionconfig.html#cfn-elasticmapreduce-cluster-scriptbootstrapactionconfig-path)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val path: String
    )

    class SimpleScalingPolicyConfiguration(
            /**
             * [AdjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val adjustmentType: String? = null,
            /**
             * [CoolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val coolDown: Int? = null,
            /**
             * [ScalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val scalingAdjustment: Int
    )

    class SpotProvisioningSpecification(
            /**
             * [BlockDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-blockdurationminutes)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val blockDurationMinutes: Int? = null,
            /**
             * [TimeoutAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutaction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val timeoutAction: String,
            /**
             * [TimeoutDurationMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html#cfn-elasticmapreduce-cluster-spotprovisioningspecification-timeoutdurationminutes)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val timeoutDurationMinutes: Int
    )

    class VolumeSpecification(
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-sizeingb)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val sizeInGB: Int,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html#cfn-elasticmapreduce-cluster-volumespecification-volumetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val volumeType: String
    )

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
