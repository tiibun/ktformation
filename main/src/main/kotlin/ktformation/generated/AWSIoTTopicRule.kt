
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::TopicRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html)
 */
@CloudFormationMarker
class AWSIoTTopicRule(logicalId: String) : Resource<AWSIoTTopicRule.Properties>(logicalId, "AWS::IoT::TopicRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [ruleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ruleName: Any? = null

        /**
         * [ruleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ruleName(value: String) {
          this.ruleName = value
        }
        
        /**
         * [ruleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ruleName(value: IntrinsicFunction) {
          this.ruleName = value
        }
        
        /**
         * [topicRulePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
         *
         * _Required_: yes
         *
         * _Type_: TopicRulePayload
         */
        @JvmField
        var topicRulePayload: Any? = null

        /**
         * [topicRulePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
         *
         * _Required_: yes
         *
         * _Type_: TopicRulePayload
         */
        fun topicRulePayload(value: TopicRulePayload) {
          this.topicRulePayload = value
        }
        
        /**
         * [topicRulePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
         *
         * _Required_: yes
         *
         * _Type_: TopicRulePayload
         */
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
            /**
             * [CloudwatchAlarm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchalarm)
             *
             * _Required_: no
             *
             * _Type_: CloudwatchAlarmAction
             */
            val cloudwatchAlarm: CloudwatchAlarmAction? = null,
            /**
             * [CloudwatchMetric](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchmetric)
             *
             * _Required_: no
             *
             * _Type_: CloudwatchMetricAction
             */
            val cloudwatchMetric: CloudwatchMetricAction? = null,
            /**
             * [DynamoDB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodb)
             *
             * _Required_: no
             *
             * _Type_: DynamoDBAction
             */
            val dynamoDB: DynamoDBAction? = null,
            /**
             * [DynamoDBv2](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodbv2)
             *
             * _Required_: no
             *
             * _Type_: DynamoDBv2Action
             */
            val dynamoDBv2: DynamoDBv2Action? = null,
            /**
             * [Elasticsearch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-elasticsearch)
             *
             * _Required_: no
             *
             * _Type_: ElasticsearchAction
             */
            val elasticsearch: ElasticsearchAction? = null,
            /**
             * [Firehose](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-firehose)
             *
             * _Required_: no
             *
             * _Type_: FirehoseAction
             */
            val firehose: FirehoseAction? = null,
            /**
             * [Kinesis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kinesis)
             *
             * _Required_: no
             *
             * _Type_: KinesisAction
             */
            val kinesis: KinesisAction? = null,
            /**
             * [Lambda](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-lambda)
             *
             * _Required_: no
             *
             * _Type_: LambdaAction
             */
            val lambda: LambdaAction? = null,
            /**
             * [Republish](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-republish)
             *
             * _Required_: no
             *
             * _Type_: RepublishAction
             */
            val republish: RepublishAction? = null,
            /**
             * [S3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-s3)
             *
             * _Required_: no
             *
             * _Type_: S3Action
             */
            val s3: S3Action? = null,
            /**
             * [Sns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sns)
             *
             * _Required_: no
             *
             * _Type_: SnsAction
             */
            val sns: SnsAction? = null,
            /**
             * [Sqs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sqs)
             *
             * _Required_: no
             *
             * _Type_: SqsAction
             */
            val sqs: SqsAction? = null
    )

    class CloudwatchAlarmAction(
            /**
             * [AlarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val alarmName: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [StateReason](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stateReason: String,
            /**
             * [StateValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stateValue: String
    )

    class CloudwatchMetricAction(
            /**
             * [MetricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricName: String,
            /**
             * [MetricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricNamespace: String,
            /**
             * [MetricTimestamp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val metricTimestamp: String? = null,
            /**
             * [MetricUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricUnit: String,
            /**
             * [MetricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val metricValue: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String
    )

    class DynamoDBAction(
            /**
             * [HashKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val hashKeyField: String,
            /**
             * [HashKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hashKeyType: String? = null,
            /**
             * [HashKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val hashKeyValue: String,
            /**
             * [PayloadField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val payloadField: String? = null,
            /**
             * [RangeKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val rangeKeyField: String? = null,
            /**
             * [RangeKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val rangeKeyType: String? = null,
            /**
             * [RangeKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val rangeKeyValue: String? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [TableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val tableName: String
    )

    class DynamoDBv2Action(
            /**
             * [PutItem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-putitem)
             *
             * _Required_: no
             *
             * _Type_: PutItemInput
             */
            val putItem: PutItemInput? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val roleArn: String? = null
    )

    class ElasticsearchAction(
            /**
             * [Endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val endpoint: String,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Index](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val index: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class FirehoseAction(
            /**
             * [DeliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val deliveryStreamName: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [Separator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val separator: String? = null
    )

    class KinesisAction(
            /**
             * [PartitionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val partitionKey: String? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [StreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val streamName: String
    )

    class LambdaAction(
            /**
             * [FunctionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val functionArn: String? = null
    )

    class PutItemInput(
            /**
             * [TableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val tableName: String
    )

    class RepublishAction(
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [Topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val topic: String
    )

    class S3Action(
            /**
             * [BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketName: String,
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String
    )

    class SnsAction(
            /**
             * [MessageFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val messageFormat: String? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [TargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val targetArn: String
    )

    class SqsAction(
            /**
             * [QueueUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val queueUrl: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String,
            /**
             * [UseBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val useBase64: Boolean? = null
    )

    class TopicRulePayload(
            /**
             * [Actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions)
             *
             * _Required_: yes
             *
             * _Type_: List<Action>
             */
            val actions: List<Action>,
            /**
             * [AwsIotSqlVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val awsIotSqlVersion: String? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [RuleDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val ruleDisabled: Boolean,
            /**
             * [Sql](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sql: String
    )

}

/**
 * [AWS::IoT::TopicRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html)
 */
fun Resources.awsIoTTopicRule(logicalId: String, init: AWSIoTTopicRule.() -> Unit = {}): AWSIoTTopicRule {
    return AWSIoTTopicRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
