
package ktformation.generated

import ktformation.*

/**
 * [AWS::CertificateManager::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
 */
@CloudFormationMarker
class AWSCertificateManagerCertificate(logicalId: String) : Resource<AWSCertificateManagerCertificate.Properties>(logicalId, "AWS::CertificateManager::Certificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }

        /**
         * [domainValidationOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
         *
         * _Required_: no
         *
         * _Type_: List<DomainValidationOption>
         */
        @JvmField
        var domainValidationOptions: Any? = null

        /**
         * [domainValidationOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
         *
         * _Required_: no
         *
         * _Type_: List<DomainValidationOption>
         */
        fun domainValidationOptions(value: List<DomainValidationOption>) {
          this.domainValidationOptions = value
        }
        
        /**
         * [domainValidationOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
         *
         * _Required_: no
         *
         * _Type_: List<DomainValidationOption>
         */
        fun domainValidationOptions(vararg value: IntrinsicFunction) {
          this.domainValidationOptions = value
        }

        /**
         * [subjectAlternativeNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var subjectAlternativeNames: Any? = null

        /**
         * [subjectAlternativeNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subjectAlternativeNames(value: List<String>) {
          this.subjectAlternativeNames = value
        }
        
        /**
         * [subjectAlternativeNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subjectAlternativeNames(vararg value: IntrinsicFunction) {
          this.subjectAlternativeNames = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [validationMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var validationMethod: Any? = null

        /**
         * [validationMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun validationMethod(value: String) {
          this.validationMethod = value
        }
        
        /**
         * [validationMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun validationMethod(value: IntrinsicFunction) {
          this.validationMethod = value
        }

        /**
        * [DomainValidationOption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html)
        */
        fun domainValidationOption(init: DomainValidationOption.() -> Unit = {}): DomainValidationOption {
            return DomainValidationOption().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class DomainValidationOption {
            /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }

        /**
         * [validationDomain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var validationDomain: Any? = null

        /**
         * [validationDomain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun validationDomain(value: String) {
          this.validationDomain = value
        }
        
        /**
         * [validationDomain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun validationDomain(value: IntrinsicFunction) {
          this.validationDomain = value
        }

    }

}

/**
 * [AWS::CertificateManager::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
 */
fun Resources.awsCertificateManagerCertificate(logicalId: String, init: AWSCertificateManagerCertificate.() -> Unit = {}): AWSCertificateManagerCertificate {
    return AWSCertificateManagerCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
