
package ktformation.generated

import ktformation.*

/**
 * [AWS::SES::Template - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
 */
@CloudFormationMarker
class AWSSESTemplate(logicalId: String) : Resource<AWSSESTemplate.Properties>(logicalId, "AWS::SES::Template") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [template](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
         *
         * _Required_: no
         *
         * _Type_: Template
         */
        @JvmField
        var template: Any? = null

        /**
         * [template](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
         *
         * _Required_: no
         *
         * _Type_: Template
         */
        fun template(value: Template) {
          this.template = value
        }
        
        /**
         * [template](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
         *
         * _Required_: no
         *
         * _Type_: Template
         */
        fun template(value: IntrinsicFunction) {
          this.template = value
        }

        /**
        * [Template](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html)
        */
        fun template(init: Template.() -> Unit = {}): Template {
            return Template().also {
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
    class Template {
            /**
         * [htmlPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var htmlPart: Any? = null

        /**
         * [htmlPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun htmlPart(value: String) {
          this.htmlPart = value
        }
        
        /**
         * [htmlPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun htmlPart(value: IntrinsicFunction) {
          this.htmlPart = value
        }

        /**
         * [subjectPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subjectPart: Any? = null

        /**
         * [subjectPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subjectPart(value: String) {
          this.subjectPart = value
        }
        
        /**
         * [subjectPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subjectPart(value: IntrinsicFunction) {
          this.subjectPart = value
        }

        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var templateName: Any? = null

        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun templateName(value: String) {
          this.templateName = value
        }
        
        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun templateName(value: IntrinsicFunction) {
          this.templateName = value
        }

        /**
         * [textPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var textPart: Any? = null

        /**
         * [textPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun textPart(value: String) {
          this.textPart = value
        }
        
        /**
         * [textPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun textPart(value: IntrinsicFunction) {
          this.textPart = value
        }

    }

}

/**
 * [AWS::SES::Template - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
 */
fun Resources.awsSESTemplate(logicalId: String, init: AWSSESTemplate.() -> Unit = {}): AWSSESTemplate {
    return AWSSESTemplate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
