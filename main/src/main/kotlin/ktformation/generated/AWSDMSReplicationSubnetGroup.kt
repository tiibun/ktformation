
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::ReplicationSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html)
 */
@CloudFormationMarker
class AWSDMSReplicationSubnetGroup(logicalId: String) : Resource<AWSDMSReplicationSubnetGroup.Properties>(logicalId, "AWS::DMS::ReplicationSubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var replicationSubnetGroupDescription: Any? = null

        fun replicationSubnetGroupDescription(value: String) {
          this.replicationSubnetGroupDescription = value
        }
        fun replicationSubnetGroupDescription(value: IntrinsicFunction) {
  this.replicationSubnetGroupDescription = value
}
        @JvmField
        var replicationSubnetGroupIdentifier: Any? = null

        fun replicationSubnetGroupIdentifier(value: String) {
          this.replicationSubnetGroupIdentifier = value
        }
        fun replicationSubnetGroupIdentifier(value: IntrinsicFunction) {
  this.replicationSubnetGroupIdentifier = value
}
        @JvmField
        var subnetIds: Any? = null

        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        fun subnetIds(vararg value: IntrinsicFunction) {
  this.subnetIds = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
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

fun Resources.awsDMSReplicationSubnetGroup(logicalId: String, init: AWSDMSReplicationSubnetGroup.() -> Unit = {}): AWSDMSReplicationSubnetGroup {
    return AWSDMSReplicationSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
