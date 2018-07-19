
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Trigger - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html)
 */
@CloudFormationMarker
class AWSGlueTrigger(logicalId: String) : Resource<AWSGlueTrigger.Properties>(logicalId, "AWS::Glue::Trigger") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        @JvmField
        var actions: Any? = null

        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun actions(value: List<Action>) {
          this.actions = value
        }
        
        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
         *
         * _Required_: yes
         *
         * _Type_: List<Action>
         */
        fun actions(vararg value: IntrinsicFunction) {
          this.actions = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [predicate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
         *
         * _Required_: no
         *
         * _Type_: Predicate
         */
        @JvmField
        var predicate: Any? = null

        /**
         * [predicate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
         *
         * _Required_: no
         *
         * _Type_: Predicate
         */
        fun predicate(value: Predicate) {
          this.predicate = value
        }
        
        /**
         * [predicate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
         *
         * _Required_: no
         *
         * _Type_: Predicate
         */
        fun predicate(value: IntrinsicFunction) {
          this.predicate = value
        }

        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var schedule: Any? = null

        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun schedule(value: String) {
          this.schedule = value
        }
        
        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun schedule(value: IntrinsicFunction) {
          this.schedule = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
        * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html)
        */
        fun action(init: Action.() -> Unit = {}): Action {
            return Action().also {
                it.init()
            }
        }
        /**
        * [Condition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html)
        */
        fun condition(init: Condition.() -> Unit = {}): Condition {
            return Condition().also {
                it.init()
            }
        }
        /**
        * [Predicate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html)
        */
        fun predicate(init: Predicate.() -> Unit = {}): Predicate {
            return Predicate().also {
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
    class Action {
            /**
         * [arguments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var arguments: Any? = null

        /**
         * [arguments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun arguments(value: Json) {
          this.arguments = value
        }
        
        /**
         * [arguments](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun arguments(value: IntrinsicFunction) {
          this.arguments = value
        }

        /**
         * [jobName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var jobName: Any? = null

        /**
         * [jobName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobName(value: String) {
          this.jobName = value
        }
        
        /**
         * [jobName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobName(value: IntrinsicFunction) {
          this.jobName = value
        }

    }

    @CloudFormationMarker
    class Condition {
            /**
         * [jobName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var jobName: Any? = null

        /**
         * [jobName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobName(value: String) {
          this.jobName = value
        }
        
        /**
         * [jobName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun jobName(value: IntrinsicFunction) {
          this.jobName = value
        }

        /**
         * [logicalOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var logicalOperator: Any? = null

        /**
         * [logicalOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logicalOperator(value: String) {
          this.logicalOperator = value
        }
        
        /**
         * [logicalOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logicalOperator(value: IntrinsicFunction) {
          this.logicalOperator = value
        }

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var state: Any? = null

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: String) {
          this.state = value
        }
        
        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: IntrinsicFunction) {
          this.state = value
        }

    }

    @CloudFormationMarker
    class Predicate {
            /**
         * [conditions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions)
         *
         * _Required_: no
         *
         * _Type_: List<Condition>
         */
        var conditions: Any? = null

        /**
         * [conditions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions)
         *
         * _Required_: no
         *
         * _Type_: List<Condition>
         */
        fun conditions(value: List<Condition>) {
          this.conditions = value
        }
        
        /**
         * [conditions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions)
         *
         * _Required_: no
         *
         * _Type_: List<Condition>
         */
        fun conditions(vararg value: IntrinsicFunction) {
          this.conditions = value
        }

        /**
         * [logical](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var logical: Any? = null

        /**
         * [logical](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logical(value: String) {
          this.logical = value
        }
        
        /**
         * [logical](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logical(value: IntrinsicFunction) {
          this.logical = value
        }

    }

}

/**
 * [AWS::Glue::Trigger - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html)
 */
fun Resources.awsGlueTrigger(logicalId: String, init: AWSGlueTrigger.() -> Unit = {}): AWSGlueTrigger {
    return AWSGlueTrigger(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
