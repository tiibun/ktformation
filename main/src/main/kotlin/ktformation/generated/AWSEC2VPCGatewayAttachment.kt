
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCGatewayAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
 */
@CloudFormationMarker
class AWSEC2VPCGatewayAttachment(logicalId: String) : Resource<AWSEC2VPCGatewayAttachment.Properties>(logicalId, "AWS::EC2::VPCGatewayAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var internetGatewayId: Any? = null

        fun internetGatewayId(value: String) {
          this.internetGatewayId = value
        }
        fun internetGatewayId(value: IntrinsicFunction) {
  this.internetGatewayId = value
}
        @JvmField
        var vpcId: Any? = null

        fun vpcId(value: String) {
          this.vpcId = value
        }
        fun vpcId(value: IntrinsicFunction) {
  this.vpcId = value
}
        @JvmField
        var vpnGatewayId: Any? = null

        fun vpnGatewayId(value: String) {
          this.vpnGatewayId = value
        }
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

fun Resources.awsEC2VPCGatewayAttachment(logicalId: String, init: AWSEC2VPCGatewayAttachment.() -> Unit = {}): AWSEC2VPCGatewayAttachment {
    return AWSEC2VPCGatewayAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
