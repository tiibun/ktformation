
package ktformation.generated

import ktformation.*

/**
 * [AWS::S3::Bucket - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html)
 */
@CloudFormationMarker
class AWSS3Bucket(logicalId: String) : Resource<AWSS3Bucket.Properties>(logicalId, "AWS::S3::Bucket") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [accelerateConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AccelerateConfiguration
         */
        @JvmField
        var accelerateConfiguration: Any? = null

        /**
         * [accelerateConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AccelerateConfiguration
         */
        fun accelerateConfiguration(value: AccelerateConfiguration) {
          this.accelerateConfiguration = value
        }
        
        /**
         * [accelerateConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AccelerateConfiguration
         */
        fun accelerateConfiguration(value: IntrinsicFunction) {
          this.accelerateConfiguration = value
        }
        
        /**
         * [accessControl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var accessControl: Any? = null

        /**
         * [accessControl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun accessControl(value: String) {
          this.accessControl = value
        }
        
        /**
         * [accessControl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-accesscontrol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun accessControl(value: IntrinsicFunction) {
          this.accessControl = value
        }
        
        /**
         * [analyticsConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<AnalyticsConfiguration>
         */
        @JvmField
        var analyticsConfigurations: Any? = null

        /**
         * [analyticsConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<AnalyticsConfiguration>
         */
        fun analyticsConfigurations(value: List<AnalyticsConfiguration>) {
          this.analyticsConfigurations = value
        }
        
        /**
         * [analyticsConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<AnalyticsConfiguration>
         */
        fun analyticsConfigurations(vararg value: IntrinsicFunction) {
          this.analyticsConfigurations = value
        }
        
        /**
         * [bucketEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-bucketencryption)
         *
         * _Required_: no
         *
         * _Type_: BucketEncryption
         */
        @JvmField
        var bucketEncryption: Any? = null

        /**
         * [bucketEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-bucketencryption)
         *
         * _Required_: no
         *
         * _Type_: BucketEncryption
         */
        fun bucketEncryption(value: BucketEncryption) {
          this.bucketEncryption = value
        }
        
        /**
         * [bucketEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-bucketencryption)
         *
         * _Required_: no
         *
         * _Type_: BucketEncryption
         */
        fun bucketEncryption(value: IntrinsicFunction) {
          this.bucketEncryption = value
        }
        
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var bucketName: Any? = null

        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketName(value: String) {
          this.bucketName = value
        }
        
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketName(value: IntrinsicFunction) {
          this.bucketName = value
        }
        
        /**
         * [corsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-crossoriginconfig)
         *
         * _Required_: no
         *
         * _Type_: CorsConfiguration
         */
        @JvmField
        var corsConfiguration: Any? = null

        /**
         * [corsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-crossoriginconfig)
         *
         * _Required_: no
         *
         * _Type_: CorsConfiguration
         */
        fun corsConfiguration(value: CorsConfiguration) {
          this.corsConfiguration = value
        }
        
        /**
         * [corsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-crossoriginconfig)
         *
         * _Required_: no
         *
         * _Type_: CorsConfiguration
         */
        fun corsConfiguration(value: IntrinsicFunction) {
          this.corsConfiguration = value
        }
        
        /**
         * [inventoryConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<InventoryConfiguration>
         */
        @JvmField
        var inventoryConfigurations: Any? = null

        /**
         * [inventoryConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<InventoryConfiguration>
         */
        fun inventoryConfigurations(value: List<InventoryConfiguration>) {
          this.inventoryConfigurations = value
        }
        
        /**
         * [inventoryConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<InventoryConfiguration>
         */
        fun inventoryConfigurations(vararg value: IntrinsicFunction) {
          this.inventoryConfigurations = value
        }
        
        /**
         * [lifecycleConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-lifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: LifecycleConfiguration
         */
        @JvmField
        var lifecycleConfiguration: Any? = null

        /**
         * [lifecycleConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-lifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: LifecycleConfiguration
         */
        fun lifecycleConfiguration(value: LifecycleConfiguration) {
          this.lifecycleConfiguration = value
        }
        
        /**
         * [lifecycleConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-lifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: LifecycleConfiguration
         */
        fun lifecycleConfiguration(value: IntrinsicFunction) {
          this.lifecycleConfiguration = value
        }
        
        /**
         * [loggingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-loggingconfig)
         *
         * _Required_: no
         *
         * _Type_: LoggingConfiguration
         */
        @JvmField
        var loggingConfiguration: Any? = null

        /**
         * [loggingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-loggingconfig)
         *
         * _Required_: no
         *
         * _Type_: LoggingConfiguration
         */
        fun loggingConfiguration(value: LoggingConfiguration) {
          this.loggingConfiguration = value
        }
        
        /**
         * [loggingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-loggingconfig)
         *
         * _Required_: no
         *
         * _Type_: LoggingConfiguration
         */
        fun loggingConfiguration(value: IntrinsicFunction) {
          this.loggingConfiguration = value
        }
        
        /**
         * [metricsConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<MetricsConfiguration>
         */
        @JvmField
        var metricsConfigurations: Any? = null

        /**
         * [metricsConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<MetricsConfiguration>
         */
        fun metricsConfigurations(value: List<MetricsConfiguration>) {
          this.metricsConfigurations = value
        }
        
        /**
         * [metricsConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<MetricsConfiguration>
         */
        fun metricsConfigurations(vararg value: IntrinsicFunction) {
          this.metricsConfigurations = value
        }
        
        /**
         * [notificationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-notification)
         *
         * _Required_: no
         *
         * _Type_: NotificationConfiguration
         */
        @JvmField
        var notificationConfiguration: Any? = null

        /**
         * [notificationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-notification)
         *
         * _Required_: no
         *
         * _Type_: NotificationConfiguration
         */
        fun notificationConfiguration(value: NotificationConfiguration) {
          this.notificationConfiguration = value
        }
        
        /**
         * [notificationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-notification)
         *
         * _Required_: no
         *
         * _Type_: NotificationConfiguration
         */
        fun notificationConfiguration(value: IntrinsicFunction) {
          this.notificationConfiguration = value
        }
        
        /**
         * [replicationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ReplicationConfiguration
         */
        @JvmField
        var replicationConfiguration: Any? = null

        /**
         * [replicationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ReplicationConfiguration
         */
        fun replicationConfiguration(value: ReplicationConfiguration) {
          this.replicationConfiguration = value
        }
        
        /**
         * [replicationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ReplicationConfiguration
         */
        fun replicationConfiguration(value: IntrinsicFunction) {
          this.replicationConfiguration = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [versioningConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-versioning)
         *
         * _Required_: no
         *
         * _Type_: VersioningConfiguration
         */
        @JvmField
        var versioningConfiguration: Any? = null

        /**
         * [versioningConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-versioning)
         *
         * _Required_: no
         *
         * _Type_: VersioningConfiguration
         */
        fun versioningConfiguration(value: VersioningConfiguration) {
          this.versioningConfiguration = value
        }
        
        /**
         * [versioningConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-versioning)
         *
         * _Required_: no
         *
         * _Type_: VersioningConfiguration
         */
        fun versioningConfiguration(value: IntrinsicFunction) {
          this.versioningConfiguration = value
        }
        
        /**
         * [websiteConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
         *
         * _Required_: no
         *
         * _Type_: WebsiteConfiguration
         */
        @JvmField
        var websiteConfiguration: Any? = null

        /**
         * [websiteConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
         *
         * _Required_: no
         *
         * _Type_: WebsiteConfiguration
         */
        fun websiteConfiguration(value: WebsiteConfiguration) {
          this.websiteConfiguration = value
        }
        
        /**
         * [websiteConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
         *
         * _Required_: no
         *
         * _Type_: WebsiteConfiguration
         */
        fun websiteConfiguration(value: IntrinsicFunction) {
          this.websiteConfiguration = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AbortIncompleteMultipartUpload(
            /**
             * [DaysAfterInitiation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val daysAfterInitiation: Int
    )

    class AccelerateConfiguration(
            /**
             * [AccelerationStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val accelerationStatus: String
    )

    class AccessControlTranslation(
            /**
             * [Owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val owner: String
    )

    class AnalyticsConfiguration(
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null,
            /**
             * [StorageClassAnalysis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-storageclassanalysis)
             *
             * _Required_: yes
             *
             * _Type_: StorageClassAnalysis
             */
            val storageClassAnalysis: StorageClassAnalysis,
            /**
             * [TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters)
             *
             * _Required_: no
             *
             * _Type_: List<TagFilter>
             */
            val tagFilters: List<TagFilter>? = null
    )

    class BucketEncryption(
            /**
             * [ServerSideEncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration)
             *
             * _Required_: yes
             *
             * _Type_: List<ServerSideEncryptionRule>
             */
            val serverSideEncryptionConfiguration: List<ServerSideEncryptionRule>
    )

    class CorsConfiguration(
            /**
             * [CorsRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule)
             *
             * _Required_: yes
             *
             * _Type_: List<CorsRule>
             */
            val corsRules: List<CorsRule>
    )

    class CorsRule(
            /**
             * [AllowedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val allowedHeaders: List<String>? = null,
            /**
             * [AllowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val allowedMethods: List<String>,
            /**
             * [AllowedOrigins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val allowedOrigins: List<String>,
            /**
             * [ExposedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val exposedHeaders: List<String>? = null,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val id: String? = null,
            /**
             * [MaxAge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val maxAge: Int? = null
    )

    class DataExport(
            /**
             * [Destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-destination)
             *
             * _Required_: yes
             *
             * _Type_: Destination
             */
            val destination: Destination,
            /**
             * [OutputSchemaVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val outputSchemaVersion: String
    )

    class Destination(
            /**
             * [BucketAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val bucketAccountId: String? = null,
            /**
             * [BucketArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketArn: String,
            /**
             * [Format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val format: String,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null
    )

    class EncryptionConfiguration(
            /**
             * [ReplicaKmsKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val replicaKmsKeyID: String
    )

    class FilterRule(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class InventoryConfiguration(
            /**
             * [Destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-destination)
             *
             * _Required_: yes
             *
             * _Type_: Destination
             */
            val destination: Destination,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [IncludedObjectVersions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val includedObjectVersions: String,
            /**
             * [OptionalFields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val optionalFields: List<String>? = null,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null,
            /**
             * [ScheduleFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val scheduleFrequency: String
    )

    class LambdaConfiguration(
            /**
             * [Event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val event: String,
            /**
             * [Filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-filter)
             *
             * _Required_: no
             *
             * _Type_: NotificationFilter
             */
            val filter: NotificationFilter? = null,
            /**
             * [Function](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val function: String
    )

    class LifecycleConfiguration(
            /**
             * [Rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules)
             *
             * _Required_: yes
             *
             * _Type_: List<Rule>
             */
            val rules: List<Rule>
    )

    class LoggingConfiguration(
            /**
             * [DestinationBucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val destinationBucketName: String? = null,
            /**
             * [LogFilePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val logFilePrefix: String? = null
    )

    class MetricsConfiguration(
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null,
            /**
             * [TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters)
             *
             * _Required_: no
             *
             * _Type_: List<TagFilter>
             */
            val tagFilters: List<TagFilter>? = null
    )

    class NoncurrentVersionTransition(
            /**
             * [StorageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val storageClass: String,
            /**
             * [TransitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val transitionInDays: Int
    )

    class NotificationConfiguration(
            /**
             * [LambdaConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig)
             *
             * _Required_: no
             *
             * _Type_: List<LambdaConfiguration>
             */
            val lambdaConfigurations: List<LambdaConfiguration>? = null,
            /**
             * [QueueConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig)
             *
             * _Required_: no
             *
             * _Type_: List<QueueConfiguration>
             */
            val queueConfigurations: List<QueueConfiguration>? = null,
            /**
             * [TopicConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig)
             *
             * _Required_: no
             *
             * _Type_: List<TopicConfiguration>
             */
            val topicConfigurations: List<TopicConfiguration>? = null
    )

    class NotificationFilter(
            /**
             * [S3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key)
             *
             * _Required_: yes
             *
             * _Type_: S3KeyFilter
             */
            val s3Key: S3KeyFilter
    )

    class QueueConfiguration(
            /**
             * [Event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val event: String,
            /**
             * [Filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-filter)
             *
             * _Required_: no
             *
             * _Type_: NotificationFilter
             */
            val filter: NotificationFilter? = null,
            /**
             * [Queue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val queue: String
    )

    class RedirectAllRequestsTo(
            /**
             * [HostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val hostName: String,
            /**
             * [Protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val protocol: String? = null
    )

    class RedirectRule(
            /**
             * [HostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hostName: String? = null,
            /**
             * [HttpRedirectCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val httpRedirectCode: String? = null,
            /**
             * [Protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val protocol: String? = null,
            /**
             * [ReplaceKeyPrefixWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val replaceKeyPrefixWith: String? = null,
            /**
             * [ReplaceKeyWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val replaceKeyWith: String? = null
    )

    class ReplicationConfiguration(
            /**
             * [Role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val role: String,
            /**
             * [Rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules)
             *
             * _Required_: yes
             *
             * _Type_: List<ReplicationRule>
             */
            val rules: List<ReplicationRule>
    )

    class ReplicationDestination(
            /**
             * [AccessControlTranslation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-accesscontroltranslation)
             *
             * _Required_: no
             *
             * _Type_: AccessControlTranslation
             */
            val accessControlTranslation: AccessControlTranslation? = null,
            /**
             * [Account](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val account: String? = null,
            /**
             * [Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [EncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-encryptionconfiguration)
             *
             * _Required_: no
             *
             * _Type_: EncryptionConfiguration
             */
            val encryptionConfiguration: EncryptionConfiguration? = null,
            /**
             * [StorageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val storageClass: String? = null
    )

    class ReplicationRule(
            /**
             * [Destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-destination)
             *
             * _Required_: yes
             *
             * _Type_: ReplicationDestination
             */
            val destination: ReplicationDestination,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val id: String? = null,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val prefix: String,
            /**
             * [SourceSelectionCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-sourceselectioncriteria)
             *
             * _Required_: no
             *
             * _Type_: SourceSelectionCriteria
             */
            val sourceSelectionCriteria: SourceSelectionCriteria? = null,
            /**
             * [Status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val status: String
    )

    class RoutingRule(
            /**
             * [RedirectRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-redirectrule)
             *
             * _Required_: yes
             *
             * _Type_: RedirectRule
             */
            val redirectRule: RedirectRule,
            /**
             * [RoutingRuleCondition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition)
             *
             * _Required_: no
             *
             * _Type_: RoutingRuleCondition
             */
            val routingRuleCondition: RoutingRuleCondition? = null
    )

    class RoutingRuleCondition(
            /**
             * [HttpErrorCodeReturnedEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val httpErrorCodeReturnedEquals: String? = null,
            /**
             * [KeyPrefixEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val keyPrefixEquals: String? = null
    )

    class Rule(
            /**
             * [AbortIncompleteMultipartUpload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-abortincompletemultipartupload)
             *
             * _Required_: no
             *
             * _Type_: AbortIncompleteMultipartUpload
             */
            val abortIncompleteMultipartUpload: AbortIncompleteMultipartUpload? = null,
            /**
             * [ExpirationDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate)
             *
             * _Required_: no
             *
             * _Type_: java.util.Date
             */
            val expirationDate: java.util.Date? = null,
            /**
             * [ExpirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val expirationInDays: Int? = null,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val id: String? = null,
            /**
             * [NoncurrentVersionExpirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val noncurrentVersionExpirationInDays: Int? = null,
            /**
             * [NoncurrentVersionTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition)
             *
             * _Required_: no
             *
             * _Type_: NoncurrentVersionTransition
             */
            val noncurrentVersionTransition: NoncurrentVersionTransition? = null,
            /**
             * [NoncurrentVersionTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions)
             *
             * _Required_: no
             *
             * _Type_: List<NoncurrentVersionTransition>
             */
            val noncurrentVersionTransitions: List<NoncurrentVersionTransition>? = null,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null,
            /**
             * [Status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val status: String,
            /**
             * [TagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters)
             *
             * _Required_: no
             *
             * _Type_: List<TagFilter>
             */
            val tagFilters: List<TagFilter>? = null,
            /**
             * [Transition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transition)
             *
             * _Required_: no
             *
             * _Type_: Transition
             */
            val transition: Transition? = null,
            /**
             * [Transitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions)
             *
             * _Required_: no
             *
             * _Type_: List<Transition>
             */
            val transitions: List<Transition>? = null
    )

    class S3KeyFilter(
            /**
             * [Rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules)
             *
             * _Required_: yes
             *
             * _Type_: List<FilterRule>
             */
            val rules: List<FilterRule>
    )

    class ServerSideEncryptionByDefault(
            /**
             * [KMSMasterKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val kMSMasterKeyID: String? = null,
            /**
             * [SSEAlgorithm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sSEAlgorithm: String
    )

    class ServerSideEncryptionRule(
            /**
             * [ServerSideEncryptionByDefault](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-serversideencryptionbydefault)
             *
             * _Required_: no
             *
             * _Type_: ServerSideEncryptionByDefault
             */
            val serverSideEncryptionByDefault: ServerSideEncryptionByDefault? = null
    )

    class SourceSelectionCriteria(
            /**
             * [SseKmsEncryptedObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-ssekmsencryptedobjects)
             *
             * _Required_: yes
             *
             * _Type_: SseKmsEncryptedObjects
             */
            val sseKmsEncryptedObjects: SseKmsEncryptedObjects
    )

    class SseKmsEncryptedObjects(
            /**
             * [Status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html#cfn-s3-bucket-ssekmsencryptedobjects-status)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val status: String
    )

    class StorageClassAnalysis(
            /**
             * [DataExport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html#cfn-s3-bucket-storageclassanalysis-dataexport)
             *
             * _Required_: no
             *
             * _Type_: DataExport
             */
            val dataExport: DataExport? = null
    )

    class TagFilter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class TopicConfiguration(
            /**
             * [Event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val event: String,
            /**
             * [Filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-filter)
             *
             * _Required_: no
             *
             * _Type_: NotificationFilter
             */
            val filter: NotificationFilter? = null,
            /**
             * [Topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val topic: String
    )

    class Transition(
            /**
             * [StorageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val storageClass: String,
            /**
             * [TransitionDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate)
             *
             * _Required_: no
             *
             * _Type_: java.util.Date
             */
            val transitionDate: java.util.Date? = null,
            /**
             * [TransitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val transitionInDays: Int? = null
    )

    class VersioningConfiguration(
            /**
             * [Status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val status: String
    )

    class WebsiteConfiguration(
            /**
             * [ErrorDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val errorDocument: String? = null,
            /**
             * [IndexDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val indexDocument: String? = null,
            /**
             * [RedirectAllRequestsTo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-redirectallrequeststo)
             *
             * _Required_: no
             *
             * _Type_: RedirectAllRequestsTo
             */
            val redirectAllRequestsTo: RedirectAllRequestsTo? = null,
            /**
             * [RoutingRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules)
             *
             * _Required_: no
             *
             * _Type_: List<RoutingRule>
             */
            val routingRules: List<RoutingRule>? = null
    )

}

/**
 * [AWS::S3::Bucket - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html)
 */
fun Resources.awsS3Bucket(logicalId: String, init: AWSS3Bucket.() -> Unit = {}): AWSS3Bucket {
    return AWSS3Bucket(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
