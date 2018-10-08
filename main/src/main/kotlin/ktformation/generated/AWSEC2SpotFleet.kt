
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

        /**
        * [BlockDeviceMapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html)
        */
        fun blockDeviceMapping(init: BlockDeviceMapping.() -> Unit = {}): BlockDeviceMapping {
            return BlockDeviceMapping().also {
                it.init()
            }
        }
        /**
        * [ClassicLoadBalancer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html)
        */
        fun classicLoadBalancer(init: ClassicLoadBalancer.() -> Unit = {}): ClassicLoadBalancer {
            return ClassicLoadBalancer().also {
                it.init()
            }
        }
        /**
        * [ClassicLoadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html)
        */
        fun classicLoadBalancersConfig(init: ClassicLoadBalancersConfig.() -> Unit = {}): ClassicLoadBalancersConfig {
            return ClassicLoadBalancersConfig().also {
                it.init()
            }
        }
        /**
        * [EbsBlockDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html)
        */
        fun ebsBlockDevice(init: EbsBlockDevice.() -> Unit = {}): EbsBlockDevice {
            return EbsBlockDevice().also {
                it.init()
            }
        }
        /**
        * [FleetLaunchTemplateSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html)
        */
        fun fleetLaunchTemplateSpecification(init: FleetLaunchTemplateSpecification.() -> Unit = {}): FleetLaunchTemplateSpecification {
            return FleetLaunchTemplateSpecification().also {
                it.init()
            }
        }
        /**
        * [GroupIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html)
        */
        fun groupIdentifier(init: GroupIdentifier.() -> Unit = {}): GroupIdentifier {
            return GroupIdentifier().also {
                it.init()
            }
        }
        /**
        * [IamInstanceProfileSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html)
        */
        fun iamInstanceProfileSpecification(init: IamInstanceProfileSpecification.() -> Unit = {}): IamInstanceProfileSpecification {
            return IamInstanceProfileSpecification().also {
                it.init()
            }
        }
        /**
        * [InstanceIpv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html)
        */
        fun instanceIpv6Address(init: InstanceIpv6Address.() -> Unit = {}): InstanceIpv6Address {
            return InstanceIpv6Address().also {
                it.init()
            }
        }
        /**
        * [InstanceNetworkInterfaceSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html)
        */
        fun instanceNetworkInterfaceSpecification(init: InstanceNetworkInterfaceSpecification.() -> Unit = {}): InstanceNetworkInterfaceSpecification {
            return InstanceNetworkInterfaceSpecification().also {
                it.init()
            }
        }
        /**
        * [LaunchTemplateConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
        */
        fun launchTemplateConfig(init: LaunchTemplateConfig.() -> Unit = {}): LaunchTemplateConfig {
            return LaunchTemplateConfig().also {
                it.init()
            }
        }
        /**
        * [LaunchTemplateOverrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html)
        */
        fun launchTemplateOverrides(init: LaunchTemplateOverrides.() -> Unit = {}): LaunchTemplateOverrides {
            return LaunchTemplateOverrides().also {
                it.init()
            }
        }
        /**
        * [LoadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html)
        */
        fun loadBalancersConfig(init: LoadBalancersConfig.() -> Unit = {}): LoadBalancersConfig {
            return LoadBalancersConfig().also {
                it.init()
            }
        }
        /**
        * [PrivateIpAddressSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html)
        */
        fun privateIpAddressSpecification(init: PrivateIpAddressSpecification.() -> Unit = {}): PrivateIpAddressSpecification {
            return PrivateIpAddressSpecification().also {
                it.init()
            }
        }
        /**
        * [SpotFleetLaunchSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html)
        */
        fun spotFleetLaunchSpecification(init: SpotFleetLaunchSpecification.() -> Unit = {}): SpotFleetLaunchSpecification {
            return SpotFleetLaunchSpecification().also {
                it.init()
            }
        }
        /**
        * [SpotFleetMonitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html)
        */
        fun spotFleetMonitoring(init: SpotFleetMonitoring.() -> Unit = {}): SpotFleetMonitoring {
            return SpotFleetMonitoring().also {
                it.init()
            }
        }
        /**
        * [SpotFleetRequestConfigData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html)
        */
        fun spotFleetRequestConfigData(init: SpotFleetRequestConfigData.() -> Unit = {}): SpotFleetRequestConfigData {
            return SpotFleetRequestConfigData().also {
                it.init()
            }
        }
        /**
        * [SpotFleetTagSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html)
        */
        fun spotFleetTagSpecification(init: SpotFleetTagSpecification.() -> Unit = {}): SpotFleetTagSpecification {
            return SpotFleetTagSpecification().also {
                it.init()
            }
        }
        /**
        * [SpotPlacement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html)
        */
        fun spotPlacement(init: SpotPlacement.() -> Unit = {}): SpotPlacement {
            return SpotPlacement().also {
                it.init()
            }
        }
        /**
        * [TargetGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html)
        */
        fun targetGroup(init: TargetGroup.() -> Unit = {}): TargetGroup {
            return TargetGroup().also {
                it.init()
            }
        }
        /**
        * [TargetGroupsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html)
        */
        fun targetGroupsConfig(init: TargetGroupsConfig.() -> Unit = {}): TargetGroupsConfig {
            return TargetGroupsConfig().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class BlockDeviceMapping {
            /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-devicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var deviceName: Any? = null

        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-devicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceName(value: String) {
          this.deviceName = value
        }
        
        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-devicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceName(value: IntrinsicFunction) {
          this.deviceName = value
        }

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: EbsBlockDevice
         */
        var ebs: Any? = null

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: EbsBlockDevice
         */
        fun ebs(value: EbsBlockDevice) {
          this.ebs = value
        }
        
        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: EbsBlockDevice
         */
        fun ebs(value: IntrinsicFunction) {
          this.ebs = value
        }

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var noDevice: Any? = null

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noDevice(value: String) {
          this.noDevice = value
        }
        
        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noDevice(value: IntrinsicFunction) {
          this.noDevice = value
        }

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var virtualName: Any? = null

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualName(value: String) {
          this.virtualName = value
        }
        
        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings.html#cfn-ec2-spotfleet-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualName(value: IntrinsicFunction) {
          this.virtualName = value
        }

    }

    @CloudFormationMarker
    class ClassicLoadBalancer {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html#cfn-ec2-spotfleet-classicloadbalancer-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html#cfn-ec2-spotfleet-classicloadbalancer-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html#cfn-ec2-spotfleet-classicloadbalancer-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class ClassicLoadBalancersConfig {
            /**
         * [classicLoadBalancers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers)
         *
         * _Required_: yes
         *
         * _Type_: List<ClassicLoadBalancer>
         */
        var classicLoadBalancers: Any? = null

        /**
         * [classicLoadBalancers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers)
         *
         * _Required_: yes
         *
         * _Type_: List<ClassicLoadBalancer>
         */
        fun classicLoadBalancers(value: List<ClassicLoadBalancer>) {
          this.classicLoadBalancers = value
        }
        
        /**
         * [classicLoadBalancers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers)
         *
         * _Required_: yes
         *
         * _Type_: List<ClassicLoadBalancer>
         */
        fun classicLoadBalancers(vararg value: IntrinsicFunction) {
          this.classicLoadBalancers = value
        }

    }

    @CloudFormationMarker
    class EbsBlockDevice {
            /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var encrypted: Any? = null

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: IntrinsicFunction) {
          this.encrypted = value
        }

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var snapshotId: Any? = null

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: String) {
          this.snapshotId = value
        }
        
        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: IntrinsicFunction) {
          this.snapshotId = value
        }

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumeSize: Any? = null

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: Int) {
          this.volumeSize = value
        }
        
        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: IntrinsicFunction) {
          this.volumeSize = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-blockdevicemappings-ebs.html#cfn-ec2-spotfleet-ebsblockdevice-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: IntrinsicFunction) {
          this.volumeType = value
        }

    }

    @CloudFormationMarker
    class FleetLaunchTemplateSpecification {
            /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var launchTemplateId: Any? = null

        /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateId(value: String) {
          this.launchTemplateId = value
        }
        
        /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateId(value: IntrinsicFunction) {
          this.launchTemplateId = value
        }

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var launchTemplateName: Any? = null

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: String) {
          this.launchTemplateName = value
        }
        
        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: IntrinsicFunction) {
          this.launchTemplateName = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

    @CloudFormationMarker
    class GroupIdentifier {
            /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var groupId: Any? = null

        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupId(value: String) {
          this.groupId = value
        }
        
        /**
         * [groupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-securitygroups.html#cfn-ec2-spotfleet-groupidentifier-groupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupId(value: IntrinsicFunction) {
          this.groupId = value
        }

    }

    @CloudFormationMarker
    class IamInstanceProfileSpecification {
            /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var arn: Any? = null

        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun arn(value: String) {
          this.arn = value
        }
        
        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun arn(value: IntrinsicFunction) {
          this.arn = value
        }

    }

    @CloudFormationMarker
    class InstanceIpv6Address {
            /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html#cfn-ec2-spotfleet-instanceipv6address-ipv6address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ipv6Address: Any? = null

        /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html#cfn-ec2-spotfleet-instanceipv6address-ipv6address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipv6Address(value: String) {
          this.ipv6Address = value
        }
        
        /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html#cfn-ec2-spotfleet-instanceipv6address-ipv6address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipv6Address(value: IntrinsicFunction) {
          this.ipv6Address = value
        }

    }

    @CloudFormationMarker
    class InstanceNetworkInterfaceSpecification {
            /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-associatepublicipaddress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var associatePublicIpAddress: Any? = null

        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-associatepublicipaddress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: Boolean) {
          this.associatePublicIpAddress = value
        }
        
        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-associatepublicipaddress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: IntrinsicFunction) {
          this.associatePublicIpAddress = value
        }

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deviceindex)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var deviceIndex: Any? = null

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deviceindex)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun deviceIndex(value: Int) {
          this.deviceIndex = value
        }
        
        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deviceindex)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun deviceIndex(value: IntrinsicFunction) {
          this.deviceIndex = value
        }

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var groups: Any? = null

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(value: List<String>) {
          this.groups = value
        }
        
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var ipv6AddressCount: Any? = null

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: Int) {
          this.ipv6AddressCount = value
        }
        
        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: IntrinsicFunction) {
          this.ipv6AddressCount = value
        }

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        var ipv6Addresses: Any? = null

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        fun ipv6Addresses(value: List<InstanceIpv6Address>) {
          this.ipv6Addresses = value
        }
        
        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        fun ipv6Addresses(vararg value: IntrinsicFunction) {
          this.ipv6Addresses = value
        }

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        var privateIpAddresses: Any? = null

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        fun privateIpAddresses(value: List<PrivateIpAddressSpecification>) {
          this.privateIpAddresses = value
        }
        
        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        fun privateIpAddresses(vararg value: IntrinsicFunction) {
          this.privateIpAddresses = value
        }

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-secondaryprivateipaddresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var secondaryPrivateIpAddressCount: Any? = null

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-secondaryprivateipaddresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: Int) {
          this.secondaryPrivateIpAddressCount = value
        }
        
        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-secondaryprivateipaddresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: IntrinsicFunction) {
          this.secondaryPrivateIpAddressCount = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }

    }

    @CloudFormationMarker
    class LaunchTemplateConfig {
            /**
         * [launchTemplateSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-launchtemplatespecification)
         *
         * _Required_: no
         *
         * _Type_: FleetLaunchTemplateSpecification
         */
        var launchTemplateSpecification: Any? = null

        /**
         * [launchTemplateSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-launchtemplatespecification)
         *
         * _Required_: no
         *
         * _Type_: FleetLaunchTemplateSpecification
         */
        fun launchTemplateSpecification(value: FleetLaunchTemplateSpecification) {
          this.launchTemplateSpecification = value
        }
        
        /**
         * [launchTemplateSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-launchtemplatespecification)
         *
         * _Required_: no
         *
         * _Type_: FleetLaunchTemplateSpecification
         */
        fun launchTemplateSpecification(value: IntrinsicFunction) {
          this.launchTemplateSpecification = value
        }

        /**
         * [overrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides)
         *
         * _Required_: no
         *
         * _Type_: List<LaunchTemplateOverrides>
         */
        var overrides: Any? = null

        /**
         * [overrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides)
         *
         * _Required_: no
         *
         * _Type_: List<LaunchTemplateOverrides>
         */
        fun overrides(value: List<LaunchTemplateOverrides>) {
          this.overrides = value
        }
        
        /**
         * [overrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides)
         *
         * _Required_: no
         *
         * _Type_: List<LaunchTemplateOverrides>
         */
        fun overrides(vararg value: IntrinsicFunction) {
          this.overrides = value
        }

    }

    @CloudFormationMarker
    class LaunchTemplateOverrides {
            /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var spotPrice: Any? = null

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: String) {
          this.spotPrice = value
        }
        
        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: IntrinsicFunction) {
          this.spotPrice = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var weightedCapacity: Any? = null

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun weightedCapacity(value: Double) {
          this.weightedCapacity = value
        }
        
        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun weightedCapacity(value: IntrinsicFunction) {
          this.weightedCapacity = value
        }

    }

    @CloudFormationMarker
    class LoadBalancersConfig {
            /**
         * [classicLoadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-classicloadbalancersconfig)
         *
         * _Required_: no
         *
         * _Type_: ClassicLoadBalancersConfig
         */
        var classicLoadBalancersConfig: Any? = null

        /**
         * [classicLoadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-classicloadbalancersconfig)
         *
         * _Required_: no
         *
         * _Type_: ClassicLoadBalancersConfig
         */
        fun classicLoadBalancersConfig(value: ClassicLoadBalancersConfig) {
          this.classicLoadBalancersConfig = value
        }
        
        /**
         * [classicLoadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-classicloadbalancersconfig)
         *
         * _Required_: no
         *
         * _Type_: ClassicLoadBalancersConfig
         */
        fun classicLoadBalancersConfig(value: IntrinsicFunction) {
          this.classicLoadBalancersConfig = value
        }

        /**
         * [targetGroupsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-targetgroupsconfig)
         *
         * _Required_: no
         *
         * _Type_: TargetGroupsConfig
         */
        var targetGroupsConfig: Any? = null

        /**
         * [targetGroupsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-targetgroupsconfig)
         *
         * _Required_: no
         *
         * _Type_: TargetGroupsConfig
         */
        fun targetGroupsConfig(value: TargetGroupsConfig) {
          this.targetGroupsConfig = value
        }
        
        /**
         * [targetGroupsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-targetgroupsconfig)
         *
         * _Required_: no
         *
         * _Type_: TargetGroupsConfig
         */
        fun targetGroupsConfig(value: IntrinsicFunction) {
          this.targetGroupsConfig = value
        }

    }

    @CloudFormationMarker
    class PrivateIpAddressSpecification {
            /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var primary: Any? = null

        /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun primary(value: Boolean) {
          this.primary = value
        }
        
        /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun primary(value: IntrinsicFunction) {
          this.primary = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
        }

    }

    @CloudFormationMarker
    class SpotFleetLaunchSpecification {
            /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        var blockDeviceMappings: Any? = null

        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(vararg value: IntrinsicFunction) {
          this.blockDeviceMappings = value
        }

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: IntrinsicFunction) {
          this.ebsOptimized = value
        }

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: IamInstanceProfileSpecification
         */
        var iamInstanceProfile: Any? = null

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: IamInstanceProfileSpecification
         */
        fun iamInstanceProfile(value: IamInstanceProfileSpecification) {
          this.iamInstanceProfile = value
        }
        
        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: IamInstanceProfileSpecification
         */
        fun iamInstanceProfile(value: IntrinsicFunction) {
          this.iamInstanceProfile = value
        }

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var imageId: Any? = null

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun imageId(value: String) {
          this.imageId = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun imageId(value: IntrinsicFunction) {
          this.imageId = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var kernelId: Any? = null

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: String) {
          this.kernelId = value
        }
        
        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: IntrinsicFunction) {
          this.kernelId = value
        }

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var keyName: Any? = null

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: String) {
          this.keyName = value
        }
        
        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: IntrinsicFunction) {
          this.keyName = value
        }

        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-monitoring)
         *
         * _Required_: no
         *
         * _Type_: SpotFleetMonitoring
         */
        var monitoring: Any? = null

        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-monitoring)
         *
         * _Required_: no
         *
         * _Type_: SpotFleetMonitoring
         */
        fun monitoring(value: SpotFleetMonitoring) {
          this.monitoring = value
        }
        
        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-monitoring)
         *
         * _Required_: no
         *
         * _Type_: SpotFleetMonitoring
         */
        fun monitoring(value: IntrinsicFunction) {
          this.monitoring = value
        }

        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceNetworkInterfaceSpecification>
         */
        var networkInterfaces: Any? = null

        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceNetworkInterfaceSpecification>
         */
        fun networkInterfaces(value: List<InstanceNetworkInterfaceSpecification>) {
          this.networkInterfaces = value
        }
        
        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceNetworkInterfaceSpecification>
         */
        fun networkInterfaces(vararg value: IntrinsicFunction) {
          this.networkInterfaces = value
        }

        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-placement)
         *
         * _Required_: no
         *
         * _Type_: SpotPlacement
         */
        var placement: Any? = null

        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-placement)
         *
         * _Required_: no
         *
         * _Type_: SpotPlacement
         */
        fun placement(value: SpotPlacement) {
          this.placement = value
        }
        
        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-placement)
         *
         * _Required_: no
         *
         * _Type_: SpotPlacement
         */
        fun placement(value: IntrinsicFunction) {
          this.placement = value
        }

        /**
         * [ramdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ramdiskId: Any? = null

        /**
         * [ramdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramdiskId(value: String) {
          this.ramdiskId = value
        }
        
        /**
         * [ramdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramdiskId(value: IntrinsicFunction) {
          this.ramdiskId = value
        }

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<GroupIdentifier>
         */
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<GroupIdentifier>
         */
        fun securityGroups(value: List<GroupIdentifier>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<GroupIdentifier>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var spotPrice: Any? = null

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: String) {
          this.spotPrice = value
        }
        
        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: IntrinsicFunction) {
          this.spotPrice = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }

        /**
         * [tagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<SpotFleetTagSpecification>
         */
        var tagSpecifications: Any? = null

        /**
         * [tagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<SpotFleetTagSpecification>
         */
        fun tagSpecifications(value: List<SpotFleetTagSpecification>) {
          this.tagSpecifications = value
        }
        
        /**
         * [tagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<SpotFleetTagSpecification>
         */
        fun tagSpecifications(vararg value: IntrinsicFunction) {
          this.tagSpecifications = value
        }

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var userData: Any? = null

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: String) {
          this.userData = value
        }
        
        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: IntrinsicFunction) {
          this.userData = value
        }

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var weightedCapacity: Any? = null

        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun weightedCapacity(value: Double) {
          this.weightedCapacity = value
        }
        
        /**
         * [weightedCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun weightedCapacity(value: IntrinsicFunction) {
          this.weightedCapacity = value
        }

    }

    @CloudFormationMarker
    class SpotFleetMonitoring {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

    }

    @CloudFormationMarker
    class SpotFleetRequestConfigData {
            /**
         * [allocationStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var allocationStrategy: Any? = null

        /**
         * [allocationStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allocationStrategy(value: String) {
          this.allocationStrategy = value
        }
        
        /**
         * [allocationStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allocationStrategy(value: IntrinsicFunction) {
          this.allocationStrategy = value
        }

        /**
         * [excessCapacityTerminationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var excessCapacityTerminationPolicy: Any? = null

        /**
         * [excessCapacityTerminationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun excessCapacityTerminationPolicy(value: String) {
          this.excessCapacityTerminationPolicy = value
        }
        
        /**
         * [excessCapacityTerminationPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun excessCapacityTerminationPolicy(value: IntrinsicFunction) {
          this.excessCapacityTerminationPolicy = value
        }

        /**
         * [iamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var iamFleetRole: Any? = null

        /**
         * [iamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iamFleetRole(value: String) {
          this.iamFleetRole = value
        }
        
        /**
         * [iamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iamFleetRole(value: IntrinsicFunction) {
          this.iamFleetRole = value
        }

        /**
         * [instanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceInterruptionBehavior: Any? = null

        /**
         * [instanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInterruptionBehavior(value: String) {
          this.instanceInterruptionBehavior = value
        }
        
        /**
         * [instanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInterruptionBehavior(value: IntrinsicFunction) {
          this.instanceInterruptionBehavior = value
        }

        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<SpotFleetLaunchSpecification>
         */
        var launchSpecifications: Any? = null

        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<SpotFleetLaunchSpecification>
         */
        fun launchSpecifications(value: List<SpotFleetLaunchSpecification>) {
          this.launchSpecifications = value
        }
        
        /**
         * [launchSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<SpotFleetLaunchSpecification>
         */
        fun launchSpecifications(vararg value: IntrinsicFunction) {
          this.launchSpecifications = value
        }

        /**
         * [launchTemplateConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<LaunchTemplateConfig>
         */
        var launchTemplateConfigs: Any? = null

        /**
         * [launchTemplateConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<LaunchTemplateConfig>
         */
        fun launchTemplateConfigs(value: List<LaunchTemplateConfig>) {
          this.launchTemplateConfigs = value
        }
        
        /**
         * [launchTemplateConfigs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs)
         *
         * _Required_: no
         *
         * _Type_: List<LaunchTemplateConfig>
         */
        fun launchTemplateConfigs(vararg value: IntrinsicFunction) {
          this.launchTemplateConfigs = value
        }

        /**
         * [loadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-loadbalancersconfig)
         *
         * _Required_: no
         *
         * _Type_: LoadBalancersConfig
         */
        var loadBalancersConfig: Any? = null

        /**
         * [loadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-loadbalancersconfig)
         *
         * _Required_: no
         *
         * _Type_: LoadBalancersConfig
         */
        fun loadBalancersConfig(value: LoadBalancersConfig) {
          this.loadBalancersConfig = value
        }
        
        /**
         * [loadBalancersConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-loadbalancersconfig)
         *
         * _Required_: no
         *
         * _Type_: LoadBalancersConfig
         */
        fun loadBalancersConfig(value: IntrinsicFunction) {
          this.loadBalancersConfig = value
        }

        /**
         * [replaceUnhealthyInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var replaceUnhealthyInstances: Any? = null

        /**
         * [replaceUnhealthyInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun replaceUnhealthyInstances(value: Boolean) {
          this.replaceUnhealthyInstances = value
        }
        
        /**
         * [replaceUnhealthyInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun replaceUnhealthyInstances(value: IntrinsicFunction) {
          this.replaceUnhealthyInstances = value
        }

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var spotPrice: Any? = null

        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: String) {
          this.spotPrice = value
        }
        
        /**
         * [spotPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotPrice(value: IntrinsicFunction) {
          this.spotPrice = value
        }

        /**
         * [targetCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var targetCapacity: Any? = null

        /**
         * [targetCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun targetCapacity(value: Int) {
          this.targetCapacity = value
        }
        
        /**
         * [targetCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun targetCapacity(value: IntrinsicFunction) {
          this.targetCapacity = value
        }

        /**
         * [terminateInstancesWithExpiration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var terminateInstancesWithExpiration: Any? = null

        /**
         * [terminateInstancesWithExpiration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun terminateInstancesWithExpiration(value: Boolean) {
          this.terminateInstancesWithExpiration = value
        }
        
        /**
         * [terminateInstancesWithExpiration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun terminateInstancesWithExpiration(value: IntrinsicFunction) {
          this.terminateInstancesWithExpiration = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [validFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var validFrom: Any? = null

        /**
         * [validFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun validFrom(value: String) {
          this.validFrom = value
        }
        
        /**
         * [validFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun validFrom(value: IntrinsicFunction) {
          this.validFrom = value
        }

        /**
         * [validUntil](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var validUntil: Any? = null

        /**
         * [validUntil](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun validUntil(value: String) {
          this.validUntil = value
        }
        
        /**
         * [validUntil](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun validUntil(value: IntrinsicFunction) {
          this.validUntil = value
        }

    }

    @CloudFormationMarker
    class SpotFleetTagSpecification {
            /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceType: Any? = null

        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceType(value: String) {
          this.resourceType = value
        }
        
        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-tagspecifications.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceType(value: IntrinsicFunction) {
          this.resourceType = value
        }

    }

    @CloudFormationMarker
    class SpotPlacement {
            /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tenancy: Any? = null

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: String) {
          this.tenancy = value
        }
        
        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html#cfn-ec2-spotfleet-spotplacement-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: IntrinsicFunction) {
          this.tenancy = value
        }

    }

    @CloudFormationMarker
    class TargetGroup {
            /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html#cfn-ec2-spotfleet-targetgroup-arn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var arn: Any? = null

        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html#cfn-ec2-spotfleet-targetgroup-arn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun arn(value: String) {
          this.arn = value
        }
        
        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html#cfn-ec2-spotfleet-targetgroup-arn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun arn(value: IntrinsicFunction) {
          this.arn = value
        }

    }

    @CloudFormationMarker
    class TargetGroupsConfig {
            /**
         * [targetGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups)
         *
         * _Required_: yes
         *
         * _Type_: List<TargetGroup>
         */
        var targetGroups: Any? = null

        /**
         * [targetGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups)
         *
         * _Required_: yes
         *
         * _Type_: List<TargetGroup>
         */
        fun targetGroups(value: List<TargetGroup>) {
          this.targetGroups = value
        }
        
        /**
         * [targetGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups)
         *
         * _Required_: yes
         *
         * _Type_: List<TargetGroup>
         */
        fun targetGroups(vararg value: IntrinsicFunction) {
          this.targetGroups = value
        }

    }

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
