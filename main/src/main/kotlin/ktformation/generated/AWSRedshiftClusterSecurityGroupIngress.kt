
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::ClusterSecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
 */
@CloudFormationMarker
class AWSRedshiftClusterSecurityGroupIngress(logicalId: String) : Resource<AWSRedshiftClusterSecurityGroupIngress.Properties>(logicalId, "AWS::Redshift::ClusterSecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cIDRIP: Any? = null

        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cIDRIP(value: String) {
          this.cIDRIP = value
        }
        
        /**
         * [cIDRIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cIDRIP(value: IntrinsicFunction) {
          this.cIDRIP = value
        }

        /**
         * [clusterSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var clusterSecurityGroupName: Any? = null

        /**
         * [clusterSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterSecurityGroupName(value: String) {
          this.clusterSecurityGroupName = value
        }
        
        /**
         * [clusterSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterSecurityGroupName(value: IntrinsicFunction) {
          this.clusterSecurityGroupName = value
        }

        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupName: Any? = null

        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: String) {
          this.eC2SecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: IntrinsicFunction) {
          this.eC2SecurityGroupName = value
        }

        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupOwnerId: Any? = null

        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupOwnerId(value: String) {
          this.eC2SecurityGroupOwnerId = value
        }
        
        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
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
 * [AWS::Redshift::ClusterSecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
 */
fun Resources.awsRedshiftClusterSecurityGroupIngress(logicalId: String, init: AWSRedshiftClusterSecurityGroupIngress.() -> Unit = {}): AWSRedshiftClusterSecurityGroupIngress {
    return AWSRedshiftClusterSecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
