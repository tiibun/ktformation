
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkAclEntry - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html)
 */
@CloudFormationMarker
class AWSEC2NetworkAclEntry(logicalId: String) : Resource<AWSEC2NetworkAclEntry.Properties>(logicalId, "AWS::EC2::NetworkAclEntry") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var cidrBlock: Any? = null

        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidrBlock(value: IntrinsicFunction) {
          this.cidrBlock = value
        }
        
        /**
         * [egress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var egress: Any? = null

        /**
         * [egress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun egress(value: Boolean) {
          this.egress = value
        }
        
        /**
         * [egress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun egress(value: IntrinsicFunction) {
          this.egress = value
        }
        
        /**
         * [icmp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-icmp)
         *
         * _Required_: no
         *
         * _Type_: Icmp
         */
        @JvmField
        var icmp: Any? = null

        /**
         * [icmp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-icmp)
         *
         * _Required_: no
         *
         * _Type_: Icmp
         */
        fun icmp(value: Icmp) {
          this.icmp = value
        }
        
        /**
         * [icmp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-icmp)
         *
         * _Required_: no
         *
         * _Type_: Icmp
         */
        fun icmp(value: IntrinsicFunction) {
          this.icmp = value
        }
        
        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ipv6CidrBlock: Any? = null

        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipv6CidrBlock(value: String) {
          this.ipv6CidrBlock = value
        }
        
        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipv6CidrBlock(value: IntrinsicFunction) {
          this.ipv6CidrBlock = value
        }
        
        /**
         * [networkAclId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var networkAclId: Any? = null

        /**
         * [networkAclId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkAclId(value: String) {
          this.networkAclId = value
        }
        
        /**
         * [networkAclId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkAclId(value: IntrinsicFunction) {
          this.networkAclId = value
        }
        
        /**
         * [portRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-portrange)
         *
         * _Required_: no
         *
         * _Type_: PortRange
         */
        @JvmField
        var portRange: Any? = null

        /**
         * [portRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-portrange)
         *
         * _Required_: no
         *
         * _Type_: PortRange
         */
        fun portRange(value: PortRange) {
          this.portRange = value
        }
        
        /**
         * [portRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-portrange)
         *
         * _Required_: no
         *
         * _Type_: PortRange
         */
        fun portRange(value: IntrinsicFunction) {
          this.portRange = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun protocol(value: Int) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }
        
        /**
         * [ruleAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ruleAction: Any? = null

        /**
         * [ruleAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ruleAction(value: String) {
          this.ruleAction = value
        }
        
        /**
         * [ruleAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ruleAction(value: IntrinsicFunction) {
          this.ruleAction = value
        }
        
        /**
         * [ruleNumber](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var ruleNumber: Any? = null

        /**
         * [ruleNumber](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun ruleNumber(value: Int) {
          this.ruleNumber = value
        }
        
        /**
         * [ruleNumber](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun ruleNumber(value: IntrinsicFunction) {
          this.ruleNumber = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Icmp(
            /**
             * [Code](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-code)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val code: Int? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html#cfn-ec2-networkaclentry-icmp-type)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val type: Int? = null
    )

    class PortRange(
            /**
             * [From](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-from)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val from: Int? = null,
            /**
             * [To](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html#cfn-ec2-networkaclentry-portrange-to)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val to: Int? = null
    )

}

/**
 * [AWS::EC2::NetworkAclEntry - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html)
 */
fun Resources.awsEC2NetworkAclEntry(logicalId: String, init: AWSEC2NetworkAclEntry.() -> Unit = {}): AWSEC2NetworkAclEntry {
    return AWSEC2NetworkAclEntry(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
