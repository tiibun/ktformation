
package ktformation.generated

import ktformation.*

/**
 * [AWS::SNS::Topic - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html)
 */
@CloudFormationMarker
class AWSSNSTopic(logicalId: String) : Resource<AWSSNSTopic.Properties>(logicalId, "AWS::SNS::Topic") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var displayName: Any? = null
        fun displayName(value: String?) { this.displayName = value }
        fun displayName(value: IntrinsicFunction) { this.displayName = value }
        @JvmField var subscription: Any? = null
        fun subscription(value: List<Subscription>?) { this.subscription = value }
        fun subscription(vararg value: IntrinsicFunction) { this.subscription = value }
        @JvmField var topicName: Any? = null
        fun topicName(value: String?) { this.topicName = value }
        fun topicName(value: IntrinsicFunction) { this.topicName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Subscription(
            val endpoint: String,
            val protocol: String
    )

}

fun Resources.awsSNSTopic(logicalId: String, init: AWSSNSTopic.() -> Unit = {}): AWSSNSTopic {
    return AWSSNSTopic(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
