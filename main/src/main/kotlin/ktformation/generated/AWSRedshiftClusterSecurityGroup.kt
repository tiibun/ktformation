
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::ClusterSecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html)
 */
@CloudFormationMarker
class AWSRedshiftClusterSecurityGroup(logicalId: String) : Resource<AWSRedshiftClusterSecurityGroup.Properties>(logicalId, "AWS::Redshift::ClusterSecurityGroup") {

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

fun Resources.awsRedshiftClusterSecurityGroup(logicalId: String, init: AWSRedshiftClusterSecurityGroup.() -> Unit = {}): AWSRedshiftClusterSecurityGroup {
    return AWSRedshiftClusterSecurityGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
