
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApplicationAutoScaling::ScalableTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
 */
@CloudFormationMarker
class AWSApplicationAutoScalingScalableTarget(logicalId: String) : Resource<AWSApplicationAutoScalingScalableTarget.Properties>(logicalId, "AWS::ApplicationAutoScaling::ScalableTarget") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var maxCapacity: Any? = null

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxCapacity(value: IntrinsicFunction) {
          this.maxCapacity = value
        }

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var minCapacity: Any? = null

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        
        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minCapacity(value: IntrinsicFunction) {
          this.minCapacity = value
        }

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceId: Any? = null

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: String) {
          this.resourceId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: IntrinsicFunction) {
          this.resourceId = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var scalableDimension: Any? = null

        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scalableDimension(value: String) {
          this.scalableDimension = value
        }
        
        /**
         * [scalableDimension](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scalableDimension(value: IntrinsicFunction) {
          this.scalableDimension = value
        }

        /**
         * [scheduledActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
         *
         * _Required_: no
         *
         * _Type_: List<ScheduledAction>
         */
        @JvmField
        var scheduledActions: Any? = null

        /**
         * [scheduledActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
         *
         * _Required_: no
         *
         * _Type_: List<ScheduledAction>
         */
        fun scheduledActions(value: List<ScheduledAction>) {
          this.scheduledActions = value
        }
        
        /**
         * [scheduledActions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
         *
         * _Required_: no
         *
         * _Type_: List<ScheduledAction>
         */
        fun scheduledActions(vararg value: IntrinsicFunction) {
          this.scheduledActions = value
        }

        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceNamespace: Any? = null

        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceNamespace(value: String) {
          this.serviceNamespace = value
        }
        
        /**
         * [serviceNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceNamespace(value: IntrinsicFunction) {
          this.serviceNamespace = value
        }

        /**
        * [ScalableTargetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html)
        */
        fun scalableTargetAction(init: ScalableTargetAction.() -> Unit = {}): ScalableTargetAction {
            return ScalableTargetAction().also {
                it.init()
            }
        }
        /**
        * [ScheduledAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html)
        */
        fun scheduledAction(init: ScheduledAction.() -> Unit = {}): ScheduledAction {
            return ScheduledAction().also {
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
    class ScalableTargetAction {
            /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var maxCapacity: Any? = null

        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        
        /**
         * [maxCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxCapacity(value: IntrinsicFunction) {
          this.maxCapacity = value
        }

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var minCapacity: Any? = null

        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        
        /**
         * [minCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minCapacity(value: IntrinsicFunction) {
          this.minCapacity = value
        }

    }

    @CloudFormationMarker
    class ScheduledAction {
            /**
         * [endTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        var endTime: Any? = null

        /**
         * [endTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun endTime(value: java.util.Date) {
          this.endTime = value
        }
        
        /**
         * [endTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun endTime(value: IntrinsicFunction) {
          this.endTime = value
        }

        /**
         * [scalableTargetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scalabletargetaction)
         *
         * _Required_: no
         *
         * _Type_: ScalableTargetAction
         */
        var scalableTargetAction: Any? = null

        /**
         * [scalableTargetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scalabletargetaction)
         *
         * _Required_: no
         *
         * _Type_: ScalableTargetAction
         */
        fun scalableTargetAction(value: ScalableTargetAction) {
          this.scalableTargetAction = value
        }
        
        /**
         * [scalableTargetAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scalabletargetaction)
         *
         * _Required_: no
         *
         * _Type_: ScalableTargetAction
         */
        fun scalableTargetAction(value: IntrinsicFunction) {
          this.scalableTargetAction = value
        }

        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var schedule: Any? = null

        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun schedule(value: String) {
          this.schedule = value
        }
        
        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun schedule(value: IntrinsicFunction) {
          this.schedule = value
        }

        /**
         * [scheduledActionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var scheduledActionName: Any? = null

        /**
         * [scheduledActionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scheduledActionName(value: String) {
          this.scheduledActionName = value
        }
        
        /**
         * [scheduledActionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scheduledActionName(value: IntrinsicFunction) {
          this.scheduledActionName = value
        }

        /**
         * [startTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        var startTime: Any? = null

        /**
         * [startTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun startTime(value: java.util.Date) {
          this.startTime = value
        }
        
        /**
         * [startTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun startTime(value: IntrinsicFunction) {
          this.startTime = value
        }

    }

}

/**
 * [AWS::ApplicationAutoScaling::ScalableTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
 */
fun Resources.awsApplicationAutoScalingScalableTarget(logicalId: String, init: AWSApplicationAutoScalingScalableTarget.() -> Unit = {}): AWSApplicationAutoScalingScalableTarget {
    return AWSApplicationAutoScalingScalableTarget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
