
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBSecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html)
 */
@CloudFormationMarker
class AWSRDSDBSecurityGroup(logicalId: String) : Resource<AWSRDSDBSecurityGroup.Properties>(logicalId, "AWS::RDS::DBSecurityGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [dBSecurityGroupIngress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * _Required_: yes
         *
         * _Type_: List<Ingress>
         */
        @JvmField
        var dBSecurityGroupIngress: Any? = null

        /**
         * [dBSecurityGroupIngress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * _Required_: yes
         *
         * _Type_: List<Ingress>
         */
        fun dBSecurityGroupIngress(value: List<Ingress>) {
          this.dBSecurityGroupIngress = value
        }
        
        /**
         * [dBSecurityGroupIngress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * _Required_: yes
         *
         * _Type_: List<Ingress>
         */
        fun dBSecurityGroupIngress(vararg value: IntrinsicFunction) {
          this.dBSecurityGroupIngress = value
        }

        /**
         * [eC2VpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2VpcId: Any? = null

        /**
         * [eC2VpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2VpcId(value: String) {
          this.eC2VpcId = value
        }
        
        /**
         * [eC2VpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-ec2vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2VpcId(value: IntrinsicFunction) {
          this.eC2VpcId = value
        }

        /**
         * [groupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var groupDescription: Any? = null

        /**
         * [groupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupDescription(value: String) {
          this.groupDescription = value
        }
        
        /**
         * [groupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-groupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupDescription(value: IntrinsicFunction) {
          this.groupDescription = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html#cfn-rds-dbsecuritygroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
        * [Ingress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html)
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
    class Ingress {
            /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cIDRIP: Any? = null

        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cIDRIP(value: String) {
          this.cIDRIP = value
        }
        
        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cIDRIP(value: IntrinsicFunction) {
          this.cIDRIP = value
        }

        /**
         * [eC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var eC2SecurityGroupId: Any? = null

        /**
         * [eC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupId(value: String) {
          this.eC2SecurityGroupId = value
        }
        
        /**
         * [eC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupId(value: IntrinsicFunction) {
          this.eC2SecurityGroupId = value
        }

        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var eC2SecurityGroupName: Any? = null

        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: String) {
          this.eC2SecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: IntrinsicFunction) {
          this.eC2SecurityGroupName = value
        }

        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var eC2SecurityGroupOwnerId: Any? = null

        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupOwnerId(value: String) {
          this.eC2SecurityGroupOwnerId = value
        }
        
        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupOwnerId(value: IntrinsicFunction) {
          this.eC2SecurityGroupOwnerId = value
        }

    }

}

/**
 * [AWS::RDS::DBSecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html)
 */
fun Resources.awsRDSDBSecurityGroup(logicalId: String, init: AWSRDSDBSecurityGroup.() -> Unit = {}): AWSRDSDBSecurityGroup {
    return AWSRDSDBSecurityGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
