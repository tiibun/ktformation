
package ktformation.generated

import ktformation.*

/**
 * [AWS::Inspector::AssessmentTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html)
 */
@CloudFormationMarker
class AWSInspectorAssessmentTemplate(logicalId: String) : Resource<AWSInspectorAssessmentTemplate.Properties>(logicalId, "AWS::Inspector::AssessmentTemplate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [assessmentTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var assessmentTargetArn: Any? = null

        /**
         * [assessmentTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun assessmentTargetArn(value: String) {
          this.assessmentTargetArn = value
        }
        
        /**
         * [assessmentTargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun assessmentTargetArn(value: IntrinsicFunction) {
          this.assessmentTargetArn = value
        }

        /**
         * [assessmentTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var assessmentTemplateName: Any? = null

        /**
         * [assessmentTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun assessmentTemplateName(value: String) {
          this.assessmentTemplateName = value
        }
        
        /**
         * [assessmentTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun assessmentTemplateName(value: IntrinsicFunction) {
          this.assessmentTemplateName = value
        }

        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var durationInSeconds: Any? = null

        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun durationInSeconds(value: Int) {
          this.durationInSeconds = value
        }
        
        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun durationInSeconds(value: IntrinsicFunction) {
          this.durationInSeconds = value
        }

        /**
         * [rulesPackageArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var rulesPackageArns: Any? = null

        /**
         * [rulesPackageArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun rulesPackageArns(value: List<String>) {
          this.rulesPackageArns = value
        }
        
        /**
         * [rulesPackageArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun rulesPackageArns(vararg value: IntrinsicFunction) {
          this.rulesPackageArns = value
        }

        /**
         * [userAttributesForFindings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var userAttributesForFindings: Any? = null

        /**
         * [userAttributesForFindings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun userAttributesForFindings(value: List<Tag>) {
          this.userAttributesForFindings = value
        }
        
        /**
         * [userAttributesForFindings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun userAttributesForFindings(vararg value: IntrinsicFunction) {
          this.userAttributesForFindings = value
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
 * [AWS::Inspector::AssessmentTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html)
 */
fun Resources.awsInspectorAssessmentTemplate(logicalId: String, init: AWSInspectorAssessmentTemplate.() -> Unit = {}): AWSInspectorAssessmentTemplate {
    return AWSInspectorAssessmentTemplate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
