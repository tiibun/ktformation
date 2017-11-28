
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Method - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
 */
@CloudFormationMarker
class AWSApiGatewayMethod(logicalId: String) : Resource<AWSApiGatewayMethod.Properties>(logicalId, "AWS::ApiGateway::Method") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var apiKeyRequired: Any? = null
        fun apiKeyRequired(value: Boolean?) { this.apiKeyRequired = value }
        fun apiKeyRequired(value: IntrinsicFunction) { this.apiKeyRequired = value }
        @JvmField var authorizationType: Any? = null
        fun authorizationType(value: String?) { this.authorizationType = value }
        fun authorizationType(value: IntrinsicFunction) { this.authorizationType = value }
        @JvmField var authorizerId: Any? = null
        fun authorizerId(value: String?) { this.authorizerId = value }
        fun authorizerId(value: IntrinsicFunction) { this.authorizerId = value }
        @JvmField var httpMethod: Any? = null
        fun httpMethod(value: String) { this.httpMethod = value }
        fun httpMethod(value: IntrinsicFunction) { this.httpMethod = value }
        @JvmField var integration: Any? = null
        fun integration(value: Integration?) { this.integration = value }
        fun integration(value: IntrinsicFunction) { this.integration = value }
        @JvmField var methodResponses: Any? = null
        fun methodResponses(value: List<MethodResponse>?) { this.methodResponses = value }
        fun methodResponses(vararg value: IntrinsicFunction) { this.methodResponses = value }
        @JvmField var operationName: Any? = null
        fun operationName(value: String?) { this.operationName = value }
        fun operationName(value: IntrinsicFunction) { this.operationName = value }
        @JvmField var requestModels: Any? = null
        fun requestModels(value: Map<String, String>?) { this.requestModels = value }
        fun requestModels(value: IntrinsicFunction) { this.requestModels = value }
        @JvmField var requestParameters: Any? = null
        fun requestParameters(value: Map<String, Boolean>?) { this.requestParameters = value }
        fun requestParameters(value: IntrinsicFunction) { this.requestParameters = value }
        @JvmField var requestValidatorId: Any? = null
        fun requestValidatorId(value: String?) { this.requestValidatorId = value }
        fun requestValidatorId(value: IntrinsicFunction) { this.requestValidatorId = value }
        @JvmField var resourceId: Any? = null
        fun resourceId(value: String) { this.resourceId = value }
        fun resourceId(value: IntrinsicFunction) { this.resourceId = value }
        @JvmField var restApiId: Any? = null
        fun restApiId(value: String) { this.restApiId = value }
        fun restApiId(value: IntrinsicFunction) { this.restApiId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Integration(
            val cacheKeyParameters: List<String>? = null,
            val cacheNamespace: String? = null,
            val contentHandling: String? = null,
            val credentials: String? = null,
            val integrationHttpMethod: String? = null,
            val integrationResponses: List<IntegrationResponse>? = null,
            val passthroughBehavior: String? = null,
            val requestParameters: Map<String, String>? = null,
            val requestTemplates: Map<String, String>? = null,
            val type: String? = null,
            val uri: String? = null
    )

    class IntegrationResponse(
            val contentHandling: String? = null,
            val responseParameters: Map<String, String>? = null,
            val responseTemplates: Map<String, String>? = null,
            val selectionPattern: String? = null,
            val statusCode: String
    )

    class MethodResponse(
            val responseModels: Map<String, String>? = null,
            val responseParameters: Map<String, Boolean>? = null,
            val statusCode: String
    )

}

fun Resources.awsApiGatewayMethod(logicalId: String, init: AWSApiGatewayMethod.() -> Unit = {}): AWSApiGatewayMethod {
    return AWSApiGatewayMethod(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
