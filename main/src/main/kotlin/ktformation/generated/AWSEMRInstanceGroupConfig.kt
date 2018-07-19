
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

        /**
        * [AutoScalingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html)
        */
        fun autoScalingPolicy(init: AutoScalingPolicy.() -> Unit = {}): AutoScalingPolicy {
            return AutoScalingPolicy().also {
                it.init()
            }
        }
        /**
        * [CloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html)
        */
        fun cloudWatchAlarmDefinition(init: CloudWatchAlarmDefinition.() -> Unit = {}): CloudWatchAlarmDefinition {
            return CloudWatchAlarmDefinition().also {
                it.init()
            }
        }
        /**
        * [Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html)
        */
        fun configuration(init: Configuration.() -> Unit = {}): Configuration {
            return Configuration().also {
                it.init()
            }
        }
        /**
        * [EbsBlockDeviceConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html)
        */
        fun ebsBlockDeviceConfig(init: EbsBlockDeviceConfig.() -> Unit = {}): EbsBlockDeviceConfig {
            return EbsBlockDeviceConfig().also {
                it.init()
            }
        }
        /**
        * [EbsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html)
        */
        fun ebsConfiguration(init: EbsConfiguration.() -> Unit = {}): EbsConfiguration {
            return EbsConfiguration().also {
                it.init()
            }
        }
        /**
        * [MetricDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html)
        */
        fun metricDimension(init: MetricDimension.() -> Unit = {}): MetricDimension {
            return MetricDimension().also {
                it.init()
            }
        }
        /**
        * [ScalingAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html)
        */
        fun scalingAction(init: ScalingAction.() -> Unit = {}): ScalingAction {
            return ScalingAction().also {
                it.init()
            }
        }
        /**
        * [ScalingConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html)
        */
        fun scalingConstraints(init: ScalingConstraints.() -> Unit = {}): ScalingConstraints {
            return ScalingConstraints().also {
                it.init()
            }
        }
        /**
        * [ScalingRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html)
        */
        fun scalingRule(init: ScalingRule.() -> Unit = {}): ScalingRule {
            return ScalingRule().also {
                it.init()
            }
        }
        /**
        * [ScalingTrigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html)
        */
        fun scalingTrigger(init: ScalingTrigger.() -> Unit = {}): ScalingTrigger {
            return ScalingTrigger().also {
                it.init()
            }
        }
        /**
        * [SimpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html)
        */
        fun simpleScalingPolicyConfiguration(init: SimpleScalingPolicyConfiguration.() -> Unit = {}): SimpleScalingPolicyConfiguration {
            return SimpleScalingPolicyConfiguration().also {
                it.init()
            }
        }
        /**
        * [VolumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html)
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
    class AutoScalingPolicy {
            /**
         * [constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-constraints)
         *
         * _Required_: yes
         *
         * _Type_: ScalingConstraints
         */
        var constraints: Any? = null

        /**
         * [constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-constraints)
         *
         * _Required_: yes
         *
         * _Type_: ScalingConstraints
         */
        fun constraints(value: ScalingConstraints) {
          this.constraints = value
        }
        
        /**
         * [constraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-constraints)
         *
         * _Required_: yes
         *
         * _Type_: ScalingConstraints
         */
        fun constraints(value: IntrinsicFunction) {
          this.constraints = value
        }

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingRule>
         */
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingRule>
         */
        fun rules(value: List<ScalingRule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-autoscalingpolicy.html#cfn-elasticmapreduce-instancegroupconfig-autoscalingpolicy-rules)
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
    class CloudWatchAlarmDefinition {
            /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var comparisonOperator: Any? = null

        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: String) {
          this.comparisonOperator = value
        }
        
        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: IntrinsicFunction) {
          this.comparisonOperator = value
        }

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        var dimensions: Any? = null

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(value: List<MetricDimension>) {
          this.dimensions = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(vararg value: IntrinsicFunction) {
          this.dimensions = value
        }

        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-evaluationperiods)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var evaluationPeriods: Any? = null

        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-evaluationperiods)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun evaluationPeriods(value: Int) {
          this.evaluationPeriods = value
        }
        
        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-evaluationperiods)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun evaluationPeriods(value: IntrinsicFunction) {
          this.evaluationPeriods = value
        }

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-namespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-namespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-namespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var period: Any? = null

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun period(value: Int) {
          this.period = value
        }
        
        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun period(value: IntrinsicFunction) {
          this.period = value
        }

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var statistic: Any? = null

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statistic(value: String) {
          this.statistic = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statistic(value: IntrinsicFunction) {
          this.statistic = value
        }

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var threshold: Any? = null

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: Double) {
          this.threshold = value
        }
        
        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: IntrinsicFunction) {
          this.threshold = value
        }

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-elasticmapreduce-instancegroupconfig-cloudwatchalarmdefinition-unit)
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
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var classification: Any? = null

        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classification(value: String) {
          this.classification = value
        }
        
        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun classification(value: IntrinsicFunction) {
          this.classification = value
        }

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var configurationProperties: Any? = null

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun configurationProperties(value: Map<String, Any>) {
          this.configurationProperties = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        var configurations: Any? = null

        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations)
         *
         * _Required_: no
         *
         * _Type_: List<Configuration>
         */
        fun configurations(value: List<Configuration>) {
          this.configurations = value
        }
        
        /**
         * [configurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations)
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
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        var volumeSpecification: Any? = null

        /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        fun volumeSpecification(value: VolumeSpecification) {
          this.volumeSpecification = value
        }
        
        /**
         * [volumeSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification)
         *
         * _Required_: yes
         *
         * _Type_: VolumeSpecification
         */
        fun volumeSpecification(value: IntrinsicFunction) {
          this.volumeSpecification = value
        }

        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumesPerInstance: Any? = null

        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumesPerInstance(value: Int) {
          this.volumesPerInstance = value
        }
        
        /**
         * [volumesPerInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance)
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
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        var ebsBlockDeviceConfigs: Any? = null

        /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        fun ebsBlockDeviceConfigs(value: List<EbsBlockDeviceConfig>) {
          this.ebsBlockDeviceConfigs = value
        }
        
        /**
         * [ebsBlockDeviceConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<EbsBlockDeviceConfig>
         */
        fun ebsBlockDeviceConfigs(vararg value: IntrinsicFunction) {
          this.ebsBlockDeviceConfigs = value
        }

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized)
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
    class MetricDimension {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-metricdimension.html#cfn-elasticmapreduce-instancegroupconfig-metricdimension-value)
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
    class ScalingAction {
            /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var market: Any? = null

        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: String) {
          this.market = value
        }
        
        /**
         * [market](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun market(value: IntrinsicFunction) {
          this.market = value
        }

        /**
         * [simpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-simplescalingpolicyconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: SimpleScalingPolicyConfiguration
         */
        var simpleScalingPolicyConfiguration: Any? = null

        /**
         * [simpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-simplescalingpolicyconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: SimpleScalingPolicyConfiguration
         */
        fun simpleScalingPolicyConfiguration(value: SimpleScalingPolicyConfiguration) {
          this.simpleScalingPolicyConfiguration = value
        }
        
        /**
         * [simpleScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-simplescalingpolicyconfiguration)
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
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var maxCapacity: Any? = null

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: IntrinsicFunction) {
          this.maxCapacity = value
        }

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var minCapacity: Any? = null

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        
        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingconstraints.html#cfn-elasticmapreduce-instancegroupconfig-scalingconstraints-mincapacity)
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
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-action)
         *
         * _Required_: yes
         *
         * _Type_: ScalingAction
         */
        var action: Any? = null

        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-action)
         *
         * _Required_: yes
         *
         * _Type_: ScalingAction
         */
        fun action(value: ScalingAction) {
          this.action = value
        }
        
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-action)
         *
         * _Required_: yes
         *
         * _Type_: ScalingAction
         */
        fun action(value: IntrinsicFunction) {
          this.action = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-trigger)
         *
         * _Required_: yes
         *
         * _Type_: ScalingTrigger
         */
        var trigger: Any? = null

        /**
         * [trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-trigger)
         *
         * _Required_: yes
         *
         * _Type_: ScalingTrigger
         */
        fun trigger(value: ScalingTrigger) {
          this.trigger = value
        }
        
        /**
         * [trigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingrule.html#cfn-elasticmapreduce-instancegroupconfig-scalingrule-trigger)
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
         * [cloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html#cfn-elasticmapreduce-instancegroupconfig-scalingtrigger-cloudwatchalarmdefinition)
         *
         * _Required_: yes
         *
         * _Type_: CloudWatchAlarmDefinition
         */
        var cloudWatchAlarmDefinition: Any? = null

        /**
         * [cloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html#cfn-elasticmapreduce-instancegroupconfig-scalingtrigger-cloudwatchalarmdefinition)
         *
         * _Required_: yes
         *
         * _Type_: CloudWatchAlarmDefinition
         */
        fun cloudWatchAlarmDefinition(value: CloudWatchAlarmDefinition) {
          this.cloudWatchAlarmDefinition = value
        }
        
        /**
         * [cloudWatchAlarmDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingtrigger.html#cfn-elasticmapreduce-instancegroupconfig-scalingtrigger-cloudwatchalarmdefinition)
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
    class SimpleScalingPolicyConfiguration {
            /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var adjustmentType: Any? = null

        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: String) {
          this.adjustmentType = value
        }
        
        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: IntrinsicFunction) {
          this.adjustmentType = value
        }

        /**
         * [coolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var coolDown: Any? = null

        /**
         * [coolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun coolDown(value: Int) {
          this.coolDown = value
        }
        
        /**
         * [coolDown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun coolDown(value: IntrinsicFunction) {
          this.coolDown = value
        }

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var scalingAdjustment: Any? = null

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: Int) {
          this.scalingAdjustment = value
        }
        
        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration-scalingadjustment)
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
    class VolumeSpecification {
            /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var sizeInGB: Any? = null

        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInGB(value: Int) {
          this.sizeInGB = value
        }
        
        /**
         * [sizeInGB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-sizeingb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInGB(value: IntrinsicFunction) {
          this.sizeInGB = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-volumetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification-volumetype)
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
 * [AWS::EMR::InstanceGroupConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
 */
fun Resources.awsEMRInstanceGroupConfig(logicalId: String, init: AWSEMRInstanceGroupConfig.() -> Unit = {}): AWSEMRInstanceGroupConfig {
    return AWSEMRInstanceGroupConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
