
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::RequestValidator - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html)
 */
@CloudFormationMarker
class AWSApiGatewayRequestValidator(logicalId: String) : Resource<AWSApiGatewayRequestValidator.Properties>(logicalId, "AWS::ApiGateway::RequestValidator") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
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
        var validateRequestBody: Any? = null

        fun validateRequestBody(value: Boolean) {
          this.validateRequestBody = value
        }
        fun validateRequestBody(value: IntrinsicFunction) {
  this.validateRequestBody = value
}
        @JvmField
        var validateRequestParameters: Any? = null

        fun validateRequestParameters(value: Boolean) {
          this.validateRequestParameters = value
        }
        fun validateRequestParameters(value: IntrinsicFunction) {
  this.validateRequestParameters = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayRequestValidator(logicalId: String, init: AWSApiGatewayRequestValidator.() -> Unit = {}): AWSApiGatewayRequestValidator {
    return AWSApiGatewayRequestValidator(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
