
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::ReplicationInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html)
 */
@CloudFormationMarker
class AWSDMSReplicationInstance(logicalId: String) : Resource<AWSDMSReplicationInstance.Properties>(logicalId, "AWS::DMS::ReplicationInstance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allocatedStorage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var allocatedStorage: Any? = null

        /**
         * [allocatedStorage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun allocatedStorage(value: Int) {
          this.allocatedStorage = value
        }
        
        /**
         * [allocatedStorage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun allocatedStorage(value: IntrinsicFunction) {
          this.allocatedStorage = value
        }

        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var allowMajorVersionUpgrade: Any? = null

        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowMajorVersionUpgrade(value: Boolean) {
          this.allowMajorVersionUpgrade = value
        }
        
        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowMajorVersionUpgrade(value: IntrinsicFunction) {
          this.allowMajorVersionUpgrade = value
        }

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
          this.autoMinorVersionUpgrade = value
        }

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var engineVersion: Any? = null

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun engineVersion(value: IntrinsicFunction) {
          this.engineVersion = value
        }

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }

        /**
         * [multiAZ](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var multiAZ: Any? = null

        /**
         * [multiAZ](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun multiAZ(value: Boolean) {
          this.multiAZ = value
        }
        
        /**
         * [multiAZ](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun multiAZ(value: IntrinsicFunction) {
          this.multiAZ = value
        }

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }

        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var publiclyAccessible: Any? = null

        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: Boolean) {
          this.publiclyAccessible = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: IntrinsicFunction) {
          this.publiclyAccessible = value
        }

        /**
         * [replicationInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var replicationInstanceClass: Any? = null

        /**
         * [replicationInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationInstanceClass(value: String) {
          this.replicationInstanceClass = value
        }
        
        /**
         * [replicationInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationInstanceClass(value: IntrinsicFunction) {
          this.replicationInstanceClass = value
        }

        /**
         * [replicationInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationInstanceIdentifier: Any? = null

        /**
         * [replicationInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationInstanceIdentifier(value: String) {
          this.replicationInstanceIdentifier = value
        }
        
        /**
         * [replicationInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationInstanceIdentifier(value: IntrinsicFunction) {
          this.replicationInstanceIdentifier = value
        }

        /**
         * [replicationSubnetGroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationSubnetGroupIdentifier: Any? = null

        /**
         * [replicationSubnetGroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationSubnetGroupIdentifier(value: String) {
          this.replicationSubnetGroupIdentifier = value
        }
        
        /**
         * [replicationSubnetGroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationSubnetGroupIdentifier(value: IntrinsicFunction) {
          this.replicationSubnetGroupIdentifier = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vpcSecurityGroupIds: Any? = null

        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupIds(value: List<String>) {
          this.vpcSecurityGroupIds = value
        }
        
        /**
         * [vpcSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids)
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
 * [AWS::DMS::ReplicationInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html)
 */
fun Resources.awsDMSReplicationInstance(logicalId: String, init: AWSDMSReplicationInstance.() -> Unit = {}): AWSDMSReplicationInstance {
    return AWSDMSReplicationInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
