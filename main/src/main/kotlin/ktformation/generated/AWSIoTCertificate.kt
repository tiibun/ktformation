
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html)
 */
@CloudFormationMarker
class AWSIoTCertificate(logicalId: String) : Resource<AWSIoTCertificate.Properties>(logicalId, "AWS::IoT::Certificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [certificateSigningRequest](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var certificateSigningRequest: Any? = null

        /**
         * [certificateSigningRequest](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun certificateSigningRequest(value: String) {
          this.certificateSigningRequest = value
        }
        
        /**
         * [certificateSigningRequest](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun certificateSigningRequest(value: IntrinsicFunction) {
          this.certificateSigningRequest = value
        }

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::IoT::Certificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html)
 */
fun Resources.awsIoTCertificate(logicalId: String, init: AWSIoTCertificate.() -> Unit = {}): AWSIoTCertificate {
    return AWSIoTCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
