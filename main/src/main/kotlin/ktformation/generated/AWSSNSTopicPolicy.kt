
package ktformation.generated

import ktformation.*

/**
 * [AWS::SNS::TopicPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html)
 */
@CloudFormationMarker
class AWSSNSTopicPolicy(logicalId: String) : Resource<AWSSNSTopicPolicy.Properties>(logicalId, "AWS::SNS::TopicPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var policyDocument: Any? = null

        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }
        
        /**
         * [topics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var topics: Any? = null

        /**
         * [topics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun topics(value: List<String>) {
          this.topics = value
        }
        
        /**
         * [topics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html#cfn-sns-topicpolicy-topics)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
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

/**
 * [AWS::SNS::TopicPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html)
 */
fun Resources.awsSNSTopicPolicy(logicalId: String, init: AWSSNSTopicPolicy.() -> Unit = {}): AWSSNSTopicPolicy {
    return AWSSNSTopicPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
