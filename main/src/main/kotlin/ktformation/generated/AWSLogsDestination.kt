
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::Destination - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
 */
@CloudFormationMarker
class AWSLogsDestination(logicalId: String) : Resource<AWSLogsDestination.Properties>(logicalId, "AWS::Logs::Destination") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var destinationName: Any? = null
        fun destinationName(value: String) { this.destinationName = value }
        fun destinationName(value: IntrinsicFunction) { this.destinationName = value }
        @JvmField var destinationPolicy: Any? = null
        fun destinationPolicy(value: String) { this.destinationPolicy = value }
        fun destinationPolicy(value: IntrinsicFunction) { this.destinationPolicy = value }
        @JvmField var roleArn: Any? = null
        fun roleArn(value: String) { this.roleArn = value }
        fun roleArn(value: IntrinsicFunction) { this.roleArn = value }
        @JvmField var targetArn: Any? = null
        fun targetArn(value: String) { this.targetArn = value }
        fun targetArn(value: IntrinsicFunction) { this.targetArn = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLogsDestination(logicalId: String, init: AWSLogsDestination.() -> Unit = {}): AWSLogsDestination {
    return AWSLogsDestination(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
