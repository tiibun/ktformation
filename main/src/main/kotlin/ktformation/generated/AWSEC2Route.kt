
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Route - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
 */
@CloudFormationMarker
class AWSEC2Route(logicalId: String) : Resource<AWSEC2Route.Properties>(logicalId, "AWS::EC2::Route") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [destinationCidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var destinationCidrBlock: Any? = null

        /**
         * [destinationCidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationCidrBlock(value: String) {
          this.destinationCidrBlock = value
        }
        
        /**
         * [destinationCidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationCidrBlock(value: IntrinsicFunction) {
          this.destinationCidrBlock = value
        }
        
        /**
         * [destinationIpv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var destinationIpv6CidrBlock: Any? = null

        /**
         * [destinationIpv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationIpv6CidrBlock(value: String) {
          this.destinationIpv6CidrBlock = value
        }
        
        /**
         * [destinationIpv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationIpv6CidrBlock(value: IntrinsicFunction) {
          this.destinationIpv6CidrBlock = value
        }
        
        /**
         * [egressOnlyInternetGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var egressOnlyInternetGatewayId: Any? = null

        /**
         * [egressOnlyInternetGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun egressOnlyInternetGatewayId(value: String) {
          this.egressOnlyInternetGatewayId = value
        }
        
        /**
         * [egressOnlyInternetGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun egressOnlyInternetGatewayId(value: IntrinsicFunction) {
          this.egressOnlyInternetGatewayId = value
        }
        
        /**
         * [gatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var gatewayId: Any? = null

        /**
         * [gatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun gatewayId(value: String) {
          this.gatewayId = value
        }
        
        /**
         * [gatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun gatewayId(value: IntrinsicFunction) {
          this.gatewayId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }
        
        /**
         * [natGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var natGatewayId: Any? = null

        /**
         * [natGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun natGatewayId(value: String) {
          this.natGatewayId = value
        }
        
        /**
         * [natGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun natGatewayId(value: IntrinsicFunction) {
          this.natGatewayId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }
        
        /**
         * [routeTableId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var routeTableId: Any? = null

        /**
         * [routeTableId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun routeTableId(value: String) {
          this.routeTableId = value
        }
        
        /**
         * [routeTableId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun routeTableId(value: IntrinsicFunction) {
          this.routeTableId = value
        }
        
        /**
         * [vpcPeeringConnectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var vpcPeeringConnectionId: Any? = null

        /**
         * [vpcPeeringConnectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcPeeringConnectionId(value: String) {
          this.vpcPeeringConnectionId = value
        }
        
        /**
         * [vpcPeeringConnectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcPeeringConnectionId(value: IntrinsicFunction) {
          this.vpcPeeringConnectionId = value
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
 * [AWS::EC2::Route - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
 */
fun Resources.awsEC2Route(logicalId: String, init: AWSEC2Route.() -> Unit = {}): AWSEC2Route {
    return AWSEC2Route(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
