
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::LogGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
 */
@CloudFormationMarker
class AWSLogsLogGroup(logicalId: String) : Resource<AWSLogsLogGroup.Properties>(logicalId, "AWS::Logs::LogGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var logGroupName: Any? = null
        fun logGroupName(value: String?) { this.logGroupName = value }
        fun logGroupName(value: IntrinsicFunction) { this.logGroupName = value }
        @JvmField var retentionInDays: Any? = null
        fun retentionInDays(value: Int?) { this.retentionInDays = value }
        fun retentionInDays(value: IntrinsicFunction) { this.retentionInDays = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLogsLogGroup(logicalId: String, init: AWSLogsLogGroup.() -> Unit = {}): AWSLogsLogGroup {
    return AWSLogsLogGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
