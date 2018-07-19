
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCDHCPOptionsAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html)
 */
@CloudFormationMarker
class AWSEC2VPCDHCPOptionsAssociation(logicalId: String) : Resource<AWSEC2VPCDHCPOptionsAssociation.Properties>(logicalId, "AWS::EC2::VPCDHCPOptionsAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [dhcpOptionsId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dhcpOptionsId: Any? = null

        /**
         * [dhcpOptionsId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dhcpOptionsId(value: String) {
          this.dhcpOptionsId = value
        }
        
        /**
         * [dhcpOptionsId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dhcpOptionsId(value: IntrinsicFunction) {
          this.dhcpOptionsId = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
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
 * [AWS::EC2::VPCDHCPOptionsAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-dhcp-options-assoc.html)
 */
fun Resources.awsEC2VPCDHCPOptionsAssociation(logicalId: String, init: AWSEC2VPCDHCPOptionsAssociation.() -> Unit = {}): AWSEC2VPCDHCPOptionsAssociation {
    return AWSEC2VPCDHCPOptionsAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
