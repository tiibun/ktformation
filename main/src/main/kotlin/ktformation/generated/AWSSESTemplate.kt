
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Template(
            /**
             * [HtmlPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val htmlPart: String? = null,
            /**
             * [SubjectPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subjectPart: String? = null,
            /**
             * [TemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val templateName: String? = null,
            /**
             * [TextPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val textPart: String? = null
    )

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
