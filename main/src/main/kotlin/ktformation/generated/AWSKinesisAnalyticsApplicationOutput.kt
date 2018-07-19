
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

        /**
        * [DestinationSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html)
        */
        fun destinationSchema(init: DestinationSchema.() -> Unit = {}): DestinationSchema {
            return DestinationSchema().also {
                it.init()
            }
        }
        /**
        * [KinesisFirehoseOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html)
        */
        fun kinesisFirehoseOutput(init: KinesisFirehoseOutput.() -> Unit = {}): KinesisFirehoseOutput {
            return KinesisFirehoseOutput().also {
                it.init()
            }
        }
        /**
        * [KinesisStreamsOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html)
        */
        fun kinesisStreamsOutput(init: KinesisStreamsOutput.() -> Unit = {}): KinesisStreamsOutput {
            return KinesisStreamsOutput().also {
                it.init()
            }
        }
        /**
        * [LambdaOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html)
        */
        fun lambdaOutput(init: LambdaOutput.() -> Unit = {}): LambdaOutput {
            return LambdaOutput().also {
                it.init()
            }
        }
        /**
        * [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html)
        */
        fun output(init: Output.() -> Unit = {}): Output {
            return Output().also {
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
    class DestinationSchema {
            /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html#cfn-kinesisanalytics-applicationoutput-destinationschema-recordformattype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var recordFormatType: Any? = null

        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html#cfn-kinesisanalytics-applicationoutput-destinationschema-recordformattype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recordFormatType(value: String) {
          this.recordFormatType = value
        }
        
        /**
         * [recordFormatType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html#cfn-kinesisanalytics-applicationoutput-destinationschema-recordformattype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun recordFormatType(value: IntrinsicFunction) {
          this.recordFormatType = value
        }

    }

    @CloudFormationMarker
    class KinesisFirehoseOutput {
            /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceARN: Any? = null

        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: String) {
          this.resourceARN = value
        }
        
        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: IntrinsicFunction) {
          this.resourceARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-rolearn)
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
    class KinesisStreamsOutput {
            /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceARN: Any? = null

        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: String) {
          this.resourceARN = value
        }
        
        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: IntrinsicFunction) {
          this.resourceARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-rolearn)
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
    class LambdaOutput {
            /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var resourceARN: Any? = null

        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: String) {
          this.resourceARN = value
        }
        
        /**
         * [resourceARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceARN(value: IntrinsicFunction) {
          this.resourceARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-rolearn)
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
    class Output {
            /**
         * [destinationSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-destinationschema)
         *
         * _Required_: yes
         *
         * _Type_: DestinationSchema
         */
        var destinationSchema: Any? = null

        /**
         * [destinationSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-destinationschema)
         *
         * _Required_: yes
         *
         * _Type_: DestinationSchema
         */
        fun destinationSchema(value: DestinationSchema) {
          this.destinationSchema = value
        }
        
        /**
         * [destinationSchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-destinationschema)
         *
         * _Required_: yes
         *
         * _Type_: DestinationSchema
         */
        fun destinationSchema(value: IntrinsicFunction) {
          this.destinationSchema = value
        }

        /**
         * [kinesisFirehoseOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisfirehoseoutput)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseOutput
         */
        var kinesisFirehoseOutput: Any? = null

        /**
         * [kinesisFirehoseOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisfirehoseoutput)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseOutput
         */
        fun kinesisFirehoseOutput(value: KinesisFirehoseOutput) {
          this.kinesisFirehoseOutput = value
        }
        
        /**
         * [kinesisFirehoseOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisfirehoseoutput)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseOutput
         */
        fun kinesisFirehoseOutput(value: IntrinsicFunction) {
          this.kinesisFirehoseOutput = value
        }

        /**
         * [kinesisStreamsOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisstreamsoutput)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamsOutput
         */
        var kinesisStreamsOutput: Any? = null

        /**
         * [kinesisStreamsOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisstreamsoutput)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamsOutput
         */
        fun kinesisStreamsOutput(value: KinesisStreamsOutput) {
          this.kinesisStreamsOutput = value
        }
        
        /**
         * [kinesisStreamsOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisstreamsoutput)
         *
         * _Required_: no
         *
         * _Type_: KinesisStreamsOutput
         */
        fun kinesisStreamsOutput(value: IntrinsicFunction) {
          this.kinesisStreamsOutput = value
        }

        /**
         * [lambdaOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-lambdaoutput)
         *
         * _Required_: no
         *
         * _Type_: LambdaOutput
         */
        var lambdaOutput: Any? = null

        /**
         * [lambdaOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-lambdaoutput)
         *
         * _Required_: no
         *
         * _Type_: LambdaOutput
         */
        fun lambdaOutput(value: LambdaOutput) {
          this.lambdaOutput = value
        }
        
        /**
         * [lambdaOutput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-lambdaoutput)
         *
         * _Required_: no
         *
         * _Type_: LambdaOutput
         */
        fun lambdaOutput(value: IntrinsicFunction) {
          this.lambdaOutput = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

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
