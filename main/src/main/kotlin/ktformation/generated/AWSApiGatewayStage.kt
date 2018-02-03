
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Stage - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
 */
@CloudFormationMarker
class AWSApiGatewayStage(logicalId: String) : Resource<AWSApiGatewayStage.Properties>(logicalId, "AWS::ApiGateway::Stage") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var cacheClusterEnabled: Any? = null

        /**
         * [cacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheClusterEnabled(value: Boolean) {
          this.cacheClusterEnabled = value
        }
        
        /**
         * [cacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheClusterEnabled(value: IntrinsicFunction) {
          this.cacheClusterEnabled = value
        }
        
        /**
         * [cacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheClusterSize: Any? = null

        /**
         * [cacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheClusterSize(value: String) {
          this.cacheClusterSize = value
        }
        
        /**
         * [cacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheClusterSize(value: IntrinsicFunction) {
          this.cacheClusterSize = value
        }
        
        /**
         * [clientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clientCertificateId: Any? = null

        /**
         * [clientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientCertificateId(value: String) {
          this.clientCertificateId = value
        }
        
        /**
         * [clientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientCertificateId(value: IntrinsicFunction) {
          this.clientCertificateId = value
        }
        
        /**
         * [deploymentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var deploymentId: Any? = null

        /**
         * [deploymentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentId(value: String) {
          this.deploymentId = value
        }
        
        /**
         * [deploymentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentId(value: IntrinsicFunction) {
          this.deploymentId = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [documentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var documentationVersion: Any? = null

        /**
         * [documentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentationVersion(value: String) {
          this.documentationVersion = value
        }
        
        /**
         * [documentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentationVersion(value: IntrinsicFunction) {
          this.documentationVersion = value
        }
        
        /**
         * [methodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
         *
         * _Required_: no
         *
         * _Type_: List<MethodSetting>
         */
        @JvmField
        var methodSettings: Any? = null

        /**
         * [methodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
         *
         * _Required_: no
         *
         * _Type_: List<MethodSetting>
         */
        fun methodSettings(value: List<MethodSetting>) {
          this.methodSettings = value
        }
        
        /**
         * [methodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
         *
         * _Required_: no
         *
         * _Type_: List<MethodSetting>
         */
        fun methodSettings(vararg value: IntrinsicFunction) {
          this.methodSettings = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        /**
         * [stageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var stageName: Any? = null

        /**
         * [stageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stageName(value: String) {
          this.stageName = value
        }
        
        /**
         * [stageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stageName(value: IntrinsicFunction) {
          this.stageName = value
        }
        
        /**
         * [variables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var variables: Any? = null

        /**
         * [variables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
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
            /**
             * [CacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachedataencrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cacheDataEncrypted: Boolean? = null,
            /**
             * [CacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachettlinseconds)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val cacheTtlInSeconds: Int? = null,
            /**
             * [CachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachingenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cachingEnabled: Boolean? = null,
            /**
             * [DataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-datatraceenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val dataTraceEnabled: Boolean? = null,
            /**
             * [HttpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-httpmethod)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val httpMethod: String? = null,
            /**
             * [LoggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-logginglevel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val loggingLevel: String? = null,
            /**
             * [MetricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-metricsenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val metricsEnabled: Boolean? = null,
            /**
             * [ResourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-resourcepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourcePath: String? = null,
            /**
             * [ThrottlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingburstlimit)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val throttlingBurstLimit: Int? = null,
            /**
             * [ThrottlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingratelimit)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val throttlingRateLimit: Double? = null
    )

}

/**
 * [AWS::ApiGateway::Stage - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
 */
fun Resources.awsApiGatewayStage(logicalId: String, init: AWSApiGatewayStage.() -> Unit = {}): AWSApiGatewayStage {
    return AWSApiGatewayStage(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
