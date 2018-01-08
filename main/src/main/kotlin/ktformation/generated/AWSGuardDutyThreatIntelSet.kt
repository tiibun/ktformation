
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::ThreatIntelSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html)
 */
@CloudFormationMarker
class AWSGuardDutyThreatIntelSet(logicalId: String) : Resource<AWSGuardDutyThreatIntelSet.Properties>(logicalId, "AWS::GuardDuty::ThreatIntelSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var activate: Any? = null

        fun activate(value: Boolean) {
          this.activate = value
        }
        fun activate(value: IntrinsicFunction) {
  this.activate = value
}
        @JvmField
        var detectorId: Any? = null

        fun detectorId(value: String) {
          this.detectorId = value
        }
        fun detectorId(value: IntrinsicFunction) {
  this.detectorId = value
}
        @JvmField
        var format: Any? = null

        fun format(value: String) {
          this.format = value
        }
        fun format(value: IntrinsicFunction) {
  this.format = value
}
        @JvmField
        var location: Any? = null

        fun location(value: String) {
          this.location = value
        }
        fun location(value: IntrinsicFunction) {
  this.location = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsGuardDutyThreatIntelSet(logicalId: String, init: AWSGuardDutyThreatIntelSet.() -> Unit = {}): AWSGuardDutyThreatIntelSet {
    return AWSGuardDutyThreatIntelSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
