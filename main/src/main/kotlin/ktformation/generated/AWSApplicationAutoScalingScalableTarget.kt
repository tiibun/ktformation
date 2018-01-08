
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApplicationAutoScaling::ScalableTarget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
 */
@CloudFormationMarker
class AWSApplicationAutoScalingScalableTarget(logicalId: String) : Resource<AWSApplicationAutoScalingScalableTarget.Properties>(logicalId, "AWS::ApplicationAutoScaling::ScalableTarget") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var maxCapacity: Any? = null

        fun maxCapacity(value: Int) {
          this.maxCapacity = value
        }
        fun maxCapacity(value: IntrinsicFunction) {
  this.maxCapacity = value
}
        @JvmField
        var minCapacity: Any? = null

        fun minCapacity(value: Int) {
          this.minCapacity = value
        }
        fun minCapacity(value: IntrinsicFunction) {
  this.minCapacity = value
}
        @JvmField
        var resourceId: Any? = null

        fun resourceId(value: String) {
          this.resourceId = value
        }
        fun resourceId(value: IntrinsicFunction) {
  this.resourceId = value
}
        @JvmField
        var roleARN: Any? = null

        fun roleARN(value: String) {
          this.roleARN = value
        }
        fun roleARN(value: IntrinsicFunction) {
  this.roleARN = value
}
        @JvmField
        var scalableDimension: Any? = null

        fun scalableDimension(value: String) {
          this.scalableDimension = value
        }
        fun scalableDimension(value: IntrinsicFunction) {
  this.scalableDimension = value
}
        @JvmField
        var scheduledActions: Any? = null

        fun scheduledActions(value: List<ScheduledAction>) {
          this.scheduledActions = value
        }
        fun scheduledActions(vararg value: IntrinsicFunction) {
  this.scheduledActions = value
}
        @JvmField
        var serviceNamespace: Any? = null

        fun serviceNamespace(value: String) {
          this.serviceNamespace = value
        }
        fun serviceNamespace(value: IntrinsicFunction) {
  this.serviceNamespace = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ScalableTargetAction(
            val maxCapacity: Int? = null,
            val minCapacity: Int? = null
    )

    class ScheduledAction(
            val endTime: java.util.Date? = null,
            val scalableTargetAction: ScalableTargetAction? = null,
            val schedule: String,
            val scheduledActionName: String,
            val startTime: java.util.Date? = null
    )

}

fun Resources.awsApplicationAutoScalingScalableTarget(logicalId: String, init: AWSApplicationAutoScalingScalableTarget.() -> Unit = {}): AWSApplicationAutoScalingScalableTarget {
    return AWSApplicationAutoScalingScalableTarget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
