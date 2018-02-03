
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html)
 */
@CloudFormationMarker
class AWSRDSDBInstance(logicalId: String) : Resource<AWSRDSDBInstance.Properties>(logicalId, "AWS::RDS::DBInstance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var allocatedStorage: Any? = null

        fun allocatedStorage(value: String) {
          this.allocatedStorage = value
        }
        
        fun allocatedStorage(value: IntrinsicFunction) {
          this.allocatedStorage = value
        }
        
        @JvmField
        var allowMajorVersionUpgrade: Any? = null

        fun allowMajorVersionUpgrade(value: Boolean) {
          this.allowMajorVersionUpgrade = value
        }
        
        fun allowMajorVersionUpgrade(value: IntrinsicFunction) {
          this.allowMajorVersionUpgrade = value
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
        var availabilityZone: Any? = null

        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        @JvmField
        var backupRetentionPeriod: Any? = null

        fun backupRetentionPeriod(value: String) {
          this.backupRetentionPeriod = value
        }
        
        fun backupRetentionPeriod(value: IntrinsicFunction) {
          this.backupRetentionPeriod = value
        }
        
        @JvmField
        var characterSetName: Any? = null

        fun characterSetName(value: String) {
          this.characterSetName = value
        }
        
        fun characterSetName(value: IntrinsicFunction) {
          this.characterSetName = value
        }
        
        @JvmField
        var copyTagsToSnapshot: Any? = null

        fun copyTagsToSnapshot(value: Boolean) {
          this.copyTagsToSnapshot = value
        }
        
        fun copyTagsToSnapshot(value: IntrinsicFunction) {
          this.copyTagsToSnapshot = value
        }
        
        @JvmField
        var dBClusterIdentifier: Any? = null

        fun dBClusterIdentifier(value: String) {
          this.dBClusterIdentifier = value
        }
        
        fun dBClusterIdentifier(value: IntrinsicFunction) {
          this.dBClusterIdentifier = value
        }
        
        @JvmField
        var dBInstanceClass: Any? = null

        fun dBInstanceClass(value: String) {
          this.dBInstanceClass = value
        }
        
        fun dBInstanceClass(value: IntrinsicFunction) {
          this.dBInstanceClass = value
        }
        
        @JvmField
        var dBInstanceIdentifier: Any? = null

        fun dBInstanceIdentifier(value: String) {
          this.dBInstanceIdentifier = value
        }
        
        fun dBInstanceIdentifier(value: IntrinsicFunction) {
          this.dBInstanceIdentifier = value
        }
        
        @JvmField
        var dBName: Any? = null

        fun dBName(value: String) {
          this.dBName = value
        }
        
        fun dBName(value: IntrinsicFunction) {
          this.dBName = value
        }
        
        @JvmField
        var dBParameterGroupName: Any? = null

        fun dBParameterGroupName(value: String) {
          this.dBParameterGroupName = value
        }
        
        fun dBParameterGroupName(value: IntrinsicFunction) {
          this.dBParameterGroupName = value
        }
        
        @JvmField
        var dBSecurityGroups: Any? = null

        fun dBSecurityGroups(value: List<String>) {
          this.dBSecurityGroups = value
        }
        
        fun dBSecurityGroups(vararg value: IntrinsicFunction) {
          this.dBSecurityGroups = value
        }
        
        @JvmField
        var dBSnapshotIdentifier: Any? = null

        fun dBSnapshotIdentifier(value: String) {
          this.dBSnapshotIdentifier = value
        }
        
        fun dBSnapshotIdentifier(value: IntrinsicFunction) {
          this.dBSnapshotIdentifier = value
        }
        
        @JvmField
        var dBSubnetGroupName: Any? = null

        fun dBSubnetGroupName(value: String) {
          this.dBSubnetGroupName = value
        }
        
        fun dBSubnetGroupName(value: IntrinsicFunction) {
          this.dBSubnetGroupName = value
        }
        
        @JvmField
        var domain: Any? = null

        fun domain(value: String) {
          this.domain = value
        }
        
        fun domain(value: IntrinsicFunction) {
          this.domain = value
        }
        
        @JvmField
        var domainIAMRoleName: Any? = null

        fun domainIAMRoleName(value: String) {
          this.domainIAMRoleName = value
        }
        
        fun domainIAMRoleName(value: IntrinsicFunction) {
          this.domainIAMRoleName = value
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
        var iops: Any? = null

        fun iops(value: Int) {
          this.iops = value
        }
        
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }
        
        @JvmField
        var kmsKeyId: Any? = null

        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }
        
        @JvmField
        var licenseModel: Any? = null

        fun licenseModel(value: String) {
          this.licenseModel = value
        }
        
        fun licenseModel(value: IntrinsicFunction) {
          this.licenseModel = value
        }
        
        @JvmField
        var masterUserPassword: Any? = null

        fun masterUserPassword(value: String) {
          this.masterUserPassword = value
        }
        
        fun masterUserPassword(value: IntrinsicFunction) {
          this.masterUserPassword = value
        }
        
        @JvmField
        var masterUsername: Any? = null

        fun masterUsername(value: String) {
          this.masterUsername = value
        }
        
        fun masterUsername(value: IntrinsicFunction) {
          this.masterUsername = value
        }
        
        @JvmField
        var monitoringInterval: Any? = null

        fun monitoringInterval(value: Int) {
          this.monitoringInterval = value
        }
        
        fun monitoringInterval(value: IntrinsicFunction) {
          this.monitoringInterval = value
        }
        
        @JvmField
        var monitoringRoleArn: Any? = null

        fun monitoringRoleArn(value: String) {
          this.monitoringRoleArn = value
        }
        
        fun monitoringRoleArn(value: IntrinsicFunction) {
          this.monitoringRoleArn = value
        }
        
        @JvmField
        var multiAZ: Any? = null

        fun multiAZ(value: Boolean) {
          this.multiAZ = value
        }
        
        fun multiAZ(value: IntrinsicFunction) {
          this.multiAZ = value
        }
        
        @JvmField
        var optionGroupName: Any? = null

        fun optionGroupName(value: String) {
          this.optionGroupName = value
        }
        
        fun optionGroupName(value: IntrinsicFunction) {
          this.optionGroupName = value
        }
        
        @JvmField
        var port: Any? = null

        fun port(value: String) {
          this.port = value
        }
        
        fun port(value: IntrinsicFunction) {
          this.port = value
        }
        
        @JvmField
        var preferredBackupWindow: Any? = null

        fun preferredBackupWindow(value: String) {
          this.preferredBackupWindow = value
        }
        
        fun preferredBackupWindow(value: IntrinsicFunction) {
          this.preferredBackupWindow = value
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
        var publiclyAccessible: Any? = null

        fun publiclyAccessible(value: Boolean) {
          this.publiclyAccessible = value
        }
        
        fun publiclyAccessible(value: IntrinsicFunction) {
          this.publiclyAccessible = value
        }
        
        @JvmField
        var sourceDBInstanceIdentifier: Any? = null

        fun sourceDBInstanceIdentifier(value: String) {
          this.sourceDBInstanceIdentifier = value
        }
        
        fun sourceDBInstanceIdentifier(value: IntrinsicFunction) {
          this.sourceDBInstanceIdentifier = value
        }
        
        @JvmField
        var sourceRegion: Any? = null

        fun sourceRegion(value: String) {
          this.sourceRegion = value
        }
        
        fun sourceRegion(value: IntrinsicFunction) {
          this.sourceRegion = value
        }
        
        @JvmField
        var storageEncrypted: Any? = null

        fun storageEncrypted(value: Boolean) {
          this.storageEncrypted = value
        }
        
        fun storageEncrypted(value: IntrinsicFunction) {
          this.storageEncrypted = value
        }
        
        @JvmField
        var storageType: Any? = null

        fun storageType(value: String) {
          this.storageType = value
        }
        
        fun storageType(value: IntrinsicFunction) {
          this.storageType = value
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
        var timezone: Any? = null

        fun timezone(value: String) {
          this.timezone = value
        }
        
        fun timezone(value: IntrinsicFunction) {
          this.timezone = value
        }
        
        @JvmField
        var vPCSecurityGroups: Any? = null

        fun vPCSecurityGroups(value: List<String>) {
          this.vPCSecurityGroups = value
        }
        
        fun vPCSecurityGroups(vararg value: IntrinsicFunction) {
          this.vPCSecurityGroups = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsRDSDBInstance(logicalId: String, init: AWSRDSDBInstance.() -> Unit = {}): AWSRDSDBInstance {
    return AWSRDSDBInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
