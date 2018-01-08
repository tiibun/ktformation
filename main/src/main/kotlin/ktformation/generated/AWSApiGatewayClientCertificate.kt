
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::ClientCertificate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html)
 */
@CloudFormationMarker
class AWSApiGatewayClientCertificate(logicalId: String) : Resource<AWSApiGatewayClientCertificate.Properties>(logicalId, "AWS::ApiGateway::ClientCertificate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayClientCertificate(logicalId: String, init: AWSApiGatewayClientCertificate.() -> Unit = {}): AWSApiGatewayClientCertificate {
    return AWSApiGatewayClientCertificate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
