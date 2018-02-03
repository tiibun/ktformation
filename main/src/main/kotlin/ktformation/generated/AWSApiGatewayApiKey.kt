
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::ApiKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
 */
@CloudFormationMarker
class AWSApiGatewayApiKey(logicalId: String) : Resource<AWSApiGatewayApiKey.Properties>(logicalId, "AWS::ApiGateway::ApiKey") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var customerId: Any? = null

        fun customerId(value: String) {
          this.customerId = value
        }
        
        fun customerId(value: IntrinsicFunction) {
          this.customerId = value
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
        var enabled: Any? = null

        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }
        
        @JvmField
        var generateDistinctId: Any? = null

        fun generateDistinctId(value: Boolean) {
          this.generateDistinctId = value
        }
        
        fun generateDistinctId(value: IntrinsicFunction) {
          this.generateDistinctId = value
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
        var stageKeys: Any? = null

        fun stageKeys(value: List<StageKey>) {
          this.stageKeys = value
        }
        
        fun stageKeys(vararg value: IntrinsicFunction) {
          this.stageKeys = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class StageKey(
            val restApiId: String? = null,
            val stageName: String? = null
    )

}

fun Resources.awsApiGatewayApiKey(logicalId: String, init: AWSApiGatewayApiKey.() -> Unit = {}): AWSApiGatewayApiKey {
    return AWSApiGatewayApiKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
