
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::ScheduledAction - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html)
 */
@CloudFormationMarker
class AWSAutoScalingScheduledAction(logicalId: String) : Resource<AWSAutoScalingScheduledAction.Properties>(logicalId, "AWS::AutoScaling::ScheduledAction") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var autoScalingGroupName: Any? = null

        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: String) {
          this.autoScalingGroupName = value
        }
        
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: IntrinsicFunction) {
          this.autoScalingGroupName = value
        }

        /**
         * [desiredCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var desiredCapacity: Any? = null

        /**
         * [desiredCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun desiredCapacity(value: Int) {
          this.desiredCapacity = value
        }
        
        /**
         * [desiredCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun desiredCapacity(value: IntrinsicFunction) {
          this.desiredCapacity = value
        }

        /**
         * [endTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var endTime: Any? = null

        /**
         * [endTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endTime(value: String) {
          this.endTime = value
        }
        
        /**
         * [endTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endTime(value: IntrinsicFunction) {
          this.endTime = value
        }

        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var maxSize: Any? = null

        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxSize(value: Int) {
          this.maxSize = value
        }
        
        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxSize(value: IntrinsicFunction) {
          this.maxSize = value
        }

        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var minSize: Any? = null

        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minSize(value: Int) {
          this.minSize = value
        }
        
        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minSize(value: IntrinsicFunction) {
          this.minSize = value
        }

        /**
         * [recurrence](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var recurrence: Any? = null

        /**
         * [recurrence](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recurrence(value: String) {
          this.recurrence = value
        }
        
        /**
         * [recurrence](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recurrence(value: IntrinsicFunction) {
          this.recurrence = value
        }

        /**
         * [startTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var startTime: Any? = null

        /**
         * [startTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun startTime(value: String) {
          this.startTime = value
        }
        
        /**
         * [startTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::AutoScaling::ScheduledAction - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html)
 */
fun Resources.awsAutoScalingScheduledAction(logicalId: String, init: AWSAutoScalingScheduledAction.() -> Unit = {}): AWSAutoScalingScheduledAction {
    return AWSAutoScalingScheduledAction(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
