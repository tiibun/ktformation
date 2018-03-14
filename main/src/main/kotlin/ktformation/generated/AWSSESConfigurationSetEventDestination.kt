
package ktformation.generated

import ktformation.*

/**
 * [AWS::SES::ConfigurationSetEventDestination - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
 */
@CloudFormationMarker
class AWSSESConfigurationSetEventDestination(logicalId: String) : Resource<AWSSESConfigurationSetEventDestination.Properties>(logicalId, "AWS::SES::ConfigurationSetEventDestination") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [configurationSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var configurationSetName: Any? = null

        /**
         * [configurationSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun configurationSetName(value: String) {
          this.configurationSetName = value
        }
        
        /**
         * [configurationSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun configurationSetName(value: IntrinsicFunction) {
          this.configurationSetName = value
        }
        
        /**
         * [eventDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
         *
         * _Required_: yes
         *
         * _Type_: EventDestination
         */
        @JvmField
        var eventDestination: Any? = null

        /**
         * [eventDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
         *
         * _Required_: yes
         *
         * _Type_: EventDestination
         */
        fun eventDestination(value: EventDestination) {
          this.eventDestination = value
        }
        
        /**
         * [eventDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
         *
         * _Required_: yes
         *
         * _Type_: EventDestination
         */
        fun eventDestination(value: IntrinsicFunction) {
          this.eventDestination = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CloudWatchDestination(
            /**
             * [DimensionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
             *
             * _Required_: no
             *
             * _Type_: List<DimensionConfiguration>
             */
            val dimensionConfigurations: List<DimensionConfiguration>? = null
    )

    class DimensionConfiguration(
            /**
             * [DefaultDimensionValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val defaultDimensionValue: String,
            /**
             * [DimensionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dimensionName: String,
            /**
             * [DimensionValueSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dimensionValueSource: String
    )

    class EventDestination(
            /**
             * [CloudWatchDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
             *
             * _Required_: no
             *
             * _Type_: CloudWatchDestination
             */
            val cloudWatchDestination: CloudWatchDestination? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [KinesisFirehoseDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
             *
             * _Required_: no
             *
             * _Type_: KinesisFirehoseDestination
             */
            val kinesisFirehoseDestination: KinesisFirehoseDestination? = null,
            /**
             * [MatchingEventTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val matchingEventTypes: List<String>,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class KinesisFirehoseDestination(
            /**
             * [DeliveryStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val deliveryStreamARN: String,
            /**
             * [IAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val iAMRoleARN: String
    )

}

/**
 * [AWS::SES::ConfigurationSetEventDestination - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
 */
fun Resources.awsSESConfigurationSetEventDestination(logicalId: String, init: AWSSESConfigurationSetEventDestination.() -> Unit = {}): AWSSESConfigurationSetEventDestination {
    return AWSSESConfigurationSetEventDestination(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
