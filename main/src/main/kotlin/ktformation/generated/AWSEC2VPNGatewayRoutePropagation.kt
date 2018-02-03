
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNGatewayRoutePropagation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html)
 */
@CloudFormationMarker
class AWSEC2VPNGatewayRoutePropagation(logicalId: String) : Resource<AWSEC2VPNGatewayRoutePropagation.Properties>(logicalId, "AWS::EC2::VPNGatewayRoutePropagation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [routeTableIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var routeTableIds: Any? = null

        /**
         * [routeTableIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun routeTableIds(value: List<String>) {
          this.routeTableIds = value
        }
        
        /**
         * [routeTableIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-routetableids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun routeTableIds(vararg value: IntrinsicFunction) {
          this.routeTableIds = value
        }
        
        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpnGatewayId: Any? = null

        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpnGatewayId(value: String) {
          this.vpnGatewayId = value
        }
        
        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html#cfn-ec2-vpngatewayrouteprop-vpngatewayid)
         *
         * _Required_: yes
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
 * [AWS::EC2::VPNGatewayRoutePropagation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html)
 */
fun Resources.awsEC2VPNGatewayRoutePropagation(logicalId: String, init: AWSEC2VPNGatewayRoutePropagation.() -> Unit = {}): AWSEC2VPNGatewayRoutePropagation {
    return AWSEC2VPNGatewayRoutePropagation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
