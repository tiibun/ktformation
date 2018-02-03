
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::FlowLog - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html)
 */
@CloudFormationMarker
class AWSEC2FlowLog(logicalId: String) : Resource<AWSEC2FlowLog.Properties>(logicalId, "AWS::EC2::FlowLog") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [deliverLogsPermissionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var deliverLogsPermissionArn: Any? = null

        /**
         * [deliverLogsPermissionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deliverLogsPermissionArn(value: String) {
          this.deliverLogsPermissionArn = value
        }
        
        /**
         * [deliverLogsPermissionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deliverLogsPermissionArn(value: IntrinsicFunction) {
          this.deliverLogsPermissionArn = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var logGroupName: Any? = null

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceId: Any? = null

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: String) {
          this.resourceId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: IntrinsicFunction) {
          this.resourceId = value
        }
        
        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceType: Any? = null

        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceType(value: String) {
          this.resourceType = value
        }
        
        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceType(value: IntrinsicFunction) {
          this.resourceType = value
        }
        
        /**
         * [trafficType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var trafficType: Any? = null

        /**
         * [trafficType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun trafficType(value: String) {
          this.trafficType = value
        }
        
        /**
         * [trafficType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun trafficType(value: IntrinsicFunction) {
          this.trafficType = value
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
 * [AWS::EC2::FlowLog - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html)
 */
fun Resources.awsEC2FlowLog(logicalId: String, init: AWSEC2FlowLog.() -> Unit = {}): AWSEC2FlowLog {
    return AWSEC2FlowLog(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
