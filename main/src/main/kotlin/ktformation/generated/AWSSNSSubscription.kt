
package ktformation.generated

import ktformation.*

/**
 * [AWS::SNS::Subscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
 */
@CloudFormationMarker
class AWSSNSSubscription(logicalId: String) : Resource<AWSSNSSubscription.Properties>(logicalId, "AWS::SNS::Subscription") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var endpoint: Any? = null

        fun endpoint(value: String) {
          this.endpoint = value
        }
        
        fun endpoint(value: IntrinsicFunction) {
          this.endpoint = value
        }
        
        @JvmField
        var protocol: Any? = null

        fun protocol(value: String) {
          this.protocol = value
        }
        
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }
        
        @JvmField
        var topicArn: Any? = null

        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSNSSubscription(logicalId: String, init: AWSSNSSubscription.() -> Unit = {}): AWSSNSSubscription {
    return AWSSNSSubscription(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
