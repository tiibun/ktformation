
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

        /**
        * [ApplicationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html)
        */
        fun applicationSource(init: ApplicationSource.() -> Unit = {}): ApplicationSource {
            return ApplicationSource().also {
                it.init()
            }
        }
        /**
        * [CustomizedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html)
        */
        fun customizedScalingMetricSpecification(init: CustomizedScalingMetricSpecification.() -> Unit = {}): CustomizedScalingMetricSpecification {
            return CustomizedScalingMetricSpecification().also {
                it.init()
            }
        }
        /**
        * [MetricDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html)
        */
        fun metricDimension(init: MetricDimension.() -> Unit = {}): MetricDimension {
            return MetricDimension().also {
                it.init()
            }
        }
        /**
        * [PredefinedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html)
        */
        fun predefinedScalingMetricSpecification(init: PredefinedScalingMetricSpecification.() -> Unit = {}): PredefinedScalingMetricSpecification {
            return PredefinedScalingMetricSpecification().also {
                it.init()
            }
        }
        /**
        * [ScalingInstruction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
        */
        fun scalingInstruction(init: ScalingInstruction.() -> Unit = {}): ScalingInstruction {
            return ScalingInstruction().also {
                it.init()
            }
        }
        /**
        * [TagFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html)
        */
        fun tagFilter(init: TagFilter.() -> Unit = {}): TagFilter {
            return TagFilter().also {
                it.init()
            }
        }
        /**
        * [TargetTrackingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
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
    class ApplicationSource {
            /**
         * [cloudFormationStackARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cloudFormationStackARN: Any? = null

        /**
         * [cloudFormationStackARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudFormationStackARN(value: String) {
          this.cloudFormationStackARN = value
        }
        
        /**
         * [cloudFormationStackARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudFormationStackARN(value: IntrinsicFunction) {
          this.cloudFormationStackARN = value
        }

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        var tagFilters: Any? = null

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(value: List<TagFilter>) {
          this.tagFilters = value
        }
        
        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(vararg value: IntrinsicFunction) {
          this.tagFilters = value
        }

    }

    @CloudFormationMarker
    class CustomizedScalingMetricSpecification {
            /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        var dimensions: Any? = null

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(value: List<MetricDimension>) {
          this.dimensions = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-dimensions)
         *
         * _Required_: no
         *
         * _Type_: List<MetricDimension>
         */
        fun dimensions(vararg value: IntrinsicFunction) {
          this.dimensions = value
        }

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var statistic: Any? = null

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statistic(value: String) {
          this.statistic = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-statistic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statistic(value: IntrinsicFunction) {
          this.statistic = value
        }

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-customizedscalingmetricspecification-unit)
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
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html#cfn-autoscalingplans-scalingplan-metricdimension-value)
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
    class PredefinedScalingMetricSpecification {
            /**
         * [predefinedScalingMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var predefinedScalingMetricType: Any? = null

        /**
         * [predefinedScalingMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun predefinedScalingMetricType(value: String) {
          this.predefinedScalingMetricType = value
        }
        
        /**
         * [predefinedScalingMetricType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-predefinedscalingmetrictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun predefinedScalingMetricType(value: IntrinsicFunction) {
          this.predefinedScalingMetricType = value
        }

        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceLabel: Any? = null

        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceLabel(value: String) {
          this.resourceLabel = value
        }
        
        /**
         * [resourceLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html#cfn-autoscalingplans-scalingplan-predefinedscalingmetricspecification-resourcelabel)
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
    class ScalingInstruction {
            /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var maxCapacity: Any? = null

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: IntrinsicFunction) {
          this.maxCapacity = value
        }

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var minCapacity: Any? = null

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        
        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: IntrinsicFunction) {
          this.minCapacity = value
        }

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceId: Any? = null

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: String) {
          this.resourceId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: IntrinsicFunction) {
          this.resourceId = value
        }

        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var scalableDimension: Any? = null

        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scalableDimension(value: String) {
          this.scalableDimension = value
        }
        
        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scalableDimension(value: IntrinsicFunction) {
          this.scalableDimension = value
        }

        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var serviceNamespace: Any? = null

        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceNamespace(value: String) {
          this.serviceNamespace = value
        }
        
        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceNamespace(value: IntrinsicFunction) {
          this.serviceNamespace = value
        }

        /**
         * [targetTrackingConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations)
         *
         * _Required_: yes
         *
         * _Type_: List<TargetTrackingConfiguration>
         */
        var targetTrackingConfigurations: Any? = null

        /**
         * [targetTrackingConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations)
         *
         * _Required_: yes
         *
         * _Type_: List<TargetTrackingConfiguration>
         */
        fun targetTrackingConfigurations(value: List<TargetTrackingConfiguration>) {
          this.targetTrackingConfigurations = value
        }
        
        /**
         * [targetTrackingConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations)
         *
         * _Required_: yes
         *
         * _Type_: List<TargetTrackingConfiguration>
         */
        fun targetTrackingConfigurations(vararg value: IntrinsicFunction) {
          this.targetTrackingConfigurations = value
        }

    }

    @CloudFormationMarker
    class TagFilter {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html#cfn-autoscalingplans-scalingplan-tagfilter-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

    @CloudFormationMarker
    class TargetTrackingConfiguration {
            /**
         * [customizedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-customizedscalingmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedScalingMetricSpecification
         */
        var customizedScalingMetricSpecification: Any? = null

        /**
         * [customizedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-customizedscalingmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedScalingMetricSpecification
         */
        fun customizedScalingMetricSpecification(value: CustomizedScalingMetricSpecification) {
          this.customizedScalingMetricSpecification = value
        }
        
        /**
         * [customizedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-customizedscalingmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: CustomizedScalingMetricSpecification
         */
        fun customizedScalingMetricSpecification(value: IntrinsicFunction) {
          this.customizedScalingMetricSpecification = value
        }

        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var disableScaleIn: Any? = null

        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableScaleIn(value: Boolean) {
          this.disableScaleIn = value
        }
        
        /**
         * [disableScaleIn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-disablescalein)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableScaleIn(value: IntrinsicFunction) {
          this.disableScaleIn = value
        }

        /**
         * [estimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var estimatedInstanceWarmup: Any? = null

        /**
         * [estimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun estimatedInstanceWarmup(value: Int) {
          this.estimatedInstanceWarmup = value
        }
        
        /**
         * [estimatedInstanceWarmup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-estimatedinstancewarmup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun estimatedInstanceWarmup(value: IntrinsicFunction) {
          this.estimatedInstanceWarmup = value
        }

        /**
         * [predefinedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-predefinedscalingmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedScalingMetricSpecification
         */
        var predefinedScalingMetricSpecification: Any? = null

        /**
         * [predefinedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-predefinedscalingmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedScalingMetricSpecification
         */
        fun predefinedScalingMetricSpecification(value: PredefinedScalingMetricSpecification) {
          this.predefinedScalingMetricSpecification = value
        }
        
        /**
         * [predefinedScalingMetricSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-predefinedscalingmetricspecification)
         *
         * _Required_: no
         *
         * _Type_: PredefinedScalingMetricSpecification
         */
        fun predefinedScalingMetricSpecification(value: IntrinsicFunction) {
          this.predefinedScalingMetricSpecification = value
        }

        /**
         * [scaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var scaleInCooldown: Any? = null

        /**
         * [scaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleInCooldown(value: Int) {
          this.scaleInCooldown = value
        }
        
        /**
         * [scaleInCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleincooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleInCooldown(value: IntrinsicFunction) {
          this.scaleInCooldown = value
        }

        /**
         * [scaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var scaleOutCooldown: Any? = null

        /**
         * [scaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleOutCooldown(value: Int) {
          this.scaleOutCooldown = value
        }
        
        /**
         * [scaleOutCooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-scaleoutcooldown)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun scaleOutCooldown(value: IntrinsicFunction) {
          this.scaleOutCooldown = value
        }

        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var targetValue: Any? = null

        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun targetValue(value: Double) {
          this.targetValue = value
        }
        
        /**
         * [targetValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html#cfn-autoscalingplans-scalingplan-targettrackingconfiguration-targetvalue)
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
 * [AWS::AutoScalingPlans::ScalingPlan - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
 */
fun Resources.awsAutoScalingPlansScalingPlan(logicalId: String, init: AWSAutoScalingPlansScalingPlan.() -> Unit = {}): AWSAutoScalingPlansScalingPlan {
    return AWSAutoScalingPlansScalingPlan(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
