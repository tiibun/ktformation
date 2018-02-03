
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::GatewayResponse - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
 */
@CloudFormationMarker
class AWSApiGatewayGatewayResponse(logicalId: String) : Resource<AWSApiGatewayGatewayResponse.Properties>(logicalId, "AWS::ApiGateway::GatewayResponse") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var responseParameters: Any? = null

        fun responseParameters(value: Map<String, Any>) {
          this.responseParameters = value
        }
        
        @JvmField
        var responseTemplates: Any? = null

        fun responseTemplates(value: Map<String, Any>) {
          this.responseTemplates = value
        }
        
        @JvmField
        var responseType: Any? = null

        fun responseType(value: String) {
          this.responseType = value
        }
        
        fun responseType(value: IntrinsicFunction) {
          this.responseType = value
        }
        
        @JvmField
        var restApiId: Any? = null

        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        @JvmField
        var statusCode: Any? = null

        fun statusCode(value: String) {
          this.statusCode = value
        }
        
        fun statusCode(value: IntrinsicFunction) {
          this.statusCode = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayGatewayResponse(logicalId: String, init: AWSApiGatewayGatewayResponse.() -> Unit = {}): AWSApiGatewayGatewayResponse {
    return AWSApiGatewayGatewayResponse(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
