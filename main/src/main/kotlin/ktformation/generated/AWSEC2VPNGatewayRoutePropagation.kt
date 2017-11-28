
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNGatewayRoutePropagation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gatewayrouteprop.html)
 */
@CloudFormationMarker
class AWSEC2VPNGatewayRoutePropagation(logicalId: String) : Resource<AWSEC2VPNGatewayRoutePropagation.Properties>(logicalId, "AWS::EC2::VPNGatewayRoutePropagation") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var routeTableIds: Any? = null
        fun routeTableIds(value: List<String>) { this.routeTableIds = value }
        fun routeTableIds(vararg value: IntrinsicFunction) { this.routeTableIds = value }
        @JvmField var vpnGatewayId: Any? = null
        fun vpnGatewayId(value: String) { this.vpnGatewayId = value }
        fun vpnGatewayId(value: IntrinsicFunction) { this.vpnGatewayId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2VPNGatewayRoutePropagation(logicalId: String, init: AWSEC2VPNGatewayRoutePropagation.() -> Unit = {}): AWSEC2VPNGatewayRoutePropagation {
    return AWSEC2VPNGatewayRoutePropagation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
