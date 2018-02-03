
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ContainerDefinition(
            /**
             * [Command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val command: List<String>? = null,
            /**
             * [Cpu](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val cpu: Int? = null,
            /**
             * [DisableNetworking](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val disableNetworking: Boolean? = null,
            /**
             * [DnsSearchDomains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val dnsSearchDomains: List<String>? = null,
            /**
             * [DnsServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val dnsServers: List<String>? = null,
            /**
             * [DockerLabels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val dockerLabels: Map<String, Any>? = null,
            /**
             * [DockerSecurityOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val dockerSecurityOptions: List<String>? = null,
            /**
             * [EntryPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val entryPoint: List<String>? = null,
            /**
             * [Environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment)
             *
             * _Required_: no
             *
             * _Type_: List<KeyValuePair>
             */
            val environment: List<KeyValuePair>? = null,
            /**
             * [Essential](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val essential: Boolean? = null,
            /**
             * [ExtraHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts)
             *
             * _Required_: no
             *
             * _Type_: List<HostEntry>
             */
            val extraHosts: List<HostEntry>? = null,
            /**
             * [Hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hostname: String? = null,
            /**
             * [Image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val image: String? = null,
            /**
             * [Links](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val links: List<String>? = null,
            /**
             * [LinuxParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-linuxparameters)
             *
             * _Required_: no
             *
             * _Type_: LinuxParameters
             */
            val linuxParameters: LinuxParameters? = null,
            /**
             * [LogConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration)
             *
             * _Required_: no
             *
             * _Type_: LogConfiguration
             */
            val logConfiguration: LogConfiguration? = null,
            /**
             * [Memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val memory: Int? = null,
            /**
             * [MemoryReservation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val memoryReservation: Int? = null,
            /**
             * [MountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints)
             *
             * _Required_: no
             *
             * _Type_: List<MountPoint>
             */
            val mountPoints: List<MountPoint>? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [PortMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings)
             *
             * _Required_: no
             *
             * _Type_: List<PortMapping>
             */
            val portMappings: List<PortMapping>? = null,
            /**
             * [Privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val privileged: Boolean? = null,
            /**
             * [ReadonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val readonlyRootFilesystem: Boolean? = null,
            /**
             * [Ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits)
             *
             * _Required_: no
             *
             * _Type_: List<Ulimit>
             */
            val ulimits: List<Ulimit>? = null,
            /**
             * [User](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val user: String? = null,
            /**
             * [VolumesFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom)
             *
             * _Required_: no
             *
             * _Type_: List<VolumeFrom>
             */
            val volumesFrom: List<VolumeFrom>? = null,
            /**
             * [WorkingDirectory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val workingDirectory: String? = null
    )

    class Device(
            /**
             * [ContainerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val containerPath: String? = null,
            /**
             * [HostPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val hostPath: String,
            /**
             * [Permissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val permissions: List<String>? = null
    )

    class HostEntry(
            /**
             * [Hostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-hostname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val hostname: String,
            /**
             * [IpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-hostentry.html#cfn-ecs-taskdefinition-containerdefinition-hostentry-ipaddress)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ipAddress: String
    )

    class HostVolumeProperties(
            /**
             * [SourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html#cfn-ecs-taskdefinition-volumes-host-sourcepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourcePath: String? = null
    )

    class KernelCapabilities(
            /**
             * [Add](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val add: List<String>? = null,
            /**
             * [Drop](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val drop: List<String>? = null
    )

    class KeyValuePair(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-environment.html#cfn-ecs-taskdefinition-containerdefinition-environment-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class LinuxParameters(
            /**
             * [Capabilities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-capabilities)
             *
             * _Required_: no
             *
             * _Type_: KernelCapabilities
             */
            val capabilities: KernelCapabilities? = null,
            /**
             * [Devices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices)
             *
             * _Required_: no
             *
             * _Type_: List<Device>
             */
            val devices: List<Device>? = null,
            /**
             * [InitProcessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val initProcessEnabled: Boolean? = null
    )

    class LogConfiguration(
            /**
             * [LogDriver](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-logdriver)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val logDriver: String,
            /**
             * [Options](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration-options)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val options: Map<String, Any>? = null
    )

    class MountPoint(
            /**
             * [ContainerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val containerPath: String? = null,
            /**
             * [ReadOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val readOnly: Boolean? = null,
            /**
             * [SourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceVolume: String? = null
    )

    class PortMapping(
            /**
             * [ContainerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val containerPort: Int? = null,
            /**
             * [HostPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val hostPort: Int? = null,
            /**
             * [Protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val protocol: String? = null
    )

    class TaskDefinitionPlacementConstraint(
            /**
             * [Expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val expression: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class Ulimit(
            /**
             * [HardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-hardlimit)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val hardLimit: Int,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [SoftLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-ulimit.html#cfn-ecs-taskdefinition-containerdefinition-ulimit-softlimit)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val softLimit: Int
    )

    class Volume(
            /**
             * [Host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-host)
             *
             * _Required_: no
             *
             * _Type_: HostVolumeProperties
             */
            val host: HostVolumeProperties? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class VolumeFrom(
            /**
             * [ReadOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-readonly)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val readOnly: Boolean? = null,
            /**
             * [SourceContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-volumesfrom.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom-sourcecontainer)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceContainer: String? = null
    )

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
