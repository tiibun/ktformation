
package ktformation.generated

import ktformation.*

/**
 * [AWS::Serverless::Function - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
 */
@CloudFormationMarker
class AWSServerlessFunction(logicalId: String) : Resource<AWSServerlessFunction.Properties>(logicalId, "AWS::Serverless::Function") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var codeUri: Any? = null
        fun codeUri(value: S3LocationOrString) { this.codeUri = value }
        fun codeUri(value: IntrinsicFunction) { this.codeUri = value }
        @JvmField var deadLetterQueue: Any? = null
        fun deadLetterQueue(value: DeadLetterQueue?) { this.deadLetterQueue = value }
        fun deadLetterQueue(value: IntrinsicFunction) { this.deadLetterQueue = value }
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var environment: Any? = null
        fun environment(value: FunctionEnvironment?) { this.environment = value }
        fun environment(value: IntrinsicFunction) { this.environment = value }
        @JvmField var events: Any? = null
        fun events(value: Map<String, EventSource>?) { this.events = value }
        fun events(value: IntrinsicFunction) { this.events = value }
        @JvmField var functionName: Any? = null
        fun functionName(value: String?) { this.functionName = value }
        fun functionName(value: IntrinsicFunction) { this.functionName = value }
        @JvmField var handler: Any? = null
        fun handler(value: String) { this.handler = value }
        fun handler(value: IntrinsicFunction) { this.handler = value }
        @JvmField var kmsKeyArn: Any? = null
        fun kmsKeyArn(value: String?) { this.kmsKeyArn = value }
        fun kmsKeyArn(value: IntrinsicFunction) { this.kmsKeyArn = value }
        @JvmField var memorySize: Any? = null
        fun memorySize(value: Int?) { this.memorySize = value }
        fun memorySize(value: IntrinsicFunction) { this.memorySize = value }
        @JvmField var policies: Any? = null
        fun policies(value: IAMPolicyDocumentOrString?) { this.policies = value }
        fun policies(value: IntrinsicFunction) { this.policies = value }
        @JvmField var role: Any? = null
        fun role(value: String?) { this.role = value }
        fun role(value: IntrinsicFunction) { this.role = value }
        @JvmField var runtime: Any? = null
        fun runtime(value: String) { this.runtime = value }
        fun runtime(value: IntrinsicFunction) { this.runtime = value }
        @JvmField var tags: Any? = null
        fun tags(value: Map<String, String>?) { this.tags = value }
        fun tags(value: IntrinsicFunction) { this.tags = value }
        @JvmField var timeout: Any? = null
        fun timeout(value: Int?) { this.timeout = value }
        fun timeout(value: IntrinsicFunction) { this.timeout = value }
        @JvmField var tracing: Any? = null
        fun tracing(value: String?) { this.tracing = value }
        fun tracing(value: IntrinsicFunction) { this.tracing = value }
        @JvmField var vpcConfig: Any? = null
        fun vpcConfig(value: VpcConfig?) { this.vpcConfig = value }
        fun vpcConfig(value: IntrinsicFunction) { this.vpcConfig = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AlexaSkillEvent(
            val variables: Map<String, String>? = null
    )

    class ApiEvent(
            val method: String,
            val path: String,
            val restApiId: String? = null
    )

    class CloudWatchEventEvent(
            val input: String? = null,
            val inputPath: String? = null,
            val pattern: Json
    )

    class DeadLetterQueue(
            val targetArn: String,
            val type: String
    )

    class DynamoDBEvent(
            val batchSize: Int,
            val startingPosition: String,
            val stream: String
    )

    class EventSource(
            val properties: S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent,
            val type: String
    )

    class FunctionEnvironment(
            val variables: Map<String, String>
    )

    class IAMPolicyDocument(
            val statement: Json
    )

    class IoTRuleEvent(
            val awsIotSqlVersion: String? = null,
            val sql: String
    )

    class KinesisEvent(
            val batchSize: Int? = null,
            val startingPosition: String,
            val stream: String
    )

    class S3Event(
            val bucket: String,
            val events: String,
            val filter: S3NotificationFilter? = null
    )

    class S3Location(
            val bucket: String,
            val key: String,
            val version: Int
    )

    class S3NotificationFilter(
            val s3Key: String
    )

    class SNSEvent(
            val topic: String
    )

    class ScheduleEvent(
            val input: String? = null,
            val schedule: String
    )

    class VpcConfig(
            val securityGroupIds: List<String>,
            val subnetIds: List<String>
    )

}

fun Resources.awsServerlessFunction(logicalId: String, init: AWSServerlessFunction.() -> Unit = {}): AWSServerlessFunction {
    return AWSServerlessFunction(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
