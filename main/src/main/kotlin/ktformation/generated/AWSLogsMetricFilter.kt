
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::MetricFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
 */
@CloudFormationMarker
class AWSLogsMetricFilter(logicalId: String) : Resource<AWSLogsMetricFilter.Properties>(logicalId, "AWS::Logs::MetricFilter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [filterPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var filterPattern: Any? = null

        /**
         * [filterPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun filterPattern(value: String) {
          this.filterPattern = value
        }
        
        /**
         * [filterPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-filterpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun filterPattern(value: IntrinsicFunction) {
          this.filterPattern = value
        }

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var logGroupName: Any? = null

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }

        /**
         * [metricTransformations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations)
         *
         * _Required_: yes
         *
         * _Type_: List<MetricTransformation>
         */
        @JvmField
        var metricTransformations: Any? = null

        /**
         * [metricTransformations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations)
         *
         * _Required_: yes
         *
         * _Type_: List<MetricTransformation>
         */
        fun metricTransformations(value: List<MetricTransformation>) {
          this.metricTransformations = value
        }
        
        /**
         * [metricTransformations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-cwl-metricfilter-metrictransformations)
         *
         * _Required_: yes
         *
         * _Type_: List<MetricTransformation>
         */
        fun metricTransformations(vararg value: IntrinsicFunction) {
          this.metricTransformations = value
        }

        /**
        * [MetricTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html)
        */
        fun metricTransformation(init: MetricTransformation.() -> Unit = {}): MetricTransformation {
            return MetricTransformation().also {
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
    class MetricTransformation {
            /**
         * [defaultValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var defaultValue: Any? = null

        /**
         * [defaultValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun defaultValue(value: Double) {
          this.defaultValue = value
        }
        
        /**
         * [defaultValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun defaultValue(value: IntrinsicFunction) {
          this.defaultValue = value
        }

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [metricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricNamespace: Any? = null

        /**
         * [metricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricNamespace(value: String) {
          this.metricNamespace = value
        }
        
        /**
         * [metricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricNamespace(value: IntrinsicFunction) {
          this.metricNamespace = value
        }

        /**
         * [metricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricValue: Any? = null

        /**
         * [metricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricValue(value: String) {
          this.metricValue = value
        }
        
        /**
         * [metricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricValue(value: IntrinsicFunction) {
          this.metricValue = value
        }

    }

}

/**
 * [AWS::Logs::MetricFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
 */
fun Resources.awsLogsMetricFilter(logicalId: String, init: AWSLogsMetricFilter.() -> Unit = {}): AWSLogsMetricFilter {
    return AWSLogsMetricFilter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
