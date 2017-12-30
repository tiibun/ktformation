
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Job - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html)
 */
@CloudFormationMarker
class AWSGlueJob(logicalId: String) : Resource<AWSGlueJob.Properties>(logicalId, "AWS::Glue::Job") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var allocatedCapacity: Any? = null
        fun allocatedCapacity(value: Double) {
            this.allocatedCapacity = value
        }
        fun allocatedCapacity(value: IntrinsicFunction) { this.allocatedCapacity = value }
        @JvmField var command: Any? = null
        fun command(value: JobCommand) { this.command = value }
        fun command(value: IntrinsicFunction) { this.command = value }
        @JvmField var connections: Any? = null
        fun connections(value: ConnectionsList) {
            this.connections = value
        }
        fun connections(value: IntrinsicFunction) { this.connections = value }
        @JvmField var defaultArguments: Any? = null
        fun defaultArguments(value: Json) {
            this.defaultArguments = value
        }
        fun defaultArguments(value: IntrinsicFunction) { this.defaultArguments = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var executionProperty: Any? = null
        fun executionProperty(value: ExecutionProperty) {
            this.executionProperty = value
        }
        fun executionProperty(value: IntrinsicFunction) { this.executionProperty = value }
        @JvmField var logUri: Any? = null
        fun logUri(value: String) {
            this.logUri = value
        }
        fun logUri(value: IntrinsicFunction) { this.logUri = value }
        @JvmField var maxRetries: Any? = null
        fun maxRetries(value: Double) {
            this.maxRetries = value
        }
        fun maxRetries(value: IntrinsicFunction) { this.maxRetries = value }
        @JvmField var name: Any? = null
        fun name(value: String) {
            this.name = value
        }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var role: Any? = null
        fun role(value: String) { this.role = value }
        fun role(value: IntrinsicFunction) { this.role = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConnectionsList(
            val connections: List<String>? = null
    )

    class ExecutionProperty(
            val maxConcurrentRuns: Double? = null
    )

    class JobCommand(
            val name: String? = null,
            val scriptLocation: String? = null
    )

}

fun Resources.awsGlueJob(logicalId: String, init: AWSGlueJob.() -> Unit = {}): AWSGlueJob {
    return AWSGlueJob(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
