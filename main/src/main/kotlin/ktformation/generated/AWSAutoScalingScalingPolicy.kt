
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
 */
@CloudFormationMarker
class AWSAutoScalingScalingPolicy(logicalId: String) : Resource<AWSAutoScalingScalingPolicy.Properties>(logicalId, "AWS::AutoScaling::ScalingPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var adjustmentType: Any? = null

        fun adjustmentType(value: String) {
          this.adjustmentType = value
        }
        
        fun adjustmentType(value: IntrinsicFunction) {
          this.adjustmentType = value
        }
        
        @JvmField
        var autoScalingGroupName: Any? = null

        fun autoScalingGroupName(value: String) {
          this.autoScalingGroupName = value
        }
        
        fun autoScalingGroupName(value: IntrinsicFunction) {
          this.autoScalingGroupName = value
        }
        
        @JvmField
        var cooldown: Any? = null

        fun cooldown(value: String) {
          this.cooldown = value
        }
        
        fun cooldown(value: IntrinsicFunction) {
          this.cooldown = value
        }
        
        @JvmField
        var estimatedInstanceWarmup: Any? = null

        fun estimatedInstanceWarmup(value: Int) {
          this.estimatedInstanceWarmup = value
        }
        
        fun estimatedInstanceWarmup(value: IntrinsicFunction) {
          this.estimatedInstanceWarmup = value
        }
        
        @JvmField
        var metricAggregationType: Any? = null

        fun metricAggregationType(value: String) {
          this.metricAggregationType = value
        }
        
        fun metricAggregationType(value: IntrinsicFunction) {
          this.metricAggregationType = value
        }
        
        @JvmField
        var minAdjustmentMagnitude: Any? = null

        fun minAdjustmentMagnitude(value: Int) {
          this.minAdjustmentMagnitude = value
        }
        
        fun minAdjustmentMagnitude(value: IntrinsicFunction) {
          this.minAdjustmentMagnitude = value
        }
        
        @JvmField
        var policyType: Any? = null

        fun policyType(value: String) {
          this.policyType = value
        }
        
        fun policyType(value: IntrinsicFunction) {
          this.policyType = value
        }
        
        @JvmField
        var scalingAdjustment: Any? = null

        fun scalingAdjustment(value: Int) {
          this.scalingAdjustment = value
        }
        
        fun scalingAdjustment(value: IntrinsicFunction) {
          this.scalingAdjustment = value
        }
        
        @JvmField
        var stepAdjustments: Any? = null

        fun stepAdjustments(value: List<StepAdjustment>) {
          this.stepAdjustments = value
        }
        
        fun stepAdjustments(vararg value: IntrinsicFunction) {
          this.stepAdjustments = value
        }
        
        @JvmField
        var targetTrackingConfiguration: Any? = null

        fun targetTrackingConfiguration(value: TargetTrackingConfiguration) {
          this.targetTrackingConfiguration = value
        }
        
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
            val dimensions: List<MetricDimension>? = null,
            val metricName: String,
            val namespace: String,
            val statistic: String,
            val unit: String? = null
    )

    class MetricDimension(
            val name: String,
            val value: String
    )

    class PredefinedMetricSpecification(
            val predefinedMetricType: String,
            val resourceLabel: String? = null
    )

    class StepAdjustment(
            val metricIntervalLowerBound: Double? = null,
            val metricIntervalUpperBound: Double? = null,
            val scalingAdjustment: Int
    )

    class TargetTrackingConfiguration(
            val customizedMetricSpecification: CustomizedMetricSpecification? = null,
            val disableScaleIn: Boolean? = null,
            val predefinedMetricSpecification: PredefinedMetricSpecification? = null,
            val targetValue: Double
    )

}

fun Resources.awsAutoScalingScalingPolicy(logicalId: String, init: AWSAutoScalingScalingPolicy.() -> Unit = {}): AWSAutoScalingScalingPolicy {
    return AWSAutoScalingScalingPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
