
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html)
 */
@CloudFormationMarker
class AWSRDSDBInstance(logicalId: String) : Resource<AWSRDSDBInstance.Properties>(logicalId, "AWS::RDS::DBInstance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allocatedStorage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var allocatedStorage: Any? = null

        /**
         * [allocatedStorage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allocatedStorage(value: String) {
          this.allocatedStorage = value
        }
        
        /**
         * [allocatedStorage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allocatedStorage(value: IntrinsicFunction) {
          this.allocatedStorage = value
        }
        
        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var allowMajorVersionUpgrade: Any? = null

        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowMajorVersionUpgrade(value: Boolean) {
          this.allowMajorVersionUpgrade = value
        }
        
        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowMajorVersionUpgrade(value: IntrinsicFunction) {
          this.allowMajorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var backupRetentionPeriod: Any? = null

        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun backupRetentionPeriod(value: String) {
          this.backupRetentionPeriod = value
        }
        
        /**
         * [backupRetentionPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun backupRetentionPeriod(value: IntrinsicFunction) {
          this.backupRetentionPeriod = value
        }
        
        /**
         * [characterSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var characterSetName: Any? = null

        /**
         * [characterSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun characterSetName(value: String) {
          this.characterSetName = value
        }
        
        /**
         * [characterSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun characterSetName(value: IntrinsicFunction) {
          this.characterSetName = value
        }
        
        /**
         * [copyTagsToSnapshot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var copyTagsToSnapshot: Any? = null

        /**
         * [copyTagsToSnapshot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun copyTagsToSnapshot(value: Boolean) {
          this.copyTagsToSnapshot = value
        }
        
        /**
         * [copyTagsToSnapshot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun copyTagsToSnapshot(value: IntrinsicFunction) {
          this.copyTagsToSnapshot = value
        }
        
        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBClusterIdentifier: Any? = null

        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: String) {
          this.dBClusterIdentifier = value
        }
        
        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: IntrinsicFunction) {
          this.dBClusterIdentifier = value
        }
        
        /**
         * [dBInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dBInstanceClass: Any? = null

        /**
         * [dBInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBInstanceClass(value: String) {
          this.dBInstanceClass = value
        }
        
        /**
         * [dBInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBInstanceClass(value: IntrinsicFunction) {
          this.dBInstanceClass = value
        }
        
        /**
         * [dBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBInstanceIdentifier: Any? = null

        /**
         * [dBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBInstanceIdentifier(value: String) {
          this.dBInstanceIdentifier = value
        }
        
        /**
         * [dBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBInstanceIdentifier(value: IntrinsicFunction) {
          this.dBInstanceIdentifier = value
        }
        
        /**
         * [dBName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBName: Any? = null

        /**
         * [dBName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBName(value: String) {
          this.dBName = value
        }
        
        /**
         * [dBName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBName(value: IntrinsicFunction) {
          this.dBName = value
        }
        
        /**
         * [dBParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBParameterGroupName: Any? = null

        /**
         * [dBParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBParameterGroupName(value: String) {
          this.dBParameterGroupName = value
        }
        
        /**
         * [dBParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBParameterGroupName(value: IntrinsicFunction) {
          this.dBParameterGroupName = value
        }
        
        /**
         * [dBSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var dBSecurityGroups: Any? = null

        /**
         * [dBSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dBSecurityGroups(value: List<String>) {
          this.dBSecurityGroups = value
        }
        
        /**
         * [dBSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dBSecurityGroups(vararg value: IntrinsicFunction) {
          this.dBSecurityGroups = value
        }
        
        /**
         * [dBSnapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSnapshotIdentifier: Any? = null

        /**
         * [dBSnapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSnapshotIdentifier(value: String) {
          this.dBSnapshotIdentifier = value
        }
        
        /**
         * [dBSnapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSnapshotIdentifier(value: IntrinsicFunction) {
          this.dBSnapshotIdentifier = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSubnetGroupName: Any? = null

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: String) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: IntrinsicFunction) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [domain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var domain: Any? = null

        /**
         * [domain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domain(value: String) {
          this.domain = value
        }
        
        /**
         * [domain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domain(value: IntrinsicFunction) {
          this.domain = value
        }
        
        /**
         * [domainIAMRoleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var domainIAMRoleName: Any? = null

        /**
         * [domainIAMRoleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domainIAMRoleName(value: String) {
          this.domainIAMRoleName = value
        }
        
        /**
         * [domainIAMRoleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domainIAMRoleName(value: IntrinsicFunction) {
          this.domainIAMRoleName = value
        }
        
        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engine: Any? = null

        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engine(value: String) {
          this.engine = value
        }
        
        /**
         * [engine](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engine(value: IntrinsicFunction) {
          this.engine = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engineVersion: Any? = null

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: IntrinsicFunction) {
          this.engineVersion = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }
        
        /**
         * [licenseModel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var licenseModel: Any? = null

        /**
         * [licenseModel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun licenseModel(value: String) {
          this.licenseModel = value
        }
        
        /**
         * [licenseModel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun licenseModel(value: IntrinsicFunction) {
          this.licenseModel = value
        }
        
        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var masterUserPassword: Any? = null

        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUserPassword(value: String) {
          this.masterUserPassword = value
        }
        
        /**
         * [masterUserPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUserPassword(value: IntrinsicFunction) {
          this.masterUserPassword = value
        }
        
        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var masterUsername: Any? = null

        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUsername(value: String) {
          this.masterUsername = value
        }
        
        /**
         * [masterUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun masterUsername(value: IntrinsicFunction) {
          this.masterUsername = value
        }
        
        /**
         * [monitoringInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var monitoringInterval: Any? = null

        /**
         * [monitoringInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun monitoringInterval(value: Int) {
          this.monitoringInterval = value
        }
        
        /**
         * [monitoringInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun monitoringInterval(value: IntrinsicFunction) {
          this.monitoringInterval = value
        }
        
        /**
         * [monitoringRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var monitoringRoleArn: Any? = null

        /**
         * [monitoringRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun monitoringRoleArn(value: String) {
          this.monitoringRoleArn = value
        }
        
        /**
         * [monitoringRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun monitoringRoleArn(value: IntrinsicFunction) {
          this.monitoringRoleArn = value
        }
        
        /**
         * [multiAZ](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var multiAZ: Any? = null

        /**
         * [multiAZ](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun multiAZ(value: Boolean) {
          this.multiAZ = value
        }
        
        /**
         * [multiAZ](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun multiAZ(value: IntrinsicFunction) {
          this.multiAZ = value
        }
        
        /**
         * [optionGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var optionGroupName: Any? = null

        /**
         * [optionGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun optionGroupName(value: String) {
          this.optionGroupName = value
        }
        
        /**
         * [optionGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun optionGroupName(value: IntrinsicFunction) {
          this.optionGroupName = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun port(value: String) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }
        
        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredBackupWindow: Any? = null

        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredBackupWindow(value: String) {
          this.preferredBackupWindow = value
        }
        
        /**
         * [preferredBackupWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredBackupWindow(value: IntrinsicFunction) {
          this.preferredBackupWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var publiclyAccessible: Any? = null

        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: Boolean) {
          this.publiclyAccessible = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: IntrinsicFunction) {
          this.publiclyAccessible = value
        }
        
        /**
         * [sourceDBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceDBInstanceIdentifier: Any? = null

        /**
         * [sourceDBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceDBInstanceIdentifier(value: String) {
          this.sourceDBInstanceIdentifier = value
        }
        
        /**
         * [sourceDBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceDBInstanceIdentifier(value: IntrinsicFunction) {
          this.sourceDBInstanceIdentifier = value
        }
        
        /**
         * [sourceRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceRegion: Any? = null

        /**
         * [sourceRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceRegion(value: String) {
          this.sourceRegion = value
        }
        
        /**
         * [sourceRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceRegion(value: IntrinsicFunction) {
          this.sourceRegion = value
        }
        
        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var storageEncrypted: Any? = null

        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storageEncrypted(value: Boolean) {
          this.storageEncrypted = value
        }
        
        /**
         * [storageEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storageEncrypted(value: IntrinsicFunction) {
          this.storageEncrypted = value
        }
        
        /**
         * [storageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var storageType: Any? = null

        /**
         * [storageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun storageType(value: String) {
          this.storageType = value
        }
        
        /**
         * [storageType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun storageType(value: IntrinsicFunction) {
          this.storageType = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [timezone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var timezone: Any? = null

        /**
         * [timezone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun timezone(value: String) {
          this.timezone = value
        }
        
        /**
         * [timezone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun timezone(value: IntrinsicFunction) {
          this.timezone = value
        }
        
        /**
         * [vPCSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vPCSecurityGroups: Any? = null

        /**
         * [vPCSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vPCSecurityGroups(value: List<String>) {
          this.vPCSecurityGroups = value
        }
        
        /**
         * [vPCSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
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

/**
 * [AWS::RDS::DBInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html)
 */
fun Resources.awsRDSDBInstance(logicalId: String, init: AWSRDSDBInstance.() -> Unit = {}): AWSRDSDBInstance {
    return AWSRDSDBInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
