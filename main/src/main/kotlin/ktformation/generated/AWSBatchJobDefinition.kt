
package ktformation.generated

import ktformation.*

/**
 * [AWS::Batch::JobDefinition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
 */
@CloudFormationMarker
class AWSBatchJobDefinition(logicalId: String) : Resource<AWSBatchJobDefinition.Properties>(logicalId, "AWS::Batch::JobDefinition") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var containerProperties: Any? = null
        fun containerProperties(value: ContainerProperties) { this.containerProperties = value }
        fun containerProperties(value: IntrinsicFunction) { this.containerProperties = value }
        @JvmField var jobDefinitionName: Any? = null
        fun jobDefinitionName(value: String) {
            this.jobDefinitionName = value
        }
        fun jobDefinitionName(value: IntrinsicFunction) { this.jobDefinitionName = value }
        @JvmField var parameters: Any? = null
        fun parameters(value: Json) {
            this.parameters = value
        }
        fun parameters(value: IntrinsicFunction) { this.parameters = value }
        @JvmField var retryStrategy: Any? = null
        fun retryStrategy(value: RetryStrategy) {
            this.retryStrategy = value
        }
        fun retryStrategy(value: IntrinsicFunction) { this.retryStrategy = value }
        @JvmField var type: Any? = null
        fun type(value: String) { this.type = value }
        fun type(value: IntrinsicFunction) { this.type = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ContainerProperties(
            val command: List<String>? = null,
            val environment: List<Environment>? = null,
            val image: String,
            val jobRoleArn: String? = null,
            val memory: Int,
            val mountPoints: List<MountPoints>? = null,
            val privileged: Boolean? = null,
            val readonlyRootFilesystem: Boolean? = null,
            val ulimits: List<Ulimit>? = null,
            val user: String? = null,
            val vcpus: Int,
            val volumes: List<Volumes>? = null
    )

    class Environment(
            val name: String? = null,
            val value: String? = null
    )

    class MountPoints(
            val containerPath: String? = null,
            val readOnly: Boolean? = null,
            val sourceVolume: String? = null
    )

    class RetryStrategy(
            val attempts: Int? = null
    )

    class Ulimit(
            val hardLimit: Int,
            val name: String,
            val softLimit: Int
    )

    class Volumes(
            val host: VolumesHost? = null,
            val name: String? = null
    )

    class VolumesHost(
            val sourcePath: String? = null
    )

}

fun Resources.awsBatchJobDefinition(logicalId: String, init: AWSBatchJobDefinition.() -> Unit = {}): AWSBatchJobDefinition {
    return AWSBatchJobDefinition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
