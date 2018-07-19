
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::EventSubscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
 */
@CloudFormationMarker
class AWSRDSEventSubscription(logicalId: String) : Resource<AWSRDSEventSubscription.Properties>(logicalId, "AWS::RDS::EventSubscription") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [eventCategories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var eventCategories: Any? = null

        /**
         * [eventCategories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun eventCategories(value: List<String>) {
          this.eventCategories = value
        }
        
        /**
         * [eventCategories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun eventCategories(vararg value: IntrinsicFunction) {
          this.eventCategories = value
        }

        /**
         * [snsTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var snsTopicArn: Any? = null

        /**
         * [snsTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun snsTopicArn(value: String) {
          this.snsTopicArn = value
        }
        
        /**
         * [snsTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun snsTopicArn(value: IntrinsicFunction) {
          this.snsTopicArn = value
        }

        /**
         * [sourceIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var sourceIds: Any? = null

        /**
         * [sourceIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun sourceIds(value: List<String>) {
          this.sourceIds = value
        }
        
        /**
         * [sourceIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun sourceIds(vararg value: IntrinsicFunction) {
          this.sourceIds = value
        }

        /**
         * [sourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceType: Any? = null

        /**
         * [sourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceType(value: String) {
          this.sourceType = value
        }
        
        /**
         * [sourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceType(value: IntrinsicFunction) {
          this.sourceType = value
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
 * [AWS::RDS::EventSubscription - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
 */
fun Resources.awsRDSEventSubscription(logicalId: String, init: AWSRDSEventSubscription.() -> Unit = {}): AWSRDSEventSubscription {
    return AWSRDSEventSubscription(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
