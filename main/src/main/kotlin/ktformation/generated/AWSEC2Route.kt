
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Route - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
 */
@CloudFormationMarker
class AWSEC2Route(logicalId: String) : Resource<AWSEC2Route.Properties>(logicalId, "AWS::EC2::Route") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var destinationCidrBlock: Any? = null
        fun destinationCidrBlock(value: String?) { this.destinationCidrBlock = value }
        fun destinationCidrBlock(value: IntrinsicFunction) { this.destinationCidrBlock = value }
        @JvmField var destinationIpv6CidrBlock: Any? = null
        fun destinationIpv6CidrBlock(value: String?) { this.destinationIpv6CidrBlock = value }
        fun destinationIpv6CidrBlock(value: IntrinsicFunction) { this.destinationIpv6CidrBlock = value }
        @JvmField var egressOnlyInternetGatewayId: Any? = null
        fun egressOnlyInternetGatewayId(value: String?) { this.egressOnlyInternetGatewayId = value }
        fun egressOnlyInternetGatewayId(value: IntrinsicFunction) { this.egressOnlyInternetGatewayId = value }
        @JvmField var gatewayId: Any? = null
        fun gatewayId(value: String?) { this.gatewayId = value }
        fun gatewayId(value: IntrinsicFunction) { this.gatewayId = value }
        @JvmField var instanceId: Any? = null
        fun instanceId(value: String?) { this.instanceId = value }
        fun instanceId(value: IntrinsicFunction) { this.instanceId = value }
        @JvmField var natGatewayId: Any? = null
        fun natGatewayId(value: String?) { this.natGatewayId = value }
        fun natGatewayId(value: IntrinsicFunction) { this.natGatewayId = value }
        @JvmField var networkInterfaceId: Any? = null
        fun networkInterfaceId(value: String?) { this.networkInterfaceId = value }
        fun networkInterfaceId(value: IntrinsicFunction) { this.networkInterfaceId = value }
        @JvmField var routeTableId: Any? = null
        fun routeTableId(value: String) { this.routeTableId = value }
        fun routeTableId(value: IntrinsicFunction) { this.routeTableId = value }
        @JvmField var vpcPeeringConnectionId: Any? = null
        fun vpcPeeringConnectionId(value: String?) { this.vpcPeeringConnectionId = value }
        fun vpcPeeringConnectionId(value: IntrinsicFunction) { this.vpcPeeringConnectionId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2Route(logicalId: String, init: AWSEC2Route.() -> Unit = {}): AWSEC2Route {
    return AWSEC2Route(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
