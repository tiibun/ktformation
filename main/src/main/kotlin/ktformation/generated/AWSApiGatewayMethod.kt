
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
         * [authorizationScopes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var authorizationScopes: Any? = null

        /**
         * [authorizationScopes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun authorizationScopes(value: List<String>) {
          this.authorizationScopes = value
        }
        
        /**
         * [authorizationScopes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun authorizationScopes(vararg value: IntrinsicFunction) {
          this.authorizationScopes = value
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

        /**
        * [Integration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html)
        */
        fun integration(init: Integration.() -> Unit = {}): Integration {
            return Integration().also {
                it.init()
            }
        }
        /**
        * [IntegrationResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html)
        */
        fun integrationResponse(init: IntegrationResponse.() -> Unit = {}): IntegrationResponse {
            return IntegrationResponse().also {
                it.init()
            }
        }
        /**
        * [MethodResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html)
        */
        fun methodResponse(init: MethodResponse.() -> Unit = {}): MethodResponse {
            return MethodResponse().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class Integration {
            /**
         * [cacheKeyParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var cacheKeyParameters: Any? = null

        /**
         * [cacheKeyParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cacheKeyParameters(value: List<String>) {
          this.cacheKeyParameters = value
        }
        
        /**
         * [cacheKeyParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cacheKeyParameters(vararg value: IntrinsicFunction) {
          this.cacheKeyParameters = value
        }

        /**
         * [cacheNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cacheNamespace: Any? = null

        /**
         * [cacheNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheNamespace(value: String) {
          this.cacheNamespace = value
        }
        
        /**
         * [cacheNamespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheNamespace(value: IntrinsicFunction) {
          this.cacheNamespace = value
        }

        /**
         * [connectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var connectionId: Any? = null

        /**
         * [connectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun connectionId(value: String) {
          this.connectionId = value
        }
        
        /**
         * [connectionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun connectionId(value: IntrinsicFunction) {
          this.connectionId = value
        }

        /**
         * [connectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var connectionType: Any? = null

        /**
         * [connectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun connectionType(value: String) {
          this.connectionType = value
        }
        
        /**
         * [connectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-connectiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun connectionType(value: IntrinsicFunction) {
          this.connectionType = value
        }

        /**
         * [contentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var contentHandling: Any? = null

        /**
         * [contentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun contentHandling(value: String) {
          this.contentHandling = value
        }
        
        /**
         * [contentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-contenthandling)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun contentHandling(value: IntrinsicFunction) {
          this.contentHandling = value
        }

        /**
         * [credentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var credentials: Any? = null

        /**
         * [credentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun credentials(value: String) {
          this.credentials = value
        }
        
        /**
         * [credentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-credentials)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun credentials(value: IntrinsicFunction) {
          this.credentials = value
        }

        /**
         * [integrationHttpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var integrationHttpMethod: Any? = null

        /**
         * [integrationHttpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun integrationHttpMethod(value: String) {
          this.integrationHttpMethod = value
        }
        
        /**
         * [integrationHttpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun integrationHttpMethod(value: IntrinsicFunction) {
          this.integrationHttpMethod = value
        }

        /**
         * [integrationResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses)
         *
         * _Required_: no
         *
         * _Type_: List<IntegrationResponse>
         */
        var integrationResponses: Any? = null

        /**
         * [integrationResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses)
         *
         * _Required_: no
         *
         * _Type_: List<IntegrationResponse>
         */
        fun integrationResponses(value: List<IntegrationResponse>) {
          this.integrationResponses = value
        }
        
        /**
         * [integrationResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses)
         *
         * _Required_: no
         *
         * _Type_: List<IntegrationResponse>
         */
        fun integrationResponses(vararg value: IntrinsicFunction) {
          this.integrationResponses = value
        }

        /**
         * [passthroughBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var passthroughBehavior: Any? = null

        /**
         * [passthroughBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun passthroughBehavior(value: String) {
          this.passthroughBehavior = value
        }
        
        /**
         * [passthroughBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun passthroughBehavior(value: IntrinsicFunction) {
          this.passthroughBehavior = value
        }

        /**
         * [requestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var requestParameters: Any? = null

        /**
         * [requestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requestparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun requestParameters(value: Map<String, Any>) {
          this.requestParameters = value
        }
        
        /**
         * [requestTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var requestTemplates: Any? = null

        /**
         * [requestTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun requestTemplates(value: Map<String, Any>) {
          this.requestTemplates = value
        }
        
        /**
         * [timeoutInMillis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var timeoutInMillis: Any? = null

        /**
         * [timeoutInMillis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutInMillis(value: Int) {
          this.timeoutInMillis = value
        }
        
        /**
         * [timeoutInMillis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutInMillis(value: IntrinsicFunction) {
          this.timeoutInMillis = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [uri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var uri: Any? = null

        /**
         * [uri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun uri(value: String) {
          this.uri = value
        }
        
        /**
         * [uri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html#cfn-apigateway-method-integration-uri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun uri(value: IntrinsicFunction) {
          this.uri = value
        }

    }

    @CloudFormationMarker
    class IntegrationResponse {
            /**
         * [contentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var contentHandling: Any? = null

        /**
         * [contentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun contentHandling(value: String) {
          this.contentHandling = value
        }
        
        /**
         * [contentHandling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun contentHandling(value: IntrinsicFunction) {
          this.contentHandling = value
        }

        /**
         * [responseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var responseParameters: Any? = null

        /**
         * [responseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responseparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun responseParameters(value: Map<String, Any>) {
          this.responseParameters = value
        }
        
        /**
         * [responseTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var responseTemplates: Any? = null

        /**
         * [responseTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-responsetemplates)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun responseTemplates(value: Map<String, Any>) {
          this.responseTemplates = value
        }
        
        /**
         * [selectionPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var selectionPattern: Any? = null

        /**
         * [selectionPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun selectionPattern(value: String) {
          this.selectionPattern = value
        }
        
        /**
         * [selectionPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-selectionpattern)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun selectionPattern(value: IntrinsicFunction) {
          this.selectionPattern = value
        }

        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var statusCode: Any? = null

        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statusCode(value: String) {
          this.statusCode = value
        }
        
        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration-integrationresponse.html#cfn-apigateway-method-integration-integrationresponse-statuscode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statusCode(value: IntrinsicFunction) {
          this.statusCode = value
        }

    }

    @CloudFormationMarker
    class MethodResponse {
            /**
         * [responseModels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var responseModels: Any? = null

        /**
         * [responseModels](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun responseModels(value: Map<String, Any>) {
          this.responseModels = value
        }
        
        /**
         * [responseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var responseParameters: Any? = null

        /**
         * [responseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun responseParameters(value: Map<String, Any>) {
          this.responseParameters = value
        }
        
        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var statusCode: Any? = null

        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statusCode(value: String) {
          this.statusCode = value
        }
        
        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun statusCode(value: IntrinsicFunction) {
          this.statusCode = value
        }

    }

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
