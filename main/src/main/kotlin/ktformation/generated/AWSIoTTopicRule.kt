
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::TopicRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html)
 */
@CloudFormationMarker
class AWSIoTTopicRule(logicalId: String) : Resource<AWSIoTTopicRule.Properties>(logicalId, "AWS::IoT::TopicRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var ruleName: Any? = null

        fun ruleName(value: String) {
          this.ruleName = value
        }
        
        fun ruleName(value: IntrinsicFunction) {
          this.ruleName = value
        }
        
        @JvmField
        var topicRulePayload: Any? = null

        fun topicRulePayload(value: TopicRulePayload) {
          this.topicRulePayload = value
        }
        
        fun topicRulePayload(value: IntrinsicFunction) {
          this.topicRulePayload = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Action(
            val cloudwatchAlarm: CloudwatchAlarmAction? = null,
            val cloudwatchMetric: CloudwatchMetricAction? = null,
            val dynamoDB: DynamoDBAction? = null,
            val dynamoDBv2: DynamoDBv2Action? = null,
            val elasticsearch: ElasticsearchAction? = null,
            val firehose: FirehoseAction? = null,
            val kinesis: KinesisAction? = null,
            val lambda: LambdaAction? = null,
            val republish: RepublishAction? = null,
            val s3: S3Action? = null,
            val sns: SnsAction? = null,
            val sqs: SqsAction? = null
    )

    class CloudwatchAlarmAction(
            val alarmName: String,
            val roleArn: String,
            val stateReason: String,
            val stateValue: String
    )

    class CloudwatchMetricAction(
            val metricName: String,
            val metricNamespace: String,
            val metricTimestamp: String? = null,
            val metricUnit: String,
            val metricValue: String,
            val roleArn: String
    )

    class DynamoDBAction(
            val hashKeyField: String,
            val hashKeyType: String? = null,
            val hashKeyValue: String,
            val payloadField: String? = null,
            val rangeKeyField: String? = null,
            val rangeKeyType: String? = null,
            val rangeKeyValue: String? = null,
            val roleArn: String,
            val tableName: String
    )

    class DynamoDBv2Action(
            val putItem: PutItemInput? = null,
            val roleArn: String? = null
    )

    class ElasticsearchAction(
            val endpoint: String,
            val id: String,
            val index: String,
            val roleArn: String,
            val type: String
    )

    class FirehoseAction(
            val deliveryStreamName: String,
            val roleArn: String,
            val separator: String? = null
    )

    class KinesisAction(
            val partitionKey: String? = null,
            val roleArn: String,
            val streamName: String
    )

    class LambdaAction(
            val functionArn: String? = null
    )

    class PutItemInput(
            val tableName: String
    )

    class RepublishAction(
            val roleArn: String,
            val topic: String
    )

    class S3Action(
            val bucketName: String,
            val key: String,
            val roleArn: String
    )

    class SnsAction(
            val messageFormat: String? = null,
            val roleArn: String,
            val targetArn: String
    )

    class SqsAction(
            val queueUrl: String,
            val roleArn: String,
            val useBase64: Boolean? = null
    )

    class TopicRulePayload(
            val actions: List<Action>,
            val awsIotSqlVersion: String? = null,
            val description: String? = null,
            val ruleDisabled: Boolean,
            val sql: String
    )

}

fun Resources.awsIoTTopicRule(logicalId: String, init: AWSIoTTopicRule.() -> Unit = {}): AWSIoTTopicRule {
    return AWSIoTTopicRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
