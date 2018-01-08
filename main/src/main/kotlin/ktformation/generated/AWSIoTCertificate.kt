
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html)
 */
@CloudFormationMarker
class AWSIoTCertificate(logicalId: String) : Resource<AWSIoTCertificate.Properties>(logicalId, "AWS::IoT::Certificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var certificateSigningRequest: Any? = null

        fun certificateSigningRequest(value: String) {
          this.certificateSigningRequest = value
        }
        fun certificateSigningRequest(value: IntrinsicFunction) {
  this.certificateSigningRequest = value
}
        @JvmField
        var status: Any? = null

        fun status(value: String) {
          this.status = value
        }
        fun status(value: IntrinsicFunction) {
  this.status = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIoTCertificate(logicalId: String, init: AWSIoTCertificate.() -> Unit = {}): AWSIoTCertificate {
    return AWSIoTCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
