
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::BasePathMapping - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
 */
@CloudFormationMarker
class AWSApiGatewayBasePathMapping(logicalId: String) : Resource<AWSApiGatewayBasePathMapping.Properties>(logicalId, "AWS::ApiGateway::BasePathMapping") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var basePath: Any? = null
        fun basePath(value: String) {
            this.basePath = value
        }
        fun basePath(value: IntrinsicFunction) { this.basePath = value }
        @JvmField var domainName: Any? = null
        fun domainName(value: String) { this.domainName = value }
        fun domainName(value: IntrinsicFunction) { this.domainName = value }
        @JvmField var restApiId: Any? = null
        fun restApiId(value: String) {
            this.restApiId = value
        }
        fun restApiId(value: IntrinsicFunction) { this.restApiId = value }
        @JvmField var stage: Any? = null
        fun stage(value: String) {
            this.stage = value
        }
        fun stage(value: IntrinsicFunction) { this.stage = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsApiGatewayBasePathMapping(logicalId: String, init: AWSApiGatewayBasePathMapping.() -> Unit = {}): AWSApiGatewayBasePathMapping {
    return AWSApiGatewayBasePathMapping(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
