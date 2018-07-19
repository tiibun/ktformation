
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
 */
@CloudFormationMarker
class AWSEC2SecurityGroup(logicalId: String) : Resource<AWSEC2SecurityGroup.Properties>(logicalId, "AWS::EC2::SecurityGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [groupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var groupDescription: Any? = null

        /**
         * [groupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupDescription(value: String) {
          this.groupDescription = value
        }
        
        /**
         * [groupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupDescription(value: IntrinsicFunction) {
          this.groupDescription = value
        }

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }

        /**
         * [securityGroupEgress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress)
         *
         * _Required_: no
         *
         * _Type_: List<Egress>
         */
        @JvmField
        var securityGroupEgress: Any? = null

        /**
         * [securityGroupEgress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress)
         *
         * _Required_: no
         *
         * _Type_: List<Egress>
         */
        fun securityGroupEgress(value: List<Egress>) {
          this.securityGroupEgress = value
        }
        
        /**
         * [securityGroupEgress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupegress)
         *
         * _Required_: no
         *
         * _Type_: List<Egress>
         */
        fun securityGroupEgress(vararg value: IntrinsicFunction) {
          this.securityGroupEgress = value
        }

        /**
         * [securityGroupIngress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress)
         *
         * _Required_: no
         *
         * _Type_: List<Ingress>
         */
        @JvmField
        var securityGroupIngress: Any? = null

        /**
         * [securityGroupIngress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress)
         *
         * _Required_: no
         *
         * _Type_: List<Ingress>
         */
        fun securityGroupIngress(value: List<Ingress>) {
          this.securityGroupIngress = value
        }
        
        /**
         * [securityGroupIngress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-securitygroupingress)
         *
         * _Required_: no
         *
         * _Type_: List<Ingress>
         */
        fun securityGroupIngress(vararg value: IntrinsicFunction) {
          this.securityGroupIngress = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }

        /**
        * [Egress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html)
        */
        fun egress(init: Egress.() -> Unit = {}): Egress {
            return Egress().also {
                it.init()
            }
        }
        /**
        * [Ingress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html)
        */
        fun ingress(init: Ingress.() -> Unit = {}): Ingress {
            return Ingress().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class Egress {
            /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cidrIp: Any? = null

        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: String) {
          this.cidrIp = value
        }
        
        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: IntrinsicFunction) {
          this.cidrIp = value
        }

        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cidrIpv6: Any? = null

        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: String) {
          this.cidrIpv6 = value
        }
        
        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: IntrinsicFunction) {
          this.cidrIpv6 = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [destinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var destinationPrefixListId: Any? = null

        /**
         * [destinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationPrefixListId(value: String) {
          this.destinationPrefixListId = value
        }
        
        /**
         * [destinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationPrefixListId(value: IntrinsicFunction) {
          this.destinationPrefixListId = value
        }

        /**
         * [destinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var destinationSecurityGroupId: Any? = null

        /**
         * [destinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationSecurityGroupId(value: String) {
          this.destinationSecurityGroupId = value
        }
        
        /**
         * [destinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationSecurityGroupId(value: IntrinsicFunction) {
          this.destinationSecurityGroupId = value
        }

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var fromPort: Any? = null

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: Int) {
          this.fromPort = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: IntrinsicFunction) {
          this.fromPort = value
        }

        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ipProtocol: Any? = null

        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: String) {
          this.ipProtocol = value
        }
        
        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: IntrinsicFunction) {
          this.ipProtocol = value
        }

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var toPort: Any? = null

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: Int) {
          this.toPort = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: IntrinsicFunction) {
          this.toPort = value
        }

    }

    @CloudFormationMarker
    class Ingress {
            /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cidrIp: Any? = null

        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: String) {
          this.cidrIp = value
        }
        
        /**
         * [cidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIp(value: IntrinsicFunction) {
          this.cidrIp = value
        }

        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cidrIpv6: Any? = null

        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: String) {
          this.cidrIpv6 = value
        }
        
        /**
         * [cidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cidrIpv6(value: IntrinsicFunction) {
          this.cidrIpv6 = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var fromPort: Any? = null

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: Int) {
          this.fromPort = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun fromPort(value: IntrinsicFunction) {
          this.fromPort = value
        }

        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ipProtocol: Any? = null

        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: String) {
          this.ipProtocol = value
        }
        
        /**
         * [ipProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipProtocol(value: IntrinsicFunction) {
          this.ipProtocol = value
        }

        /**
         * [sourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceSecurityGroupId: Any? = null

        /**
         * [sourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupId(value: String) {
          this.sourceSecurityGroupId = value
        }
        
        /**
         * [sourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupId(value: IntrinsicFunction) {
          this.sourceSecurityGroupId = value
        }

        /**
         * [sourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceSecurityGroupName: Any? = null

        /**
         * [sourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupName(value: String) {
          this.sourceSecurityGroupName = value
        }
        
        /**
         * [sourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupName(value: IntrinsicFunction) {
          this.sourceSecurityGroupName = value
        }

        /**
         * [sourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceSecurityGroupOwnerId: Any? = null

        /**
         * [sourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupOwnerId(value: String) {
          this.sourceSecurityGroupOwnerId = value
        }
        
        /**
         * [sourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceSecurityGroupOwnerId(value: IntrinsicFunction) {
          this.sourceSecurityGroupOwnerId = value
        }

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var toPort: Any? = null

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: Int) {
          this.toPort = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun toPort(value: IntrinsicFunction) {
          this.toPort = value
        }

    }

}

/**
 * [AWS::EC2::SecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
 */
fun Resources.awsEC2SecurityGroup(logicalId: String, init: AWSEC2SecurityGroup.() -> Unit = {}): AWSEC2SecurityGroup {
    return AWSEC2SecurityGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
