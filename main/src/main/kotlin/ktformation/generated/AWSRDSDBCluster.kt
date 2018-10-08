
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
 */
@CloudFormationMarker
class AWSRDSDBCluster(logicalId: String) : Resource<AWSRDSDBCluster.Properties>(logicalId, "AWS::RDS::DBCluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var availabilityZones: Any? = null

        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(value: List<String>) {
          this.availabilityZones = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(vararg value: IntrinsicFunction) {
          this.availabilityZones = value
        }

        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var backupRetentionPeriod: Any? = null

        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun backupRetentionPeriod(value: Int) {
          this.backupRetentionPeriod = value
        }
        
        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun backupRetentionPeriod(value: IntrinsicFunction) {
          this.backupRetentionPeriod = value
        }

        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBClusterIdentifier: Any? = null

        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: String) {
          this.dBClusterIdentifier = value
        }
        
        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: IntrinsicFunction) {
          this.dBClusterIdentifier = value
        }

        /**
         * [dBClusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBClusterParameterGroupName: Any? = null

        /**
         * [dBClusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterParameterGroupName(value: String) {
          this.dBClusterParameterGroupName = value
        }
        
        /**
         * [dBClusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterParameterGroupName(value: IntrinsicFunction) {
          this.dBClusterParameterGroupName = value
        }

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSubnetGroupName: Any? = null

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: String) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: IntrinsicFunction) {
          this.dBSubnetGroupName = value
        }

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }

        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var engine: Any? = null

        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engine(value: String) {
          this.engine = value
        }
        
        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engine(value: IntrinsicFunction) {
          this.engine = value
        }

        /**
         * [engineMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engineMode: Any? = null

        /**
         * [engineMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineMode(value: String) {
          this.engineMode = value
        }
        
        /**
         * [engineMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineMode(value: IntrinsicFunction) {
          this.engineMode = value
        }

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engineVersion: Any? = null

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: IntrinsicFunction) {
          this.engineVersion = value
        }

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }

        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var masterUserPassword: Any? = null

        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUserPassword(value: String) {
          this.masterUserPassword = value
        }
        
        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUserPassword(value: IntrinsicFunction) {
          this.masterUserPassword = value
        }

        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var masterUsername: Any? = null

        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUsername(value: String) {
          this.masterUsername = value
        }
        
        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUsername(value: IntrinsicFunction) {
          this.masterUsername = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredBackupWindow: Any? = null

        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredBackupWindow(value: String) {
          this.preferredBackupWindow = value
        }
        
        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredBackupWindow(value: IntrinsicFunction) {
          this.preferredBackupWindow = value
        }

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }

        /**
         * [replicationSourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationSourceIdentifier: Any? = null

        /**
         * [replicationSourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationSourceIdentifier(value: String) {
          this.replicationSourceIdentifier = value
        }
        
        /**
         * [replicationSourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationSourceIdentifier(value: IntrinsicFunction) {
          this.replicationSourceIdentifier = value
        }

        /**
         * [scalingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ScalingConfiguration
         */
        @JvmField
        var scalingConfiguration: Any? = null

        /**
         * [scalingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ScalingConfiguration
         */
        fun scalingConfiguration(value: ScalingConfiguration) {
          this.scalingConfiguration = value
        }
        
        /**
         * [scalingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-scalingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ScalingConfiguration
         */
        fun scalingConfiguration(value: IntrinsicFunction) {
          this.scalingConfiguration = value
        }

        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotIdentifier: Any? = null

        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotIdentifier(value: String) {
          this.snapshotIdentifier = value
        }
        
        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotIdentifier(value: IntrinsicFunction) {
          this.snapshotIdentifier = value
        }

        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var storageEncrypted: Any? = null

        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storageEncrypted(value: Boolean) {
          this.storageEncrypted = value
        }
        
        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storageEncrypted(value: IntrinsicFunction) {
          this.storageEncrypted = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vpcSecurityGroupIds: Any? = null

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupIds(value: List<String>) {
          this.vpcSecurityGroupIds = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupIds(vararg value: IntrinsicFunction) {
          this.vpcSecurityGroupIds = value
        }

        /**
        * [ScalingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html)
        */
        fun scalingConfiguration(init: ScalingConfiguration.() -> Unit = {}): ScalingConfiguration {
            return ScalingConfiguration().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class ScalingConfiguration {
            /**
         * [autoPause](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var autoPause: Any? = null

        /**
         * [autoPause](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoPause(value: Boolean) {
          this.autoPause = value
        }
        
        /**
         * [autoPause](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-autopause)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoPause(value: IntrinsicFunction) {
          this.autoPause = value
        }

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var maxCapacity: Any? = null

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-maxcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxCapacity(value: IntrinsicFunction) {
          this.maxCapacity = value
        }

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var minCapacity: Any? = null

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        
        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-mincapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minCapacity(value: IntrinsicFunction) {
          this.minCapacity = value
        }

        /**
         * [secondsBeforeAutoPause](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var secondsBeforeAutoPause: Any? = null

        /**
         * [secondsBeforeAutoPause](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondsBeforeAutoPause(value: Int) {
          this.secondsBeforeAutoPause = value
        }
        
        /**
         * [secondsBeforeAutoPause](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html#cfn-rds-dbcluster-scalingconfiguration-secondsbeforeautopause)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondsBeforeAutoPause(value: IntrinsicFunction) {
          this.secondsBeforeAutoPause = value
        }

    }

}

/**
 * [AWS::RDS::DBCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
 */
fun Resources.awsRDSDBCluster(logicalId: String, init: AWSRDSDBCluster.() -> Unit = {}): AWSRDSDBCluster {
    return AWSRDSDBCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
