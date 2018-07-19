
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCEndpointConnectionNotification - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html)
 */
@CloudFormationMarker
class AWSEC2VPCEndpointConnectionNotification(logicalId: String) : Resource<AWSEC2VPCEndpointConnectionNotification.Properties>(logicalId, "AWS::EC2::VPCEndpointConnectionNotification") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [connectionEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var connectionEvents: Any? = null

        /**
         * [connectionEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun connectionEvents(value: List<String>) {
          this.connectionEvents = value
        }
        
        /**
         * [connectionEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun connectionEvents(vararg value: IntrinsicFunction) {
          this.connectionEvents = value
        }

        /**
         * [connectionNotificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var connectionNotificationArn: Any? = null

        /**
         * [connectionNotificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun connectionNotificationArn(value: String) {
          this.connectionNotificationArn = value
        }
        
        /**
         * [connectionNotificationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun connectionNotificationArn(value: IntrinsicFunction) {
          this.connectionNotificationArn = value
        }

        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serviceId: Any? = null

        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceId(value: String) {
          this.serviceId = value
        }
        
        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceId(value: IntrinsicFunction) {
          this.serviceId = value
        }

        /**
         * [vPCEndpointId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var vPCEndpointId: Any? = null

        /**
         * [vPCEndpointId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vPCEndpointId(value: String) {
          this.vPCEndpointId = value
        }
        
        /**
         * [vPCEndpointId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vPCEndpointId(value: IntrinsicFunction) {
          this.vPCEndpointId = value
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
 * [AWS::EC2::VPCEndpointConnectionNotification - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html)
 */
fun Resources.awsEC2VPCEndpointConnectionNotification(logicalId: String, init: AWSEC2VPCEndpointConnectionNotification.() -> Unit = {}): AWSEC2VPCEndpointConnectionNotification {
    return AWSEC2VPCEndpointConnectionNotification(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
