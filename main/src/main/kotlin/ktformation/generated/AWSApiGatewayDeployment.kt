
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Deployment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
 */
@CloudFormationMarker
class AWSApiGatewayDeployment(logicalId: String) : Resource<AWSApiGatewayDeployment.Properties>(logicalId, "AWS::ApiGateway::Deployment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        /**
         * [stageDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
         *
         * _Required_: no
         *
         * _Type_: StageDescription
         */
        @JvmField
        var stageDescription: Any? = null

        /**
         * [stageDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
         *
         * _Required_: no
         *
         * _Type_: StageDescription
         */
        fun stageDescription(value: StageDescription) {
          this.stageDescription = value
        }
        
        /**
         * [stageDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
         *
         * _Required_: no
         *
         * _Type_: StageDescription
         */
        fun stageDescription(value: IntrinsicFunction) {
          this.stageDescription = value
        }
        
        /**
         * [stageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var stageName: Any? = null

        /**
         * [stageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stageName(value: String) {
          this.stageName = value
        }
        
        /**
         * [stageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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
            /**
             * [CacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cacheDataEncrypted: Boolean? = null,
            /**
             * [CacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val cacheTtlInSeconds: Int? = null,
            /**
             * [CachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cachingEnabled: Boolean? = null,
            /**
             * [DataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val dataTraceEnabled: Boolean? = null,
            /**
             * [HttpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val httpMethod: String? = null,
            /**
             * [LoggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val loggingLevel: String? = null,
            /**
             * [MetricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val metricsEnabled: Boolean? = null,
            /**
             * [ResourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourcePath: String? = null,
            /**
             * [ThrottlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val throttlingBurstLimit: Int? = null,
            /**
             * [ThrottlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val throttlingRateLimit: Double? = null
    )

    class StageDescription(
            /**
             * [CacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cacheClusterEnabled: Boolean? = null,
            /**
             * [CacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cacheClusterSize: String? = null,
            /**
             * [CacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cacheDataEncrypted: Boolean? = null,
            /**
             * [CacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val cacheTtlInSeconds: Int? = null,
            /**
             * [CachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cachingEnabled: Boolean? = null,
            /**
             * [ClientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val clientCertificateId: String? = null,
            /**
             * [DataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val dataTraceEnabled: Boolean? = null,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [DocumentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val documentationVersion: String? = null,
            /**
             * [LoggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val loggingLevel: String? = null,
            /**
             * [MethodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings)
             *
             * _Required_: no
             *
             * _Type_: List<MethodSetting>
             */
            val methodSettings: List<MethodSetting>? = null,
            /**
             * [MetricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val metricsEnabled: Boolean? = null,
            /**
             * [ThrottlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val throttlingBurstLimit: Int? = null,
            /**
             * [ThrottlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val throttlingRateLimit: Double? = null,
            /**
             * [Variables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val variables: Map<String, Any>? = null
    )

}

/**
 * [AWS::ApiGateway::Deployment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
 */
fun Resources.awsApiGatewayDeployment(logicalId: String, init: AWSApiGatewayDeployment.() -> Unit = {}): AWSApiGatewayDeployment {
    return AWSApiGatewayDeployment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
