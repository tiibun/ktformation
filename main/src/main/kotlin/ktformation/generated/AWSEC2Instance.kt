
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 */
@CloudFormationMarker
class AWSEC2Instance(logicalId: String) : Resource<AWSEC2Instance.Properties>(logicalId, "AWS::EC2::Instance") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var additionalInfo: Any? = null
        fun additionalInfo(value: String) {
            this.additionalInfo = value
        }
        fun additionalInfo(value: IntrinsicFunction) { this.additionalInfo = value }
        @JvmField var affinity: Any? = null
        fun affinity(value: String) {
            this.affinity = value
        }
        fun affinity(value: IntrinsicFunction) { this.affinity = value }
        @JvmField var availabilityZone: Any? = null
        fun availabilityZone(value: String) {
            this.availabilityZone = value
        }
        fun availabilityZone(value: IntrinsicFunction) { this.availabilityZone = value }
        @JvmField var blockDeviceMappings: Any? = null
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
            this.blockDeviceMappings = value
        }
        fun blockDeviceMappings(vararg value: IntrinsicFunction) { this.blockDeviceMappings = value }
        @JvmField var disableApiTermination: Any? = null
        fun disableApiTermination(value: Boolean) {
            this.disableApiTermination = value
        }
        fun disableApiTermination(value: IntrinsicFunction) { this.disableApiTermination = value }
        @JvmField var ebsOptimized: Any? = null
        fun ebsOptimized(value: Boolean) {
            this.ebsOptimized = value
        }
        fun ebsOptimized(value: IntrinsicFunction) { this.ebsOptimized = value }
        @JvmField var elasticGpuSpecifications: Any? = null
        fun elasticGpuSpecifications(value: List<ElasticGpuSpecification>) {
            this.elasticGpuSpecifications = value
        }
        fun elasticGpuSpecifications(vararg value: IntrinsicFunction) { this.elasticGpuSpecifications = value }
        @JvmField var hostId: Any? = null
        fun hostId(value: String) {
            this.hostId = value
        }
        fun hostId(value: IntrinsicFunction) { this.hostId = value }
        @JvmField var iamInstanceProfile: Any? = null
        fun iamInstanceProfile(value: String) {
            this.iamInstanceProfile = value
        }
        fun iamInstanceProfile(value: IntrinsicFunction) { this.iamInstanceProfile = value }
        @JvmField var imageId: Any? = null
        fun imageId(value: String) { this.imageId = value }
        fun imageId(value: IntrinsicFunction) { this.imageId = value }
        @JvmField var instanceInitiatedShutdownBehavior: Any? = null
        fun instanceInitiatedShutdownBehavior(value: String) {
            this.instanceInitiatedShutdownBehavior = value
        }
        fun instanceInitiatedShutdownBehavior(value: IntrinsicFunction) { this.instanceInitiatedShutdownBehavior = value }
        @JvmField var instanceType: Any? = null
        fun instanceType(value: String) {
            this.instanceType = value
        }
        fun instanceType(value: IntrinsicFunction) { this.instanceType = value }
        @JvmField var ipv6AddressCount: Any? = null
        fun ipv6AddressCount(value: Int) {
            this.ipv6AddressCount = value
        }
        fun ipv6AddressCount(value: IntrinsicFunction) { this.ipv6AddressCount = value }
        @JvmField var ipv6Addresses: Any? = null
        fun ipv6Addresses(value: List<InstanceIpv6Address>) {
            this.ipv6Addresses = value
        }
        fun ipv6Addresses(vararg value: IntrinsicFunction) { this.ipv6Addresses = value }
        @JvmField var kernelId: Any? = null
        fun kernelId(value: String) {
            this.kernelId = value
        }
        fun kernelId(value: IntrinsicFunction) { this.kernelId = value }
        @JvmField var keyName: Any? = null
        fun keyName(value: String) {
            this.keyName = value
        }
        fun keyName(value: IntrinsicFunction) { this.keyName = value }
        @JvmField var monitoring: Any? = null
        fun monitoring(value: Boolean) {
            this.monitoring = value
        }
        fun monitoring(value: IntrinsicFunction) { this.monitoring = value }
        @JvmField var networkInterfaces: Any? = null
        fun networkInterfaces(value: List<NetworkInterface>) {
            this.networkInterfaces = value
        }
        fun networkInterfaces(vararg value: IntrinsicFunction) { this.networkInterfaces = value }
        @JvmField var placementGroupName: Any? = null
        fun placementGroupName(value: String) {
            this.placementGroupName = value
        }
        fun placementGroupName(value: IntrinsicFunction) { this.placementGroupName = value }
        @JvmField var privateIpAddress: Any? = null
        fun privateIpAddress(value: String) {
            this.privateIpAddress = value
        }
        fun privateIpAddress(value: IntrinsicFunction) { this.privateIpAddress = value }
        @JvmField var ramdiskId: Any? = null
        fun ramdiskId(value: String) {
            this.ramdiskId = value
        }
        fun ramdiskId(value: IntrinsicFunction) { this.ramdiskId = value }
        @JvmField var securityGroupIds: Any? = null
        fun securityGroupIds(value: List<String>) {
            this.securityGroupIds = value
        }
        fun securityGroupIds(vararg value: IntrinsicFunction) { this.securityGroupIds = value }
        @JvmField var securityGroups: Any? = null
        fun securityGroups(value: List<String>) {
            this.securityGroups = value
        }
        fun securityGroups(vararg value: IntrinsicFunction) { this.securityGroups = value }
        @JvmField var sourceDestCheck: Any? = null
        fun sourceDestCheck(value: Boolean) {
            this.sourceDestCheck = value
        }
        fun sourceDestCheck(value: IntrinsicFunction) { this.sourceDestCheck = value }
        @JvmField var ssmAssociations: Any? = null
        fun ssmAssociations(value: List<SsmAssociation>) {
            this.ssmAssociations = value
        }
        fun ssmAssociations(vararg value: IntrinsicFunction) { this.ssmAssociations = value }
        @JvmField var subnetId: Any? = null
        fun subnetId(value: String) {
            this.subnetId = value
        }
        fun subnetId(value: IntrinsicFunction) { this.subnetId = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var tenancy: Any? = null
        fun tenancy(value: String) {
            this.tenancy = value
        }
        fun tenancy(value: IntrinsicFunction) { this.tenancy = value }
        @JvmField var userData: Any? = null
        fun userData(value: String) {
            this.userData = value
        }
        fun userData(value: IntrinsicFunction) { this.userData = value }
        @JvmField var volumes: Any? = null
        fun volumes(value: List<Volume>) {
            this.volumes = value
        }
        fun volumes(vararg value: IntrinsicFunction) { this.volumes = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AssociationParameter(
            val key: String,
            val value: List<String>
    )

    class BlockDeviceMapping(
            val deviceName: String,
            val ebs: Ebs? = null,
            val noDevice: NoDevice? = null,
            val virtualName: String? = null
    )

    class Ebs(
            val deleteOnTermination: Boolean? = null,
            val encrypted: Boolean? = null,
            val iops: Int? = null,
            val snapshotId: String? = null,
            val volumeSize: Int? = null,
            val volumeType: String? = null
    )

    class ElasticGpuSpecification(
            val type: String
    )

    class InstanceIpv6Address(
            val ipv6Address: String
    )

    class NetworkInterface(
            val associatePublicIpAddress: Boolean? = null,
            val deleteOnTermination: Boolean? = null,
            val description: String? = null,
            val deviceIndex: String,
            val groupSet: List<String>? = null,
            val ipv6AddressCount: Int? = null,
            val ipv6Addresses: List<InstanceIpv6Address>? = null,
            val networkInterfaceId: String? = null,
            val privateIpAddress: String? = null,
            val privateIpAddresses: List<PrivateIpAddressSpecification>? = null,
            val secondaryPrivateIpAddressCount: Int? = null,
            val subnetId: String? = null
    )

    class NoDevice(

    )

    class PrivateIpAddressSpecification(
            val primary: Boolean,
            val privateIpAddress: String
    )

    class SsmAssociation(
            val associationParameters: List<AssociationParameter>? = null,
            val documentName: String
    )

    class Volume(
            val device: String,
            val volumeId: String
    )

}

fun Resources.awsEC2Instance(logicalId: String, init: AWSEC2Instance.() -> Unit = {}): AWSEC2Instance {
    return AWSEC2Instance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
