
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
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var imageId: Any? = null

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun imageId(value: String) {
          this.imageId = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid)
         *
         * _Required_: yes
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AssociationParameter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations-associationparameters.html#cfn-ec2-instance-ssmassociations-associationparameters-value)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val value: List<String>
    )

    class BlockDeviceMapping(
            /**
             * [DeviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-devicename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val deviceName: String,
            /**
             * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-ebs)
             *
             * _Required_: no
             *
             * _Type_: Ebs
             */
            val ebs: Ebs? = null,
            /**
             * [NoDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-nodevice)
             *
             * _Required_: no
             *
             * _Type_: NoDevice
             */
            val noDevice: NoDevice? = null,
            /**
             * [VirtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html#cfn-ec2-blockdev-mapping-virtualname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val virtualName: String? = null
    )

    class CreditSpecification(
            /**
             * [CPUCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cPUCredits: String? = null
    )

    class Ebs(
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-deleteontermination)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-encrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val encrypted: Boolean? = null,
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [SnapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-snapshotid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val snapshotId: String? = null,
            /**
             * [VolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumesize)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumeSize: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-template.html#cfn-ec2-blockdev-template-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

    class ElasticGpuSpecification(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class InstanceIpv6Address(
            /**
             * [Ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ipv6Address: String
    )

    class NetworkInterface(
            /**
             * [AssociatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val associatePublicIpAddress: Boolean? = null,
            /**
             * [DeleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteOnTermination: Boolean? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [DeviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val deviceIndex: String,
            /**
             * [GroupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val groupSet: List<String>? = null,
            /**
             * [Ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val ipv6AddressCount: Int? = null,
            /**
             * [Ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses)
             *
             * _Required_: no
             *
             * _Type_: List<InstanceIpv6Address>
             */
            val ipv6Addresses: List<InstanceIpv6Address>? = null,
            /**
             * [NetworkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val networkInterfaceId: String? = null,
            /**
             * [PrivateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val privateIpAddress: String? = null,
            /**
             * [PrivateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses)
             *
             * _Required_: no
             *
             * _Type_: List<PrivateIpAddressSpecification>
             */
            val privateIpAddresses: List<PrivateIpAddressSpecification>? = null,
            /**
             * [SecondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val secondaryPrivateIpAddressCount: Int? = null,
            /**
             * [SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subnetId: String? = null
    )

    class NoDevice(

    )

    class PrivateIpAddressSpecification(
            /**
             * [Primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val primary: Boolean,
            /**
             * [PrivateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val privateIpAddress: String
    )

    class SsmAssociation(
            /**
             * [AssociationParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-associationparameters)
             *
             * _Required_: no
             *
             * _Type_: List<AssociationParameter>
             */
            val associationParameters: List<AssociationParameter>? = null,
            /**
             * [DocumentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html#cfn-ec2-instance-ssmassociations-documentname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val documentName: String
    )

    class Volume(
            /**
             * [Device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val device: String,
            /**
             * [VolumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val volumeId: String
    )

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
