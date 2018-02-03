
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DynamoDbSettings(
            /**
             * [ServiceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html#cfn-dms-endpoint-dynamodbsettings-serviceaccessrolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serviceAccessRoleArn: String? = null
    )

    class MongoDbSettings(
            /**
             * [AuthMechanism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authmechanism)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val authMechanism: String? = null,
            /**
             * [AuthSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authsource)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val authSource: String? = null,
            /**
             * [AuthType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-authtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val authType: String? = null,
            /**
             * [DatabaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-databasename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val databaseName: String? = null,
            /**
             * [DocsToInvestigate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-docstoinvestigate)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val docsToInvestigate: String? = null,
            /**
             * [ExtractDocId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-extractdocid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val extractDocId: String? = null,
            /**
             * [NestingLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-nestinglevel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val nestingLevel: String? = null,
            /**
             * [Password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-password)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val password: String? = null,
            /**
             * [Port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-port)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val port: Int? = null,
            /**
             * [ServerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-servername)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serverName: String? = null,
            /**
             * [Username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mongodbsettings.html#cfn-dms-endpoint-mongodbsettings-username)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val username: String? = null
    )

    class S3Settings(
            /**
             * [BucketFolder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bucketFolder: String? = null,
            /**
             * [BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bucketName: String? = null,
            /**
             * [CompressionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val compressionType: String? = null,
            /**
             * [CsvDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val csvDelimiter: String? = null,
            /**
             * [CsvRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val csvRowDelimiter: String? = null,
            /**
             * [ExternalTableDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val externalTableDefinition: String? = null,
            /**
             * [ServiceAccessRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serviceAccessRoleArn: String? = null
    )

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
