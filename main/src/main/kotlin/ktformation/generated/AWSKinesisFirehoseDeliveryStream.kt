
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisFirehose::DeliveryStream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
 */
@CloudFormationMarker
class AWSKinesisFirehoseDeliveryStream(logicalId: String) : Resource<AWSKinesisFirehoseDeliveryStream.Properties>(logicalId, "AWS::KinesisFirehose::DeliveryStream") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [deliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var deliveryStreamName: Any? = null

        /**
         * [deliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deliveryStreamName(value: String) {
          this.deliveryStreamName = value
        }
        
        /**
         * [deliveryStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deliveryStreamName(value: IntrinsicFunction) {
          this.deliveryStreamName = value
        }
        
        /**
         * [deliveryStreamType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var deliveryStreamType: Any? = null

        /**
         * [deliveryStreamType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deliveryStreamType(value: String) {
          this.deliveryStreamType = value
        }
        
        /**
         * [deliveryStreamType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-deliverystreamtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deliveryStreamType(value: IntrinsicFunction) {
          this.deliveryStreamType = value
        }
        
        /**
         * [elasticsearchDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchDestinationConfiguration
         */
        @JvmField
        var elasticsearchDestinationConfiguration: Any? = null

        /**
         * [elasticsearchDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchDestinationConfiguration
         */
        fun elasticsearchDestinationConfiguration(value: ElasticsearchDestinationConfiguration) {
          this.elasticsearchDestinationConfiguration = value
        }
        
        /**
         * [elasticsearchDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchDestinationConfiguration
         */
        fun elasticsearchDestinationConfiguration(value: IntrinsicFunction) {
          this.elasticsearchDestinationConfiguration = value
        }
        
        /**
         * [extendedS3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ExtendedS3DestinationConfiguration
         */
        @JvmField
        var extendedS3DestinationConfiguration: Any? = null

        /**
         * [extendedS3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ExtendedS3DestinationConfiguration
         */
        fun extendedS3DestinationConfiguration(value: ExtendedS3DestinationConfiguration) {
          this.extendedS3DestinationConfiguration = value
        }
        
        /**
         * [extendedS3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ExtendedS3DestinationConfiguration
         */
        fun extendedS3DestinationConfiguration(value: IntrinsicFunction) {
          this.extendedS3DestinationConfiguration = value
        }
        
        /**
         * [kinesisStreamSourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamSourceConfiguration
         */
        @JvmField
        var kinesisStreamSourceConfiguration: Any? = null

        /**
         * [kinesisStreamSourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamSourceConfiguration
         */
        fun kinesisStreamSourceConfiguration(value: KinesisStreamSourceConfiguration) {
          this.kinesisStreamSourceConfiguration = value
        }
        
        /**
         * [kinesisStreamSourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamSourceConfiguration
         */
        fun kinesisStreamSourceConfiguration(value: IntrinsicFunction) {
          this.kinesisStreamSourceConfiguration = value
        }
        
        /**
         * [redshiftDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: RedshiftDestinationConfiguration
         */
        @JvmField
        var redshiftDestinationConfiguration: Any? = null

        /**
         * [redshiftDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: RedshiftDestinationConfiguration
         */
        fun redshiftDestinationConfiguration(value: RedshiftDestinationConfiguration) {
          this.redshiftDestinationConfiguration = value
        }
        
        /**
         * [redshiftDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: RedshiftDestinationConfiguration
         */
        fun redshiftDestinationConfiguration(value: IntrinsicFunction) {
          this.redshiftDestinationConfiguration = value
        }
        
        /**
         * [s3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: S3DestinationConfiguration
         */
        @JvmField
        var s3DestinationConfiguration: Any? = null

        /**
         * [s3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3DestinationConfiguration(value: S3DestinationConfiguration) {
          this.s3DestinationConfiguration = value
        }
        
        /**
         * [s3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3DestinationConfiguration(value: IntrinsicFunction) {
          this.s3DestinationConfiguration = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BufferingHints(
            /**
             * [IntervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-intervalinseconds)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val intervalInSeconds: Int,
            /**
             * [SizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-sizeinmbs)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val sizeInMBs: Int
    )

    class CloudWatchLoggingOptions(
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [LogGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val logGroupName: String? = null,
            /**
             * [LogStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val logStreamName: String? = null
    )

    class CopyCommand(
            /**
             * [CopyOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val copyOptions: String? = null,
            /**
             * [DataTableColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val dataTableColumns: String? = null,
            /**
             * [DataTableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dataTableName: String
    )

    class ElasticsearchBufferingHints(
            /**
             * [IntervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val intervalInSeconds: Int,
            /**
             * [SizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val sizeInMBs: Int
    )

    class ElasticsearchDestinationConfiguration(
            /**
             * [BufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-bufferinghints)
             *
             * _Required_: yes
             *
             * _Type_: ElasticsearchBufferingHints
             */
            val bufferingHints: ElasticsearchBufferingHints,
            /**
             * [CloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-cloudwatchloggingoptions)
             *
             * _Required_: no
             *
             * _Type_: CloudWatchLoggingOptions
             */
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            /**
             * [DomainARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val domainARN: String,
            /**
             * [IndexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val indexName: String,
            /**
             * [IndexRotationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val indexRotationPeriod: String,
            /**
             * [ProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-processingconfiguration)
             *
             * _Required_: no
             *
             * _Type_: ProcessingConfiguration
             */
            val processingConfiguration: ProcessingConfiguration? = null,
            /**
             * [RetryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-retryoptions)
             *
             * _Required_: yes
             *
             * _Type_: ElasticsearchRetryOptions
             */
            val retryOptions: ElasticsearchRetryOptions,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String,
            /**
             * [S3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val s3BackupMode: String,
            /**
             * [S3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3configuration)
             *
             * _Required_: yes
             *
             * _Type_: S3DestinationConfiguration
             */
            val s3Configuration: S3DestinationConfiguration,
            /**
             * [TypeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val typeName: String
    )

    class ElasticsearchRetryOptions(
            /**
             * [DurationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val durationInSeconds: Int
    )

    class EncryptionConfiguration(
            /**
             * [KMSEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-kmsencryptionconfig)
             *
             * _Required_: no
             *
             * _Type_: KMSEncryptionConfig
             */
            val kMSEncryptionConfig: KMSEncryptionConfig? = null,
            /**
             * [NoEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val noEncryptionConfig: String? = null
    )

    class ExtendedS3DestinationConfiguration(
            /**
             * [BucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketARN: String,
            /**
             * [BufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bufferinghints)
             *
             * _Required_: yes
             *
             * _Type_: BufferingHints
             */
            val bufferingHints: BufferingHints,
            /**
             * [CloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-cloudwatchloggingoptions)
             *
             * _Required_: no
             *
             * _Type_: CloudWatchLoggingOptions
             */
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            /**
             * [CompressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val compressionFormat: String,
            /**
             * [EncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-encryptionconfiguration)
             *
             * _Required_: no
             *
             * _Type_: EncryptionConfiguration
             */
            val encryptionConfiguration: EncryptionConfiguration? = null,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val prefix: String,
            /**
             * [ProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-processingconfiguration)
             *
             * _Required_: no
             *
             * _Type_: ProcessingConfiguration
             */
            val processingConfiguration: ProcessingConfiguration? = null,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String,
            /**
             * [S3BackupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupconfiguration)
             *
             * _Required_: no
             *
             * _Type_: S3DestinationConfiguration
             */
            val s3BackupConfiguration: S3DestinationConfiguration? = null,
            /**
             * [S3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3BackupMode: String? = null
    )

    class KMSEncryptionConfig(
            /**
             * [AWSKMSKeyARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val aWSKMSKeyARN: String
    )

    class KinesisStreamSourceConfiguration(
            /**
             * [KinesisStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-kinesisstreamarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val kinesisStreamARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class ProcessingConfiguration(
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [Processors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors)
             *
             * _Required_: yes
             *
             * _Type_: List<Processor>
             */
            val processors: List<Processor>
    )

    class Processor(
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters)
             *
             * _Required_: yes
             *
             * _Type_: List<ProcessorParameter>
             */
            val parameters: List<ProcessorParameter>,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class ProcessorParameter(
            /**
             * [ParameterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val parameterName: String,
            /**
             * [ParameterValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val parameterValue: String
    )

    class RedshiftDestinationConfiguration(
            /**
             * [CloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-cloudwatchloggingoptions)
             *
             * _Required_: no
             *
             * _Type_: CloudWatchLoggingOptions
             */
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            /**
             * [ClusterJDBCURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val clusterJDBCURL: String,
            /**
             * [CopyCommand](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-copycommand)
             *
             * _Required_: yes
             *
             * _Type_: CopyCommand
             */
            val copyCommand: CopyCommand,
            /**
             * [Password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val password: String,
            /**
             * [ProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-processingconfiguration)
             *
             * _Required_: no
             *
             * _Type_: ProcessingConfiguration
             */
            val processingConfiguration: ProcessingConfiguration? = null,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String,
            /**
             * [S3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3configuration)
             *
             * _Required_: yes
             *
             * _Type_: S3DestinationConfiguration
             */
            val s3Configuration: S3DestinationConfiguration,
            /**
             * [Username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val username: String
    )

    class S3DestinationConfiguration(
            /**
             * [BucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketARN: String,
            /**
             * [BufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bufferinghints)
             *
             * _Required_: yes
             *
             * _Type_: BufferingHints
             */
            val bufferingHints: BufferingHints,
            /**
             * [CloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-cloudwatchloggingoptions)
             *
             * _Required_: no
             *
             * _Type_: CloudWatchLoggingOptions
             */
            val cloudWatchLoggingOptions: CloudWatchLoggingOptions? = null,
            /**
             * [CompressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val compressionFormat: String,
            /**
             * [EncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-encryptionconfiguration)
             *
             * _Required_: no
             *
             * _Type_: EncryptionConfiguration
             */
            val encryptionConfiguration: EncryptionConfiguration? = null,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

}

/**
 * [AWS::KinesisFirehose::DeliveryStream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html)
 */
fun Resources.awsKinesisFirehoseDeliveryStream(logicalId: String, init: AWSKinesisFirehoseDeliveryStream.() -> Unit = {}): AWSKinesisFirehoseDeliveryStream {
    return AWSKinesisFirehoseDeliveryStream(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
