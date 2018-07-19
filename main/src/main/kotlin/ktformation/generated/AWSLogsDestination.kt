
package ktformation.generated

import ktformation.*

/**
 * [AWS::Logs::Destination - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
 */
@CloudFormationMarker
class AWSLogsDestination(logicalId: String) : Resource<AWSLogsDestination.Properties>(logicalId, "AWS::Logs::Destination") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [destinationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var destinationName: Any? = null

        /**
         * [destinationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationName(value: String) {
          this.destinationName = value
        }
        
        /**
         * [destinationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationName(value: IntrinsicFunction) {
          this.destinationName = value
        }

        /**
         * [destinationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var destinationPolicy: Any? = null

        /**
         * [destinationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationPolicy(value: String) {
          this.destinationPolicy = value
        }
        
        /**
         * [destinationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationPolicy(value: IntrinsicFunction) {
          this.destinationPolicy = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [targetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var targetArn: Any? = null

        /**
         * [targetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetArn(value: String) {
          this.targetArn = value
        }
        
        /**
         * [targetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetArn(value: IntrinsicFunction) {
          this.targetArn = value
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
 * [AWS::Logs::Destination - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
 */
fun Resources.awsLogsDestination(logicalId: String, init: AWSLogsDestination.() -> Unit = {}): AWSLogsDestination {
    return AWSLogsDestination(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
