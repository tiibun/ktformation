
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 */
@CloudFormationMarker
class AWSEC2Instance(logicalId: String) : Resource<AWSEC2Instance.Properties>(logicalId, "AWS::EC2::Instance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var additionalInfo: Any? = null

        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun additionalInfo(value: String) {
          this.additionalInfo = value
        }
        
        /**
         * [additionalInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun additionalInfo(value: IntrinsicFunction) {
          this.additionalInfo = value
        }

        /**
         * [affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var affinity: Any? = null

        /**
         * [affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun affinity(value: String) {
          this.affinity = value
        }
        
        /**
         * [affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun affinity(value: IntrinsicFunction) {
          this.affinity = value
        }

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        @JvmField
        var blockDeviceMappings: Any? = null

        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(vararg value: IntrinsicFunction) {
          this.blockDeviceMappings = value
        }

        /**
         * [creditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-creditspecification)
         *
         * _Required_: no
         *
         * _Type_: CreditSpecification
         */
        @JvmField
        var creditSpecification: Any? = null

        /**
         * [creditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-creditspecification)
         *
         * _Required_: no
         *
         * _Type_: CreditSpecification
         */
        fun creditSpecification(value: CreditSpecification) {
          this.creditSpecification = value
        }
        
        /**
         * [creditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-creditspecification)
         *
         * _Required_: no
         *
         * _Type_: CreditSpecification
         */
        fun creditSpecification(value: IntrinsicFunction) {
          this.creditSpecification = value
        }

        /**
         * [disableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var disableApiTermination: Any? = null

        /**
         * [disableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableApiTermination(value: Boolean) {
          this.disableApiTermination = value
        }
        
        /**
         * [disableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableApiTermination(value: IntrinsicFunction) {
          this.disableApiTermination = value
        }

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: IntrinsicFunction) {
          this.ebsOptimized = value
        }

        /**
         * [elasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticGpuSpecification>
         */
        @JvmField
        var elasticGpuSpecifications: Any? = null

        /**
         * [elasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticGpuSpecification>
         */
        fun elasticGpuSpecifications(value: List<ElasticGpuSpecification>) {
          this.elasticGpuSpecifications = value
        }
        
        /**
         * [elasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticGpuSpecification>
         */
        fun elasticGpuSpecifications(vararg value: IntrinsicFunction) {
          this.elasticGpuSpecifications = value
        }

        /**
         * [hostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostId: Any? = null

        /**
         * [hostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostId(value: String) {
          this.hostId = value
        }
        
        /**
         * [hostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostId(value: IntrinsicFunction) {
          this.hostId = value
        }

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var iamInstanceProfile: Any? = null

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iamInstanceProfile(value: String) {
          this.iamInstanceProfile = value
        }
        
        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iamInstanceProfile(value: IntrinsicFunction) {
          this.iamInstanceProfile = value
        }

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var imageId: Any? = null

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun imageId(value: String) {
          this.imageId = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun imageId(value: IntrinsicFunction) {
          this.imageId = value
        }

        /**
         * [instanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceInitiatedShutdownBehavior: Any? = null

        /**
         * [instanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInitiatedShutdownBehavior(value: String) {
          this.instanceInitiatedShutdownBehavior = value
        }
        
        /**
         * [instanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInitiatedShutdownBehavior(value: IntrinsicFunction) {
          this.instanceInitiatedShutdownBehavior = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var ipv6AddressCount: Any? = null

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: Int) {
          this.ipv6AddressCount = value
        }
        
        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: IntrinsicFunction) {
          this.ipv6AddressCount = value
        }

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        @JvmField
        var ipv6Addresses: Any? = null

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        fun ipv6Addresses(value: List<InstanceIpv6Address>) {
          this.ipv6Addresses = value
        }
        
        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        fun ipv6Addresses(vararg value: IntrinsicFunction) {
          this.ipv6Addresses = value
        }

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kernelId: Any? = null

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: String) {
          this.kernelId = value
        }
        
        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: IntrinsicFunction) {
          this.kernelId = value
        }

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var keyName: Any? = null

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: String) {
          this.keyName = value
        }
        
        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: IntrinsicFunction) {
          this.keyName = value
        }

        /**
         * [launchTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-launchtemplate)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateSpecification
         */
        @JvmField
        var launchTemplate: Any? = null

        /**
         * [launchTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-launchtemplate)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateSpecification
         */
        fun launchTemplate(value: LaunchTemplateSpecification) {
          this.launchTemplate = value
        }
        
        /**
         * [launchTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-launchtemplate)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateSpecification
         */
        fun launchTemplate(value: IntrinsicFunction) {
          this.launchTemplate = value
        }

        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var monitoring: Any? = null

        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun monitoring(value: Boolean) {
          this.monitoring = value
        }
        
        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun monitoring(value: IntrinsicFunction) {
          this.monitoring = value
        }

        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<NetworkInterface>
         */
        @JvmField
        var networkInterfaces: Any? = null

        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<NetworkInterface>
         */
        fun networkInterfaces(value: List<NetworkInterface>) {
          this.networkInterfaces = value
        }
        
        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<NetworkInterface>
         */
        fun networkInterfaces(vararg value: IntrinsicFunction) {
          this.networkInterfaces = value
        }

        /**
         * [placementGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var placementGroupName: Any? = null

        /**
         * [placementGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun placementGroupName(value: String) {
          this.placementGroupName = value
        }
        
        /**
         * [placementGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun placementGroupName(value: IntrinsicFunction) {
          this.placementGroupName = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
        }

        /**
         * [ramdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ramdiskId: Any? = null

        /**
         * [ramdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramdiskId(value: String) {
          this.ramdiskId = value
        }
        
        /**
         * [ramdiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramdiskId(value: IntrinsicFunction) {
          this.ramdiskId = value
        }

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }

        /**
         * [sourceDestCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var sourceDestCheck: Any? = null

        /**
         * [sourceDestCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun sourceDestCheck(value: Boolean) {
          this.sourceDestCheck = value
        }
        
        /**
         * [sourceDestCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun sourceDestCheck(value: IntrinsicFunction) {
          this.sourceDestCheck = value
        }

        /**
         * [ssmAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations)
         *
         * _Required_: no
         *
         * _Type_: List<SsmAssociation>
         */
        @JvmField
        var ssmAssociations: Any? = null

        /**
         * [ssmAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations)
         *
         * _Required_: no
         *
         * _Type_: List<SsmAssociation>
         */
        fun ssmAssociations(value: List<SsmAssociation>) {
          this.ssmAssociations = value
        }
        
        /**
         * [ssmAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations)
         *
         * _Required_: no
         *
         * _Type_: List<SsmAssociation>
         */
        fun ssmAssociations(vararg value: IntrinsicFunction) {
          this.ssmAssociations = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var tenancy: Any? = null

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: String) {
          this.tenancy = value
        }
        
        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: IntrinsicFunction) {
          this.tenancy = value
        }

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var userData: Any? = null

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: String) {
          this.userData = value
        }
        
        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: IntrinsicFunction) {
          this.userData = value
        }

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volume>
         */
        @JvmField
        var volumes: Any? = null

        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volume>
         */
        fun volumes(value: List<Volume>) {
          this.volumes = value
        }
        
        /**
         * [volumes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes)
         *
         * _Required_: no
         *
         * _Type_: List<Volume>
         */
        fun volumes(vararg value: IntrinsicFunction) {
          this.volumes = value
        }

        /**
        * [AssociationParameter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html)
        */
        fun associationParameter(init: AssociationParameter.() -> Unit = {}): AssociationParameter {
            return AssociationParameter().also {
                it.init()
            }
        }
        /**
        * [BlockDeviceMapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html)
        */
        fun blockDeviceMapping(init: BlockDeviceMapping.() -> Unit = {}): BlockDeviceMapping {
            return BlockDeviceMapping().also {
                it.init()
            }
        }
        /**
        * [CreditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html)
        */
        fun creditSpecification(init: CreditSpecification.() -> Unit = {}): CreditSpecification {
            return CreditSpecification().also {
                it.init()
            }
        }
        /**
        * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html)
        */
        fun ebs(init: Ebs.() -> Unit = {}): Ebs {
            return Ebs().also {
                it.init()
            }
        }
        /**
        * [ElasticGpuSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html)
        */
        fun elasticGpuSpecification(init: ElasticGpuSpecification.() -> Unit = {}): ElasticGpuSpecification {
            return ElasticGpuSpecification().also {
                it.init()
            }
        }
        /**
        * [InstanceIpv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html)
        */
        fun instanceIpv6Address(init: InstanceIpv6Address.() -> Unit = {}): InstanceIpv6Address {
            return InstanceIpv6Address().also {
                it.init()
            }
        }
        /**
        * [LaunchTemplateSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html)
        */
        fun launchTemplateSpecification(init: LaunchTemplateSpecification.() -> Unit = {}): LaunchTemplateSpecification {
            return LaunchTemplateSpecification().also {
                it.init()
            }
        }
        /**
        * [NetworkInterface](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html)
        */
        fun networkInterface(init: NetworkInterface.() -> Unit = {}): NetworkInterface {
            return NetworkInterface().also {
                it.init()
            }
        }
        /**
        * [NoDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-nodevice.html)
        */
        fun noDevice(init: NoDevice.() -> Unit = {}): NoDevice {
            return NoDevice().also {
                it.init()
            }
        }
        /**
        * [PrivateIpAddressSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html)
        */
        fun privateIpAddressSpecification(init: PrivateIpAddressSpecification.() -> Unit = {}): PrivateIpAddressSpecification {
            return PrivateIpAddressSpecification().also {
                it.init()
            }
        }
        /**
        * [SsmAssociation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html)
        */
        fun ssmAssociation(init: SsmAssociation.() -> Unit = {}): SsmAssociation {
            return SsmAssociation().also {
                it.init()
            }
        }
        /**
        * [Volume](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html)
        */
        fun volume(init: Volume.() -> Unit = {}): Volume {
            return Volume().also {
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
    class AssociationParameter {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-value)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-value)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun value(value: List<String>) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-value)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun value(vararg value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class BlockDeviceMapping {
            /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-devicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var deviceName: Any? = null

        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-devicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceName(value: String) {
          this.deviceName = value
        }
        
        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-devicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceName(value: IntrinsicFunction) {
          this.deviceName = value
        }

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: Ebs
         */
        var ebs: Any? = null

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: Ebs
         */
        fun ebs(value: Ebs) {
          this.ebs = value
        }
        
        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: Ebs
         */
        fun ebs(value: IntrinsicFunction) {
          this.ebs = value
        }

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: NoDevice
         */
        var noDevice: Any? = null

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: NoDevice
         */
        fun noDevice(value: NoDevice) {
          this.noDevice = value
        }
        
        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: NoDevice
         */
        fun noDevice(value: IntrinsicFunction) {
          this.noDevice = value
        }

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var virtualName: Any? = null

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualName(value: String) {
          this.virtualName = value
        }
        
        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-virtualname)
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
    class CreditSpecification {
            /**
         * [cPUCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cPUCredits: Any? = null

        /**
         * [cPUCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cPUCredits(value: String) {
          this.cPUCredits = value
        }
        
        /**
         * [cPUCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cPUCredits(value: IntrinsicFunction) {
          this.cPUCredits = value
        }

    }

    @CloudFormationMarker
    class Ebs {
            /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var encrypted: Any? = null

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: IntrinsicFunction) {
          this.encrypted = value
        }

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var snapshotId: Any? = null

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: String) {
          this.snapshotId = value
        }
        
        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: IntrinsicFunction) {
          this.snapshotId = value
        }

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumeSize: Any? = null

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: Int) {
          this.volumeSize = value
        }
        
        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: IntrinsicFunction) {
          this.volumeSize = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype)
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
    class ElasticGpuSpecification {
            /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class InstanceIpv6Address {
            /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ipv6Address: Any? = null

        /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipv6Address(value: String) {
          this.ipv6Address = value
        }
        
        /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address)
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
    class LaunchTemplateSpecification {
            /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var launchTemplateId: Any? = null

        /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateId(value: String) {
          this.launchTemplateId = value
        }
        
        /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateId(value: IntrinsicFunction) {
          this.launchTemplateId = value
        }

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var launchTemplateName: Any? = null

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: String) {
          this.launchTemplateName = value
        }
        
        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: IntrinsicFunction) {
          this.launchTemplateName = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-version)
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
    class NetworkInterface {
            /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var associatePublicIpAddress: Any? = null

        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: Boolean) {
          this.associatePublicIpAddress = value
        }
        
        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: IntrinsicFunction) {
          this.associatePublicIpAddress = value
        }

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var deviceIndex: Any? = null

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceIndex(value: String) {
          this.deviceIndex = value
        }
        
        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceIndex(value: IntrinsicFunction) {
          this.deviceIndex = value
        }

        /**
         * [groupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var groupSet: Any? = null

        /**
         * [groupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groupSet(value: List<String>) {
          this.groupSet = value
        }
        
        /**
         * [groupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groupSet(vararg value: IntrinsicFunction) {
          this.groupSet = value
        }

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var ipv6AddressCount: Any? = null

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: Int) {
          this.ipv6AddressCount = value
        }
        
        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: IntrinsicFunction) {
          this.ipv6AddressCount = value
        }

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        var ipv6Addresses: Any? = null

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        fun ipv6Addresses(value: List<InstanceIpv6Address>) {
          this.ipv6Addresses = value
        }
        
        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<InstanceIpv6Address>
         */
        fun ipv6Addresses(vararg value: IntrinsicFunction) {
          this.ipv6Addresses = value
        }

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
        }

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        var privateIpAddresses: Any? = null

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        fun privateIpAddresses(value: List<PrivateIpAddressSpecification>) {
          this.privateIpAddresses = value
        }
        
        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        fun privateIpAddresses(vararg value: IntrinsicFunction) {
          this.privateIpAddresses = value
        }

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var secondaryPrivateIpAddressCount: Any? = null

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: Int) {
          this.secondaryPrivateIpAddressCount = value
        }
        
        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: IntrinsicFunction) {
          this.secondaryPrivateIpAddressCount = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid)
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
    class NoDevice {
    
    }

    @CloudFormationMarker
    class PrivateIpAddressSpecification {
            /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var primary: Any? = null

        /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun primary(value: Boolean) {
          this.primary = value
        }
        
        /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun primary(value: IntrinsicFunction) {
          this.primary = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress)
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
    class SsmAssociation {
            /**
         * [associationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters)
         *
         * _Required_: no
         *
         * _Type_: List<AssociationParameter>
         */
        var associationParameters: Any? = null

        /**
         * [associationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters)
         *
         * _Required_: no
         *
         * _Type_: List<AssociationParameter>
         */
        fun associationParameters(value: List<AssociationParameter>) {
          this.associationParameters = value
        }
        
        /**
         * [associationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters)
         *
         * _Required_: no
         *
         * _Type_: List<AssociationParameter>
         */
        fun associationParameters(vararg value: IntrinsicFunction) {
          this.associationParameters = value
        }

        /**
         * [documentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var documentName: Any? = null

        /**
         * [documentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun documentName(value: String) {
          this.documentName = value
        }
        
        /**
         * [documentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun documentName(value: IntrinsicFunction) {
          this.documentName = value
        }

    }

    @CloudFormationMarker
    class Volume {
            /**
         * [device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var device: Any? = null

        /**
         * [device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun device(value: String) {
          this.device = value
        }
        
        /**
         * [device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun device(value: IntrinsicFunction) {
          this.device = value
        }

        /**
         * [volumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var volumeId: Any? = null

        /**
         * [volumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeId(value: String) {
          this.volumeId = value
        }
        
        /**
         * [volumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeId(value: IntrinsicFunction) {
          this.volumeId = value
        }

    }

}

/**
 * [AWS::EC2::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 */
fun Resources.awsEC2Instance(logicalId: String, init: AWSEC2Instance.() -> Unit = {}): AWSEC2Instance {
    return AWSEC2Instance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
