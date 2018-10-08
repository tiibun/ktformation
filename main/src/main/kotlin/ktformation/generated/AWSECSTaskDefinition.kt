
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECS::TaskDefinition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html)
 */
@CloudFormationMarker
class AWSECSTaskDefinition(logicalId: String) : Resource<AWSECSTaskDefinition.Properties>(logicalId, "AWS::ECS::TaskDefinition") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [containerDefinitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
         *
         * _Required_: no
         *
         * _Type_: List<ContainerDefinition>
         */
        @JvmField
        var containerDefinitions: Any? = null

        /**
         * [containerDefinitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
         *
         * _Required_: no
         *
         * _Type_: List<ContainerDefinition>
         */
        fun containerDefinitions(value: List<ContainerDefinition>) {
          this.containerDefinitions = value
        }
        
        /**
         * [containerDefinitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
         *
         * _Required_: no
         *
         * _Type_: List<ContainerDefinition>
         */
        fun containerDefinitions(vararg value: IntrinsicFunction) {
          this.containerDefinitions = value
        }

        /**
         * [cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cpu: Any? = null

        /**
         * [cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cpu(value: String) {
          this.cpu = value
        }
        
        /**
         * [cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cpu(value: IntrinsicFunction) {
          this.cpu = value
        }

        /**
         * [executionRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var executionRoleArn: Any? = null

        /**
         * [executionRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun executionRoleArn(value: String) {
          this.executionRoleArn = value
        }
        
        /**
         * [executionRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun executionRoleArn(value: IntrinsicFunction) {
          this.executionRoleArn = value
        }

        /**
         * [family](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var family: Any? = null

        /**
         * [family](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun family(value: String) {
          this.family = value
        }
        
        /**
         * [family](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun family(value: IntrinsicFunction) {
          this.family = value
        }

        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var memory: Any? = null

        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun memory(value: String) {
          this.memory = value
        }
        
        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun memory(value: IntrinsicFunction) {
          this.memory = value
        }

        /**
         * [networkMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var networkMode: Any? = null

        /**
         * [networkMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkMode(value: String) {
          this.networkMode = value
        }
        
        /**
         * [networkMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkMode(value: IntrinsicFunction) {
          this.networkMode = value
        }

        /**
         * [placementConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<TaskDefinitionPlacementConstraint>
         */
        @JvmField
        var placementConstraints: Any? = null

        /**
         * [placementConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<TaskDefinitionPlacementConstraint>
         */
        fun placementConstraints(value: List<TaskDefinitionPlacementConstraint>) {
          this.placementConstraints = value
        }
        
        /**
         * [placementConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<TaskDefinitionPlacementConstraint>
         */
        fun placementConstraints(vararg value: IntrinsicFunction) {
          this.placementConstraints = value
        }

        /**
         * [requiresCompatibilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var requiresCompatibilities: Any? = null

        /**
         * [requiresCompatibilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun requiresCompatibilities(value: List<String>) {
          this.requiresCompatibilities = value
        }
        
        /**
         * [requiresCompatibilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun requiresCompatibilities(vararg value: IntrinsicFunction) {
          this.requiresCompatibilities = value
        }

        /**
         * [taskRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var taskRoleArn: Any? = null

        /**
         * [taskRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun taskRoleArn(value: String) {
          this.taskRoleArn = value
        }
        
        /**
         * [taskRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun taskRoleArn(value: IntrinsicFunction) {
          this.taskRoleArn = value
        }

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volume>
         */
        @JvmField
        var volumes: Any? = null

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volume>
         */
        fun volumes(value: List<Volume>) {
          this.volumes = value
        }
        
        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volume>
         */
        fun volumes(vararg value: IntrinsicFunction) {
          this.volumes = value
        }

        /**
        * [ContainerDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html)
        */
        fun containerDefinition(init: ContainerDefinition.() -> Unit = {}): ContainerDefinition {
            return ContainerDefinition().also {
                it.init()
            }
        }
        /**
        * [Device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html)
        */
        fun device(init: Device.() -> Unit = {}): Device {
            return Device().also {
                it.init()
            }
        }
        /**
        * [DockerVolumeConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html)
        */
        fun dockerVolumeConfiguration(init: DockerVolumeConfiguration.() -> Unit = {}): DockerVolumeConfiguration {
            return DockerVolumeConfiguration().also {
                it.init()
            }
        }
        /**
        * [HealthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html)
        */
        fun healthCheck(init: HealthCheck.() -> Unit = {}): HealthCheck {
            return HealthCheck().also {
                it.init()
            }
        }
        /**
        * [HostEntry](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html)
        */
        fun hostEntry(init: HostEntry.() -> Unit = {}): HostEntry {
            return HostEntry().also {
                it.init()
            }
        }
        /**
        * [HostVolumeProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html)
        */
        fun hostVolumeProperties(init: HostVolumeProperties.() -> Unit = {}): HostVolumeProperties {
            return HostVolumeProperties().also {
                it.init()
            }
        }
        /**
        * [KernelCapabilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html)
        */
        fun kernelCapabilities(init: KernelCapabilities.() -> Unit = {}): KernelCapabilities {
            return KernelCapabilities().also {
                it.init()
            }
        }
        /**
        * [KeyValuePair](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html)
        */
        fun keyValuePair(init: KeyValuePair.() -> Unit = {}): KeyValuePair {
            return KeyValuePair().also {
                it.init()
            }
        }
        /**
        * [LinuxParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html)
        */
        fun linuxParameters(init: LinuxParameters.() -> Unit = {}): LinuxParameters {
            return LinuxParameters().also {
                it.init()
            }
        }
        /**
        * [LogConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html)
        */
        fun logConfiguration(init: LogConfiguration.() -> Unit = {}): LogConfiguration {
            return LogConfiguration().also {
                it.init()
            }
        }
        /**
        * [MountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html)
        */
        fun mountPoint(init: MountPoint.() -> Unit = {}): MountPoint {
            return MountPoint().also {
                it.init()
            }
        }
        /**
        * [PortMapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html)
        */
        fun portMapping(init: PortMapping.() -> Unit = {}): PortMapping {
            return PortMapping().also {
                it.init()
            }
        }
        /**
        * [RepositoryCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html)
        */
        fun repositoryCredentials(init: RepositoryCredentials.() -> Unit = {}): RepositoryCredentials {
            return RepositoryCredentials().also {
                it.init()
            }
        }
        /**
        * [TaskDefinitionPlacementConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html)
        */
        fun taskDefinitionPlacementConstraint(init: TaskDefinitionPlacementConstraint.() -> Unit = {}): TaskDefinitionPlacementConstraint {
            return TaskDefinitionPlacementConstraint().also {
                it.init()
            }
        }
        /**
        * [Tmpfs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html)
        */
        fun tmpfs(init: Tmpfs.() -> Unit = {}): Tmpfs {
            return Tmpfs().also {
                it.init()
            }
        }
        /**
        * [Ulimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html)
        */
        fun ulimit(init: Ulimit.() -> Unit = {}): Ulimit {
            return Ulimit().also {
                it.init()
            }
        }
        /**
        * [Volume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html)
        */
        fun volume(init: Volume.() -> Unit = {}): Volume {
            return Volume().also {
                it.init()
            }
        }
        /**
        * [VolumeFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html)
        */
        fun volumeFrom(init: VolumeFrom.() -> Unit = {}): VolumeFrom {
            return VolumeFrom().also {
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
    class ContainerDefinition {
            /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var command: Any? = null

        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun command(value: List<String>) {
          this.command = value
        }
        
        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun command(vararg value: IntrinsicFunction) {
          this.command = value
        }

        /**
         * [cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var cpu: Any? = null

        /**
         * [cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cpu(value: Int) {
          this.cpu = value
        }
        
        /**
         * [cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cpu(value: IntrinsicFunction) {
          this.cpu = value
        }

        /**
         * [disableNetworking](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var disableNetworking: Any? = null

        /**
         * [disableNetworking](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableNetworking(value: Boolean) {
          this.disableNetworking = value
        }
        
        /**
         * [disableNetworking](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableNetworking(value: IntrinsicFunction) {
          this.disableNetworking = value
        }

        /**
         * [dnsSearchDomains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var dnsSearchDomains: Any? = null

        /**
         * [dnsSearchDomains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dnsSearchDomains(value: List<String>) {
          this.dnsSearchDomains = value
        }
        
        /**
         * [dnsSearchDomains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dnsSearchDomains(vararg value: IntrinsicFunction) {
          this.dnsSearchDomains = value
        }

        /**
         * [dnsServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var dnsServers: Any? = null

        /**
         * [dnsServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dnsServers(value: List<String>) {
          this.dnsServers = value
        }
        
        /**
         * [dnsServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dnsServers(vararg value: IntrinsicFunction) {
          this.dnsServers = value
        }

        /**
         * [dockerLabels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var dockerLabels: Any? = null

        /**
         * [dockerLabels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun dockerLabels(value: Map<String, Any>) {
          this.dockerLabels = value
        }
        
        /**
         * [dockerSecurityOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var dockerSecurityOptions: Any? = null

        /**
         * [dockerSecurityOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dockerSecurityOptions(value: List<String>) {
          this.dockerSecurityOptions = value
        }
        
        /**
         * [dockerSecurityOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dockerSecurityOptions(vararg value: IntrinsicFunction) {
          this.dockerSecurityOptions = value
        }

        /**
         * [entryPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var entryPoint: Any? = null

        /**
         * [entryPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun entryPoint(value: List<String>) {
          this.entryPoint = value
        }
        
        /**
         * [entryPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun entryPoint(vararg value: IntrinsicFunction) {
          this.entryPoint = value
        }

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment)
         *
         * _Required_: no
         *
         * _Type_: List<KeyValuePair>
         */
        var environment: Any? = null

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment)
         *
         * _Required_: no
         *
         * _Type_: List<KeyValuePair>
         */
        fun environment(value: List<KeyValuePair>) {
          this.environment = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment)
         *
         * _Required_: no
         *
         * _Type_: List<KeyValuePair>
         */
        fun environment(vararg value: IntrinsicFunction) {
          this.environment = value
        }

        /**
         * [essential](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var essential: Any? = null

        /**
         * [essential](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun essential(value: Boolean) {
          this.essential = value
        }
        
        /**
         * [essential](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun essential(value: IntrinsicFunction) {
          this.essential = value
        }

        /**
         * [extraHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts)
         *
         * _Required_: no
         *
         * _Type_: List<HostEntry>
         */
        var extraHosts: Any? = null

        /**
         * [extraHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts)
         *
         * _Required_: no
         *
         * _Type_: List<HostEntry>
         */
        fun extraHosts(value: List<HostEntry>) {
          this.extraHosts = value
        }
        
        /**
         * [extraHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts)
         *
         * _Required_: no
         *
         * _Type_: List<HostEntry>
         */
        fun extraHosts(vararg value: IntrinsicFunction) {
          this.extraHosts = value
        }

        /**
         * [healthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-healthcheck)
         *
         * _Required_: no
         *
         * _Type_: HealthCheck
         */
        var healthCheck: Any? = null

        /**
         * [healthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-healthcheck)
         *
         * _Required_: no
         *
         * _Type_: HealthCheck
         */
        fun healthCheck(value: HealthCheck) {
          this.healthCheck = value
        }
        
        /**
         * [healthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-healthcheck)
         *
         * _Required_: no
         *
         * _Type_: HealthCheck
         */
        fun healthCheck(value: IntrinsicFunction) {
          this.healthCheck = value
        }

        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var hostname: Any? = null

        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostname(value: String) {
          this.hostname = value
        }
        
        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostname(value: IntrinsicFunction) {
          this.hostname = value
        }

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var image: Any? = null

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun image(value: String) {
          this.image = value
        }
        
        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun image(value: IntrinsicFunction) {
          this.image = value
        }

        /**
         * [links](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var links: Any? = null

        /**
         * [links](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun links(value: List<String>) {
          this.links = value
        }
        
        /**
         * [links](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun links(vararg value: IntrinsicFunction) {
          this.links = value
        }

        /**
         * [linuxParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-linuxparameters)
         *
         * _Required_: no
         *
         * _Type_: LinuxParameters
         */
        var linuxParameters: Any? = null

        /**
         * [linuxParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-linuxparameters)
         *
         * _Required_: no
         *
         * _Type_: LinuxParameters
         */
        fun linuxParameters(value: LinuxParameters) {
          this.linuxParameters = value
        }
        
        /**
         * [linuxParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-linuxparameters)
         *
         * _Required_: no
         *
         * _Type_: LinuxParameters
         */
        fun linuxParameters(value: IntrinsicFunction) {
          this.linuxParameters = value
        }

        /**
         * [logConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration)
         *
         * _Required_: no
         *
         * _Type_: LogConfiguration
         */
        var logConfiguration: Any? = null

        /**
         * [logConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration)
         *
         * _Required_: no
         *
         * _Type_: LogConfiguration
         */
        fun logConfiguration(value: LogConfiguration) {
          this.logConfiguration = value
        }
        
        /**
         * [logConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration)
         *
         * _Required_: no
         *
         * _Type_: LogConfiguration
         */
        fun logConfiguration(value: IntrinsicFunction) {
          this.logConfiguration = value
        }

        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var memory: Any? = null

        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memory(value: Int) {
          this.memory = value
        }
        
        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memory(value: IntrinsicFunction) {
          this.memory = value
        }

        /**
         * [memoryReservation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var memoryReservation: Any? = null

        /**
         * [memoryReservation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memoryReservation(value: Int) {
          this.memoryReservation = value
        }
        
        /**
         * [memoryReservation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memoryReservation(value: IntrinsicFunction) {
          this.memoryReservation = value
        }

        /**
         * [mountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints)
         *
         * _Required_: no
         *
         * _Type_: List<MountPoint>
         */
        var mountPoints: Any? = null

        /**
         * [mountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints)
         *
         * _Required_: no
         *
         * _Type_: List<MountPoint>
         */
        fun mountPoints(value: List<MountPoint>) {
          this.mountPoints = value
        }
        
        /**
         * [mountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints)
         *
         * _Required_: no
         *
         * _Type_: List<MountPoint>
         */
        fun mountPoints(vararg value: IntrinsicFunction) {
          this.mountPoints = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [portMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings)
         *
         * _Required_: no
         *
         * _Type_: List<PortMapping>
         */
        var portMappings: Any? = null

        /**
         * [portMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings)
         *
         * _Required_: no
         *
         * _Type_: List<PortMapping>
         */
        fun portMappings(value: List<PortMapping>) {
          this.portMappings = value
        }
        
        /**
         * [portMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings)
         *
         * _Required_: no
         *
         * _Type_: List<PortMapping>
         */
        fun portMappings(vararg value: IntrinsicFunction) {
          this.portMappings = value
        }

        /**
         * [privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var privileged: Any? = null

        /**
         * [privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privileged(value: Boolean) {
          this.privileged = value
        }
        
        /**
         * [privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privileged(value: IntrinsicFunction) {
          this.privileged = value
        }

        /**
         * [readonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var readonlyRootFilesystem: Any? = null

        /**
         * [readonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readonlyRootFilesystem(value: Boolean) {
          this.readonlyRootFilesystem = value
        }
        
        /**
         * [readonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readonlyRootFilesystem(value: IntrinsicFunction) {
          this.readonlyRootFilesystem = value
        }

        /**
         * [repositoryCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-repositorycredentials)
         *
         * _Required_: no
         *
         * _Type_: RepositoryCredentials
         */
        var repositoryCredentials: Any? = null

        /**
         * [repositoryCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-repositorycredentials)
         *
         * _Required_: no
         *
         * _Type_: RepositoryCredentials
         */
        fun repositoryCredentials(value: RepositoryCredentials) {
          this.repositoryCredentials = value
        }
        
        /**
         * [repositoryCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-repositorycredentials)
         *
         * _Required_: no
         *
         * _Type_: RepositoryCredentials
         */
        fun repositoryCredentials(value: IntrinsicFunction) {
          this.repositoryCredentials = value
        }

        /**
         * [ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits)
         *
         * _Required_: no
         *
         * _Type_: List<Ulimit>
         */
        var ulimits: Any? = null

        /**
         * [ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits)
         *
         * _Required_: no
         *
         * _Type_: List<Ulimit>
         */
        fun ulimits(value: List<Ulimit>) {
          this.ulimits = value
        }
        
        /**
         * [ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits)
         *
         * _Required_: no
         *
         * _Type_: List<Ulimit>
         */
        fun ulimits(vararg value: IntrinsicFunction) {
          this.ulimits = value
        }

        /**
         * [user](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var user: Any? = null

        /**
         * [user](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun user(value: String) {
          this.user = value
        }
        
        /**
         * [user](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun user(value: IntrinsicFunction) {
          this.user = value
        }

        /**
         * [volumesFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom)
         *
         * _Required_: no
         *
         * _Type_: List<VolumeFrom>
         */
        var volumesFrom: Any? = null

        /**
         * [volumesFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom)
         *
         * _Required_: no
         *
         * _Type_: List<VolumeFrom>
         */
        fun volumesFrom(value: List<VolumeFrom>) {
          this.volumesFrom = value
        }
        
        /**
         * [volumesFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom)
         *
         * _Required_: no
         *
         * _Type_: List<VolumeFrom>
         */
        fun volumesFrom(vararg value: IntrinsicFunction) {
          this.volumesFrom = value
        }

        /**
         * [workingDirectory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var workingDirectory: Any? = null

        /**
         * [workingDirectory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun workingDirectory(value: String) {
          this.workingDirectory = value
        }
        
        /**
         * [workingDirectory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun workingDirectory(value: IntrinsicFunction) {
          this.workingDirectory = value
        }

    }

    @CloudFormationMarker
    class Device {
            /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerPath: Any? = null

        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: String) {
          this.containerPath = value
        }
        
        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: IntrinsicFunction) {
          this.containerPath = value
        }

        /**
         * [hostPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hostPath: Any? = null

        /**
         * [hostPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostPath(value: String) {
          this.hostPath = value
        }
        
        /**
         * [hostPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostPath(value: IntrinsicFunction) {
          this.hostPath = value
        }

        /**
         * [permissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var permissions: Any? = null

        /**
         * [permissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun permissions(value: List<String>) {
          this.permissions = value
        }
        
        /**
         * [permissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun permissions(vararg value: IntrinsicFunction) {
          this.permissions = value
        }

    }

    @CloudFormationMarker
    class DockerVolumeConfiguration {
            /**
         * [autoprovision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var autoprovision: Any? = null

        /**
         * [autoprovision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoprovision(value: Boolean) {
          this.autoprovision = value
        }
        
        /**
         * [autoprovision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoprovision(value: IntrinsicFunction) {
          this.autoprovision = value
        }

        /**
         * [driver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var driver: Any? = null

        /**
         * [driver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun driver(value: String) {
          this.driver = value
        }
        
        /**
         * [driver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun driver(value: IntrinsicFunction) {
          this.driver = value
        }

        /**
         * [driverOpts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var driverOpts: Any? = null

        /**
         * [driverOpts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun driverOpts(value: Map<String, Any>) {
          this.driverOpts = value
        }
        
        /**
         * [labels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var labels: Any? = null

        /**
         * [labels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun labels(value: Map<String, Any>) {
          this.labels = value
        }
        
        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var scope: Any? = null

        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scope(value: String) {
          this.scope = value
        }
        
        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scope(value: IntrinsicFunction) {
          this.scope = value
        }

    }

    @CloudFormationMarker
    class HealthCheck {
            /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var command: Any? = null

        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun command(value: List<String>) {
          this.command = value
        }
        
        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun command(vararg value: IntrinsicFunction) {
          this.command = value
        }

        /**
         * [interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var interval: Any? = null

        /**
         * [interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun interval(value: Int) {
          this.interval = value
        }
        
        /**
         * [interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun interval(value: IntrinsicFunction) {
          this.interval = value
        }

        /**
         * [retries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var retries: Any? = null

        /**
         * [retries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retries(value: Int) {
          this.retries = value
        }
        
        /**
         * [retries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retries(value: IntrinsicFunction) {
          this.retries = value
        }

        /**
         * [startPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var startPeriod: Any? = null

        /**
         * [startPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun startPeriod(value: Int) {
          this.startPeriod = value
        }
        
        /**
         * [startPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun startPeriod(value: IntrinsicFunction) {
          this.startPeriod = value
        }

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var timeout: Any? = null

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: Int) {
          this.timeout = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
        }

    }

    @CloudFormationMarker
    class HostEntry {
            /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hostname: Any? = null

        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostname(value: String) {
          this.hostname = value
        }
        
        /**
         * [hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostname(value: IntrinsicFunction) {
          this.hostname = value
        }

        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ipAddress: Any? = null

        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipAddress(value: String) {
          this.ipAddress = value
        }
        
        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipAddress(value: IntrinsicFunction) {
          this.ipAddress = value
        }

    }

    @CloudFormationMarker
    class HostVolumeProperties {
            /**
         * [sourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourcePath: Any? = null

        /**
         * [sourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourcePath(value: String) {
          this.sourcePath = value
        }
        
        /**
         * [sourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourcePath(value: IntrinsicFunction) {
          this.sourcePath = value
        }

    }

    @CloudFormationMarker
    class KernelCapabilities {
            /**
         * [add](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var add: Any? = null

        /**
         * [add](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun add(value: List<String>) {
          this.add = value
        }
        
        /**
         * [add](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun add(vararg value: IntrinsicFunction) {
          this.add = value
        }

        /**
         * [drop](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var drop: Any? = null

        /**
         * [drop](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun drop(value: List<String>) {
          this.drop = value
        }
        
        /**
         * [drop](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun drop(vararg value: IntrinsicFunction) {
          this.drop = value
        }

    }

    @CloudFormationMarker
    class KeyValuePair {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class LinuxParameters {
            /**
         * [capabilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-capabilities)
         *
         * _Required_: no
         *
         * _Type_: KernelCapabilities
         */
        var capabilities: Any? = null

        /**
         * [capabilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-capabilities)
         *
         * _Required_: no
         *
         * _Type_: KernelCapabilities
         */
        fun capabilities(value: KernelCapabilities) {
          this.capabilities = value
        }
        
        /**
         * [capabilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-capabilities)
         *
         * _Required_: no
         *
         * _Type_: KernelCapabilities
         */
        fun capabilities(value: IntrinsicFunction) {
          this.capabilities = value
        }

        /**
         * [devices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices)
         *
         * _Required_: no
         *
         * _Type_: List<Device>
         */
        var devices: Any? = null

        /**
         * [devices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices)
         *
         * _Required_: no
         *
         * _Type_: List<Device>
         */
        fun devices(value: List<Device>) {
          this.devices = value
        }
        
        /**
         * [devices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices)
         *
         * _Required_: no
         *
         * _Type_: List<Device>
         */
        fun devices(vararg value: IntrinsicFunction) {
          this.devices = value
        }

        /**
         * [initProcessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var initProcessEnabled: Any? = null

        /**
         * [initProcessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun initProcessEnabled(value: Boolean) {
          this.initProcessEnabled = value
        }
        
        /**
         * [initProcessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun initProcessEnabled(value: IntrinsicFunction) {
          this.initProcessEnabled = value
        }

        /**
         * [sharedMemorySize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var sharedMemorySize: Any? = null

        /**
         * [sharedMemorySize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun sharedMemorySize(value: Int) {
          this.sharedMemorySize = value
        }
        
        /**
         * [sharedMemorySize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun sharedMemorySize(value: IntrinsicFunction) {
          this.sharedMemorySize = value
        }

        /**
         * [tmpfs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs)
         *
         * _Required_: no
         *
         * _Type_: List<Tmpfs>
         */
        var tmpfs: Any? = null

        /**
         * [tmpfs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs)
         *
         * _Required_: no
         *
         * _Type_: List<Tmpfs>
         */
        fun tmpfs(value: List<Tmpfs>) {
          this.tmpfs = value
        }
        
        /**
         * [tmpfs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs)
         *
         * _Required_: no
         *
         * _Type_: List<Tmpfs>
         */
        fun tmpfs(vararg value: IntrinsicFunction) {
          this.tmpfs = value
        }

    }

    @CloudFormationMarker
    class LogConfiguration {
            /**
         * [logDriver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var logDriver: Any? = null

        /**
         * [logDriver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logDriver(value: String) {
          this.logDriver = value
        }
        
        /**
         * [logDriver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logDriver(value: IntrinsicFunction) {
          this.logDriver = value
        }

        /**
         * [options](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var options: Any? = null

        /**
         * [options](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun options(value: Map<String, Any>) {
          this.options = value
        }
        
    }

    @CloudFormationMarker
    class MountPoint {
            /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerPath: Any? = null

        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: String) {
          this.containerPath = value
        }
        
        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: IntrinsicFunction) {
          this.containerPath = value
        }

        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var readOnly: Any? = null

        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readOnly(value: Boolean) {
          this.readOnly = value
        }
        
        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readOnly(value: IntrinsicFunction) {
          this.readOnly = value
        }

        /**
         * [sourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceVolume: Any? = null

        /**
         * [sourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceVolume(value: String) {
          this.sourceVolume = value
        }
        
        /**
         * [sourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceVolume(value: IntrinsicFunction) {
          this.sourceVolume = value
        }

    }

    @CloudFormationMarker
    class PortMapping {
            /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var containerPort: Any? = null

        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun containerPort(value: Int) {
          this.containerPort = value
        }
        
        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun containerPort(value: IntrinsicFunction) {
          this.containerPort = value
        }

        /**
         * [hostPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var hostPort: Any? = null

        /**
         * [hostPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hostPort(value: Int) {
          this.hostPort = value
        }
        
        /**
         * [hostPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hostPort(value: IntrinsicFunction) {
          this.hostPort = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

    }

    @CloudFormationMarker
    class RepositoryCredentials {
            /**
         * [credentialsParameter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var credentialsParameter: Any? = null

        /**
         * [credentialsParameter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun credentialsParameter(value: String) {
          this.credentialsParameter = value
        }
        
        /**
         * [credentialsParameter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun credentialsParameter(value: IntrinsicFunction) {
          this.credentialsParameter = value
        }

    }

    @CloudFormationMarker
    class TaskDefinitionPlacementConstraint {
            /**
         * [expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var expression: Any? = null

        /**
         * [expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun expression(value: String) {
          this.expression = value
        }
        
        /**
         * [expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun expression(value: IntrinsicFunction) {
          this.expression = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type)
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
    class Tmpfs {
            /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerPath: Any? = null

        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: String) {
          this.containerPath = value
        }
        
        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: IntrinsicFunction) {
          this.containerPath = value
        }

        /**
         * [mountOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var mountOptions: Any? = null

        /**
         * [mountOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun mountOptions(value: List<String>) {
          this.mountOptions = value
        }
        
        /**
         * [mountOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun mountOptions(vararg value: IntrinsicFunction) {
          this.mountOptions = value
        }

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var size: Any? = null

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun size(value: Int) {
          this.size = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun size(value: IntrinsicFunction) {
          this.size = value
        }

    }

    @CloudFormationMarker
    class Ulimit {
            /**
         * [hardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-hardlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var hardLimit: Any? = null

        /**
         * [hardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-hardlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun hardLimit(value: Int) {
          this.hardLimit = value
        }
        
        /**
         * [hardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-hardlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun hardLimit(value: IntrinsicFunction) {
          this.hardLimit = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [softLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-softlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var softLimit: Any? = null

        /**
         * [softLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-softlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun softLimit(value: Int) {
          this.softLimit = value
        }
        
        /**
         * [softLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-softlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun softLimit(value: IntrinsicFunction) {
          this.softLimit = value
        }

    }

    @CloudFormationMarker
    class Volume {
            /**
         * [dockerVolumeConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volume-dockervolumeconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DockerVolumeConfiguration
         */
        var dockerVolumeConfiguration: Any? = null

        /**
         * [dockerVolumeConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volume-dockervolumeconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DockerVolumeConfiguration
         */
        fun dockerVolumeConfiguration(value: DockerVolumeConfiguration) {
          this.dockerVolumeConfiguration = value
        }
        
        /**
         * [dockerVolumeConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volume-dockervolumeconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DockerVolumeConfiguration
         */
        fun dockerVolumeConfiguration(value: IntrinsicFunction) {
          this.dockerVolumeConfiguration = value
        }

        /**
         * [host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-host)
         *
         * _Required_: no
         *
         * _Type_: HostVolumeProperties
         */
        var host: Any? = null

        /**
         * [host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-host)
         *
         * _Required_: no
         *
         * _Type_: HostVolumeProperties
         */
        fun host(value: HostVolumeProperties) {
          this.host = value
        }
        
        /**
         * [host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-host)
         *
         * _Required_: no
         *
         * _Type_: HostVolumeProperties
         */
        fun host(value: IntrinsicFunction) {
          this.host = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class VolumeFrom {
            /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var readOnly: Any? = null

        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readOnly(value: Boolean) {
          this.readOnly = value
        }
        
        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readOnly(value: IntrinsicFunction) {
          this.readOnly = value
        }

        /**
         * [sourceContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceContainer: Any? = null

        /**
         * [sourceContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceContainer(value: String) {
          this.sourceContainer = value
        }
        
        /**
         * [sourceContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceContainer(value: IntrinsicFunction) {
          this.sourceContainer = value
        }

    }

}

/**
 * [AWS::ECS::TaskDefinition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html)
 */
fun Resources.awsECSTaskDefinition(logicalId: String, init: AWSECSTaskDefinition.() -> Unit = {}): AWSECSTaskDefinition {
    return AWSECSTaskDefinition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
