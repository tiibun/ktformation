
package ktformation.generated

import ktformation.*

/**
 * [AWS::Neptune::DBInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html)
 */
@CloudFormationMarker
class AWSNeptuneDBInstance(logicalId: String) : Resource<AWSNeptuneDBInstance.Properties>(logicalId, "AWS::Neptune::DBInstance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var allowMajorVersionUpgrade: Any? = null

        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowMajorVersionUpgrade(value: Boolean) {
          this.allowMajorVersionUpgrade = value
        }
        
        /**
         * [allowMajorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowMajorVersionUpgrade(value: IntrinsicFunction) {
          this.allowMajorVersionUpgrade = value
        }

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
          this.autoMinorVersionUpgrade = value
        }

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBClusterIdentifier: Any? = null

        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: String) {
          this.dBClusterIdentifier = value
        }
        
        /**
         * [dBClusterIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBClusterIdentifier(value: IntrinsicFunction) {
          this.dBClusterIdentifier = value
        }

        /**
         * [dBInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dBInstanceClass: Any? = null

        /**
         * [dBInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBInstanceClass(value: String) {
          this.dBInstanceClass = value
        }
        
        /**
         * [dBInstanceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dBInstanceClass(value: IntrinsicFunction) {
          this.dBInstanceClass = value
        }

        /**
         * [dBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBInstanceIdentifier: Any? = null

        /**
         * [dBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBInstanceIdentifier(value: String) {
          this.dBInstanceIdentifier = value
        }
        
        /**
         * [dBInstanceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBInstanceIdentifier(value: IntrinsicFunction) {
          this.dBInstanceIdentifier = value
        }

        /**
         * [dBParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBParameterGroupName: Any? = null

        /**
         * [dBParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBParameterGroupName(value: String) {
          this.dBParameterGroupName = value
        }
        
        /**
         * [dBParameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBParameterGroupName(value: IntrinsicFunction) {
          this.dBParameterGroupName = value
        }

        /**
         * [dBSnapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSnapshotIdentifier: Any? = null

        /**
         * [dBSnapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSnapshotIdentifier(value: String) {
          this.dBSnapshotIdentifier = value
        }
        
        /**
         * [dBSnapshotIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSnapshotIdentifier(value: IntrinsicFunction) {
          this.dBSnapshotIdentifier = value
        }

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dBSubnetGroupName: Any? = null

        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: String) {
          this.dBSubnetGroupName = value
        }
        
        /**
         * [dBSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dBSubnetGroupName(value: IntrinsicFunction) {
          this.dBSubnetGroupName = value
        }

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
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
 * [AWS::Neptune::DBInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html)
 */
fun Resources.awsNeptuneDBInstance(logicalId: String, init: AWSNeptuneDBInstance.() -> Unit = {}): AWSNeptuneDBInstance {
    return AWSNeptuneDBInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
