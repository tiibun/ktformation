
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::Thing - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 */
@CloudFormationMarker
class AWSIoTThing(logicalId: String) : Resource<AWSIoTThing.Properties>(logicalId, "AWS::IoT::Thing") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var attributePayload: Any? = null

        fun attributePayload(value: AttributePayload) {
          this.attributePayload = value
        }
        fun attributePayload(value: IntrinsicFunction) {
  this.attributePayload = value
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


    class AttributePayload(
            val attributes: Map<String, Any>? = null
    )

}

fun Resources.awsIoTThing(logicalId: String, init: AWSIoTThing.() -> Unit = {}): AWSIoTThing {
    return AWSIoTThing(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
