
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

        /**
        * [LoggingInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html)
        */
        fun loggingInfo(init: LoggingInfo.() -> Unit = {}): LoggingInfo {
            return LoggingInfo().also {
                it.init()
            }
        }
        /**
        * [MaintenanceWindowAutomationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html)
        */
        fun maintenanceWindowAutomationParameters(init: MaintenanceWindowAutomationParameters.() -> Unit = {}): MaintenanceWindowAutomationParameters {
            return MaintenanceWindowAutomationParameters().also {
                it.init()
            }
        }
        /**
        * [MaintenanceWindowLambdaParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html)
        */
        fun maintenanceWindowLambdaParameters(init: MaintenanceWindowLambdaParameters.() -> Unit = {}): MaintenanceWindowLambdaParameters {
            return MaintenanceWindowLambdaParameters().also {
                it.init()
            }
        }
        /**
        * [MaintenanceWindowRunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
        */
        fun maintenanceWindowRunCommandParameters(init: MaintenanceWindowRunCommandParameters.() -> Unit = {}): MaintenanceWindowRunCommandParameters {
            return MaintenanceWindowRunCommandParameters().also {
                it.init()
            }
        }
        /**
        * [MaintenanceWindowStepFunctionsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html)
        */
        fun maintenanceWindowStepFunctionsParameters(init: MaintenanceWindowStepFunctionsParameters.() -> Unit = {}): MaintenanceWindowStepFunctionsParameters {
            return MaintenanceWindowStepFunctionsParameters().also {
                it.init()
            }
        }
        /**
        * [NotificationConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html)
        */
        fun notificationConfig(init: NotificationConfig.() -> Unit = {}): NotificationConfig {
            return NotificationConfig().also {
                it.init()
            }
        }
        /**
        * [Target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html)
        */
        fun target(init: Target.() -> Unit = {}): Target {
            return Target().also {
                it.init()
            }
        }
        /**
        * [TaskInvocationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html)
        */
        fun taskInvocationParameters(init: TaskInvocationParameters.() -> Unit = {}): TaskInvocationParameters {
            return TaskInvocationParameters().also {
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
    class LoggingInfo {
            /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var region: Any? = null

        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun region(value: String) {
          this.region = value
        }
        
        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun region(value: IntrinsicFunction) {
          this.region = value
        }

        /**
         * [s3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var s3Bucket: Any? = null

        /**
         * [s3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Bucket(value: String) {
          this.s3Bucket = value
        }
        
        /**
         * [s3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Bucket(value: IntrinsicFunction) {
          this.s3Bucket = value
        }

        /**
         * [s3Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var s3Prefix: Any? = null

        /**
         * [s3Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3Prefix(value: String) {
          this.s3Prefix = value
        }
        
        /**
         * [s3Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3Prefix(value: IntrinsicFunction) {
          this.s3Prefix = value
        }

    }

    @CloudFormationMarker
    class MaintenanceWindowAutomationParameters {
            /**
         * [documentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-documentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var documentVersion: Any? = null

        /**
         * [documentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-documentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentVersion(value: String) {
          this.documentVersion = value
        }
        
        /**
         * [documentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-documentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentVersion(value: IntrinsicFunction) {
          this.documentVersion = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowautomationparameters-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

    }

    @CloudFormationMarker
    class MaintenanceWindowLambdaParameters {
            /**
         * [clientContext](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var clientContext: Any? = null

        /**
         * [clientContext](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientContext(value: String) {
          this.clientContext = value
        }
        
        /**
         * [clientContext](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-clientcontext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientContext(value: IntrinsicFunction) {
          this.clientContext = value
        }

        /**
         * [payload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var payload: Any? = null

        /**
         * [payload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun payload(value: String) {
          this.payload = value
        }
        
        /**
         * [payload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-payload)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun payload(value: IntrinsicFunction) {
          this.payload = value
        }

        /**
         * [qualifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var qualifier: Any? = null

        /**
         * [qualifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun qualifier(value: String) {
          this.qualifier = value
        }
        
        /**
         * [qualifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowlambdaparameters-qualifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun qualifier(value: IntrinsicFunction) {
          this.qualifier = value
        }

    }

    @CloudFormationMarker
    class MaintenanceWindowRunCommandParameters {
            /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

        /**
         * [documentHash](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var documentHash: Any? = null

        /**
         * [documentHash](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentHash(value: String) {
          this.documentHash = value
        }
        
        /**
         * [documentHash](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthash)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentHash(value: IntrinsicFunction) {
          this.documentHash = value
        }

        /**
         * [documentHashType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var documentHashType: Any? = null

        /**
         * [documentHashType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentHashType(value: String) {
          this.documentHashType = value
        }
        
        /**
         * [documentHashType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-documenthashtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentHashType(value: IntrinsicFunction) {
          this.documentHashType = value
        }

        /**
         * [notificationConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-notificationconfig)
         *
         * _Required_: no
         *
         * _Type_: NotificationConfig
         */
        var notificationConfig: Any? = null

        /**
         * [notificationConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-notificationconfig)
         *
         * _Required_: no
         *
         * _Type_: NotificationConfig
         */
        fun notificationConfig(value: NotificationConfig) {
          this.notificationConfig = value
        }
        
        /**
         * [notificationConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-notificationconfig)
         *
         * _Required_: no
         *
         * _Type_: NotificationConfig
         */
        fun notificationConfig(value: IntrinsicFunction) {
          this.notificationConfig = value
        }

        /**
         * [outputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var outputS3BucketName: Any? = null

        /**
         * [outputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3BucketName(value: String) {
          this.outputS3BucketName = value
        }
        
        /**
         * [outputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3BucketName(value: IntrinsicFunction) {
          this.outputS3BucketName = value
        }

        /**
         * [outputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var outputS3KeyPrefix: Any? = null

        /**
         * [outputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3KeyPrefix(value: String) {
          this.outputS3KeyPrefix = value
        }
        
        /**
         * [outputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-outputs3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3KeyPrefix(value: IntrinsicFunction) {
          this.outputS3KeyPrefix = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serviceRoleArn: Any? = null

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        
        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-servicerolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: IntrinsicFunction) {
          this.serviceRoleArn = value
        }

        /**
         * [timeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var timeoutSeconds: Any? = null

        /**
         * [timeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutSeconds(value: Int) {
          this.timeoutSeconds = value
        }
        
        /**
         * [timeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowruncommandparameters-timeoutseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutSeconds(value: IntrinsicFunction) {
          this.timeoutSeconds = value
        }

    }

    @CloudFormationMarker
    class MaintenanceWindowStepFunctionsParameters {
            /**
         * [input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var input: Any? = null

        /**
         * [input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: String) {
          this.input = value
        }
        
        /**
         * [input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-input)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: IntrinsicFunction) {
          this.input = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html#cfn-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters-name)
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
    class NotificationConfig {
            /**
         * [notificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var notificationArn: Any? = null

        /**
         * [notificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun notificationArn(value: String) {
          this.notificationArn = value
        }
        
        /**
         * [notificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun notificationArn(value: IntrinsicFunction) {
          this.notificationArn = value
        }

        /**
         * [notificationEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var notificationEvents: Any? = null

        /**
         * [notificationEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationEvents(value: List<String>) {
          this.notificationEvents = value
        }
        
        /**
         * [notificationEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationevents)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationEvents(vararg value: IntrinsicFunction) {
          this.notificationEvents = value
        }

        /**
         * [notificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var notificationType: Any? = null

        /**
         * [notificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationType(value: String) {
          this.notificationType = value
        }
        
        /**
         * [notificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html#cfn-ssm-maintenancewindowtask-notificationconfig-notificationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationType(value: IntrinsicFunction) {
          this.notificationType = value
        }

    }

    @CloudFormationMarker
    class Target {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html#cfn-ssm-maintenancewindowtask-target-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

    @CloudFormationMarker
    class TaskInvocationParameters {
            /**
         * [maintenanceWindowAutomationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowautomationparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowAutomationParameters
         */
        var maintenanceWindowAutomationParameters: Any? = null

        /**
         * [maintenanceWindowAutomationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowautomationparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowAutomationParameters
         */
        fun maintenanceWindowAutomationParameters(value: MaintenanceWindowAutomationParameters) {
          this.maintenanceWindowAutomationParameters = value
        }
        
        /**
         * [maintenanceWindowAutomationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowautomationparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowAutomationParameters
         */
        fun maintenanceWindowAutomationParameters(value: IntrinsicFunction) {
          this.maintenanceWindowAutomationParameters = value
        }

        /**
         * [maintenanceWindowLambdaParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowlambdaparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowLambdaParameters
         */
        var maintenanceWindowLambdaParameters: Any? = null

        /**
         * [maintenanceWindowLambdaParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowlambdaparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowLambdaParameters
         */
        fun maintenanceWindowLambdaParameters(value: MaintenanceWindowLambdaParameters) {
          this.maintenanceWindowLambdaParameters = value
        }
        
        /**
         * [maintenanceWindowLambdaParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowlambdaparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowLambdaParameters
         */
        fun maintenanceWindowLambdaParameters(value: IntrinsicFunction) {
          this.maintenanceWindowLambdaParameters = value
        }

        /**
         * [maintenanceWindowRunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowruncommandparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowRunCommandParameters
         */
        var maintenanceWindowRunCommandParameters: Any? = null

        /**
         * [maintenanceWindowRunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowruncommandparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowRunCommandParameters
         */
        fun maintenanceWindowRunCommandParameters(value: MaintenanceWindowRunCommandParameters) {
          this.maintenanceWindowRunCommandParameters = value
        }
        
        /**
         * [maintenanceWindowRunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowruncommandparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowRunCommandParameters
         */
        fun maintenanceWindowRunCommandParameters(value: IntrinsicFunction) {
          this.maintenanceWindowRunCommandParameters = value
        }

        /**
         * [maintenanceWindowStepFunctionsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowstepfunctionsparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowStepFunctionsParameters
         */
        var maintenanceWindowStepFunctionsParameters: Any? = null

        /**
         * [maintenanceWindowStepFunctionsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowstepfunctionsparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowStepFunctionsParameters
         */
        fun maintenanceWindowStepFunctionsParameters(value: MaintenanceWindowStepFunctionsParameters) {
          this.maintenanceWindowStepFunctionsParameters = value
        }
        
        /**
         * [maintenanceWindowStepFunctionsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html#cfn-ssm-maintenancewindowtask-taskinvocationparameters-maintenancewindowstepfunctionsparameters)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindowStepFunctionsParameters
         */
        fun maintenanceWindowStepFunctionsParameters(value: IntrinsicFunction) {
          this.maintenanceWindowStepFunctionsParameters = value
        }

    }

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
