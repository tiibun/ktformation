
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::Policy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html)
 */
@CloudFormationMarker
class AWSIoTPolicy(logicalId: String) : Resource<AWSIoTPolicy.Properties>(logicalId, "AWS::IoT::Policy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var policyDocument: Any? = null

        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        fun policyDocument(value: IntrinsicFunction) {
  this.policyDocument = value
}
        @JvmField
        var policyName: Any? = null

        fun policyName(value: String) {
          this.policyName = value
        }
        fun policyName(value: IntrinsicFunction) {
  this.policyName = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIoTPolicy(logicalId: String, init: AWSIoTPolicy.() -> Unit = {}): AWSIoTPolicy {
    return AWSIoTPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
