
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::DocumentationVersion - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html)
 */
@CloudFormationMarker
class AWSApiGatewayDocumentationVersion(logicalId: String) : Resource<AWSApiGatewayDocumentationVersion.Properties>(logicalId, "AWS::ApiGateway::DocumentationVersion") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
        @JvmField
        var documentationVersion: Any? = null

        fun documentationVersion(value: String) {
          this.documentationVersion = value
        }
        fun documentationVersion(value: IntrinsicFunction) {
  this.documentationVersion = value
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



}

fun Resources.awsApiGatewayDocumentationVersion(logicalId: String, init: AWSApiGatewayDocumentationVersion.() -> Unit = {}): AWSApiGatewayDocumentationVersion {
    return AWSApiGatewayDocumentationVersion(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
