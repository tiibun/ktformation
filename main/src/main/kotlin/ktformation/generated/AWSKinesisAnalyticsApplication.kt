
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

        /**
        * [CSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html)
        */
        fun cSVMappingParameters(init: CSVMappingParameters.() -> Unit = {}): CSVMappingParameters {
            return CSVMappingParameters().also {
                it.init()
            }
        }
        /**
        * [Input](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html)
        */
        fun input(init: Input.() -> Unit = {}): Input {
            return Input().also {
                it.init()
            }
        }
        /**
        * [InputLambdaProcessor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
        */
        fun inputLambdaProcessor(init: InputLambdaProcessor.() -> Unit = {}): InputLambdaProcessor {
            return InputLambdaProcessor().also {
                it.init()
            }
        }
        /**
        * [InputParallelism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html)
        */
        fun inputParallelism(init: InputParallelism.() -> Unit = {}): InputParallelism {
            return InputParallelism().also {
                it.init()
            }
        }
        /**
        * [InputProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
        */
        fun inputProcessingConfiguration(init: InputProcessingConfiguration.() -> Unit = {}): InputProcessingConfiguration {
            return InputProcessingConfiguration().also {
                it.init()
            }
        }
        /**
        * [InputSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html)
        */
        fun inputSchema(init: InputSchema.() -> Unit = {}): InputSchema {
            return InputSchema().also {
                it.init()
            }
        }
        /**
        * [JSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html)
        */
        fun jSONMappingParameters(init: JSONMappingParameters.() -> Unit = {}): JSONMappingParameters {
            return JSONMappingParameters().also {
                it.init()
            }
        }
        /**
        * [KinesisFirehoseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html)
        */
        fun kinesisFirehoseInput(init: KinesisFirehoseInput.() -> Unit = {}): KinesisFirehoseInput {
            return KinesisFirehoseInput().also {
                it.init()
            }
        }
        /**
        * [KinesisStreamsInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html)
        */
        fun kinesisStreamsInput(init: KinesisStreamsInput.() -> Unit = {}): KinesisStreamsInput {
            return KinesisStreamsInput().also {
                it.init()
            }
        }
        /**
        * [MappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html)
        */
        fun mappingParameters(init: MappingParameters.() -> Unit = {}): MappingParameters {
            return MappingParameters().also {
                it.init()
            }
        }
        /**
        * [RecordColumn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html)
        */
        fun recordColumn(init: RecordColumn.() -> Unit = {}): RecordColumn {
            return RecordColumn().also {
                it.init()
            }
        }
        /**
        * [RecordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html)
        */
        fun recordFormat(init: RecordFormat.() -> Unit = {}): RecordFormat {
            return RecordFormat().also {
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
         * [recordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordColumnDelimiter: Any? = null

        /**
         * [recordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordColumnDelimiter(value: String) {
          this.recordColumnDelimiter = value
        }
        
        /**
         * [recordColumnDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordColumnDelimiter(value: IntrinsicFunction) {
          this.recordColumnDelimiter = value
        }

        /**
         * [recordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordRowDelimiter: Any? = null

        /**
         * [recordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordRowDelimiter(value: String) {
          this.recordRowDelimiter = value
        }
        
        /**
         * [recordRowDelimiter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter)
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
    class Input {
            /**
         * [inputParallelism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputparallelism)
         *
         * _Required_: no
         *
         * _Type_: InputParallelism
         */
        var inputParallelism: Any? = null

        /**
         * [inputParallelism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputparallelism)
         *
         * _Required_: no
         *
         * _Type_: InputParallelism
         */
        fun inputParallelism(value: InputParallelism) {
          this.inputParallelism = value
        }
        
        /**
         * [inputParallelism](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputparallelism)
         *
         * _Required_: no
         *
         * _Type_: InputParallelism
         */
        fun inputParallelism(value: IntrinsicFunction) {
          this.inputParallelism = value
        }

        /**
         * [inputProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputprocessingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: InputProcessingConfiguration
         */
        var inputProcessingConfiguration: Any? = null

        /**
         * [inputProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputprocessingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: InputProcessingConfiguration
         */
        fun inputProcessingConfiguration(value: InputProcessingConfiguration) {
          this.inputProcessingConfiguration = value
        }
        
        /**
         * [inputProcessingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputprocessingconfiguration)
         *
         * _Required_: no
         *
         * _Type_: InputProcessingConfiguration
         */
        fun inputProcessingConfiguration(value: IntrinsicFunction) {
          this.inputProcessingConfiguration = value
        }

        /**
         * [inputSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputschema)
         *
         * _Required_: yes
         *
         * _Type_: InputSchema
         */
        var inputSchema: Any? = null

        /**
         * [inputSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputschema)
         *
         * _Required_: yes
         *
         * _Type_: InputSchema
         */
        fun inputSchema(value: InputSchema) {
          this.inputSchema = value
        }
        
        /**
         * [inputSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputschema)
         *
         * _Required_: yes
         *
         * _Type_: InputSchema
         */
        fun inputSchema(value: IntrinsicFunction) {
          this.inputSchema = value
        }

        /**
         * [kinesisFirehoseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisfirehoseinput)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseInput
         */
        var kinesisFirehoseInput: Any? = null

        /**
         * [kinesisFirehoseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisfirehoseinput)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseInput
         */
        fun kinesisFirehoseInput(value: KinesisFirehoseInput) {
          this.kinesisFirehoseInput = value
        }
        
        /**
         * [kinesisFirehoseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisfirehoseinput)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseInput
         */
        fun kinesisFirehoseInput(value: IntrinsicFunction) {
          this.kinesisFirehoseInput = value
        }

        /**
         * [kinesisStreamsInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisstreamsinput)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamsInput
         */
        var kinesisStreamsInput: Any? = null

        /**
         * [kinesisStreamsInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisstreamsinput)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamsInput
         */
        fun kinesisStreamsInput(value: KinesisStreamsInput) {
          this.kinesisStreamsInput = value
        }
        
        /**
         * [kinesisStreamsInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisstreamsinput)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamsInput
         */
        fun kinesisStreamsInput(value: IntrinsicFunction) {
          this.kinesisStreamsInput = value
        }

        /**
         * [namePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-nameprefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namePrefix: Any? = null

        /**
         * [namePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-nameprefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namePrefix(value: String) {
          this.namePrefix = value
        }
        
        /**
         * [namePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-nameprefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namePrefix(value: IntrinsicFunction) {
          this.namePrefix = value
        }

    }

    @CloudFormationMarker
    class InputLambdaProcessor {
            /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceARN: Any? = null

        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: String) {
          this.resourceARN = value
        }
        
        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: IntrinsicFunction) {
          this.resourceARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-rolearn)
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
    class InputParallelism {
            /**
         * [count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var count: Any? = null

        /**
         * [count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun count(value: Int) {
          this.count = value
        }
        
        /**
         * [count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun count(value: IntrinsicFunction) {
          this.count = value
        }

    }

    @CloudFormationMarker
    class InputProcessingConfiguration {
            /**
         * [inputLambdaProcessor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html#cfn-kinesisanalytics-application-inputprocessingconfiguration-inputlambdaprocessor)
         *
         * _Required_: no
         *
         * _Type_: InputLambdaProcessor
         */
        var inputLambdaProcessor: Any? = null

        /**
         * [inputLambdaProcessor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html#cfn-kinesisanalytics-application-inputprocessingconfiguration-inputlambdaprocessor)
         *
         * _Required_: no
         *
         * _Type_: InputLambdaProcessor
         */
        fun inputLambdaProcessor(value: InputLambdaProcessor) {
          this.inputLambdaProcessor = value
        }
        
        /**
         * [inputLambdaProcessor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html#cfn-kinesisanalytics-application-inputprocessingconfiguration-inputlambdaprocessor)
         *
         * _Required_: no
         *
         * _Type_: InputLambdaProcessor
         */
        fun inputLambdaProcessor(value: IntrinsicFunction) {
          this.inputLambdaProcessor = value
        }

    }

    @CloudFormationMarker
    class InputSchema {
            /**
         * [recordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns)
         *
         * _Required_: yes
         *
         * _Type_: List<RecordColumn>
         */
        var recordColumns: Any? = null

        /**
         * [recordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns)
         *
         * _Required_: yes
         *
         * _Type_: List<RecordColumn>
         */
        fun recordColumns(value: List<RecordColumn>) {
          this.recordColumns = value
        }
        
        /**
         * [recordColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns)
         *
         * _Required_: yes
         *
         * _Type_: List<RecordColumn>
         */
        fun recordColumns(vararg value: IntrinsicFunction) {
          this.recordColumns = value
        }

        /**
         * [recordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var recordEncoding: Any? = null

        /**
         * [recordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recordEncoding(value: String) {
          this.recordEncoding = value
        }
        
        /**
         * [recordEncoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recordEncoding(value: IntrinsicFunction) {
          this.recordEncoding = value
        }

        /**
         * [recordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordformat)
         *
         * _Required_: yes
         *
         * _Type_: RecordFormat
         */
        var recordFormat: Any? = null

        /**
         * [recordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordformat)
         *
         * _Required_: yes
         *
         * _Type_: RecordFormat
         */
        fun recordFormat(value: RecordFormat) {
          this.recordFormat = value
        }
        
        /**
         * [recordFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordformat)
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
    class JSONMappingParameters {
            /**
         * [recordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordRowPath: Any? = null

        /**
         * [recordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordRowPath(value: String) {
          this.recordRowPath = value
        }
        
        /**
         * [recordRowPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath)
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
    class KinesisFirehoseInput {
            /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceARN: Any? = null

        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: String) {
          this.resourceARN = value
        }
        
        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: IntrinsicFunction) {
          this.resourceARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-rolearn)
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
    class KinesisStreamsInput {
            /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceARN: Any? = null

        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: String) {
          this.resourceARN = value
        }
        
        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: IntrinsicFunction) {
          this.resourceARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-rolearn)
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
    class MappingParameters {
            /**
         * [cSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-csvmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: CSVMappingParameters
         */
        var cSVMappingParameters: Any? = null

        /**
         * [cSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-csvmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: CSVMappingParameters
         */
        fun cSVMappingParameters(value: CSVMappingParameters) {
          this.cSVMappingParameters = value
        }
        
        /**
         * [cSVMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-csvmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: CSVMappingParameters
         */
        fun cSVMappingParameters(value: IntrinsicFunction) {
          this.cSVMappingParameters = value
        }

        /**
         * [jSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-jsonmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: JSONMappingParameters
         */
        var jSONMappingParameters: Any? = null

        /**
         * [jSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-jsonmappingparameters)
         *
         * _Required_: no
         *
         * _Type_: JSONMappingParameters
         */
        fun jSONMappingParameters(value: JSONMappingParameters) {
          this.jSONMappingParameters = value
        }
        
        /**
         * [jSONMappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-jsonmappingparameters)
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
         * [mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var mapping: Any? = null

        /**
         * [mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mapping(value: String) {
          this.mapping = value
        }
        
        /**
         * [mapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mapping(value: IntrinsicFunction) {
          this.mapping = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [sqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sqlType: Any? = null

        /**
         * [sqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sqlType(value: String) {
          this.sqlType = value
        }
        
        /**
         * [sqlType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype)
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
         * [mappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-mappingparameters)
         *
         * _Required_: no
         *
         * _Type_: MappingParameters
         */
        var mappingParameters: Any? = null

        /**
         * [mappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-mappingparameters)
         *
         * _Required_: no
         *
         * _Type_: MappingParameters
         */
        fun mappingParameters(value: MappingParameters) {
          this.mappingParameters = value
        }
        
        /**
         * [mappingParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-mappingparameters)
         *
         * _Required_: no
         *
         * _Type_: MappingParameters
         */
        fun mappingParameters(value: IntrinsicFunction) {
          this.mappingParameters = value
        }

        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var recordFormatType: Any? = null

        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordFormatType(value: String) {
          this.recordFormatType = value
        }
        
        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun recordFormatType(value: IntrinsicFunction) {
          this.recordFormatType = value
        }

    }

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
