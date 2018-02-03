
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::MetricFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
 */
@CloudFormationMarker
class AWSLogsMetricFilter(logicalId: String) : Resource<AWSLogsMetricFilter.Properties>(logicalId, "AWS::Logs::MetricFilter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var filterPattern: Any? = null

        fun filterPattern(value: String) {
          this.filterPattern = value
        }
        
        fun filterPattern(value: IntrinsicFunction) {
          this.filterPattern = value
        }
        
        @JvmField
        var logGroupName: Any? = null

        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }
        
        @JvmField
        var metricTransformations: Any? = null

        fun metricTransformations(value: List<MetricTransformation>) {
          this.metricTransformations = value
        }
        
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
            val metricName: String,
            val metricNamespace: String,
            val metricValue: String
    )

}

fun Resources.awsLogsMetricFilter(logicalId: String, init: AWSLogsMetricFilter.() -> Unit = {}): AWSLogsMetricFilter {
    return AWSLogsMetricFilter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
