
package ktformation.generated

import ktformation.*

/**
 * [AWS::SNS::Subscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
 */
@CloudFormationMarker
class AWSSNSSubscription(logicalId: String) : Resource<AWSSNSSubscription.Properties>(logicalId, "AWS::SNS::Subscription") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [deliveryPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var deliveryPolicy: Any? = null

        /**
         * [deliveryPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun deliveryPolicy(value: Json) {
          this.deliveryPolicy = value
        }
        
        /**
         * [deliveryPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun deliveryPolicy(value: IntrinsicFunction) {
          this.deliveryPolicy = value
        }

        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var endpoint: Any? = null

        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpoint(value: String) {
          this.endpoint = value
        }
        
        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpoint(value: IntrinsicFunction) {
          this.endpoint = value
        }

        /**
         * [filterPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var filterPolicy: Any? = null

        /**
         * [filterPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun filterPolicy(value: Json) {
          this.filterPolicy = value
        }
        
        /**
         * [filterPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun filterPolicy(value: IntrinsicFunction) {
          this.filterPolicy = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

        /**
         * [rawMessageDelivery](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var rawMessageDelivery: Any? = null

        /**
         * [rawMessageDelivery](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun rawMessageDelivery(value: Boolean) {
          this.rawMessageDelivery = value
        }
        
        /**
         * [rawMessageDelivery](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun rawMessageDelivery(value: IntrinsicFunction) {
          this.rawMessageDelivery = value
        }

        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var region: Any? = null

        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun region(value: String) {
          this.region = value
        }
        
        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun region(value: IntrinsicFunction) {
          this.region = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::SNS::Subscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
 */
fun Resources.awsSNSSubscription(logicalId: String, init: AWSSNSSubscription.() -> Unit = {}): AWSSNSSubscription {
    return AWSSNSSubscription(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
