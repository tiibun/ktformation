
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudTrail::Trail - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html)
 */
@CloudFormationMarker
class AWSCloudTrailTrail(logicalId: String) : Resource<AWSCloudTrailTrail.Properties>(logicalId, "AWS::CloudTrail::Trail") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cloudWatchLogsLogGroupArn: Any? = null
        fun cloudWatchLogsLogGroupArn(value: String?) { this.cloudWatchLogsLogGroupArn = value }
        fun cloudWatchLogsLogGroupArn(value: IntrinsicFunction) { this.cloudWatchLogsLogGroupArn = value }
        @JvmField var cloudWatchLogsRoleArn: Any? = null
        fun cloudWatchLogsRoleArn(value: String?) { this.cloudWatchLogsRoleArn = value }
        fun cloudWatchLogsRoleArn(value: IntrinsicFunction) { this.cloudWatchLogsRoleArn = value }
        @JvmField var enableLogFileValidation: Any? = null
        fun enableLogFileValidation(value: Boolean?) { this.enableLogFileValidation = value }
        fun enableLogFileValidation(value: IntrinsicFunction) { this.enableLogFileValidation = value }
        @JvmField var eventSelectors: Any? = null
        fun eventSelectors(value: List<EventSelector>?) { this.eventSelectors = value }
        fun eventSelectors(vararg value: IntrinsicFunction) { this.eventSelectors = value }
        @JvmField var includeGlobalServiceEvents: Any? = null
        fun includeGlobalServiceEvents(value: Boolean?) { this.includeGlobalServiceEvents = value }
        fun includeGlobalServiceEvents(value: IntrinsicFunction) { this.includeGlobalServiceEvents = value }
        @JvmField var isLogging: Any? = null
        fun isLogging(value: Boolean) { this.isLogging = value }
        fun isLogging(value: IntrinsicFunction) { this.isLogging = value }
        @JvmField var isMultiRegionTrail: Any? = null
        fun isMultiRegionTrail(value: Boolean?) { this.isMultiRegionTrail = value }
        fun isMultiRegionTrail(value: IntrinsicFunction) { this.isMultiRegionTrail = value }
        @JvmField var kMSKeyId: Any? = null
        fun kMSKeyId(value: String?) { this.kMSKeyId = value }
        fun kMSKeyId(value: IntrinsicFunction) { this.kMSKeyId = value }
        @JvmField var s3BucketName: Any? = null
        fun s3BucketName(value: String) { this.s3BucketName = value }
        fun s3BucketName(value: IntrinsicFunction) { this.s3BucketName = value }
        @JvmField var s3KeyPrefix: Any? = null
        fun s3KeyPrefix(value: String?) { this.s3KeyPrefix = value }
        fun s3KeyPrefix(value: IntrinsicFunction) { this.s3KeyPrefix = value }
        @JvmField var snsTopicName: Any? = null
        fun snsTopicName(value: String?) { this.snsTopicName = value }
        fun snsTopicName(value: IntrinsicFunction) { this.snsTopicName = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var trailName: Any? = null
        fun trailName(value: String?) { this.trailName = value }
        fun trailName(value: IntrinsicFunction) { this.trailName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DataResource(
            val type: String,
            val values: List<String>? = null
    )

    class EventSelector(
            val dataResources: List<DataResource>? = null,
            val includeManagementEvents: Boolean? = null,
            val readWriteType: String? = null
    )

}

fun Resources.awsCloudTrailTrail(logicalId: String, init: AWSCloudTrailTrail.() -> Unit = {}): AWSCloudTrailTrail {
    return AWSCloudTrailTrail(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
