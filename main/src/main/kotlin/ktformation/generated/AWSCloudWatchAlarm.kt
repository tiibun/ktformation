
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudWatch::Alarm - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html)
 */
@CloudFormationMarker
class AWSCloudWatchAlarm(logicalId: String) : Resource<AWSCloudWatchAlarm.Properties>(logicalId, "AWS::CloudWatch::Alarm") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [actionsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var actionsEnabled: Any? = null

        /**
         * [actionsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun actionsEnabled(value: Boolean) {
          this.actionsEnabled = value
        }
        
        /**
         * [actionsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-actionsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun actionsEnabled(value: IntrinsicFunction) {
          this.actionsEnabled = value
        }
        
        /**
         * [alarmActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var alarmActions: Any? = null

        /**
         * [alarmActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun alarmActions(value: List<String>) {
          this.alarmActions = value
        }
        
        /**
         * [alarmActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun alarmActions(vararg value: IntrinsicFunction) {
          this.alarmActions = value
        }
        
        /**
         * [alarmDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var alarmDescription: Any? = null

        /**
         * [alarmDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun alarmDescription(value: String) {
          this.alarmDescription = value
        }
        
        /**
         * [alarmDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun alarmDescription(value: IntrinsicFunction) {
          this.alarmDescription = value
        }
        
        /**
         * [alarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var alarmName: Any? = null

        /**
         * [alarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun alarmName(value: String) {
          this.alarmName = value
        }
        
        /**
         * [alarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-alarmname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun alarmName(value: IntrinsicFunction) {
          this.alarmName = value
        }
        
        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var comparisonOperator: Any? = null

        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: String) {
          this.comparisonOperator = value
        }
        
        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: IntrinsicFunction) {
          this.comparisonOperator = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension)
         *
         * _Required_: no
         *
         * _Type_: List<Dimension>
         */
        @JvmField
        var dimensions: Any? = null

        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension)
         *
         * _Required_: no
         *
         * _Type_: List<Dimension>
         */
        fun dimensions(value: List<Dimension>) {
          this.dimensions = value
        }
        
        /**
         * [dimensions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-dimension)
         *
         * _Required_: no
         *
         * _Type_: List<Dimension>
         */
        fun dimensions(vararg value: IntrinsicFunction) {
          this.dimensions = value
        }
        
        /**
         * [evaluateLowSampleCountPercentile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var evaluateLowSampleCountPercentile: Any? = null

        /**
         * [evaluateLowSampleCountPercentile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun evaluateLowSampleCountPercentile(value: String) {
          this.evaluateLowSampleCountPercentile = value
        }
        
        /**
         * [evaluateLowSampleCountPercentile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluatelowsamplecountpercentile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun evaluateLowSampleCountPercentile(value: IntrinsicFunction) {
          this.evaluateLowSampleCountPercentile = value
        }
        
        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var evaluationPeriods: Any? = null

        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun evaluationPeriods(value: Int) {
          this.evaluationPeriods = value
        }
        
        /**
         * [evaluationPeriods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-evaluationperiods)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun evaluationPeriods(value: IntrinsicFunction) {
          this.evaluationPeriods = value
        }
        
        /**
         * [extendedStatistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var extendedStatistic: Any? = null

        /**
         * [extendedStatistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extendedStatistic(value: String) {
          this.extendedStatistic = value
        }
        
        /**
         * [extendedStatistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-extendedstatistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extendedStatistic(value: IntrinsicFunction) {
          this.extendedStatistic = value
        }
        
        /**
         * [insufficientDataActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var insufficientDataActions: Any? = null

        /**
         * [insufficientDataActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun insufficientDataActions(value: List<String>) {
          this.insufficientDataActions = value
        }
        
        /**
         * [insufficientDataActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-insufficientdataactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun insufficientDataActions(vararg value: IntrinsicFunction) {
          this.insufficientDataActions = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }
        
        /**
         * [oKActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var oKActions: Any? = null

        /**
         * [oKActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun oKActions(value: List<String>) {
          this.oKActions = value
        }
        
        /**
         * [oKActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-okactions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun oKActions(vararg value: IntrinsicFunction) {
          this.oKActions = value
        }
        
        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var period: Any? = null

        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun period(value: Int) {
          this.period = value
        }
        
        /**
         * [period](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-period)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun period(value: IntrinsicFunction) {
          this.period = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var statistic: Any? = null

        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statistic(value: String) {
          this.statistic = value
        }
        
        /**
         * [statistic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-statistic)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statistic(value: IntrinsicFunction) {
          this.statistic = value
        }
        
        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        @JvmField
        var threshold: Any? = null

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: Double) {
          this.threshold = value
        }
        
        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: IntrinsicFunction) {
          this.threshold = value
        }
        
        /**
         * [treatMissingData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var treatMissingData: Any? = null

        /**
         * [treatMissingData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun treatMissingData(value: String) {
          this.treatMissingData = value
        }
        
        /**
         * [treatMissingData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-treatmissingdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun treatMissingData(value: IntrinsicFunction) {
          this.treatMissingData = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html#cfn-cloudwatch-alarms-unit)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-dimension.html#cfn-cloudwatch-alarm-dimension-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-dimension.html#cfn-cloudwatch-alarm-dimension-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

}

/**
 * [AWS::CloudWatch::Alarm - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html)
 */
fun Resources.awsCloudWatchAlarm(logicalId: String, init: AWSCloudWatchAlarm.() -> Unit = {}): AWSCloudWatchAlarm {
    return AWSCloudWatchAlarm(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
