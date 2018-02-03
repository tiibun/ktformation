
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::RequestValidator - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html)
 */
@CloudFormationMarker
class AWSApiGatewayRequestValidator(logicalId: String) : Resource<AWSApiGatewayRequestValidator.Properties>(logicalId, "AWS::ApiGateway::RequestValidator") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        /**
         * [validateRequestBody](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var validateRequestBody: Any? = null

        /**
         * [validateRequestBody](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun validateRequestBody(value: Boolean) {
          this.validateRequestBody = value
        }
        
        /**
         * [validateRequestBody](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestbody)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun validateRequestBody(value: IntrinsicFunction) {
          this.validateRequestBody = value
        }
        
        /**
         * [validateRequestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var validateRequestParameters: Any? = null

        /**
         * [validateRequestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun validateRequestParameters(value: Boolean) {
          this.validateRequestParameters = value
        }
        
        /**
         * [validateRequestParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html#cfn-apigateway-requestvalidator-validaterequestparameters)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
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

/**
 * [AWS::ApiGateway::RequestValidator - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-requestvalidator.html)
 */
fun Resources.awsApiGatewayRequestValidator(logicalId: String, init: AWSApiGatewayRequestValidator.() -> Unit = {}): AWSApiGatewayRequestValidator {
    return AWSApiGatewayRequestValidator(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
