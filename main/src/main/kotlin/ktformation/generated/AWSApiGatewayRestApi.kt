
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::RestApi - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
 */
@CloudFormationMarker
class AWSApiGatewayRestApi(logicalId: String) : Resource<AWSApiGatewayRestApi.Properties>(logicalId, "AWS::ApiGateway::RestApi") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [binaryMediaTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var binaryMediaTypes: Any? = null

        /**
         * [binaryMediaTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun binaryMediaTypes(value: List<String>) {
          this.binaryMediaTypes = value
        }
        
        /**
         * [binaryMediaTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun binaryMediaTypes(vararg value: IntrinsicFunction) {
          this.binaryMediaTypes = value
        }
        
        /**
         * [body](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var body: Any? = null

        /**
         * [body](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun body(value: Json) {
          this.body = value
        }
        
        /**
         * [body](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun body(value: IntrinsicFunction) {
          this.body = value
        }
        
        /**
         * [bodyS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        @JvmField
        var bodyS3Location: Any? = null

        /**
         * [bodyS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        fun bodyS3Location(value: S3Location) {
          this.bodyS3Location = value
        }
        
        /**
         * [bodyS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        fun bodyS3Location(value: IntrinsicFunction) {
          this.bodyS3Location = value
        }
        
        /**
         * [cloneFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cloneFrom: Any? = null

        /**
         * [cloneFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloneFrom(value: String) {
          this.cloneFrom = value
        }
        
        /**
         * [cloneFrom](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloneFrom(value: IntrinsicFunction) {
          this.cloneFrom = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [endpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EndpointConfiguration
         */
        @JvmField
        var endpointConfiguration: Any? = null

        /**
         * [endpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EndpointConfiguration
         */
        fun endpointConfiguration(value: EndpointConfiguration) {
          this.endpointConfiguration = value
        }
        
        /**
         * [endpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EndpointConfiguration
         */
        fun endpointConfiguration(value: IntrinsicFunction) {
          this.endpointConfiguration = value
        }
        
        /**
         * [failOnWarnings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var failOnWarnings: Any? = null

        /**
         * [failOnWarnings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun failOnWarnings(value: Boolean) {
          this.failOnWarnings = value
        }
        
        /**
         * [failOnWarnings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun failOnWarnings(value: IntrinsicFunction) {
          this.failOnWarnings = value
        }
        
        /**
         * [mode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var mode: Any? = null

        /**
         * [mode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mode(value: String) {
          this.mode = value
        }
        
        /**
         * [mode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mode(value: IntrinsicFunction) {
          this.mode = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun parameters(value: Map<String, Any>) {
          this.parameters = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EndpointConfiguration(
            /**
             * [Types](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val types: List<String>? = null
    )

    class S3Location(
            /**
             * [Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-bucket)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bucket: String? = null,
            /**
             * [ETag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-etag)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val eTag: String? = null,
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-version)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val version: String? = null
    )

}

/**
 * [AWS::ApiGateway::RestApi - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
 */
fun Resources.awsApiGatewayRestApi(logicalId: String, init: AWSApiGatewayRestApi.() -> Unit = {}): AWSApiGatewayRestApi {
    return AWSApiGatewayRestApi(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
