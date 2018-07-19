
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

        /**
         * [splunkDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SplunkDestinationConfiguration
         */
        @JvmField
        var splunkDestinationConfiguration: Any? = null

        /**
         * [splunkDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SplunkDestinationConfiguration
         */
        fun splunkDestinationConfiguration(value: SplunkDestinationConfiguration) {
          this.splunkDestinationConfiguration = value
        }
        
        /**
         * [splunkDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisfirehose-deliverystream.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SplunkDestinationConfiguration
         */
        fun splunkDestinationConfiguration(value: IntrinsicFunction) {
          this.splunkDestinationConfiguration = value
        }

        /**
        * [BufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html)
        */
        fun bufferingHints(init: BufferingHints.() -> Unit = {}): BufferingHints {
            return BufferingHints().also {
                it.init()
            }
        }
        /**
        * [CloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html)
        */
        fun cloudWatchLoggingOptions(init: CloudWatchLoggingOptions.() -> Unit = {}): CloudWatchLoggingOptions {
            return CloudWatchLoggingOptions().also {
                it.init()
            }
        }
        /**
        * [CopyCommand](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html)
        */
        fun copyCommand(init: CopyCommand.() -> Unit = {}): CopyCommand {
            return CopyCommand().also {
                it.init()
            }
        }
        /**
        * [ElasticsearchBufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html)
        */
        fun elasticsearchBufferingHints(init: ElasticsearchBufferingHints.() -> Unit = {}): ElasticsearchBufferingHints {
            return ElasticsearchBufferingHints().also {
                it.init()
            }
        }
        /**
        * [ElasticsearchDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html)
        */
        fun elasticsearchDestinationConfiguration(init: ElasticsearchDestinationConfiguration.() -> Unit = {}): ElasticsearchDestinationConfiguration {
            return ElasticsearchDestinationConfiguration().also {
                it.init()
            }
        }
        /**
        * [ElasticsearchRetryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html)
        */
        fun elasticsearchRetryOptions(init: ElasticsearchRetryOptions.() -> Unit = {}): ElasticsearchRetryOptions {
            return ElasticsearchRetryOptions().also {
                it.init()
            }
        }
        /**
        * [EncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html)
        */
        fun encryptionConfiguration(init: EncryptionConfiguration.() -> Unit = {}): EncryptionConfiguration {
            return EncryptionConfiguration().also {
                it.init()
            }
        }
        /**
        * [ExtendedS3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html)
        */
        fun extendedS3DestinationConfiguration(init: ExtendedS3DestinationConfiguration.() -> Unit = {}): ExtendedS3DestinationConfiguration {
            return ExtendedS3DestinationConfiguration().also {
                it.init()
            }
        }
        /**
        * [KMSEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html)
        */
        fun kMSEncryptionConfig(init: KMSEncryptionConfig.() -> Unit = {}): KMSEncryptionConfig {
            return KMSEncryptionConfig().also {
                it.init()
            }
        }
        /**
        * [KinesisStreamSourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
        */
        fun kinesisStreamSourceConfiguration(init: KinesisStreamSourceConfiguration.() -> Unit = {}): KinesisStreamSourceConfiguration {
            return KinesisStreamSourceConfiguration().also {
                it.init()
            }
        }
        /**
        * [ProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html)
        */
        fun processingConfiguration(init: ProcessingConfiguration.() -> Unit = {}): ProcessingConfiguration {
            return ProcessingConfiguration().also {
                it.init()
            }
        }
        /**
        * [Processor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html)
        */
        fun processor(init: Processor.() -> Unit = {}): Processor {
            return Processor().also {
                it.init()
            }
        }
        /**
        * [ProcessorParameter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html)
        */
        fun processorParameter(init: ProcessorParameter.() -> Unit = {}): ProcessorParameter {
            return ProcessorParameter().also {
                it.init()
            }
        }
        /**
        * [RedshiftDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html)
        */
        fun redshiftDestinationConfiguration(init: RedshiftDestinationConfiguration.() -> Unit = {}): RedshiftDestinationConfiguration {
            return RedshiftDestinationConfiguration().also {
                it.init()
            }
        }
        /**
        * [S3DestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html)
        */
        fun s3DestinationConfiguration(init: S3DestinationConfiguration.() -> Unit = {}): S3DestinationConfiguration {
            return S3DestinationConfiguration().also {
                it.init()
            }
        }
        /**
        * [SplunkDestinationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html)
        */
        fun splunkDestinationConfiguration(init: SplunkDestinationConfiguration.() -> Unit = {}): SplunkDestinationConfiguration {
            return SplunkDestinationConfiguration().also {
                it.init()
            }
        }
        /**
        * [SplunkRetryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html)
        */
        fun splunkRetryOptions(init: SplunkRetryOptions.() -> Unit = {}): SplunkRetryOptions {
            return SplunkRetryOptions().also {
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
    class BufferingHints {
            /**
         * [intervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-intervalinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var intervalInSeconds: Any? = null

        /**
         * [intervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-intervalinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun intervalInSeconds(value: Int) {
          this.intervalInSeconds = value
        }
        
        /**
         * [intervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-intervalinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun intervalInSeconds(value: IntrinsicFunction) {
          this.intervalInSeconds = value
        }

        /**
         * [sizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-sizeinmbs)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var sizeInMBs: Any? = null

        /**
         * [sizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-sizeinmbs)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInMBs(value: Int) {
          this.sizeInMBs = value
        }
        
        /**
         * [sizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-bufferinghints.html#cfn-kinesisfirehose-deliverystream-bufferinghints-sizeinmbs)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInMBs(value: IntrinsicFunction) {
          this.sizeInMBs = value
        }

    }

    @CloudFormationMarker
    class CloudWatchLoggingOptions {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var logGroupName: Any? = null

        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        
        /**
         * [logGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logGroupName(value: IntrinsicFunction) {
          this.logGroupName = value
        }

        /**
         * [logStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var logStreamName: Any? = null

        /**
         * [logStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logStreamName(value: String) {
          this.logStreamName = value
        }
        
        /**
         * [logStreamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logStreamName(value: IntrinsicFunction) {
          this.logStreamName = value
        }

    }

    @CloudFormationMarker
    class CopyCommand {
            /**
         * [copyOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var copyOptions: Any? = null

        /**
         * [copyOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun copyOptions(value: String) {
          this.copyOptions = value
        }
        
        /**
         * [copyOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun copyOptions(value: IntrinsicFunction) {
          this.copyOptions = value
        }

        /**
         * [dataTableColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var dataTableColumns: Any? = null

        /**
         * [dataTableColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dataTableColumns(value: String) {
          this.dataTableColumns = value
        }
        
        /**
         * [dataTableColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dataTableColumns(value: IntrinsicFunction) {
          this.dataTableColumns = value
        }

        /**
         * [dataTableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dataTableName: Any? = null

        /**
         * [dataTableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dataTableName(value: String) {
          this.dataTableName = value
        }
        
        /**
         * [dataTableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dataTableName(value: IntrinsicFunction) {
          this.dataTableName = value
        }

    }

    @CloudFormationMarker
    class ElasticsearchBufferingHints {
            /**
         * [intervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var intervalInSeconds: Any? = null

        /**
         * [intervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun intervalInSeconds(value: Int) {
          this.intervalInSeconds = value
        }
        
        /**
         * [intervalInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun intervalInSeconds(value: IntrinsicFunction) {
          this.intervalInSeconds = value
        }

        /**
         * [sizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var sizeInMBs: Any? = null

        /**
         * [sizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInMBs(value: Int) {
          this.sizeInMBs = value
        }
        
        /**
         * [sizeInMBs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sizeInMBs(value: IntrinsicFunction) {
          this.sizeInMBs = value
        }

    }

    @CloudFormationMarker
    class ElasticsearchDestinationConfiguration {
            /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: ElasticsearchBufferingHints
         */
        var bufferingHints: Any? = null

        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: ElasticsearchBufferingHints
         */
        fun bufferingHints(value: ElasticsearchBufferingHints) {
          this.bufferingHints = value
        }
        
        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: ElasticsearchBufferingHints
         */
        fun bufferingHints(value: IntrinsicFunction) {
          this.bufferingHints = value
        }

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        var cloudWatchLoggingOptions: Any? = null

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: CloudWatchLoggingOptions) {
          this.cloudWatchLoggingOptions = value
        }
        
        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: IntrinsicFunction) {
          this.cloudWatchLoggingOptions = value
        }

        /**
         * [domainARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var domainARN: Any? = null

        /**
         * [domainARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainARN(value: String) {
          this.domainARN = value
        }
        
        /**
         * [domainARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainARN(value: IntrinsicFunction) {
          this.domainARN = value
        }

        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var indexName: Any? = null

        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexName(value: String) {
          this.indexName = value
        }
        
        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexName(value: IntrinsicFunction) {
          this.indexName = value
        }

        /**
         * [indexRotationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var indexRotationPeriod: Any? = null

        /**
         * [indexRotationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexRotationPeriod(value: String) {
          this.indexRotationPeriod = value
        }
        
        /**
         * [indexRotationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexRotationPeriod(value: IntrinsicFunction) {
          this.indexRotationPeriod = value
        }

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        var processingConfiguration: Any? = null

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: ProcessingConfiguration) {
          this.processingConfiguration = value
        }
        
        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: IntrinsicFunction) {
          this.processingConfiguration = value
        }

        /**
         * [retryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-retryoptions)
         *
         * _Required_: yes
         *
         * _Type_: ElasticsearchRetryOptions
         */
        var retryOptions: Any? = null

        /**
         * [retryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-retryoptions)
         *
         * _Required_: yes
         *
         * _Type_: ElasticsearchRetryOptions
         */
        fun retryOptions(value: ElasticsearchRetryOptions) {
          this.retryOptions = value
        }
        
        /**
         * [retryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-retryoptions)
         *
         * _Required_: yes
         *
         * _Type_: ElasticsearchRetryOptions
         */
        fun retryOptions(value: IntrinsicFunction) {
          this.retryOptions = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var s3BackupMode: Any? = null

        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BackupMode(value: String) {
          this.s3BackupMode = value
        }
        
        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BackupMode(value: IntrinsicFunction) {
          this.s3BackupMode = value
        }

        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        var s3Configuration: Any? = null

        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3Configuration(value: S3DestinationConfiguration) {
          this.s3Configuration = value
        }
        
        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3Configuration(value: IntrinsicFunction) {
          this.s3Configuration = value
        }

        /**
         * [typeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var typeName: Any? = null

        /**
         * [typeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun typeName(value: String) {
          this.typeName = value
        }
        
        /**
         * [typeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun typeName(value: IntrinsicFunction) {
          this.typeName = value
        }

    }

    @CloudFormationMarker
    class ElasticsearchRetryOptions {
            /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var durationInSeconds: Any? = null

        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun durationInSeconds(value: Int) {
          this.durationInSeconds = value
        }
        
        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun durationInSeconds(value: IntrinsicFunction) {
          this.durationInSeconds = value
        }

    }

    @CloudFormationMarker
    class EncryptionConfiguration {
            /**
         * [kMSEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-kmsencryptionconfig)
         *
         * _Required_: no
         *
         * _Type_: KMSEncryptionConfig
         */
        var kMSEncryptionConfig: Any? = null

        /**
         * [kMSEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-kmsencryptionconfig)
         *
         * _Required_: no
         *
         * _Type_: KMSEncryptionConfig
         */
        fun kMSEncryptionConfig(value: KMSEncryptionConfig) {
          this.kMSEncryptionConfig = value
        }
        
        /**
         * [kMSEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-kmsencryptionconfig)
         *
         * _Required_: no
         *
         * _Type_: KMSEncryptionConfig
         */
        fun kMSEncryptionConfig(value: IntrinsicFunction) {
          this.kMSEncryptionConfig = value
        }

        /**
         * [noEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var noEncryptionConfig: Any? = null

        /**
         * [noEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noEncryptionConfig(value: String) {
          this.noEncryptionConfig = value
        }
        
        /**
         * [noEncryptionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun noEncryptionConfig(value: IntrinsicFunction) {
          this.noEncryptionConfig = value
        }

    }

    @CloudFormationMarker
    class ExtendedS3DestinationConfiguration {
            /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucketARN: Any? = null

        /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketARN(value: String) {
          this.bucketARN = value
        }
        
        /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketARN(value: IntrinsicFunction) {
          this.bucketARN = value
        }

        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: BufferingHints
         */
        var bufferingHints: Any? = null

        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: BufferingHints
         */
        fun bufferingHints(value: BufferingHints) {
          this.bufferingHints = value
        }
        
        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: BufferingHints
         */
        fun bufferingHints(value: IntrinsicFunction) {
          this.bufferingHints = value
        }

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        var cloudWatchLoggingOptions: Any? = null

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: CloudWatchLoggingOptions) {
          this.cloudWatchLoggingOptions = value
        }
        
        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: IntrinsicFunction) {
          this.cloudWatchLoggingOptions = value
        }

        /**
         * [compressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var compressionFormat: Any? = null

        /**
         * [compressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun compressionFormat(value: String) {
          this.compressionFormat = value
        }
        
        /**
         * [compressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun compressionFormat(value: IntrinsicFunction) {
          this.compressionFormat = value
        }

        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        var encryptionConfiguration: Any? = null

        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        fun encryptionConfiguration(value: EncryptionConfiguration) {
          this.encryptionConfiguration = value
        }
        
        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        fun encryptionConfiguration(value: IntrinsicFunction) {
          this.encryptionConfiguration = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        var processingConfiguration: Any? = null

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: ProcessingConfiguration) {
          this.processingConfiguration = value
        }
        
        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: IntrinsicFunction) {
          this.processingConfiguration = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

        /**
         * [s3BackupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupconfiguration)
         *
         * _Required_: no
         *
         * _Type_: S3DestinationConfiguration
         */
        var s3BackupConfiguration: Any? = null

        /**
         * [s3BackupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupconfiguration)
         *
         * _Required_: no
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3BackupConfiguration(value: S3DestinationConfiguration) {
          this.s3BackupConfiguration = value
        }
        
        /**
         * [s3BackupConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupconfiguration)
         *
         * _Required_: no
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3BackupConfiguration(value: IntrinsicFunction) {
          this.s3BackupConfiguration = value
        }

        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var s3BackupMode: Any? = null

        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3BackupMode(value: String) {
          this.s3BackupMode = value
        }
        
        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3BackupMode(value: IntrinsicFunction) {
          this.s3BackupMode = value
        }

    }

    @CloudFormationMarker
    class KMSEncryptionConfig {
            /**
         * [aWSKMSKeyARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var aWSKMSKeyARN: Any? = null

        /**
         * [aWSKMSKeyARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun aWSKMSKeyARN(value: String) {
          this.aWSKMSKeyARN = value
        }
        
        /**
         * [aWSKMSKeyARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun aWSKMSKeyARN(value: IntrinsicFunction) {
          this.aWSKMSKeyARN = value
        }

    }

    @CloudFormationMarker
    class KinesisStreamSourceConfiguration {
            /**
         * [kinesisStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-kinesisstreamarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var kinesisStreamARN: Any? = null

        /**
         * [kinesisStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-kinesisstreamarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun kinesisStreamARN(value: String) {
          this.kinesisStreamARN = value
        }
        
        /**
         * [kinesisStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-kinesisstreamarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun kinesisStreamARN(value: IntrinsicFunction) {
          this.kinesisStreamARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html#cfn-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

    }

    @CloudFormationMarker
    class ProcessingConfiguration {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [processors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors)
         *
         * _Required_: no
         *
         * _Type_: List<Processor>
         */
        var processors: Any? = null

        /**
         * [processors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors)
         *
         * _Required_: no
         *
         * _Type_: List<Processor>
         */
        fun processors(value: List<Processor>) {
          this.processors = value
        }
        
        /**
         * [processors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html#cfn-kinesisfirehose-deliverystream-processingconfiguration-processors)
         *
         * _Required_: no
         *
         * _Type_: List<Processor>
         */
        fun processors(vararg value: IntrinsicFunction) {
          this.processors = value
        }

    }

    @CloudFormationMarker
    class Processor {
            /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters)
         *
         * _Required_: yes
         *
         * _Type_: List<ProcessorParameter>
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters)
         *
         * _Required_: yes
         *
         * _Type_: List<ProcessorParameter>
         */
        fun parameters(value: List<ProcessorParameter>) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-parameters)
         *
         * _Required_: yes
         *
         * _Type_: List<ProcessorParameter>
         */
        fun parameters(vararg value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class ProcessorParameter {
            /**
         * [parameterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var parameterName: Any? = null

        /**
         * [parameterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parameterName(value: String) {
          this.parameterName = value
        }
        
        /**
         * [parameterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parameterName(value: IntrinsicFunction) {
          this.parameterName = value
        }

        /**
         * [parameterValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var parameterValue: Any? = null

        /**
         * [parameterValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parameterValue(value: String) {
          this.parameterValue = value
        }
        
        /**
         * [parameterValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html#cfn-kinesisfirehose-deliverystream-processorparameter-parametervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parameterValue(value: IntrinsicFunction) {
          this.parameterValue = value
        }

    }

    @CloudFormationMarker
    class RedshiftDestinationConfiguration {
            /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        var cloudWatchLoggingOptions: Any? = null

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: CloudWatchLoggingOptions) {
          this.cloudWatchLoggingOptions = value
        }
        
        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: IntrinsicFunction) {
          this.cloudWatchLoggingOptions = value
        }

        /**
         * [clusterJDBCURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var clusterJDBCURL: Any? = null

        /**
         * [clusterJDBCURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterJDBCURL(value: String) {
          this.clusterJDBCURL = value
        }
        
        /**
         * [clusterJDBCURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun clusterJDBCURL(value: IntrinsicFunction) {
          this.clusterJDBCURL = value
        }

        /**
         * [copyCommand](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-copycommand)
         *
         * _Required_: yes
         *
         * _Type_: CopyCommand
         */
        var copyCommand: Any? = null

        /**
         * [copyCommand](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-copycommand)
         *
         * _Required_: yes
         *
         * _Type_: CopyCommand
         */
        fun copyCommand(value: CopyCommand) {
          this.copyCommand = value
        }
        
        /**
         * [copyCommand](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-copycommand)
         *
         * _Required_: yes
         *
         * _Type_: CopyCommand
         */
        fun copyCommand(value: IntrinsicFunction) {
          this.copyCommand = value
        }

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        var processingConfiguration: Any? = null

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: ProcessingConfiguration) {
          this.processingConfiguration = value
        }
        
        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: IntrinsicFunction) {
          this.processingConfiguration = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        var s3Configuration: Any? = null

        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3Configuration(value: S3DestinationConfiguration) {
          this.s3Configuration = value
        }
        
        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3Configuration(value: IntrinsicFunction) {
          this.s3Configuration = value
        }

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var username: Any? = null

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun username(value: String) {
          this.username = value
        }
        
        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun username(value: IntrinsicFunction) {
          this.username = value
        }

    }

    @CloudFormationMarker
    class S3DestinationConfiguration {
            /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucketARN: Any? = null

        /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketARN(value: String) {
          this.bucketARN = value
        }
        
        /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketARN(value: IntrinsicFunction) {
          this.bucketARN = value
        }

        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: BufferingHints
         */
        var bufferingHints: Any? = null

        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: BufferingHints
         */
        fun bufferingHints(value: BufferingHints) {
          this.bufferingHints = value
        }
        
        /**
         * [bufferingHints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bufferinghints)
         *
         * _Required_: yes
         *
         * _Type_: BufferingHints
         */
        fun bufferingHints(value: IntrinsicFunction) {
          this.bufferingHints = value
        }

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        var cloudWatchLoggingOptions: Any? = null

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: CloudWatchLoggingOptions) {
          this.cloudWatchLoggingOptions = value
        }
        
        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: IntrinsicFunction) {
          this.cloudWatchLoggingOptions = value
        }

        /**
         * [compressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var compressionFormat: Any? = null

        /**
         * [compressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun compressionFormat(value: String) {
          this.compressionFormat = value
        }
        
        /**
         * [compressionFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun compressionFormat(value: IntrinsicFunction) {
          this.compressionFormat = value
        }

        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        var encryptionConfiguration: Any? = null

        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        fun encryptionConfiguration(value: EncryptionConfiguration) {
          this.encryptionConfiguration = value
        }
        
        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        fun encryptionConfiguration(value: IntrinsicFunction) {
          this.encryptionConfiguration = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

    }

    @CloudFormationMarker
    class SplunkDestinationConfiguration {
            /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        var cloudWatchLoggingOptions: Any? = null

        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: CloudWatchLoggingOptions) {
          this.cloudWatchLoggingOptions = value
        }
        
        /**
         * [cloudWatchLoggingOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-cloudwatchloggingoptions)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLoggingOptions
         */
        fun cloudWatchLoggingOptions(value: IntrinsicFunction) {
          this.cloudWatchLoggingOptions = value
        }

        /**
         * [hECAcknowledgmentTimeoutInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var hECAcknowledgmentTimeoutInSeconds: Any? = null

        /**
         * [hECAcknowledgmentTimeoutInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hECAcknowledgmentTimeoutInSeconds(value: Int) {
          this.hECAcknowledgmentTimeoutInSeconds = value
        }
        
        /**
         * [hECAcknowledgmentTimeoutInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hECAcknowledgmentTimeoutInSeconds(value: IntrinsicFunction) {
          this.hECAcknowledgmentTimeoutInSeconds = value
        }

        /**
         * [hECEndpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hECEndpoint: Any? = null

        /**
         * [hECEndpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hECEndpoint(value: String) {
          this.hECEndpoint = value
        }
        
        /**
         * [hECEndpoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hECEndpoint(value: IntrinsicFunction) {
          this.hECEndpoint = value
        }

        /**
         * [hECEndpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hECEndpointType: Any? = null

        /**
         * [hECEndpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hECEndpointType(value: String) {
          this.hECEndpointType = value
        }
        
        /**
         * [hECEndpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hECEndpointType(value: IntrinsicFunction) {
          this.hECEndpointType = value
        }

        /**
         * [hECToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hECToken: Any? = null

        /**
         * [hECToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hECToken(value: String) {
          this.hECToken = value
        }
        
        /**
         * [hECToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hECToken(value: IntrinsicFunction) {
          this.hECToken = value
        }

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        var processingConfiguration: Any? = null

        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: ProcessingConfiguration) {
          this.processingConfiguration = value
        }
        
        /**
         * [processingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-processingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ProcessingConfiguration
         */
        fun processingConfiguration(value: IntrinsicFunction) {
          this.processingConfiguration = value
        }

        /**
         * [retryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-retryoptions)
         *
         * _Required_: no
         *
         * _Type_: SplunkRetryOptions
         */
        var retryOptions: Any? = null

        /**
         * [retryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-retryoptions)
         *
         * _Required_: no
         *
         * _Type_: SplunkRetryOptions
         */
        fun retryOptions(value: SplunkRetryOptions) {
          this.retryOptions = value
        }
        
        /**
         * [retryOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-retryoptions)
         *
         * _Required_: no
         *
         * _Type_: SplunkRetryOptions
         */
        fun retryOptions(value: IntrinsicFunction) {
          this.retryOptions = value
        }

        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var s3BackupMode: Any? = null

        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3BackupMode(value: String) {
          this.s3BackupMode = value
        }
        
        /**
         * [s3BackupMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3BackupMode(value: IntrinsicFunction) {
          this.s3BackupMode = value
        }

        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        var s3Configuration: Any? = null

        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3Configuration(value: S3DestinationConfiguration) {
          this.s3Configuration = value
        }
        
        /**
         * [s3Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3configuration)
         *
         * _Required_: yes
         *
         * _Type_: S3DestinationConfiguration
         */
        fun s3Configuration(value: IntrinsicFunction) {
          this.s3Configuration = value
        }

    }

    @CloudFormationMarker
    class SplunkRetryOptions {
            /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var durationInSeconds: Any? = null

        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun durationInSeconds(value: Int) {
          this.durationInSeconds = value
        }
        
        /**
         * [durationInSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun durationInSeconds(value: IntrinsicFunction) {
          this.durationInSeconds = value
        }

    }

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
