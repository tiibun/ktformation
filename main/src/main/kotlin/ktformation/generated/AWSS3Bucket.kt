
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

        /**
        * [AbortIncompleteMultipartUpload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html)
        */
        fun abortIncompleteMultipartUpload(init: AbortIncompleteMultipartUpload.() -> Unit = {}): AbortIncompleteMultipartUpload {
            return AbortIncompleteMultipartUpload().also {
                it.init()
            }
        }
        /**
        * [AccelerateConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html)
        */
        fun accelerateConfiguration(init: AccelerateConfiguration.() -> Unit = {}): AccelerateConfiguration {
            return AccelerateConfiguration().also {
                it.init()
            }
        }
        /**
        * [AccessControlTranslation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html)
        */
        fun accessControlTranslation(init: AccessControlTranslation.() -> Unit = {}): AccessControlTranslation {
            return AccessControlTranslation().also {
                it.init()
            }
        }
        /**
        * [AnalyticsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html)
        */
        fun analyticsConfiguration(init: AnalyticsConfiguration.() -> Unit = {}): AnalyticsConfiguration {
            return AnalyticsConfiguration().also {
                it.init()
            }
        }
        /**
        * [BucketEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html)
        */
        fun bucketEncryption(init: BucketEncryption.() -> Unit = {}): BucketEncryption {
            return BucketEncryption().also {
                it.init()
            }
        }
        /**
        * [CorsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
        */
        fun corsConfiguration(init: CorsConfiguration.() -> Unit = {}): CorsConfiguration {
            return CorsConfiguration().also {
                it.init()
            }
        }
        /**
        * [CorsRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html)
        */
        fun corsRule(init: CorsRule.() -> Unit = {}): CorsRule {
            return CorsRule().also {
                it.init()
            }
        }
        /**
        * [DataExport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html)
        */
        fun dataExport(init: DataExport.() -> Unit = {}): DataExport {
            return DataExport().also {
                it.init()
            }
        }
        /**
        * [Destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html)
        */
        fun destination(init: Destination.() -> Unit = {}): Destination {
            return Destination().also {
                it.init()
            }
        }
        /**
        * [EncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html)
        */
        fun encryptionConfiguration(init: EncryptionConfiguration.() -> Unit = {}): EncryptionConfiguration {
            return EncryptionConfiguration().also {
                it.init()
            }
        }
        /**
        * [FilterRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html)
        */
        fun filterRule(init: FilterRule.() -> Unit = {}): FilterRule {
            return FilterRule().also {
                it.init()
            }
        }
        /**
        * [InventoryConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html)
        */
        fun inventoryConfiguration(init: InventoryConfiguration.() -> Unit = {}): InventoryConfiguration {
            return InventoryConfiguration().also {
                it.init()
            }
        }
        /**
        * [LambdaConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html)
        */
        fun lambdaConfiguration(init: LambdaConfiguration.() -> Unit = {}): LambdaConfiguration {
            return LambdaConfiguration().also {
                it.init()
            }
        }
        /**
        * [LifecycleConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html)
        */
        fun lifecycleConfiguration(init: LifecycleConfiguration.() -> Unit = {}): LifecycleConfiguration {
            return LifecycleConfiguration().also {
                it.init()
            }
        }
        /**
        * [LoggingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html)
        */
        fun loggingConfiguration(init: LoggingConfiguration.() -> Unit = {}): LoggingConfiguration {
            return LoggingConfiguration().also {
                it.init()
            }
        }
        /**
        * [MetricsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
        */
        fun metricsConfiguration(init: MetricsConfiguration.() -> Unit = {}): MetricsConfiguration {
            return MetricsConfiguration().also {
                it.init()
            }
        }
        /**
        * [NoncurrentVersionTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html)
        */
        fun noncurrentVersionTransition(init: NoncurrentVersionTransition.() -> Unit = {}): NoncurrentVersionTransition {
            return NoncurrentVersionTransition().also {
                it.init()
            }
        }
        /**
        * [NotificationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html)
        */
        fun notificationConfiguration(init: NotificationConfiguration.() -> Unit = {}): NotificationConfiguration {
            return NotificationConfiguration().also {
                it.init()
            }
        }
        /**
        * [NotificationFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html)
        */
        fun notificationFilter(init: NotificationFilter.() -> Unit = {}): NotificationFilter {
            return NotificationFilter().also {
                it.init()
            }
        }
        /**
        * [QueueConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html)
        */
        fun queueConfiguration(init: QueueConfiguration.() -> Unit = {}): QueueConfiguration {
            return QueueConfiguration().also {
                it.init()
            }
        }
        /**
        * [RedirectAllRequestsTo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html)
        */
        fun redirectAllRequestsTo(init: RedirectAllRequestsTo.() -> Unit = {}): RedirectAllRequestsTo {
            return RedirectAllRequestsTo().also {
                it.init()
            }
        }
        /**
        * [RedirectRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html)
        */
        fun redirectRule(init: RedirectRule.() -> Unit = {}): RedirectRule {
            return RedirectRule().also {
                it.init()
            }
        }
        /**
        * [ReplicationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html)
        */
        fun replicationConfiguration(init: ReplicationConfiguration.() -> Unit = {}): ReplicationConfiguration {
            return ReplicationConfiguration().also {
                it.init()
            }
        }
        /**
        * [ReplicationDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html)
        */
        fun replicationDestination(init: ReplicationDestination.() -> Unit = {}): ReplicationDestination {
            return ReplicationDestination().also {
                it.init()
            }
        }
        /**
        * [ReplicationRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html)
        */
        fun replicationRule(init: ReplicationRule.() -> Unit = {}): ReplicationRule {
            return ReplicationRule().also {
                it.init()
            }
        }
        /**
        * [RoutingRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
        */
        fun routingRule(init: RoutingRule.() -> Unit = {}): RoutingRule {
            return RoutingRule().also {
                it.init()
            }
        }
        /**
        * [RoutingRuleCondition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html)
        */
        fun routingRuleCondition(init: RoutingRuleCondition.() -> Unit = {}): RoutingRuleCondition {
            return RoutingRuleCondition().also {
                it.init()
            }
        }
        /**
        * [Rule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html)
        */
        fun rule(init: Rule.() -> Unit = {}): Rule {
            return Rule().also {
                it.init()
            }
        }
        /**
        * [S3KeyFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html)
        */
        fun s3KeyFilter(init: S3KeyFilter.() -> Unit = {}): S3KeyFilter {
            return S3KeyFilter().also {
                it.init()
            }
        }
        /**
        * [ServerSideEncryptionByDefault](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html)
        */
        fun serverSideEncryptionByDefault(init: ServerSideEncryptionByDefault.() -> Unit = {}): ServerSideEncryptionByDefault {
            return ServerSideEncryptionByDefault().also {
                it.init()
            }
        }
        /**
        * [ServerSideEncryptionRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html)
        */
        fun serverSideEncryptionRule(init: ServerSideEncryptionRule.() -> Unit = {}): ServerSideEncryptionRule {
            return ServerSideEncryptionRule().also {
                it.init()
            }
        }
        /**
        * [SourceSelectionCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html)
        */
        fun sourceSelectionCriteria(init: SourceSelectionCriteria.() -> Unit = {}): SourceSelectionCriteria {
            return SourceSelectionCriteria().also {
                it.init()
            }
        }
        /**
        * [SseKmsEncryptedObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html)
        */
        fun sseKmsEncryptedObjects(init: SseKmsEncryptedObjects.() -> Unit = {}): SseKmsEncryptedObjects {
            return SseKmsEncryptedObjects().also {
                it.init()
            }
        }
        /**
        * [StorageClassAnalysis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html)
        */
        fun storageClassAnalysis(init: StorageClassAnalysis.() -> Unit = {}): StorageClassAnalysis {
            return StorageClassAnalysis().also {
                it.init()
            }
        }
        /**
        * [TagFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html)
        */
        fun tagFilter(init: TagFilter.() -> Unit = {}): TagFilter {
            return TagFilter().also {
                it.init()
            }
        }
        /**
        * [TopicConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html)
        */
        fun topicConfiguration(init: TopicConfiguration.() -> Unit = {}): TopicConfiguration {
            return TopicConfiguration().also {
                it.init()
            }
        }
        /**
        * [Transition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html)
        */
        fun transition(init: Transition.() -> Unit = {}): Transition {
            return Transition().also {
                it.init()
            }
        }
        /**
        * [VersioningConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html)
        */
        fun versioningConfiguration(init: VersioningConfiguration.() -> Unit = {}): VersioningConfiguration {
            return VersioningConfiguration().also {
                it.init()
            }
        }
        /**
        * [WebsiteConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html)
        */
        fun websiteConfiguration(init: WebsiteConfiguration.() -> Unit = {}): WebsiteConfiguration {
            return WebsiteConfiguration().also {
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
    class AbortIncompleteMultipartUpload {
            /**
         * [daysAfterInitiation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var daysAfterInitiation: Any? = null

        /**
         * [daysAfterInitiation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun daysAfterInitiation(value: Int) {
          this.daysAfterInitiation = value
        }
        
        /**
         * [daysAfterInitiation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun daysAfterInitiation(value: IntrinsicFunction) {
          this.daysAfterInitiation = value
        }

    }

    @CloudFormationMarker
    class AccelerateConfiguration {
            /**
         * [accelerationStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var accelerationStatus: Any? = null

        /**
         * [accelerationStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun accelerationStatus(value: String) {
          this.accelerationStatus = value
        }
        
        /**
         * [accelerationStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun accelerationStatus(value: IntrinsicFunction) {
          this.accelerationStatus = value
        }

    }

    @CloudFormationMarker
    class AccessControlTranslation {
            /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var owner: Any? = null

        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun owner(value: String) {
          this.owner = value
        }
        
        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun owner(value: IntrinsicFunction) {
          this.owner = value
        }

    }

    @CloudFormationMarker
    class AnalyticsConfiguration {
            /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [storageClassAnalysis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-storageclassanalysis)
         *
         * _Required_: yes
         *
         * _Type_: StorageClassAnalysis
         */
        var storageClassAnalysis: Any? = null

        /**
         * [storageClassAnalysis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-storageclassanalysis)
         *
         * _Required_: yes
         *
         * _Type_: StorageClassAnalysis
         */
        fun storageClassAnalysis(value: StorageClassAnalysis) {
          this.storageClassAnalysis = value
        }
        
        /**
         * [storageClassAnalysis](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-storageclassanalysis)
         *
         * _Required_: yes
         *
         * _Type_: StorageClassAnalysis
         */
        fun storageClassAnalysis(value: IntrinsicFunction) {
          this.storageClassAnalysis = value
        }

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        var tagFilters: Any? = null

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(value: List<TagFilter>) {
          this.tagFilters = value
        }
        
        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(vararg value: IntrinsicFunction) {
          this.tagFilters = value
        }

    }

    @CloudFormationMarker
    class BucketEncryption {
            /**
         * [serverSideEncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: List<ServerSideEncryptionRule>
         */
        var serverSideEncryptionConfiguration: Any? = null

        /**
         * [serverSideEncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: List<ServerSideEncryptionRule>
         */
        fun serverSideEncryptionConfiguration(value: List<ServerSideEncryptionRule>) {
          this.serverSideEncryptionConfiguration = value
        }
        
        /**
         * [serverSideEncryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: List<ServerSideEncryptionRule>
         */
        fun serverSideEncryptionConfiguration(vararg value: IntrinsicFunction) {
          this.serverSideEncryptionConfiguration = value
        }

    }

    @CloudFormationMarker
    class CorsConfiguration {
            /**
         * [corsRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule)
         *
         * _Required_: yes
         *
         * _Type_: List<CorsRule>
         */
        var corsRules: Any? = null

        /**
         * [corsRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule)
         *
         * _Required_: yes
         *
         * _Type_: List<CorsRule>
         */
        fun corsRules(value: List<CorsRule>) {
          this.corsRules = value
        }
        
        /**
         * [corsRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html#cfn-s3-bucket-cors-corsrule)
         *
         * _Required_: yes
         *
         * _Type_: List<CorsRule>
         */
        fun corsRules(vararg value: IntrinsicFunction) {
          this.corsRules = value
        }

    }

    @CloudFormationMarker
    class CorsRule {
            /**
         * [allowedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var allowedHeaders: Any? = null

        /**
         * [allowedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedHeaders(value: List<String>) {
          this.allowedHeaders = value
        }
        
        /**
         * [allowedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedheaders)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedHeaders(vararg value: IntrinsicFunction) {
          this.allowedHeaders = value
        }

        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var allowedMethods: Any? = null

        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun allowedMethods(value: List<String>) {
          this.allowedMethods = value
        }
        
        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedmethods)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun allowedMethods(vararg value: IntrinsicFunction) {
          this.allowedMethods = value
        }

        /**
         * [allowedOrigins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var allowedOrigins: Any? = null

        /**
         * [allowedOrigins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun allowedOrigins(value: List<String>) {
          this.allowedOrigins = value
        }
        
        /**
         * [allowedOrigins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-allowedorigins)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun allowedOrigins(vararg value: IntrinsicFunction) {
          this.allowedOrigins = value
        }

        /**
         * [exposedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var exposedHeaders: Any? = null

        /**
         * [exposedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun exposedHeaders(value: List<String>) {
          this.exposedHeaders = value
        }
        
        /**
         * [exposedHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-exposedheaders)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun exposedHeaders(vararg value: IntrinsicFunction) {
          this.exposedHeaders = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [maxAge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var maxAge: Any? = null

        /**
         * [maxAge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxAge(value: Int) {
          this.maxAge = value
        }
        
        /**
         * [maxAge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors-corsrule.html#cfn-s3-bucket-cors-corsrule-maxage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxAge(value: IntrinsicFunction) {
          this.maxAge = value
        }

    }

    @CloudFormationMarker
    class DataExport {
            /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-destination)
         *
         * _Required_: yes
         *
         * _Type_: Destination
         */
        var destination: Any? = null

        /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-destination)
         *
         * _Required_: yes
         *
         * _Type_: Destination
         */
        fun destination(value: Destination) {
          this.destination = value
        }
        
        /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-destination)
         *
         * _Required_: yes
         *
         * _Type_: Destination
         */
        fun destination(value: IntrinsicFunction) {
          this.destination = value
        }

        /**
         * [outputSchemaVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var outputSchemaVersion: Any? = null

        /**
         * [outputSchemaVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun outputSchemaVersion(value: String) {
          this.outputSchemaVersion = value
        }
        
        /**
         * [outputSchemaVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun outputSchemaVersion(value: IntrinsicFunction) {
          this.outputSchemaVersion = value
        }

    }

    @CloudFormationMarker
    class Destination {
            /**
         * [bucketAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var bucketAccountId: Any? = null

        /**
         * [bucketAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketAccountId(value: String) {
          this.bucketAccountId = value
        }
        
        /**
         * [bucketAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketAccountId(value: IntrinsicFunction) {
          this.bucketAccountId = value
        }

        /**
         * [bucketArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucketArn: Any? = null

        /**
         * [bucketArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketArn(value: String) {
          this.bucketArn = value
        }
        
        /**
         * [bucketArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketArn(value: IntrinsicFunction) {
          this.bucketArn = value
        }

        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var format: Any? = null

        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun format(value: String) {
          this.format = value
        }
        
        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun format(value: IntrinsicFunction) {
          this.format = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

    }

    @CloudFormationMarker
    class EncryptionConfiguration {
            /**
         * [replicaKmsKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var replicaKmsKeyID: Any? = null

        /**
         * [replicaKmsKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicaKmsKeyID(value: String) {
          this.replicaKmsKeyID = value
        }
        
        /**
         * [replicaKmsKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicaKmsKeyID(value: IntrinsicFunction) {
          this.replicaKmsKeyID = value
        }

    }

    @CloudFormationMarker
    class FilterRule {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key-rules.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class InventoryConfiguration {
            /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-destination)
         *
         * _Required_: yes
         *
         * _Type_: Destination
         */
        var destination: Any? = null

        /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-destination)
         *
         * _Required_: yes
         *
         * _Type_: Destination
         */
        fun destination(value: Destination) {
          this.destination = value
        }
        
        /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-destination)
         *
         * _Required_: yes
         *
         * _Type_: Destination
         */
        fun destination(value: IntrinsicFunction) {
          this.destination = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [includedObjectVersions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var includedObjectVersions: Any? = null

        /**
         * [includedObjectVersions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun includedObjectVersions(value: String) {
          this.includedObjectVersions = value
        }
        
        /**
         * [includedObjectVersions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun includedObjectVersions(value: IntrinsicFunction) {
          this.includedObjectVersions = value
        }

        /**
         * [optionalFields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var optionalFields: Any? = null

        /**
         * [optionalFields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun optionalFields(value: List<String>) {
          this.optionalFields = value
        }
        
        /**
         * [optionalFields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun optionalFields(vararg value: IntrinsicFunction) {
          this.optionalFields = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [scheduleFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var scheduleFrequency: Any? = null

        /**
         * [scheduleFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scheduleFrequency(value: String) {
          this.scheduleFrequency = value
        }
        
        /**
         * [scheduleFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scheduleFrequency(value: IntrinsicFunction) {
          this.scheduleFrequency = value
        }

    }

    @CloudFormationMarker
    class LambdaConfiguration {
            /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var event: Any? = null

        /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun event(value: String) {
          this.event = value
        }
        
        /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun event(value: IntrinsicFunction) {
          this.event = value
        }

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        var filter: Any? = null

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        fun filter(value: NotificationFilter) {
          this.filter = value
        }
        
        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        fun filter(value: IntrinsicFunction) {
          this.filter = value
        }

        /**
         * [function](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var function: Any? = null

        /**
         * [function](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun function(value: String) {
          this.function = value
        }
        
        /**
         * [function](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig-function)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun function(value: IntrinsicFunction) {
          this.function = value
        }

    }

    @CloudFormationMarker
    class LifecycleConfiguration {
            /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<Rule>
         */
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<Rule>
         */
        fun rules(value: List<Rule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html#cfn-s3-bucket-lifecycleconfig-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<Rule>
         */
        fun rules(vararg value: IntrinsicFunction) {
          this.rules = value
        }

    }

    @CloudFormationMarker
    class LoggingConfiguration {
            /**
         * [destinationBucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var destinationBucketName: Any? = null

        /**
         * [destinationBucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationBucketName(value: String) {
          this.destinationBucketName = value
        }
        
        /**
         * [destinationBucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-destinationbucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationBucketName(value: IntrinsicFunction) {
          this.destinationBucketName = value
        }

        /**
         * [logFilePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var logFilePrefix: Any? = null

        /**
         * [logFilePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logFilePrefix(value: String) {
          this.logFilePrefix = value
        }
        
        /**
         * [logFilePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfig.html#cfn-s3-bucket-loggingconfig-logfileprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun logFilePrefix(value: IntrinsicFunction) {
          this.logFilePrefix = value
        }

    }

    @CloudFormationMarker
    class MetricsConfiguration {
            /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        var tagFilters: Any? = null

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(value: List<TagFilter>) {
          this.tagFilters = value
        }
        
        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(vararg value: IntrinsicFunction) {
          this.tagFilters = value
        }

    }

    @CloudFormationMarker
    class NoncurrentVersionTransition {
            /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var storageClass: Any? = null

        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun storageClass(value: String) {
          this.storageClass = value
        }
        
        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-storageclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun storageClass(value: IntrinsicFunction) {
          this.storageClass = value
        }

        /**
         * [transitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var transitionInDays: Any? = null

        /**
         * [transitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun transitionInDays(value: Int) {
          this.transitionInDays = value
        }
        
        /**
         * [transitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition-transitionindays)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun transitionInDays(value: IntrinsicFunction) {
          this.transitionInDays = value
        }

    }

    @CloudFormationMarker
    class NotificationConfiguration {
            /**
         * [lambdaConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaConfiguration>
         */
        var lambdaConfigurations: Any? = null

        /**
         * [lambdaConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaConfiguration>
         */
        fun lambdaConfigurations(value: List<LambdaConfiguration>) {
          this.lambdaConfigurations = value
        }
        
        /**
         * [lambdaConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaConfiguration>
         */
        fun lambdaConfigurations(vararg value: IntrinsicFunction) {
          this.lambdaConfigurations = value
        }

        /**
         * [queueConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig)
         *
         * _Required_: no
         *
         * _Type_: List<QueueConfiguration>
         */
        var queueConfigurations: Any? = null

        /**
         * [queueConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig)
         *
         * _Required_: no
         *
         * _Type_: List<QueueConfiguration>
         */
        fun queueConfigurations(value: List<QueueConfiguration>) {
          this.queueConfigurations = value
        }
        
        /**
         * [queueConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-queueconfig)
         *
         * _Required_: no
         *
         * _Type_: List<QueueConfiguration>
         */
        fun queueConfigurations(vararg value: IntrinsicFunction) {
          this.queueConfigurations = value
        }

        /**
         * [topicConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig)
         *
         * _Required_: no
         *
         * _Type_: List<TopicConfiguration>
         */
        var topicConfigurations: Any? = null

        /**
         * [topicConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig)
         *
         * _Required_: no
         *
         * _Type_: List<TopicConfiguration>
         */
        fun topicConfigurations(value: List<TopicConfiguration>) {
          this.topicConfigurations = value
        }
        
        /**
         * [topicConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig.html#cfn-s3-bucket-notificationconfig-topicconfig)
         *
         * _Required_: no
         *
         * _Type_: List<TopicConfiguration>
         */
        fun topicConfigurations(vararg value: IntrinsicFunction) {
          this.topicConfigurations = value
        }

    }

    @CloudFormationMarker
    class NotificationFilter {
            /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key)
         *
         * _Required_: yes
         *
         * _Type_: S3KeyFilter
         */
        var s3Key: Any? = null

        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key)
         *
         * _Required_: yes
         *
         * _Type_: S3KeyFilter
         */
        fun s3Key(value: S3KeyFilter) {
          this.s3Key = value
        }
        
        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key)
         *
         * _Required_: yes
         *
         * _Type_: S3KeyFilter
         */
        fun s3Key(value: IntrinsicFunction) {
          this.s3Key = value
        }

    }

    @CloudFormationMarker
    class QueueConfiguration {
            /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var event: Any? = null

        /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun event(value: String) {
          this.event = value
        }
        
        /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun event(value: IntrinsicFunction) {
          this.event = value
        }

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        var filter: Any? = null

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        fun filter(value: NotificationFilter) {
          this.filter = value
        }
        
        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        fun filter(value: IntrinsicFunction) {
          this.filter = value
        }

        /**
         * [queue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var queue: Any? = null

        /**
         * [queue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun queue(value: String) {
          this.queue = value
        }
        
        /**
         * [queue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun queue(value: IntrinsicFunction) {
          this.queue = value
        }

    }

    @CloudFormationMarker
    class RedirectAllRequestsTo {
            /**
         * [hostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hostName: Any? = null

        /**
         * [hostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostName(value: String) {
          this.hostName = value
        }
        
        /**
         * [hostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-hostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostName(value: IntrinsicFunction) {
          this.hostName = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-redirectallrequeststo.html#cfn-s3-websiteconfiguration-redirectallrequeststo-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

    }

    @CloudFormationMarker
    class RedirectRule {
            /**
         * [hostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var hostName: Any? = null

        /**
         * [hostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostName(value: String) {
          this.hostName = value
        }
        
        /**
         * [hostName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-hostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostName(value: IntrinsicFunction) {
          this.hostName = value
        }

        /**
         * [httpRedirectCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var httpRedirectCode: Any? = null

        /**
         * [httpRedirectCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpRedirectCode(value: String) {
          this.httpRedirectCode = value
        }
        
        /**
         * [httpRedirectCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-httpredirectcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpRedirectCode(value: IntrinsicFunction) {
          this.httpRedirectCode = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-protocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

        /**
         * [replaceKeyPrefixWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var replaceKeyPrefixWith: Any? = null

        /**
         * [replaceKeyPrefixWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replaceKeyPrefixWith(value: String) {
          this.replaceKeyPrefixWith = value
        }
        
        /**
         * [replaceKeyPrefixWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeyprefixwith)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replaceKeyPrefixWith(value: IntrinsicFunction) {
          this.replaceKeyPrefixWith = value
        }

        /**
         * [replaceKeyWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var replaceKeyWith: Any? = null

        /**
         * [replaceKeyWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replaceKeyWith(value: String) {
          this.replaceKeyWith = value
        }
        
        /**
         * [replaceKeyWith](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html#cfn-s3-websiteconfiguration-redirectrule-replacekeywith)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replaceKeyWith(value: IntrinsicFunction) {
          this.replaceKeyWith = value
        }

    }

    @CloudFormationMarker
    class ReplicationConfiguration {
            /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var role: Any? = null

        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: String) {
          this.role = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: IntrinsicFunction) {
          this.role = value
        }

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ReplicationRule>
         */
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ReplicationRule>
         */
        fun rules(value: List<ReplicationRule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<ReplicationRule>
         */
        fun rules(vararg value: IntrinsicFunction) {
          this.rules = value
        }

    }

    @CloudFormationMarker
    class ReplicationDestination {
            /**
         * [accessControlTranslation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-accesscontroltranslation)
         *
         * _Required_: no
         *
         * _Type_: AccessControlTranslation
         */
        var accessControlTranslation: Any? = null

        /**
         * [accessControlTranslation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-accesscontroltranslation)
         *
         * _Required_: no
         *
         * _Type_: AccessControlTranslation
         */
        fun accessControlTranslation(value: AccessControlTranslation) {
          this.accessControlTranslation = value
        }
        
        /**
         * [accessControlTranslation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-accesscontroltranslation)
         *
         * _Required_: no
         *
         * _Type_: AccessControlTranslation
         */
        fun accessControlTranslation(value: IntrinsicFunction) {
          this.accessControlTranslation = value
        }

        /**
         * [account](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var account: Any? = null

        /**
         * [account](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun account(value: String) {
          this.account = value
        }
        
        /**
         * [account](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun account(value: IntrinsicFunction) {
          this.account = value
        }

        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        var encryptionConfiguration: Any? = null

        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        fun encryptionConfiguration(value: EncryptionConfiguration) {
          this.encryptionConfiguration = value
        }
        
        /**
         * [encryptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-encryptionconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EncryptionConfiguration
         */
        fun encryptionConfiguration(value: IntrinsicFunction) {
          this.encryptionConfiguration = value
        }

        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var storageClass: Any? = null

        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun storageClass(value: String) {
          this.storageClass = value
        }
        
        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun storageClass(value: IntrinsicFunction) {
          this.storageClass = value
        }

    }

    @CloudFormationMarker
    class ReplicationRule {
            /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-destination)
         *
         * _Required_: yes
         *
         * _Type_: ReplicationDestination
         */
        var destination: Any? = null

        /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-destination)
         *
         * _Required_: yes
         *
         * _Type_: ReplicationDestination
         */
        fun destination(value: ReplicationDestination) {
          this.destination = value
        }
        
        /**
         * [destination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-destination)
         *
         * _Required_: yes
         *
         * _Type_: ReplicationDestination
         */
        fun destination(value: IntrinsicFunction) {
          this.destination = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [sourceSelectionCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-sourceselectioncriteria)
         *
         * _Required_: no
         *
         * _Type_: SourceSelectionCriteria
         */
        var sourceSelectionCriteria: Any? = null

        /**
         * [sourceSelectionCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-sourceselectioncriteria)
         *
         * _Required_: no
         *
         * _Type_: SourceSelectionCriteria
         */
        fun sourceSelectionCriteria(value: SourceSelectionCriteria) {
          this.sourceSelectionCriteria = value
        }
        
        /**
         * [sourceSelectionCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-sourceselectioncriteria)
         *
         * _Required_: no
         *
         * _Type_: SourceSelectionCriteria
         */
        fun sourceSelectionCriteria(value: IntrinsicFunction) {
          this.sourceSelectionCriteria = value
        }

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }

    }

    @CloudFormationMarker
    class RoutingRule {
            /**
         * [redirectRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-redirectrule)
         *
         * _Required_: yes
         *
         * _Type_: RedirectRule
         */
        var redirectRule: Any? = null

        /**
         * [redirectRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-redirectrule)
         *
         * _Required_: yes
         *
         * _Type_: RedirectRule
         */
        fun redirectRule(value: RedirectRule) {
          this.redirectRule = value
        }
        
        /**
         * [redirectRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-redirectrule)
         *
         * _Required_: yes
         *
         * _Type_: RedirectRule
         */
        fun redirectRule(value: IntrinsicFunction) {
          this.redirectRule = value
        }

        /**
         * [routingRuleCondition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition)
         *
         * _Required_: no
         *
         * _Type_: RoutingRuleCondition
         */
        var routingRuleCondition: Any? = null

        /**
         * [routingRuleCondition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition)
         *
         * _Required_: no
         *
         * _Type_: RoutingRuleCondition
         */
        fun routingRuleCondition(value: RoutingRuleCondition) {
          this.routingRuleCondition = value
        }
        
        /**
         * [routingRuleCondition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition)
         *
         * _Required_: no
         *
         * _Type_: RoutingRuleCondition
         */
        fun routingRuleCondition(value: IntrinsicFunction) {
          this.routingRuleCondition = value
        }

    }

    @CloudFormationMarker
    class RoutingRuleCondition {
            /**
         * [httpErrorCodeReturnedEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var httpErrorCodeReturnedEquals: Any? = null

        /**
         * [httpErrorCodeReturnedEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpErrorCodeReturnedEquals(value: String) {
          this.httpErrorCodeReturnedEquals = value
        }
        
        /**
         * [httpErrorCodeReturnedEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-httperrorcodereturnedequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpErrorCodeReturnedEquals(value: IntrinsicFunction) {
          this.httpErrorCodeReturnedEquals = value
        }

        /**
         * [keyPrefixEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var keyPrefixEquals: Any? = null

        /**
         * [keyPrefixEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyPrefixEquals(value: String) {
          this.keyPrefixEquals = value
        }
        
        /**
         * [keyPrefixEquals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html#cfn-s3-websiteconfiguration-routingrules-routingrulecondition-keyprefixequals)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyPrefixEquals(value: IntrinsicFunction) {
          this.keyPrefixEquals = value
        }

    }

    @CloudFormationMarker
    class Rule {
            /**
         * [abortIncompleteMultipartUpload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-abortincompletemultipartupload)
         *
         * _Required_: no
         *
         * _Type_: AbortIncompleteMultipartUpload
         */
        var abortIncompleteMultipartUpload: Any? = null

        /**
         * [abortIncompleteMultipartUpload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-abortincompletemultipartupload)
         *
         * _Required_: no
         *
         * _Type_: AbortIncompleteMultipartUpload
         */
        fun abortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload) {
          this.abortIncompleteMultipartUpload = value
        }
        
        /**
         * [abortIncompleteMultipartUpload](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-abortincompletemultipartupload)
         *
         * _Required_: no
         *
         * _Type_: AbortIncompleteMultipartUpload
         */
        fun abortIncompleteMultipartUpload(value: IntrinsicFunction) {
          this.abortIncompleteMultipartUpload = value
        }

        /**
         * [expirationDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        var expirationDate: Any? = null

        /**
         * [expirationDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun expirationDate(value: java.util.Date) {
          this.expirationDate = value
        }
        
        /**
         * [expirationDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationdate)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun expirationDate(value: IntrinsicFunction) {
          this.expirationDate = value
        }

        /**
         * [expirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var expirationInDays: Any? = null

        /**
         * [expirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun expirationInDays(value: Int) {
          this.expirationInDays = value
        }
        
        /**
         * [expirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-expirationindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun expirationInDays(value: IntrinsicFunction) {
          this.expirationInDays = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-id)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [noncurrentVersionExpirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var noncurrentVersionExpirationInDays: Any? = null

        /**
         * [noncurrentVersionExpirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun noncurrentVersionExpirationInDays(value: Int) {
          this.noncurrentVersionExpirationInDays = value
        }
        
        /**
         * [noncurrentVersionExpirationInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversionexpirationindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun noncurrentVersionExpirationInDays(value: IntrinsicFunction) {
          this.noncurrentVersionExpirationInDays = value
        }

        /**
         * [noncurrentVersionTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition)
         *
         * _Required_: no
         *
         * _Type_: NoncurrentVersionTransition
         */
        var noncurrentVersionTransition: Any? = null

        /**
         * [noncurrentVersionTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition)
         *
         * _Required_: no
         *
         * _Type_: NoncurrentVersionTransition
         */
        fun noncurrentVersionTransition(value: NoncurrentVersionTransition) {
          this.noncurrentVersionTransition = value
        }
        
        /**
         * [noncurrentVersionTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition)
         *
         * _Required_: no
         *
         * _Type_: NoncurrentVersionTransition
         */
        fun noncurrentVersionTransition(value: IntrinsicFunction) {
          this.noncurrentVersionTransition = value
        }

        /**
         * [noncurrentVersionTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions)
         *
         * _Required_: no
         *
         * _Type_: List<NoncurrentVersionTransition>
         */
        var noncurrentVersionTransitions: Any? = null

        /**
         * [noncurrentVersionTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions)
         *
         * _Required_: no
         *
         * _Type_: List<NoncurrentVersionTransition>
         */
        fun noncurrentVersionTransitions(value: List<NoncurrentVersionTransition>) {
          this.noncurrentVersionTransitions = value
        }
        
        /**
         * [noncurrentVersionTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-noncurrentversiontransitions)
         *
         * _Required_: no
         *
         * _Type_: List<NoncurrentVersionTransition>
         */
        fun noncurrentVersionTransitions(vararg value: IntrinsicFunction) {
          this.noncurrentVersionTransitions = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        var tagFilters: Any? = null

        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(value: List<TagFilter>) {
          this.tagFilters = value
        }
        
        /**
         * [tagFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-rule-tagfilters)
         *
         * _Required_: no
         *
         * _Type_: List<TagFilter>
         */
        fun tagFilters(vararg value: IntrinsicFunction) {
          this.tagFilters = value
        }

        /**
         * [transition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transition)
         *
         * _Required_: no
         *
         * _Type_: Transition
         */
        var transition: Any? = null

        /**
         * [transition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transition)
         *
         * _Required_: no
         *
         * _Type_: Transition
         */
        fun transition(value: Transition) {
          this.transition = value
        }
        
        /**
         * [transition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transition)
         *
         * _Required_: no
         *
         * _Type_: Transition
         */
        fun transition(value: IntrinsicFunction) {
          this.transition = value
        }

        /**
         * [transitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions)
         *
         * _Required_: no
         *
         * _Type_: List<Transition>
         */
        var transitions: Any? = null

        /**
         * [transitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions)
         *
         * _Required_: no
         *
         * _Type_: List<Transition>
         */
        fun transitions(value: List<Transition>) {
          this.transitions = value
        }
        
        /**
         * [transitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html#cfn-s3-bucket-lifecycleconfig-rule-transitions)
         *
         * _Required_: no
         *
         * _Type_: List<Transition>
         */
        fun transitions(vararg value: IntrinsicFunction) {
          this.transitions = value
        }

    }

    @CloudFormationMarker
    class S3KeyFilter {
            /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<FilterRule>
         */
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<FilterRule>
         */
        fun rules(value: List<FilterRule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter-s3key.html#cfn-s3-bucket-notificationconfiguraiton-config-filter-s3key-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<FilterRule>
         */
        fun rules(vararg value: IntrinsicFunction) {
          this.rules = value
        }

    }

    @CloudFormationMarker
    class ServerSideEncryptionByDefault {
            /**
         * [kMSMasterKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var kMSMasterKeyID: Any? = null

        /**
         * [kMSMasterKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kMSMasterKeyID(value: String) {
          this.kMSMasterKeyID = value
        }
        
        /**
         * [kMSMasterKeyID](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kMSMasterKeyID(value: IntrinsicFunction) {
          this.kMSMasterKeyID = value
        }

        /**
         * [sSEAlgorithm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sSEAlgorithm: Any? = null

        /**
         * [sSEAlgorithm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sSEAlgorithm(value: String) {
          this.sSEAlgorithm = value
        }
        
        /**
         * [sSEAlgorithm](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sSEAlgorithm(value: IntrinsicFunction) {
          this.sSEAlgorithm = value
        }

    }

    @CloudFormationMarker
    class ServerSideEncryptionRule {
            /**
         * [serverSideEncryptionByDefault](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-serversideencryptionbydefault)
         *
         * _Required_: no
         *
         * _Type_: ServerSideEncryptionByDefault
         */
        var serverSideEncryptionByDefault: Any? = null

        /**
         * [serverSideEncryptionByDefault](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-serversideencryptionbydefault)
         *
         * _Required_: no
         *
         * _Type_: ServerSideEncryptionByDefault
         */
        fun serverSideEncryptionByDefault(value: ServerSideEncryptionByDefault) {
          this.serverSideEncryptionByDefault = value
        }
        
        /**
         * [serverSideEncryptionByDefault](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-serversideencryptionbydefault)
         *
         * _Required_: no
         *
         * _Type_: ServerSideEncryptionByDefault
         */
        fun serverSideEncryptionByDefault(value: IntrinsicFunction) {
          this.serverSideEncryptionByDefault = value
        }

    }

    @CloudFormationMarker
    class SourceSelectionCriteria {
            /**
         * [sseKmsEncryptedObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-ssekmsencryptedobjects)
         *
         * _Required_: yes
         *
         * _Type_: SseKmsEncryptedObjects
         */
        var sseKmsEncryptedObjects: Any? = null

        /**
         * [sseKmsEncryptedObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-ssekmsencryptedobjects)
         *
         * _Required_: yes
         *
         * _Type_: SseKmsEncryptedObjects
         */
        fun sseKmsEncryptedObjects(value: SseKmsEncryptedObjects) {
          this.sseKmsEncryptedObjects = value
        }
        
        /**
         * [sseKmsEncryptedObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-ssekmsencryptedobjects)
         *
         * _Required_: yes
         *
         * _Type_: SseKmsEncryptedObjects
         */
        fun sseKmsEncryptedObjects(value: IntrinsicFunction) {
          this.sseKmsEncryptedObjects = value
        }

    }

    @CloudFormationMarker
    class SseKmsEncryptedObjects {
            /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html#cfn-s3-bucket-ssekmsencryptedobjects-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html#cfn-s3-bucket-ssekmsencryptedobjects-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html#cfn-s3-bucket-ssekmsencryptedobjects-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }

    }

    @CloudFormationMarker
    class StorageClassAnalysis {
            /**
         * [dataExport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html#cfn-s3-bucket-storageclassanalysis-dataexport)
         *
         * _Required_: no
         *
         * _Type_: DataExport
         */
        var dataExport: Any? = null

        /**
         * [dataExport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html#cfn-s3-bucket-storageclassanalysis-dataexport)
         *
         * _Required_: no
         *
         * _Type_: DataExport
         */
        fun dataExport(value: DataExport) {
          this.dataExport = value
        }
        
        /**
         * [dataExport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html#cfn-s3-bucket-storageclassanalysis-dataexport)
         *
         * _Required_: no
         *
         * _Type_: DataExport
         */
        fun dataExport(value: IntrinsicFunction) {
          this.dataExport = value
        }

    }

    @CloudFormationMarker
    class TagFilter {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class TopicConfiguration {
            /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var event: Any? = null

        /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun event(value: String) {
          this.event = value
        }
        
        /**
         * [event](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun event(value: IntrinsicFunction) {
          this.event = value
        }

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        var filter: Any? = null

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        fun filter(value: NotificationFilter) {
          this.filter = value
        }
        
        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-filter)
         *
         * _Required_: no
         *
         * _Type_: NotificationFilter
         */
        fun filter(value: IntrinsicFunction) {
          this.filter = value
        }

        /**
         * [topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var topic: Any? = null

        /**
         * [topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topic(value: String) {
          this.topic = value
        }
        
        /**
         * [topic](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topic(value: IntrinsicFunction) {
          this.topic = value
        }

    }

    @CloudFormationMarker
    class Transition {
            /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var storageClass: Any? = null

        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun storageClass(value: String) {
          this.storageClass = value
        }
        
        /**
         * [storageClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-storageclass)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun storageClass(value: IntrinsicFunction) {
          this.storageClass = value
        }

        /**
         * [transitionDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        var transitionDate: Any? = null

        /**
         * [transitionDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun transitionDate(value: java.util.Date) {
          this.transitionDate = value
        }
        
        /**
         * [transitionDate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitiondate)
         *
         * _Required_: no
         *
         * _Type_: java.util.Date
         */
        fun transitionDate(value: IntrinsicFunction) {
          this.transitionDate = value
        }

        /**
         * [transitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var transitionInDays: Any? = null

        /**
         * [transitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun transitionInDays(value: Int) {
          this.transitionInDays = value
        }
        
        /**
         * [transitionInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-transition.html#cfn-s3-bucket-lifecycleconfig-rule-transition-transitionindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun transitionInDays(value: IntrinsicFunction) {
          this.transitionInDays = value
        }

    }

    @CloudFormationMarker
    class VersioningConfiguration {
            /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfig.html#cfn-s3-bucket-versioningconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }

    }

    @CloudFormationMarker
    class WebsiteConfiguration {
            /**
         * [errorDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var errorDocument: Any? = null

        /**
         * [errorDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun errorDocument(value: String) {
          this.errorDocument = value
        }
        
        /**
         * [errorDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-errordocument)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun errorDocument(value: IntrinsicFunction) {
          this.errorDocument = value
        }

        /**
         * [indexDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var indexDocument: Any? = null

        /**
         * [indexDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun indexDocument(value: String) {
          this.indexDocument = value
        }
        
        /**
         * [indexDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-indexdocument)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun indexDocument(value: IntrinsicFunction) {
          this.indexDocument = value
        }

        /**
         * [redirectAllRequestsTo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-redirectallrequeststo)
         *
         * _Required_: no
         *
         * _Type_: RedirectAllRequestsTo
         */
        var redirectAllRequestsTo: Any? = null

        /**
         * [redirectAllRequestsTo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-redirectallrequeststo)
         *
         * _Required_: no
         *
         * _Type_: RedirectAllRequestsTo
         */
        fun redirectAllRequestsTo(value: RedirectAllRequestsTo) {
          this.redirectAllRequestsTo = value
        }
        
        /**
         * [redirectAllRequestsTo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-redirectallrequeststo)
         *
         * _Required_: no
         *
         * _Type_: RedirectAllRequestsTo
         */
        fun redirectAllRequestsTo(value: IntrinsicFunction) {
          this.redirectAllRequestsTo = value
        }

        /**
         * [routingRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules)
         *
         * _Required_: no
         *
         * _Type_: List<RoutingRule>
         */
        var routingRules: Any? = null

        /**
         * [routingRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules)
         *
         * _Required_: no
         *
         * _Type_: List<RoutingRule>
         */
        fun routingRules(value: List<RoutingRule>) {
          this.routingRules = value
        }
        
        /**
         * [routingRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration.html#cfn-s3-websiteconfiguration-routingrules)
         *
         * _Required_: no
         *
         * _Type_: List<RoutingRule>
         */
        fun routingRules(vararg value: IntrinsicFunction) {
          this.routingRules = value
        }

    }

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
