
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::Endpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-endpoint.html)
 */
@CloudFormationMarker
class AWSDMSEndpoint(logicalId: String) : Resource<AWSDMSEndpoint.Properties>(logicalId, "AWS::DMS::Endpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var certificateArn: Any? = null
        fun certificateArn(value: String) {
            this.certificateArn = value
        }
        fun certificateArn(value: IntrinsicFunction) { this.certificateArn = value }
        @JvmField var databaseName: Any? = null
        fun databaseName(value: String) {
            this.databaseName = value
        }
        fun databaseName(value: IntrinsicFunction) { this.databaseName = value }
        @JvmField var dynamoDbSettings: Any? = null
        fun dynamoDbSettings(value: DynamoDbSettings) {
            this.dynamoDbSettings = value
        }
        fun dynamoDbSettings(value: IntrinsicFunction) { this.dynamoDbSettings = value }
        @JvmField var endpointIdentifier: Any? = null
        fun endpointIdentifier(value: String) {
            this.endpointIdentifier = value
        }
        fun endpointIdentifier(value: IntrinsicFunction) { this.endpointIdentifier = value }
        @JvmField var endpointType: Any? = null
        fun endpointType(value: String) { this.endpointType = value }
        fun endpointType(value: IntrinsicFunction) { this.endpointType = value }
        @JvmField var engineName: Any? = null
        fun engineName(value: String) { this.engineName = value }
        fun engineName(value: IntrinsicFunction) { this.engineName = value }
        @JvmField var extraConnectionAttributes: Any? = null
        fun extraConnectionAttributes(value: String) {
            this.extraConnectionAttributes = value
        }
        fun extraConnectionAttributes(value: IntrinsicFunction) { this.extraConnectionAttributes = value }
        @JvmField var kmsKeyId: Any? = null
        fun kmsKeyId(value: String) {
            this.kmsKeyId = value
        }
        fun kmsKeyId(value: IntrinsicFunction) { this.kmsKeyId = value }
        @JvmField var mongoDbSettings: Any? = null
        fun mongoDbSettings(value: MongoDbSettings) {
            this.mongoDbSettings = value
        }
        fun mongoDbSettings(value: IntrinsicFunction) { this.mongoDbSettings = value }
        @JvmField var password: Any? = null
        fun password(value: String) {
            this.password = value
        }
        fun password(value: IntrinsicFunction) { this.password = value }
        @JvmField var port: Any? = null
        fun port(value: Int) {
            this.port = value
        }
        fun port(value: IntrinsicFunction) { this.port = value }
        @JvmField var s3Settings: Any? = null
        fun s3Settings(value: S3Settings) {
            this.s3Settings = value
        }
        fun s3Settings(value: IntrinsicFunction) { this.s3Settings = value }
        @JvmField var serverName: Any? = null
        fun serverName(value: String) {
            this.serverName = value
        }
        fun serverName(value: IntrinsicFunction) { this.serverName = value }
        @JvmField var sslMode: Any? = null
        fun sslMode(value: String) {
            this.sslMode = value
        }
        fun sslMode(value: IntrinsicFunction) { this.sslMode = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var username: Any? = null
        fun username(value: String) {
            this.username = value
        }
        fun username(value: IntrinsicFunction) { this.username = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DynamoDbSettings(
            val serviceAccessRoleArn: String? = null
    )

    class MongoDbSettings(
            val authMechanism: String? = null,
            val authSource: String? = null,
            val authType: String? = null,
            val databaseName: String? = null,
            val docsToInvestigate: String? = null,
            val extractDocId: String? = null,
            val nestingLevel: String? = null,
            val password: String? = null,
            val port: Int? = null,
            val serverName: String? = null,
            val username: String? = null
    )

    class S3Settings(
            val bucketFolder: String? = null,
            val bucketName: String? = null,
            val compressionType: String? = null,
            val csvDelimiter: String? = null,
            val csvRowDelimiter: String? = null,
            val externalTableDefinition: String? = null,
            val serviceAccessRoleArn: String? = null
    )

}

fun Resources.awsDMSEndpoint(logicalId: String, init: AWSDMSEndpoint.() -> Unit = {}): AWSDMSEndpoint {
    return AWSDMSEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
