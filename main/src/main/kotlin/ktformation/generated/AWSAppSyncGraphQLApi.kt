
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LogConfig(
            /**
             * [CloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cloudWatchLogsRoleArn: String? = null,
            /**
             * [FieldLogLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val fieldLogLevel: String? = null
    )

    class UserPoolConfig(
            /**
             * [AppIdClientRegex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val appIdClientRegex: String? = null,
            /**
             * [AwsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val awsRegion: String? = null,
            /**
             * [DefaultAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val defaultAction: String? = null,
            /**
             * [UserPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val userPoolId: String? = null
    )

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
