
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNConnectionRoute - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html)
 */
@CloudFormationMarker
class AWSEC2VPNConnectionRoute(logicalId: String) : Resource<AWSEC2VPNConnectionRoute.Properties>(logicalId, "AWS::EC2::VPNConnectionRoute") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var destinationCidrBlock: Any? = null

        fun destinationCidrBlock(value: String) {
          this.destinationCidrBlock = value
        }
        
        fun destinationCidrBlock(value: IntrinsicFunction) {
          this.destinationCidrBlock = value
        }
        
        @JvmField
        var vpnConnectionId: Any? = null

        fun vpnConnectionId(value: String) {
          this.vpnConnectionId = value
        }
        
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

fun Resources.awsEC2VPNConnectionRoute(logicalId: String, init: AWSEC2VPNConnectionRoute.() -> Unit = {}): AWSEC2VPNConnectionRoute {
    return AWSEC2VPNConnectionRoute(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
