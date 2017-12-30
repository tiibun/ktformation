
package ktformation.generated

import ktformation.*

/**
 * [AWS::Batch::JobQueue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
 */
@CloudFormationMarker
class AWSBatchJobQueue(logicalId: String) : Resource<AWSBatchJobQueue.Properties>(logicalId, "AWS::Batch::JobQueue") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var computeEnvironmentOrder: Any? = null
        fun computeEnvironmentOrder(value: List<ComputeEnvironmentOrder>) { this.computeEnvironmentOrder = value }
        fun computeEnvironmentOrder(vararg value: IntrinsicFunction) { this.computeEnvironmentOrder = value }
        @JvmField var jobQueueName: Any? = null
        fun jobQueueName(value: String) {
            this.jobQueueName = value
        }
        fun jobQueueName(value: IntrinsicFunction) { this.jobQueueName = value }
        @JvmField var priority: Any? = null
        fun priority(value: Int) { this.priority = value }
        fun priority(value: IntrinsicFunction) { this.priority = value }
        @JvmField var state: Any? = null
        fun state(value: String) {
            this.state = value
        }
        fun state(value: IntrinsicFunction) { this.state = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ComputeEnvironmentOrder(
            val computeEnvironment: String,
            val order: Int
    )

}

fun Resources.awsBatchJobQueue(logicalId: String, init: AWSBatchJobQueue.() -> Unit = {}): AWSBatchJobQueue {
    return AWSBatchJobQueue(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
