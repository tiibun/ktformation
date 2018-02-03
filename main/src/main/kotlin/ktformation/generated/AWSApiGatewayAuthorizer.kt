
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Authorizer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html)
 */
@CloudFormationMarker
class AWSApiGatewayAuthorizer(logicalId: String) : Resource<AWSApiGatewayAuthorizer.Properties>(logicalId, "AWS::ApiGateway::Authorizer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var authType: Any? = null

        fun authType(value: String) {
          this.authType = value
        }
        
        fun authType(value: IntrinsicFunction) {
          this.authType = value
        }
        
        @JvmField
        var authorizerCredentials: Any? = null

        fun authorizerCredentials(value: String) {
          this.authorizerCredentials = value
        }
        
        fun authorizerCredentials(value: IntrinsicFunction) {
          this.authorizerCredentials = value
        }
        
        @JvmField
        var authorizerResultTtlInSeconds: Any? = null

        fun authorizerResultTtlInSeconds(value: Int) {
          this.authorizerResultTtlInSeconds = value
        }
        
        fun authorizerResultTtlInSeconds(value: IntrinsicFunction) {
          this.authorizerResultTtlInSeconds = value
        }
        
        @JvmField
        var authorizerUri: Any? = null

        fun authorizerUri(value: String) {
          this.authorizerUri = value
        }
        
        fun authorizerUri(value: IntrinsicFunction) {
          this.authorizerUri = value
        }
        
        @JvmField
        var identitySource: Any? = null

        fun identitySource(value: String) {
          this.identitySource = value
        }
        
        fun identitySource(value: IntrinsicFunction) {
          this.identitySource = value
        }
        
        @JvmField
        var identityValidationExpression: Any? = null

        fun identityValidationExpression(value: String) {
          this.identityValidationExpression = value
        }
        
        fun identityValidationExpression(value: IntrinsicFunction) {
          this.identityValidationExpression = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var providerARNs: Any? = null

        fun providerARNs(value: List<String>) {
          this.providerARNs = value
        }
        
        fun providerARNs(vararg value: IntrinsicFunction) {
          this.providerARNs = value
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
        var type: Any? = null

        fun type(value: String) {
          this.type = value
        }
        
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayAuthorizer(logicalId: String, init: AWSApiGatewayAuthorizer.() -> Unit = {}): AWSApiGatewayAuthorizer {
    return AWSApiGatewayAuthorizer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
