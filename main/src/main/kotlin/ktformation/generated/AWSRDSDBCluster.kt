
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
 */
@CloudFormationMarker
class AWSRDSDBCluster(logicalId: String) : Resource<AWSRDSDBCluster.Properties>(logicalId, "AWS::RDS::DBCluster") {

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
        var backupRetentionPeriod: Any? = null

        fun backupRetentionPeriod(value: Int) {
          this.backupRetentionPeriod = value
        }
        fun backupRetentionPeriod(value: IntrinsicFunction) {
  this.backupRetentionPeriod = value
}
        @JvmField
        var dBClusterParameterGroupName: Any? = null

        fun dBClusterParameterGroupName(value: String) {
          this.dBClusterParameterGroupName = value
        }
        fun dBClusterParameterGroupName(value: IntrinsicFunction) {
  this.dBClusterParameterGroupName = value
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
        var databaseName: Any? = null

        fun databaseName(value: String) {
          this.databaseName = value
        }
        fun databaseName(value: IntrinsicFunction) {
  this.databaseName = value
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
        var kmsKeyId: Any? = null

        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        fun kmsKeyId(value: IntrinsicFunction) {
  this.kmsKeyId = value
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
        var port: Any? = null

        fun port(value: Int) {
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
        var replicationSourceIdentifier: Any? = null

        fun replicationSourceIdentifier(value: String) {
          this.replicationSourceIdentifier = value
        }
        fun replicationSourceIdentifier(value: IntrinsicFunction) {
  this.replicationSourceIdentifier = value
}
        @JvmField
        var snapshotIdentifier: Any? = null

        fun snapshotIdentifier(value: String) {
          this.snapshotIdentifier = value
        }
        fun snapshotIdentifier(value: IntrinsicFunction) {
  this.snapshotIdentifier = value
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

fun Resources.awsRDSDBCluster(logicalId: String, init: AWSRDSDBCluster.() -> Unit = {}): AWSRDSDBCluster {
    return AWSRDSDBCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
