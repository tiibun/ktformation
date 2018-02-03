
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkInterfaceAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html)
 */
@CloudFormationMarker
class AWSEC2NetworkInterfaceAttachment(logicalId: String) : Resource<AWSEC2NetworkInterfaceAttachment.Properties>(logicalId, "AWS::EC2::NetworkInterfaceAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var deviceIndex: Any? = null

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceIndex(value: String) {
          this.deviceIndex = value
        }
        
        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceIndex(value: IntrinsicFunction) {
          this.deviceIndex = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
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
 * [AWS::EC2::NetworkInterfaceAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html)
 */
fun Resources.awsEC2NetworkInterfaceAttachment(logicalId: String, init: AWSEC2NetworkInterfaceAttachment.() -> Unit = {}): AWSEC2NetworkInterfaceAttachment {
    return AWSEC2NetworkInterfaceAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
