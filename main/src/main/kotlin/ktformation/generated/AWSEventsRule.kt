
package ktformation.generated

import ktformation.*

/**
 * [AWS::Events::Rule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html)
 */
@CloudFormationMarker
class AWSEventsRule(logicalId: String) : Resource<AWSEventsRule.Properties>(logicalId, "AWS::Events::Rule") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var eventPattern: Any? = null
        fun eventPattern(value: Json?) { this.eventPattern = value }
        fun eventPattern(value: IntrinsicFunction) { this.eventPattern = value }
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var roleArn: Any? = null
        fun roleArn(value: String?) { this.roleArn = value }
        fun roleArn(value: IntrinsicFunction) { this.roleArn = value }
        @JvmField var scheduleExpression: Any? = null
        fun scheduleExpression(value: String?) { this.scheduleExpression = value }
        fun scheduleExpression(value: IntrinsicFunction) { this.scheduleExpression = value }
        @JvmField var state: Any? = null
        fun state(value: String?) { this.state = value }
        fun state(value: IntrinsicFunction) { this.state = value }
        @JvmField var targets: Any? = null
        fun targets(value: List<Target>?) { this.targets = value }
        fun targets(vararg value: IntrinsicFunction) { this.targets = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EcsParameters(
            val taskCount: Int? = null,
            val taskDefinitionArn: String
    )

    class InputTransformer(
            val inputPathsMap: Map<String, String>? = null,
            val inputTemplate: String
    )

    class KinesisParameters(
            val partitionKeyPath: String
    )

    class RunCommandParameters(
            val runCommandTargets: List<RunCommandTarget>
    )

    class RunCommandTarget(
            val key: String,
            val values: List<String>
    )

    class Target(
            val arn: String,
            val ecsParameters: EcsParameters? = null,
            val id: String,
            val input: String? = null,
            val inputPath: String? = null,
            val inputTransformer: InputTransformer? = null,
            val kinesisParameters: KinesisParameters? = null,
            val roleArn: String? = null,
            val runCommandParameters: RunCommandParameters? = null
    )

}

fun Resources.awsEventsRule(logicalId: String, init: AWSEventsRule.() -> Unit = {}): AWSEventsRule {
    return AWSEventsRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
