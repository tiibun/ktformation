
package ktformation.generated

import ktformation.*

/**
 * [AWS::AppSync::GraphQLApi - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
 */
@CloudFormationMarker
class AWSAppSyncGraphQLApi(logicalId: String) : Resource<AWSAppSyncGraphQLApi.Properties>(logicalId, "AWS::AppSync::GraphQLApi") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [authenticationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var authenticationType: Any? = null

        /**
         * [authenticationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authenticationType(value: String) {
          this.authenticationType = value
        }
        
        /**
         * [authenticationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authenticationType(value: IntrinsicFunction) {
          this.authenticationType = value
        }

        /**
         * [logConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
         *
         * _Required_: no
         *
         * _Type_: LogConfig
         */
        @JvmField
        var logConfig: Any? = null

        /**
         * [logConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
         *
         * _Required_: no
         *
         * _Type_: LogConfig
         */
        fun logConfig(value: LogConfig) {
          this.logConfig = value
        }
        
        /**
         * [logConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
         *
         * _Required_: no
         *
         * _Type_: LogConfig
         */
        fun logConfig(value: IntrinsicFunction) {
          this.logConfig = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [openIDConnectConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
         *
         * _Required_: no
         *
         * _Type_: OpenIDConnectConfig
         */
        @JvmField
        var openIDConnectConfig: Any? = null

        /**
         * [openIDConnectConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
         *
         * _Required_: no
         *
         * _Type_: OpenIDConnectConfig
         */
        fun openIDConnectConfig(value: OpenIDConnectConfig) {
          this.openIDConnectConfig = value
        }
        
        /**
         * [openIDConnectConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
         *
         * _Required_: no
         *
         * _Type_: OpenIDConnectConfig
         */
        fun openIDConnectConfig(value: IntrinsicFunction) {
          this.openIDConnectConfig = value
        }

        /**
         * [userPoolConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
         *
         * _Required_: no
         *
         * _Type_: UserPoolConfig
         */
        @JvmField
        var userPoolConfig: Any? = null

        /**
         * [userPoolConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
         *
         * _Required_: no
         *
         * _Type_: UserPoolConfig
         */
        fun userPoolConfig(value: UserPoolConfig) {
          this.userPoolConfig = value
        }
        
        /**
         * [userPoolConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
         *
         * _Required_: no
         *
         * _Type_: UserPoolConfig
         */
        fun userPoolConfig(value: IntrinsicFunction) {
          this.userPoolConfig = value
        }

        /**
        * [LogConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html)
        */
        fun logConfig(init: LogConfig.() -> Unit = {}): LogConfig {
            return LogConfig().also {
                it.init()
            }
        }
        /**
        * [OpenIDConnectConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html)
        */
        fun openIDConnectConfig(init: OpenIDConnectConfig.() -> Unit = {}): OpenIDConnectConfig {
            return OpenIDConnectConfig().also {
                it.init()
            }
        }
        /**
        * [UserPoolConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html)
        */
        fun userPoolConfig(init: UserPoolConfig.() -> Unit = {}): UserPoolConfig {
            return UserPoolConfig().also {
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
    class LogConfig {
            /**
         * [cloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cloudWatchLogsRoleArn: Any? = null

        /**
         * [cloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchLogsRoleArn(value: String) {
          this.cloudWatchLogsRoleArn = value
        }
        
        /**
         * [cloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchLogsRoleArn(value: IntrinsicFunction) {
          this.cloudWatchLogsRoleArn = value
        }

        /**
         * [fieldLogLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var fieldLogLevel: Any? = null

        /**
         * [fieldLogLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fieldLogLevel(value: String) {
          this.fieldLogLevel = value
        }
        
        /**
         * [fieldLogLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fieldLogLevel(value: IntrinsicFunction) {
          this.fieldLogLevel = value
        }

    }

    @CloudFormationMarker
    class OpenIDConnectConfig {
            /**
         * [authTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var authTTL: Any? = null

        /**
         * [authTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun authTTL(value: Double) {
          this.authTTL = value
        }
        
        /**
         * [authTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun authTTL(value: IntrinsicFunction) {
          this.authTTL = value
        }

        /**
         * [clientId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var clientId: Any? = null

        /**
         * [clientId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientId(value: String) {
          this.clientId = value
        }
        
        /**
         * [clientId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientId(value: IntrinsicFunction) {
          this.clientId = value
        }

        /**
         * [iatTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var iatTTL: Any? = null

        /**
         * [iatTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun iatTTL(value: Double) {
          this.iatTTL = value
        }
        
        /**
         * [iatTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun iatTTL(value: IntrinsicFunction) {
          this.iatTTL = value
        }

        /**
         * [issuer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var issuer: Any? = null

        /**
         * [issuer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun issuer(value: String) {
          this.issuer = value
        }
        
        /**
         * [issuer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun issuer(value: IntrinsicFunction) {
          this.issuer = value
        }

    }

    @CloudFormationMarker
    class UserPoolConfig {
            /**
         * [appIdClientRegex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var appIdClientRegex: Any? = null

        /**
         * [appIdClientRegex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun appIdClientRegex(value: String) {
          this.appIdClientRegex = value
        }
        
        /**
         * [appIdClientRegex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun appIdClientRegex(value: IntrinsicFunction) {
          this.appIdClientRegex = value
        }

        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var awsRegion: Any? = null

        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun awsRegion(value: String) {
          this.awsRegion = value
        }
        
        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun awsRegion(value: IntrinsicFunction) {
          this.awsRegion = value
        }

        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var defaultAction: Any? = null

        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultAction(value: String) {
          this.defaultAction = value
        }
        
        /**
         * [defaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultAction(value: IntrinsicFunction) {
          this.defaultAction = value
        }

        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var userPoolId: Any? = null

        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userPoolId(value: String) {
          this.userPoolId = value
        }
        
        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userPoolId(value: IntrinsicFunction) {
          this.userPoolId = value
        }

    }

}

/**
 * [AWS::AppSync::GraphQLApi - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
 */
fun Resources.awsAppSyncGraphQLApi(logicalId: String, init: AWSAppSyncGraphQLApi.() -> Unit = {}): AWSAppSyncGraphQLApi {
    return AWSAppSyncGraphQLApi(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
