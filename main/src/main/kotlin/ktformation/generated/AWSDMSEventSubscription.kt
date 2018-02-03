
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::EventSubscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html)
 */
@CloudFormationMarker
class AWSDMSEventSubscription(logicalId: String) : Resource<AWSDMSEventSubscription.Properties>(logicalId, "AWS::DMS::EventSubscription") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var enabled: Any? = null

        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }
        
        @JvmField
        var eventCategories: Any? = null

        fun eventCategories(value: List<String>) {
          this.eventCategories = value
        }
        
        fun eventCategories(vararg value: IntrinsicFunction) {
          this.eventCategories = value
        }
        
        @JvmField
        var snsTopicArn: Any? = null

        fun snsTopicArn(value: String) {
          this.snsTopicArn = value
        }
        
        fun snsTopicArn(value: IntrinsicFunction) {
          this.snsTopicArn = value
        }
        
        @JvmField
        var sourceIds: Any? = null

        fun sourceIds(value: List<String>) {
          this.sourceIds = value
        }
        
        fun sourceIds(vararg value: IntrinsicFunction) {
          this.sourceIds = value
        }
        
        @JvmField
        var sourceType: Any? = null

        fun sourceType(value: String) {
          this.sourceType = value
        }
        
        fun sourceType(value: IntrinsicFunction) {
          this.sourceType = value
        }
        
        @JvmField
        var subscriptionName: Any? = null

        fun subscriptionName(value: String) {
          this.subscriptionName = value
        }
        
        fun subscriptionName(value: IntrinsicFunction) {
          this.subscriptionName = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
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

fun Resources.awsDMSEventSubscription(logicalId: String, init: AWSDMSEventSubscription.() -> Unit = {}): AWSDMSEventSubscription {
    return AWSDMSEventSubscription(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
