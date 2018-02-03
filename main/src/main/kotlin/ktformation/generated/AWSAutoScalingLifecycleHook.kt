
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::LifecycleHook - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html)
 */
@CloudFormationMarker
class AWSAutoScalingLifecycleHook(logicalId: String) : Resource<AWSAutoScalingLifecycleHook.Properties>(logicalId, "AWS::AutoScaling::LifecycleHook") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var autoScalingGroupName: Any? = null

        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: String) {
          this.autoScalingGroupName = value
        }
        
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: IntrinsicFunction) {
          this.autoScalingGroupName = value
        }
        
        /**
         * [defaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var defaultResult: Any? = null

        /**
         * [defaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultResult(value: String) {
          this.defaultResult = value
        }
        
        /**
         * [defaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultResult(value: IntrinsicFunction) {
          this.defaultResult = value
        }
        
        /**
         * [heartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var heartbeatTimeout: Any? = null

        /**
         * [heartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun heartbeatTimeout(value: Int) {
          this.heartbeatTimeout = value
        }
        
        /**
         * [heartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun heartbeatTimeout(value: IntrinsicFunction) {
          this.heartbeatTimeout = value
        }
        
        /**
         * [lifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var lifecycleHookName: Any? = null

        /**
         * [lifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun lifecycleHookName(value: String) {
          this.lifecycleHookName = value
        }
        
        /**
         * [lifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun lifecycleHookName(value: IntrinsicFunction) {
          this.lifecycleHookName = value
        }
        
        /**
         * [lifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var lifecycleTransition: Any? = null

        /**
         * [lifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lifecycleTransition(value: String) {
          this.lifecycleTransition = value
        }
        
        /**
         * [lifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lifecycleTransition(value: IntrinsicFunction) {
          this.lifecycleTransition = value
        }
        
        /**
         * [notificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var notificationMetadata: Any? = null

        /**
         * [notificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationMetadata(value: String) {
          this.notificationMetadata = value
        }
        
        /**
         * [notificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationMetadata(value: IntrinsicFunction) {
          this.notificationMetadata = value
        }
        
        /**
         * [notificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var notificationTargetARN: Any? = null

        /**
         * [notificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTargetARN(value: String) {
          this.notificationTargetARN = value
        }
        
        /**
         * [notificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTargetARN(value: IntrinsicFunction) {
          this.notificationTargetARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::AutoScaling::LifecycleHook - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html)
 */
fun Resources.awsAutoScalingLifecycleHook(logicalId: String, init: AWSAutoScalingLifecycleHook.() -> Unit = {}): AWSAutoScalingLifecycleHook {
    return AWSAutoScalingLifecycleHook(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
