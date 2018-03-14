
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApplicationAutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 */
@CloudFormationMarker
class AWSApplicationAutoScalingScalingPolicy(logicalId: String) : Resource<AWSApplicationAutoScalingScalingPolicy.Properties>(logicalId, "AWS::ApplicationAutoScaling::ScalingPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }
        
        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var policyType: Any? = null

        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyType(value: String) {
          this.policyType = value
        }
        
        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyType(value: IntrinsicFunction) {
          this.policyType = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var resourceId: Any? = null

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceId(value: String) {
          this.resourceId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceId(value: IntrinsicFunction) {
          this.resourceId = value
        }
        
        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scalableDimension: Any? = null

        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scalableDimension(value: String) {
          this.scalableDimension = value
        }
        
        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scalableDimension(value: IntrinsicFunction) {
          this.scalableDimension = value
        }
        
        /**
         * [scalingTargetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scalingTargetId: Any? = null

        /**
         * [scalingTargetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scalingTargetId(value: String) {
          this.scalingTargetId = value
        }
        
        /**
         * [scalingTargetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scalingTargetId(value: IntrinsicFunction) {
          this.scalingTargetId = value
        }
        
        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serviceNamespace: Any? = null

        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceNamespace(value: String) {
          this.serviceNamespace = value
        }
        
        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceNamespace(value: IntrinsicFunction) {
          this.serviceNamespace = value
        }
        
        /**
         * [stepScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
         *
         * _Required_: no
         *
         * _Type_: StepScalingPolicyConfiguration
         */
        @JvmField
        var stepScalingPolicyConfiguration: Any? = null

        /**
         * [stepScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
         *
         * _Required_: no
         *
         * _Type_: StepScalingPolicyConfiguration
         */
        fun stepScalingPolicyConfiguration(value: StepScalingPolicyConfiguration) {
          this.stepScalingPolicyConfiguration = value
        }
        
        /**
         * [stepScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
         *
         * _Required_: no
         *
         * _Type_: StepScalingPolicyConfiguration
         */
        fun stepScalingPolicyConfiguration(value: IntrinsicFunction) {
          this.stepScalingPolicyConfiguration = value
        }
        
        /**
         * [targetTrackingScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
         *
         * _Required_: no
         *
         * _Type_: TargetTrackingScalingPolicyConfiguration
         */
        @JvmField
        var targetTrackingScalingPolicyConfiguration: Any? = null

        /**
         * [targetTrackingScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
         *
         * _Required_: no
         *
         * _Type_: TargetTrackingScalingPolicyConfiguration
         */
        fun targetTrackingScalingPolicyConfiguration(value: TargetTrackingScalingPolicyConfiguration) {
          this.targetTrackingScalingPolicyConfiguration = value
        }
        
        /**
         * [targetTrackingScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
         *
         * _Required_: no
         *
         * _Type_: TargetTrackingScalingPolicyConfiguration
         */
        fun targetTrackingScalingPolicyConfiguration(value: IntrinsicFunction) {
          this.targetTrackingScalingPolicyConfiguration = value
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
             * [Dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-dimensions)
             *
             * _Required_: no
             *
             * _Type_: List<MetricDimension>
             */
            val dimensions: List<MetricDimension>? = null,
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-namespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namespace: String,
            /**
             * [Statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-statistic)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val statistic: String,
            /**
             * [Unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-unit)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val unit: String? = null
    )

    class MetricDimension(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class PredefinedMetricSpecification(
            /**
             * [PredefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val predefinedMetricType: String,
            /**
             * [ResourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceLabel: String? = null
    )

    class StepAdjustment(
            /**
             * [MetricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervallowerbound)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val metricIntervalLowerBound: Double? = null,
            /**
             * [MetricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervalupperbound)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val metricIntervalUpperBound: Double? = null,
            /**
             * [ScalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-scalingadjustment)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val scalingAdjustment: Int
    )

    class StepScalingPolicyConfiguration(
            /**
             * [AdjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val adjustmentType: String? = null,
            /**
             * [Cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val cooldown: Int? = null,
            /**
             * [MetricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val metricAggregationType: String? = null,
            /**
             * [MinAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val minAdjustmentMagnitude: Int? = null,
            /**
             * [StepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments)
             *
             * _Required_: no
             *
             * _Type_: List<StepAdjustment>
             */
            val stepAdjustments: List<StepAdjustment>? = null
    )

    class TargetTrackingScalingPolicyConfiguration(
            /**
             * [CustomizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-customizedmetricspecification)
             *
             * _Required_: no
             *
             * _Type_: CustomizedMetricSpecification
             */
            val customizedMetricSpecification: CustomizedMetricSpecification? = null,
            /**
             * [DisableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val disableScaleIn: Boolean? = null,
            /**
             * [PredefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-predefinedmetricspecification)
             *
             * _Required_: no
             *
             * _Type_: PredefinedMetricSpecification
             */
            val predefinedMetricSpecification: PredefinedMetricSpecification? = null,
            /**
             * [ScaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val scaleInCooldown: Int? = null,
            /**
             * [ScaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val scaleOutCooldown: Int? = null,
            /**
             * [TargetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val targetValue: Double
    )

}

/**
 * [AWS::ApplicationAutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 */
fun Resources.awsApplicationAutoScalingScalingPolicy(logicalId: String, init: AWSApplicationAutoScalingScalingPolicy.() -> Unit = {}): AWSApplicationAutoScalingScalingPolicy {
    return AWSApplicationAutoScalingScalingPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
