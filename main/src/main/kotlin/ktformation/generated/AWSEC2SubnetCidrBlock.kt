
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SubnetCidrBlock - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
 */
@CloudFormationMarker
class AWSEC2SubnetCidrBlock(logicalId: String) : Resource<AWSEC2SubnetCidrBlock.Properties>(logicalId, "AWS::EC2::SubnetCidrBlock") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ipv6CidrBlock: Any? = null

        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipv6CidrBlock(value: String) {
          this.ipv6CidrBlock = value
        }
        
        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipv6CidrBlock(value: IntrinsicFunction) {
          this.ipv6CidrBlock = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::EC2::SubnetCidrBlock - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
 */
fun Resources.awsEC2SubnetCidrBlock(logicalId: String, init: AWSEC2SubnetCidrBlock.() -> Unit = {}): AWSEC2SubnetCidrBlock {
    return AWSEC2SubnetCidrBlock(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
