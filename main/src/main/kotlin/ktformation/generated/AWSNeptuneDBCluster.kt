
package ktformation.generated

import ktformation.*

/**
 * [AWS::Neptune::DBCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html)
 */
@CloudFormationMarker
class AWSNeptuneDBCluster(logicalId: String) : Resource<AWSNeptuneDBCluster.Properties>(logicalId, "AWS::Neptune::DBCluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var availabilityZones: Any? = null

        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(value: List<String>) {
          this.availabilityZones = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(vararg value: IntrinsicFunction) {
          this.availabilityZones = value
        }
        
        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var backupRetentionPeriod: Any? = null

        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun backupRetentionPeriod(value: Int) {
          this.backupRetentionPeriod = value
        }
        
        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun backupRetentionPeriod(value: IntrinsicFunction) {
          this.backupRetentionPeriod = value
        }
        
        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBClusterIdentifier: Any? = null

        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: String) {
          this.dBClusterIdentifier = value
        }
        
        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: IntrinsicFunction) {
          this.dBClusterIdentifier = value
        }
        
        /**
         * [dBClusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBClusterParameterGroupName: Any? = null

        /**
         * [dBClusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterParameterGroupName(value: String) {
          this.dBClusterParameterGroupName = value
        }
        
        /**
         * [dBClusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterParameterGroupName(value: IntrinsicFunction) {
          this.dBClusterParameterGroupName = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSubnetGroupName: Any? = null

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: String) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: IntrinsicFunction) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [iamAuthEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var iamAuthEnabled: Any? = null

        /**
         * [iamAuthEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun iamAuthEnabled(value: Boolean) {
          this.iamAuthEnabled = value
        }
        
        /**
         * [iamAuthEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun iamAuthEnabled(value: IntrinsicFunction) {
          this.iamAuthEnabled = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }
        
        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredBackupWindow: Any? = null

        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredBackupWindow(value: String) {
          this.preferredBackupWindow = value
        }
        
        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredBackupWindow(value: IntrinsicFunction) {
          this.preferredBackupWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotIdentifier: Any? = null

        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotIdentifier(value: String) {
          this.snapshotIdentifier = value
        }
        
        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotIdentifier(value: IntrinsicFunction) {
          this.snapshotIdentifier = value
        }
        
        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var storageEncrypted: Any? = null

        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storageEncrypted(value: Boolean) {
          this.storageEncrypted = value
        }
        
        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storageEncrypted(value: IntrinsicFunction) {
          this.storageEncrypted = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vpcSecurityGroupIds: Any? = null

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupIds(value: List<String>) {
          this.vpcSecurityGroupIds = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids)
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
 * [AWS::Neptune::DBCluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html)
 */
fun Resources.awsNeptuneDBCluster(logicalId: String, init: AWSNeptuneDBCluster.() -> Unit = {}): AWSNeptuneDBCluster {
    return AWSNeptuneDBCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
