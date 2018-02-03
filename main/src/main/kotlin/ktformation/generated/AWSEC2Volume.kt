
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Volume - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
 */
@CloudFormationMarker
class AWSEC2Volume(logicalId: String) : Resource<AWSEC2Volume.Properties>(logicalId, "AWS::EC2::Volume") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoEnableIO](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-autoenableio)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoEnableIO: Any? = null

        /**
         * [autoEnableIO](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-autoenableio)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoEnableIO(value: Boolean) {
          this.autoEnableIO = value
        }
        
        /**
         * [autoEnableIO](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-autoenableio)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun autoEnableIO(value: IntrinsicFunction) {
          this.autoEnableIO = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var encrypted: Any? = null

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: IntrinsicFunction) {
          this.encrypted = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var size: Any? = null

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun size(value: Int) {
          this.size = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun size(value: IntrinsicFunction) {
          this.size = value
        }
        
        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snapshotId: Any? = null

        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: String) {
          this.snapshotId = value
        }
        
        /**
         * [snapshotId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-snapshotid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snapshotId(value: IntrinsicFunction) {
          this.snapshotId = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html#cfn-ec2-ebs-volume-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: IntrinsicFunction) {
          this.volumeType = value
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
 * [AWS::EC2::Volume - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
 */
fun Resources.awsEC2Volume(logicalId: String, init: AWSEC2Volume.() -> Unit = {}): AWSEC2Volume {
    return AWSEC2Volume(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
