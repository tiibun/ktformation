
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::DocumentationPart - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 */
@CloudFormationMarker
class AWSApiGatewayDocumentationPart(logicalId: String) : Resource<AWSApiGatewayDocumentationPart.Properties>(logicalId, "AWS::ApiGateway::DocumentationPart") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var location: Any? = null

        fun location(value: Location) {
          this.location = value
        }
        
        fun location(value: IntrinsicFunction) {
          this.location = value
        }
        
        @JvmField
        var properties: Any? = null

        fun properties(value: String) {
          this.properties = value
        }
        
        fun properties(value: IntrinsicFunction) {
          this.properties = value
        }
        
        @JvmField
        var restApiId: Any? = null

        fun restApiId(value: String) {
          this.restApiId = value
        }
        
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
            val method: String? = null,
            val name: String? = null,
            val path: String? = null,
            val statusCode: String? = null,
            val type: String? = null
    )

}

fun Resources.awsApiGatewayDocumentationPart(logicalId: String, init: AWSApiGatewayDocumentationPart.() -> Unit = {}): AWSApiGatewayDocumentationPart {
    return AWSApiGatewayDocumentationPart(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
