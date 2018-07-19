
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
 */
@CloudFormationMarker
class AWSAutoScalingScalingPolicy(logicalId: String) : Resource<AWSAutoScalingScalingPolicy.Properties>(logicalId, "AWS::AutoScaling::ScalingPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var adjustmentType: Any? = null

        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: String) {
          this.adjustmentType = value
        }
        
        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: IntrinsicFunction) {
          this.adjustmentType = value
        }

        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var autoScalingGroupName: Any? = null

        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: String) {
          this.autoScalingGroupName = value
        }
        
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-autoscalinggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: IntrinsicFunction) {
          this.autoScalingGroupName = value
        }

        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cooldown: Any? = null

        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cooldown(value: String) {
          this.cooldown = value
        }
        
        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-cooldown)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cooldown(value: IntrinsicFunction) {
          this.cooldown = value
        }

        /**
         * [estimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var estimatedInstanceWarmup: Any? = null

        /**
         * [estimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun estimatedInstanceWarmup(value: Int) {
          this.estimatedInstanceWarmup = value
        }
        
        /**
         * [estimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-estimatedinstancewarmup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun estimatedInstanceWarmup(value: IntrinsicFunction) {
          this.estimatedInstanceWarmup = value
        }

        /**
         * [metricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var metricAggregationType: Any? = null

        /**
         * [metricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun metricAggregationType(value: String) {
          this.metricAggregationType = value
        }
        
        /**
         * [metricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-metricaggregationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun metricAggregationType(value: IntrinsicFunction) {
          this.metricAggregationType = value
        }

        /**
         * [minAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var minAdjustmentMagnitude: Any? = null

        /**
         * [minAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minAdjustmentMagnitude(value: Int) {
          this.minAdjustmentMagnitude = value
        }
        
        /**
         * [minAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-minadjustmentmagnitude)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minAdjustmentMagnitude(value: IntrinsicFunction) {
          this.minAdjustmentMagnitude = value
        }

        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var policyType: Any? = null

        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun policyType(value: String) {
          this.policyType = value
        }
        
        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-policytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun policyType(value: IntrinsicFunction) {
          this.policyType = value
        }

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var scalingAdjustment: Any? = null

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: Int) {
          this.scalingAdjustment = value
        }
        
        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-scalingadjustment)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: IntrinsicFunction) {
          this.scalingAdjustment = value
        }

        /**
         * [stepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments)
         *
         * _Required_: no
         *
         * _Type_: List<StepAdjustment>
         */
        @JvmField
        var stepAdjustments: Any? = null

        /**
         * [stepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments)
         *
         * _Required_: no
         *
         * _Type_: List<StepAdjustment>
         */
        fun stepAdjustments(value: List<StepAdjustment>) {
          this.stepAdjustments = value
        }
        
        /**
         * [stepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-as-scalingpolicy-stepadjustments)
         *
         * _Required_: no
         *
         * _Type_: List<StepAdjustment>
         */
        fun stepAdjustments(vararg value: IntrinsicFunction) {
          this.stepAdjustments = value
        }

        /**
         * [targetTrackingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: TargetTrackingConfiguration
         */
        @JvmField
        var targetTrackingConfiguration: Any? = null

        /**
         * [targetTrackingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: TargetTrackingConfiguration
         */
        fun targetTrackingConfiguration(value: TargetTrackingConfiguration) {
          this.targetTrackingConfiguration = value
        }
        
        /**
         * [targetTrackingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: TargetTrackingConfiguration
         */
        fun targetTrackingConfiguration(value: IntrinsicFunction) {
          this.targetTrackingConfiguration = value
        }

        /**
        * [CustomizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html)
        */
        fun customizedMetricSpecification(init: CustomizedMetricSpecification.() -> Unit = {}): CustomizedMetricSpecification {
            return CustomizedMetricSpecification().also {
                it.init()
            }
        }
        /**
        * [MetricDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html)
        */
        fun metricDimension(init: MetricDimension.() -> Unit = {}): MetricDimension {
            return MetricDimension().also {
                it.init()
            }
        }
        /**
        * [PredefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html)
        */
        fun predefinedMetricSpecification(init: PredefinedMetricSpecification.() -> Unit = {}): PredefinedMetricSpecification {
            return PredefinedMetricSpecification().also {
                it.init()
            }
        }
        /**
        * [StepAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html)
        */
        fun stepAdjustment(init: StepAdjustment.() -> Unit = {}): StepAdjustment {
            return StepAdjustment().also {
                it.init()
            }
        }
        /**
        * [TargetTrackingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html)
        */
        fun targetTrackingConfiguration(init: TargetTrackingConfiguration.() -> Unit = {}): TargetTrackingConfiguration {
            return TargetTrackingConfiguration().also {
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
    class CustomizedMetricSpecification {
            /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        var dimensions: Any? = null

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(value: List<MetricDimension>) {
          this.dimensions = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(vararg value: IntrinsicFunction) {
          this.dimensions = value
        }

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var statistic: Any? = null

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statistic(value: String) {
          this.statistic = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statistic(value: IntrinsicFunction) {
          this.statistic = value
        }

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-unit)
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
    class MetricDimension {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-value)
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
    class PredefinedMetricSpecification {
            /**
         * [predefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var predefinedMetricType: Any? = null

        /**
         * [predefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun predefinedMetricType(value: String) {
          this.predefinedMetricType = value
        }
        
        /**
         * [predefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun predefinedMetricType(value: IntrinsicFunction) {
          this.predefinedMetricType = value
        }

        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceLabel: Any? = null

        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceLabel(value: String) {
          this.resourceLabel = value
        }
        
        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceLabel(value: IntrinsicFunction) {
          this.resourceLabel = value
        }

    }

    @CloudFormationMarker
    class StepAdjustment {
            /**
         * [metricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var metricIntervalLowerBound: Any? = null

        /**
         * [metricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalLowerBound(value: Double) {
          this.metricIntervalLowerBound = value
        }
        
        /**
         * [metricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalLowerBound(value: IntrinsicFunction) {
          this.metricIntervalLowerBound = value
        }

        /**
         * [metricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var metricIntervalUpperBound: Any? = null

        /**
         * [metricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalUpperBound(value: Double) {
          this.metricIntervalUpperBound = value
        }
        
        /**
         * [metricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalUpperBound(value: IntrinsicFunction) {
          this.metricIntervalUpperBound = value
        }

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var scalingAdjustment: Any? = null

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: Int) {
          this.scalingAdjustment = value
        }
        
        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment)
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
    class TargetTrackingConfiguration {
            /**
         * [customizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-customizedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedMetricSpecification
         */
        var customizedMetricSpecification: Any? = null

        /**
         * [customizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-customizedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedMetricSpecification
         */
        fun customizedMetricSpecification(value: CustomizedMetricSpecification) {
          this.customizedMetricSpecification = value
        }
        
        /**
         * [customizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-customizedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedMetricSpecification
         */
        fun customizedMetricSpecification(value: IntrinsicFunction) {
          this.customizedMetricSpecification = value
        }

        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var disableScaleIn: Any? = null

        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableScaleIn(value: Boolean) {
          this.disableScaleIn = value
        }
        
        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableScaleIn(value: IntrinsicFunction) {
          this.disableScaleIn = value
        }

        /**
         * [predefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-predefinedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedMetricSpecification
         */
        var predefinedMetricSpecification: Any? = null

        /**
         * [predefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-predefinedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedMetricSpecification
         */
        fun predefinedMetricSpecification(value: PredefinedMetricSpecification) {
          this.predefinedMetricSpecification = value
        }
        
        /**
         * [predefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-predefinedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedMetricSpecification
         */
        fun predefinedMetricSpecification(value: IntrinsicFunction) {
          this.predefinedMetricSpecification = value
        }

        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var targetValue: Any? = null

        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun targetValue(value: Double) {
          this.targetValue = value
        }
        
        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun targetValue(value: IntrinsicFunction) {
          this.targetValue = value
        }

    }

}

/**
 * [AWS::AutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
 */
fun Resources.awsAutoScalingScalingPolicy(logicalId: String, init: AWSAutoScalingScalingPolicy.() -> Unit = {}): AWSAutoScalingScalingPolicy {
    return AWSAutoScalingScalingPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
