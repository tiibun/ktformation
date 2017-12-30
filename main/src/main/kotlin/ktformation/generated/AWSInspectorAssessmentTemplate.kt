
package ktformation.generated

import ktformation.*

/**
 * [AWS::Inspector::AssessmentTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html)
 */
@CloudFormationMarker
class AWSInspectorAssessmentTemplate(logicalId: String) : Resource<AWSInspectorAssessmentTemplate.Properties>(logicalId, "AWS::Inspector::AssessmentTemplate") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var assessmentTargetArn: Any? = null
        fun assessmentTargetArn(value: String) { this.assessmentTargetArn = value }
        fun assessmentTargetArn(value: IntrinsicFunction) { this.assessmentTargetArn = value }
        @JvmField var assessmentTemplateName: Any? = null
        fun assessmentTemplateName(value: String) {
            this.assessmentTemplateName = value
        }
        fun assessmentTemplateName(value: IntrinsicFunction) { this.assessmentTemplateName = value }
        @JvmField var durationInSeconds: Any? = null
        fun durationInSeconds(value: Int) { this.durationInSeconds = value }
        fun durationInSeconds(value: IntrinsicFunction) { this.durationInSeconds = value }
        @JvmField var rulesPackageArns: Any? = null
        fun rulesPackageArns(value: List<String>) { this.rulesPackageArns = value }
        fun rulesPackageArns(vararg value: IntrinsicFunction) { this.rulesPackageArns = value }
        @JvmField var userAttributesForFindings: Any? = null
        fun userAttributesForFindings(value: List<Tag>) {
            this.userAttributesForFindings = value
        }
        fun userAttributesForFindings(vararg value: IntrinsicFunction) { this.userAttributesForFindings = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsInspectorAssessmentTemplate(logicalId: String, init: AWSInspectorAssessmentTemplate.() -> Unit = {}): AWSInspectorAssessmentTemplate {
    return AWSInspectorAssessmentTemplate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
