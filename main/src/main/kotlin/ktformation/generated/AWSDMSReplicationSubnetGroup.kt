
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::ReplicationSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html)
 */
@CloudFormationMarker
class AWSDMSReplicationSubnetGroup(logicalId: String) : Resource<AWSDMSReplicationSubnetGroup.Properties>(logicalId, "AWS::DMS::ReplicationSubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [replicationSubnetGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var replicationSubnetGroupDescription: Any? = null

        /**
         * [replicationSubnetGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationSubnetGroupDescription(value: String) {
          this.replicationSubnetGroupDescription = value
        }
        
        /**
         * [replicationSubnetGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationSubnetGroupDescription(value: IntrinsicFunction) {
          this.replicationSubnetGroupDescription = value
        }

        /**
         * [replicationSubnetGroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationSubnetGroupIdentifier: Any? = null

        /**
         * [replicationSubnetGroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationSubnetGroupIdentifier(value: String) {
          this.replicationSubnetGroupIdentifier = value
        }
        
        /**
         * [replicationSubnetGroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationSubnetGroupIdentifier(value: IntrinsicFunction) {
          this.replicationSubnetGroupIdentifier = value
        }

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
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
 * [AWS::DMS::ReplicationSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html)
 */
fun Resources.awsDMSReplicationSubnetGroup(logicalId: String, init: AWSDMSReplicationSubnetGroup.() -> Unit = {}): AWSDMSReplicationSubnetGroup {
    return AWSDMSReplicationSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
