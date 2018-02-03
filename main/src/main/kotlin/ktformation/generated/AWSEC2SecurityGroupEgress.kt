
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SecurityGroupEgress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html)
 */
@CloudFormationMarker
class AWSEC2SecurityGroupEgress(logicalId: String) : Resource<AWSEC2SecurityGroupEgress.Properties>(logicalId, "AWS::EC2::SecurityGroupEgress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cidrIp: Any? = null

        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: String) {
          this.cidrIp = value
        }
        
        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: IntrinsicFunction) {
          this.cidrIp = value
        }
        
        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cidrIpv6: Any? = null

        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: String) {
          this.cidrIpv6 = value
        }
        
        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: IntrinsicFunction) {
          this.cidrIpv6 = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [destinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var destinationPrefixListId: Any? = null

        /**
         * [destinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationPrefixListId(value: String) {
          this.destinationPrefixListId = value
        }
        
        /**
         * [destinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationPrefixListId(value: IntrinsicFunction) {
          this.destinationPrefixListId = value
        }
        
        /**
         * [destinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var destinationSecurityGroupId: Any? = null

        /**
         * [destinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationSecurityGroupId(value: String) {
          this.destinationSecurityGroupId = value
        }
        
        /**
         * [destinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationSecurityGroupId(value: IntrinsicFunction) {
          this.destinationSecurityGroupId = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var fromPort: Any? = null

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: Int) {
          this.fromPort = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: IntrinsicFunction) {
          this.fromPort = value
        }
        
        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var groupId: Any? = null

        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupId(value: String) {
          this.groupId = value
        }
        
        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupId(value: IntrinsicFunction) {
          this.groupId = value
        }
        
        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ipProtocol: Any? = null

        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: String) {
          this.ipProtocol = value
        }
        
        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: IntrinsicFunction) {
          this.ipProtocol = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var toPort: Any? = null

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: Int) {
          this.toPort = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: IntrinsicFunction) {
          this.toPort = value
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
 * [AWS::EC2::SecurityGroupEgress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html)
 */
fun Resources.awsEC2SecurityGroupEgress(logicalId: String, init: AWSEC2SecurityGroupEgress.() -> Unit = {}): AWSEC2SecurityGroupEgress {
    return AWSEC2SecurityGroupEgress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
