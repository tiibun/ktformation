
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::CacheCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html)
 */
@CloudFormationMarker
class AWSElastiCacheCacheCluster(logicalId: String) : Resource<AWSElastiCacheCacheCluster.Properties>(logicalId, "AWS::ElastiCache::CacheCluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var aZMode: Any? = null

        fun aZMode(value: String) {
          this.aZMode = value
        }
        fun aZMode(value: IntrinsicFunction) {
  this.aZMode = value
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
        var clusterName: Any? = null

        fun clusterName(value: String) {
          this.clusterName = value
        }
        fun clusterName(value: IntrinsicFunction) {
  this.clusterName = value
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
        var notificationTopicArn: Any? = null

        fun notificationTopicArn(value: String) {
          this.notificationTopicArn = value
        }
        fun notificationTopicArn(value: IntrinsicFunction) {
  this.notificationTopicArn = value
}
        @JvmField
        var numCacheNodes: Any? = null

        fun numCacheNodes(value: Int) {
          this.numCacheNodes = value
        }
        fun numCacheNodes(value: IntrinsicFunction) {
  this.numCacheNodes = value
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
        var preferredAvailabilityZone: Any? = null

        fun preferredAvailabilityZone(value: String) {
          this.preferredAvailabilityZone = value
        }
        fun preferredAvailabilityZone(value: IntrinsicFunction) {
  this.preferredAvailabilityZone = value
}
        @JvmField
        var preferredAvailabilityZones: Any? = null

        fun preferredAvailabilityZones(value: List<String>) {
          this.preferredAvailabilityZones = value
        }
        fun preferredAvailabilityZones(vararg value: IntrinsicFunction) {
  this.preferredAvailabilityZones = value
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
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
        @JvmField
        var vpcSecurityGroupIds: Any? = null

        fun vpcSecurityGroupIds(value: List<String>) {
          this.vpcSecurityGroupIds = value
        }
        fun vpcSecurityGroupIds(vararg value: IntrinsicFunction) {
  this.vpcSecurityGroupIds = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsElastiCacheCacheCluster(logicalId: String, init: AWSElastiCacheCacheCluster.() -> Unit = {}): AWSElastiCacheCacheCluster {
    return AWSElastiCacheCacheCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
