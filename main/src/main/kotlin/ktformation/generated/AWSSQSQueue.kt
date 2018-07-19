
package ktformation.generated

import ktformation.*

/**
 * [AWS::SQS::Queue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)
 */
@CloudFormationMarker
class AWSSQSQueue(logicalId: String) : Resource<AWSSQSQueue.Properties>(logicalId, "AWS::SQS::Queue") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [contentBasedDeduplication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var contentBasedDeduplication: Any? = null

        /**
         * [contentBasedDeduplication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun contentBasedDeduplication(value: Boolean) {
          this.contentBasedDeduplication = value
        }
        
        /**
         * [contentBasedDeduplication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-contentbaseddeduplication)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun contentBasedDeduplication(value: IntrinsicFunction) {
          this.contentBasedDeduplication = value
        }

        /**
         * [delaySeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var delaySeconds: Any? = null

        /**
         * [delaySeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun delaySeconds(value: Int) {
          this.delaySeconds = value
        }
        
        /**
         * [delaySeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-delayseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun delaySeconds(value: IntrinsicFunction) {
          this.delaySeconds = value
        }

        /**
         * [fifoQueue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var fifoQueue: Any? = null

        /**
         * [fifoQueue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun fifoQueue(value: Boolean) {
          this.fifoQueue = value
        }
        
        /**
         * [fifoQueue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-fifoqueue)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun fifoQueue(value: IntrinsicFunction) {
          this.fifoQueue = value
        }

        /**
         * [kmsDataKeyReusePeriodSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var kmsDataKeyReusePeriodSeconds: Any? = null

        /**
         * [kmsDataKeyReusePeriodSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun kmsDataKeyReusePeriodSeconds(value: Int) {
          this.kmsDataKeyReusePeriodSeconds = value
        }
        
        /**
         * [kmsDataKeyReusePeriodSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsdatakeyreuseperiodseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun kmsDataKeyReusePeriodSeconds(value: IntrinsicFunction) {
          this.kmsDataKeyReusePeriodSeconds = value
        }

        /**
         * [kmsMasterKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsMasterKeyId: Any? = null

        /**
         * [kmsMasterKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsMasterKeyId(value: String) {
          this.kmsMasterKeyId = value
        }
        
        /**
         * [kmsMasterKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-kmsmasterkeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsMasterKeyId(value: IntrinsicFunction) {
          this.kmsMasterKeyId = value
        }

        /**
         * [maximumMessageSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var maximumMessageSize: Any? = null

        /**
         * [maximumMessageSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maximumMessageSize(value: Int) {
          this.maximumMessageSize = value
        }
        
        /**
         * [maximumMessageSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-maxmesgsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maximumMessageSize(value: IntrinsicFunction) {
          this.maximumMessageSize = value
        }

        /**
         * [messageRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var messageRetentionPeriod: Any? = null

        /**
         * [messageRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun messageRetentionPeriod(value: Int) {
          this.messageRetentionPeriod = value
        }
        
        /**
         * [messageRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-msgretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun messageRetentionPeriod(value: IntrinsicFunction) {
          this.messageRetentionPeriod = value
        }

        /**
         * [queueName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var queueName: Any? = null

        /**
         * [queueName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun queueName(value: String) {
          this.queueName = value
        }
        
        /**
         * [queueName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun queueName(value: IntrinsicFunction) {
          this.queueName = value
        }

        /**
         * [receiveMessageWaitTimeSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var receiveMessageWaitTimeSeconds: Any? = null

        /**
         * [receiveMessageWaitTimeSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun receiveMessageWaitTimeSeconds(value: Int) {
          this.receiveMessageWaitTimeSeconds = value
        }
        
        /**
         * [receiveMessageWaitTimeSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-receivemsgwaittime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun receiveMessageWaitTimeSeconds(value: IntrinsicFunction) {
          this.receiveMessageWaitTimeSeconds = value
        }

        /**
         * [redrivePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var redrivePolicy: Any? = null

        /**
         * [redrivePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun redrivePolicy(value: Json) {
          this.redrivePolicy = value
        }
        
        /**
         * [redrivePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-redrive)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun redrivePolicy(value: IntrinsicFunction) {
          this.redrivePolicy = value
        }

        /**
         * [visibilityTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var visibilityTimeout: Any? = null

        /**
         * [visibilityTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun visibilityTimeout(value: Int) {
          this.visibilityTimeout = value
        }
        
        /**
         * [visibilityTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html#aws-sqs-queue-visiblitytimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
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

/**
 * [AWS::SQS::Queue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-queues.html)
 */
fun Resources.awsSQSQueue(logicalId: String, init: AWSSQSQueue.() -> Unit = {}): AWSSQSQueue {
    return AWSSQSQueue(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
