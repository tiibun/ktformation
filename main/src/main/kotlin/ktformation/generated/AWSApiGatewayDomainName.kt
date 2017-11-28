
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::DomainName - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
 */
@CloudFormationMarker
class AWSApiGatewayDomainName(logicalId: String) : Resource<AWSApiGatewayDomainName.Properties>(logicalId, "AWS::ApiGateway::DomainName") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var certificateArn: Any? = null
        fun certificateArn(value: String?) { this.certificateArn = value }
        fun certificateArn(value: IntrinsicFunction) { this.certificateArn = value }
        @JvmField var domainName: Any? = null
        fun domainName(value: String) { this.domainName = value }
        fun domainName(value: IntrinsicFunction) { this.domainName = value }
        @JvmField var endpointConfiguration: Any? = null
        fun endpointConfiguration(value: EndpointConfiguration?) { this.endpointConfiguration = value }
        fun endpointConfiguration(value: IntrinsicFunction) { this.endpointConfiguration = value }
        @JvmField var regionalCertificateArn: Any? = null
        fun regionalCertificateArn(value: String?) { this.regionalCertificateArn = value }
        fun regionalCertificateArn(value: IntrinsicFunction) { this.regionalCertificateArn = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EndpointConfiguration(
            val types: List<String>? = null
    )

}

fun Resources.awsApiGatewayDomainName(logicalId: String, init: AWSApiGatewayDomainName.() -> Unit = {}): AWSApiGatewayDomainName {
    return AWSApiGatewayDomainName(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
