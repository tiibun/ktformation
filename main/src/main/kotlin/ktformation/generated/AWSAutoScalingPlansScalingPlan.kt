
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScalingPlans::ScalingPlan - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
 */
@CloudFormationMarker
class AWSAutoScalingPlansScalingPlan(logicalId: String) : Resource<AWSAutoScalingPlansScalingPlan.Properties>(logicalId, "AWS::AutoScalingPlans::ScalingPlan") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * _Required_: yes
         *
         * _Type_: ApplicationSource
         */
        @JvmField
        var applicationSource: Any? = null

        /**
         * [applicationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * _Required_: yes
         *
         * _Type_: ApplicationSource
         */
        fun applicationSource(value: ApplicationSource) {
          this.applicationSource = value
        }
        
        /**
         * [applicationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
         *
         * _Required_: yes
         *
         * _Type_: ApplicationSource
         */
        fun applicationSource(value: IntrinsicFunction) {
          this.applicationSource = value
        }
        
        /**
         * [scalingInstructions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingInstruction>
         */
        @JvmField
        var scalingInstructions: Any? = null

        /**
         * [scalingInstructions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingInstruction>
         */
        fun scalingInstructions(value: List<ScalingInstruction>) {
          this.scalingInstructions = value
        }
        
        /**
         * [scalingInstructions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
         *
         * _Required_: yes
         *
         * _Type_: List<ScalingInstruction>
         */
        fun scalingInstructions(vararg value: IntrinsicFunction) {
          this.scalingInstructions = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ApplicationSource(
            /**
             * [CloudFormationStackARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cloudFormationStackARN: String? = null,
            /**
             * [TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters)
             *
             * _Required_: no
             *
             * _Type_: List<TagFilter>
             */
            val tagFilters: List<TagFilter>? = null
    )

    class CustomizedScalingMetricSpecification(
            /**
             * [Dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions)
             *
             * _Required_: no
             *
             * _Type_: List<MetricDimension>
             */
            val dimensions: List<MetricDimension>? = null,
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namespace: String,
            /**
             * [Statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val statistic: String,
            /**
             * [Unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val unit: String? = null
    )

    class MetricDimension(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class PredefinedScalingMetricSpecification(
            /**
             * [PredefinedScalingMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val predefinedScalingMetricType: String,
            /**
             * [ResourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceLabel: String? = null
    )

    class ScalingInstruction(
            /**
             * [MaxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val maxCapacity: Int,
            /**
             * [MinCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val minCapacity: Int,
            /**
             * [ResourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceId: String,
            /**
             * [ScalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val scalableDimension: String,
            /**
             * [ServiceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val serviceNamespace: String,
            /**
             * [TargetTrackingConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations)
             *
             * _Required_: yes
             *
             * _Type_: List<TargetTrackingConfiguration>
             */
            val targetTrackingConfigurations: List<TargetTrackingConfiguration>
    )

    class TagFilter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-values)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val values: List<String>? = null
    )

    class TargetTrackingConfiguration(
            /**
             * [CustomizedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-customizedscalingmetricspecification)
             *
             * _Required_: no
             *
             * _Type_: CustomizedScalingMetricSpecification
             */
            val customizedScalingMetricSpecification: CustomizedScalingMetricSpecification? = null,
            /**
             * [DisableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val disableScaleIn: Boolean? = null,
            /**
             * [EstimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val estimatedInstanceWarmup: Int? = null,
            /**
             * [PredefinedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-predefinedscalingmetricspecification)
             *
             * _Required_: no
             *
             * _Type_: PredefinedScalingMetricSpecification
             */
            val predefinedScalingMetricSpecification: PredefinedScalingMetricSpecification? = null,
            /**
             * [ScaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val scaleInCooldown: Int? = null,
            /**
             * [ScaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val scaleOutCooldown: Int? = null,
            /**
             * [TargetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val targetValue: Double
    )

}

/**
 * [AWS::AutoScalingPlans::ScalingPlan - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
 */
fun Resources.awsAutoScalingPlansScalingPlan(logicalId: String, init: AWSAutoScalingPlansScalingPlan.() -> Unit = {}): AWSAutoScalingPlansScalingPlan {
    return AWSAutoScalingPlansScalingPlan(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
