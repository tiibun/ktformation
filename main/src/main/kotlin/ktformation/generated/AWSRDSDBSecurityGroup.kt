
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Ingress(
            /**
             * [CIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cIDRIP: String? = null,
            /**
             * [EC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val eC2SecurityGroupId: String? = null,
            /**
             * [EC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val eC2SecurityGroupName: String? = null,
            /**
             * [EC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val eC2SecurityGroupOwnerId: String? = null
    )

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
