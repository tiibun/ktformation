
package ktformation.generated

import ktformation.*

/**
 * [AWS::KinesisAnalytics::ApplicationOutput - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
 */
@CloudFormationMarker
class AWSKinesisAnalyticsApplicationOutput(logicalId: String) : Resource<AWSKinesisAnalyticsApplicationOutput.Properties>(logicalId, "AWS::KinesisAnalytics::ApplicationOutput") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        /**
         * [output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
         *
         * _Required_: yes
         *
         * _Type_: Output
         */
        @JvmField
        var output: Any? = null

        /**
         * [output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
         *
         * _Required_: yes
         *
         * _Type_: Output
         */
        fun output(value: Output) {
          this.output = value
        }
        
        /**
         * [output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
         *
         * _Required_: yes
         *
         * _Type_: Output
         */
        fun output(value: IntrinsicFunction) {
          this.output = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DestinationSchema(
            /**
             * [RecordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html#cfn-kinesisanalytics-applicationoutput-destinationschema-recordformattype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val recordFormatType: String? = null
    )

    class KinesisFirehoseOutput(
            /**
             * [ResourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-resourcearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class KinesisStreamsOutput(
            /**
             * [ResourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-resourcearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class LambdaOutput(
            /**
             * [ResourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-resourcearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val resourceARN: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String
    )

    class Output(
            /**
             * [DestinationSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-destinationschema)
             *
             * _Required_: yes
             *
             * _Type_: DestinationSchema
             */
            val destinationSchema: DestinationSchema,
            /**
             * [KinesisFirehoseOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisfirehoseoutput)
             *
             * _Required_: no
             *
             * _Type_: KinesisFirehoseOutput
             */
            val kinesisFirehoseOutput: KinesisFirehoseOutput? = null,
            /**
             * [KinesisStreamsOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisstreamsoutput)
             *
             * _Required_: no
             *
             * _Type_: KinesisStreamsOutput
             */
            val kinesisStreamsOutput: KinesisStreamsOutput? = null,
            /**
             * [LambdaOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-lambdaoutput)
             *
             * _Required_: no
             *
             * _Type_: LambdaOutput
             */
            val lambdaOutput: LambdaOutput? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

}

/**
 * [AWS::KinesisAnalytics::ApplicationOutput - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
 */
fun Resources.awsKinesisAnalyticsApplicationOutput(logicalId: String, init: AWSKinesisAnalyticsApplicationOutput.() -> Unit = {}): AWSKinesisAnalyticsApplicationOutput {
    return AWSKinesisAnalyticsApplicationOutput(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
