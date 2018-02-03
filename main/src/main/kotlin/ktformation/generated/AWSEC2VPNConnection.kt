
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNConnection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection.html)
 */
@CloudFormationMarker
class AWSEC2VPNConnection(logicalId: String) : Resource<AWSEC2VPNConnection.Properties>(logicalId, "AWS::EC2::VPNConnection") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var customerGatewayId: Any? = null

        fun customerGatewayId(value: String) {
          this.customerGatewayId = value
        }
        
        fun customerGatewayId(value: IntrinsicFunction) {
          this.customerGatewayId = value
        }
        
        @JvmField
        var staticRoutesOnly: Any? = null

        fun staticRoutesOnly(value: Boolean) {
          this.staticRoutesOnly = value
        }
        
        fun staticRoutesOnly(value: IntrinsicFunction) {
          this.staticRoutesOnly = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        @JvmField
        var type: Any? = null

        fun type(value: String) {
          this.type = value
        }
        
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
        @JvmField
        var vpnGatewayId: Any? = null

        fun vpnGatewayId(value: String) {
          this.vpnGatewayId = value
        }
        
        fun vpnGatewayId(value: IntrinsicFunction) {
          this.vpnGatewayId = value
        }
        
        @JvmField
        var vpnTunnelOptionsSpecifications: Any? = null

        fun vpnTunnelOptionsSpecifications(value: List<VpnTunnelOptionsSpecification>) {
          this.vpnTunnelOptionsSpecifications = value
        }
        
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
            val preSharedKey: String? = null,
            val tunnelInsideCidr: String? = null
    )

}

fun Resources.awsEC2VPNConnection(logicalId: String, init: AWSEC2VPNConnection.() -> Unit = {}): AWSEC2VPNConnection {
    return AWSEC2VPNConnection(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
