
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SubnetCidrBlock - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
 */
@CloudFormationMarker
class AWSEC2SubnetCidrBlock(logicalId: String) : Resource<AWSEC2SubnetCidrBlock.Properties>(logicalId, "AWS::EC2::SubnetCidrBlock") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var ipv6CidrBlock: Any? = null

        fun ipv6CidrBlock(value: String) {
          this.ipv6CidrBlock = value
        }
        
        fun ipv6CidrBlock(value: IntrinsicFunction) {
          this.ipv6CidrBlock = value
        }
        
        @JvmField
        var subnetId: Any? = null

        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2SubnetCidrBlock(logicalId: String, init: AWSEC2SubnetCidrBlock.() -> Unit = {}): AWSEC2SubnetCidrBlock {
    return AWSEC2SubnetCidrBlock(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
