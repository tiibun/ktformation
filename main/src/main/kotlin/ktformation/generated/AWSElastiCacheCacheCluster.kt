
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::CacheCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html)
 */
@CloudFormationMarker
class AWSElastiCacheCacheCluster(logicalId: String) : Resource<AWSElastiCacheCacheCluster.Properties>(logicalId, "AWS::ElastiCache::CacheCluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [aZMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var aZMode: Any? = null

        /**
         * [aZMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun aZMode(value: String) {
          this.aZMode = value
        }
        
        /**
         * [aZMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun aZMode(value: IntrinsicFunction) {
          this.aZMode = value
        }

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
          this.autoMinorVersionUpgrade = value
        }

        /**
         * [cacheNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var cacheNodeType: Any? = null

        /**
         * [cacheNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cacheNodeType(value: String) {
          this.cacheNodeType = value
        }
        
        /**
         * [cacheNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cacheNodeType(value: IntrinsicFunction) {
          this.cacheNodeType = value
        }

        /**
         * [cacheParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheParameterGroupName: Any? = null

        /**
         * [cacheParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheParameterGroupName(value: String) {
          this.cacheParameterGroupName = value
        }
        
        /**
         * [cacheParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheParameterGroupName(value: IntrinsicFunction) {
          this.cacheParameterGroupName = value
        }

        /**
         * [cacheSecurityGroupNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var cacheSecurityGroupNames: Any? = null

        /**
         * [cacheSecurityGroupNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cacheSecurityGroupNames(value: List<String>) {
          this.cacheSecurityGroupNames = value
        }
        
        /**
         * [cacheSecurityGroupNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cacheSecurityGroupNames(vararg value: IntrinsicFunction) {
          this.cacheSecurityGroupNames = value
        }

        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheSubnetGroupName: Any? = null

        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheSubnetGroupName(value: String) {
          this.cacheSubnetGroupName = value
        }
        
        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheSubnetGroupName(value: IntrinsicFunction) {
          this.cacheSubnetGroupName = value
        }

        /**
         * [clusterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clusterName: Any? = null

        /**
         * [clusterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterName(value: String) {
          this.clusterName = value
        }
        
        /**
         * [clusterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterName(value: IntrinsicFunction) {
          this.clusterName = value
        }

        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var engine: Any? = null

        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engine(value: String) {
          this.engine = value
        }
        
        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engine(value: IntrinsicFunction) {
          this.engine = value
        }

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engineVersion: Any? = null

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: IntrinsicFunction) {
          this.engineVersion = value
        }

        /**
         * [notificationTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var notificationTopicArn: Any? = null

        /**
         * [notificationTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTopicArn(value: String) {
          this.notificationTopicArn = value
        }
        
        /**
         * [notificationTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTopicArn(value: IntrinsicFunction) {
          this.notificationTopicArn = value
        }

        /**
         * [numCacheNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var numCacheNodes: Any? = null

        /**
         * [numCacheNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun numCacheNodes(value: Int) {
          this.numCacheNodes = value
        }
        
        /**
         * [numCacheNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun numCacheNodes(value: IntrinsicFunction) {
          this.numCacheNodes = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [preferredAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredAvailabilityZone: Any? = null

        /**
         * [preferredAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredAvailabilityZone(value: String) {
          this.preferredAvailabilityZone = value
        }
        
        /**
         * [preferredAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredAvailabilityZone(value: IntrinsicFunction) {
          this.preferredAvailabilityZone = value
        }

        /**
         * [preferredAvailabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var preferredAvailabilityZones: Any? = null

        /**
         * [preferredAvailabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun preferredAvailabilityZones(value: List<String>) {
          this.preferredAvailabilityZones = value
        }
        
        /**
         * [preferredAvailabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun preferredAvailabilityZones(vararg value: IntrinsicFunction) {
          this.preferredAvailabilityZones = value
        }

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }

        /**
         * [snapshotArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var snapshotArns: Any? = null

        /**
         * [snapshotArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun snapshotArns(value: List<String>) {
          this.snapshotArns = value
        }
        
        /**
         * [snapshotArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun snapshotArns(vararg value: IntrinsicFunction) {
          this.snapshotArns = value
        }

        /**
         * [snapshotName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotName: Any? = null

        /**
         * [snapshotName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotName(value: String) {
          this.snapshotName = value
        }
        
        /**
         * [snapshotName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotName(value: IntrinsicFunction) {
          this.snapshotName = value
        }

        /**
         * [snapshotRetentionLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var snapshotRetentionLimit: Any? = null

        /**
         * [snapshotRetentionLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun snapshotRetentionLimit(value: Int) {
          this.snapshotRetentionLimit = value
        }
        
        /**
         * [snapshotRetentionLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun snapshotRetentionLimit(value: IntrinsicFunction) {
          this.snapshotRetentionLimit = value
        }

        /**
         * [snapshotWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotWindow: Any? = null

        /**
         * [snapshotWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotWindow(value: String) {
          this.snapshotWindow = value
        }
        
        /**
         * [snapshotWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotWindow(value: IntrinsicFunction) {
          this.snapshotWindow = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vpcSecurityGroupIds: Any? = null

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupIds(value: List<String>) {
          this.vpcSecurityGroupIds = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
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

/**
 * [AWS::ElastiCache::CacheCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html)
 */
fun Resources.awsElastiCacheCacheCluster(logicalId: String, init: AWSElastiCacheCacheCluster.() -> Unit = {}): AWSElastiCacheCacheCluster {
    return AWSElastiCacheCacheCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
