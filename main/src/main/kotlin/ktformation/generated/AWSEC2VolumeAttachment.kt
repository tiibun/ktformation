
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VolumeAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html)
 */
@CloudFormationMarker
class AWSEC2VolumeAttachment(logicalId: String) : Resource<AWSEC2VolumeAttachment.Properties>(logicalId, "AWS::EC2::VolumeAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var device: Any? = null

        /**
         * [device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun device(value: String) {
          this.device = value
        }
        
        /**
         * [device](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun device(value: IntrinsicFunction) {
          this.device = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }
        
        /**
         * [volumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var volumeId: Any? = null

        /**
         * [volumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeId(value: String) {
          this.volumeId = value
        }
        
        /**
         * [volumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun volumeId(value: IntrinsicFunction) {
          this.volumeId = value
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
 * [AWS::EC2::VolumeAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html)
 */
fun Resources.awsEC2VolumeAttachment(logicalId: String, init: AWSEC2VolumeAttachment.() -> Unit = {}): AWSEC2VolumeAttachment {
    return AWSEC2VolumeAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
