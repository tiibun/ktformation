
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNConnection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html)
 */
@CloudFormationMarker
class AWSEC2VPNConnection(logicalId: String) : Resource<AWSEC2VPNConnection.Properties>(logicalId, "AWS::EC2::VPNConnection") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [customerGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var customerGatewayId: Any? = null

        /**
         * [customerGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun customerGatewayId(value: String) {
          this.customerGatewayId = value
        }
        
        /**
         * [customerGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-customergatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun customerGatewayId(value: IntrinsicFunction) {
          this.customerGatewayId = value
        }
        
        /**
         * [staticRoutesOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var staticRoutesOnly: Any? = null

        /**
         * [staticRoutesOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun staticRoutesOnly(value: Boolean) {
          this.staticRoutesOnly = value
        }
        
        /**
         * [staticRoutesOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-StaticRoutesOnly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun staticRoutesOnly(value: IntrinsicFunction) {
          this.staticRoutesOnly = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpnGatewayId: Any? = null

        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpnGatewayId(value: String) {
          this.vpnGatewayId = value
        }
        
        /**
         * [vpnGatewayId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpngatewayid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpnGatewayId(value: IntrinsicFunction) {
          this.vpnGatewayId = value
        }
        
        /**
         * [vpnTunnelOptionsSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<VpnTunnelOptionsSpecification>
         */
        @JvmField
        var vpnTunnelOptionsSpecifications: Any? = null

        /**
         * [vpnTunnelOptionsSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<VpnTunnelOptionsSpecification>
         */
        fun vpnTunnelOptionsSpecifications(value: List<VpnTunnelOptionsSpecification>) {
          this.vpnTunnelOptionsSpecifications = value
        }
        
        /**
         * [vpnTunnelOptionsSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<VpnTunnelOptionsSpecification>
         */
        fun vpnTunnelOptionsSpecifications(vararg value: IntrinsicFunction) {
          this.vpnTunnelOptionsSpecifications = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class VpnTunnelOptionsSpecification(
            /**
             * [PreSharedKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val preSharedKey: String? = null,
            /**
             * [TunnelInsideCidr](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tunnelInsideCidr: String? = null
    )

}

/**
 * [AWS::EC2::VPNConnection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html)
 */
fun Resources.awsEC2VPNConnection(logicalId: String, init: AWSEC2VPNConnection.() -> Unit = {}): AWSEC2VPNConnection {
    return AWSEC2VPNConnection(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
