
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::MaintenanceWindowTask - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 */
@CloudFormationMarker
class AWSSSMMaintenanceWindowTask(logicalId: String) : Resource<AWSSSMMaintenanceWindowTask.Properties>(logicalId, "AWS::SSM::MaintenanceWindowTask") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var loggingInfo: Any? = null
        fun loggingInfo(value: LoggingInfo?) { this.loggingInfo = value }
        fun loggingInfo(value: IntrinsicFunction) { this.loggingInfo = value }
        @JvmField var maxConcurrency: Any? = null
        fun maxConcurrency(value: String) { this.maxConcurrency = value }
        fun maxConcurrency(value: IntrinsicFunction) { this.maxConcurrency = value }
        @JvmField var maxErrors: Any? = null
        fun maxErrors(value: String) { this.maxErrors = value }
        fun maxErrors(value: IntrinsicFunction) { this.maxErrors = value }
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var priority: Any? = null
        fun priority(value: Int) { this.priority = value }
        fun priority(value: IntrinsicFunction) { this.priority = value }
        @JvmField var serviceRoleArn: Any? = null
        fun serviceRoleArn(value: String) { this.serviceRoleArn = value }
        fun serviceRoleArn(value: IntrinsicFunction) { this.serviceRoleArn = value }
        @JvmField var targets: Any? = null
        fun targets(value: List<Target>) { this.targets = value }
        fun targets(vararg value: IntrinsicFunction) { this.targets = value }
        @JvmField var taskArn: Any? = null
        fun taskArn(value: String) { this.taskArn = value }
        fun taskArn(value: IntrinsicFunction) { this.taskArn = value }
        @JvmField var taskInvocationParameters: Any? = null
        fun taskInvocationParameters(value: TaskInvocationParameters?) { this.taskInvocationParameters = value }
        fun taskInvocationParameters(value: IntrinsicFunction) { this.taskInvocationParameters = value }
        @JvmField var taskParameters: Any? = null
        fun taskParameters(value: Json?) { this.taskParameters = value }
        fun taskParameters(value: IntrinsicFunction) { this.taskParameters = value }
        @JvmField var taskType: Any? = null
        fun taskType(value: String) { this.taskType = value }
        fun taskType(value: IntrinsicFunction) { this.taskType = value }
        @JvmField var windowId: Any? = null
        fun windowId(value: String?) { this.windowId = value }
        fun windowId(value: IntrinsicFunction) { this.windowId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LoggingInfo(
            val region: String,
            val s3Bucket: String,
            val s3Prefix: String? = null
    )

    class MaintenanceWindowAutomationParameters(
            val documentVersion: String? = null,
            val parameters: Json? = null
    )

    class MaintenanceWindowLambdaParameters(
            val clientContext: String? = null,
            val payload: String? = null,
            val qualifier: String? = null
    )

    class MaintenanceWindowRunCommandParameters(
            val comment: String? = null,
            val documentHash: String? = null,
            val documentHashType: String? = null,
            val notificationConfig: NotificationConfig? = null,
            val outputS3BucketName: String? = null,
            val outputS3KeyPrefix: String? = null,
            val parameters: Json? = null,
            val serviceRoleArn: String? = null,
            val timeoutSeconds: Int? = null
    )

    class MaintenanceWindowStepFunctionsParameters(
            val input: String? = null,
            val name: String? = null
    )

    class NotificationConfig(
            val notificationArn: String? = null,
            val notificationEvents: List<String>? = null,
            val notificationType: String? = null
    )

    class Target(
            val key: String,
            val values: List<String>? = null
    )

    class TaskInvocationParameters(
            val maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParameters? = null,
            val maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParameters? = null,
            val maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParameters? = null,
            val maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParameters? = null
    )

}

fun Resources.awsSSMMaintenanceWindowTask(logicalId: String, init: AWSSSMMaintenanceWindowTask.() -> Unit = {}): AWSSSMMaintenanceWindowTask {
    return AWSSSMMaintenanceWindowTask(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
