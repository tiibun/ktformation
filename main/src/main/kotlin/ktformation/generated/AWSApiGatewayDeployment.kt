
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

        /**
        * [MethodSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html)
        */
        fun methodSetting(init: MethodSetting.() -> Unit = {}): MethodSetting {
            return MethodSetting().also {
                it.init()
            }
        }
        /**
        * [StageDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
        */
        fun stageDescription(init: StageDescription.() -> Unit = {}): StageDescription {
            return StageDescription().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class MethodSetting {
            /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cacheDataEncrypted: Any? = null

        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheDataEncrypted(value: Boolean) {
          this.cacheDataEncrypted = value
        }
        
        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheDataEncrypted(value: IntrinsicFunction) {
          this.cacheDataEncrypted = value
        }

        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var cacheTtlInSeconds: Any? = null

        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cacheTtlInSeconds(value: Int) {
          this.cacheTtlInSeconds = value
        }
        
        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cacheTtlInSeconds(value: IntrinsicFunction) {
          this.cacheTtlInSeconds = value
        }

        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cachingEnabled: Any? = null

        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cachingEnabled(value: Boolean) {
          this.cachingEnabled = value
        }
        
        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cachingEnabled(value: IntrinsicFunction) {
          this.cachingEnabled = value
        }

        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var dataTraceEnabled: Any? = null

        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dataTraceEnabled(value: Boolean) {
          this.dataTraceEnabled = value
        }
        
        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dataTraceEnabled(value: IntrinsicFunction) {
          this.dataTraceEnabled = value
        }

        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var httpMethod: Any? = null

        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpMethod(value: String) {
          this.httpMethod = value
        }
        
        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-httpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpMethod(value: IntrinsicFunction) {
          this.httpMethod = value
        }

        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var loggingLevel: Any? = null

        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loggingLevel(value: String) {
          this.loggingLevel = value
        }
        
        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loggingLevel(value: IntrinsicFunction) {
          this.loggingLevel = value
        }

        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var metricsEnabled: Any? = null

        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun metricsEnabled(value: Boolean) {
          this.metricsEnabled = value
        }
        
        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun metricsEnabled(value: IntrinsicFunction) {
          this.metricsEnabled = value
        }

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourcePath: Any? = null

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: String) {
          this.resourcePath = value
        }
        
        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: IntrinsicFunction) {
          this.resourcePath = value
        }

        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var throttlingBurstLimit: Any? = null

        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun throttlingBurstLimit(value: Int) {
          this.throttlingBurstLimit = value
        }
        
        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun throttlingBurstLimit(value: IntrinsicFunction) {
          this.throttlingBurstLimit = value
        }

        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var throttlingRateLimit: Any? = null

        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun throttlingRateLimit(value: Double) {
          this.throttlingRateLimit = value
        }
        
        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription-methodsetting.html#cfn-apigateway-deployment-stagedescription-methodsetting-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun throttlingRateLimit(value: IntrinsicFunction) {
          this.throttlingRateLimit = value
        }

    }

    @CloudFormationMarker
    class StageDescription {
            /**
         * [cacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cacheClusterEnabled: Any? = null

        /**
         * [cacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheClusterEnabled(value: Boolean) {
          this.cacheClusterEnabled = value
        }
        
        /**
         * [cacheClusterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheClusterEnabled(value: IntrinsicFunction) {
          this.cacheClusterEnabled = value
        }

        /**
         * [cacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cacheClusterSize: Any? = null

        /**
         * [cacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheClusterSize(value: String) {
          this.cacheClusterSize = value
        }
        
        /**
         * [cacheClusterSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheClusterSize(value: IntrinsicFunction) {
          this.cacheClusterSize = value
        }

        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cacheDataEncrypted: Any? = null

        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheDataEncrypted(value: Boolean) {
          this.cacheDataEncrypted = value
        }
        
        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheDataEncrypted(value: IntrinsicFunction) {
          this.cacheDataEncrypted = value
        }

        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var cacheTtlInSeconds: Any? = null

        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cacheTtlInSeconds(value: Int) {
          this.cacheTtlInSeconds = value
        }
        
        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cacheTtlInSeconds(value: IntrinsicFunction) {
          this.cacheTtlInSeconds = value
        }

        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cachingEnabled: Any? = null

        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cachingEnabled(value: Boolean) {
          this.cachingEnabled = value
        }
        
        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cachingEnabled(value: IntrinsicFunction) {
          this.cachingEnabled = value
        }

        /**
         * [clientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var clientCertificateId: Any? = null

        /**
         * [clientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientCertificateId(value: String) {
          this.clientCertificateId = value
        }
        
        /**
         * [clientCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientCertificateId(value: IntrinsicFunction) {
          this.clientCertificateId = value
        }

        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var dataTraceEnabled: Any? = null

        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dataTraceEnabled(value: Boolean) {
          this.dataTraceEnabled = value
        }
        
        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dataTraceEnabled(value: IntrinsicFunction) {
          this.dataTraceEnabled = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [documentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var documentationVersion: Any? = null

        /**
         * [documentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentationVersion(value: String) {
          this.documentationVersion = value
        }
        
        /**
         * [documentationVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentationVersion(value: IntrinsicFunction) {
          this.documentationVersion = value
        }

        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var loggingLevel: Any? = null

        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loggingLevel(value: String) {
          this.loggingLevel = value
        }
        
        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loggingLevel(value: IntrinsicFunction) {
          this.loggingLevel = value
        }

        /**
         * [methodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings)
         *
         * _Required_: no
         *
         * _Type_: List<MethodSetting>
         */
        var methodSettings: Any? = null

        /**
         * [methodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings)
         *
         * _Required_: no
         *
         * _Type_: List<MethodSetting>
         */
        fun methodSettings(value: List<MethodSetting>) {
          this.methodSettings = value
        }
        
        /**
         * [methodSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings)
         *
         * _Required_: no
         *
         * _Type_: List<MethodSetting>
         */
        fun methodSettings(vararg value: IntrinsicFunction) {
          this.methodSettings = value
        }

        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var metricsEnabled: Any? = null

        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun metricsEnabled(value: Boolean) {
          this.metricsEnabled = value
        }
        
        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun metricsEnabled(value: IntrinsicFunction) {
          this.metricsEnabled = value
        }

        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var throttlingBurstLimit: Any? = null

        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun throttlingBurstLimit(value: Int) {
          this.throttlingBurstLimit = value
        }
        
        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun throttlingBurstLimit(value: IntrinsicFunction) {
          this.throttlingBurstLimit = value
        }

        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var throttlingRateLimit: Any? = null

        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun throttlingRateLimit(value: Double) {
          this.throttlingRateLimit = value
        }
        
        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun throttlingRateLimit(value: IntrinsicFunction) {
          this.throttlingRateLimit = value
        }

        /**
         * [variables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var variables: Any? = null

        /**
         * [variables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun variables(value: Map<String, Any>) {
          this.variables = value
        }
        
    }

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
