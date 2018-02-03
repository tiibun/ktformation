
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCCidrBlock - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
 */
@CloudFormationMarker
class AWSEC2VPCCidrBlock(logicalId: String) : Resource<AWSEC2VPCCidrBlock.Properties>(logicalId, "AWS::EC2::VPCCidrBlock") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [amazonProvidedIpv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var amazonProvidedIpv6CidrBlock: Any? = null

        /**
         * [amazonProvidedIpv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun amazonProvidedIpv6CidrBlock(value: Boolean) {
          this.amazonProvidedIpv6CidrBlock = value
        }
        
        /**
         * [amazonProvidedIpv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun amazonProvidedIpv6CidrBlock(value: IntrinsicFunction) {
          this.amazonProvidedIpv6CidrBlock = value
        }
        
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cidrBlock: Any? = null

        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrBlock(value: IntrinsicFunction) {
          this.cidrBlock = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::EC2::VPCCidrBlock - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
 */
fun Resources.awsEC2VPCCidrBlock(logicalId: String, init: AWSEC2VPCCidrBlock.() -> Unit = {}): AWSEC2VPCCidrBlock {
    return AWSEC2VPCCidrBlock(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
