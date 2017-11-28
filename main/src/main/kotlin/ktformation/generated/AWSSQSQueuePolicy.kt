
package ktformation.generated

import ktformation.*

/**
 * [AWS::SQS::QueuePolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html)
 */
@CloudFormationMarker
class AWSSQSQueuePolicy(logicalId: String) : Resource<AWSSQSQueuePolicy.Properties>(logicalId, "AWS::SQS::QueuePolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var policyDocument: Any? = null
        fun policyDocument(value: Json) { this.policyDocument = value }
        fun policyDocument(value: IntrinsicFunction) { this.policyDocument = value }
        @JvmField var queues: Any? = null
        fun queues(value: List<String>) { this.queues = value }
        fun queues(vararg value: IntrinsicFunction) { this.queues = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSQSQueuePolicy(logicalId: String, init: AWSSQSQueuePolicy.() -> Unit = {}): AWSSQSQueuePolicy {
    return AWSSQSQueuePolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
