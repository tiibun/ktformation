
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECS::TaskDefinition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html)
 */
@CloudFormationMarker
class AWSECSTaskDefinition(logicalId: String) : Resource<AWSECSTaskDefinition.Properties>(logicalId, "AWS::ECS::TaskDefinition") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var containerDefinitions: Any? = null
        fun containerDefinitions(value: List<ContainerDefinition>) {
            this.containerDefinitions = value
        }
        fun containerDefinitions(vararg value: IntrinsicFunction) { this.containerDefinitions = value }
        @JvmField var cpu: Any? = null
        fun cpu(value: String) {
            this.cpu = value
        }
        fun cpu(value: IntrinsicFunction) { this.cpu = value }
        @JvmField var executionRoleArn: Any? = null
        fun executionRoleArn(value: String) {
            this.executionRoleArn = value
        }
        fun executionRoleArn(value: IntrinsicFunction) { this.executionRoleArn = value }
        @JvmField var family: Any? = null
        fun family(value: String) {
            this.family = value
        }
        fun family(value: IntrinsicFunction) { this.family = value }
        @JvmField var memory: Any? = null
        fun memory(value: String) {
            this.memory = value
        }
        fun memory(value: IntrinsicFunction) { this.memory = value }
        @JvmField var networkMode: Any? = null
        fun networkMode(value: String) {
            this.networkMode = value
        }
        fun networkMode(value: IntrinsicFunction) { this.networkMode = value }
        @JvmField var placementConstraints: Any? = null
        fun placementConstraints(value: List<TaskDefinitionPlacementConstraint>) {
            this.placementConstraints = value
        }
        fun placementConstraints(vararg value: IntrinsicFunction) { this.placementConstraints = value }
        @JvmField var requiresCompatibilities: Any? = null
        fun requiresCompatibilities(value: List<String>) {
            this.requiresCompatibilities = value
        }
        fun requiresCompatibilities(vararg value: IntrinsicFunction) { this.requiresCompatibilities = value }
        @JvmField var taskRoleArn: Any? = null
        fun taskRoleArn(value: String) {
            this.taskRoleArn = value
        }
        fun taskRoleArn(value: IntrinsicFunction) { this.taskRoleArn = value }
        @JvmField var volumes: Any? = null
        fun volumes(value: List<Volume>) {
            this.volumes = value
        }
        fun volumes(vararg value: IntrinsicFunction) { this.volumes = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ContainerDefinition(
            val command: List<String>? = null,
            val cpu: Int? = null,
            val disableNetworking: Boolean? = null,
            val dnsSearchDomains: List<String>? = null,
            val dnsServers: List<String>? = null,
            val dockerLabels: Map<String, Any>? = null,
            val dockerSecurityOptions: List<String>? = null,
            val entryPoint: List<String>? = null,
            val environment: List<KeyValuePair>? = null,
            val essential: Boolean? = null,
            val extraHosts: List<HostEntry>? = null,
            val hostname: String? = null,
            val image: String? = null,
            val links: List<String>? = null,
            val linuxParameters: LinuxParameters? = null,
            val logConfiguration: LogConfiguration? = null,
            val memory: Int? = null,
            val memoryReservation: Int? = null,
            val mountPoints: List<MountPoint>? = null,
            val name: String? = null,
            val portMappings: List<PortMapping>? = null,
            val privileged: Boolean? = null,
            val readonlyRootFilesystem: Boolean? = null,
            val ulimits: List<Ulimit>? = null,
            val user: String? = null,
            val volumesFrom: List<VolumeFrom>? = null,
            val workingDirectory: String? = null
    )

    class Device(
            val containerPath: String? = null,
            val hostPath: String,
            val permissions: List<String>? = null
    )

    class HostEntry(
            val hostname: String,
            val ipAddress: String
    )

    class HostVolumeProperties(
            val sourcePath: String? = null
    )

    class KernelCapabilities(
            val add: List<String>? = null,
            val drop: List<String>? = null
    )

    class KeyValuePair(
            val name: String? = null,
            val value: String? = null
    )

    class LinuxParameters(
            val capabilities: KernelCapabilities? = null,
            val devices: List<Device>? = null,
            val initProcessEnabled: Boolean? = null
    )

    class LogConfiguration(
            val logDriver: String,
            val options: Map<String, Any>? = null
    )

    class MountPoint(
            val containerPath: String? = null,
            val readOnly: Boolean? = null,
            val sourceVolume: String? = null
    )

    class PortMapping(
            val containerPort: Int? = null,
            val hostPort: Int? = null,
            val protocol: String? = null
    )

    class TaskDefinitionPlacementConstraint(
            val expression: String? = null,
            val type: String
    )

    class Ulimit(
            val hardLimit: Int,
            val name: String,
            val softLimit: Int
    )

    class Volume(
            val host: HostVolumeProperties? = null,
            val name: String? = null
    )

    class VolumeFrom(
            val readOnly: Boolean? = null,
            val sourceContainer: String? = null
    )

}

fun Resources.awsECSTaskDefinition(logicalId: String, init: AWSECSTaskDefinition.() -> Unit = {}): AWSECSTaskDefinition {
    return AWSECSTaskDefinition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
