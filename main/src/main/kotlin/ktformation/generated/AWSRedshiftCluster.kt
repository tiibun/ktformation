
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html)
 */
@CloudFormationMarker
class AWSRedshiftCluster(logicalId: String) : Resource<AWSRedshiftCluster.Properties>(logicalId, "AWS::Redshift::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var allowVersionUpgrade: Any? = null
        fun allowVersionUpgrade(value: Boolean?) { this.allowVersionUpgrade = value }
        fun allowVersionUpgrade(value: IntrinsicFunction) { this.allowVersionUpgrade = value }
        @JvmField var automatedSnapshotRetentionPeriod: Any? = null
        fun automatedSnapshotRetentionPeriod(value: Int?) { this.automatedSnapshotRetentionPeriod = value }
        fun automatedSnapshotRetentionPeriod(value: IntrinsicFunction) { this.automatedSnapshotRetentionPeriod = value }
        @JvmField var availabilityZone: Any? = null
        fun availabilityZone(value: String?) { this.availabilityZone = value }
        fun availabilityZone(value: IntrinsicFunction) { this.availabilityZone = value }
        @JvmField var clusterParameterGroupName: Any? = null
        fun clusterParameterGroupName(value: String?) { this.clusterParameterGroupName = value }
        fun clusterParameterGroupName(value: IntrinsicFunction) { this.clusterParameterGroupName = value }
        @JvmField var clusterSecurityGroups: Any? = null
        fun clusterSecurityGroups(value: List<String>?) { this.clusterSecurityGroups = value }
        fun clusterSecurityGroups(vararg value: IntrinsicFunction) { this.clusterSecurityGroups = value }
        @JvmField var clusterSubnetGroupName: Any? = null
        fun clusterSubnetGroupName(value: String?) { this.clusterSubnetGroupName = value }
        fun clusterSubnetGroupName(value: IntrinsicFunction) { this.clusterSubnetGroupName = value }
        @JvmField var clusterType: Any? = null
        fun clusterType(value: String) { this.clusterType = value }
        fun clusterType(value: IntrinsicFunction) { this.clusterType = value }
        @JvmField var clusterVersion: Any? = null
        fun clusterVersion(value: String?) { this.clusterVersion = value }
        fun clusterVersion(value: IntrinsicFunction) { this.clusterVersion = value }
        @JvmField var dBName: Any? = null
        fun dBName(value: String) { this.dBName = value }
        fun dBName(value: IntrinsicFunction) { this.dBName = value }
        @JvmField var elasticIp: Any? = null
        fun elasticIp(value: String?) { this.elasticIp = value }
        fun elasticIp(value: IntrinsicFunction) { this.elasticIp = value }
        @JvmField var encrypted: Any? = null
        fun encrypted(value: Boolean?) { this.encrypted = value }
        fun encrypted(value: IntrinsicFunction) { this.encrypted = value }
        @JvmField var hsmClientCertificateIdentifier: Any? = null
        fun hsmClientCertificateIdentifier(value: String?) { this.hsmClientCertificateIdentifier = value }
        fun hsmClientCertificateIdentifier(value: IntrinsicFunction) { this.hsmClientCertificateIdentifier = value }
        @JvmField var hsmConfigurationIdentifier: Any? = null
        fun hsmConfigurationIdentifier(value: String?) { this.hsmConfigurationIdentifier = value }
        fun hsmConfigurationIdentifier(value: IntrinsicFunction) { this.hsmConfigurationIdentifier = value }
        @JvmField var iamRoles: Any? = null
        fun iamRoles(value: List<String>?) { this.iamRoles = value }
        fun iamRoles(vararg value: IntrinsicFunction) { this.iamRoles = value }
        @JvmField var kmsKeyId: Any? = null
        fun kmsKeyId(value: String?) { this.kmsKeyId = value }
        fun kmsKeyId(value: IntrinsicFunction) { this.kmsKeyId = value }
        @JvmField var loggingProperties: Any? = null
        fun loggingProperties(value: LoggingProperties?) { this.loggingProperties = value }
        fun loggingProperties(value: IntrinsicFunction) { this.loggingProperties = value }
        @JvmField var masterUserPassword: Any? = null
        fun masterUserPassword(value: String) { this.masterUserPassword = value }
        fun masterUserPassword(value: IntrinsicFunction) { this.masterUserPassword = value }
        @JvmField var masterUsername: Any? = null
        fun masterUsername(value: String) { this.masterUsername = value }
        fun masterUsername(value: IntrinsicFunction) { this.masterUsername = value }
        @JvmField var nodeType: Any? = null
        fun nodeType(value: String) { this.nodeType = value }
        fun nodeType(value: IntrinsicFunction) { this.nodeType = value }
        @JvmField var numberOfNodes: Any? = null
        fun numberOfNodes(value: Int?) { this.numberOfNodes = value }
        fun numberOfNodes(value: IntrinsicFunction) { this.numberOfNodes = value }
        @JvmField var ownerAccount: Any? = null
        fun ownerAccount(value: String?) { this.ownerAccount = value }
        fun ownerAccount(value: IntrinsicFunction) { this.ownerAccount = value }
        @JvmField var port: Any? = null
        fun port(value: Int?) { this.port = value }
        fun port(value: IntrinsicFunction) { this.port = value }
        @JvmField var preferredMaintenanceWindow: Any? = null
        fun preferredMaintenanceWindow(value: String?) { this.preferredMaintenanceWindow = value }
        fun preferredMaintenanceWindow(value: IntrinsicFunction) { this.preferredMaintenanceWindow = value }
        @JvmField var publiclyAccessible: Any? = null
        fun publiclyAccessible(value: Boolean?) { this.publiclyAccessible = value }
        fun publiclyAccessible(value: IntrinsicFunction) { this.publiclyAccessible = value }
        @JvmField var snapshotClusterIdentifier: Any? = null
        fun snapshotClusterIdentifier(value: String?) { this.snapshotClusterIdentifier = value }
        fun snapshotClusterIdentifier(value: IntrinsicFunction) { this.snapshotClusterIdentifier = value }
        @JvmField var snapshotIdentifier: Any? = null
        fun snapshotIdentifier(value: String?) { this.snapshotIdentifier = value }
        fun snapshotIdentifier(value: IntrinsicFunction) { this.snapshotIdentifier = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var vpcSecurityGroupIds: Any? = null
        fun vpcSecurityGroupIds(value: List<String>?) { this.vpcSecurityGroupIds = value }
        fun vpcSecurityGroupIds(vararg value: IntrinsicFunction) { this.vpcSecurityGroupIds = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LoggingProperties(
            val bucketName: String,
            val s3KeyPrefix: String? = null
    )

}

fun Resources.awsRedshiftCluster(logicalId: String, init: AWSRedshiftCluster.() -> Unit = {}): AWSRedshiftCluster {
    return AWSRedshiftCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
