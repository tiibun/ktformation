
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisAnalytics::ApplicationReferenceDataSource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
 */
@CloudFormationMarker
class AWSKinesisAnalyticsApplicationReferenceDataSource(logicalId: String) : Resource<AWSKinesisAnalyticsApplicationReferenceDataSource.Properties>(logicalId, "AWS::KinesisAnalytics::ApplicationReferenceDataSource") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var applicationName: Any? = null

        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        @JvmField
        var referenceDataSource: Any? = null

        fun referenceDataSource(value: ReferenceDataSource) {
          this.referenceDataSource = value
        }
        
        fun referenceDataSource(value: IntrinsicFunction) {
          this.referenceDataSource = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CSVMappingParameters(
            val recordColumnDelimiter: String,
            val recordRowDelimiter: String
    )

    class JSONMappingParameters(
            val recordRowPath: String
    )

    class MappingParameters(
            val cSVMappingParameters: CSVMappingParameters? = null,
            val jSONMappingParameters: JSONMappingParameters? = null
    )

    class RecordColumn(
            val mapping: String? = null,
            val name: String,
            val sqlType: String
    )

    class RecordFormat(
            val mappingParameters: MappingParameters? = null,
            val recordFormatType: String
    )

    class ReferenceDataSource(
            val referenceSchema: ReferenceSchema,
            val s3ReferenceDataSource: S3ReferenceDataSource? = null,
            val tableName: String? = null
    )

    class ReferenceSchema(
            val recordColumns: List<RecordColumn>,
            val recordEncoding: String? = null,
            val recordFormat: RecordFormat
    )

    class S3ReferenceDataSource(
            val bucketARN: String,
            val fileKey: String,
            val referenceRoleARN: String
    )

}

fun Resources.awsKinesisAnalyticsApplicationReferenceDataSource(logicalId: String, init: AWSKinesisAnalyticsApplicationReferenceDataSource.() -> Unit = {}): AWSKinesisAnalyticsApplicationReferenceDataSource {
    return AWSKinesisAnalyticsApplicationReferenceDataSource(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
