
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::LogGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
 */
@CloudFormationMarker
class AWSLogsLogGroup(logicalId: String) : Resource<AWSLogsLogGroup.Properties>(logicalId, "AWS::Logs::LogGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var logGroupName: Any? = null

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-loggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }

        /**
         * [retentionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var retentionInDays: Any? = null

        /**
         * [retentionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retentionInDays(value: Int) {
          this.retentionInDays = value
        }
        
        /**
         * [retentionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html#cfn-cwl-loggroup-retentionindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retentionInDays(value: IntrinsicFunction) {
          this.retentionInDays = value
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
 * [AWS::Logs::LogGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
 */
fun Resources.awsLogsLogGroup(logicalId: String, init: AWSLogsLogGroup.() -> Unit = {}): AWSLogsLogGroup {
    return AWSLogsLogGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
