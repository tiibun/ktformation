
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNConnectionRoute - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html)
 */
@CloudFormationMarker
class AWSEC2VPNConnectionRoute(logicalId: String) : Resource<AWSEC2VPNConnectionRoute.Properties>(logicalId, "AWS::EC2::VPNConnectionRoute") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [destinationCidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var destinationCidrBlock: Any? = null

        /**
         * [destinationCidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationCidrBlock(value: String) {
          this.destinationCidrBlock = value
        }
        
        /**
         * [destinationCidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun destinationCidrBlock(value: IntrinsicFunction) {
          this.destinationCidrBlock = value
        }
        
        /**
         * [vpnConnectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpnConnectionId: Any? = null

        /**
         * [vpnConnectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpnConnectionId(value: String) {
          this.vpnConnectionId = value
        }
        
        /**
         * [vpnConnectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html#cfn-ec2-vpnconnectionroute-connectionid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpnConnectionId(value: IntrinsicFunction) {
          this.vpnConnectionId = value
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
 * [AWS::EC2::VPNConnectionRoute - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html)
 */
fun Resources.awsEC2VPNConnectionRoute(logicalId: String, init: AWSEC2VPNConnectionRoute.() -> Unit = {}): AWSEC2VPNConnectionRoute {
    return AWSEC2VPNConnectionRoute(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
