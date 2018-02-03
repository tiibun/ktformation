
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::SubscriptionFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
 */
@CloudFormationMarker
class AWSLogsSubscriptionFilter(logicalId: String) : Resource<AWSLogsSubscriptionFilter.Properties>(logicalId, "AWS::Logs::SubscriptionFilter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var destinationArn: Any? = null

        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationArn(value: String) {
          this.destinationArn = value
        }
        
        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationArn(value: IntrinsicFunction) {
          this.destinationArn = value
        }
        
        /**
         * [filterPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var filterPattern: Any? = null

        /**
         * [filterPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun filterPattern(value: String) {
          this.filterPattern = value
        }
        
        /**
         * [filterPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun filterPattern(value: IntrinsicFunction) {
          this.filterPattern = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var logGroupName: Any? = null

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
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
 * [AWS::Logs::SubscriptionFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
 */
fun Resources.awsLogsSubscriptionFilter(logicalId: String, init: AWSLogsSubscriptionFilter.() -> Unit = {}): AWSLogsSubscriptionFilter {
    return AWSLogsSubscriptionFilter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
