
package ktformation.generated

import ktformation.*

/**
 * [AWS::StepFunctions::StateMachine - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html)
 */
@CloudFormationMarker
class AWSStepFunctionsStateMachine(logicalId: String) : Resource<AWSStepFunctionsStateMachine.Properties>(logicalId, "AWS::StepFunctions::StateMachine") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var definitionString: Any? = null

        fun definitionString(value: String) {
          this.definitionString = value
        }
        
        fun definitionString(value: IntrinsicFunction) {
          this.definitionString = value
        }
        
        @JvmField
        var roleArn: Any? = null

        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
        @JvmField
        var stateMachineName: Any? = null

        fun stateMachineName(value: String) {
          this.stateMachineName = value
        }
        
        fun stateMachineName(value: IntrinsicFunction) {
          this.stateMachineName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsStepFunctionsStateMachine(logicalId: String, init: AWSStepFunctionsStateMachine.() -> Unit = {}): AWSStepFunctionsStateMachine {
    return AWSStepFunctionsStateMachine(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
