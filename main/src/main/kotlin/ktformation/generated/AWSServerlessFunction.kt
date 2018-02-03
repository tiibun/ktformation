
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AlexaSkillEvent(
            /**
             * [Variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#alexaskill)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val variables: Map<String, Any>? = null
    )

    class ApiEvent(
            /**
             * [Method](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val method: String,
            /**
             * [Path](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val path: String,
            /**
             * [RestApiId](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#api)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val restApiId: String? = null
    )

    class CloudWatchEventEvent(
            /**
             * [Input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val input: String? = null,
            /**
             * [InputPath](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#cloudwatchevent)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val inputPath: String? = null,
            /**
             * [Pattern](http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html)
             *
             * _Required_: yes
             *
             * _Type_: Json
             */
            val pattern: Json
    )

    class DeadLetterQueue(
            /**
             * [TargetArn](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val targetArn: String,
            /**
             * [Type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class DynamoDBEvent(
            /**
             * [BatchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val batchSize: Int,
            /**
             * [StartingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val startingPosition: String,
            /**
             * [Stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#dynamodb)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stream: String
    )

    class EventSource(
            /**
             * [Properties](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-types)
             *
             * _Required_: yes
             *
             * _Type_: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent
             */
            val properties: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent,
            /**
             * [Type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#event-source-object)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class FunctionEnvironment(
            /**
             * [Variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#environment-object)
             *
             * _Required_: yes
             *
             * _Type_: Map<String, Any>
             */
            val variables: Map<String, Any>
    )

    class IAMPolicyDocument(
            /**
             * [Statement](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html)
             *
             * _Required_: yes
             *
             * _Type_: Json
             */
            val statement: Json
    )

    class IoTRuleEvent(
            /**
             * [AwsIotSqlVersion](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val awsIotSqlVersion: String? = null,
            /**
             * [Sql](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#iotrule)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sql: String
    )

    class KinesisEvent(
            /**
             * [BatchSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val batchSize: Int? = null,
            /**
             * [StartingPosition](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val startingPosition: String,
            /**
             * [Stream](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#kinesis)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stream: String
    )

    class S3Event(
            /**
             * [Bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [Events](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val events: String,
            /**
             * [Filter](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#s3)
             *
             * _Required_: no
             *
             * _Type_: S3NotificationFilter
             */
            val filter: S3NotificationFilter? = null
    )

    class S3Location(
            /**
             * [Bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [Key](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Version](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val version: Int
    )

    class S3NotificationFilter(
            /**
             * [S3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val s3Key: String
    )

    class SNSEvent(
            /**
             * [Topic](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#sns)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val topic: String
    )

    class ScheduleEvent(
            /**
             * [Input](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val input: String? = null,
            /**
             * [Schedule](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#schedule)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val schedule: String
    )

    class VpcConfig(
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>,
            /**
             * [SubnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnetIds: List<String>
    )

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
