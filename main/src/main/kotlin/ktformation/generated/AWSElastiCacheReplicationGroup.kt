
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::ReplicationGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html)
 */
@CloudFormationMarker
class AWSElastiCacheReplicationGroup(logicalId: String) : Resource<AWSElastiCacheReplicationGroup.Properties>(logicalId, "AWS::ElastiCache::ReplicationGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var atRestEncryptionEnabled: Any? = null

        fun atRestEncryptionEnabled(value: Boolean) {
          this.atRestEncryptionEnabled = value
        }
        fun atRestEncryptionEnabled(value: IntrinsicFunction) {
  this.atRestEncryptionEnabled = value
}
        @JvmField
        var authToken: Any? = null

        fun authToken(value: String) {
          this.authToken = value
        }
        fun authToken(value: IntrinsicFunction) {
  this.authToken = value
}
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
  this.autoMinorVersionUpgrade = value
}
        @JvmField
        var automaticFailoverEnabled: Any? = null

        fun automaticFailoverEnabled(value: Boolean) {
          this.automaticFailoverEnabled = value
        }
        fun automaticFailoverEnabled(value: IntrinsicFunction) {
  this.automaticFailoverEnabled = value
}
        @JvmField
        var cacheNodeType: Any? = null

        fun cacheNodeType(value: String) {
          this.cacheNodeType = value
        }
        fun cacheNodeType(value: IntrinsicFunction) {
  this.cacheNodeType = value
}
        @JvmField
        var cacheParameterGroupName: Any? = null

        fun cacheParameterGroupName(value: String) {
          this.cacheParameterGroupName = value
        }
        fun cacheParameterGroupName(value: IntrinsicFunction) {
  this.cacheParameterGroupName = value
}
        @JvmField
        var cacheSecurityGroupNames: Any? = null

        fun cacheSecurityGroupNames(value: List<String>) {
          this.cacheSecurityGroupNames = value
        }
        fun cacheSecurityGroupNames(vararg value: IntrinsicFunction) {
  this.cacheSecurityGroupNames = value
}
        @JvmField
        var cacheSubnetGroupName: Any? = null

        fun cacheSubnetGroupName(value: String) {
          this.cacheSubnetGroupName = value
        }
        fun cacheSubnetGroupName(value: IntrinsicFunction) {
  this.cacheSubnetGroupName = value
}
        @JvmField
        var engine: Any? = null

        fun engine(value: String) {
          this.engine = value
        }
        fun engine(value: IntrinsicFunction) {
  this.engine = value
}
        @JvmField
        var engineVersion: Any? = null

        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        fun engineVersion(value: IntrinsicFunction) {
  this.engineVersion = value
}
        @JvmField
        var nodeGroupConfiguration: Any? = null

        fun nodeGroupConfiguration(value: List<NodeGroupConfiguration>) {
          this.nodeGroupConfiguration = value
        }
        fun nodeGroupConfiguration(vararg value: IntrinsicFunction) {
  this.nodeGroupConfiguration = value
}
        @JvmField
        var notificationTopicArn: Any? = null

        fun notificationTopicArn(value: String) {
          this.notificationTopicArn = value
        }
        fun notificationTopicArn(value: IntrinsicFunction) {
  this.notificationTopicArn = value
}
        @JvmField
        var numCacheClusters: Any? = null

        fun numCacheClusters(value: Int) {
          this.numCacheClusters = value
        }
        fun numCacheClusters(value: IntrinsicFunction) {
  this.numCacheClusters = value
}
        @JvmField
        var numNodeGroups: Any? = null

        fun numNodeGroups(value: Int) {
          this.numNodeGroups = value
        }
        fun numNodeGroups(value: IntrinsicFunction) {
  this.numNodeGroups = value
}
        @JvmField
        var port: Any? = null

        fun port(value: Int) {
          this.port = value
        }
        fun port(value: IntrinsicFunction) {
  this.port = value
}
        @JvmField
        var preferredCacheClusterAZs: Any? = null

        fun preferredCacheClusterAZs(value: List<String>) {
          this.preferredCacheClusterAZs = value
        }
        fun preferredCacheClusterAZs(vararg value: IntrinsicFunction) {
  this.preferredCacheClusterAZs = value
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
        var primaryClusterId: Any? = null

        fun primaryClusterId(value: String) {
          this.primaryClusterId = value
        }
        fun primaryClusterId(value: IntrinsicFunction) {
  this.primaryClusterId = value
}
        @JvmField
        var replicasPerNodeGroup: Any? = null

        fun replicasPerNodeGroup(value: Int) {
          this.replicasPerNodeGroup = value
        }
        fun replicasPerNodeGroup(value: IntrinsicFunction) {
  this.replicasPerNodeGroup = value
}
        @JvmField
        var replicationGroupDescription: Any? = null

        fun replicationGroupDescription(value: String) {
          this.replicationGroupDescription = value
        }
        fun replicationGroupDescription(value: IntrinsicFunction) {
  this.replicationGroupDescription = value
}
        @JvmField
        var replicationGroupId: Any? = null

        fun replicationGroupId(value: String) {
          this.replicationGroupId = value
        }
        fun replicationGroupId(value: IntrinsicFunction) {
  this.replicationGroupId = value
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
        var snapshotArns: Any? = null

        fun snapshotArns(value: List<String>) {
          this.snapshotArns = value
        }
        fun snapshotArns(vararg value: IntrinsicFunction) {
  this.snapshotArns = value
}
        @JvmField
        var snapshotName: Any? = null

        fun snapshotName(value: String) {
          this.snapshotName = value
        }
        fun snapshotName(value: IntrinsicFunction) {
  this.snapshotName = value
}
        @JvmField
        var snapshotRetentionLimit: Any? = null

        fun snapshotRetentionLimit(value: Int) {
          this.snapshotRetentionLimit = value
        }
        fun snapshotRetentionLimit(value: IntrinsicFunction) {
  this.snapshotRetentionLimit = value
}
        @JvmField
        var snapshotWindow: Any? = null

        fun snapshotWindow(value: String) {
          this.snapshotWindow = value
        }
        fun snapshotWindow(value: IntrinsicFunction) {
  this.snapshotWindow = value
}
        @JvmField
        var snapshottingClusterId: Any? = null

        fun snapshottingClusterId(value: String) {
          this.snapshottingClusterId = value
        }
        fun snapshottingClusterId(value: IntrinsicFunction) {
  this.snapshottingClusterId = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
        @JvmField
        var transitEncryptionEnabled: Any? = null

        fun transitEncryptionEnabled(value: Boolean) {
          this.transitEncryptionEnabled = value
        }
        fun transitEncryptionEnabled(value: IntrinsicFunction) {
  this.transitEncryptionEnabled = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class NodeGroupConfiguration(
            val primaryAvailabilityZone: String? = null,
            val replicaAvailabilityZones: List<String>? = null,
            val replicaCount: Int? = null,
            val slots: String? = null
    )

}

fun Resources.awsElastiCacheReplicationGroup(logicalId: String, init: AWSElastiCacheReplicationGroup.() -> Unit = {}): AWSElastiCacheReplicationGroup {
    return AWSElastiCacheReplicationGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
