
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ContainerProperties(
            /**
             * [Command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val command: List<String>? = null,
            /**
             * [Environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment)
             *
             * _Required_: no
             *
             * _Type_: List<Environment>
             */
            val environment: List<Environment>? = null,
            /**
             * [Image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val image: String,
            /**
             * [JobRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val jobRoleArn: String? = null,
            /**
             * [Memory](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val memory: Int,
            /**
             * [MountPoints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints)
             *
             * _Required_: no
             *
             * _Type_: List<MountPoints>
             */
            val mountPoints: List<MountPoints>? = null,
            /**
             * [Privileged](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val privileged: Boolean? = null,
            /**
             * [ReadonlyRootFilesystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val readonlyRootFilesystem: Boolean? = null,
            /**
             * [Ulimits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits)
             *
             * _Required_: no
             *
             * _Type_: List<Ulimit>
             */
            val ulimits: List<Ulimit>? = null,
            /**
             * [User](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val user: String? = null,
            /**
             * [Vcpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val vcpus: Int,
            /**
             * [Volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes)
             *
             * _Required_: no
             *
             * _Type_: List<Volumes>
             */
            val volumes: List<Volumes>? = null
    )

    class Environment(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-environment.html#cfn-batch-jobdefinition-environment-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class MountPoints(
            /**
             * [ContainerPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-containerpath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val containerPath: String? = null,
            /**
             * [ReadOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-readonly)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val readOnly: Boolean? = null,
            /**
             * [SourceVolume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-mountpoints.html#cfn-batch-jobdefinition-mountpoints-sourcevolume)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceVolume: String? = null
    )

    class RetryStrategy(
            /**
             * [Attempts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val attempts: Int? = null
    )

    class Timeout(
            /**
             * [AttemptDurationSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val attemptDurationSeconds: Int? = null
    )

    class Ulimit(
            /**
             * [HardLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-hardlimit)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val hardLimit: Int,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [SoftLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html#cfn-batch-jobdefinition-ulimit-softlimit)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val softLimit: Int
    )

    class Volumes(
            /**
             * [Host](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-host)
             *
             * _Required_: no
             *
             * _Type_: VolumesHost
             */
            val host: VolumesHost? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html#cfn-batch-jobdefinition-volumes-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class VolumesHost(
            /**
             * [SourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html#cfn-batch-jobdefinition-volumeshost-sourcepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourcePath: String? = null
    )

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
