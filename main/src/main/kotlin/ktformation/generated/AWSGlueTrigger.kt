
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Trigger - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html)
 */
@CloudFormationMarker
class AWSGlueTrigger(logicalId: String) : Resource<AWSGlueTrigger.Properties>(logicalId, "AWS::Glue::Trigger") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var actions: Any? = null
        fun actions(value: List<Action>) { this.actions = value }
        fun actions(vararg value: IntrinsicFunction) { this.actions = value }
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var predicate: Any? = null
        fun predicate(value: Predicate?) { this.predicate = value }
        fun predicate(value: IntrinsicFunction) { this.predicate = value }
        @JvmField var schedule: Any? = null
        fun schedule(value: String?) { this.schedule = value }
        fun schedule(value: IntrinsicFunction) { this.schedule = value }
        @JvmField var type: Any? = null
        fun type(value: String) { this.type = value }
        fun type(value: IntrinsicFunction) { this.type = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Action(
            val arguments: Json? = null,
            val jobName: String? = null
    )

    class Condition(
            val jobName: String? = null,
            val logicalOperator: String? = null,
            val state: String? = null
    )

    class Predicate(
            val conditions: List<Condition>? = null,
            val logical: String? = null
    )

}

fun Resources.awsGlueTrigger(logicalId: String, init: AWSGlueTrigger.() -> Unit = {}): AWSGlueTrigger {
    return AWSGlueTrigger(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
