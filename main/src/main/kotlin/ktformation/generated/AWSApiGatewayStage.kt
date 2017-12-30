
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Stage - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
 */
@CloudFormationMarker
class AWSApiGatewayStage(logicalId: String) : Resource<AWSApiGatewayStage.Properties>(logicalId, "AWS::ApiGateway::Stage") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cacheClusterEnabled: Any? = null
        fun cacheClusterEnabled(value: Boolean) {
            this.cacheClusterEnabled = value
        }
        fun cacheClusterEnabled(value: IntrinsicFunction) { this.cacheClusterEnabled = value }
        @JvmField var cacheClusterSize: Any? = null
        fun cacheClusterSize(value: String) {
            this.cacheClusterSize = value
        }
        fun cacheClusterSize(value: IntrinsicFunction) { this.cacheClusterSize = value }
        @JvmField var clientCertificateId: Any? = null
        fun clientCertificateId(value: String) {
            this.clientCertificateId = value
        }
        fun clientCertificateId(value: IntrinsicFunction) { this.clientCertificateId = value }
        @JvmField var deploymentId: Any? = null
        fun deploymentId(value: String) {
            this.deploymentId = value
        }
        fun deploymentId(value: IntrinsicFunction) { this.deploymentId = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var documentationVersion: Any? = null
        fun documentationVersion(value: String) {
            this.documentationVersion = value
        }
        fun documentationVersion(value: IntrinsicFunction) { this.documentationVersion = value }
        @JvmField var methodSettings: Any? = null
        fun methodSettings(value: List<MethodSetting>) {
            this.methodSettings = value
        }
        fun methodSettings(vararg value: IntrinsicFunction) { this.methodSettings = value }
        @JvmField var restApiId: Any? = null
        fun restApiId(value: String) { this.restApiId = value }
        fun restApiId(value: IntrinsicFunction) { this.restApiId = value }
        @JvmField var stageName: Any? = null
        fun stageName(value: String) {
            this.stageName = value
        }
        fun stageName(value: IntrinsicFunction) { this.stageName = value }
        @JvmField var variables: Any? = null
        fun variables(value: Map<String, Any>) {
            this.variables = value
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

}

fun Resources.awsApiGatewayStage(logicalId: String, init: AWSApiGatewayStage.() -> Unit = {}): AWSApiGatewayStage {
    return AWSApiGatewayStage(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
