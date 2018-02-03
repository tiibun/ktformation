
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Method - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
 */
@CloudFormationMarker
class AWSApiGatewayMethod(logicalId: String) : Resource<AWSApiGatewayMethod.Properties>(logicalId, "AWS::ApiGateway::Method") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [apiKeyRequired](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var apiKeyRequired: Any? = null

        /**
         * [apiKeyRequired](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun apiKeyRequired(value: Boolean) {
          this.apiKeyRequired = value
        }
        
        /**
         * [apiKeyRequired](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun apiKeyRequired(value: IntrinsicFunction) {
          this.apiKeyRequired = value
        }
        
        /**
         * [authorizationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var authorizationType: Any? = null

        /**
         * [authorizationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizationType(value: String) {
          this.authorizationType = value
        }
        
        /**
         * [authorizationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizationType(value: IntrinsicFunction) {
          this.authorizationType = value
        }
        
        /**
         * [authorizerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var authorizerId: Any? = null

        /**
         * [authorizerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizerId(value: String) {
          this.authorizerId = value
        }
        
        /**
         * [authorizerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizerId(value: IntrinsicFunction) {
          this.authorizerId = value
        }
        
        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var httpMethod: Any? = null

        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun httpMethod(value: String) {
          this.httpMethod = value
        }
        
        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun httpMethod(value: IntrinsicFunction) {
          this.httpMethod = value
        }
        
        /**
         * [integration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
         *
         * _Required_: no
         *
         * _Type_: Integration
         */
        @JvmField
        var integration: Any? = null

        /**
         * [integration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
         *
         * _Required_: no
         *
         * _Type_: Integration
         */
        fun integration(value: Integration) {
          this.integration = value
        }
        
        /**
         * [integration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
         *
         * _Required_: no
         *
         * _Type_: Integration
         */
        fun integration(value: IntrinsicFunction) {
          this.integration = value
        }
        
        /**
         * [methodResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
         *
         * _Required_: no
         *
         * _Type_: List<MethodResponse>
         */
        @JvmField
        var methodResponses: Any? = null

        /**
         * [methodResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
         *
         * _Required_: no
         *
         * _Type_: List<MethodResponse>
         */
        fun methodResponses(value: List<MethodResponse>) {
          this.methodResponses = value
        }
        
        /**
         * [methodResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
         *
         * _Required_: no
         *
         * _Type_: List<MethodResponse>
         */
        fun methodResponses(vararg value: IntrinsicFunction) {
          this.methodResponses = value
        }
        
        /**
         * [operationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var operationName: Any? = null

        /**
         * [operationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun operationName(value: String) {
          this.operationName = value
        }
        
        /**
         * [operationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun operationName(value: IntrinsicFunction) {
          this.operationName = value
        }
        
        /**
         * [requestModels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var requestModels: Any? = null

        /**
         * [requestModels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun requestModels(value: Map<String, Any>) {
          this.requestModels = value
        }
        
        /**
         * [requestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var requestParameters: Any? = null

        /**
         * [requestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun requestParameters(value: Map<String, Any>) {
          this.requestParameters = value
        }
        
        /**
         * [requestValidatorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var requestValidatorId: Any? = null

        /**
         * [requestValidatorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun requestValidatorId(value: String) {
          this.requestValidatorId = value
        }
        
        /**
         * [requestValidatorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun requestValidatorId(value: IntrinsicFunction) {
          this.requestValidatorId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceId: Any? = null

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: String) {
          this.resourceId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: IntrinsicFunction) {
          this.resourceId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Integration(
            /**
             * [CacheKeyParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val cacheKeyParameters: List<String>? = null,
            /**
             * [CacheNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cacheNamespace: String? = null,
            /**
             * [ContentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val contentHandling: String? = null,
            /**
             * [Credentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val credentials: String? = null,
            /**
             * [IntegrationHttpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val integrationHttpMethod: String? = null,
            /**
             * [IntegrationResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses)
             *
             * _Required_: no
             *
             * _Type_: List<IntegrationResponse>
             */
            val integrationResponses: List<IntegrationResponse>? = null,
            /**
             * [PassthroughBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val passthroughBehavior: String? = null,
            /**
             * [RequestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val requestParameters: Map<String, Any>? = null,
            /**
             * [RequestTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val requestTemplates: Map<String, Any>? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Uri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val uri: String? = null
    )

    class IntegrationResponse(
            /**
             * [ContentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val contentHandling: String? = null,
            /**
             * [ResponseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val responseParameters: Map<String, Any>? = null,
            /**
             * [ResponseTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val responseTemplates: Map<String, Any>? = null,
            /**
             * [SelectionPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val selectionPattern: String? = null,
            /**
             * [StatusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val statusCode: String
    )

    class MethodResponse(
            /**
             * [ResponseModels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val responseModels: Map<String, Any>? = null,
            /**
             * [ResponseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val responseParameters: Map<String, Any>? = null,
            /**
             * [StatusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val statusCode: String
    )

}

/**
 * [AWS::ApiGateway::Method - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
 */
fun Resources.awsApiGatewayMethod(logicalId: String, init: AWSApiGatewayMethod.() -> Unit = {}): AWSApiGatewayMethod {
    return AWSApiGatewayMethod(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
