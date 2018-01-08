
package ktformation.generated

import ktformation.*

/**
 * [AWS::CertificateManager::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
 */
@CloudFormationMarker
class AWSCertificateManagerCertificate(logicalId: String) : Resource<AWSCertificateManagerCertificate.Properties>(logicalId, "AWS::CertificateManager::Certificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var domainName: Any? = null

        fun domainName(value: String) {
          this.domainName = value
        }
        fun domainName(value: IntrinsicFunction) {
  this.domainName = value
}
        @JvmField
        var domainValidationOptions: Any? = null

        fun domainValidationOptions(value: List<DomainValidationOption>) {
          this.domainValidationOptions = value
        }
        fun domainValidationOptions(vararg value: IntrinsicFunction) {
  this.domainValidationOptions = value
}
        @JvmField
        var subjectAlternativeNames: Any? = null

        fun subjectAlternativeNames(value: List<String>) {
          this.subjectAlternativeNames = value
        }
        fun subjectAlternativeNames(vararg value: IntrinsicFunction) {
  this.subjectAlternativeNames = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DomainValidationOption(
            val domainName: String,
            val validationDomain: String
    )

}

fun Resources.awsCertificateManagerCertificate(logicalId: String, init: AWSCertificateManagerCertificate.() -> Unit = {}): AWSCertificateManagerCertificate {
    return AWSCertificateManagerCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
