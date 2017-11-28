
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisAnalytics::ApplicationOutput - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
 */
@CloudFormationMarker
class AWSKinesisAnalyticsApplicationOutput(logicalId: String) : Resource<AWSKinesisAnalyticsApplicationOutput.Properties>(logicalId, "AWS::KinesisAnalytics::ApplicationOutput") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var applicationName: Any? = null
        fun applicationName(value: String) { this.applicationName = value }
        fun applicationName(value: IntrinsicFunction) { this.applicationName = value }
        @JvmField var output: Any? = null
        fun output(value: Output) { this.output = value }
        fun output(value: IntrinsicFunction) { this.output = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DestinationSchema(
            val recordFormatType: String? = null
    )

    class KinesisFirehoseOutput(
            val resourceARN: String,
            val roleARN: String
    )

    class KinesisStreamsOutput(
            val resourceARN: String,
            val roleARN: String
    )

    class Output(
            val destinationSchema: DestinationSchema,
            val kinesisFirehoseOutput: KinesisFirehoseOutput? = null,
            val kinesisStreamsOutput: KinesisStreamsOutput? = null,
            val name: String? = null
    )

}

fun Resources.awsKinesisAnalyticsApplicationOutput(logicalId: String, init: AWSKinesisAnalyticsApplicationOutput.() -> Unit = {}): AWSKinesisAnalyticsApplicationOutput {
    return AWSKinesisAnalyticsApplicationOutput(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
