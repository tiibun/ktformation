
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

        /**
        * [CSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html)
        */
        fun cSVMappingParameters(init: CSVMappingParameters.() -> Unit = {}): CSVMappingParameters {
            return CSVMappingParameters().also {
                it.init()
            }
        }
        /**
        * [JSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html)
        */
        fun jSONMappingParameters(init: JSONMappingParameters.() -> Unit = {}): JSONMappingParameters {
            return JSONMappingParameters().also {
                it.init()
            }
        }
        /**
        * [MappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html)
        */
        fun mappingParameters(init: MappingParameters.() -> Unit = {}): MappingParameters {
            return MappingParameters().also {
                it.init()
            }
        }
        /**
        * [RecordColumn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html)
        */
        fun recordColumn(init: RecordColumn.() -> Unit = {}): RecordColumn {
            return RecordColumn().also {
                it.init()
            }
        }
        /**
        * [RecordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html)
        */
        fun recordFormat(init: RecordFormat.() -> Unit = {}): RecordFormat {
            return RecordFormat().also {
                it.init()
            }
        }
        /**
        * [ReferenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html)
        */
        fun referenceDataSource(init: ReferenceDataSource.() -> Unit = {}): ReferenceDataSource {
            return ReferenceDataSource().also {
                it.init()
            }
        }
        /**
        * [ReferenceSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html)
        */
        fun referenceSchema(init: ReferenceSchema.() -> Unit = {}): ReferenceSchema {
            return ReferenceSchema().also {
                it.init()
            }
        }
        /**
        * [S3ReferenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html)
        */
        fun s3ReferenceDataSource(init: S3ReferenceDataSource.() -> Unit = {}): S3ReferenceDataSource {
            return S3ReferenceDataSource().also {
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
    class CSVMappingParameters {
            /**
         * [recordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordColumnDelimiter: Any? = null

        /**
         * [recordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordColumnDelimiter(value: String) {
          this.recordColumnDelimiter = value
        }
        
        /**
         * [recordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordColumnDelimiter(value: IntrinsicFunction) {
          this.recordColumnDelimiter = value
        }

        /**
         * [recordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordRowDelimiter: Any? = null

        /**
         * [recordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordRowDelimiter(value: String) {
          this.recordRowDelimiter = value
        }
        
        /**
         * [recordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordRowDelimiter(value: IntrinsicFunction) {
          this.recordRowDelimiter = value
        }

    }

    @CloudFormationMarker
    class JSONMappingParameters {
            /**
         * [recordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordRowPath: Any? = null

        /**
         * [recordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordRowPath(value: String) {
          this.recordRowPath = value
        }
        
        /**
         * [recordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordRowPath(value: IntrinsicFunction) {
          this.recordRowPath = value
        }

    }

    @CloudFormationMarker
    class MappingParameters {
            /**
         * [cSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-csvmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: CSVMappingParameters
         */
        var cSVMappingParameters: Any? = null

        /**
         * [cSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-csvmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: CSVMappingParameters
         */
        fun cSVMappingParameters(value: CSVMappingParameters) {
          this.cSVMappingParameters = value
        }
        
        /**
         * [cSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-csvmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: CSVMappingParameters
         */
        fun cSVMappingParameters(value: IntrinsicFunction) {
          this.cSVMappingParameters = value
        }

        /**
         * [jSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: JSONMappingParameters
         */
        var jSONMappingParameters: Any? = null

        /**
         * [jSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: JSONMappingParameters
         */
        fun jSONMappingParameters(value: JSONMappingParameters) {
          this.jSONMappingParameters = value
        }
        
        /**
         * [jSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: JSONMappingParameters
         */
        fun jSONMappingParameters(value: IntrinsicFunction) {
          this.jSONMappingParameters = value
        }

    }

    @CloudFormationMarker
    class RecordColumn {
            /**
         * [mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-mapping)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var mapping: Any? = null

        /**
         * [mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-mapping)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mapping(value: String) {
          this.mapping = value
        }
        
        /**
         * [mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-mapping)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mapping(value: IntrinsicFunction) {
          this.mapping = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [sqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-sqltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sqlType: Any? = null

        /**
         * [sqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-sqltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sqlType(value: String) {
          this.sqlType = value
        }
        
        /**
         * [sqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-sqltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sqlType(value: IntrinsicFunction) {
          this.sqlType = value
        }

    }

    @CloudFormationMarker
    class RecordFormat {
            /**
         * [mappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-mappingparameters)
         *
         * _Required_: no
         *
         * _Type_: MappingParameters
         */
        var mappingParameters: Any? = null

        /**
         * [mappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-mappingparameters)
         *
         * _Required_: no
         *
         * _Type_: MappingParameters
         */
        fun mappingParameters(value: MappingParameters) {
          this.mappingParameters = value
        }
        
        /**
         * [mappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-mappingparameters)
         *
         * _Required_: no
         *
         * _Type_: MappingParameters
         */
        fun mappingParameters(value: IntrinsicFunction) {
          this.mappingParameters = value
        }

        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordFormatType: Any? = null

        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordFormatType(value: String) {
          this.recordFormatType = value
        }
        
        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordFormatType(value: IntrinsicFunction) {
          this.recordFormatType = value
        }

    }

    @CloudFormationMarker
    class ReferenceDataSource {
            /**
         * [referenceSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-referenceschema)
         *
         * _Required_: yes
         *
         * _Type_: ReferenceSchema
         */
        var referenceSchema: Any? = null

        /**
         * [referenceSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-referenceschema)
         *
         * _Required_: yes
         *
         * _Type_: ReferenceSchema
         */
        fun referenceSchema(value: ReferenceSchema) {
          this.referenceSchema = value
        }
        
        /**
         * [referenceSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-referenceschema)
         *
         * _Required_: yes
         *
         * _Type_: ReferenceSchema
         */
        fun referenceSchema(value: IntrinsicFunction) {
          this.referenceSchema = value
        }

        /**
         * [s3ReferenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-s3referencedatasource)
         *
         * _Required_: no
         *
         * _Type_: S3ReferenceDataSource
         */
        var s3ReferenceDataSource: Any? = null

        /**
         * [s3ReferenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-s3referencedatasource)
         *
         * _Required_: no
         *
         * _Type_: S3ReferenceDataSource
         */
        fun s3ReferenceDataSource(value: S3ReferenceDataSource) {
          this.s3ReferenceDataSource = value
        }
        
        /**
         * [s3ReferenceDataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-s3referencedatasource)
         *
         * _Required_: no
         *
         * _Type_: S3ReferenceDataSource
         */
        fun s3ReferenceDataSource(value: IntrinsicFunction) {
          this.s3ReferenceDataSource = value
        }

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tableName: Any? = null

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tableName(value: String) {
          this.tableName = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
        }

    }

    @CloudFormationMarker
    class ReferenceSchema {
            /**
         * [recordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns)
         *
         * _Required_: yes
         *
         * _Type_: List<RecordColumn>
         */
        var recordColumns: Any? = null

        /**
         * [recordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns)
         *
         * _Required_: yes
         *
         * _Type_: List<RecordColumn>
         */
        fun recordColumns(value: List<RecordColumn>) {
          this.recordColumns = value
        }
        
        /**
         * [recordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns)
         *
         * _Required_: yes
         *
         * _Type_: List<RecordColumn>
         */
        fun recordColumns(vararg value: IntrinsicFunction) {
          this.recordColumns = value
        }

        /**
         * [recordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var recordEncoding: Any? = null

        /**
         * [recordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recordEncoding(value: String) {
          this.recordEncoding = value
        }
        
        /**
         * [recordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recordEncoding(value: IntrinsicFunction) {
          this.recordEncoding = value
        }

        /**
         * [recordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordformat)
         *
         * _Required_: yes
         *
         * _Type_: RecordFormat
         */
        var recordFormat: Any? = null

        /**
         * [recordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordformat)
         *
         * _Required_: yes
         *
         * _Type_: RecordFormat
         */
        fun recordFormat(value: RecordFormat) {
          this.recordFormat = value
        }
        
        /**
         * [recordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordformat)
         *
         * _Required_: yes
         *
         * _Type_: RecordFormat
         */
        fun recordFormat(value: IntrinsicFunction) {
          this.recordFormat = value
        }

    }

    @CloudFormationMarker
    class S3ReferenceDataSource {
            /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucketARN: Any? = null

        /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketARN(value: String) {
          this.bucketARN = value
        }
        
        /**
         * [bucketARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketARN(value: IntrinsicFunction) {
          this.bucketARN = value
        }

        /**
         * [fileKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var fileKey: Any? = null

        /**
         * [fileKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun fileKey(value: String) {
          this.fileKey = value
        }
        
        /**
         * [fileKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun fileKey(value: IntrinsicFunction) {
          this.fileKey = value
        }

        /**
         * [referenceRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var referenceRoleARN: Any? = null

        /**
         * [referenceRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun referenceRoleARN(value: String) {
          this.referenceRoleARN = value
        }
        
        /**
         * [referenceRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun referenceRoleARN(value: IntrinsicFunction) {
          this.referenceRoleARN = value
        }

    }

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
