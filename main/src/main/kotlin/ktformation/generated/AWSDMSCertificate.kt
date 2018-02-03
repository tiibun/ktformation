
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html)
 */
@CloudFormationMarker
class AWSDMSCertificate(logicalId: String) : Resource<AWSDMSCertificate.Properties>(logicalId, "AWS::DMS::Certificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var certificateIdentifier: Any? = null

        fun certificateIdentifier(value: String) {
          this.certificateIdentifier = value
        }
        
        fun certificateIdentifier(value: IntrinsicFunction) {
          this.certificateIdentifier = value
        }
        
        @JvmField
        var certificatePem: Any? = null

        fun certificatePem(value: String) {
          this.certificatePem = value
        }
        
        fun certificatePem(value: IntrinsicFunction) {
          this.certificatePem = value
        }
        
        @JvmField
        var certificateWallet: Any? = null

        fun certificateWallet(value: String) {
          this.certificateWallet = value
        }
        
        fun certificateWallet(value: IntrinsicFunction) {
          this.certificateWallet = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsDMSCertificate(logicalId: String, init: AWSDMSCertificate.() -> Unit = {}): AWSDMSCertificate {
    return AWSDMSCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
