
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApplicationAutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 */
@CloudFormationMarker
class AWSApplicationAutoScalingScalingPolicy(logicalId: String) : Resource<AWSApplicationAutoScalingScalingPolicy.Properties>(logicalId, "AWS::ApplicationAutoScaling::ScalingPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var policyName: Any? = null
        fun policyName(value: String) { this.policyName = value }
        fun policyName(value: IntrinsicFunction) { this.policyName = value }
        @JvmField var policyType: Any? = null
        fun policyType(value: String) { this.policyType = value }
        fun policyType(value: IntrinsicFunction) { this.policyType = value }
        @JvmField var resourceId: Any? = null
        fun resourceId(value: String) {
            this.resourceId = value
        }
        fun resourceId(value: IntrinsicFunction) { this.resourceId = value }
        @JvmField var scalableDimension: Any? = null
        fun scalableDimension(value: String) {
            this.scalableDimension = value
        }
        fun scalableDimension(value: IntrinsicFunction) { this.scalableDimension = value }
        @JvmField var scalingTargetId: Any? = null
        fun scalingTargetId(value: String) {
            this.scalingTargetId = value
        }
        fun scalingTargetId(value: IntrinsicFunction) { this.scalingTargetId = value }
        @JvmField var serviceNamespace: Any? = null
        fun serviceNamespace(value: String) {
            this.serviceNamespace = value
        }
        fun serviceNamespace(value: IntrinsicFunction) { this.serviceNamespace = value }
        @JvmField var stepScalingPolicyConfiguration: Any? = null
        fun stepScalingPolicyConfiguration(value: StepScalingPolicyConfiguration) {
            this.stepScalingPolicyConfiguration = value
        }
        fun stepScalingPolicyConfiguration(value: IntrinsicFunction) { this.stepScalingPolicyConfiguration = value }
        @JvmField var targetTrackingScalingPolicyConfiguration: Any? = null
        fun targetTrackingScalingPolicyConfiguration(value: TargetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = value
        }
        fun targetTrackingScalingPolicyConfiguration(value: IntrinsicFunction) { this.targetTrackingScalingPolicyConfiguration = value }
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

    class StepScalingPolicyConfiguration(
            val adjustmentType: String? = null,
            val cooldown: Int? = null,
            val metricAggregationType: String? = null,
            val minAdjustmentMagnitude: Int? = null,
            val stepAdjustments: List<StepAdjustment>? = null
    )

    class TargetTrackingScalingPolicyConfiguration(
            val customizedMetricSpecification: CustomizedMetricSpecification? = null,
            val predefinedMetricSpecification: PredefinedMetricSpecification? = null,
            val scaleInCooldown: Int? = null,
            val scaleOutCooldown: Int? = null,
            val targetValue: Double
    )

}

fun Resources.awsApplicationAutoScalingScalingPolicy(logicalId: String, init: AWSApplicationAutoScalingScalingPolicy.() -> Unit = {}): AWSApplicationAutoScalingScalingPolicy {
    return AWSApplicationAutoScalingScalingPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
