
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::Detector - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
 */
@CloudFormationMarker
class AWSGuardDutyDetector(logicalId: String) : Resource<AWSGuardDutyDetector.Properties>(logicalId, "AWS::GuardDuty::Detector") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var enable: Any? = null

        /**
         * [enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enable(value: Boolean) {
          this.enable = value
        }
        
        /**
         * [enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enable(value: IntrinsicFunction) {
          this.enable = value
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
 * [AWS::GuardDuty::Detector - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
 */
fun Resources.awsGuardDutyDetector(logicalId: String, init: AWSGuardDutyDetector.() -> Unit = {}): AWSGuardDutyDetector {
    return AWSGuardDutyDetector(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
