
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::LaunchTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 */
@CloudFormationMarker
class AWSEC2LaunchTemplate(logicalId: String) : Resource<AWSEC2LaunchTemplate.Properties>(logicalId, "AWS::EC2::LaunchTemplate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [launchTemplateData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateData
         */
        @JvmField
        var launchTemplateData: Any? = null

        /**
         * [launchTemplateData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateData
         */
        fun launchTemplateData(value: LaunchTemplateData) {
          this.launchTemplateData = value
        }
        
        /**
         * [launchTemplateData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateData
         */
        fun launchTemplateData(value: IntrinsicFunction) {
          this.launchTemplateData = value
        }
        
        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var launchTemplateName: Any? = null

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: String) {
          this.launchTemplateName = value
        }
        
        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: IntrinsicFunction) {
          this.launchTemplateName = value
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
             * [DeviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-devicename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val deviceName: String? = null,
            /**
             * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs)
             *
             * _Required_: no
             *
             * _Type_: Ebs
             */
            val ebs: Ebs? = null,
            /**
             * [NoDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-nodevice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val noDevice: String? = null,
            /**
             * [VirtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-virtualname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val virtualName: String? = null
    )

    class CreditSpecification(
            /**
             * [CpuCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cpuCredits: String? = null
    )

    class Ebs(
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-deleteontermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-encrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val encrypted: Boolean? = null,
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [KmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-kmskeyid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val kmsKeyId: String? = null,
            /**
             * [SnapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-snapshotid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val snapshotId: String? = null,
            /**
             * [VolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumesize)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumeSize: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

    class ElasticGpuSpecification(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html#cfn-ec2-launchtemplate-elasticgpuspecification-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null
    )

    class IamInstanceProfile(
            /**
             * [Arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val arn: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class InstanceMarketOptions(
            /**
             * [MarketType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val marketType: String? = null,
            /**
             * [SpotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions)
             *
             * _Required_: no
             *
             * _Type_: SpotOptions
             */
            val spotOptions: SpotOptions? = null
    )

    class Ipv6Add(
            /**
             * [Ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ipv6Address: String? = null
    )

    class LaunchTemplateData(
            /**
             * [BlockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings)
             *
             * _Required_: no
             *
             * _Type_: List<BlockDeviceMapping>
             */
            val blockDeviceMappings: List<BlockDeviceMapping>? = null,
            /**
             * [CreditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification)
             *
             * _Required_: no
             *
             * _Type_: CreditSpecification
             */
            val creditSpecification: CreditSpecification? = null,
            /**
             * [DisableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val disableApiTermination: Boolean? = null,
            /**
             * [EbsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val ebsOptimized: Boolean? = null,
            /**
             * [ElasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications)
             *
             * _Required_: no
             *
             * _Type_: List<ElasticGpuSpecification>
             */
            val elasticGpuSpecifications: List<ElasticGpuSpecification>? = null,
            /**
             * [IamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile)
             *
             * _Required_: no
             *
             * _Type_: IamInstanceProfile
             */
            val iamInstanceProfile: IamInstanceProfile? = null,
            /**
             * [ImageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val imageId: String? = null,
            /**
             * [InstanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val instanceInitiatedShutdownBehavior: String? = null,
            /**
             * [InstanceMarketOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions)
             *
             * _Required_: no
             *
             * _Type_: InstanceMarketOptions
             */
            val instanceMarketOptions: InstanceMarketOptions? = null,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val instanceType: String? = null,
            /**
             * [KernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val kernelId: String? = null,
            /**
             * [KeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val keyName: String? = null,
            /**
             * [Monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring)
             *
             * _Required_: no
             *
             * _Type_: Monitoring
             */
            val monitoring: Monitoring? = null,
            /**
             * [NetworkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces)
             *
             * _Required_: no
             *
             * _Type_: List<NetworkInterface>
             */
            val networkInterfaces: List<NetworkInterface>? = null,
            /**
             * [Placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-placement)
             *
             * _Required_: no
             *
             * _Type_: Placement
             */
            val placement: Placement? = null,
            /**
             * [RamDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ramDiskId: String? = null,
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>? = null,
            /**
             * [SecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val securityGroups: List<String>? = null,
            /**
             * [TagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
             *
             * _Required_: no
             *
             * _Type_: List<TagSpecification>
             */
            val tagSpecifications: List<TagSpecification>? = null,
            /**
             * [UserData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val userData: String? = null
    )

    class Monitoring(
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null
    )

    class NetworkInterface(
            /**
             * [AssociatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatepublicipaddress)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val associatePublicIpAddress: Boolean? = null,
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deleteontermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [DeviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deviceindex)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val deviceIndex: Int? = null,
            /**
             * [Groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-groups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val groups: List<String>? = null,
            /**
             * [Ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresscount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val ipv6AddressCount: Int? = null,
            /**
             * [Ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresses)
             *
             * _Required_: no
             *
             * _Type_: List<Ipv6Add>
             */
            val ipv6Addresses: List<Ipv6Add>? = null,
            /**
             * [NetworkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkinterfaceid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val networkInterfaceId: String? = null,
            /**
             * [PrivateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddress)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val privateIpAddress: String? = null,
            /**
             * [PrivateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddresses)
             *
             * _Required_: no
             *
             * _Type_: List<PrivateIpAdd>
             */
            val privateIpAddresses: List<PrivateIpAdd>? = null,
            /**
             * [SecondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-secondaryprivateipaddresscount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val secondaryPrivateIpAddressCount: Int? = null,
            /**
             * [SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-subnetid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subnetId: String? = null
    )

    class Placement(
            /**
             * [Affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val affinity: String? = null,
            /**
             * [AvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val availabilityZone: String? = null,
            /**
             * [GroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val groupName: String? = null,
            /**
             * [HostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hostId: String? = null,
            /**
             * [Tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tenancy: String? = null
    )

    class PrivateIpAdd(
            /**
             * [Primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val primary: Boolean? = null,
            /**
             * [PrivateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val privateIpAddress: String? = null
    )

    class SpotOptions(
            /**
             * [InstanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val instanceInterruptionBehavior: String? = null,
            /**
             * [MaxPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val maxPrice: String? = null,
            /**
             * [SpotInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val spotInstanceType: String? = null
    )

    class TagSpecification(
            /**
             * [ResourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceType: String? = null,
            /**
             * [Tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags)
             *
             * _Required_: no
             *
             * _Type_: List<Tag>
             */
            val tags: List<Tag>? = null
    )

}

/**
 * [AWS::EC2::LaunchTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 */
fun Resources.awsEC2LaunchTemplate(logicalId: String, init: AWSEC2LaunchTemplate.() -> Unit = {}): AWSEC2LaunchTemplate {
    return AWSEC2LaunchTemplate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
