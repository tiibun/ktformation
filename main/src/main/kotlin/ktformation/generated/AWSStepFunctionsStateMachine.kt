
package ktformation.generated

import ktformation.*

/**
 * [AWS::StepFunctions::StateMachine - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html)
 */
@CloudFormationMarker
class AWSStepFunctionsStateMachine(logicalId: String) : Resource<AWSStepFunctionsStateMachine.Properties>(logicalId, "AWS::StepFunctions::StateMachine") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [definitionString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var definitionString: Any? = null

        /**
         * [definitionString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun definitionString(value: String) {
          this.definitionString = value
        }
        
        /**
         * [definitionString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun definitionString(value: IntrinsicFunction) {
          this.definitionString = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
        /**
         * [stateMachineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var stateMachineName: Any? = null

        /**
         * [stateMachineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stateMachineName(value: String) {
          this.stateMachineName = value
        }
        
        /**
         * [stateMachineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::StepFunctions::StateMachine - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html)
 */
fun Resources.awsStepFunctionsStateMachine(logicalId: String, init: AWSStepFunctionsStateMachine.() -> Unit = {}): AWSStepFunctionsStateMachine {
    return AWSStepFunctionsStateMachine(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
