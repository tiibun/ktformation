
package ktformation.generated

import ktformation.*

/**
 * [AWS::SNS::TopicPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html)
 */
@CloudFormationMarker
class AWSSNSTopicPolicy(logicalId: String) : Resource<AWSSNSTopicPolicy.Properties>(logicalId, "AWS::SNS::TopicPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var policyDocument: Any? = null

        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }
        
        @JvmField
        var topics: Any? = null

        fun topics(value: List<String>) {
          this.topics = value
        }
        
        fun topics(vararg value: IntrinsicFunction) {
          this.topics = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSNSTopicPolicy(logicalId: String, init: AWSSNSTopicPolicy.() -> Unit = {}): AWSSNSTopicPolicy {
    return AWSSNSTopicPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
