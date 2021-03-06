
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
         * [accessLogSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
         *
         * _Required_: no
         *
         * _Type_: AccessLogSetting
         */
        @JvmField
        var accessLogSetting: Any? = null

        /**
         * [accessLogSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
         *
         * _Required_: no
         *
         * _Type_: AccessLogSetting
         */
        fun accessLogSetting(value: AccessLogSetting) {
          this.accessLogSetting = value
        }
        
        /**
         * [accessLogSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
         *
         * _Required_: no
         *
         * _Type_: AccessLogSetting
         */
        fun accessLogSetting(value: IntrinsicFunction) {
          this.accessLogSetting = value
        }

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
         * [canarySetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
         *
         * _Required_: no
         *
         * _Type_: CanarySetting
         */
        @JvmField
        var canarySetting: Any? = null

        /**
         * [canarySetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
         *
         * _Required_: no
         *
         * _Type_: CanarySetting
         */
        fun canarySetting(value: CanarySetting) {
          this.canarySetting = value
        }
        
        /**
         * [canarySetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
         *
         * _Required_: no
         *
         * _Type_: CanarySetting
         */
        fun canarySetting(value: IntrinsicFunction) {
          this.canarySetting = value
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
        
        /**
        * [AccessLogSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html)
        */
        fun accessLogSetting(init: AccessLogSetting.() -> Unit = {}): AccessLogSetting {
            return AccessLogSetting().also {
                it.init()
            }
        }
        /**
        * [CanarySetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html)
        */
        fun canarySetting(init: CanarySetting.() -> Unit = {}): CanarySetting {
            return CanarySetting().also {
                it.init()
            }
        }
        /**
        * [MethodSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html)
        */
        fun methodSetting(init: MethodSetting.() -> Unit = {}): MethodSetting {
            return MethodSetting().also {
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
    class AccessLogSetting {
            /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-destinationarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var destinationArn: Any? = null

        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-destinationarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationArn(value: String) {
          this.destinationArn = value
        }
        
        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-destinationarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationArn(value: IntrinsicFunction) {
          this.destinationArn = value
        }

        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-format)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var format: Any? = null

        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-format)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun format(value: String) {
          this.format = value
        }
        
        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-format)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun format(value: IntrinsicFunction) {
          this.format = value
        }

    }

    @CloudFormationMarker
    class CanarySetting {
            /**
         * [deploymentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deploymentId: Any? = null

        /**
         * [deploymentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentId(value: String) {
          this.deploymentId = value
        }
        
        /**
         * [deploymentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentId(value: IntrinsicFunction) {
          this.deploymentId = value
        }

        /**
         * [percentTraffic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var percentTraffic: Any? = null

        /**
         * [percentTraffic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun percentTraffic(value: Double) {
          this.percentTraffic = value
        }
        
        /**
         * [percentTraffic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun percentTraffic(value: IntrinsicFunction) {
          this.percentTraffic = value
        }

        /**
         * [stageVariableOverrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        var stageVariableOverrides: Any? = null

        /**
         * [stageVariableOverrides](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun stageVariableOverrides(value: Map<String, Any>) {
          this.stageVariableOverrides = value
        }
        
        /**
         * [useStageCache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var useStageCache: Any? = null

        /**
         * [useStageCache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useStageCache(value: Boolean) {
          this.useStageCache = value
        }
        
        /**
         * [useStageCache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useStageCache(value: IntrinsicFunction) {
          this.useStageCache = value
        }

    }

    @CloudFormationMarker
    class MethodSetting {
            /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cacheDataEncrypted: Any? = null

        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheDataEncrypted(value: Boolean) {
          this.cacheDataEncrypted = value
        }
        
        /**
         * [cacheDataEncrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachedataencrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheDataEncrypted(value: IntrinsicFunction) {
          this.cacheDataEncrypted = value
        }

        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var cacheTtlInSeconds: Any? = null

        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cacheTtlInSeconds(value: Int) {
          this.cacheTtlInSeconds = value
        }
        
        /**
         * [cacheTtlInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachettlinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun cacheTtlInSeconds(value: IntrinsicFunction) {
          this.cacheTtlInSeconds = value
        }

        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cachingEnabled: Any? = null

        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cachingEnabled(value: Boolean) {
          this.cachingEnabled = value
        }
        
        /**
         * [cachingEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachingenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cachingEnabled(value: IntrinsicFunction) {
          this.cachingEnabled = value
        }

        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var dataTraceEnabled: Any? = null

        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dataTraceEnabled(value: Boolean) {
          this.dataTraceEnabled = value
        }
        
        /**
         * [dataTraceEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-datatraceenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dataTraceEnabled(value: IntrinsicFunction) {
          this.dataTraceEnabled = value
        }

        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-httpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var httpMethod: Any? = null

        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-httpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpMethod(value: String) {
          this.httpMethod = value
        }
        
        /**
         * [httpMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-httpmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpMethod(value: IntrinsicFunction) {
          this.httpMethod = value
        }

        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var loggingLevel: Any? = null

        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loggingLevel(value: String) {
          this.loggingLevel = value
        }
        
        /**
         * [loggingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-logginglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loggingLevel(value: IntrinsicFunction) {
          this.loggingLevel = value
        }

        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var metricsEnabled: Any? = null

        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun metricsEnabled(value: Boolean) {
          this.metricsEnabled = value
        }
        
        /**
         * [metricsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-metricsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun metricsEnabled(value: IntrinsicFunction) {
          this.metricsEnabled = value
        }

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourcePath: Any? = null

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: String) {
          this.resourcePath = value
        }
        
        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: IntrinsicFunction) {
          this.resourcePath = value
        }

        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var throttlingBurstLimit: Any? = null

        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun throttlingBurstLimit(value: Int) {
          this.throttlingBurstLimit = value
        }
        
        /**
         * [throttlingBurstLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingburstlimit)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun throttlingBurstLimit(value: IntrinsicFunction) {
          this.throttlingBurstLimit = value
        }

        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var throttlingRateLimit: Any? = null

        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun throttlingRateLimit(value: Double) {
          this.throttlingRateLimit = value
        }
        
        /**
         * [throttlingRateLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingratelimit)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun throttlingRateLimit(value: IntrinsicFunction) {
          this.throttlingRateLimit = value
        }

    }

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
