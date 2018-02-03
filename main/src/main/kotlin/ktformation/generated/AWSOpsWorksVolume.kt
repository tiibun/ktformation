
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Volume - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
 */
@CloudFormationMarker
class AWSOpsWorksVolume(logicalId: String) : Resource<AWSOpsWorksVolume.Properties>(logicalId, "AWS::OpsWorks::Volume") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var ec2VolumeId: Any? = null

        fun ec2VolumeId(value: String) {
          this.ec2VolumeId = value
        }
        
        fun ec2VolumeId(value: IntrinsicFunction) {
          this.ec2VolumeId = value
        }
        
        @JvmField
        var mountPoint: Any? = null

        fun mountPoint(value: String) {
          this.mountPoint = value
        }
        
        fun mountPoint(value: IntrinsicFunction) {
          this.mountPoint = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var stackId: Any? = null

        fun stackId(value: String) {
          this.stackId = value
        }
        
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

fun Resources.awsOpsWorksVolume(logicalId: String, init: AWSOpsWorksVolume.() -> Unit = {}): AWSOpsWorksVolume {
    return AWSOpsWorksVolume(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
