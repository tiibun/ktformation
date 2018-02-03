
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Volume - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
 */
@CloudFormationMarker
class AWSOpsWorksVolume(logicalId: String) : Resource<AWSOpsWorksVolume.Properties>(logicalId, "AWS::OpsWorks::Volume") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [ec2VolumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ec2VolumeId: Any? = null

        /**
         * [ec2VolumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ec2VolumeId(value: String) {
          this.ec2VolumeId = value
        }
        
        /**
         * [ec2VolumeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ec2VolumeId(value: IntrinsicFunction) {
          this.ec2VolumeId = value
        }
        
        /**
         * [mountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var mountPoint: Any? = null

        /**
         * [mountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mountPoint(value: String) {
          this.mountPoint = value
        }
        
        /**
         * [mountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mountPoint(value: IntrinsicFunction) {
          this.mountPoint = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var stackId: Any? = null

        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: String) {
          this.stackId = value
        }
        
        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: IntrinsicFunction) {
          this.stackId = value
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
 * [AWS::OpsWorks::Volume - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
 */
fun Resources.awsOpsWorksVolume(logicalId: String, init: AWSOpsWorksVolume.() -> Unit = {}): AWSOpsWorksVolume {
    return AWSOpsWorksVolume(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
