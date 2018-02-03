
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::SubscriptionFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
 */
@CloudFormationMarker
class AWSLogsSubscriptionFilter(logicalId: String) : Resource<AWSLogsSubscriptionFilter.Properties>(logicalId, "AWS::Logs::SubscriptionFilter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var destinationArn: Any? = null

        fun destinationArn(value: String) {
          this.destinationArn = value
        }
        
        fun destinationArn(value: IntrinsicFunction) {
          this.destinationArn = value
        }
        
        @JvmField
        var filterPattern: Any? = null

        fun filterPattern(value: String) {
          this.filterPattern = value
        }
        
        fun filterPattern(value: IntrinsicFunction) {
          this.filterPattern = value
        }
        
        @JvmField
        var logGroupName: Any? = null

        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }
        
        @JvmField
        var roleArn: Any? = null

        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLogsSubscriptionFilter(logicalId: String, init: AWSLogsSubscriptionFilter.() -> Unit = {}): AWSLogsSubscriptionFilter {
    return AWSLogsSubscriptionFilter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
