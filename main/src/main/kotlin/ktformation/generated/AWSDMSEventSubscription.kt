
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::EventSubscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
 */
@CloudFormationMarker
class AWSDMSEventSubscription(logicalId: String) : Resource<AWSDMSEventSubscription.Properties>(logicalId, "AWS::DMS::EventSubscription") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }
        
        /**
         * [eventCategories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var eventCategories: Any? = null

        /**
         * [eventCategories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun eventCategories(value: List<String>) {
          this.eventCategories = value
        }
        
        /**
         * [eventCategories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun eventCategories(vararg value: IntrinsicFunction) {
          this.eventCategories = value
        }
        
        /**
         * [snsTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var snsTopicArn: Any? = null

        /**
         * [snsTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun snsTopicArn(value: String) {
          this.snsTopicArn = value
        }
        
        /**
         * [snsTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun snsTopicArn(value: IntrinsicFunction) {
          this.snsTopicArn = value
        }
        
        /**
         * [sourceIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var sourceIds: Any? = null

        /**
         * [sourceIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun sourceIds(value: List<String>) {
          this.sourceIds = value
        }
        
        /**
         * [sourceIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun sourceIds(vararg value: IntrinsicFunction) {
          this.sourceIds = value
        }
        
        /**
         * [sourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceType: Any? = null

        /**
         * [sourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceType(value: String) {
          this.sourceType = value
        }
        
        /**
         * [sourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceType(value: IntrinsicFunction) {
          this.sourceType = value
        }
        
        /**
         * [subscriptionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subscriptionName: Any? = null

        /**
         * [subscriptionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subscriptionName(value: String) {
          this.subscriptionName = value
        }
        
        /**
         * [subscriptionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subscriptionName(value: IntrinsicFunction) {
          this.subscriptionName = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
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
 * [AWS::DMS::EventSubscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
 */
fun Resources.awsDMSEventSubscription(logicalId: String, init: AWSDMSEventSubscription.() -> Unit = {}): AWSDMSEventSubscription {
    return AWSDMSEventSubscription(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
