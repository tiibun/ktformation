
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::Thing - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 */
@CloudFormationMarker
class AWSIoTThing(logicalId: String) : Resource<AWSIoTThing.Properties>(logicalId, "AWS::IoT::Thing") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [attributePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
         *
         * _Required_: no
         *
         * _Type_: AttributePayload
         */
        @JvmField
        var attributePayload: Any? = null

        /**
         * [attributePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
         *
         * _Required_: no
         *
         * _Type_: AttributePayload
         */
        fun attributePayload(value: AttributePayload) {
          this.attributePayload = value
        }
        
        /**
         * [attributePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
         *
         * _Required_: no
         *
         * _Type_: AttributePayload
         */
        fun attributePayload(value: IntrinsicFunction) {
          this.attributePayload = value
        }

        /**
         * [thingName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var thingName: Any? = null

        /**
         * [thingName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun thingName(value: String) {
          this.thingName = value
        }
        
        /**
         * [thingName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun thingName(value: IntrinsicFunction) {
          this.thingName = value
        }

        /**
        * [AttributePayload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html)
        */
        fun attributePayload(init: AttributePayload.() -> Unit = {}): AttributePayload {
            return AttributePayload().also {
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
    class AttributePayload {
            /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html#cfn-iot-thing-attributepayload-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun attributes(value: Map<String, Any>) {
          this.attributes = value
        }
        
    }

}

/**
 * [AWS::IoT::Thing - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 */
fun Resources.awsIoTThing(logicalId: String, init: AWSIoTThing.() -> Unit = {}): AWSIoTThing {
    return AWSIoTThing(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
