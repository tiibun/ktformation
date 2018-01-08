
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Resource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
 */
@CloudFormationMarker
class AWSApiGatewayResource(logicalId: String) : Resource<AWSApiGatewayResource.Properties>(logicalId, "AWS::ApiGateway::Resource") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var parentId: Any? = null

        fun parentId(value: String) {
          this.parentId = value
        }
        fun parentId(value: IntrinsicFunction) {
  this.parentId = value
}
        @JvmField
        var pathPart: Any? = null

        fun pathPart(value: String) {
          this.pathPart = value
        }
        fun pathPart(value: IntrinsicFunction) {
  this.pathPart = value
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

fun Resources.awsApiGatewayResource(logicalId: String, init: AWSApiGatewayResource.() -> Unit = {}): AWSApiGatewayResource {
    return AWSApiGatewayResource(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
