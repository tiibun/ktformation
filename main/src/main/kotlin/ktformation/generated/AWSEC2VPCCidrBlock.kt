
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCCidrBlock - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
 */
@CloudFormationMarker
class AWSEC2VPCCidrBlock(logicalId: String) : Resource<AWSEC2VPCCidrBlock.Properties>(logicalId, "AWS::EC2::VPCCidrBlock") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var amazonProvidedIpv6CidrBlock: Any? = null

        fun amazonProvidedIpv6CidrBlock(value: Boolean) {
          this.amazonProvidedIpv6CidrBlock = value
        }
        
        fun amazonProvidedIpv6CidrBlock(value: IntrinsicFunction) {
          this.amazonProvidedIpv6CidrBlock = value
        }
        
        @JvmField
        var cidrBlock: Any? = null

        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        
        fun cidrBlock(value: IntrinsicFunction) {
          this.cidrBlock = value
        }
        
        @JvmField
        var vpcId: Any? = null

        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2VPCCidrBlock(logicalId: String, init: AWSEC2VPCCidrBlock.() -> Unit = {}): AWSEC2VPCCidrBlock {
    return AWSEC2VPCCidrBlock(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
