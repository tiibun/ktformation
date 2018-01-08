
package ktformation.generated

import ktformation.*

/**
 * [AWS::SQS::Queue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)
 */
@CloudFormationMarker
class AWSSQSQueue(logicalId: String) : Resource<AWSSQSQueue.Properties>(logicalId, "AWS::SQS::Queue") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var contentBasedDeduplication: Any? = null

        fun contentBasedDeduplication(value: Boolean) {
          this.contentBasedDeduplication = value
        }
        fun contentBasedDeduplication(value: IntrinsicFunction) {
  this.contentBasedDeduplication = value
}
        @JvmField
        var delaySeconds: Any? = null

        fun delaySeconds(value: Int) {
          this.delaySeconds = value
        }
        fun delaySeconds(value: IntrinsicFunction) {
  this.delaySeconds = value
}
        @JvmField
        var fifoQueue: Any? = null

        fun fifoQueue(value: Boolean) {
          this.fifoQueue = value
        }
        fun fifoQueue(value: IntrinsicFunction) {
  this.fifoQueue = value
}
        @JvmField
        var kmsDataKeyReusePeriodSeconds: Any? = null

        fun kmsDataKeyReusePeriodSeconds(value: Int) {
          this.kmsDataKeyReusePeriodSeconds = value
        }
        fun kmsDataKeyReusePeriodSeconds(value: IntrinsicFunction) {
  this.kmsDataKeyReusePeriodSeconds = value
}
        @JvmField
        var kmsMasterKeyId: Any? = null

        fun kmsMasterKeyId(value: String) {
          this.kmsMasterKeyId = value
        }
        fun kmsMasterKeyId(value: IntrinsicFunction) {
  this.kmsMasterKeyId = value
}
        @JvmField
        var maximumMessageSize: Any? = null

        fun maximumMessageSize(value: Int) {
          this.maximumMessageSize = value
        }
        fun maximumMessageSize(value: IntrinsicFunction) {
  this.maximumMessageSize = value
}
        @JvmField
        var messageRetentionPeriod: Any? = null

        fun messageRetentionPeriod(value: Int) {
          this.messageRetentionPeriod = value
        }
        fun messageRetentionPeriod(value: IntrinsicFunction) {
  this.messageRetentionPeriod = value
}
        @JvmField
        var queueName: Any? = null

        fun queueName(value: String) {
          this.queueName = value
        }
        fun queueName(value: IntrinsicFunction) {
  this.queueName = value
}
        @JvmField
        var receiveMessageWaitTimeSeconds: Any? = null

        fun receiveMessageWaitTimeSeconds(value: Int) {
          this.receiveMessageWaitTimeSeconds = value
        }
        fun receiveMessageWaitTimeSeconds(value: IntrinsicFunction) {
  this.receiveMessageWaitTimeSeconds = value
}
        @JvmField
        var redrivePolicy: Any? = null

        fun redrivePolicy(value: Json) {
          this.redrivePolicy = value
        }
        fun redrivePolicy(value: IntrinsicFunction) {
  this.redrivePolicy = value
}
        @JvmField
        var visibilityTimeout: Any? = null

        fun visibilityTimeout(value: Int) {
          this.visibilityTimeout = value
        }
        fun visibilityTimeout(value: IntrinsicFunction) {
  this.visibilityTimeout = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSQSQueue(logicalId: String, init: AWSSQSQueue.() -> Unit = {}): AWSSQSQueue {
    return AWSSQSQueue(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
