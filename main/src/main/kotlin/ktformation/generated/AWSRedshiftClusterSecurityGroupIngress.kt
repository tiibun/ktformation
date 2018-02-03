
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::ClusterSecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
 */
@CloudFormationMarker
class AWSRedshiftClusterSecurityGroupIngress(logicalId: String) : Resource<AWSRedshiftClusterSecurityGroupIngress.Properties>(logicalId, "AWS::Redshift::ClusterSecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cIDRIP: Any? = null

        fun cIDRIP(value: String) {
          this.cIDRIP = value
        }
        
        fun cIDRIP(value: IntrinsicFunction) {
          this.cIDRIP = value
        }
        
        @JvmField
        var clusterSecurityGroupName: Any? = null

        fun clusterSecurityGroupName(value: String) {
          this.clusterSecurityGroupName = value
        }
        
        fun clusterSecurityGroupName(value: IntrinsicFunction) {
          this.clusterSecurityGroupName = value
        }
        
        @JvmField
        var eC2SecurityGroupName: Any? = null

        fun eC2SecurityGroupName(value: String) {
          this.eC2SecurityGroupName = value
        }
        
        fun eC2SecurityGroupName(value: IntrinsicFunction) {
          this.eC2SecurityGroupName = value
        }
        
        @JvmField
        var eC2SecurityGroupOwnerId: Any? = null

        fun eC2SecurityGroupOwnerId(value: String) {
          this.eC2SecurityGroupOwnerId = value
        }
        
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

fun Resources.awsRedshiftClusterSecurityGroupIngress(logicalId: String, init: AWSRedshiftClusterSecurityGroupIngress.() -> Unit = {}): AWSRedshiftClusterSecurityGroupIngress {
    return AWSRedshiftClusterSecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
