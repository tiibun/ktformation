
package ktformation.generated

import ktformation.*

/**
 * [AWS::S3::Bucket - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html)
 */
@CloudFormationMarker
class AWSS3Bucket(logicalId: String) : Resource<AWSS3Bucket.Properties>(logicalId, "AWS::S3::Bucket") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var accelerateConfiguration: Any? = null

        fun accelerateConfiguration(value: AccelerateConfiguration) {
          this.accelerateConfiguration = value
        }
        
        fun accelerateConfiguration(value: IntrinsicFunction) {
          this.accelerateConfiguration = value
        }
        
        @JvmField
        var accessControl: Any? = null

        fun accessControl(value: String) {
          this.accessControl = value
        }
        
        fun accessControl(value: IntrinsicFunction) {
          this.accessControl = value
        }
        
        @JvmField
        var analyticsConfigurations: Any? = null

        fun analyticsConfigurations(value: List<AnalyticsConfiguration>) {
          this.analyticsConfigurations = value
        }
        
        fun analyticsConfigurations(vararg value: IntrinsicFunction) {
          this.analyticsConfigurations = value
        }
        
        @JvmField
        var bucketEncryption: Any? = null

        fun bucketEncryption(value: BucketEncryption) {
          this.bucketEncryption = value
        }
        
        fun bucketEncryption(value: IntrinsicFunction) {
          this.bucketEncryption = value
        }
        
        @JvmField
        var bucketName: Any? = null

        fun bucketName(value: String) {
          this.bucketName = value
        }
        
        fun bucketName(value: IntrinsicFunction) {
          this.bucketName = value
        }
        
        @JvmField
        var corsConfiguration: Any? = null

        fun corsConfiguration(value: CorsConfiguration) {
          this.corsConfiguration = value
        }
        
        fun corsConfiguration(value: IntrinsicFunction) {
          this.corsConfiguration = value
        }
        
        @JvmField
        var inventoryConfigurations: Any? = null

        fun inventoryConfigurations(value: List<InventoryConfiguration>) {
          this.inventoryConfigurations = value
        }
        
        fun inventoryConfigurations(vararg value: IntrinsicFunction) {
          this.inventoryConfigurations = value
        }
        
        @JvmField
        var lifecycleConfiguration: Any? = null

        fun lifecycleConfiguration(value: LifecycleConfiguration) {
          this.lifecycleConfiguration = value
        }
        
        fun lifecycleConfiguration(value: IntrinsicFunction) {
          this.lifecycleConfiguration = value
        }
        
        @JvmField
        var loggingConfiguration: Any? = null

        fun loggingConfiguration(value: LoggingConfiguration) {
          this.loggingConfiguration = value
        }
        
        fun loggingConfiguration(value: IntrinsicFunction) {
          this.loggingConfiguration = value
        }
        
        @JvmField
        var metricsConfigurations: Any? = null

        fun metricsConfigurations(value: List<MetricsConfiguration>) {
          this.metricsConfigurations = value
        }
        
        fun metricsConfigurations(vararg value: IntrinsicFunction) {
          this.metricsConfigurations = value
        }
        
        @JvmField
        var notificationConfiguration: Any? = null

        fun notificationConfiguration(value: NotificationConfiguration) {
          this.notificationConfiguration = value
        }
        
        fun notificationConfiguration(value: IntrinsicFunction) {
          this.notificationConfiguration = value
        }
        
        @JvmField
        var replicationConfiguration: Any? = null

        fun replicationConfiguration(value: ReplicationConfiguration) {
          this.replicationConfiguration = value
        }
        
        fun replicationConfiguration(value: IntrinsicFunction) {
          this.replicationConfiguration = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        @JvmField
        var versioningConfiguration: Any? = null

        fun versioningConfiguration(value: VersioningConfiguration) {
          this.versioningConfiguration = value
        }
        
        fun versioningConfiguration(value: IntrinsicFunction) {
          this.versioningConfiguration = value
        }
        
        @JvmField
        var websiteConfiguration: Any? = null

        fun websiteConfiguration(value: WebsiteConfiguration) {
          this.websiteConfiguration = value
        }
        
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
            val daysAfterInitiation: Int
    )

    class AccelerateConfiguration(
            val accelerationStatus: String
    )

    class AccessControlTranslation(
            val owner: String
    )

    class AnalyticsConfiguration(
            val id: String,
            val prefix: String? = null,
            val storageClassAnalysis: StorageClassAnalysis,
            val tagFilters: List<TagFilter>? = null
    )

    class BucketEncryption(
            val serverSideEncryptionConfiguration: List<ServerSideEncryptionRule>
    )

    class CorsConfiguration(
            val corsRules: List<CorsRule>
    )

    class CorsRule(
            val allowedHeaders: List<String>? = null,
            val allowedMethods: List<String>,
            val allowedOrigins: List<String>,
            val exposedHeaders: List<String>? = null,
            val id: String? = null,
            val maxAge: Int? = null
    )

    class DataExport(
            val destination: Destination,
            val outputSchemaVersion: String
    )

    class Destination(
            val bucketAccountId: String? = null,
            val bucketArn: String,
            val format: String,
            val prefix: String? = null
    )

    class EncryptionConfiguration(
            val replicaKmsKeyID: String
    )

    class FilterRule(
            val name: String,
            val value: String
    )

    class InventoryConfiguration(
            val destination: Destination,
            val enabled: Boolean,
            val id: String,
            val includedObjectVersions: String,
            val optionalFields: List<String>? = null,
            val prefix: String? = null,
            val scheduleFrequency: String
    )

    class LambdaConfiguration(
            val event: String,
            val filter: NotificationFilter? = null,
            val function: String
    )

    class LifecycleConfiguration(
            val rules: List<Rule>
    )

    class LoggingConfiguration(
            val destinationBucketName: String? = null,
            val logFilePrefix: String? = null
    )

    class MetricsConfiguration(
            val id: String,
            val prefix: String? = null,
            val tagFilters: List<TagFilter>? = null
    )

    class NoncurrentVersionTransition(
            val storageClass: String,
            val transitionInDays: Int
    )

    class NotificationConfiguration(
            val lambdaConfigurations: List<LambdaConfiguration>? = null,
            val queueConfigurations: List<QueueConfiguration>? = null,
            val topicConfigurations: List<TopicConfiguration>? = null
    )

    class NotificationFilter(
            val s3Key: S3KeyFilter
    )

    class QueueConfiguration(
            val event: String,
            val filter: NotificationFilter? = null,
            val queue: String
    )

    class RedirectAllRequestsTo(
            val hostName: String,
            val protocol: String? = null
    )

    class RedirectRule(
            val hostName: String? = null,
            val httpRedirectCode: String? = null,
            val protocol: String? = null,
            val replaceKeyPrefixWith: String? = null,
            val replaceKeyWith: String? = null
    )

    class ReplicationConfiguration(
            val role: String,
            val rules: List<ReplicationRule>
    )

    class ReplicationDestination(
            val accessControlTranslation: AccessControlTranslation? = null,
            val account: String? = null,
            val bucket: String,
            val encryptionConfiguration: EncryptionConfiguration? = null,
            val storageClass: String? = null
    )

    class ReplicationRule(
            val destination: ReplicationDestination,
            val id: String? = null,
            val prefix: String,
            val sourceSelectionCriteria: SourceSelectionCriteria? = null,
            val status: String
    )

    class RoutingRule(
            val redirectRule: RedirectRule,
            val routingRuleCondition: RoutingRuleCondition? = null
    )

    class RoutingRuleCondition(
            val httpErrorCodeReturnedEquals: String? = null,
            val keyPrefixEquals: String? = null
    )

    class Rule(
            val abortIncompleteMultipartUpload: AbortIncompleteMultipartUpload? = null,
            val expirationDate: java.util.Date? = null,
            val expirationInDays: Int? = null,
            val id: String? = null,
            val noncurrentVersionExpirationInDays: Int? = null,
            val noncurrentVersionTransition: NoncurrentVersionTransition? = null,
            val noncurrentVersionTransitions: List<NoncurrentVersionTransition>? = null,
            val prefix: String? = null,
            val status: String,
            val tagFilters: List<TagFilter>? = null,
            val transition: Transition? = null,
            val transitions: List<Transition>? = null
    )

    class S3KeyFilter(
            val rules: List<FilterRule>
    )

    class ServerSideEncryptionByDefault(
            val kMSMasterKeyID: String? = null,
            val sSEAlgorithm: String
    )

    class ServerSideEncryptionRule(
            val serverSideEncryptionByDefault: ServerSideEncryptionByDefault? = null
    )

    class SourceSelectionCriteria(
            val sseKmsEncryptedObjects: SseKmsEncryptedObjects
    )

    class SseKmsEncryptedObjects(
            val status: String
    )

    class StorageClassAnalysis(
            val dataExport: DataExport? = null
    )

    class TagFilter(
            val key: String,
            val value: String
    )

    class TopicConfiguration(
            val event: String,
            val filter: NotificationFilter? = null,
            val topic: String
    )

    class Transition(
            val storageClass: String,
            val transitionDate: java.util.Date? = null,
            val transitionInDays: Int? = null
    )

    class VersioningConfiguration(
            val status: String
    )

    class WebsiteConfiguration(
            val errorDocument: String? = null,
            val indexDocument: String? = null,
            val redirectAllRequestsTo: RedirectAllRequestsTo? = null,
            val routingRules: List<RoutingRule>? = null
    )

}

fun Resources.awsS3Bucket(logicalId: String, init: AWSS3Bucket.() -> Unit = {}): AWSS3Bucket {
    return AWSS3Bucket(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
