
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisFirehose::DeliveryStream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
 */
@CloudFormationMarker
class AWSKinesisFirehoseDeliveryStream(logicalId: String) : Resource<AWSKinesisFirehoseDeliveryStream.Properties>(logicalId, "AWS::KinesisFirehose::DeliveryStream") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var deliveryStreamName: Any? = null
        fun deliveryStreamName(value: String) {
            this.deliveryStreamName = value
        }
        fun deliveryStreamName(value: IntrinsicFunction) { this.deliveryStreamName = value }
        @JvmField var deliveryStreamType: Any? = null
        fun deliveryStreamType(value: String) {
            this.deliveryStreamType = value
        }
        fun deliveryStreamType(value: IntrinsicFunction) { this.deliveryStreamType = value }
        @JvmField var elasticsearchDestinationConfiguration: Any? = null
        fun elasticsearchDestinationConfiguration(value: ElasticsearchDestinationConfiguration) {
            this.elasticsearchDestinationConfiguration = value
        }
        fun elasticsearchDestinationConfiguration(value: IntrinsicFunction) { this.elasticsearchDestinationConfiguration = value }
        @JvmField var extendedS3DestinationConfiguration: Any? = null
        fun extendedS3DestinationConfiguration(value: ExtendedS3DestinationConfiguration) {
            this.extendedS3DestinationConfiguration = value
        }
        fun extendedS3DestinationConfiguration(value: IntrinsicFunction) { this.extendedS3DestinationConfiguration = value }
        @JvmField var kinesisStreamSourceConfiguration: Any? = null
        fun kinesisStreamSourceConfiguration(value: KinesisStreamSourceConfiguration) {
            this.kinesisStreamSourceConfiguration = value
        }
        fun kinesisStreamSourceConfiguration(value: IntrinsicFunction) { this.kinesisStreamSourceConfiguration = value }
        @JvmField var redshiftDestinationConfiguration: Any? = null
        fun redshiftDestinationConfiguration(value: RedshiftDestinationConfiguration) {
            this.redshiftDestinationConfiguration = value
        }
        fun redshiftDestinationConfiguration(value: IntrinsicFunction) { this.redshiftDestinationConfiguration = value }
        @JvmField var s3DestinationConfiguration: Any? = null
        fun s3DestinationConfiguration(value: S3DestinationConfiguration) {
            this.s3DestinationConfiguration = value
        }
        fun s3DestinationConfiguration(value: IntrinsicFunction) { this.s3DestinationConfiguration = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BufferingHints(
            val intervalInSeconds: Int,
            val sizeInMBs: Int
    )

    class CloudWatchLoggingOptions(
            val enabled: Boolean? = null,
            val logGroupName: String? = null,
            val logStreamName: String? = null
    )

    class CopyCommand(
            val copyOptions: String? = null,
            val dataTableColumns: String? = null,
            val dataTableName: String
    )

    class ElasticsearchBufferingHints(
            val intervalInSeconds: Int,
            val sizeInMBs: Int
    )

    class ElasticsearchDestinationConfiguration(
            val bufferingHints: ElasticsearchBufferingHints,
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            val domainARN: String,
            val indexName: String,
            val indexRotationPeriod: String,
            val processingConfiguration: ProcessingConfiguration? = null,
            val retryOptions: ElasticsearchRetryOptions,
            val roleARN: String,
            val s3BackupMode: String,
            val s3Configuration: S3DestinationConfiguration,
            val typeName: String
    )

    class ElasticsearchRetryOptions(
            val durationInSeconds: Int
    )

    class EncryptionConfiguration(
            val kMSEncryptionConfig: KMSEncryptionConfig? = null,
            val noEncryptionConfig: String? = null
    )

    class ExtendedS3DestinationConfiguration(
            val bucketARN: String,
            val bufferingHints: BufferingHints,
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            val compressionFormat: String,
            val encryptionConfiguration: EncryptionConfiguration? = null,
            val prefix: String,
            val processingConfiguration: ProcessingConfiguration? = null,
            val roleARN: String,
            val s3BackupConfiguration: S3DestinationConfiguration? = null,
            val s3BackupMode: String? = null
    )

    class KMSEncryptionConfig(
            val aWSKMSKeyARN: String
    )

    class KinesisStreamSourceConfiguration(
            val kinesisStreamARN: String,
            val roleARN: String
    )

    class ProcessingConfiguration(
            val enabled: Boolean,
            val processors: List<Processor>
    )

    class Processor(
            val parameters: List<ProcessorParameter>,
            val type: String
    )

    class ProcessorParameter(
            val parameterName: String,
            val parameterValue: String
    )

    class RedshiftDestinationConfiguration(
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            val clusterJDBCURL: String,
            val copyCommand: CopyCommand,
            val password: String,
            val processingConfiguration: ProcessingConfiguration? = null,
            val roleARN: String,
            val s3Configuration: S3DestinationConfiguration,
            val username: String
    )

    class S3DestinationConfiguration(
            val bucketARN: String,
            val bufferingHints: BufferingHints,
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            val compressionFormat: String,
            val encryptionConfiguration: EncryptionConfiguration? = null,
            val prefix: String? = null,
            val roleARN: String
    )

}

fun Resources.awsKinesisFirehoseDeliveryStream(logicalId: String, init: AWSKinesisFirehoseDeliveryStream.() -> Unit = {}): AWSKinesisFirehoseDeliveryStream {
    return AWSKinesisFirehoseDeliveryStream(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
