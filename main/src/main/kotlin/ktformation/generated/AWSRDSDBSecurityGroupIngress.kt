
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBSecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html)
 */
@CloudFormationMarker
class AWSRDSDBSecurityGroupIngress(logicalId: String) : Resource<AWSRDSDBSecurityGroupIngress.Properties>(logicalId, "AWS::RDS::DBSecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cIDRIP: Any? = null

        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cIDRIP(value: String) {
          this.cIDRIP = value
        }
        
        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cIDRIP(value: IntrinsicFunction) {
          this.cIDRIP = value
        }
        
        /**
         * [dBSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dBSecurityGroupName: Any? = null

        /**
         * [dBSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBSecurityGroupName(value: String) {
          this.dBSecurityGroupName = value
        }
        
        /**
         * [dBSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBSecurityGroupName(value: IntrinsicFunction) {
          this.dBSecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupId: Any? = null

        /**
         * [eC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupId(value: String) {
          this.eC2SecurityGroupId = value
        }
        
        /**
         * [eC2SecurityGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupId(value: IntrinsicFunction) {
          this.eC2SecurityGroupId = value
        }
        
        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupName: Any? = null

        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: String) {
          this.eC2SecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: IntrinsicFunction) {
          this.eC2SecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupOwnerId: Any? = null

        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupOwnerId(value: String) {
          this.eC2SecurityGroupOwnerId = value
        }
        
        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupOwnerId(value: IntrinsicFunction) {
          this.eC2SecurityGroupOwnerId = value
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
 * [AWS::RDS::DBSecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html)
 */
fun Resources.awsRDSDBSecurityGroupIngress(logicalId: String, init: AWSRDSDBSecurityGroupIngress.() -> Unit = {}): AWSRDSDBSecurityGroupIngress {
    return AWSRDSDBSecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
