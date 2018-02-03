
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html)
 */
@CloudFormationMarker
class AWSDMSCertificate(logicalId: String) : Resource<AWSDMSCertificate.Properties>(logicalId, "AWS::DMS::Certificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [certificateIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var certificateIdentifier: Any? = null

        /**
         * [certificateIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateIdentifier(value: String) {
          this.certificateIdentifier = value
        }
        
        /**
         * [certificateIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateIdentifier(value: IntrinsicFunction) {
          this.certificateIdentifier = value
        }
        
        /**
         * [certificatePem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var certificatePem: Any? = null

        /**
         * [certificatePem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificatePem(value: String) {
          this.certificatePem = value
        }
        
        /**
         * [certificatePem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificatePem(value: IntrinsicFunction) {
          this.certificatePem = value
        }
        
        /**
         * [certificateWallet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var certificateWallet: Any? = null

        /**
         * [certificateWallet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateWallet(value: String) {
          this.certificateWallet = value
        }
        
        /**
         * [certificateWallet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::DMS::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html)
 */
fun Resources.awsDMSCertificate(logicalId: String, init: AWSDMSCertificate.() -> Unit = {}): AWSDMSCertificate {
    return AWSDMSCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
