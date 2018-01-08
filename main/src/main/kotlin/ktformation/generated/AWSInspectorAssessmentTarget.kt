
package ktformation.generated

import ktformation.*

/**
 * [AWS::Inspector::AssessmentTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
@CloudFormationMarker
class AWSInspectorAssessmentTarget(logicalId: String) : Resource<AWSInspectorAssessmentTarget.Properties>(logicalId, "AWS::Inspector::AssessmentTarget") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var assessmentTargetName: Any? = null

        fun assessmentTargetName(value: String) {
          this.assessmentTargetName = value
        }
        fun assessmentTargetName(value: IntrinsicFunction) {
  this.assessmentTargetName = value
}
        @JvmField
        var resourceGroupArn: Any? = null

        fun resourceGroupArn(value: String) {
          this.resourceGroupArn = value
        }
        fun resourceGroupArn(value: IntrinsicFunction) {
  this.resourceGroupArn = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsInspectorAssessmentTarget(logicalId: String, init: AWSInspectorAssessmentTarget.() -> Unit = {}): AWSInspectorAssessmentTarget {
    return AWSInspectorAssessmentTarget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
