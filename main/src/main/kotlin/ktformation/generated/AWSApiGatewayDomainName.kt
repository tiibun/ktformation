
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::DomainName - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
 */
@CloudFormationMarker
class AWSApiGatewayDomainName(logicalId: String) : Resource<AWSApiGatewayDomainName.Properties>(logicalId, "AWS::ApiGateway::DomainName") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var certificateArn: Any? = null

        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateArn(value: String) {
          this.certificateArn = value
        }
        
        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateArn(value: IntrinsicFunction) {
          this.certificateArn = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }
        
        /**
         * [endpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EndpointConfiguration
         */
        @JvmField
        var endpointConfiguration: Any? = null

        /**
         * [endpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EndpointConfiguration
         */
        fun endpointConfiguration(value: EndpointConfiguration) {
          this.endpointConfiguration = value
        }
        
        /**
         * [endpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-endpointconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EndpointConfiguration
         */
        fun endpointConfiguration(value: IntrinsicFunction) {
          this.endpointConfiguration = value
        }
        
        /**
         * [regionalCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var regionalCertificateArn: Any? = null

        /**
         * [regionalCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun regionalCertificateArn(value: String) {
          this.regionalCertificateArn = value
        }
        
        /**
         * [regionalCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun regionalCertificateArn(value: IntrinsicFunction) {
          this.regionalCertificateArn = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EndpointConfiguration(
            /**
             * [Types](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val types: List<String>? = null
    )

}

/**
 * [AWS::ApiGateway::DomainName - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
 */
fun Resources.awsApiGatewayDomainName(logicalId: String, init: AWSApiGatewayDomainName.() -> Unit = {}): AWSApiGatewayDomainName {
    return AWSApiGatewayDomainName(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
