
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SpotFleet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
 */
@CloudFormationMarker
class AWSEC2SpotFleet(logicalId: String) : Resource<AWSEC2SpotFleet.Properties>(logicalId, "AWS::EC2::SpotFleet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var spotFleetRequestConfigData: Any? = null

        fun spotFleetRequestConfigData(value: SpotFleetRequestConfigData) {
          this.spotFleetRequestConfigData = value
        }
        
        fun spotFleetRequestConfigData(value: IntrinsicFunction) {
          this.spotFleetRequestConfigData = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BlockDeviceMapping(
            val deviceName: String,
            val ebs: EbsBlockDevice? = null,
            val noDevice: String? = null,
            val virtualName: String? = null
    )

    class EbsBlockDevice(
            val deleteOnTermination: Boolean? = null,
            val encrypted: Boolean? = null,
            val iops: Int? = null,
            val snapshotId: String? = null,
            val volumeSize: Int? = null,
            val volumeType: String? = null
    )

    class GroupIdentifier(
            val groupId: String
    )

    class IamInstanceProfileSpecification(
            val arn: String? = null
    )

    class InstanceIpv6Address(
            val ipv6Address: String
    )

    class InstanceNetworkInterfaceSpecification(
            val associatePublicIpAddress: Boolean? = null,
            val deleteOnTermination: Boolean? = null,
            val description: String? = null,
            val deviceIndex: Int? = null,
            val groups: List<String>? = null,
            val ipv6AddressCount: Int? = null,
            val ipv6Addresses: List<InstanceIpv6Address>? = null,
            val networkInterfaceId: String? = null,
            val privateIpAddresses: List<PrivateIpAddressSpecification>? = null,
            val secondaryPrivateIpAddressCount: Int? = null,
            val subnetId: String? = null
    )

    class PrivateIpAddressSpecification(
            val primary: Boolean? = null,
            val privateIpAddress: String
    )

    class SpotFleetLaunchSpecification(
            val blockDeviceMappings: List<BlockDeviceMapping>? = null,
            val ebsOptimized: Boolean? = null,
            val iamInstanceProfile: IamInstanceProfileSpecification? = null,
            val imageId: String,
            val instanceType: String,
            val kernelId: String? = null,
            val keyName: String? = null,
            val monitoring: SpotFleetMonitoring? = null,
            val networkInterfaces: List<InstanceNetworkInterfaceSpecification>? = null,
            val placement: SpotPlacement? = null,
            val ramdiskId: String? = null,
            val securityGroups: List<GroupIdentifier>? = null,
            val spotPrice: String? = null,
            val subnetId: String? = null,
            val userData: String? = null,
            val weightedCapacity: Double? = null
    )

    class SpotFleetMonitoring(
            val enabled: Boolean? = null
    )

    class SpotFleetRequestConfigData(
            val allocationStrategy: String? = null,
            val excessCapacityTerminationPolicy: String? = null,
            val iamFleetRole: String,
            val launchSpecifications: List<SpotFleetLaunchSpecification>,
            val replaceUnhealthyInstances: Boolean? = null,
            val spotPrice: String? = null,
            val targetCapacity: Int,
            val terminateInstancesWithExpiration: Boolean? = null,
            val type: String? = null,
            val validFrom: String? = null,
            val validUntil: String? = null
    )

    class SpotPlacement(
            val availabilityZone: String? = null,
            val groupName: String? = null
    )

}

fun Resources.awsEC2SpotFleet(logicalId: String, init: AWSEC2SpotFleet.() -> Unit = {}): AWSEC2SpotFleet {
    return AWSEC2SpotFleet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
