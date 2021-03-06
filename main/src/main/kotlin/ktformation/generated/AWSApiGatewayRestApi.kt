
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
         * [apiKeySourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var apiKeySourceType: Any? = null

        /**
         * [apiKeySourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun apiKeySourceType(value: String) {
          this.apiKeySourceType = value
        }
        
        /**
         * [apiKeySourceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun apiKeySourceType(value: IntrinsicFunction) {
          this.apiKeySourceType = value
        }

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
         * [minimumCompressionSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var minimumCompressionSize: Any? = null

        /**
         * [minimumCompressionSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minimumCompressionSize(value: Int) {
          this.minimumCompressionSize = value
        }
        
        /**
         * [minimumCompressionSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minimumCompressionSize(value: IntrinsicFunction) {
          this.minimumCompressionSize = value
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
        
        /**
         * [policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var policy: Any? = null

        /**
         * [policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun policy(value: Json) {
          this.policy = value
        }
        
        /**
         * [policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun policy(value: IntrinsicFunction) {
          this.policy = value
        }

        /**
        * [EndpointConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
        */
        fun endpointConfiguration(init: EndpointConfiguration.() -> Unit = {}): EndpointConfiguration {
            return EndpointConfiguration().also {
                it.init()
            }
        }
        /**
        * [S3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html)
        */
        fun s3Location(init: S3Location.() -> Unit = {}): S3Location {
            return S3Location().also {
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
    class EndpointConfiguration {
            /**
         * [types](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var types: Any? = null

        /**
         * [types](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun types(value: List<String>) {
          this.types = value
        }
        
        /**
         * [types](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun types(vararg value: IntrinsicFunction) {
          this.types = value
        }

    }

    @CloudFormationMarker
    class S3Location {
            /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-bucket)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-bucket)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-bucket)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [eTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-etag)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var eTag: Any? = null

        /**
         * [eTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-etag)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eTag(value: String) {
          this.eTag = value
        }
        
        /**
         * [eTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-etag)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eTag(value: IntrinsicFunction) {
          this.eTag = value
        }

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

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
