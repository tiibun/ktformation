
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::ScheduledAction - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html)
 */
@CloudFormationMarker
class AWSAutoScalingScheduledAction(logicalId: String) : Resource<AWSAutoScalingScheduledAction.Properties>(logicalId, "AWS::AutoScaling::ScheduledAction") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var autoScalingGroupName: Any? = null

        fun autoScalingGroupName(value: String) {
          this.autoScalingGroupName = value
        }
        
        fun autoScalingGroupName(value: IntrinsicFunction) {
          this.autoScalingGroupName = value
        }
        
        @JvmField
        var desiredCapacity: Any? = null

        fun desiredCapacity(value: Int) {
          this.desiredCapacity = value
        }
        
        fun desiredCapacity(value: IntrinsicFunction) {
          this.desiredCapacity = value
        }
        
        @JvmField
        var endTime: Any? = null

        fun endTime(value: String) {
          this.endTime = value
        }
        
        fun endTime(value: IntrinsicFunction) {
          this.endTime = value
        }
        
        @JvmField
        var maxSize: Any? = null

        fun maxSize(value: Int) {
          this.maxSize = value
        }
        
        fun maxSize(value: IntrinsicFunction) {
          this.maxSize = value
        }
        
        @JvmField
        var minSize: Any? = null

        fun minSize(value: Int) {
          this.minSize = value
        }
        
        fun minSize(value: IntrinsicFunction) {
          this.minSize = value
        }
        
        @JvmField
        var recurrence: Any? = null

        fun recurrence(value: String) {
          this.recurrence = value
        }
        
        fun recurrence(value: IntrinsicFunction) {
          this.recurrence = value
        }
        
        @JvmField
        var startTime: Any? = null

        fun startTime(value: String) {
          this.startTime = value
        }
        
        fun startTime(value: IntrinsicFunction) {
          this.startTime = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsAutoScalingScheduledAction(logicalId: String, init: AWSAutoScalingScheduledAction.() -> Unit = {}): AWSAutoScalingScheduledAction {
    return AWSAutoScalingScheduledAction(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
