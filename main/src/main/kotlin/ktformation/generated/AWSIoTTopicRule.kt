
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

        /**
        * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html)
        */
        fun action(init: Action.() -> Unit = {}): Action {
            return Action().also {
                it.init()
            }
        }
        /**
        * [CloudwatchAlarmAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html)
        */
        fun cloudwatchAlarmAction(init: CloudwatchAlarmAction.() -> Unit = {}): CloudwatchAlarmAction {
            return CloudwatchAlarmAction().also {
                it.init()
            }
        }
        /**
        * [CloudwatchMetricAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html)
        */
        fun cloudwatchMetricAction(init: CloudwatchMetricAction.() -> Unit = {}): CloudwatchMetricAction {
            return CloudwatchMetricAction().also {
                it.init()
            }
        }
        /**
        * [DynamoDBAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html)
        */
        fun dynamoDBAction(init: DynamoDBAction.() -> Unit = {}): DynamoDBAction {
            return DynamoDBAction().also {
                it.init()
            }
        }
        /**
        * [DynamoDBv2Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html)
        */
        fun dynamoDBv2Action(init: DynamoDBv2Action.() -> Unit = {}): DynamoDBv2Action {
            return DynamoDBv2Action().also {
                it.init()
            }
        }
        /**
        * [ElasticsearchAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html)
        */
        fun elasticsearchAction(init: ElasticsearchAction.() -> Unit = {}): ElasticsearchAction {
            return ElasticsearchAction().also {
                it.init()
            }
        }
        /**
        * [FirehoseAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html)
        */
        fun firehoseAction(init: FirehoseAction.() -> Unit = {}): FirehoseAction {
            return FirehoseAction().also {
                it.init()
            }
        }
        /**
        * [KinesisAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html)
        */
        fun kinesisAction(init: KinesisAction.() -> Unit = {}): KinesisAction {
            return KinesisAction().also {
                it.init()
            }
        }
        /**
        * [LambdaAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html)
        */
        fun lambdaAction(init: LambdaAction.() -> Unit = {}): LambdaAction {
            return LambdaAction().also {
                it.init()
            }
        }
        /**
        * [PutItemInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html)
        */
        fun putItemInput(init: PutItemInput.() -> Unit = {}): PutItemInput {
            return PutItemInput().also {
                it.init()
            }
        }
        /**
        * [RepublishAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html)
        */
        fun republishAction(init: RepublishAction.() -> Unit = {}): RepublishAction {
            return RepublishAction().also {
                it.init()
            }
        }
        /**
        * [S3Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html)
        */
        fun s3Action(init: S3Action.() -> Unit = {}): S3Action {
            return S3Action().also {
                it.init()
            }
        }
        /**
        * [SnsAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html)
        */
        fun snsAction(init: SnsAction.() -> Unit = {}): SnsAction {
            return SnsAction().also {
                it.init()
            }
        }
        /**
        * [SqsAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html)
        */
        fun sqsAction(init: SqsAction.() -> Unit = {}): SqsAction {
            return SqsAction().also {
                it.init()
            }
        }
        /**
        * [TopicRulePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html)
        */
        fun topicRulePayload(init: TopicRulePayload.() -> Unit = {}): TopicRulePayload {
            return TopicRulePayload().also {
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
    class Action {
            /**
         * [cloudwatchAlarm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchalarm)
         *
         * _Required_: no
         *
         * _Type_: CloudwatchAlarmAction
         */
        var cloudwatchAlarm: Any? = null

        /**
         * [cloudwatchAlarm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchalarm)
         *
         * _Required_: no
         *
         * _Type_: CloudwatchAlarmAction
         */
        fun cloudwatchAlarm(value: CloudwatchAlarmAction) {
          this.cloudwatchAlarm = value
        }
        
        /**
         * [cloudwatchAlarm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchalarm)
         *
         * _Required_: no
         *
         * _Type_: CloudwatchAlarmAction
         */
        fun cloudwatchAlarm(value: IntrinsicFunction) {
          this.cloudwatchAlarm = value
        }

        /**
         * [cloudwatchMetric](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchmetric)
         *
         * _Required_: no
         *
         * _Type_: CloudwatchMetricAction
         */
        var cloudwatchMetric: Any? = null

        /**
         * [cloudwatchMetric](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchmetric)
         *
         * _Required_: no
         *
         * _Type_: CloudwatchMetricAction
         */
        fun cloudwatchMetric(value: CloudwatchMetricAction) {
          this.cloudwatchMetric = value
        }
        
        /**
         * [cloudwatchMetric](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchmetric)
         *
         * _Required_: no
         *
         * _Type_: CloudwatchMetricAction
         */
        fun cloudwatchMetric(value: IntrinsicFunction) {
          this.cloudwatchMetric = value
        }

        /**
         * [dynamoDB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodb)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBAction
         */
        var dynamoDB: Any? = null

        /**
         * [dynamoDB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodb)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBAction
         */
        fun dynamoDB(value: DynamoDBAction) {
          this.dynamoDB = value
        }
        
        /**
         * [dynamoDB](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodb)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBAction
         */
        fun dynamoDB(value: IntrinsicFunction) {
          this.dynamoDB = value
        }

        /**
         * [dynamoDBv2](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodbv2)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBv2Action
         */
        var dynamoDBv2: Any? = null

        /**
         * [dynamoDBv2](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodbv2)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBv2Action
         */
        fun dynamoDBv2(value: DynamoDBv2Action) {
          this.dynamoDBv2 = value
        }
        
        /**
         * [dynamoDBv2](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodbv2)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBv2Action
         */
        fun dynamoDBv2(value: IntrinsicFunction) {
          this.dynamoDBv2 = value
        }

        /**
         * [elasticsearch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-elasticsearch)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchAction
         */
        var elasticsearch: Any? = null

        /**
         * [elasticsearch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-elasticsearch)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchAction
         */
        fun elasticsearch(value: ElasticsearchAction) {
          this.elasticsearch = value
        }
        
        /**
         * [elasticsearch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-elasticsearch)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchAction
         */
        fun elasticsearch(value: IntrinsicFunction) {
          this.elasticsearch = value
        }

        /**
         * [firehose](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-firehose)
         *
         * _Required_: no
         *
         * _Type_: FirehoseAction
         */
        var firehose: Any? = null

        /**
         * [firehose](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-firehose)
         *
         * _Required_: no
         *
         * _Type_: FirehoseAction
         */
        fun firehose(value: FirehoseAction) {
          this.firehose = value
        }
        
        /**
         * [firehose](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-firehose)
         *
         * _Required_: no
         *
         * _Type_: FirehoseAction
         */
        fun firehose(value: IntrinsicFunction) {
          this.firehose = value
        }

        /**
         * [kinesis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kinesis)
         *
         * _Required_: no
         *
         * _Type_: KinesisAction
         */
        var kinesis: Any? = null

        /**
         * [kinesis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kinesis)
         *
         * _Required_: no
         *
         * _Type_: KinesisAction
         */
        fun kinesis(value: KinesisAction) {
          this.kinesis = value
        }
        
        /**
         * [kinesis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kinesis)
         *
         * _Required_: no
         *
         * _Type_: KinesisAction
         */
        fun kinesis(value: IntrinsicFunction) {
          this.kinesis = value
        }

        /**
         * [lambda](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-lambda)
         *
         * _Required_: no
         *
         * _Type_: LambdaAction
         */
        var lambda: Any? = null

        /**
         * [lambda](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-lambda)
         *
         * _Required_: no
         *
         * _Type_: LambdaAction
         */
        fun lambda(value: LambdaAction) {
          this.lambda = value
        }
        
        /**
         * [lambda](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-lambda)
         *
         * _Required_: no
         *
         * _Type_: LambdaAction
         */
        fun lambda(value: IntrinsicFunction) {
          this.lambda = value
        }

        /**
         * [republish](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-republish)
         *
         * _Required_: no
         *
         * _Type_: RepublishAction
         */
        var republish: Any? = null

        /**
         * [republish](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-republish)
         *
         * _Required_: no
         *
         * _Type_: RepublishAction
         */
        fun republish(value: RepublishAction) {
          this.republish = value
        }
        
        /**
         * [republish](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-republish)
         *
         * _Required_: no
         *
         * _Type_: RepublishAction
         */
        fun republish(value: IntrinsicFunction) {
          this.republish = value
        }

        /**
         * [s3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-s3)
         *
         * _Required_: no
         *
         * _Type_: S3Action
         */
        var s3: Any? = null

        /**
         * [s3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-s3)
         *
         * _Required_: no
         *
         * _Type_: S3Action
         */
        fun s3(value: S3Action) {
          this.s3 = value
        }
        
        /**
         * [s3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-s3)
         *
         * _Required_: no
         *
         * _Type_: S3Action
         */
        fun s3(value: IntrinsicFunction) {
          this.s3 = value
        }

        /**
         * [sns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sns)
         *
         * _Required_: no
         *
         * _Type_: SnsAction
         */
        var sns: Any? = null

        /**
         * [sns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sns)
         *
         * _Required_: no
         *
         * _Type_: SnsAction
         */
        fun sns(value: SnsAction) {
          this.sns = value
        }
        
        /**
         * [sns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sns)
         *
         * _Required_: no
         *
         * _Type_: SnsAction
         */
        fun sns(value: IntrinsicFunction) {
          this.sns = value
        }

        /**
         * [sqs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sqs)
         *
         * _Required_: no
         *
         * _Type_: SqsAction
         */
        var sqs: Any? = null

        /**
         * [sqs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sqs)
         *
         * _Required_: no
         *
         * _Type_: SqsAction
         */
        fun sqs(value: SqsAction) {
          this.sqs = value
        }
        
        /**
         * [sqs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sqs)
         *
         * _Required_: no
         *
         * _Type_: SqsAction
         */
        fun sqs(value: IntrinsicFunction) {
          this.sqs = value
        }

    }

    @CloudFormationMarker
    class CloudwatchAlarmAction {
            /**
         * [alarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var alarmName: Any? = null

        /**
         * [alarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun alarmName(value: String) {
          this.alarmName = value
        }
        
        /**
         * [alarmName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun alarmName(value: IntrinsicFunction) {
          this.alarmName = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [stateReason](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var stateReason: Any? = null

        /**
         * [stateReason](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stateReason(value: String) {
          this.stateReason = value
        }
        
        /**
         * [stateReason](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stateReason(value: IntrinsicFunction) {
          this.stateReason = value
        }

        /**
         * [stateValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var stateValue: Any? = null

        /**
         * [stateValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stateValue(value: String) {
          this.stateValue = value
        }
        
        /**
         * [stateValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stateValue(value: IntrinsicFunction) {
          this.stateValue = value
        }

    }

    @CloudFormationMarker
    class CloudwatchMetricAction {
            /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricName: Any? = null

        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: String) {
          this.metricName = value
        }
        
        /**
         * [metricName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricName(value: IntrinsicFunction) {
          this.metricName = value
        }

        /**
         * [metricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricNamespace: Any? = null

        /**
         * [metricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricNamespace(value: String) {
          this.metricNamespace = value
        }
        
        /**
         * [metricNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricNamespace(value: IntrinsicFunction) {
          this.metricNamespace = value
        }

        /**
         * [metricTimestamp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var metricTimestamp: Any? = null

        /**
         * [metricTimestamp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun metricTimestamp(value: String) {
          this.metricTimestamp = value
        }
        
        /**
         * [metricTimestamp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun metricTimestamp(value: IntrinsicFunction) {
          this.metricTimestamp = value
        }

        /**
         * [metricUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricUnit: Any? = null

        /**
         * [metricUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricUnit(value: String) {
          this.metricUnit = value
        }
        
        /**
         * [metricUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricUnit(value: IntrinsicFunction) {
          this.metricUnit = value
        }

        /**
         * [metricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var metricValue: Any? = null

        /**
         * [metricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricValue(value: String) {
          this.metricValue = value
        }
        
        /**
         * [metricValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun metricValue(value: IntrinsicFunction) {
          this.metricValue = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

    }

    @CloudFormationMarker
    class DynamoDBAction {
            /**
         * [hashKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hashKeyField: Any? = null

        /**
         * [hashKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hashKeyField(value: String) {
          this.hashKeyField = value
        }
        
        /**
         * [hashKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hashKeyField(value: IntrinsicFunction) {
          this.hashKeyField = value
        }

        /**
         * [hashKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var hashKeyType: Any? = null

        /**
         * [hashKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hashKeyType(value: String) {
          this.hashKeyType = value
        }
        
        /**
         * [hashKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hashKeyType(value: IntrinsicFunction) {
          this.hashKeyType = value
        }

        /**
         * [hashKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hashKeyValue: Any? = null

        /**
         * [hashKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hashKeyValue(value: String) {
          this.hashKeyValue = value
        }
        
        /**
         * [hashKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hashKeyValue(value: IntrinsicFunction) {
          this.hashKeyValue = value
        }

        /**
         * [payloadField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var payloadField: Any? = null

        /**
         * [payloadField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun payloadField(value: String) {
          this.payloadField = value
        }
        
        /**
         * [payloadField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun payloadField(value: IntrinsicFunction) {
          this.payloadField = value
        }

        /**
         * [rangeKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var rangeKeyField: Any? = null

        /**
         * [rangeKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rangeKeyField(value: String) {
          this.rangeKeyField = value
        }
        
        /**
         * [rangeKeyField](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rangeKeyField(value: IntrinsicFunction) {
          this.rangeKeyField = value
        }

        /**
         * [rangeKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var rangeKeyType: Any? = null

        /**
         * [rangeKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rangeKeyType(value: String) {
          this.rangeKeyType = value
        }
        
        /**
         * [rangeKeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rangeKeyType(value: IntrinsicFunction) {
          this.rangeKeyType = value
        }

        /**
         * [rangeKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var rangeKeyValue: Any? = null

        /**
         * [rangeKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rangeKeyValue(value: String) {
          this.rangeKeyValue = value
        }
        
        /**
         * [rangeKeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun rangeKeyValue(value: IntrinsicFunction) {
          this.rangeKeyValue = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var tableName: Any? = null

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: String) {
          this.tableName = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
        }

    }

    @CloudFormationMarker
    class DynamoDBv2Action {
            /**
         * [putItem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-putitem)
         *
         * _Required_: no
         *
         * _Type_: PutItemInput
         */
        var putItem: Any? = null

        /**
         * [putItem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-putitem)
         *
         * _Required_: no
         *
         * _Type_: PutItemInput
         */
        fun putItem(value: PutItemInput) {
          this.putItem = value
        }
        
        /**
         * [putItem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-putitem)
         *
         * _Required_: no
         *
         * _Type_: PutItemInput
         */
        fun putItem(value: IntrinsicFunction) {
          this.putItem = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

    }

    @CloudFormationMarker
    class ElasticsearchAction {
            /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var endpoint: Any? = null

        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpoint(value: String) {
          this.endpoint = value
        }
        
        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpoint(value: IntrinsicFunction) {
          this.endpoint = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [index](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var index: Any? = null

        /**
         * [index](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun index(value: String) {
          this.index = value
        }
        
        /**
         * [index](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun index(value: IntrinsicFunction) {
          this.index = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class FirehoseAction {
            /**
         * [deliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var deliveryStreamName: Any? = null

        /**
         * [deliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deliveryStreamName(value: String) {
          this.deliveryStreamName = value
        }
        
        /**
         * [deliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deliveryStreamName(value: IntrinsicFunction) {
          this.deliveryStreamName = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [separator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var separator: Any? = null

        /**
         * [separator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun separator(value: String) {
          this.separator = value
        }
        
        /**
         * [separator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun separator(value: IntrinsicFunction) {
          this.separator = value
        }

    }

    @CloudFormationMarker
    class KinesisAction {
            /**
         * [partitionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var partitionKey: Any? = null

        /**
         * [partitionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun partitionKey(value: String) {
          this.partitionKey = value
        }
        
        /**
         * [partitionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun partitionKey(value: IntrinsicFunction) {
          this.partitionKey = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var streamName: Any? = null

        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun streamName(value: String) {
          this.streamName = value
        }
        
        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun streamName(value: IntrinsicFunction) {
          this.streamName = value
        }

    }

    @CloudFormationMarker
    class LambdaAction {
            /**
         * [functionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var functionArn: Any? = null

        /**
         * [functionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun functionArn(value: String) {
          this.functionArn = value
        }
        
        /**
         * [functionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun functionArn(value: IntrinsicFunction) {
          this.functionArn = value
        }

    }

    @CloudFormationMarker
    class PutItemInput {
            /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var tableName: Any? = null

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: String) {
          this.tableName = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
        }

    }

    @CloudFormationMarker
    class RepublishAction {
            /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var topic: Any? = null

        /**
         * [topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topic(value: String) {
          this.topic = value
        }
        
        /**
         * [topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topic(value: IntrinsicFunction) {
          this.topic = value
        }

    }

    @CloudFormationMarker
    class S3Action {
            /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucketName: Any? = null

        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketName(value: String) {
          this.bucketName = value
        }
        
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketName(value: IntrinsicFunction) {
          this.bucketName = value
        }

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

    }

    @CloudFormationMarker
    class SnsAction {
            /**
         * [messageFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var messageFormat: Any? = null

        /**
         * [messageFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun messageFormat(value: String) {
          this.messageFormat = value
        }
        
        /**
         * [messageFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun messageFormat(value: IntrinsicFunction) {
          this.messageFormat = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [targetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var targetArn: Any? = null

        /**
         * [targetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetArn(value: String) {
          this.targetArn = value
        }
        
        /**
         * [targetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetArn(value: IntrinsicFunction) {
          this.targetArn = value
        }

    }

    @CloudFormationMarker
    class SqsAction {
            /**
         * [queueUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var queueUrl: Any? = null

        /**
         * [queueUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun queueUrl(value: String) {
          this.queueUrl = value
        }
        
        /**
         * [queueUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun queueUrl(value: IntrinsicFunction) {
          this.queueUrl = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [useBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var useBase64: Any? = null

        /**
         * [useBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useBase64(value: Boolean) {
          this.useBase64 = value
        }
        
        /**
         * [useBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useBase64(value: IntrinsicFunction) {
          this.useBase64 = value
        }

    }

    @CloudFormationMarker
    class TopicRulePayload {
            /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        var actions: Any? = null

        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun actions(value: List<Action>) {
          this.actions = value
        }
        
        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun actions(vararg value: IntrinsicFunction) {
          this.actions = value
        }

        /**
         * [awsIotSqlVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var awsIotSqlVersion: Any? = null

        /**
         * [awsIotSqlVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun awsIotSqlVersion(value: String) {
          this.awsIotSqlVersion = value
        }
        
        /**
         * [awsIotSqlVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun awsIotSqlVersion(value: IntrinsicFunction) {
          this.awsIotSqlVersion = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [ruleDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var ruleDisabled: Any? = null

        /**
         * [ruleDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun ruleDisabled(value: Boolean) {
          this.ruleDisabled = value
        }
        
        /**
         * [ruleDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun ruleDisabled(value: IntrinsicFunction) {
          this.ruleDisabled = value
        }

        /**
         * [sql](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sql: Any? = null

        /**
         * [sql](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sql(value: String) {
          this.sql = value
        }
        
        /**
         * [sql](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sql(value: IntrinsicFunction) {
          this.sql = value
        }

    }

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
