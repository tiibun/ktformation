
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Authorizer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html)
 */
@CloudFormationMarker
class AWSApiGatewayAuthorizer(logicalId: String) : Resource<AWSApiGatewayAuthorizer.Properties>(logicalId, "AWS::ApiGateway::Authorizer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [authType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var authType: Any? = null

        /**
         * [authType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authType(value: String) {
          this.authType = value
        }
        
        /**
         * [authType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authType(value: IntrinsicFunction) {
          this.authType = value
        }

        /**
         * [authorizerCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var authorizerCredentials: Any? = null

        /**
         * [authorizerCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizerCredentials(value: String) {
          this.authorizerCredentials = value
        }
        
        /**
         * [authorizerCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizerCredentials(value: IntrinsicFunction) {
          this.authorizerCredentials = value
        }

        /**
         * [authorizerResultTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var authorizerResultTtlInSeconds: Any? = null

        /**
         * [authorizerResultTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun authorizerResultTtlInSeconds(value: Int) {
          this.authorizerResultTtlInSeconds = value
        }
        
        /**
         * [authorizerResultTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun authorizerResultTtlInSeconds(value: IntrinsicFunction) {
          this.authorizerResultTtlInSeconds = value
        }

        /**
         * [authorizerUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var authorizerUri: Any? = null

        /**
         * [authorizerUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizerUri(value: String) {
          this.authorizerUri = value
        }
        
        /**
         * [authorizerUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authorizerUri(value: IntrinsicFunction) {
          this.authorizerUri = value
        }

        /**
         * [identitySource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var identitySource: Any? = null

        /**
         * [identitySource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun identitySource(value: String) {
          this.identitySource = value
        }
        
        /**
         * [identitySource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun identitySource(value: IntrinsicFunction) {
          this.identitySource = value
        }

        /**
         * [identityValidationExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var identityValidationExpression: Any? = null

        /**
         * [identityValidationExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun identityValidationExpression(value: String) {
          this.identityValidationExpression = value
        }
        
        /**
         * [identityValidationExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun identityValidationExpression(value: IntrinsicFunction) {
          this.identityValidationExpression = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [providerARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var providerARNs: Any? = null

        /**
         * [providerARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun providerARNs(value: List<String>) {
          this.providerARNs = value
        }
        
        /**
         * [providerARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun providerARNs(vararg value: IntrinsicFunction) {
          this.providerARNs = value
        }

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::ApiGateway::Authorizer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html)
 */
fun Resources.awsApiGatewayAuthorizer(logicalId: String, init: AWSApiGatewayAuthorizer.() -> Unit = {}): AWSApiGatewayAuthorizer {
    return AWSApiGatewayAuthorizer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
