
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::ThingPrincipalAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
 */
@CloudFormationMarker
class AWSIoTThingPrincipalAttachment(logicalId: String) : Resource<AWSIoTThingPrincipalAttachment.Properties>(logicalId, "AWS::IoT::ThingPrincipalAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var principal: Any? = null

        fun principal(value: String) {
          this.principal = value
        }
        
        fun principal(value: IntrinsicFunction) {
          this.principal = value
        }
        
        @JvmField
        var thingName: Any? = null

        fun thingName(value: String) {
          this.thingName = value
        }
        
        fun thingName(value: IntrinsicFunction) {
          this.thingName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIoTThingPrincipalAttachment(logicalId: String, init: AWSIoTThingPrincipalAttachment.() -> Unit = {}): AWSIoTThingPrincipalAttachment {
    return AWSIoTThingPrincipalAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
