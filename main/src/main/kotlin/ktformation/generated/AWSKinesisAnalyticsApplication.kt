
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisAnalytics::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html)
 */
@CloudFormationMarker
class AWSKinesisAnalyticsApplication(logicalId: String) : Resource<AWSKinesisAnalyticsApplication.Properties>(logicalId, "AWS::KinesisAnalytics::Application") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var applicationCode: Any? = null

        /**
         * [applicationCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationCode(value: String) {
          this.applicationCode = value
        }
        
        /**
         * [applicationCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationCode(value: IntrinsicFunction) {
          this.applicationCode = value
        }
        
        /**
         * [applicationDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var applicationDescription: Any? = null

        /**
         * [applicationDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationDescription(value: String) {
          this.applicationDescription = value
        }
        
        /**
         * [applicationDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationDescription(value: IntrinsicFunction) {
          this.applicationDescription = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        /**
         * [inputs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
         *
         * _Required_: yes
         *
         * _Type_: List<Input>
         */
        @JvmField
        var inputs: Any? = null

        /**
         * [inputs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
         *
         * _Required_: yes
         *
         * _Type_: List<Input>
         */
        fun inputs(value: List<Input>) {
          this.inputs = value
        }
        
        /**
         * [inputs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
         *
         * _Required_: yes
         *
         * _Type_: List<Input>
         */
        fun inputs(vararg value: IntrinsicFunction) {
          this.inputs = value
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
             * [RecordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordColumnDelimiter: String,
            /**
             * [RecordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordRowDelimiter: String
    )

    class Input(
            /**
             * [InputParallelism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputparallelism)
             *
             * _Required_: no
             *
             * _Type_: InputParallelism
             */
            val inputParallelism: InputParallelism? = null,
            /**
             * [InputProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputprocessingconfiguration)
             *
             * _Required_: no
             *
             * _Type_: InputProcessingConfiguration
             */
            val inputProcessingConfiguration: InputProcessingConfiguration? = null,
            /**
             * [InputSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputschema)
             *
             * _Required_: yes
             *
             * _Type_: InputSchema
             */
            val inputSchema: InputSchema,
            /**
             * [KinesisFirehoseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisfirehoseinput)
             *
             * _Required_: no
             *
             * _Type_: KinesisFirehoseInput
             */
            val kinesisFirehoseInput: KinesisFirehoseInput? = null,
            /**
             * [KinesisStreamsInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisstreamsinput)
             *
             * _Required_: no
             *
             * _Type_: KinesisStreamsInput
             */
            val kinesisStreamsInput: KinesisStreamsInput? = null,
            /**
             * [NamePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-nameprefix)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namePrefix: String
    )

    class InputLambdaProcessor(
            /**
             * [ResourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-resourcearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class InputParallelism(
            /**
             * [Count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val count: Int? = null
    )

    class InputProcessingConfiguration(
            /**
             * [InputLambdaProcessor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html#cfn-kinesisanalytics-application-inputprocessingconfiguration-inputlambdaprocessor)
             *
             * _Required_: no
             *
             * _Type_: InputLambdaProcessor
             */
            val inputLambdaProcessor: InputLambdaProcessor? = null
    )

    class InputSchema(
            /**
             * [RecordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns)
             *
             * _Required_: yes
             *
             * _Type_: List<RecordColumn>
             */
            val recordColumns: List<RecordColumn>,
            /**
             * [RecordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val recordEncoding: String? = null,
            /**
             * [RecordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordformat)
             *
             * _Required_: yes
             *
             * _Type_: RecordFormat
             */
            val recordFormat: RecordFormat
    )

    class JSONMappingParameters(
            /**
             * [RecordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordRowPath: String
    )

    class KinesisFirehoseInput(
            /**
             * [ResourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-resourcearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class KinesisStreamsInput(
            /**
             * [ResourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-resourcearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class MappingParameters(
            /**
             * [CSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-csvmappingparameters)
             *
             * _Required_: no
             *
             * _Type_: CSVMappingParameters
             */
            val cSVMappingParameters: CSVMappingParameters? = null,
            /**
             * [JSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-jsonmappingparameters)
             *
             * _Required_: no
             *
             * _Type_: JSONMappingParameters
             */
            val jSONMappingParameters: JSONMappingParameters? = null
    )

    class RecordColumn(
            /**
             * [Mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val mapping: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [SqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sqlType: String
    )

    class RecordFormat(
            /**
             * [MappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-mappingparameters)
             *
             * _Required_: no
             *
             * _Type_: MappingParameters
             */
            val mappingParameters: MappingParameters? = null,
            /**
             * [RecordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val recordFormatType: String
    )

}

/**
 * [AWS::KinesisAnalytics::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html)
 */
fun Resources.awsKinesisAnalyticsApplication(logicalId: String, init: AWSKinesisAnalyticsApplication.() -> Unit = {}): AWSKinesisAnalyticsApplication {
    return AWSKinesisAnalyticsApplication(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
