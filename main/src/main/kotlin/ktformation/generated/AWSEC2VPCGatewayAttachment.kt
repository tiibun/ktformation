
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCGatewayAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
 */
@CloudFormationMarker
class AWSEC2VPCGatewayAttachment(logicalId: String) : Resource<AWSEC2VPCGatewayAttachment.Properties>(logicalId, "AWS::EC2::VPCGatewayAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [internetGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var internetGatewayId: Any? = null

        /**
         * [internetGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun internetGatewayId(value: String) {
          this.internetGatewayId = value
        }
        
        /**
         * [internetGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun internetGatewayId(value: IntrinsicFunction) {
          this.internetGatewayId = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }

        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var vpnGatewayId: Any? = null

        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpnGatewayId(value: String) {
          this.vpnGatewayId = value
        }
        
        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpnGatewayId(value: IntrinsicFunction) {
          this.vpnGatewayId = value
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
 * [AWS::EC2::VPCGatewayAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
 */
fun Resources.awsEC2VPCGatewayAttachment(logicalId: String, init: AWSEC2VPCGatewayAttachment.() -> Unit = {}): AWSEC2VPCGatewayAttachment {
    return AWSEC2VPCGatewayAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
