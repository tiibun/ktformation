
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudTrail::Trail - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html)
 */
@CloudFormationMarker
class AWSCloudTrailTrail(logicalId: String) : Resource<AWSCloudTrailTrail.Properties>(logicalId, "AWS::CloudTrail::Trail") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cloudWatchLogsLogGroupArn: Any? = null

        /**
         * [cloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchLogsLogGroupArn(value: String) {
          this.cloudWatchLogsLogGroupArn = value
        }
        
        /**
         * [cloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchLogsLogGroupArn(value: IntrinsicFunction) {
          this.cloudWatchLogsLogGroupArn = value
        }
        
        /**
         * [cloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cloudWatchLogsRoleArn: Any? = null

        /**
         * [cloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchLogsRoleArn(value: String) {
          this.cloudWatchLogsRoleArn = value
        }
        
        /**
         * [cloudWatchLogsRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchLogsRoleArn(value: IntrinsicFunction) {
          this.cloudWatchLogsRoleArn = value
        }
        
        /**
         * [enableLogFileValidation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableLogFileValidation: Any? = null

        /**
         * [enableLogFileValidation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableLogFileValidation(value: Boolean) {
          this.enableLogFileValidation = value
        }
        
        /**
         * [enableLogFileValidation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableLogFileValidation(value: IntrinsicFunction) {
          this.enableLogFileValidation = value
        }
        
        /**
         * [eventSelectors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
         *
         * _Required_: no
         *
         * _Type_: List<EventSelector>
         */
        @JvmField
        var eventSelectors: Any? = null

        /**
         * [eventSelectors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
         *
         * _Required_: no
         *
         * _Type_: List<EventSelector>
         */
        fun eventSelectors(value: List<EventSelector>) {
          this.eventSelectors = value
        }
        
        /**
         * [eventSelectors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors)
         *
         * _Required_: no
         *
         * _Type_: List<EventSelector>
         */
        fun eventSelectors(vararg value: IntrinsicFunction) {
          this.eventSelectors = value
        }
        
        /**
         * [includeGlobalServiceEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var includeGlobalServiceEvents: Any? = null

        /**
         * [includeGlobalServiceEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeGlobalServiceEvents(value: Boolean) {
          this.includeGlobalServiceEvents = value
        }
        
        /**
         * [includeGlobalServiceEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeGlobalServiceEvents(value: IntrinsicFunction) {
          this.includeGlobalServiceEvents = value
        }
        
        /**
         * [isLogging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var isLogging: Any? = null

        /**
         * [isLogging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun isLogging(value: Boolean) {
          this.isLogging = value
        }
        
        /**
         * [isLogging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun isLogging(value: IntrinsicFunction) {
          this.isLogging = value
        }
        
        /**
         * [isMultiRegionTrail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var isMultiRegionTrail: Any? = null

        /**
         * [isMultiRegionTrail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun isMultiRegionTrail(value: Boolean) {
          this.isMultiRegionTrail = value
        }
        
        /**
         * [isMultiRegionTrail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun isMultiRegionTrail(value: IntrinsicFunction) {
          this.isMultiRegionTrail = value
        }
        
        /**
         * [kMSKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kMSKeyId: Any? = null

        /**
         * [kMSKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kMSKeyId(value: String) {
          this.kMSKeyId = value
        }
        
        /**
         * [kMSKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kMSKeyId(value: IntrinsicFunction) {
          this.kMSKeyId = value
        }
        
        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var s3BucketName: Any? = null

        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BucketName(value: String) {
          this.s3BucketName = value
        }
        
        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BucketName(value: IntrinsicFunction) {
          this.s3BucketName = value
        }
        
        /**
         * [s3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var s3KeyPrefix: Any? = null

        /**
         * [s3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3KeyPrefix(value: String) {
          this.s3KeyPrefix = value
        }
        
        /**
         * [s3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3KeyPrefix(value: IntrinsicFunction) {
          this.s3KeyPrefix = value
        }
        
        /**
         * [snsTopicName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snsTopicName: Any? = null

        /**
         * [snsTopicName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snsTopicName(value: String) {
          this.snsTopicName = value
        }
        
        /**
         * [snsTopicName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snsTopicName(value: IntrinsicFunction) {
          this.snsTopicName = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [trailName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var trailName: Any? = null

        /**
         * [trailName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun trailName(value: String) {
          this.trailName = value
        }
        
        /**
         * [trailName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun trailName(value: IntrinsicFunction) {
          this.trailName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DataResource(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-dataresource.html#cfn-cloudtrail-trail-dataresource-values)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val values: List<String>? = null
    )

    class EventSelector(
            /**
             * [DataResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-dataresources)
             *
             * _Required_: no
             *
             * _Type_: List<DataResource>
             */
            val dataResources: List<DataResource>? = null,
            /**
             * [IncludeManagementEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-includemanagementevents)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeManagementEvents: Boolean? = null,
            /**
             * [ReadWriteType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-eventselector.html#cfn-cloudtrail-trail-eventselector-readwritetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val readWriteType: String? = null
    )

}

/**
 * [AWS::CloudTrail::Trail - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html)
 */
fun Resources.awsCloudTrailTrail(logicalId: String, init: AWSCloudTrailTrail.() -> Unit = {}): AWSCloudTrailTrail {
    return AWSCloudTrailTrail(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
