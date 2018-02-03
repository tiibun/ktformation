
package ktformation.generated

import ktformation.*

/**
 * [AWS::Inspector::AssessmentTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
@CloudFormationMarker
class AWSInspectorAssessmentTarget(logicalId: String) : Resource<AWSInspectorAssessmentTarget.Properties>(logicalId, "AWS::Inspector::AssessmentTarget") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [assessmentTargetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var assessmentTargetName: Any? = null

        /**
         * [assessmentTargetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun assessmentTargetName(value: String) {
          this.assessmentTargetName = value
        }
        
        /**
         * [assessmentTargetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun assessmentTargetName(value: IntrinsicFunction) {
          this.assessmentTargetName = value
        }
        
        /**
         * [resourceGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceGroupArn: Any? = null

        /**
         * [resourceGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceGroupArn(value: String) {
          this.resourceGroupArn = value
        }
        
        /**
         * [resourceGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::Inspector::AssessmentTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
fun Resources.awsInspectorAssessmentTarget(logicalId: String, init: AWSInspectorAssessmentTarget.() -> Unit = {}): AWSInspectorAssessmentTarget {
    return AWSInspectorAssessmentTarget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
