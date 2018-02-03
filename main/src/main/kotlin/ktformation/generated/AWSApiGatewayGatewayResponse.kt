
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::GatewayResponse - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
 */
@CloudFormationMarker
class AWSApiGatewayGatewayResponse(logicalId: String) : Resource<AWSApiGatewayGatewayResponse.Properties>(logicalId, "AWS::ApiGateway::GatewayResponse") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [responseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var responseParameters: Any? = null

        /**
         * [responseParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun responseParameters(value: Map<String, Any>) {
          this.responseParameters = value
        }
        
        /**
         * [responseTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var responseTemplates: Any? = null

        /**
         * [responseTemplates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun responseTemplates(value: Map<String, Any>) {
          this.responseTemplates = value
        }
        
        /**
         * [responseType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var responseType: Any? = null

        /**
         * [responseType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun responseType(value: String) {
          this.responseType = value
        }
        
        /**
         * [responseType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun responseType(value: IntrinsicFunction) {
          this.responseType = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var statusCode: Any? = null

        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statusCode(value: String) {
          this.statusCode = value
        }
        
        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::ApiGateway::GatewayResponse - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
 */
fun Resources.awsApiGatewayGatewayResponse(logicalId: String, init: AWSApiGatewayGatewayResponse.() -> Unit = {}): AWSApiGatewayGatewayResponse {
    return AWSApiGatewayGatewayResponse(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
