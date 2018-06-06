
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class MetricTransformation(
            /**
             * [DefaultValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-defaultvalue)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val defaultValue: Double? = null,
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [MetricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricnamespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricNamespace: String,
            /**
             * [MetricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-cwl-metricfilter-metrictransformation-metricvalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricValue: String
    )

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
