
package ktformation.generated

import ktformation.*

/**
 * [AWS::SQS::QueuePolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html)
 */
@CloudFormationMarker
class AWSSQSQueuePolicy(logicalId: String) : Resource<AWSSQSQueuePolicy.Properties>(logicalId, "AWS::SQS::QueuePolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var policyDocument: Any? = null

        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-policydoc)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }

        /**
         * [queues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var queues: Any? = null

        /**
         * [queues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun queues(value: List<String>) {
          this.queues = value
        }
        
        /**
         * [queues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html#cfn-sqs-queuepolicy-queues)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun queues(vararg value: IntrinsicFunction) {
          this.queues = value
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
 * [AWS::SQS::QueuePolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html)
 */
fun Resources.awsSQSQueuePolicy(logicalId: String, init: AWSSQSQueuePolicy.() -> Unit = {}): AWSSQSQueuePolicy {
    return AWSSQSQueuePolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
