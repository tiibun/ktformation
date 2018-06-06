
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SpotFleet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
 */
@CloudFormationMarker
class AWSEC2SpotFleet(logicalId: String) : Resource<AWSEC2SpotFleet.Properties>(logicalId, "AWS::EC2::SpotFleet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [spotFleetRequestConfigData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
         *
         * _Required_: yes
         *
         * _Type_: SpotFleetRequestConfigData
         */
        @JvmField
        var spotFleetRequestConfigData: Any? = null

        /**
         * [spotFleetRequestConfigData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
         *
         * _Required_: yes
         *
         * _Type_: SpotFleetRequestConfigData
         */
        fun spotFleetRequestConfigData(value: SpotFleetRequestConfigData) {
          this.spotFleetRequestConfigData = value
        }
        
        /**
         * [spotFleetRequestConfigData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
         *
         * _Required_: yes
         *
         * _Type_: SpotFleetRequestConfigData
         */
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
            /**
             * [DeviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-devicename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val deviceName: String,
            /**
             * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-ebs)
             *
             * _Required_: no
             *
             * _Type_: EbsBlockDevice
             */
            val ebs: EbsBlockDevice? = null,
            /**
             * [NoDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-nodevice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val noDevice: String? = null,
            /**
             * [VirtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-virtualname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val virtualName: String? = null
    )

    class EbsBlockDevice(
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-deleteontermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-encrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val encrypted: Boolean? = null,
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SnapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-snapshotid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val snapshotId: String? = null,
            /**
             * [VolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumesize)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumeSize: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

    class GroupIdentifier(
            /**
             * [GroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val groupId: String
    )

    class IamInstanceProfileSpecification(
            /**
             * [Arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val arn: String? = null
    )

    class InstanceIpv6Address(
            /**
             * [Ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html#cfn-ec2-spotfleet-instanceipv6address-ipv6address)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ipv6Address: String
    )

    class InstanceNetworkInterfaceSpecification(
            /**
             * [AssociatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-associatepublicipaddress)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val associatePublicIpAddress: Boolean? = null,
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deleteontermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [DeviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deviceindex)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val deviceIndex: Int? = null,
            /**
             * [Groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-groups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val groups: List<String>? = null,
            /**
             * [Ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresscount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val ipv6AddressCount: Int? = null,
            /**
             * [Ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresses)
             *
             * _Required_: no
             *
             * _Type_: List<InstanceIpv6Address>
             */
            val ipv6Addresses: List<InstanceIpv6Address>? = null,
            /**
             * [NetworkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-networkinterfaceid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val networkInterfaceId: String? = null,
            /**
             * [PrivateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-privateipaddresses)
             *
             * _Required_: no
             *
             * _Type_: List<PrivateIpAddressSpecification>
             */
            val privateIpAddresses: List<PrivateIpAddressSpecification>? = null,
            /**
             * [SecondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-secondaryprivateipaddresscount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val secondaryPrivateIpAddressCount: Int? = null,
            /**
             * [SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-subnetid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subnetId: String? = null
    )

    class PrivateIpAddressSpecification(
            /**
             * [Primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val primary: Boolean? = null,
            /**
             * [PrivateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val privateIpAddress: String
    )

    class SpotFleetLaunchSpecification(
            /**
             * [BlockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings)
             *
             * _Required_: no
             *
             * _Type_: List<BlockDeviceMapping>
             */
            val blockDeviceMappings: List<BlockDeviceMapping>? = null,
            /**
             * [EbsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ebsOptimized: Boolean? = null,
            /**
             * [IamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-iaminstanceprofile)
             *
             * _Required_: no
             *
             * _Type_: IamInstanceProfileSpecification
             */
            val iamInstanceProfile: IamInstanceProfileSpecification? = null,
            /**
             * [ImageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val imageId: String,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instanceType: String,
            /**
             * [KernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val kernelId: String? = null,
            /**
             * [KeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val keyName: String? = null,
            /**
             * [Monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-monitoring)
             *
             * _Required_: no
             *
             * _Type_: SpotFleetMonitoring
             */
            val monitoring: SpotFleetMonitoring? = null,
            /**
             * [NetworkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces)
             *
             * _Required_: no
             *
             * _Type_: List<InstanceNetworkInterfaceSpecification>
             */
            val networkInterfaces: List<InstanceNetworkInterfaceSpecification>? = null,
            /**
             * [Placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-placement)
             *
             * _Required_: no
             *
             * _Type_: SpotPlacement
             */
            val placement: SpotPlacement? = null,
            /**
             * [RamdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ramdiskId: String? = null,
            /**
             * [SecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups)
             *
             * _Required_: no
             *
             * _Type_: List<GroupIdentifier>
             */
            val securityGroups: List<GroupIdentifier>? = null,
            /**
             * [SpotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val spotPrice: String? = null,
            /**
             * [SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subnetId: String? = null,
            /**
             * [TagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications)
             *
             * _Required_: no
             *
             * _Type_: List<SpotFleetTagSpecification>
             */
            val tagSpecifications: List<SpotFleetTagSpecification>? = null,
            /**
             * [UserData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val userData: String? = null,
            /**
             * [WeightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val weightedCapacity: Double? = null
    )

    class SpotFleetMonitoring(
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null
    )

    class SpotFleetRequestConfigData(
            /**
             * [AllocationStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val allocationStrategy: String? = null,
            /**
             * [ExcessCapacityTerminationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val excessCapacityTerminationPolicy: String? = null,
            /**
             * [IamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val iamFleetRole: String,
            /**
             * [LaunchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications)
             *
             * _Required_: no
             *
             * _Type_: List<SpotFleetLaunchSpecification>
             */
            val launchSpecifications: List<SpotFleetLaunchSpecification>? = null,
            /**
             * [ReplaceUnhealthyInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val replaceUnhealthyInstances: Boolean? = null,
            /**
             * [SpotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val spotPrice: String? = null,
            /**
             * [TargetCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val targetCapacity: Int,
            /**
             * [TerminateInstancesWithExpiration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val terminateInstancesWithExpiration: Boolean? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [ValidFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val validFrom: String? = null,
            /**
             * [ValidUntil](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val validUntil: String? = null
    )

    class SpotFleetTagSpecification(
            /**
             * [ResourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceType: String? = null
    )

    class SpotPlacement(
            /**
             * [AvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-availabilityzone)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val availabilityZone: String? = null,
            /**
             * [GroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-groupname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val groupName: String? = null
    )

}

/**
 * [AWS::EC2::SpotFleet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
 */
fun Resources.awsEC2SpotFleet(logicalId: String, init: AWSEC2SpotFleet.() -> Unit = {}): AWSEC2SpotFleet {
    return AWSEC2SpotFleet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
