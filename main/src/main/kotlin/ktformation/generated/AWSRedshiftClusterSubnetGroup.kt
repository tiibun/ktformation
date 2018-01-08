
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::ClusterSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
 */
@CloudFormationMarker
class AWSRedshiftClusterSubnetGroup(logicalId: String) : Resource<AWSRedshiftClusterSubnetGroup.Properties>(logicalId, "AWS::Redshift::ClusterSubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
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

fun Resources.awsRedshiftClusterSubnetGroup(logicalId: String, init: AWSRedshiftClusterSubnetGroup.() -> Unit = {}): AWSRedshiftClusterSubnetGroup {
    return AWSRedshiftClusterSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
