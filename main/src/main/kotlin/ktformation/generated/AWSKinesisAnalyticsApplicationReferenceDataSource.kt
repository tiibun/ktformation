
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisAnalytics::ApplicationReferenceDataSource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
 */
@CloudFormationMarker
class AWSKinesisAnalyticsApplicationReferenceDataSource(logicalId: String) : Resource<AWSKinesisAnalyticsApplicationReferenceDataSource.Properties>(logicalId, "AWS::KinesisAnalytics::ApplicationReferenceDataSource") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        /**
         * [referenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
         *
         * _Required_: yes
         *
         * _Type_: ReferenceDataSource
         */
        @JvmField
        var referenceDataSource: Any? = null

        /**
         * [referenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
         *
         * _Required_: yes
         *
         * _Type_: ReferenceDataSource
         */
        fun referenceDataSource(value: ReferenceDataSource) {
          this.referenceDataSource = value
        }
        
        /**
         * [referenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
         *
         * _Required_: yes
         *
         * _Type_: ReferenceDataSource
         */
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
            /**
             * [RecordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordColumnDelimiter: String,
            /**
             * [RecordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordRowDelimiter: String
    )

    class JSONMappingParameters(
            /**
             * [RecordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordRowPath: String
    )

    class MappingParameters(
            /**
             * [CSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-csvmappingparameters)
             *
             * _Required_: no
             *
             * _Type_: CSVMappingParameters
             */
            val cSVMappingParameters: CSVMappingParameters? = null,
            /**
             * [JSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
             *
             * _Required_: no
             *
             * _Type_: JSONMappingParameters
             */
            val jSONMappingParameters: JSONMappingParameters? = null
    )

    class RecordColumn(
            /**
             * [Mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-mapping)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val mapping: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [SqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-sqltype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sqlType: String
    )

    class RecordFormat(
            /**
             * [MappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-mappingparameters)
             *
             * _Required_: no
             *
             * _Type_: MappingParameters
             */
            val mappingParameters: MappingParameters? = null,
            /**
             * [RecordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordFormatType: String
    )

    class ReferenceDataSource(
            /**
             * [ReferenceSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-referenceschema)
             *
             * _Required_: yes
             *
             * _Type_: ReferenceSchema
             */
            val referenceSchema: ReferenceSchema,
            /**
             * [S3ReferenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-s3referencedatasource)
             *
             * _Required_: no
             *
             * _Type_: S3ReferenceDataSource
             */
            val s3ReferenceDataSource: S3ReferenceDataSource? = null,
            /**
             * [TableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tableName: String? = null
    )

    class ReferenceSchema(
            /**
             * [RecordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns)
             *
             * _Required_: yes
             *
             * _Type_: List<RecordColumn>
             */
            val recordColumns: List<RecordColumn>,
            /**
             * [RecordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val recordEncoding: String? = null,
            /**
             * [RecordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordformat)
             *
             * _Required_: yes
             *
             * _Type_: RecordFormat
             */
            val recordFormat: RecordFormat
    )

    class S3ReferenceDataSource(
            /**
             * [BucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketARN: String,
            /**
             * [FileKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val fileKey: String,
            /**
             * [ReferenceRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val referenceRoleARN: String
    )

}

/**
 * [AWS::KinesisAnalytics::ApplicationReferenceDataSource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
 */
fun Resources.awsKinesisAnalyticsApplicationReferenceDataSource(logicalId: String, init: AWSKinesisAnalyticsApplicationReferenceDataSource.() -> Unit = {}): AWSKinesisAnalyticsApplicationReferenceDataSource {
    return AWSKinesisAnalyticsApplicationReferenceDataSource(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
