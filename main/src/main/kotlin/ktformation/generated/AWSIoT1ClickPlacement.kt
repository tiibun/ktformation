
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT1Click::Placement - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html)
 */
@CloudFormationMarker
class AWSIoT1ClickPlacement(logicalId: String) : Resource<AWSIoT1ClickPlacement.Properties>(logicalId, "AWS::IoT1Click::Placement") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [associatedDevices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var associatedDevices: Any? = null

        /**
         * [associatedDevices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun associatedDevices(value: Json) {
          this.associatedDevices = value
        }
        
        /**
         * [associatedDevices](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-associateddevices)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun associatedDevices(value: IntrinsicFunction) {
          this.associatedDevices = value
        }

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun attributes(value: Json) {
          this.attributes = value
        }
        
        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-attributes)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun attributes(value: IntrinsicFunction) {
          this.attributes = value
        }

        /**
         * [placementName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var placementName: Any? = null

        /**
         * [placementName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun placementName(value: String) {
          this.placementName = value
        }
        
        /**
         * [placementName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-placementname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun placementName(value: IntrinsicFunction) {
          this.placementName = value
        }

        /**
         * [projectName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var projectName: Any? = null

        /**
         * [projectName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun projectName(value: String) {
          this.projectName = value
        }
        
        /**
         * [projectName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html#cfn-iot1click-placement-projectname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun projectName(value: IntrinsicFunction) {
          this.projectName = value
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
 * [AWS::IoT1Click::Placement - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html)
 */
fun Resources.awsIoT1ClickPlacement(logicalId: String, init: AWSIoT1ClickPlacement.() -> Unit = {}): AWSIoT1ClickPlacement {
    return AWSIoT1ClickPlacement(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
