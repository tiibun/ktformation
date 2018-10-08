
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT1Click::Project - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html)
 */
@CloudFormationMarker
class AWSIoT1ClickProject(logicalId: String) : Resource<AWSIoT1ClickProject.Properties>(logicalId, "AWS::IoT1Click::Project") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [placementTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
         *
         * _Required_: yes
         *
         * _Type_: PlacementTemplate
         */
        @JvmField
        var placementTemplate: Any? = null

        /**
         * [placementTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
         *
         * _Required_: yes
         *
         * _Type_: PlacementTemplate
         */
        fun placementTemplate(value: PlacementTemplate) {
          this.placementTemplate = value
        }
        
        /**
         * [placementTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-placementtemplate)
         *
         * _Required_: yes
         *
         * _Type_: PlacementTemplate
         */
        fun placementTemplate(value: IntrinsicFunction) {
          this.placementTemplate = value
        }

        /**
         * [projectName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var projectName: Any? = null

        /**
         * [projectName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun projectName(value: String) {
          this.projectName = value
        }
        
        /**
         * [projectName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html#cfn-iot1click-project-projectname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun projectName(value: IntrinsicFunction) {
          this.projectName = value
        }

        /**
        * [DeviceTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html)
        */
        fun deviceTemplate(init: DeviceTemplate.() -> Unit = {}): DeviceTemplate {
            return DeviceTemplate().also {
                it.init()
            }
        }
        /**
        * [PlacementTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html)
        */
        fun placementTemplate(init: PlacementTemplate.() -> Unit = {}): PlacementTemplate {
            return PlacementTemplate().also {
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
    class DeviceTemplate {
            /**
         * [callbackOverrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var callbackOverrides: Any? = null

        /**
         * [callbackOverrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun callbackOverrides(value: Json) {
          this.callbackOverrides = value
        }
        
        /**
         * [callbackOverrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-callbackoverrides)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun callbackOverrides(value: IntrinsicFunction) {
          this.callbackOverrides = value
        }

        /**
         * [deviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deviceType: Any? = null

        /**
         * [deviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deviceType(value: String) {
          this.deviceType = value
        }
        
        /**
         * [deviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html#cfn-iot1click-project-devicetemplate-devicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deviceType(value: IntrinsicFunction) {
          this.deviceType = value
        }

    }

    @CloudFormationMarker
    class PlacementTemplate {
            /**
         * [defaultAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var defaultAttributes: Any? = null

        /**
         * [defaultAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun defaultAttributes(value: Json) {
          this.defaultAttributes = value
        }
        
        /**
         * [defaultAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-defaultattributes)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun defaultAttributes(value: IntrinsicFunction) {
          this.defaultAttributes = value
        }

        /**
         * [deviceTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var deviceTemplates: Any? = null

        /**
         * [deviceTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun deviceTemplates(value: Json) {
          this.deviceTemplates = value
        }
        
        /**
         * [deviceTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html#cfn-iot1click-project-placementtemplate-devicetemplates)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun deviceTemplates(value: IntrinsicFunction) {
          this.deviceTemplates = value
        }

    }

}

/**
 * [AWS::IoT1Click::Project - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html)
 */
fun Resources.awsIoT1ClickProject(logicalId: String, init: AWSIoT1ClickProject.() -> Unit = {}): AWSIoT1ClickProject {
    return AWSIoT1ClickProject(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
