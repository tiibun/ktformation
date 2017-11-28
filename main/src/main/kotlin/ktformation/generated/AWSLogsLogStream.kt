
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::LogStream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
@CloudFormationMarker
class AWSLogsLogStream(logicalId: String) : Resource<AWSLogsLogStream.Properties>(logicalId, "AWS::Logs::LogStream") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var logGroupName: Any? = null
        fun logGroupName(value: String) { this.logGroupName = value }
        fun logGroupName(value: IntrinsicFunction) { this.logGroupName = value }
        @JvmField var logStreamName: Any? = null
        fun logStreamName(value: String?) { this.logStreamName = value }
        fun logStreamName(value: IntrinsicFunction) { this.logStreamName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLogsLogStream(logicalId: String, init: AWSLogsLogStream.() -> Unit = {}): AWSLogsLogStream {
    return AWSLogsLogStream(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
