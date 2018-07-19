
package ktformation.generated

import ktformation.*

/**
 * [AWS::Batch::JobDefinition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
 */
@CloudFormationMarker
class AWSBatchJobDefinition(logicalId: String) : Resource<AWSBatchJobDefinition.Properties>(logicalId, "AWS::Batch::JobDefinition") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [containerProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
         *
         * _Required_: yes
         *
         * _Type_: ContainerProperties
         */
        @JvmField
        var containerProperties: Any? = null

        /**
         * [containerProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
         *
         * _Required_: yes
         *
         * _Type_: ContainerProperties
         */
        fun containerProperties(value: ContainerProperties) {
          this.containerProperties = value
        }
        
        /**
         * [containerProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-containerproperties)
         *
         * _Required_: yes
         *
         * _Type_: ContainerProperties
         */
        fun containerProperties(value: IntrinsicFunction) {
          this.containerProperties = value
        }

        /**
         * [jobDefinitionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var jobDefinitionName: Any? = null

        /**
         * [jobDefinitionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobDefinitionName(value: String) {
          this.jobDefinitionName = value
        }
        
        /**
         * [jobDefinitionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobDefinitionName(value: IntrinsicFunction) {
          this.jobDefinitionName = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [retryStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
         *
         * _Required_: no
         *
         * _Type_: RetryStrategy
         */
        @JvmField
        var retryStrategy: Any? = null

        /**
         * [retryStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
         *
         * _Required_: no
         *
         * _Type_: RetryStrategy
         */
        fun retryStrategy(value: RetryStrategy) {
          this.retryStrategy = value
        }
        
        /**
         * [retryStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-retrystrategy)
         *
         * _Required_: no
         *
         * _Type_: RetryStrategy
         */
        fun retryStrategy(value: IntrinsicFunction) {
          this.retryStrategy = value
        }

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
         *
         * _Required_: no
         *
         * _Type_: Timeout
         */
        @JvmField
        var timeout: Any? = null

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
         *
         * _Required_: no
         *
         * _Type_: Timeout
         */
        fun timeout(value: Timeout) {
          this.timeout = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-timeout)
         *
         * _Required_: no
         *
         * _Type_: Timeout
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
        * [ContainerProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html)
        */
        fun containerProperties(init: ContainerProperties.() -> Unit = {}): ContainerProperties {
            return ContainerProperties().also {
                it.init()
            }
        }
        /**
        * [Environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html)
        */
        fun environment(init: Environment.() -> Unit = {}): Environment {
            return Environment().also {
                it.init()
            }
        }
        /**
        * [MountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html)
        */
        fun mountPoints(init: MountPoints.() -> Unit = {}): MountPoints {
            return MountPoints().also {
                it.init()
            }
        }
        /**
        * [RetryStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html)
        */
        fun retryStrategy(init: RetryStrategy.() -> Unit = {}): RetryStrategy {
            return RetryStrategy().also {
                it.init()
            }
        }
        /**
        * [Timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html)
        */
        fun timeout(init: Timeout.() -> Unit = {}): Timeout {
            return Timeout().also {
                it.init()
            }
        }
        /**
        * [Ulimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html)
        */
        fun ulimit(init: Ulimit.() -> Unit = {}): Ulimit {
            return Ulimit().also {
                it.init()
            }
        }
        /**
        * [Volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html)
        */
        fun volumes(init: Volumes.() -> Unit = {}): Volumes {
            return Volumes().also {
                it.init()
            }
        }
        /**
        * [VolumesHost](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html)
        */
        fun volumesHost(init: VolumesHost.() -> Unit = {}): VolumesHost {
            return VolumesHost().also {
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
    class ContainerProperties {
            /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var command: Any? = null

        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun command(value: List<String>) {
          this.command = value
        }
        
        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun command(vararg value: IntrinsicFunction) {
          this.command = value
        }

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment)
         *
         * _Required_: no
         *
         * _Type_: List<Environment>
         */
        var environment: Any? = null

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment)
         *
         * _Required_: no
         *
         * _Type_: List<Environment>
         */
        fun environment(value: List<Environment>) {
          this.environment = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment)
         *
         * _Required_: no
         *
         * _Type_: List<Environment>
         */
        fun environment(vararg value: IntrinsicFunction) {
          this.environment = value
        }

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var image: Any? = null

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun image(value: String) {
          this.image = value
        }
        
        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun image(value: IntrinsicFunction) {
          this.image = value
        }

        /**
         * [jobRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var jobRoleArn: Any? = null

        /**
         * [jobRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobRoleArn(value: String) {
          this.jobRoleArn = value
        }
        
        /**
         * [jobRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobRoleArn(value: IntrinsicFunction) {
          this.jobRoleArn = value
        }

        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var memory: Any? = null

        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun memory(value: Int) {
          this.memory = value
        }
        
        /**
         * [memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun memory(value: IntrinsicFunction) {
          this.memory = value
        }

        /**
         * [mountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints)
         *
         * _Required_: no
         *
         * _Type_: List<MountPoints>
         */
        var mountPoints: Any? = null

        /**
         * [mountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints)
         *
         * _Required_: no
         *
         * _Type_: List<MountPoints>
         */
        fun mountPoints(value: List<MountPoints>) {
          this.mountPoints = value
        }
        
        /**
         * [mountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints)
         *
         * _Required_: no
         *
         * _Type_: List<MountPoints>
         */
        fun mountPoints(vararg value: IntrinsicFunction) {
          this.mountPoints = value
        }

        /**
         * [privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var privileged: Any? = null

        /**
         * [privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privileged(value: Boolean) {
          this.privileged = value
        }
        
        /**
         * [privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privileged(value: IntrinsicFunction) {
          this.privileged = value
        }

        /**
         * [readonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var readonlyRootFilesystem: Any? = null

        /**
         * [readonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readonlyRootFilesystem(value: Boolean) {
          this.readonlyRootFilesystem = value
        }
        
        /**
         * [readonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readonlyRootFilesystem(value: IntrinsicFunction) {
          this.readonlyRootFilesystem = value
        }

        /**
         * [ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits)
         *
         * _Required_: no
         *
         * _Type_: List<Ulimit>
         */
        var ulimits: Any? = null

        /**
         * [ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits)
         *
         * _Required_: no
         *
         * _Type_: List<Ulimit>
         */
        fun ulimits(value: List<Ulimit>) {
          this.ulimits = value
        }
        
        /**
         * [ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits)
         *
         * _Required_: no
         *
         * _Type_: List<Ulimit>
         */
        fun ulimits(vararg value: IntrinsicFunction) {
          this.ulimits = value
        }

        /**
         * [user](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var user: Any? = null

        /**
         * [user](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun user(value: String) {
          this.user = value
        }
        
        /**
         * [user](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun user(value: IntrinsicFunction) {
          this.user = value
        }

        /**
         * [vcpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var vcpus: Any? = null

        /**
         * [vcpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun vcpus(value: Int) {
          this.vcpus = value
        }
        
        /**
         * [vcpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun vcpus(value: IntrinsicFunction) {
          this.vcpus = value
        }

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volumes>
         */
        var volumes: Any? = null

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volumes>
         */
        fun volumes(value: List<Volumes>) {
          this.volumes = value
        }
        
        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volumes>
         */
        fun volumes(vararg value: IntrinsicFunction) {
          this.volumes = value
        }

    }

    @CloudFormationMarker
    class Environment {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-value)
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
    class MountPoints {
            /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerPath: Any? = null

        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: String) {
          this.containerPath = value
        }
        
        /**
         * [containerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerPath(value: IntrinsicFunction) {
          this.containerPath = value
        }

        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var readOnly: Any? = null

        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readOnly(value: Boolean) {
          this.readOnly = value
        }
        
        /**
         * [readOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun readOnly(value: IntrinsicFunction) {
          this.readOnly = value
        }

        /**
         * [sourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceVolume: Any? = null

        /**
         * [sourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceVolume(value: String) {
          this.sourceVolume = value
        }
        
        /**
         * [sourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume)
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
    class RetryStrategy {
            /**
         * [attempts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var attempts: Any? = null

        /**
         * [attempts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun attempts(value: Int) {
          this.attempts = value
        }
        
        /**
         * [attempts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun attempts(value: IntrinsicFunction) {
          this.attempts = value
        }

    }

    @CloudFormationMarker
    class Timeout {
            /**
         * [attemptDurationSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var attemptDurationSeconds: Any? = null

        /**
         * [attemptDurationSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun attemptDurationSeconds(value: Int) {
          this.attemptDurationSeconds = value
        }
        
        /**
         * [attemptDurationSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun attemptDurationSeconds(value: IntrinsicFunction) {
          this.attemptDurationSeconds = value
        }

    }

    @CloudFormationMarker
    class Ulimit {
            /**
         * [hardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var hardLimit: Any? = null

        /**
         * [hardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun hardLimit(value: Int) {
          this.hardLimit = value
        }
        
        /**
         * [hardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun hardLimit(value: IntrinsicFunction) {
          this.hardLimit = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [softLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var softLimit: Any? = null

        /**
         * [softLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun softLimit(value: Int) {
          this.softLimit = value
        }
        
        /**
         * [softLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit)
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
    class Volumes {
            /**
         * [host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-host)
         *
         * _Required_: no
         *
         * _Type_: VolumesHost
         */
        var host: Any? = null

        /**
         * [host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-host)
         *
         * _Required_: no
         *
         * _Type_: VolumesHost
         */
        fun host(value: VolumesHost) {
          this.host = value
        }
        
        /**
         * [host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-host)
         *
         * _Required_: no
         *
         * _Type_: VolumesHost
         */
        fun host(value: IntrinsicFunction) {
          this.host = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name)
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
    class VolumesHost {
            /**
         * [sourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourcePath: Any? = null

        /**
         * [sourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourcePath(value: String) {
          this.sourcePath = value
        }
        
        /**
         * [sourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourcePath(value: IntrinsicFunction) {
          this.sourcePath = value
        }

    }

}

/**
 * [AWS::Batch::JobDefinition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html)
 */
fun Resources.awsBatchJobDefinition(logicalId: String, init: AWSBatchJobDefinition.() -> Unit = {}): AWSBatchJobDefinition {
    return AWSBatchJobDefinition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
