
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::ReplicationGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html)
 */
@CloudFormationMarker
class AWSElastiCacheReplicationGroup(logicalId: String) : Resource<AWSElastiCacheReplicationGroup.Properties>(logicalId, "AWS::ElastiCache::ReplicationGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [atRestEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var atRestEncryptionEnabled: Any? = null

        /**
         * [atRestEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun atRestEncryptionEnabled(value: Boolean) {
          this.atRestEncryptionEnabled = value
        }
        
        /**
         * [atRestEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun atRestEncryptionEnabled(value: IntrinsicFunction) {
          this.atRestEncryptionEnabled = value
        }
        
        /**
         * [authToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var authToken: Any? = null

        /**
         * [authToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authToken(value: String) {
          this.authToken = value
        }
        
        /**
         * [authToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authToken(value: IntrinsicFunction) {
          this.authToken = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [automaticFailoverEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var automaticFailoverEnabled: Any? = null

        /**
         * [automaticFailoverEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun automaticFailoverEnabled(value: Boolean) {
          this.automaticFailoverEnabled = value
        }
        
        /**
         * [automaticFailoverEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun automaticFailoverEnabled(value: IntrinsicFunction) {
          this.automaticFailoverEnabled = value
        }
        
        /**
         * [cacheNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheNodeType: Any? = null

        /**
         * [cacheNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheNodeType(value: String) {
          this.cacheNodeType = value
        }
        
        /**
         * [cacheNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheNodeType(value: IntrinsicFunction) {
          this.cacheNodeType = value
        }
        
        /**
         * [cacheParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheParameterGroupName: Any? = null

        /**
         * [cacheParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheParameterGroupName(value: String) {
          this.cacheParameterGroupName = value
        }
        
        /**
         * [cacheParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheParameterGroupName(value: IntrinsicFunction) {
          this.cacheParameterGroupName = value
        }
        
        /**
         * [cacheSecurityGroupNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var cacheSecurityGroupNames: Any? = null

        /**
         * [cacheSecurityGroupNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cacheSecurityGroupNames(value: List<String>) {
          this.cacheSecurityGroupNames = value
        }
        
        /**
         * [cacheSecurityGroupNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cacheSecurityGroupNames(vararg value: IntrinsicFunction) {
          this.cacheSecurityGroupNames = value
        }
        
        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheSubnetGroupName: Any? = null

        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheSubnetGroupName(value: String) {
          this.cacheSubnetGroupName = value
        }
        
        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheSubnetGroupName(value: IntrinsicFunction) {
          this.cacheSubnetGroupName = value
        }
        
        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engine: Any? = null

        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engine(value: String) {
          this.engine = value
        }
        
        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engine(value: IntrinsicFunction) {
          this.engine = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engineVersion: Any? = null

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: IntrinsicFunction) {
          this.engineVersion = value
        }
        
        /**
         * [nodeGroupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
         *
         * _Required_: no
         *
         * _Type_: List<NodeGroupConfiguration>
         */
        @JvmField
        var nodeGroupConfiguration: Any? = null

        /**
         * [nodeGroupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
         *
         * _Required_: no
         *
         * _Type_: List<NodeGroupConfiguration>
         */
        fun nodeGroupConfiguration(value: List<NodeGroupConfiguration>) {
          this.nodeGroupConfiguration = value
        }
        
        /**
         * [nodeGroupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
         *
         * _Required_: no
         *
         * _Type_: List<NodeGroupConfiguration>
         */
        fun nodeGroupConfiguration(vararg value: IntrinsicFunction) {
          this.nodeGroupConfiguration = value
        }
        
        /**
         * [notificationTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var notificationTopicArn: Any? = null

        /**
         * [notificationTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTopicArn(value: String) {
          this.notificationTopicArn = value
        }
        
        /**
         * [notificationTopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTopicArn(value: IntrinsicFunction) {
          this.notificationTopicArn = value
        }
        
        /**
         * [numCacheClusters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var numCacheClusters: Any? = null

        /**
         * [numCacheClusters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numCacheClusters(value: Int) {
          this.numCacheClusters = value
        }
        
        /**
         * [numCacheClusters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numCacheClusters(value: IntrinsicFunction) {
          this.numCacheClusters = value
        }
        
        /**
         * [numNodeGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var numNodeGroups: Any? = null

        /**
         * [numNodeGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numNodeGroups(value: Int) {
          this.numNodeGroups = value
        }
        
        /**
         * [numNodeGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numNodeGroups(value: IntrinsicFunction) {
          this.numNodeGroups = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }
        
        /**
         * [preferredCacheClusterAZs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var preferredCacheClusterAZs: Any? = null

        /**
         * [preferredCacheClusterAZs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun preferredCacheClusterAZs(value: List<String>) {
          this.preferredCacheClusterAZs = value
        }
        
        /**
         * [preferredCacheClusterAZs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun preferredCacheClusterAZs(vararg value: IntrinsicFunction) {
          this.preferredCacheClusterAZs = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [primaryClusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var primaryClusterId: Any? = null

        /**
         * [primaryClusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun primaryClusterId(value: String) {
          this.primaryClusterId = value
        }
        
        /**
         * [primaryClusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun primaryClusterId(value: IntrinsicFunction) {
          this.primaryClusterId = value
        }
        
        /**
         * [replicasPerNodeGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var replicasPerNodeGroup: Any? = null

        /**
         * [replicasPerNodeGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun replicasPerNodeGroup(value: Int) {
          this.replicasPerNodeGroup = value
        }
        
        /**
         * [replicasPerNodeGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun replicasPerNodeGroup(value: IntrinsicFunction) {
          this.replicasPerNodeGroup = value
        }
        
        /**
         * [replicationGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var replicationGroupDescription: Any? = null

        /**
         * [replicationGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationGroupDescription(value: String) {
          this.replicationGroupDescription = value
        }
        
        /**
         * [replicationGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationGroupDescription(value: IntrinsicFunction) {
          this.replicationGroupDescription = value
        }
        
        /**
         * [replicationGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationGroupId: Any? = null

        /**
         * [replicationGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationGroupId(value: String) {
          this.replicationGroupId = value
        }
        
        /**
         * [replicationGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationGroupId(value: IntrinsicFunction) {
          this.replicationGroupId = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }
        
        /**
         * [snapshotArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var snapshotArns: Any? = null

        /**
         * [snapshotArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun snapshotArns(value: List<String>) {
          this.snapshotArns = value
        }
        
        /**
         * [snapshotArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun snapshotArns(vararg value: IntrinsicFunction) {
          this.snapshotArns = value
        }
        
        /**
         * [snapshotName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotName: Any? = null

        /**
         * [snapshotName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotName(value: String) {
          this.snapshotName = value
        }
        
        /**
         * [snapshotName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotName(value: IntrinsicFunction) {
          this.snapshotName = value
        }
        
        /**
         * [snapshotRetentionLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var snapshotRetentionLimit: Any? = null

        /**
         * [snapshotRetentionLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun snapshotRetentionLimit(value: Int) {
          this.snapshotRetentionLimit = value
        }
        
        /**
         * [snapshotRetentionLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun snapshotRetentionLimit(value: IntrinsicFunction) {
          this.snapshotRetentionLimit = value
        }
        
        /**
         * [snapshotWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotWindow: Any? = null

        /**
         * [snapshotWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotWindow(value: String) {
          this.snapshotWindow = value
        }
        
        /**
         * [snapshotWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotWindow(value: IntrinsicFunction) {
          this.snapshotWindow = value
        }
        
        /**
         * [snapshottingClusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshottingClusterId: Any? = null

        /**
         * [snapshottingClusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshottingClusterId(value: String) {
          this.snapshottingClusterId = value
        }
        
        /**
         * [snapshottingClusterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshottingClusterId(value: IntrinsicFunction) {
          this.snapshottingClusterId = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [transitEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var transitEncryptionEnabled: Any? = null

        /**
         * [transitEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun transitEncryptionEnabled(value: Boolean) {
          this.transitEncryptionEnabled = value
        }
        
        /**
         * [transitEncryptionEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
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
            /**
             * [PrimaryAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-primaryavailabilityzone)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val primaryAvailabilityZone: String? = null,
            /**
             * [ReplicaAvailabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicaavailabilityzones)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val replicaAvailabilityZones: List<String>? = null,
            /**
             * [ReplicaCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-replicacount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val replicaCount: Int? = null,
            /**
             * [Slots](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html#cfn-elasticache-replicationgroup-nodegroupconfiguration-slots)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val slots: String? = null
    )

}

/**
 * [AWS::ElastiCache::ReplicationGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html)
 */
fun Resources.awsElastiCacheReplicationGroup(logicalId: String, init: AWSElastiCacheReplicationGroup.() -> Unit = {}): AWSElastiCacheReplicationGroup {
    return AWSElastiCacheReplicationGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
