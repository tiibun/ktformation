
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::Detector - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
 */
@CloudFormationMarker
class AWSGuardDutyDetector(logicalId: String) : Resource<AWSGuardDutyDetector.Properties>(logicalId, "AWS::GuardDuty::Detector") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var enable: Any? = null

        fun enable(value: Boolean) {
          this.enable = value
        }
        
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

fun Resources.awsGuardDutyDetector(logicalId: String, init: AWSGuardDutyDetector.() -> Unit = {}): AWSGuardDutyDetector {
    return AWSGuardDutyDetector(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
