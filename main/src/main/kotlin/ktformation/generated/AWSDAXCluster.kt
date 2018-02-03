
package ktformation.generated

import ktformation.*

/**
 * [AWS::DAX::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html)
 */
@CloudFormationMarker
class AWSDAXCluster(logicalId: String) : Resource<AWSDAXCluster.Properties>(logicalId, "AWS::DAX::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var availabilityZones: Any? = null

        fun availabilityZones(value: List<String>) {
          this.availabilityZones = value
        }
        
        fun availabilityZones(vararg value: IntrinsicFunction) {
          this.availabilityZones = value
        }
        
        @JvmField
        var clusterName: Any? = null

        fun clusterName(value: String) {
          this.clusterName = value
        }
        
        fun clusterName(value: IntrinsicFunction) {
          this.clusterName = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var iAMRoleARN: Any? = null

        fun iAMRoleARN(value: String) {
          this.iAMRoleARN = value
        }
        
        fun iAMRoleARN(value: IntrinsicFunction) {
          this.iAMRoleARN = value
        }
        
        @JvmField
        var nodeType: Any? = null

        fun nodeType(value: String) {
          this.nodeType = value
        }
        
        fun nodeType(value: IntrinsicFunction) {
          this.nodeType = value
        }
        
        @JvmField
        var notificationTopicARN: Any? = null

        fun notificationTopicARN(value: String) {
          this.notificationTopicARN = value
        }
        
        fun notificationTopicARN(value: IntrinsicFunction) {
          this.notificationTopicARN = value
        }
        
        @JvmField
        var parameterGroupName: Any? = null

        fun parameterGroupName(value: String) {
          this.parameterGroupName = value
        }
        
        fun parameterGroupName(value: IntrinsicFunction) {
          this.parameterGroupName = value
        }
        
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }
        
        @JvmField
        var replicationFactor: Any? = null

        fun replicationFactor(value: Int) {
          this.replicationFactor = value
        }
        
        fun replicationFactor(value: IntrinsicFunction) {
          this.replicationFactor = value
        }
        
        @JvmField
        var securityGroupIds: Any? = null

        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }
        
        @JvmField
        var subnetGroupName: Any? = null

        fun subnetGroupName(value: String) {
          this.subnetGroupName = value
        }
        
        fun subnetGroupName(value: IntrinsicFunction) {
          this.subnetGroupName = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: Json) {
          this.tags = value
        }
        
        fun tags(value: IntrinsicFunction) {
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

fun Resources.awsDAXCluster(logicalId: String, init: AWSDAXCluster.() -> Unit = {}): AWSDAXCluster {
    return AWSDAXCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
