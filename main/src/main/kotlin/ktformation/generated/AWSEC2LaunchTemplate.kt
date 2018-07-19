
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

        /**
        * [BlockDeviceMapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html)
        */
        fun blockDeviceMapping(init: BlockDeviceMapping.() -> Unit = {}): BlockDeviceMapping {
            return BlockDeviceMapping().also {
                it.init()
            }
        }
        /**
        * [CreditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html)
        */
        fun creditSpecification(init: CreditSpecification.() -> Unit = {}): CreditSpecification {
            return CreditSpecification().also {
                it.init()
            }
        }
        /**
        * [Ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html)
        */
        fun ebs(init: Ebs.() -> Unit = {}): Ebs {
            return Ebs().also {
                it.init()
            }
        }
        /**
        * [ElasticGpuSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html)
        */
        fun elasticGpuSpecification(init: ElasticGpuSpecification.() -> Unit = {}): ElasticGpuSpecification {
            return ElasticGpuSpecification().also {
                it.init()
            }
        }
        /**
        * [IamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html)
        */
        fun iamInstanceProfile(init: IamInstanceProfile.() -> Unit = {}): IamInstanceProfile {
            return IamInstanceProfile().also {
                it.init()
            }
        }
        /**
        * [InstanceMarketOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html)
        */
        fun instanceMarketOptions(init: InstanceMarketOptions.() -> Unit = {}): InstanceMarketOptions {
            return InstanceMarketOptions().also {
                it.init()
            }
        }
        /**
        * [Ipv6Add](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html)
        */
        fun ipv6Add(init: Ipv6Add.() -> Unit = {}): Ipv6Add {
            return Ipv6Add().also {
                it.init()
            }
        }
        /**
        * [LaunchTemplateData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
        */
        fun launchTemplateData(init: LaunchTemplateData.() -> Unit = {}): LaunchTemplateData {
            return LaunchTemplateData().also {
                it.init()
            }
        }
        /**
        * [Monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html)
        */
        fun monitoring(init: Monitoring.() -> Unit = {}): Monitoring {
            return Monitoring().also {
                it.init()
            }
        }
        /**
        * [NetworkInterface](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
        */
        fun networkInterface(init: NetworkInterface.() -> Unit = {}): NetworkInterface {
            return NetworkInterface().also {
                it.init()
            }
        }
        /**
        * [Placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html)
        */
        fun placement(init: Placement.() -> Unit = {}): Placement {
            return Placement().also {
                it.init()
            }
        }
        /**
        * [PrivateIpAdd](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html)
        */
        fun privateIpAdd(init: PrivateIpAdd.() -> Unit = {}): PrivateIpAdd {
            return PrivateIpAdd().also {
                it.init()
            }
        }
        /**
        * [SpotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html)
        */
        fun spotOptions(init: SpotOptions.() -> Unit = {}): SpotOptions {
            return SpotOptions().also {
                it.init()
            }
        }
        /**
        * [TagSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html)
        */
        fun tagSpecification(init: TagSpecification.() -> Unit = {}): TagSpecification {
            return TagSpecification().also {
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
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-devicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deviceName: Any? = null

        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-devicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deviceName(value: String) {
          this.deviceName = value
        }
        
        /**
         * [deviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-devicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deviceName(value: IntrinsicFunction) {
          this.deviceName = value
        }

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: Ebs
         */
        var ebs: Any? = null

        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: Ebs
         */
        fun ebs(value: Ebs) {
          this.ebs = value
        }
        
        /**
         * [ebs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs)
         *
         * _Required_: no
         *
         * _Type_: Ebs
         */
        fun ebs(value: IntrinsicFunction) {
          this.ebs = value
        }

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var noDevice: Any? = null

        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noDevice(value: String) {
          this.noDevice = value
        }
        
        /**
         * [noDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-nodevice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noDevice(value: IntrinsicFunction) {
          this.noDevice = value
        }

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var virtualName: Any? = null

        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-virtualname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun virtualName(value: String) {
          this.virtualName = value
        }
        
        /**
         * [virtualName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-virtualname)
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
         * [cpuCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cpuCredits: Any? = null

        /**
         * [cpuCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cpuCredits(value: String) {
          this.cpuCredits = value
        }
        
        /**
         * [cpuCredits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification-cpucredits)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cpuCredits(value: IntrinsicFunction) {
          this.cpuCredits = value
        }

    }

    @CloudFormationMarker
    class Ebs {
            /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var encrypted: Any? = null

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: IntrinsicFunction) {
          this.encrypted = value
        }

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var snapshotId: Any? = null

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: String) {
          this.snapshotId = value
        }
        
        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: IntrinsicFunction) {
          this.snapshotId = value
        }

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumeSize: Any? = null

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: Int) {
          this.volumeSize = value
        }
        
        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: IntrinsicFunction) {
          this.volumeSize = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping-ebs.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs-volumetype)
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
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html#cfn-ec2-launchtemplate-elasticgpuspecification-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html#cfn-ec2-launchtemplate-elasticgpuspecification-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html#cfn-ec2-launchtemplate-elasticgpuspecification-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class IamInstanceProfile {
            /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var arn: Any? = null

        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun arn(value: String) {
          this.arn = value
        }
        
        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun arn(value: IntrinsicFunction) {
          this.arn = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class InstanceMarketOptions {
            /**
         * [marketType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var marketType: Any? = null

        /**
         * [marketType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun marketType(value: String) {
          this.marketType = value
        }
        
        /**
         * [marketType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-markettype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun marketType(value: IntrinsicFunction) {
          this.marketType = value
        }

        /**
         * [spotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions)
         *
         * _Required_: no
         *
         * _Type_: SpotOptions
         */
        var spotOptions: Any? = null

        /**
         * [spotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions)
         *
         * _Required_: no
         *
         * _Type_: SpotOptions
         */
        fun spotOptions(value: SpotOptions) {
          this.spotOptions = value
        }
        
        /**
         * [spotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions)
         *
         * _Required_: no
         *
         * _Type_: SpotOptions
         */
        fun spotOptions(value: IntrinsicFunction) {
          this.spotOptions = value
        }

    }

    @CloudFormationMarker
    class Ipv6Add {
            /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ipv6Address: Any? = null

        /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipv6Address(value: String) {
          this.ipv6Address = value
        }
        
        /**
         * [ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipv6Address(value: IntrinsicFunction) {
          this.ipv6Address = value
        }

    }

    @CloudFormationMarker
    class LaunchTemplateData {
            /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        var blockDeviceMappings: Any? = null

        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(value: List<BlockDeviceMapping>) {
          this.blockDeviceMappings = value
        }
        
        /**
         * [blockDeviceMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings)
         *
         * _Required_: no
         *
         * _Type_: List<BlockDeviceMapping>
         */
        fun blockDeviceMappings(vararg value: IntrinsicFunction) {
          this.blockDeviceMappings = value
        }

        /**
         * [creditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification)
         *
         * _Required_: no
         *
         * _Type_: CreditSpecification
         */
        var creditSpecification: Any? = null

        /**
         * [creditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification)
         *
         * _Required_: no
         *
         * _Type_: CreditSpecification
         */
        fun creditSpecification(value: CreditSpecification) {
          this.creditSpecification = value
        }
        
        /**
         * [creditSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification)
         *
         * _Required_: no
         *
         * _Type_: CreditSpecification
         */
        fun creditSpecification(value: IntrinsicFunction) {
          this.creditSpecification = value
        }

        /**
         * [disableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var disableApiTermination: Any? = null

        /**
         * [disableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableApiTermination(value: Boolean) {
          this.disableApiTermination = value
        }
        
        /**
         * [disableApiTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableApiTermination(value: IntrinsicFunction) {
          this.disableApiTermination = value
        }

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var ebsOptimized: Any? = null

        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: Boolean) {
          this.ebsOptimized = value
        }
        
        /**
         * [ebsOptimized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun ebsOptimized(value: IntrinsicFunction) {
          this.ebsOptimized = value
        }

        /**
         * [elasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticGpuSpecification>
         */
        var elasticGpuSpecifications: Any? = null

        /**
         * [elasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticGpuSpecification>
         */
        fun elasticGpuSpecifications(value: List<ElasticGpuSpecification>) {
          this.elasticGpuSpecifications = value
        }
        
        /**
         * [elasticGpuSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticGpuSpecification>
         */
        fun elasticGpuSpecifications(vararg value: IntrinsicFunction) {
          this.elasticGpuSpecifications = value
        }

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: IamInstanceProfile
         */
        var iamInstanceProfile: Any? = null

        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: IamInstanceProfile
         */
        fun iamInstanceProfile(value: IamInstanceProfile) {
          this.iamInstanceProfile = value
        }
        
        /**
         * [iamInstanceProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile)
         *
         * _Required_: no
         *
         * _Type_: IamInstanceProfile
         */
        fun iamInstanceProfile(value: IntrinsicFunction) {
          this.iamInstanceProfile = value
        }

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var imageId: Any? = null

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun imageId(value: String) {
          this.imageId = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun imageId(value: IntrinsicFunction) {
          this.imageId = value
        }

        /**
         * [instanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceInitiatedShutdownBehavior: Any? = null

        /**
         * [instanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInitiatedShutdownBehavior(value: String) {
          this.instanceInitiatedShutdownBehavior = value
        }
        
        /**
         * [instanceInitiatedShutdownBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInitiatedShutdownBehavior(value: IntrinsicFunction) {
          this.instanceInitiatedShutdownBehavior = value
        }

        /**
         * [instanceMarketOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions)
         *
         * _Required_: no
         *
         * _Type_: InstanceMarketOptions
         */
        var instanceMarketOptions: Any? = null

        /**
         * [instanceMarketOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions)
         *
         * _Required_: no
         *
         * _Type_: InstanceMarketOptions
         */
        fun instanceMarketOptions(value: InstanceMarketOptions) {
          this.instanceMarketOptions = value
        }
        
        /**
         * [instanceMarketOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions)
         *
         * _Required_: no
         *
         * _Type_: InstanceMarketOptions
         */
        fun instanceMarketOptions(value: IntrinsicFunction) {
          this.instanceMarketOptions = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var kernelId: Any? = null

        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: String) {
          this.kernelId = value
        }
        
        /**
         * [kernelId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kernelId(value: IntrinsicFunction) {
          this.kernelId = value
        }

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var keyName: Any? = null

        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: String) {
          this.keyName = value
        }
        
        /**
         * [keyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyName(value: IntrinsicFunction) {
          this.keyName = value
        }

        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring)
         *
         * _Required_: no
         *
         * _Type_: Monitoring
         */
        var monitoring: Any? = null

        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring)
         *
         * _Required_: no
         *
         * _Type_: Monitoring
         */
        fun monitoring(value: Monitoring) {
          this.monitoring = value
        }
        
        /**
         * [monitoring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring)
         *
         * _Required_: no
         *
         * _Type_: Monitoring
         */
        fun monitoring(value: IntrinsicFunction) {
          this.monitoring = value
        }

        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<NetworkInterface>
         */
        var networkInterfaces: Any? = null

        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<NetworkInterface>
         */
        fun networkInterfaces(value: List<NetworkInterface>) {
          this.networkInterfaces = value
        }
        
        /**
         * [networkInterfaces](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces)
         *
         * _Required_: no
         *
         * _Type_: List<NetworkInterface>
         */
        fun networkInterfaces(vararg value: IntrinsicFunction) {
          this.networkInterfaces = value
        }

        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-placement)
         *
         * _Required_: no
         *
         * _Type_: Placement
         */
        var placement: Any? = null

        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-placement)
         *
         * _Required_: no
         *
         * _Type_: Placement
         */
        fun placement(value: Placement) {
          this.placement = value
        }
        
        /**
         * [placement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-placement)
         *
         * _Required_: no
         *
         * _Type_: Placement
         */
        fun placement(value: IntrinsicFunction) {
          this.placement = value
        }

        /**
         * [ramDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ramDiskId: Any? = null

        /**
         * [ramDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramDiskId(value: String) {
          this.ramDiskId = value
        }
        
        /**
         * [ramDiskId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ramDiskId(value: IntrinsicFunction) {
          this.ramDiskId = value
        }

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }

        /**
         * [tagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<TagSpecification>
         */
        var tagSpecifications: Any? = null

        /**
         * [tagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<TagSpecification>
         */
        fun tagSpecifications(value: List<TagSpecification>) {
          this.tagSpecifications = value
        }
        
        /**
         * [tagSpecifications](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
         *
         * _Required_: no
         *
         * _Type_: List<TagSpecification>
         */
        fun tagSpecifications(vararg value: IntrinsicFunction) {
          this.tagSpecifications = value
        }

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var userData: Any? = null

        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: String) {
          this.userData = value
        }
        
        /**
         * [userData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userData(value: IntrinsicFunction) {
          this.userData = value
        }

    }

    @CloudFormationMarker
    class Monitoring {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring-enabled)
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
    class NetworkInterface {
            /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatepublicipaddress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var associatePublicIpAddress: Any? = null

        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatepublicipaddress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: Boolean) {
          this.associatePublicIpAddress = value
        }
        
        /**
         * [associatePublicIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatepublicipaddress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun associatePublicIpAddress(value: IntrinsicFunction) {
          this.associatePublicIpAddress = value
        }

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteOnTermination: Any? = null

        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: Boolean) {
          this.deleteOnTermination = value
        }
        
        /**
         * [deleteOnTermination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deleteontermination)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteOnTermination(value: IntrinsicFunction) {
          this.deleteOnTermination = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deviceindex)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var deviceIndex: Any? = null

        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deviceindex)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun deviceIndex(value: Int) {
          this.deviceIndex = value
        }
        
        /**
         * [deviceIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deviceindex)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun deviceIndex(value: IntrinsicFunction) {
          this.deviceIndex = value
        }

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var groups: Any? = null

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(value: List<String>) {
          this.groups = value
        }
        
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var ipv6AddressCount: Any? = null

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: Int) {
          this.ipv6AddressCount = value
        }
        
        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: IntrinsicFunction) {
          this.ipv6AddressCount = value
        }

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<Ipv6Add>
         */
        var ipv6Addresses: Any? = null

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<Ipv6Add>
         */
        fun ipv6Addresses(value: List<Ipv6Add>) {
          this.ipv6Addresses = value
        }
        
        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: List<Ipv6Add>
         */
        fun ipv6Addresses(vararg value: IntrinsicFunction) {
          this.ipv6Addresses = value
        }

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
        }

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAdd>
         */
        var privateIpAddresses: Any? = null

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAdd>
         */
        fun privateIpAddresses(value: List<PrivateIpAdd>) {
          this.privateIpAddresses = value
        }
        
        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAdd>
         */
        fun privateIpAddresses(vararg value: IntrinsicFunction) {
          this.privateIpAddresses = value
        }

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-secondaryprivateipaddresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var secondaryPrivateIpAddressCount: Any? = null

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-secondaryprivateipaddresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: Int) {
          this.secondaryPrivateIpAddressCount = value
        }
        
        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-secondaryprivateipaddresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: IntrinsicFunction) {
          this.secondaryPrivateIpAddressCount = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-subnetid)
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
    class Placement {
            /**
         * [affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var affinity: Any? = null

        /**
         * [affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun affinity(value: String) {
          this.affinity = value
        }
        
        /**
         * [affinity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-affinity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun affinity(value: IntrinsicFunction) {
          this.affinity = value
        }

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }

        /**
         * [hostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var hostId: Any? = null

        /**
         * [hostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostId(value: String) {
          this.hostId = value
        }
        
        /**
         * [hostId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-hostid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostId(value: IntrinsicFunction) {
          this.hostId = value
        }

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tenancy: Any? = null

        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tenancy(value: String) {
          this.tenancy = value
        }
        
        /**
         * [tenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html#cfn-ec2-launchtemplate-launchtemplatedata-placement-tenancy)
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
    class PrivateIpAdd {
            /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var primary: Any? = null

        /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun primary(value: Boolean) {
          this.primary = value
        }
        
        /**
         * [primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun primary(value: IntrinsicFunction) {
          this.primary = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
        }

    }

    @CloudFormationMarker
    class SpotOptions {
            /**
         * [instanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceInterruptionBehavior: Any? = null

        /**
         * [instanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInterruptionBehavior(value: String) {
          this.instanceInterruptionBehavior = value
        }
        
        /**
         * [instanceInterruptionBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-instanceinterruptionbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceInterruptionBehavior(value: IntrinsicFunction) {
          this.instanceInterruptionBehavior = value
        }

        /**
         * [maxPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var maxPrice: Any? = null

        /**
         * [maxPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maxPrice(value: String) {
          this.maxPrice = value
        }
        
        /**
         * [maxPrice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-maxprice)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maxPrice(value: IntrinsicFunction) {
          this.maxPrice = value
        }

        /**
         * [spotInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var spotInstanceType: Any? = null

        /**
         * [spotInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotInstanceType(value: String) {
          this.spotInstanceType = value
        }
        
        /**
         * [spotInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions-spotoptions-spotinstancetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotInstanceType(value: IntrinsicFunction) {
          this.spotInstanceType = value
        }

    }

    @CloudFormationMarker
    class TagSpecification {
            /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceType: Any? = null

        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceType(value: String) {
          this.resourceType = value
        }
        
        /**
         * [resourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceType(value: IntrinsicFunction) {
          this.resourceType = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

    }

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
