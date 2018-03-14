
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html)
 */
@CloudFormationMarker
class AWSRedshiftCluster(logicalId: String) : Resource<AWSRedshiftCluster.Properties>(logicalId, "AWS::Redshift::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allowVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var allowVersionUpgrade: Any? = null

        /**
         * [allowVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowVersionUpgrade(value: Boolean) {
          this.allowVersionUpgrade = value
        }
        
        /**
         * [allowVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowVersionUpgrade(value: IntrinsicFunction) {
          this.allowVersionUpgrade = value
        }
        
        /**
         * [automatedSnapshotRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var automatedSnapshotRetentionPeriod: Any? = null

        /**
         * [automatedSnapshotRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun automatedSnapshotRetentionPeriod(value: Int) {
          this.automatedSnapshotRetentionPeriod = value
        }
        
        /**
         * [automatedSnapshotRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun automatedSnapshotRetentionPeriod(value: IntrinsicFunction) {
          this.automatedSnapshotRetentionPeriod = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        /**
         * [clusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clusterIdentifier: Any? = null

        /**
         * [clusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterIdentifier(value: String) {
          this.clusterIdentifier = value
        }
        
        /**
         * [clusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterIdentifier(value: IntrinsicFunction) {
          this.clusterIdentifier = value
        }
        
        /**
         * [clusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clusterParameterGroupName: Any? = null

        /**
         * [clusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterParameterGroupName(value: String) {
          this.clusterParameterGroupName = value
        }
        
        /**
         * [clusterParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterParameterGroupName(value: IntrinsicFunction) {
          this.clusterParameterGroupName = value
        }
        
        /**
         * [clusterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var clusterSecurityGroups: Any? = null

        /**
         * [clusterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun clusterSecurityGroups(value: List<String>) {
          this.clusterSecurityGroups = value
        }
        
        /**
         * [clusterSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun clusterSecurityGroups(vararg value: IntrinsicFunction) {
          this.clusterSecurityGroups = value
        }
        
        /**
         * [clusterSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clusterSubnetGroupName: Any? = null

        /**
         * [clusterSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterSubnetGroupName(value: String) {
          this.clusterSubnetGroupName = value
        }
        
        /**
         * [clusterSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterSubnetGroupName(value: IntrinsicFunction) {
          this.clusterSubnetGroupName = value
        }
        
        /**
         * [clusterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var clusterType: Any? = null

        /**
         * [clusterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterType(value: String) {
          this.clusterType = value
        }
        
        /**
         * [clusterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterType(value: IntrinsicFunction) {
          this.clusterType = value
        }
        
        /**
         * [clusterVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clusterVersion: Any? = null

        /**
         * [clusterVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterVersion(value: String) {
          this.clusterVersion = value
        }
        
        /**
         * [clusterVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterVersion(value: IntrinsicFunction) {
          this.clusterVersion = value
        }
        
        /**
         * [dBName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dBName: Any? = null

        /**
         * [dBName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBName(value: String) {
          this.dBName = value
        }
        
        /**
         * [dBName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBName(value: IntrinsicFunction) {
          this.dBName = value
        }
        
        /**
         * [elasticIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var elasticIp: Any? = null

        /**
         * [elasticIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun elasticIp(value: String) {
          this.elasticIp = value
        }
        
        /**
         * [elasticIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun elasticIp(value: IntrinsicFunction) {
          this.elasticIp = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var encrypted: Any? = null

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: IntrinsicFunction) {
          this.encrypted = value
        }
        
        /**
         * [hsmClientCertificateIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hsmClientCertificateIdentifier: Any? = null

        /**
         * [hsmClientCertificateIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hsmClientCertificateIdentifier(value: String) {
          this.hsmClientCertificateIdentifier = value
        }
        
        /**
         * [hsmClientCertificateIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hsmClientCertificateIdentifier(value: IntrinsicFunction) {
          this.hsmClientCertificateIdentifier = value
        }
        
        /**
         * [hsmConfigurationIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hsmConfigurationIdentifier: Any? = null

        /**
         * [hsmConfigurationIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hsmConfigurationIdentifier(value: String) {
          this.hsmConfigurationIdentifier = value
        }
        
        /**
         * [hsmConfigurationIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hsmConfigurationIdentifier(value: IntrinsicFunction) {
          this.hsmConfigurationIdentifier = value
        }
        
        /**
         * [iamRoles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var iamRoles: Any? = null

        /**
         * [iamRoles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun iamRoles(value: List<String>) {
          this.iamRoles = value
        }
        
        /**
         * [iamRoles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun iamRoles(vararg value: IntrinsicFunction) {
          this.iamRoles = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }
        
        /**
         * [loggingProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
         *
         * _Required_: no
         *
         * _Type_: LoggingProperties
         */
        @JvmField
        var loggingProperties: Any? = null

        /**
         * [loggingProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
         *
         * _Required_: no
         *
         * _Type_: LoggingProperties
         */
        fun loggingProperties(value: LoggingProperties) {
          this.loggingProperties = value
        }
        
        /**
         * [loggingProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-loggingproperties)
         *
         * _Required_: no
         *
         * _Type_: LoggingProperties
         */
        fun loggingProperties(value: IntrinsicFunction) {
          this.loggingProperties = value
        }
        
        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var masterUserPassword: Any? = null

        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun masterUserPassword(value: String) {
          this.masterUserPassword = value
        }
        
        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun masterUserPassword(value: IntrinsicFunction) {
          this.masterUserPassword = value
        }
        
        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var masterUsername: Any? = null

        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun masterUsername(value: String) {
          this.masterUsername = value
        }
        
        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun masterUsername(value: IntrinsicFunction) {
          this.masterUsername = value
        }
        
        /**
         * [nodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var nodeType: Any? = null

        /**
         * [nodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun nodeType(value: String) {
          this.nodeType = value
        }
        
        /**
         * [nodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun nodeType(value: IntrinsicFunction) {
          this.nodeType = value
        }
        
        /**
         * [numberOfNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var numberOfNodes: Any? = null

        /**
         * [numberOfNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfNodes(value: Int) {
          this.numberOfNodes = value
        }
        
        /**
         * [numberOfNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfNodes(value: IntrinsicFunction) {
          this.numberOfNodes = value
        }
        
        /**
         * [ownerAccount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ownerAccount: Any? = null

        /**
         * [ownerAccount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ownerAccount(value: String) {
          this.ownerAccount = value
        }
        
        /**
         * [ownerAccount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ownerAccount(value: IntrinsicFunction) {
          this.ownerAccount = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var publiclyAccessible: Any? = null

        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: Boolean) {
          this.publiclyAccessible = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: IntrinsicFunction) {
          this.publiclyAccessible = value
        }
        
        /**
         * [snapshotClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotClusterIdentifier: Any? = null

        /**
         * [snapshotClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotClusterIdentifier(value: String) {
          this.snapshotClusterIdentifier = value
        }
        
        /**
         * [snapshotClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotClusterIdentifier(value: IntrinsicFunction) {
          this.snapshotClusterIdentifier = value
        }
        
        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotIdentifier: Any? = null

        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotIdentifier(value: String) {
          this.snapshotIdentifier = value
        }
        
        /**
         * [snapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotIdentifier(value: IntrinsicFunction) {
          this.snapshotIdentifier = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vpcSecurityGroupIds: Any? = null

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupIds(value: List<String>) {
          this.vpcSecurityGroupIds = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids)
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


    class LoggingProperties(
            /**
             * [BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketName: String,
            /**
             * [S3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3KeyPrefix: String? = null
    )

}

/**
 * [AWS::Redshift::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html)
 */
fun Resources.awsRedshiftCluster(logicalId: String, init: AWSRedshiftCluster.() -> Unit = {}): AWSRedshiftCluster {
    return AWSRedshiftCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
