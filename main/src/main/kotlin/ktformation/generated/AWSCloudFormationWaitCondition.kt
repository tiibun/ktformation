
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFormation::WaitCondition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html)
 */
@CloudFormationMarker
class AWSCloudFormationWaitCondition(logicalId: String) : Resource<AWSCloudFormationWaitCondition.Properties>(logicalId, "AWS::CloudFormation::WaitCondition") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var count: Any? = null
        fun count(value: Int) {
            this.count = value
        }
        fun count(value: IntrinsicFunction) { this.count = value }
        @JvmField var handle: Any? = null
        fun handle(value: String) { this.handle = value }
        fun handle(value: IntrinsicFunction) { this.handle = value }
        @JvmField var timeout: Any? = null
        fun timeout(value: String) { this.timeout = value }
        fun timeout(value: IntrinsicFunction) { this.timeout = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsCloudFormationWaitCondition(logicalId: String, init: AWSCloudFormationWaitCondition.() -> Unit = {}): AWSCloudFormationWaitCondition {
    return AWSCloudFormationWaitCondition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
