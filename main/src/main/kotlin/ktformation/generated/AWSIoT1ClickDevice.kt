
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT1Click::Device - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html)
 */
@CloudFormationMarker
class AWSIoT1ClickDevice(logicalId: String) : Resource<AWSIoT1ClickDevice.Properties>(logicalId, "AWS::IoT1Click::Device") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [deviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var deviceId: Any? = null

        /**
         * [deviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceId(value: String) {
          this.deviceId = value
        }
        
        /**
         * [deviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deviceId(value: IntrinsicFunction) {
          this.deviceId = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
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
 * [AWS::IoT1Click::Device - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html)
 */
fun Resources.awsIoT1ClickDevice(logicalId: String, init: AWSIoT1ClickDevice.() -> Unit = {}): AWSIoT1ClickDevice {
    return AWSIoT1ClickDevice(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
