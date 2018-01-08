
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudWatch::Alarm - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html)
 */
@CloudFormationMarker
class AWSCloudWatchAlarm(logicalId: String) : Resource<AWSCloudWatchAlarm.Properties>(logicalId, "AWS::CloudWatch::Alarm") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var actionsEnabled: Any? = null

        fun actionsEnabled(value: Boolean) {
          this.actionsEnabled = value
        }
        fun actionsEnabled(value: IntrinsicFunction) {
  this.actionsEnabled = value
}
        @JvmField
        var alarmActions: Any? = null

        fun alarmActions(value: List<String>) {
          this.alarmActions = value
        }
        fun alarmActions(vararg value: IntrinsicFunction) {
  this.alarmActions = value
}
        @JvmField
        var alarmDescription: Any? = null

        fun alarmDescription(value: String) {
          this.alarmDescription = value
        }
        fun alarmDescription(value: IntrinsicFunction) {
  this.alarmDescription = value
}
        @JvmField
        var alarmName: Any? = null

        fun alarmName(value: String) {
          this.alarmName = value
        }
        fun alarmName(value: IntrinsicFunction) {
  this.alarmName = value
}
        @JvmField
        var comparisonOperator: Any? = null

        fun comparisonOperator(value: String) {
          this.comparisonOperator = value
        }
        fun comparisonOperator(value: IntrinsicFunction) {
  this.comparisonOperator = value
}
        @JvmField
        var dimensions: Any? = null

        fun dimensions(value: List<Dimension>) {
          this.dimensions = value
        }
        fun dimensions(vararg value: IntrinsicFunction) {
  this.dimensions = value
}
        @JvmField
        var evaluateLowSampleCountPercentile: Any? = null

        fun evaluateLowSampleCountPercentile(value: String) {
          this.evaluateLowSampleCountPercentile = value
        }
        fun evaluateLowSampleCountPercentile(value: IntrinsicFunction) {
  this.evaluateLowSampleCountPercentile = value
}
        @JvmField
        var evaluationPeriods: Any? = null

        fun evaluationPeriods(value: Int) {
          this.evaluationPeriods = value
        }
        fun evaluationPeriods(value: IntrinsicFunction) {
  this.evaluationPeriods = value
}
        @JvmField
        var extendedStatistic: Any? = null

        fun extendedStatistic(value: String) {
          this.extendedStatistic = value
        }
        fun extendedStatistic(value: IntrinsicFunction) {
  this.extendedStatistic = value
}
        @JvmField
        var insufficientDataActions: Any? = null

        fun insufficientDataActions(value: List<String>) {
          this.insufficientDataActions = value
        }
        fun insufficientDataActions(vararg value: IntrinsicFunction) {
  this.insufficientDataActions = value
}
        @JvmField
        var metricName: Any? = null

        fun metricName(value: String) {
          this.metricName = value
        }
        fun metricName(value: IntrinsicFunction) {
  this.metricName = value
}
        @JvmField
        var namespace: Any? = null

        fun namespace(value: String) {
          this.namespace = value
        }
        fun namespace(value: IntrinsicFunction) {
  this.namespace = value
}
        @JvmField
        var oKActions: Any? = null

        fun oKActions(value: List<String>) {
          this.oKActions = value
        }
        fun oKActions(vararg value: IntrinsicFunction) {
  this.oKActions = value
}
        @JvmField
        var period: Any? = null

        fun period(value: Int) {
          this.period = value
        }
        fun period(value: IntrinsicFunction) {
  this.period = value
}
        @JvmField
        var statistic: Any? = null

        fun statistic(value: String) {
          this.statistic = value
        }
        fun statistic(value: IntrinsicFunction) {
  this.statistic = value
}
        @JvmField
        var threshold: Any? = null

        fun threshold(value: Double) {
          this.threshold = value
        }
        fun threshold(value: IntrinsicFunction) {
  this.threshold = value
}
        @JvmField
        var treatMissingData: Any? = null

        fun treatMissingData(value: String) {
          this.treatMissingData = value
        }
        fun treatMissingData(value: IntrinsicFunction) {
  this.treatMissingData = value
}
        @JvmField
        var unit: Any? = null

        fun unit(value: String) {
          this.unit = value
        }
        fun unit(value: IntrinsicFunction) {
  this.unit = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Dimension(
            val name: String,
            val value: String
    )

}

fun Resources.awsCloudWatchAlarm(logicalId: String, init: AWSCloudWatchAlarm.() -> Unit = {}): AWSCloudWatchAlarm {
    return AWSCloudWatchAlarm(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
