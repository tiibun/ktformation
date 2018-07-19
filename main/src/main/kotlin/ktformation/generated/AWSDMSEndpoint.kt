
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::Endpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html)
 */
@CloudFormationMarker
class AWSDMSEndpoint(logicalId: String) : Resource<AWSDMSEndpoint.Properties>(logicalId, "AWS::DMS::Endpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var certificateArn: Any? = null

        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateArn(value: String) {
          this.certificateArn = value
        }
        
        /**
         * [certificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-certificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificateArn(value: IntrinsicFunction) {
          this.certificateArn = value
        }

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }

        /**
         * [dynamoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
         *
         * _Required_: no
         *
         * _Type_: DynamoDbSettings
         */
        @JvmField
        var dynamoDbSettings: Any? = null

        /**
         * [dynamoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
         *
         * _Required_: no
         *
         * _Type_: DynamoDbSettings
         */
        fun dynamoDbSettings(value: DynamoDbSettings) {
          this.dynamoDbSettings = value
        }
        
        /**
         * [dynamoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-dynamodbsettings)
         *
         * _Required_: no
         *
         * _Type_: DynamoDbSettings
         */
        fun dynamoDbSettings(value: IntrinsicFunction) {
          this.dynamoDbSettings = value
        }

        /**
         * [endpointIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var endpointIdentifier: Any? = null

        /**
         * [endpointIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointIdentifier(value: String) {
          this.endpointIdentifier = value
        }
        
        /**
         * [endpointIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointIdentifier(value: IntrinsicFunction) {
          this.endpointIdentifier = value
        }

        /**
         * [endpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var endpointType: Any? = null

        /**
         * [endpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpointType(value: String) {
          this.endpointType = value
        }
        
        /**
         * [endpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-endpointtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpointType(value: IntrinsicFunction) {
          this.endpointType = value
        }

        /**
         * [engineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var engineName: Any? = null

        /**
         * [engineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineName(value: String) {
          this.engineName = value
        }
        
        /**
         * [engineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-enginename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineName(value: IntrinsicFunction) {
          this.engineName = value
        }

        /**
         * [extraConnectionAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var extraConnectionAttributes: Any? = null

        /**
         * [extraConnectionAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extraConnectionAttributes(value: String) {
          this.extraConnectionAttributes = value
        }
        
        /**
         * [extraConnectionAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-extraconnectionattributes)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extraConnectionAttributes(value: IntrinsicFunction) {
          this.extraConnectionAttributes = value
        }

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }

        /**
         * [mongoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
         *
         * _Required_: no
         *
         * _Type_: MongoDbSettings
         */
        @JvmField
        var mongoDbSettings: Any? = null

        /**
         * [mongoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
         *
         * _Required_: no
         *
         * _Type_: MongoDbSettings
         */
        fun mongoDbSettings(value: MongoDbSettings) {
          this.mongoDbSettings = value
        }
        
        /**
         * [mongoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-mongodbsettings)
         *
         * _Required_: no
         *
         * _Type_: MongoDbSettings
         */
        fun mongoDbSettings(value: IntrinsicFunction) {
          this.mongoDbSettings = value
        }

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [s3Settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-s3settings)
         *
         * _Required_: no
         *
         * _Type_: S3Settings
         */
        @JvmField
        var s3Settings: Any? = null

        /**
         * [s3Settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-s3settings)
         *
         * _Required_: no
         *
         * _Type_: S3Settings
         */
        fun s3Settings(value: S3Settings) {
          this.s3Settings = value
        }
        
        /**
         * [s3Settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-s3settings)
         *
         * _Required_: no
         *
         * _Type_: S3Settings
         */
        fun s3Settings(value: IntrinsicFunction) {
          this.s3Settings = value
        }

        /**
         * [serverName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serverName: Any? = null

        /**
         * [serverName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serverName(value: String) {
          this.serverName = value
        }
        
        /**
         * [serverName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-servername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serverName(value: IntrinsicFunction) {
          this.serverName = value
        }

        /**
         * [sslMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sslMode: Any? = null

        /**
         * [sslMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sslMode(value: String) {
          this.sslMode = value
        }
        
        /**
         * [sslMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-sslmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sslMode(value: IntrinsicFunction) {
          this.sslMode = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var username: Any? = null

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: String) {
          this.username = value
        }
        
        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html#cfn-dms-endpoint-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: IntrinsicFunction) {
          this.username = value
        }

        /**
        * [DynamoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html)
        */
        fun dynamoDbSettings(init: DynamoDbSettings.() -> Unit = {}): DynamoDbSettings {
            return DynamoDbSettings().also {
                it.init()
            }
        }
        /**
        * [MongoDbSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html)
        */
        fun mongoDbSettings(init: MongoDbSettings.() -> Unit = {}): MongoDbSettings {
            return MongoDbSettings().also {
                it.init()
            }
        }
        /**
        * [S3Settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html)
        */
        fun s3Settings(init: S3Settings.() -> Unit = {}): S3Settings {
            return S3Settings().also {
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
    class DynamoDbSettings {
            /**
         * [serviceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serviceAccessRoleArn: Any? = null

        /**
         * [serviceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceAccessRoleArn(value: String) {
          this.serviceAccessRoleArn = value
        }
        
        /**
         * [serviceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceAccessRoleArn(value: IntrinsicFunction) {
          this.serviceAccessRoleArn = value
        }

    }

    @CloudFormationMarker
    class MongoDbSettings {
            /**
         * [authMechanism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var authMechanism: Any? = null

        /**
         * [authMechanism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authMechanism(value: String) {
          this.authMechanism = value
        }
        
        /**
         * [authMechanism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authMechanism(value: IntrinsicFunction) {
          this.authMechanism = value
        }

        /**
         * [authSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var authSource: Any? = null

        /**
         * [authSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authSource(value: String) {
          this.authSource = value
        }
        
        /**
         * [authSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authSource(value: IntrinsicFunction) {
          this.authSource = value
        }

        /**
         * [authType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var authType: Any? = null

        /**
         * [authType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authType(value: String) {
          this.authType = value
        }
        
        /**
         * [authType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun authType(value: IntrinsicFunction) {
          this.authType = value
        }

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }

        /**
         * [docsToInvestigate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var docsToInvestigate: Any? = null

        /**
         * [docsToInvestigate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun docsToInvestigate(value: String) {
          this.docsToInvestigate = value
        }
        
        /**
         * [docsToInvestigate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun docsToInvestigate(value: IntrinsicFunction) {
          this.docsToInvestigate = value
        }

        /**
         * [extractDocId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var extractDocId: Any? = null

        /**
         * [extractDocId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extractDocId(value: String) {
          this.extractDocId = value
        }
        
        /**
         * [extractDocId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extractDocId(value: IntrinsicFunction) {
          this.extractDocId = value
        }

        /**
         * [nestingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var nestingLevel: Any? = null

        /**
         * [nestingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun nestingLevel(value: String) {
          this.nestingLevel = value
        }
        
        /**
         * [nestingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun nestingLevel(value: IntrinsicFunction) {
          this.nestingLevel = value
        }

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [serverName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serverName: Any? = null

        /**
         * [serverName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serverName(value: String) {
          this.serverName = value
        }
        
        /**
         * [serverName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serverName(value: IntrinsicFunction) {
          this.serverName = value
        }

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var username: Any? = null

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: String) {
          this.username = value
        }
        
        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: IntrinsicFunction) {
          this.username = value
        }

    }

    @CloudFormationMarker
    class S3Settings {
            /**
         * [bucketFolder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bucketFolder: Any? = null

        /**
         * [bucketFolder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketFolder(value: String) {
          this.bucketFolder = value
        }
        
        /**
         * [bucketFolder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketFolder(value: IntrinsicFunction) {
          this.bucketFolder = value
        }

        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bucketName: Any? = null

        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketName(value: String) {
          this.bucketName = value
        }
        
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketName(value: IntrinsicFunction) {
          this.bucketName = value
        }

        /**
         * [compressionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var compressionType: Any? = null

        /**
         * [compressionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun compressionType(value: String) {
          this.compressionType = value
        }
        
        /**
         * [compressionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun compressionType(value: IntrinsicFunction) {
          this.compressionType = value
        }

        /**
         * [csvDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var csvDelimiter: Any? = null

        /**
         * [csvDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun csvDelimiter(value: String) {
          this.csvDelimiter = value
        }
        
        /**
         * [csvDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun csvDelimiter(value: IntrinsicFunction) {
          this.csvDelimiter = value
        }

        /**
         * [csvRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var csvRowDelimiter: Any? = null

        /**
         * [csvRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun csvRowDelimiter(value: String) {
          this.csvRowDelimiter = value
        }
        
        /**
         * [csvRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun csvRowDelimiter(value: IntrinsicFunction) {
          this.csvRowDelimiter = value
        }

        /**
         * [externalTableDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var externalTableDefinition: Any? = null

        /**
         * [externalTableDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun externalTableDefinition(value: String) {
          this.externalTableDefinition = value
        }
        
        /**
         * [externalTableDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun externalTableDefinition(value: IntrinsicFunction) {
          this.externalTableDefinition = value
        }

        /**
         * [serviceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serviceAccessRoleArn: Any? = null

        /**
         * [serviceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceAccessRoleArn(value: String) {
          this.serviceAccessRoleArn = value
        }
        
        /**
         * [serviceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceAccessRoleArn(value: IntrinsicFunction) {
          this.serviceAccessRoleArn = value
        }

    }

}

/**
 * [AWS::DMS::Endpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html)
 */
fun Resources.awsDMSEndpoint(logicalId: String, init: AWSDMSEndpoint.() -> Unit = {}): AWSDMSEndpoint {
    return AWSDMSEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
