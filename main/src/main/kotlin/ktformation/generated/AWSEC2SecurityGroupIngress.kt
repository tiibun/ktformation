
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html)
 */
@CloudFormationMarker
class AWSEC2SecurityGroupIngress(logicalId: String) : Resource<AWSEC2SecurityGroupIngress.Properties>(logicalId, "AWS::EC2::SecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cidrIp: Any? = null

        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: String) {
          this.cidrIp = value
        }
        
        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: IntrinsicFunction) {
          this.cidrIp = value
        }
        
        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cidrIpv6: Any? = null

        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: String) {
          this.cidrIpv6 = value
        }
        
        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: IntrinsicFunction) {
          this.cidrIpv6 = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var fromPort: Any? = null

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: Int) {
          this.fromPort = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: IntrinsicFunction) {
          this.fromPort = value
        }
        
        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var groupId: Any? = null

        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupId(value: String) {
          this.groupId = value
        }
        
        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupId(value: IntrinsicFunction) {
          this.groupId = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }
        
        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ipProtocol: Any? = null

        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: String) {
          this.ipProtocol = value
        }
        
        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: IntrinsicFunction) {
          this.ipProtocol = value
        }
        
        /**
         * [sourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceSecurityGroupId: Any? = null

        /**
         * [sourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupId(value: String) {
          this.sourceSecurityGroupId = value
        }
        
        /**
         * [sourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupId(value: IntrinsicFunction) {
          this.sourceSecurityGroupId = value
        }
        
        /**
         * [sourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceSecurityGroupName: Any? = null

        /**
         * [sourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupName(value: String) {
          this.sourceSecurityGroupName = value
        }
        
        /**
         * [sourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupName(value: IntrinsicFunction) {
          this.sourceSecurityGroupName = value
        }
        
        /**
         * [sourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceSecurityGroupOwnerId: Any? = null

        /**
         * [sourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupOwnerId(value: String) {
          this.sourceSecurityGroupOwnerId = value
        }
        
        /**
         * [sourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupOwnerId(value: IntrinsicFunction) {
          this.sourceSecurityGroupOwnerId = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var toPort: Any? = null

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: Int) {
          this.toPort = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport)
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
 * [AWS::EC2::SecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html)
 */
fun Resources.awsEC2SecurityGroupIngress(logicalId: String, init: AWSEC2SecurityGroupIngress.() -> Unit = {}): AWSEC2SecurityGroupIngress {
    return AWSEC2SecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
