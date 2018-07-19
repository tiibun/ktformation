
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::LogStream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
@CloudFormationMarker
class AWSLogsLogStream(logicalId: String) : Resource<AWSLogsLogStream.Properties>(logicalId, "AWS::Logs::LogStream") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var logGroupName: Any? = null

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }

        /**
         * [logStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var logStreamName: Any? = null

        /**
         * [logStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logStreamName(value: String) {
          this.logStreamName = value
        }
        
        /**
         * [logStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logStreamName(value: IntrinsicFunction) {
          this.logStreamName = value
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
 * [AWS::Logs::LogStream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
fun Resources.awsLogsLogStream(logicalId: String, init: AWSLogsLogStream.() -> Unit = {}): AWSLogsLogStream {
    return AWSLogsLogStream(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
