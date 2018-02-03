
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::LifecycleHook - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html)
 */
@CloudFormationMarker
class AWSAutoScalingLifecycleHook(logicalId: String) : Resource<AWSAutoScalingLifecycleHook.Properties>(logicalId, "AWS::AutoScaling::LifecycleHook") {

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
        var defaultResult: Any? = null

        fun defaultResult(value: String) {
          this.defaultResult = value
        }
        
        fun defaultResult(value: IntrinsicFunction) {
          this.defaultResult = value
        }
        
        @JvmField
        var heartbeatTimeout: Any? = null

        fun heartbeatTimeout(value: Int) {
          this.heartbeatTimeout = value
        }
        
        fun heartbeatTimeout(value: IntrinsicFunction) {
          this.heartbeatTimeout = value
        }
        
        @JvmField
        var lifecycleHookName: Any? = null

        fun lifecycleHookName(value: String) {
          this.lifecycleHookName = value
        }
        
        fun lifecycleHookName(value: IntrinsicFunction) {
          this.lifecycleHookName = value
        }
        
        @JvmField
        var lifecycleTransition: Any? = null

        fun lifecycleTransition(value: String) {
          this.lifecycleTransition = value
        }
        
        fun lifecycleTransition(value: IntrinsicFunction) {
          this.lifecycleTransition = value
        }
        
        @JvmField
        var notificationMetadata: Any? = null

        fun notificationMetadata(value: String) {
          this.notificationMetadata = value
        }
        
        fun notificationMetadata(value: IntrinsicFunction) {
          this.notificationMetadata = value
        }
        
        @JvmField
        var notificationTargetARN: Any? = null

        fun notificationTargetARN(value: String) {
          this.notificationTargetARN = value
        }
        
        fun notificationTargetARN(value: IntrinsicFunction) {
          this.notificationTargetARN = value
        }
        
        @JvmField
        var roleARN: Any? = null

        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsAutoScalingLifecycleHook(logicalId: String, init: AWSAutoScalingLifecycleHook.() -> Unit = {}): AWSAutoScalingLifecycleHook {
    return AWSAutoScalingLifecycleHook(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
