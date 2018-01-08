
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Deployment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
 */
@CloudFormationMarker
class AWSApiGatewayDeployment(logicalId: String) : Resource<AWSApiGatewayDeployment.Properties>(logicalId, "AWS::ApiGateway::Deployment") {

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
        var restApiId: Any? = null

        fun restApiId(value: String) {
          this.restApiId = value
        }
        fun restApiId(value: IntrinsicFunction) {
  this.restApiId = value
}
        @JvmField
        var stageDescription: Any? = null

        fun stageDescription(value: StageDescription) {
          this.stageDescription = value
        }
        fun stageDescription(value: IntrinsicFunction) {
  this.stageDescription = value
}
        @JvmField
        var stageName: Any? = null

        fun stageName(value: String) {
          this.stageName = value
        }
        fun stageName(value: IntrinsicFunction) {
  this.stageName = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class MethodSetting(
            val cacheDataEncrypted: Boolean? = null,
            val cacheTtlInSeconds: Int? = null,
            val cachingEnabled: Boolean? = null,
            val dataTraceEnabled: Boolean? = null,
            val httpMethod: String? = null,
            val loggingLevel: String? = null,
            val metricsEnabled: Boolean? = null,
            val resourcePath: String? = null,
            val throttlingBurstLimit: Int? = null,
            val throttlingRateLimit: Double? = null
    )

    class StageDescription(
            val cacheClusterEnabled: Boolean? = null,
            val cacheClusterSize: String? = null,
            val cacheDataEncrypted: Boolean? = null,
            val cacheTtlInSeconds: Int? = null,
            val cachingEnabled: Boolean? = null,
            val clientCertificateId: String? = null,
            val dataTraceEnabled: Boolean? = null,
            val description: String? = null,
            val documentationVersion: String? = null,
            val loggingLevel: String? = null,
            val methodSettings: List<MethodSetting>? = null,
            val metricsEnabled: Boolean? = null,
            val throttlingBurstLimit: Int? = null,
            val throttlingRateLimit: Double? = null,
            val variables: Map<String, Any>? = null
    )

}

fun Resources.awsApiGatewayDeployment(logicalId: String, init: AWSApiGatewayDeployment.() -> Unit = {}): AWSApiGatewayDeployment {
    return AWSApiGatewayDeployment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
