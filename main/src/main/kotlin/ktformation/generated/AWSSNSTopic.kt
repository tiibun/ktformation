
package ktformation.generated

import ktformation.*

/**
 * [AWS::SNS::Topic - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html)
 */
@CloudFormationMarker
class AWSSNSTopic(logicalId: String) : Resource<AWSSNSTopic.Properties>(logicalId, "AWS::SNS::Topic") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [displayName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var displayName: Any? = null

        /**
         * [displayName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun displayName(value: String) {
          this.displayName = value
        }
        
        /**
         * [displayName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun displayName(value: IntrinsicFunction) {
          this.displayName = value
        }
        
        /**
         * [subscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription)
         *
         * _Required_: no
         *
         * _Type_: List<Subscription>
         */
        @JvmField
        var subscription: Any? = null

        /**
         * [subscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription)
         *
         * _Required_: no
         *
         * _Type_: List<Subscription>
         */
        fun subscription(value: List<Subscription>) {
          this.subscription = value
        }
        
        /**
         * [subscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription)
         *
         * _Required_: no
         *
         * _Type_: List<Subscription>
         */
        fun subscription(vararg value: IntrinsicFunction) {
          this.subscription = value
        }
        
        /**
         * [topicName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var topicName: Any? = null

        /**
         * [topicName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicName(value: String) {
          this.topicName = value
        }
        
        /**
         * [topicName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicName(value: IntrinsicFunction) {
          this.topicName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Subscription(
            /**
             * [Endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-endpoint)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val endpoint: String,
            /**
             * [Protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-protocol)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val protocol: String
    )

}

/**
 * [AWS::SNS::Topic - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html)
 */
fun Resources.awsSNSTopic(logicalId: String, init: AWSSNSTopic.() -> Unit = {}): AWSSNSTopic {
    return AWSSNSTopic(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
