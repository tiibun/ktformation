
package ktformation.generated

import ktformation.*

/**
 * [AWS::Serverless::Function - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
 */
@CloudFormationMarker
class AWSServerlessFunction(logicalId: String) : Resource<AWSServerlessFunction.Properties>(logicalId, "AWS::Serverless::Function") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [codeUri](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: S3LocationOrString
         */
        @JvmField
        var codeUri: Any? = null

        /**
         * [codeUri](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: S3LocationOrString
         */
        fun codeUri(value: S3LocationOrString) {
          this.codeUri = value
        }
        
        /**
         * [codeUri](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: S3LocationOrString
         */
        fun codeUri(value: IntrinsicFunction) {
          this.codeUri = value
        }

        /**
         * [deadLetterQueue](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: DeadLetterQueue
         */
        @JvmField
        var deadLetterQueue: Any? = null

        /**
         * [deadLetterQueue](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: DeadLetterQueue
         */
        fun deadLetterQueue(value: DeadLetterQueue) {
          this.deadLetterQueue = value
        }
        
        /**
         * [deadLetterQueue](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: DeadLetterQueue
         */
        fun deadLetterQueue(value: IntrinsicFunction) {
          this.deadLetterQueue = value
        }

        /**
         * [description](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [environment](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: FunctionEnvironment
         */
        @JvmField
        var environment: Any? = null

        /**
         * [environment](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: FunctionEnvironment
         */
        fun environment(value: FunctionEnvironment) {
          this.environment = value
        }
        
        /**
         * [environment](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: FunctionEnvironment
         */
        fun environment(value: IntrinsicFunction) {
          this.environment = value
        }

        /**
         * [events](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var events: Any? = null

        /**
         * [events](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun events(value: Map<String, Any>) {
          this.events = value
        }
        
        /**
         * [functionName](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var functionName: Any? = null

        /**
         * [functionName](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun functionName(value: String) {
          this.functionName = value
        }
        
        /**
         * [functionName](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun functionName(value: IntrinsicFunction) {
          this.functionName = value
        }

        /**
         * [handler](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var handler: Any? = null

        /**
         * [handler](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun handler(value: String) {
          this.handler = value
        }
        
        /**
         * [handler](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun handler(value: IntrinsicFunction) {
          this.handler = value
        }

        /**
         * [kmsKeyArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyArn: Any? = null

        /**
         * [kmsKeyArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyArn(value: String) {
          this.kmsKeyArn = value
        }
        
        /**
         * [kmsKeyArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyArn(value: IntrinsicFunction) {
          this.kmsKeyArn = value
        }

        /**
         * [memorySize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var memorySize: Any? = null

        /**
         * [memorySize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memorySize(value: Int) {
          this.memorySize = value
        }
        
        /**
         * [memorySize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memorySize(value: IntrinsicFunction) {
          this.memorySize = value
        }

        /**
         * [policies](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: IAMPolicyDocumentOrString
         */
        @JvmField
        var policies: Any? = null

        /**
         * [policies](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: IAMPolicyDocumentOrString
         */
        fun policies(value: IAMPolicyDocumentOrString) {
          this.policies = value
        }
        
        /**
         * [policies](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: IAMPolicyDocumentOrString
         */
        fun policies(value: IntrinsicFunction) {
          this.policies = value
        }

        /**
         * [role](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var role: Any? = null

        /**
         * [role](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun role(value: String) {
          this.role = value
        }
        
        /**
         * [role](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun role(value: IntrinsicFunction) {
          this.role = value
        }

        /**
         * [runtime](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var runtime: Any? = null

        /**
         * [runtime](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun runtime(value: String) {
          this.runtime = value
        }
        
        /**
         * [runtime](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun runtime(value: IntrinsicFunction) {
          this.runtime = value
        }

        /**
         * [tags](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun tags(value: Map<String, Any>) {
          this.tags = value
        }
        
        /**
         * [timeout](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var timeout: Any? = null

        /**
         * [timeout](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: Int) {
          this.timeout = value
        }
        
        /**
         * [timeout](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
        }

        /**
         * [tracing](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var tracing: Any? = null

        /**
         * [tracing](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tracing(value: String) {
          this.tracing = value
        }
        
        /**
         * [tracing](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tracing(value: IntrinsicFunction) {
          this.tracing = value
        }

        /**
         * [vpcConfig](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        @JvmField
        var vpcConfig: Any? = null

        /**
         * [vpcConfig](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: VpcConfig) {
          this.vpcConfig = value
        }
        
        /**
         * [vpcConfig](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: IntrinsicFunction) {
          this.vpcConfig = value
        }

        /**
        * [AlexaSkillEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#alexaskill)
        */
        fun alexaSkillEvent(init: AlexaSkillEvent.() -> Unit = {}): AlexaSkillEvent {
            return AlexaSkillEvent().also {
                it.init()
            }
        }
        /**
        * [ApiEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
        */
        fun apiEvent(init: ApiEvent.() -> Unit = {}): ApiEvent {
            return ApiEvent().also {
                it.init()
            }
        }
        /**
        * [CloudWatchEventEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
        */
        fun cloudWatchEventEvent(init: CloudWatchEventEvent.() -> Unit = {}): CloudWatchEventEvent {
            return CloudWatchEventEvent().also {
                it.init()
            }
        }
        /**
        * [DeadLetterQueue](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#deadletterqueue-object)
        */
        fun deadLetterQueue(init: DeadLetterQueue.() -> Unit = {}): DeadLetterQueue {
            return DeadLetterQueue().also {
                it.init()
            }
        }
        /**
        * [DynamoDBEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
        */
        fun dynamoDBEvent(init: DynamoDBEvent.() -> Unit = {}): DynamoDBEvent {
            return DynamoDBEvent().also {
                it.init()
            }
        }
        /**
        * [EventSource](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-object)
        */
        fun eventSource(init: EventSource.() -> Unit = {}): EventSource {
            return EventSource().also {
                it.init()
            }
        }
        /**
        * [FunctionEnvironment](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#environment-object)
        */
        fun functionEnvironment(init: FunctionEnvironment.() -> Unit = {}): FunctionEnvironment {
            return FunctionEnvironment().also {
                it.init()
            }
        }
        /**
        * [IAMPolicyDocument](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html)
        */
        fun iAMPolicyDocument(init: IAMPolicyDocument.() -> Unit = {}): IAMPolicyDocument {
            return IAMPolicyDocument().also {
                it.init()
            }
        }
        /**
        * [IoTRuleEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
        */
        fun ioTRuleEvent(init: IoTRuleEvent.() -> Unit = {}): IoTRuleEvent {
            return IoTRuleEvent().also {
                it.init()
            }
        }
        /**
        * [KinesisEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
        */
        fun kinesisEvent(init: KinesisEvent.() -> Unit = {}): KinesisEvent {
            return KinesisEvent().also {
                it.init()
            }
        }
        /**
        * [S3Event](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
        */
        fun s3Event(init: S3Event.() -> Unit = {}): S3Event {
            return S3Event().also {
                it.init()
            }
        }
        /**
        * [S3Location](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3-location-object)
        */
        fun s3Location(init: S3Location.() -> Unit = {}): S3Location {
            return S3Location().also {
                it.init()
            }
        }
        /**
        * [S3NotificationFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html)
        */
        fun s3NotificationFilter(init: S3NotificationFilter.() -> Unit = {}): S3NotificationFilter {
            return S3NotificationFilter().also {
                it.init()
            }
        }
        /**
        * [SNSEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#sns)
        */
        fun sNSEvent(init: SNSEvent.() -> Unit = {}): SNSEvent {
            return SNSEvent().also {
                it.init()
            }
        }
        /**
        * [ScheduleEvent](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
        */
        fun scheduleEvent(init: ScheduleEvent.() -> Unit = {}): ScheduleEvent {
            return ScheduleEvent().also {
                it.init()
            }
        }
        /**
        * [VpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
        */
        fun vpcConfig(init: VpcConfig.() -> Unit = {}): VpcConfig {
            return VpcConfig().also {
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
    class AlexaSkillEvent {
            /**
         * [variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#alexaskill)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var variables: Any? = null

        /**
         * [variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#alexaskill)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun variables(value: Map<String, Any>) {
          this.variables = value
        }
        
    }

    @CloudFormationMarker
    class ApiEvent {
            /**
         * [method](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var method: Any? = null

        /**
         * [method](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun method(value: String) {
          this.method = value
        }
        
        /**
         * [method](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun method(value: IntrinsicFunction) {
          this.method = value
        }

        /**
         * [path](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var path: Any? = null

        /**
         * [path](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }

        /**
         * [restApiId](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var restApiId: Any? = null

        /**
         * [restApiId](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }

    }

    @CloudFormationMarker
    class CloudWatchEventEvent {
            /**
         * [input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var input: Any? = null

        /**
         * [input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: String) {
          this.input = value
        }
        
        /**
         * [input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: IntrinsicFunction) {
          this.input = value
        }

        /**
         * [inputPath](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var inputPath: Any? = null

        /**
         * [inputPath](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputPath(value: String) {
          this.inputPath = value
        }
        
        /**
         * [inputPath](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputPath(value: IntrinsicFunction) {
          this.inputPath = value
        }

        /**
         * [pattern](http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        var pattern: Any? = null

        /**
         * [pattern](http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun pattern(value: Json) {
          this.pattern = value
        }
        
        /**
         * [pattern](http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun pattern(value: IntrinsicFunction) {
          this.pattern = value
        }

    }

    @CloudFormationMarker
    class DeadLetterQueue {
            /**
         * [targetArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var targetArn: Any? = null

        /**
         * [targetArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetArn(value: String) {
          this.targetArn = value
        }
        
        /**
         * [targetArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetArn(value: IntrinsicFunction) {
          this.targetArn = value
        }

        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
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
    class DynamoDBEvent {
            /**
         * [batchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var batchSize: Any? = null

        /**
         * [batchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun batchSize(value: Int) {
          this.batchSize = value
        }
        
        /**
         * [batchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun batchSize(value: IntrinsicFunction) {
          this.batchSize = value
        }

        /**
         * [startingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var startingPosition: Any? = null

        /**
         * [startingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun startingPosition(value: String) {
          this.startingPosition = value
        }
        
        /**
         * [startingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun startingPosition(value: IntrinsicFunction) {
          this.startingPosition = value
        }

        /**
         * [stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var stream: Any? = null

        /**
         * [stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stream(value: String) {
          this.stream = value
        }
        
        /**
         * [stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stream(value: IntrinsicFunction) {
          this.stream = value
        }

    }

    @CloudFormationMarker
    class EventSource {
            /**
         * [properties](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-types)
         *
         * _Required_: yes
         *
         * _Type_: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent
         */
        var properties: Any? = null

        /**
         * [properties](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-types)
         *
         * _Required_: yes
         *
         * _Type_: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent
         */
        fun properties(value: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent) {
          this.properties = value
        }
        
        /**
         * [properties](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-types)
         *
         * _Required_: yes
         *
         * _Type_: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent
         */
        fun properties(value: IntrinsicFunction) {
          this.properties = value
        }

        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-object)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-object)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-object)
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
    class FunctionEnvironment {
            /**
         * [variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#environment-object)
         *
         * _Required_: yes
         *
         * _Type_: Map<String, Any>
         */
        var variables: Any? = null

        /**
         * [variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#environment-object)
         *
         * _Required_: yes
         *
         * _Type_: Map<String, Any>
         */
        fun variables(value: Map<String, Any>) {
          this.variables = value
        }
        
    }

    @CloudFormationMarker
    class IAMPolicyDocument {
            /**
         * [statement](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        var statement: Any? = null

        /**
         * [statement](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun statement(value: Json) {
          this.statement = value
        }
        
        /**
         * [statement](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun statement(value: IntrinsicFunction) {
          this.statement = value
        }

    }

    @CloudFormationMarker
    class IoTRuleEvent {
            /**
         * [awsIotSqlVersion](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var awsIotSqlVersion: Any? = null

        /**
         * [awsIotSqlVersion](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun awsIotSqlVersion(value: String) {
          this.awsIotSqlVersion = value
        }
        
        /**
         * [awsIotSqlVersion](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun awsIotSqlVersion(value: IntrinsicFunction) {
          this.awsIotSqlVersion = value
        }

        /**
         * [sql](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sql: Any? = null

        /**
         * [sql](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sql(value: String) {
          this.sql = value
        }
        
        /**
         * [sql](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sql(value: IntrinsicFunction) {
          this.sql = value
        }

    }

    @CloudFormationMarker
    class KinesisEvent {
            /**
         * [batchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var batchSize: Any? = null

        /**
         * [batchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun batchSize(value: Int) {
          this.batchSize = value
        }
        
        /**
         * [batchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun batchSize(value: IntrinsicFunction) {
          this.batchSize = value
        }

        /**
         * [startingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var startingPosition: Any? = null

        /**
         * [startingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun startingPosition(value: String) {
          this.startingPosition = value
        }
        
        /**
         * [startingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun startingPosition(value: IntrinsicFunction) {
          this.startingPosition = value
        }

        /**
         * [stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var stream: Any? = null

        /**
         * [stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stream(value: String) {
          this.stream = value
        }
        
        /**
         * [stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stream(value: IntrinsicFunction) {
          this.stream = value
        }

    }

    @CloudFormationMarker
    class S3Event {
            /**
         * [bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [events](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var events: Any? = null

        /**
         * [events](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun events(value: String) {
          this.events = value
        }
        
        /**
         * [events](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun events(value: IntrinsicFunction) {
          this.events = value
        }

        /**
         * [filter](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: no
         *
         * _Type_: S3NotificationFilter
         */
        var filter: Any? = null

        /**
         * [filter](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: no
         *
         * _Type_: S3NotificationFilter
         */
        fun filter(value: S3NotificationFilter) {
          this.filter = value
        }
        
        /**
         * [filter](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
         *
         * _Required_: no
         *
         * _Type_: S3NotificationFilter
         */
        fun filter(value: IntrinsicFunction) {
          this.filter = value
        }

    }

    @CloudFormationMarker
    class S3Location {
            /**
         * [bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [key](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [version](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var version: Any? = null

        /**
         * [version](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun version(value: Int) {
          this.version = value
        }
        
        /**
         * [version](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

    @CloudFormationMarker
    class S3NotificationFilter {
            /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var s3Key: Any? = null

        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Key(value: String) {
          this.s3Key = value
        }
        
        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Key(value: IntrinsicFunction) {
          this.s3Key = value
        }

    }

    @CloudFormationMarker
    class SNSEvent {
            /**
         * [topic](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#sns)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var topic: Any? = null

        /**
         * [topic](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#sns)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topic(value: String) {
          this.topic = value
        }
        
        /**
         * [topic](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#sns)
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
    class ScheduleEvent {
            /**
         * [input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var input: Any? = null

        /**
         * [input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: String) {
          this.input = value
        }
        
        /**
         * [input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: IntrinsicFunction) {
          this.input = value
        }

        /**
         * [schedule](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var schedule: Any? = null

        /**
         * [schedule](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun schedule(value: String) {
          this.schedule = value
        }
        
        /**
         * [schedule](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun schedule(value: IntrinsicFunction) {
          this.schedule = value
        }

    }

    @CloudFormationMarker
    class VpcConfig {
            /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }

    }

}

/**
 * [AWS::Serverless::Function - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
 */
fun Resources.awsServerlessFunction(logicalId: String, init: AWSServerlessFunction.() -> Unit = {}): AWSServerlessFunction {
    return AWSServerlessFunction(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
