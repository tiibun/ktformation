
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::DocumentationPart - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 */
@CloudFormationMarker
class AWSApiGatewayDocumentationPart(logicalId: String) : Resource<AWSApiGatewayDocumentationPart.Properties>(logicalId, "AWS::ApiGateway::DocumentationPart") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
         *
         * _Required_: yes
         *
         * _Type_: Location
         */
        @JvmField
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
         *
         * _Required_: yes
         *
         * _Type_: Location
         */
        fun location(value: Location) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
         *
         * _Required_: yes
         *
         * _Type_: Location
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }
        
        /**
         * [properties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var properties: Any? = null

        /**
         * [properties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun properties(value: String) {
          this.properties = value
        }
        
        /**
         * [properties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun properties(value: IntrinsicFunction) {
          this.properties = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
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


    class Location(
            /**
             * [Method](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val method: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val path: String? = null,
            /**
             * [StatusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val statusCode: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null
    )

}

/**
 * [AWS::ApiGateway::DocumentationPart - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 */
fun Resources.awsApiGatewayDocumentationPart(logicalId: String, init: AWSApiGatewayDocumentationPart.() -> Unit = {}): AWSApiGatewayDocumentationPart {
    return AWSApiGatewayDocumentationPart(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
