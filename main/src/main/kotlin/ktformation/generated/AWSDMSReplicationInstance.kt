
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::ReplicationInstance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html)
 */
@CloudFormationMarker
class AWSDMSReplicationInstance(logicalId: String) : Resource<AWSDMSReplicationInstance.Properties>(logicalId, "AWS::DMS::ReplicationInstance") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var allocatedStorage: Any? = null
        fun allocatedStorage(value: Int) {
            this.allocatedStorage = value
        }
        fun allocatedStorage(value: IntrinsicFunction) { this.allocatedStorage = value }
        @JvmField var allowMajorVersionUpgrade: Any? = null
        fun allowMajorVersionUpgrade(value: Boolean) {
            this.allowMajorVersionUpgrade = value
        }
        fun allowMajorVersionUpgrade(value: IntrinsicFunction) { this.allowMajorVersionUpgrade = value }
        @JvmField var autoMinorVersionUpgrade: Any? = null
        fun autoMinorVersionUpgrade(value: Boolean) {
            this.autoMinorVersionUpgrade = value
        }
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) { this.autoMinorVersionUpgrade = value }
        @JvmField var availabilityZone: Any? = null
        fun availabilityZone(value: String) {
            this.availabilityZone = value
        }
        fun availabilityZone(value: IntrinsicFunction) { this.availabilityZone = value }
        @JvmField var engineVersion: Any? = null
        fun engineVersion(value: String) {
            this.engineVersion = value
        }
        fun engineVersion(value: IntrinsicFunction) { this.engineVersion = value }
        @JvmField var kmsKeyId: Any? = null
        fun kmsKeyId(value: String) {
            this.kmsKeyId = value
        }
        fun kmsKeyId(value: IntrinsicFunction) { this.kmsKeyId = value }
        @JvmField var multiAZ: Any? = null
        fun multiAZ(value: Boolean) {
            this.multiAZ = value
        }
        fun multiAZ(value: IntrinsicFunction) { this.multiAZ = value }
        @JvmField var preferredMaintenanceWindow: Any? = null
        fun preferredMaintenanceWindow(value: String) {
            this.preferredMaintenanceWindow = value
        }
        fun preferredMaintenanceWindow(value: IntrinsicFunction) { this.preferredMaintenanceWindow = value }
        @JvmField var publiclyAccessible: Any? = null
        fun publiclyAccessible(value: Boolean) {
            this.publiclyAccessible = value
        }
        fun publiclyAccessible(value: IntrinsicFunction) { this.publiclyAccessible = value }
        @JvmField var replicationInstanceClass: Any? = null
        fun replicationInstanceClass(value: String) { this.replicationInstanceClass = value }
        fun replicationInstanceClass(value: IntrinsicFunction) { this.replicationInstanceClass = value }
        @JvmField var replicationInstanceIdentifier: Any? = null
        fun replicationInstanceIdentifier(value: String) {
            this.replicationInstanceIdentifier = value
        }
        fun replicationInstanceIdentifier(value: IntrinsicFunction) { this.replicationInstanceIdentifier = value }
        @JvmField var replicationSubnetGroupIdentifier: Any? = null
        fun replicationSubnetGroupIdentifier(value: String) {
            this.replicationSubnetGroupIdentifier = value
        }
        fun replicationSubnetGroupIdentifier(value: IntrinsicFunction) { this.replicationSubnetGroupIdentifier = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var vpcSecurityGroupIds: Any? = null
        fun vpcSecurityGroupIds(value: List<String>) {
            this.vpcSecurityGroupIds = value
        }
        fun vpcSecurityGroupIds(vararg value: IntrinsicFunction) { this.vpcSecurityGroupIds = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsDMSReplicationInstance(logicalId: String, init: AWSDMSReplicationInstance.() -> Unit = {}): AWSDMSReplicationInstance {
    return AWSDMSReplicationInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
