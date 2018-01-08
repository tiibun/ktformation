
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::RestApi - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
 */
@CloudFormationMarker
class AWSApiGatewayRestApi(logicalId: String) : Resource<AWSApiGatewayRestApi.Properties>(logicalId, "AWS::ApiGateway::RestApi") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var binaryMediaTypes: Any? = null

        fun binaryMediaTypes(value: List<String>) {
          this.binaryMediaTypes = value
        }
        fun binaryMediaTypes(vararg value: IntrinsicFunction) {
  this.binaryMediaTypes = value
}
        @JvmField
        var body: Any? = null

        fun body(value: Json) {
          this.body = value
        }
        fun body(value: IntrinsicFunction) {
  this.body = value
}
        @JvmField
        var bodyS3Location: Any? = null

        fun bodyS3Location(value: S3Location) {
          this.bodyS3Location = value
        }
        fun bodyS3Location(value: IntrinsicFunction) {
  this.bodyS3Location = value
}
        @JvmField
        var cloneFrom: Any? = null

        fun cloneFrom(value: String) {
          this.cloneFrom = value
        }
        fun cloneFrom(value: IntrinsicFunction) {
  this.cloneFrom = value
}
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
        @JvmField
        var endpointConfiguration: Any? = null

        fun endpointConfiguration(value: EndpointConfiguration) {
          this.endpointConfiguration = value
        }
        fun endpointConfiguration(value: IntrinsicFunction) {
  this.endpointConfiguration = value
}
        @JvmField
        var failOnWarnings: Any? = null

        fun failOnWarnings(value: Boolean) {
          this.failOnWarnings = value
        }
        fun failOnWarnings(value: IntrinsicFunction) {
  this.failOnWarnings = value
}
        @JvmField
        var mode: Any? = null

        fun mode(value: String) {
          this.mode = value
        }
        fun mode(value: IntrinsicFunction) {
  this.mode = value
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
        var parameters: Any? = null

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
            val types: List<String>? = null
    )

    class S3Location(
            val bucket: String? = null,
            val eTag: String? = null,
            val key: String? = null,
            val version: String? = null
    )

}

fun Resources.awsApiGatewayRestApi(logicalId: String, init: AWSApiGatewayRestApi.() -> Unit = {}): AWSApiGatewayRestApi {
    return AWSApiGatewayRestApi(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
