
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EcsParameters(
            /**
             * [TaskCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val taskCount: Int? = null,
            /**
             * [TaskDefinitionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val taskDefinitionArn: String
    )

    class InputTransformer(
            /**
             * [InputPathsMap](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val inputPathsMap: Map<String, Any>? = null,
            /**
             * [InputTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val inputTemplate: String
    )

    class KinesisParameters(
            /**
             * [PartitionKeyPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val partitionKeyPath: String
    )

    class RunCommandParameters(
            /**
             * [RunCommandTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets)
             *
             * _Required_: yes
             *
             * _Type_: List<RunCommandTarget>
             */
            val runCommandTargets: List<RunCommandTarget>
    )

    class RunCommandTarget(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val values: List<String>
    )

    class Target(
            /**
             * [Arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val arn: String,
            /**
             * [EcsParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-ecsparameters)
             *
             * _Required_: no
             *
             * _Type_: EcsParameters
             */
            val ecsParameters: EcsParameters? = null,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val input: String? = null,
            /**
             * [InputPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val inputPath: String? = null,
            /**
             * [InputTransformer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputtransformer)
             *
             * _Required_: no
             *
             * _Type_: InputTransformer
             */
            val inputTransformer: InputTransformer? = null,
            /**
             * [KinesisParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-kinesisparameters)
             *
             * _Required_: no
             *
             * _Type_: KinesisParameters
             */
            val kinesisParameters: KinesisParameters? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val roleArn: String? = null,
            /**
             * [RunCommandParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-runcommandparameters)
             *
             * _Required_: no
             *
             * _Type_: RunCommandParameters
             */
            val runCommandParameters: RunCommandParameters? = null
    )

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
