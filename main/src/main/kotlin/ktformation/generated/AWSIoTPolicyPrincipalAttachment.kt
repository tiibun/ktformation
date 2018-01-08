
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::PolicyPrincipalAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
 */
@CloudFormationMarker
class AWSIoTPolicyPrincipalAttachment(logicalId: String) : Resource<AWSIoTPolicyPrincipalAttachment.Properties>(logicalId, "AWS::IoT::PolicyPrincipalAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var policyName: Any? = null

        fun policyName(value: String) {
          this.policyName = value
        }
        fun policyName(value: IntrinsicFunction) {
  this.policyName = value
}
        @JvmField
        var principal: Any? = null

        fun principal(value: String) {
          this.principal = value
        }
        fun principal(value: IntrinsicFunction) {
  this.principal = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIoTPolicyPrincipalAttachment(logicalId: String, init: AWSIoTPolicyPrincipalAttachment.() -> Unit = {}): AWSIoTPolicyPrincipalAttachment {
    return AWSIoTPolicyPrincipalAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
