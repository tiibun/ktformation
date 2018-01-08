
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisAnalytics::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html)
 */
@CloudFormationMarker
class AWSKinesisAnalyticsApplication(logicalId: String) : Resource<AWSKinesisAnalyticsApplication.Properties>(logicalId, "AWS::KinesisAnalytics::Application") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var applicationCode: Any? = null

        fun applicationCode(value: String) {
          this.applicationCode = value
        }
        fun applicationCode(value: IntrinsicFunction) {
  this.applicationCode = value
}
        @JvmField
        var applicationDescription: Any? = null

        fun applicationDescription(value: String) {
          this.applicationDescription = value
        }
        fun applicationDescription(value: IntrinsicFunction) {
  this.applicationDescription = value
}
        @JvmField
        var applicationName: Any? = null

        fun applicationName(value: String) {
          this.applicationName = value
        }
        fun applicationName(value: IntrinsicFunction) {
  this.applicationName = value
}
        @JvmField
        var inputs: Any? = null

        fun inputs(value: List<Input>) {
          this.inputs = value
        }
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
            val recordColumnDelimiter: String,
            val recordRowDelimiter: String
    )

    class Input(
            val inputParallelism: InputParallelism? = null,
            val inputProcessingConfiguration: InputProcessingConfiguration? = null,
            val inputSchema: InputSchema,
            val kinesisFirehoseInput: KinesisFirehoseInput? = null,
            val kinesisStreamsInput: KinesisStreamsInput? = null,
            val namePrefix: String
    )

    class InputLambdaProcessor(
            val resourceARN: String,
            val roleARN: String
    )

    class InputParallelism(
            val count: Int? = null
    )

    class InputProcessingConfiguration(
            val inputLambdaProcessor: InputLambdaProcessor? = null
    )

    class InputSchema(
            val recordColumns: List<RecordColumn>,
            val recordEncoding: String? = null,
            val recordFormat: RecordFormat
    )

    class JSONMappingParameters(
            val recordRowPath: String
    )

    class KinesisFirehoseInput(
            val resourceARN: String,
            val roleARN: String
    )

    class KinesisStreamsInput(
            val resourceARN: String,
            val roleARN: String
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

}

fun Resources.awsKinesisAnalyticsApplication(logicalId: String, init: AWSKinesisAnalyticsApplication.() -> Unit = {}): AWSKinesisAnalyticsApplication {
    return AWSKinesisAnalyticsApplication(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
