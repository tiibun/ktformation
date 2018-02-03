
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Model - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html)
 */
@CloudFormationMarker
class AWSApiGatewayModel(logicalId: String) : Resource<AWSApiGatewayModel.Properties>(logicalId, "AWS::ApiGateway::Model") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var contentType: Any? = null

        fun contentType(value: String) {
          this.contentType = value
        }
        
        fun contentType(value: IntrinsicFunction) {
          this.contentType = value
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
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var restApiId: Any? = null

        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        @JvmField
        var schema: Any? = null

        fun schema(value: Json) {
          this.schema = value
        }
        
        fun schema(value: IntrinsicFunction) {
          this.schema = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayModel(logicalId: String, init: AWSApiGatewayModel.() -> Unit = {}): AWSApiGatewayModel {
    return AWSApiGatewayModel(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
