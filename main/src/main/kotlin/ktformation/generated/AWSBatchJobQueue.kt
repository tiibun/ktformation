
package ktformation.generated

import ktformation.*

/**
 * [AWS::Batch::JobQueue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
 */
@CloudFormationMarker
class AWSBatchJobQueue(logicalId: String) : Resource<AWSBatchJobQueue.Properties>(logicalId, "AWS::Batch::JobQueue") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [computeEnvironmentOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
         *
         * _Required_: yes
         *
         * _Type_: List<ComputeEnvironmentOrder>
         */
        @JvmField
        var computeEnvironmentOrder: Any? = null

        /**
         * [computeEnvironmentOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
         *
         * _Required_: yes
         *
         * _Type_: List<ComputeEnvironmentOrder>
         */
        fun computeEnvironmentOrder(value: List<ComputeEnvironmentOrder>) {
          this.computeEnvironmentOrder = value
        }
        
        /**
         * [computeEnvironmentOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
         *
         * _Required_: yes
         *
         * _Type_: List<ComputeEnvironmentOrder>
         */
        fun computeEnvironmentOrder(vararg value: IntrinsicFunction) {
          this.computeEnvironmentOrder = value
        }

        /**
         * [jobQueueName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var jobQueueName: Any? = null

        /**
         * [jobQueueName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobQueueName(value: String) {
          this.jobQueueName = value
        }
        
        /**
         * [jobQueueName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobQueueName(value: IntrinsicFunction) {
          this.jobQueueName = value
        }

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var priority: Any? = null

        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: Int) {
          this.priority = value
        }
        
        /**
         * [priority](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun priority(value: IntrinsicFunction) {
          this.priority = value
        }

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var state: Any? = null

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: String) {
          this.state = value
        }
        
        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: IntrinsicFunction) {
          this.state = value
        }

        /**
        * [ComputeEnvironmentOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html)
        */
        fun computeEnvironmentOrder(init: ComputeEnvironmentOrder.() -> Unit = {}): ComputeEnvironmentOrder {
            return ComputeEnvironmentOrder().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class ComputeEnvironmentOrder {
            /**
         * [computeEnvironment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var computeEnvironment: Any? = null

        /**
         * [computeEnvironment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun computeEnvironment(value: String) {
          this.computeEnvironment = value
        }
        
        /**
         * [computeEnvironment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun computeEnvironment(value: IntrinsicFunction) {
          this.computeEnvironment = value
        }

        /**
         * [order](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var order: Any? = null

        /**
         * [order](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun order(value: Int) {
          this.order = value
        }
        
        /**
         * [order](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun order(value: IntrinsicFunction) {
          this.order = value
        }

    }

}

/**
 * [AWS::Batch::JobQueue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
 */
fun Resources.awsBatchJobQueue(logicalId: String, init: AWSBatchJobQueue.() -> Unit = {}): AWSBatchJobQueue {
    return AWSBatchJobQueue(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
