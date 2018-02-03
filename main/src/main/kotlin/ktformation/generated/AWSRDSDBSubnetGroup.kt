
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html)
 */
@CloudFormationMarker
class AWSRDSDBSubnetGroup(logicalId: String) : Resource<AWSRDSDBSubnetGroup.Properties>(logicalId, "AWS::RDS::DBSubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [dBSubnetGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dBSubnetGroupDescription: Any? = null

        /**
         * [dBSubnetGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBSubnetGroupDescription(value: String) {
          this.dBSubnetGroupDescription = value
        }
        
        /**
         * [dBSubnetGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBSubnetGroupDescription(value: IntrinsicFunction) {
          this.dBSubnetGroupDescription = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSubnetGroupName: Any? = null

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: String) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: IntrinsicFunction) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html#cfn-rds-dbsubnetgroup-tags)
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



}

/**
 * [AWS::RDS::DBSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html)
 */
fun Resources.awsRDSDBSubnetGroup(logicalId: String, init: AWSRDSDBSubnetGroup.() -> Unit = {}): AWSRDSDBSubnetGroup {
    return AWSRDSDBSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
