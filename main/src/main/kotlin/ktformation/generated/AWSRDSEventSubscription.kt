
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::EventSubscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
 */
@CloudFormationMarker
class AWSRDSEventSubscription(logicalId: String) : Resource<AWSRDSEventSubscription.Properties>(logicalId, "AWS::RDS::EventSubscription") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var enabled: Any? = null
        fun enabled(value: Boolean?) { this.enabled = value }
        fun enabled(value: IntrinsicFunction) { this.enabled = value }
        @JvmField var eventCategories: Any? = null
        fun eventCategories(value: List<String>?) { this.eventCategories = value }
        fun eventCategories(vararg value: IntrinsicFunction) { this.eventCategories = value }
        @JvmField var snsTopicArn: Any? = null
        fun snsTopicArn(value: String) { this.snsTopicArn = value }
        fun snsTopicArn(value: IntrinsicFunction) { this.snsTopicArn = value }
        @JvmField var sourceIds: Any? = null
        fun sourceIds(value: List<String>?) { this.sourceIds = value }
        fun sourceIds(vararg value: IntrinsicFunction) { this.sourceIds = value }
        @JvmField var sourceType: Any? = null
        fun sourceType(value: String?) { this.sourceType = value }
        fun sourceType(value: IntrinsicFunction) { this.sourceType = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsRDSEventSubscription(logicalId: String, init: AWSRDSEventSubscription.() -> Unit = {}): AWSRDSEventSubscription {
    return AWSRDSEventSubscription(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
