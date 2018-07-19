
package ktformation.generated

import ktformation.*

/**
 * [AWS::AppSync::DataSource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 */
@CloudFormationMarker
class AWSAppSyncDataSource(logicalId: String) : Resource<AWSAppSyncDataSource.Properties>(logicalId, "AWS::AppSync::DataSource") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var apiId: Any? = null

        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: String) {
          this.apiId = value
        }
        
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: IntrinsicFunction) {
          this.apiId = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [dynamoDBConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBConfig
         */
        @JvmField
        var dynamoDBConfig: Any? = null

        /**
         * [dynamoDBConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBConfig
         */
        fun dynamoDBConfig(value: DynamoDBConfig) {
          this.dynamoDBConfig = value
        }
        
        /**
         * [dynamoDBConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
         *
         * _Required_: no
         *
         * _Type_: DynamoDBConfig
         */
        fun dynamoDBConfig(value: IntrinsicFunction) {
          this.dynamoDBConfig = value
        }

        /**
         * [elasticsearchConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchConfig
         */
        @JvmField
        var elasticsearchConfig: Any? = null

        /**
         * [elasticsearchConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchConfig
         */
        fun elasticsearchConfig(value: ElasticsearchConfig) {
          this.elasticsearchConfig = value
        }
        
        /**
         * [elasticsearchConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchConfig
         */
        fun elasticsearchConfig(value: IntrinsicFunction) {
          this.elasticsearchConfig = value
        }

        /**
         * [httpConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
         *
         * _Required_: no
         *
         * _Type_: HttpConfig
         */
        @JvmField
        var httpConfig: Any? = null

        /**
         * [httpConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
         *
         * _Required_: no
         *
         * _Type_: HttpConfig
         */
        fun httpConfig(value: HttpConfig) {
          this.httpConfig = value
        }
        
        /**
         * [httpConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
         *
         * _Required_: no
         *
         * _Type_: HttpConfig
         */
        fun httpConfig(value: IntrinsicFunction) {
          this.httpConfig = value
        }

        /**
         * [lambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: LambdaConfig
         */
        @JvmField
        var lambdaConfig: Any? = null

        /**
         * [lambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: LambdaConfig
         */
        fun lambdaConfig(value: LambdaConfig) {
          this.lambdaConfig = value
        }
        
        /**
         * [lambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: LambdaConfig
         */
        fun lambdaConfig(value: IntrinsicFunction) {
          this.lambdaConfig = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serviceRoleArn: Any? = null

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        
        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: IntrinsicFunction) {
          this.serviceRoleArn = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
        * [DynamoDBConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html)
        */
        fun dynamoDBConfig(init: DynamoDBConfig.() -> Unit = {}): DynamoDBConfig {
            return DynamoDBConfig().also {
                it.init()
            }
        }
        /**
        * [ElasticsearchConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html)
        */
        fun elasticsearchConfig(init: ElasticsearchConfig.() -> Unit = {}): ElasticsearchConfig {
            return ElasticsearchConfig().also {
                it.init()
            }
        }
        /**
        * [HttpConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html)
        */
        fun httpConfig(init: HttpConfig.() -> Unit = {}): HttpConfig {
            return HttpConfig().also {
                it.init()
            }
        }
        /**
        * [LambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html)
        */
        fun lambdaConfig(init: LambdaConfig.() -> Unit = {}): LambdaConfig {
            return LambdaConfig().also {
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
    class DynamoDBConfig {
            /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var awsRegion: Any? = null

        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun awsRegion(value: String) {
          this.awsRegion = value
        }
        
        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun awsRegion(value: IntrinsicFunction) {
          this.awsRegion = value
        }

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var tableName: Any? = null

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: String) {
          this.tableName = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
        }

        /**
         * [useCallerCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var useCallerCredentials: Any? = null

        /**
         * [useCallerCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useCallerCredentials(value: Boolean) {
          this.useCallerCredentials = value
        }
        
        /**
         * [useCallerCredentials](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useCallerCredentials(value: IntrinsicFunction) {
          this.useCallerCredentials = value
        }

    }

    @CloudFormationMarker
    class ElasticsearchConfig {
            /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var awsRegion: Any? = null

        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun awsRegion(value: String) {
          this.awsRegion = value
        }
        
        /**
         * [awsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun awsRegion(value: IntrinsicFunction) {
          this.awsRegion = value
        }

        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var endpoint: Any? = null

        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpoint(value: String) {
          this.endpoint = value
        }
        
        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpoint(value: IntrinsicFunction) {
          this.endpoint = value
        }

    }

    @CloudFormationMarker
    class HttpConfig {
            /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var endpoint: Any? = null

        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpoint(value: String) {
          this.endpoint = value
        }
        
        /**
         * [endpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpoint(value: IntrinsicFunction) {
          this.endpoint = value
        }

    }

    @CloudFormationMarker
    class LambdaConfig {
            /**
         * [lambdaFunctionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var lambdaFunctionArn: Any? = null

        /**
         * [lambdaFunctionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lambdaFunctionArn(value: String) {
          this.lambdaFunctionArn = value
        }
        
        /**
         * [lambdaFunctionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lambdaFunctionArn(value: IntrinsicFunction) {
          this.lambdaFunctionArn = value
        }

    }

}

/**
 * [AWS::AppSync::DataSource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 */
fun Resources.awsAppSyncDataSource(logicalId: String, init: AWSAppSyncDataSource.() -> Unit = {}): AWSAppSyncDataSource {
    return AWSAppSyncDataSource(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
