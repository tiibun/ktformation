
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::ThingPrincipalAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
 */
@CloudFormationMarker
class AWSIoTThingPrincipalAttachment(logicalId: String) : Resource<AWSIoTThingPrincipalAttachment.Properties>(logicalId, "AWS::IoT::ThingPrincipalAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var principal: Any? = null

        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principal(value: String) {
          this.principal = value
        }
        
        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principal(value: IntrinsicFunction) {
          this.principal = value
        }

        /**
         * [thingName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var thingName: Any? = null

        /**
         * [thingName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun thingName(value: String) {
          this.thingName = value
        }
        
        /**
         * [thingName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::IoT::ThingPrincipalAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
 */
fun Resources.awsIoTThingPrincipalAttachment(logicalId: String, init: AWSIoTThingPrincipalAttachment.() -> Unit = {}): AWSIoTThingPrincipalAttachment {
    return AWSIoTThingPrincipalAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
