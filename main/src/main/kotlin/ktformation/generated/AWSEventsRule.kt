
package ktformation.generated

import ktformation.*

/**
 * [AWS::Events::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html)
 */
@CloudFormationMarker
class AWSEventsRule(logicalId: String) : Resource<AWSEventsRule.Properties>(logicalId, "AWS::Events::Rule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [eventPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var eventPattern: Any? = null

        /**
         * [eventPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun eventPattern(value: Json) {
          this.eventPattern = value
        }
        
        /**
         * [eventPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun eventPattern(value: IntrinsicFunction) {
          this.eventPattern = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scheduleExpression: Any? = null

        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheduleExpression(value: String) {
          this.scheduleExpression = value
        }
        
        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheduleExpression(value: IntrinsicFunction) {
          this.scheduleExpression = value
        }

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var state: Any? = null

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: String) {
          this.state = value
        }
        
        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: IntrinsicFunction) {
          this.state = value
        }

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
         *
         * _Required_: no
         *
         * _Type_: List<Target>
         */
        @JvmField
        var targets: Any? = null

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
         *
         * _Required_: no
         *
         * _Type_: List<Target>
         */
        fun targets(value: List<Target>) {
          this.targets = value
        }
        
        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
         *
         * _Required_: no
         *
         * _Type_: List<Target>
         */
        fun targets(vararg value: IntrinsicFunction) {
          this.targets = value
        }

        /**
        * [EcsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html)
        */
        fun ecsParameters(init: EcsParameters.() -> Unit = {}): EcsParameters {
            return EcsParameters().also {
                it.init()
            }
        }
        /**
        * [InputTransformer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html)
        */
        fun inputTransformer(init: InputTransformer.() -> Unit = {}): InputTransformer {
            return InputTransformer().also {
                it.init()
            }
        }
        /**
        * [KinesisParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html)
        */
        fun kinesisParameters(init: KinesisParameters.() -> Unit = {}): KinesisParameters {
            return KinesisParameters().also {
                it.init()
            }
        }
        /**
        * [RunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html)
        */
        fun runCommandParameters(init: RunCommandParameters.() -> Unit = {}): RunCommandParameters {
            return RunCommandParameters().also {
                it.init()
            }
        }
        /**
        * [RunCommandTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html)
        */
        fun runCommandTarget(init: RunCommandTarget.() -> Unit = {}): RunCommandTarget {
            return RunCommandTarget().also {
                it.init()
            }
        }
        /**
        * [SqsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html)
        */
        fun sqsParameters(init: SqsParameters.() -> Unit = {}): SqsParameters {
            return SqsParameters().also {
                it.init()
            }
        }
        /**
        * [Target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html)
        */
        fun target(init: Target.() -> Unit = {}): Target {
            return Target().also {
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
    class EcsParameters {
            /**
         * [taskCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var taskCount: Any? = null

        /**
         * [taskCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun taskCount(value: Int) {
          this.taskCount = value
        }
        
        /**
         * [taskCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun taskCount(value: IntrinsicFunction) {
          this.taskCount = value
        }

        /**
         * [taskDefinitionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var taskDefinitionArn: Any? = null

        /**
         * [taskDefinitionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskDefinitionArn(value: String) {
          this.taskDefinitionArn = value
        }
        
        /**
         * [taskDefinitionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskDefinitionArn(value: IntrinsicFunction) {
          this.taskDefinitionArn = value
        }

    }

    @CloudFormationMarker
    class InputTransformer {
            /**
         * [inputPathsMap](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var inputPathsMap: Any? = null

        /**
         * [inputPathsMap](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun inputPathsMap(value: Map<String, Any>) {
          this.inputPathsMap = value
        }
        
        /**
         * [inputTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var inputTemplate: Any? = null

        /**
         * [inputTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun inputTemplate(value: String) {
          this.inputTemplate = value
        }
        
        /**
         * [inputTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun inputTemplate(value: IntrinsicFunction) {
          this.inputTemplate = value
        }

    }

    @CloudFormationMarker
    class KinesisParameters {
            /**
         * [partitionKeyPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var partitionKeyPath: Any? = null

        /**
         * [partitionKeyPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun partitionKeyPath(value: String) {
          this.partitionKeyPath = value
        }
        
        /**
         * [partitionKeyPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun partitionKeyPath(value: IntrinsicFunction) {
          this.partitionKeyPath = value
        }

    }

    @CloudFormationMarker
    class RunCommandParameters {
            /**
         * [runCommandTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets)
         *
         * _Required_: yes
         *
         * _Type_: List<RunCommandTarget>
         */
        var runCommandTargets: Any? = null

        /**
         * [runCommandTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets)
         *
         * _Required_: yes
         *
         * _Type_: List<RunCommandTarget>
         */
        fun runCommandTargets(value: List<RunCommandTarget>) {
          this.runCommandTargets = value
        }
        
        /**
         * [runCommandTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets)
         *
         * _Required_: yes
         *
         * _Type_: List<RunCommandTarget>
         */
        fun runCommandTargets(vararg value: IntrinsicFunction) {
          this.runCommandTargets = value
        }

    }

    @CloudFormationMarker
    class RunCommandTarget {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

    @CloudFormationMarker
    class SqsParameters {
            /**
         * [messageGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var messageGroupId: Any? = null

        /**
         * [messageGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun messageGroupId(value: String) {
          this.messageGroupId = value
        }
        
        /**
         * [messageGroupId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun messageGroupId(value: IntrinsicFunction) {
          this.messageGroupId = value
        }

    }

    @CloudFormationMarker
    class Target {
            /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var arn: Any? = null

        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun arn(value: String) {
          this.arn = value
        }
        
        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun arn(value: IntrinsicFunction) {
          this.arn = value
        }

        /**
         * [ecsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-ecsparameters)
         *
         * _Required_: no
         *
         * _Type_: EcsParameters
         */
        var ecsParameters: Any? = null

        /**
         * [ecsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-ecsparameters)
         *
         * _Required_: no
         *
         * _Type_: EcsParameters
         */
        fun ecsParameters(value: EcsParameters) {
          this.ecsParameters = value
        }
        
        /**
         * [ecsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-ecsparameters)
         *
         * _Required_: no
         *
         * _Type_: EcsParameters
         */
        fun ecsParameters(value: IntrinsicFunction) {
          this.ecsParameters = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var input: Any? = null

        /**
         * [input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: String) {
          this.input = value
        }
        
        /**
         * [input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun input(value: IntrinsicFunction) {
          this.input = value
        }

        /**
         * [inputPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var inputPath: Any? = null

        /**
         * [inputPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputPath(value: String) {
          this.inputPath = value
        }
        
        /**
         * [inputPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputPath(value: IntrinsicFunction) {
          this.inputPath = value
        }

        /**
         * [inputTransformer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputtransformer)
         *
         * _Required_: no
         *
         * _Type_: InputTransformer
         */
        var inputTransformer: Any? = null

        /**
         * [inputTransformer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputtransformer)
         *
         * _Required_: no
         *
         * _Type_: InputTransformer
         */
        fun inputTransformer(value: InputTransformer) {
          this.inputTransformer = value
        }
        
        /**
         * [inputTransformer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputtransformer)
         *
         * _Required_: no
         *
         * _Type_: InputTransformer
         */
        fun inputTransformer(value: IntrinsicFunction) {
          this.inputTransformer = value
        }

        /**
         * [kinesisParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-kinesisparameters)
         *
         * _Required_: no
         *
         * _Type_: KinesisParameters
         */
        var kinesisParameters: Any? = null

        /**
         * [kinesisParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-kinesisparameters)
         *
         * _Required_: no
         *
         * _Type_: KinesisParameters
         */
        fun kinesisParameters(value: KinesisParameters) {
          this.kinesisParameters = value
        }
        
        /**
         * [kinesisParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-kinesisparameters)
         *
         * _Required_: no
         *
         * _Type_: KinesisParameters
         */
        fun kinesisParameters(value: IntrinsicFunction) {
          this.kinesisParameters = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [runCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-runcommandparameters)
         *
         * _Required_: no
         *
         * _Type_: RunCommandParameters
         */
        var runCommandParameters: Any? = null

        /**
         * [runCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-runcommandparameters)
         *
         * _Required_: no
         *
         * _Type_: RunCommandParameters
         */
        fun runCommandParameters(value: RunCommandParameters) {
          this.runCommandParameters = value
        }
        
        /**
         * [runCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-runcommandparameters)
         *
         * _Required_: no
         *
         * _Type_: RunCommandParameters
         */
        fun runCommandParameters(value: IntrinsicFunction) {
          this.runCommandParameters = value
        }

        /**
         * [sqsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sqsparameters)
         *
         * _Required_: no
         *
         * _Type_: SqsParameters
         */
        var sqsParameters: Any? = null

        /**
         * [sqsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sqsparameters)
         *
         * _Required_: no
         *
         * _Type_: SqsParameters
         */
        fun sqsParameters(value: SqsParameters) {
          this.sqsParameters = value
        }
        
        /**
         * [sqsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sqsparameters)
         *
         * _Required_: no
         *
         * _Type_: SqsParameters
         */
        fun sqsParameters(value: IntrinsicFunction) {
          this.sqsParameters = value
        }

    }

}

/**
 * [AWS::Events::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html)
 */
fun Resources.awsEventsRule(logicalId: String, init: AWSEventsRule.() -> Unit = {}): AWSEventsRule {
    return AWSEventsRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
