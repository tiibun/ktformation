
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::MaintenanceWindowTask - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 */
@CloudFormationMarker
class AWSSSMMaintenanceWindowTask(logicalId: String) : Resource<AWSSSMMaintenanceWindowTask.Properties>(logicalId, "AWS::SSM::MaintenanceWindowTask") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [loggingInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-logginginfo)
         *
         * _Required_: no
         *
         * _Type_: LoggingInfo
         */
        @JvmField
        var loggingInfo: Any? = null

        /**
         * [loggingInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-logginginfo)
         *
         * _Required_: no
         *
         * _Type_: LoggingInfo
         */
        fun loggingInfo(value: LoggingInfo) {
          this.loggingInfo = value
        }
        
        /**
         * [loggingInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-logginginfo)
         *
         * _Required_: no
         *
         * _Type_: LoggingInfo
         */
        fun loggingInfo(value: IntrinsicFunction) {
          this.loggingInfo = value
        }
        
        /**
         * [maxConcurrency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var maxConcurrency: Any? = null

        /**
         * [maxConcurrency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun maxConcurrency(value: String) {
          this.maxConcurrency = value
        }
        
        /**
         * [maxConcurrency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxconcurrency)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun maxConcurrency(value: IntrinsicFunction) {
          this.maxConcurrency = value
        }
        
        /**
         * [maxErrors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var maxErrors: Any? = null

        /**
         * [maxErrors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun maxErrors(value: String) {
          this.maxErrors = value
        }
        
        /**
         * [maxErrors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-maxerrors)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun maxErrors(value: IntrinsicFunction) {
          this.maxErrors = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var priority: Any? = null

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: Int) {
          this.priority = value
        }
        
        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: IntrinsicFunction) {
          this.priority = value
        }
        
        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceRoleArn: Any? = null

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        
        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: IntrinsicFunction) {
          this.serviceRoleArn = value
        }
        
        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
         *
         * _Required_: yes
         *
         * _Type_: List<Target>
         */
        @JvmField
        var targets: Any? = null

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
         *
         * _Required_: yes
         *
         * _Type_: List<Target>
         */
        fun targets(value: List<Target>) {
          this.targets = value
        }
        
        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-targets)
         *
         * _Required_: yes
         *
         * _Type_: List<Target>
         */
        fun targets(vararg value: IntrinsicFunction) {
          this.targets = value
        }
        
        /**
         * [taskArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var taskArn: Any? = null

        /**
         * [taskArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskArn(value: String) {
          this.taskArn = value
        }
        
        /**
         * [taskArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskArn(value: IntrinsicFunction) {
          this.taskArn = value
        }
        
        /**
         * [taskInvocationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters)
         *
         * _Required_: no
         *
         * _Type_: TaskInvocationParameters
         */
        @JvmField
        var taskInvocationParameters: Any? = null

        /**
         * [taskInvocationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters)
         *
         * _Required_: no
         *
         * _Type_: TaskInvocationParameters
         */
        fun taskInvocationParameters(value: TaskInvocationParameters) {
          this.taskInvocationParameters = value
        }
        
        /**
         * [taskInvocationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters)
         *
         * _Required_: no
         *
         * _Type_: TaskInvocationParameters
         */
        fun taskInvocationParameters(value: IntrinsicFunction) {
          this.taskInvocationParameters = value
        }
        
        /**
         * [taskParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var taskParameters: Any? = null

        /**
         * [taskParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun taskParameters(value: Json) {
          this.taskParameters = value
        }
        
        /**
         * [taskParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-taskparameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun taskParameters(value: IntrinsicFunction) {
          this.taskParameters = value
        }
        
        /**
         * [taskType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var taskType: Any? = null

        /**
         * [taskType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskType(value: String) {
          this.taskType = value
        }
        
        /**
         * [taskType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-tasktype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskType(value: IntrinsicFunction) {
          this.taskType = value
        }
        
        /**
         * [windowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var windowId: Any? = null

        /**
         * [windowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun windowId(value: String) {
          this.windowId = value
        }
        
        /**
         * [windowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#cfn-ssm-maintenancewindowtask-windowid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun windowId(value: IntrinsicFunction) {
          this.windowId = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LoggingInfo(
            /**
             * [Region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val region: String,
            /**
             * [S3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val s3Bucket: String,
            /**
             * [S3Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3Prefix: String? = null
    )

    class MaintenanceWindowAutomationParameters(
            /**
             * [DocumentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-documentversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val documentVersion: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null
    )

    class MaintenanceWindowLambdaParameters(
            /**
             * [ClientContext](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val clientContext: String? = null,
            /**
             * [Payload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val payload: String? = null,
            /**
             * [Qualifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val qualifier: String? = null
    )

    class MaintenanceWindowRunCommandParameters(
            /**
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val comment: String? = null,
            /**
             * [DocumentHash](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val documentHash: String? = null,
            /**
             * [DocumentHashType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val documentHashType: String? = null,
            /**
             * [NotificationConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-notificationconfig)
             *
             * _Required_: no
             *
             * _Type_: NotificationConfig
             */
            val notificationConfig: NotificationConfig? = null,
            /**
             * [OutputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val outputS3BucketName: String? = null,
            /**
             * [OutputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val outputS3KeyPrefix: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [ServiceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serviceRoleArn: String? = null,
            /**
             * [TimeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val timeoutSeconds: Int? = null
    )

    class MaintenanceWindowStepFunctionsParameters(
            /**
             * [Input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val input: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class NotificationConfig(
            /**
             * [NotificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val notificationArn: String,
            /**
             * [NotificationEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val notificationEvents: List<String>? = null,
            /**
             * [NotificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val notificationType: String? = null
    )

    class Target(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-values)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val values: List<String>? = null
    )

    class TaskInvocationParameters(
            /**
             * [MaintenanceWindowAutomationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowautomationparameters)
             *
             * _Required_: no
             *
             * _Type_: MaintenanceWindowAutomationParameters
             */
            val maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParameters? = null,
            /**
             * [MaintenanceWindowLambdaParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowlambdaparameters)
             *
             * _Required_: no
             *
             * _Type_: MaintenanceWindowLambdaParameters
             */
            val maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParameters? = null,
            /**
             * [MaintenanceWindowRunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowruncommandparameters)
             *
             * _Required_: no
             *
             * _Type_: MaintenanceWindowRunCommandParameters
             */
            val maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParameters? = null,
            /**
             * [MaintenanceWindowStepFunctionsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowstepfunctionsparameters)
             *
             * _Required_: no
             *
             * _Type_: MaintenanceWindowStepFunctionsParameters
             */
            val maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParameters? = null
    )

}

/**
 * [AWS::SSM::MaintenanceWindowTask - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 */
fun Resources.awsSSMMaintenanceWindowTask(logicalId: String, init: AWSSSMMaintenanceWindowTask.() -> Unit = {}): AWSSSMMaintenanceWindowTask {
    return AWSSSMMaintenanceWindowTask(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
