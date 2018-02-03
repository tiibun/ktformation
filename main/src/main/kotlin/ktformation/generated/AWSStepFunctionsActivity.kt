
package ktformation.generated

import ktformation.*

/**
 * [AWS::StepFunctions::Activity - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html)
 */
@CloudFormationMarker
class AWSStepFunctionsActivity(logicalId: String) : Resource<AWSStepFunctionsActivity.Properties>(logicalId, "AWS::StepFunctions::Activity") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsStepFunctionsActivity(logicalId: String, init: AWSStepFunctionsActivity.() -> Unit = {}): AWSStepFunctionsActivity {
    return AWSStepFunctionsActivity(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
