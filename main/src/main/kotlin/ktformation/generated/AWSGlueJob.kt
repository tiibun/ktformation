
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Job - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html)
 */
@CloudFormationMarker
class AWSGlueJob(logicalId: String) : Resource<AWSGlueJob.Properties>(logicalId, "AWS::Glue::Job") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allocatedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        @JvmField
        var allocatedCapacity: Any? = null

        /**
         * [allocatedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun allocatedCapacity(value: Double) {
          this.allocatedCapacity = value
        }
        
        /**
         * [allocatedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun allocatedCapacity(value: IntrinsicFunction) {
          this.allocatedCapacity = value
        }
        
        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
         *
         * _Required_: yes
         *
         * _Type_: JobCommand
         */
        @JvmField
        var command: Any? = null

        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
         *
         * _Required_: yes
         *
         * _Type_: JobCommand
         */
        fun command(value: JobCommand) {
          this.command = value
        }
        
        /**
         * [command](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-command)
         *
         * _Required_: yes
         *
         * _Type_: JobCommand
         */
        fun command(value: IntrinsicFunction) {
          this.command = value
        }
        
        /**
         * [connections](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
         *
         * _Required_: no
         *
         * _Type_: ConnectionsList
         */
        @JvmField
        var connections: Any? = null

        /**
         * [connections](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
         *
         * _Required_: no
         *
         * _Type_: ConnectionsList
         */
        fun connections(value: ConnectionsList) {
          this.connections = value
        }
        
        /**
         * [connections](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-connections)
         *
         * _Required_: no
         *
         * _Type_: ConnectionsList
         */
        fun connections(value: IntrinsicFunction) {
          this.connections = value
        }
        
        /**
         * [defaultArguments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var defaultArguments: Any? = null

        /**
         * [defaultArguments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun defaultArguments(value: Json) {
          this.defaultArguments = value
        }
        
        /**
         * [defaultArguments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun defaultArguments(value: IntrinsicFunction) {
          this.defaultArguments = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [executionProperty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
         *
         * _Required_: no
         *
         * _Type_: ExecutionProperty
         */
        @JvmField
        var executionProperty: Any? = null

        /**
         * [executionProperty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
         *
         * _Required_: no
         *
         * _Type_: ExecutionProperty
         */
        fun executionProperty(value: ExecutionProperty) {
          this.executionProperty = value
        }
        
        /**
         * [executionProperty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-executionproperty)
         *
         * _Required_: no
         *
         * _Type_: ExecutionProperty
         */
        fun executionProperty(value: IntrinsicFunction) {
          this.executionProperty = value
        }
        
        /**
         * [logUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var logUri: Any? = null

        /**
         * [logUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logUri(value: String) {
          this.logUri = value
        }
        
        /**
         * [logUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logUri(value: IntrinsicFunction) {
          this.logUri = value
        }
        
        /**
         * [maxRetries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        @JvmField
        var maxRetries: Any? = null

        /**
         * [maxRetries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun maxRetries(value: Double) {
          this.maxRetries = value
        }
        
        /**
         * [maxRetries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun maxRetries(value: IntrinsicFunction) {
          this.maxRetries = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var role: Any? = null

        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: String) {
          this.role = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: IntrinsicFunction) {
          this.role = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConnectionsList(
            /**
             * [Connections](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html#cfn-glue-job-connectionslist-connections)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val connections: List<String>? = null
    )

    class ExecutionProperty(
            /**
             * [MaxConcurrentRuns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val maxConcurrentRuns: Double? = null
    )

    class JobCommand(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [ScriptLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html#cfn-glue-job-jobcommand-scriptlocation)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val scriptLocation: String? = null
    )

}

/**
 * [AWS::Glue::Job - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html)
 */
fun Resources.awsGlueJob(logicalId: String, init: AWSGlueJob.() -> Unit = {}): AWSGlueJob {
    return AWSGlueJob(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
