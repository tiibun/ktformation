
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Egress(
            /**
             * [CidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cidrIp: String? = null,
            /**
             * [CidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cidrIpv6: String? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [DestinationPrefixListId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val destinationPrefixListId: String? = null,
            /**
             * [DestinationSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val destinationSecurityGroupId: String? = null,
            /**
             * [FromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val fromPort: Int? = null,
            /**
             * [IpProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ipProtocol: String,
            /**
             * [ToPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val toPort: Int? = null
    )

    class Ingress(
            /**
             * [CidrIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cidrIp: String? = null,
            /**
             * [CidrIpv6](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cidrIpv6: String? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [FromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val fromPort: Int? = null,
            /**
             * [IpProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ipProtocol: String,
            /**
             * [SourceSecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceSecurityGroupId: String? = null,
            /**
             * [SourceSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceSecurityGroupName: String? = null,
            /**
             * [SourceSecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceSecurityGroupOwnerId: String? = null,
            /**
             * [ToPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val toPort: Int? = null
    )

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
