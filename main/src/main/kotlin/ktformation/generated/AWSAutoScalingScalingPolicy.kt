
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CustomizedMetricSpecification(
            /**
             * [Dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-dimensions)
             *
             * _Required_: no
             *
             * _Type_: List<MetricDimension>
             */
            val dimensions: List<MetricDimension>? = null,
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-namespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namespace: String,
            /**
             * [Statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-statistic)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val statistic: String,
            /**
             * [Unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-unit)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val unit: String? = null
    )

    class MetricDimension(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class PredefinedMetricSpecification(
            /**
             * [PredefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val predefinedMetricType: String,
            /**
             * [ResourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceLabel: String? = null
    )

    class StepAdjustment(
            /**
             * [MetricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val metricIntervalLowerBound: Double? = null,
            /**
             * [MetricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val metricIntervalUpperBound: Double? = null,
            /**
             * [ScalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustments.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val scalingAdjustment: Int
    )

    class TargetTrackingConfiguration(
            /**
             * [CustomizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-customizedmetricspecification)
             *
             * _Required_: no
             *
             * _Type_: CustomizedMetricSpecification
             */
            val customizedMetricSpecification: CustomizedMetricSpecification? = null,
            /**
             * [DisableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val disableScaleIn: Boolean? = null,
            /**
             * [PredefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-predefinedmetricspecification)
             *
             * _Required_: no
             *
             * _Type_: PredefinedMetricSpecification
             */
            val predefinedMetricSpecification: PredefinedMetricSpecification? = null,
            /**
             * [TargetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val targetValue: Double
    )

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
