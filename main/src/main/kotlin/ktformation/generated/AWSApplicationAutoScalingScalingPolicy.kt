
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

        /**
        * [CustomizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
        */
        fun customizedMetricSpecification(init: CustomizedMetricSpecification.() -> Unit = {}): CustomizedMetricSpecification {
            return CustomizedMetricSpecification().also {
                it.init()
            }
        }
        /**
        * [MetricDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html)
        */
        fun metricDimension(init: MetricDimension.() -> Unit = {}): MetricDimension {
            return MetricDimension().also {
                it.init()
            }
        }
        /**
        * [PredefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html)
        */
        fun predefinedMetricSpecification(init: PredefinedMetricSpecification.() -> Unit = {}): PredefinedMetricSpecification {
            return PredefinedMetricSpecification().also {
                it.init()
            }
        }
        /**
        * [StepAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html)
        */
        fun stepAdjustment(init: StepAdjustment.() -> Unit = {}): StepAdjustment {
            return StepAdjustment().also {
                it.init()
            }
        }
        /**
        * [StepScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html)
        */
        fun stepScalingPolicyConfiguration(init: StepScalingPolicyConfiguration.() -> Unit = {}): StepScalingPolicyConfiguration {
            return StepScalingPolicyConfiguration().also {
                it.init()
            }
        }
        /**
        * [TargetTrackingScalingPolicyConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
        */
        fun targetTrackingScalingPolicyConfiguration(init: TargetTrackingScalingPolicyConfiguration.() -> Unit = {}): TargetTrackingScalingPolicyConfiguration {
            return TargetTrackingScalingPolicyConfiguration().also {
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
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        var dimensions: Any? = null

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(value: List<MetricDimension>) {
          this.dimensions = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(vararg value: IntrinsicFunction) {
          this.dimensions = value
        }

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var statistic: Any? = null

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statistic(value: String) {
          this.statistic = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statistic(value: IntrinsicFunction) {
          this.statistic = value
        }

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-unit)
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
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-value)
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
         * [predefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var predefinedMetricType: Any? = null

        /**
         * [predefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun predefinedMetricType(value: String) {
          this.predefinedMetricType = value
        }
        
        /**
         * [predefinedMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun predefinedMetricType(value: IntrinsicFunction) {
          this.predefinedMetricType = value
        }

        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceLabel: Any? = null

        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceLabel(value: String) {
          this.resourceLabel = value
        }
        
        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
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
         * [metricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervallowerbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var metricIntervalLowerBound: Any? = null

        /**
         * [metricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervallowerbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalLowerBound(value: Double) {
          this.metricIntervalLowerBound = value
        }
        
        /**
         * [metricIntervalLowerBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervallowerbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalLowerBound(value: IntrinsicFunction) {
          this.metricIntervalLowerBound = value
        }

        /**
         * [metricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervalupperbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var metricIntervalUpperBound: Any? = null

        /**
         * [metricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervalupperbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalUpperBound(value: Double) {
          this.metricIntervalUpperBound = value
        }
        
        /**
         * [metricIntervalUpperBound](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-metricintervalupperbound)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun metricIntervalUpperBound(value: IntrinsicFunction) {
          this.metricIntervalUpperBound = value
        }

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var scalingAdjustment: Any? = null

        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-scalingadjustment)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun scalingAdjustment(value: Int) {
          this.scalingAdjustment = value
        }
        
        /**
         * [scalingAdjustment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustment-scalingadjustment)
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
    class StepScalingPolicyConfiguration {
            /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var adjustmentType: Any? = null

        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: String) {
          this.adjustmentType = value
        }
        
        /**
         * [adjustmentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun adjustmentType(value: IntrinsicFunction) {
          this.adjustmentType = value
        }

        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var cooldown: Any? = null

        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cooldown(value: Int) {
          this.cooldown = value
        }
        
        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cooldown(value: IntrinsicFunction) {
          this.cooldown = value
        }

        /**
         * [metricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var metricAggregationType: Any? = null

        /**
         * [metricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun metricAggregationType(value: String) {
          this.metricAggregationType = value
        }
        
        /**
         * [metricAggregationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun metricAggregationType(value: IntrinsicFunction) {
          this.metricAggregationType = value
        }

        /**
         * [minAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var minAdjustmentMagnitude: Any? = null

        /**
         * [minAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minAdjustmentMagnitude(value: Int) {
          this.minAdjustmentMagnitude = value
        }
        
        /**
         * [minAdjustmentMagnitude](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minAdjustmentMagnitude(value: IntrinsicFunction) {
          this.minAdjustmentMagnitude = value
        }

        /**
         * [stepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments)
         *
         * _Required_: no
         *
         * _Type_: List<StepAdjustment>
         */
        var stepAdjustments: Any? = null

        /**
         * [stepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments)
         *
         * _Required_: no
         *
         * _Type_: List<StepAdjustment>
         */
        fun stepAdjustments(value: List<StepAdjustment>) {
          this.stepAdjustments = value
        }
        
        /**
         * [stepAdjustments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments)
         *
         * _Required_: no
         *
         * _Type_: List<StepAdjustment>
         */
        fun stepAdjustments(vararg value: IntrinsicFunction) {
          this.stepAdjustments = value
        }

    }

    @CloudFormationMarker
    class TargetTrackingScalingPolicyConfiguration {
            /**
         * [customizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-customizedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedMetricSpecification
         */
        var customizedMetricSpecification: Any? = null

        /**
         * [customizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-customizedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedMetricSpecification
         */
        fun customizedMetricSpecification(value: CustomizedMetricSpecification) {
          this.customizedMetricSpecification = value
        }
        
        /**
         * [customizedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-customizedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedMetricSpecification
         */
        fun customizedMetricSpecification(value: IntrinsicFunction) {
          this.customizedMetricSpecification = value
        }

        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var disableScaleIn: Any? = null

        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableScaleIn(value: Boolean) {
          this.disableScaleIn = value
        }
        
        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableScaleIn(value: IntrinsicFunction) {
          this.disableScaleIn = value
        }

        /**
         * [predefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-predefinedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedMetricSpecification
         */
        var predefinedMetricSpecification: Any? = null

        /**
         * [predefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-predefinedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedMetricSpecification
         */
        fun predefinedMetricSpecification(value: PredefinedMetricSpecification) {
          this.predefinedMetricSpecification = value
        }
        
        /**
         * [predefinedMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-predefinedmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedMetricSpecification
         */
        fun predefinedMetricSpecification(value: IntrinsicFunction) {
          this.predefinedMetricSpecification = value
        }

        /**
         * [scaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var scaleInCooldown: Any? = null

        /**
         * [scaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleInCooldown(value: Int) {
          this.scaleInCooldown = value
        }
        
        /**
         * [scaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleInCooldown(value: IntrinsicFunction) {
          this.scaleInCooldown = value
        }

        /**
         * [scaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var scaleOutCooldown: Any? = null

        /**
         * [scaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleOutCooldown(value: Int) {
          this.scaleOutCooldown = value
        }
        
        /**
         * [scaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleOutCooldown(value: IntrinsicFunction) {
          this.scaleOutCooldown = value
        }

        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var targetValue: Any? = null

        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun targetValue(value: Double) {
          this.targetValue = value
        }
        
        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue)
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
 * [AWS::ApplicationAutoScaling::ScalingPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 */
fun Resources.awsApplicationAutoScalingScalingPolicy(logicalId: String, init: AWSApplicationAutoScalingScalingPolicy.() -> Unit = {}): AWSApplicationAutoScalingScalingPolicy {
    return AWSApplicationAutoScalingScalingPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
