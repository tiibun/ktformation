
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

        /**
        * [CloudWatchDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html)
        */
        fun cloudWatchDestination(init: CloudWatchDestination.() -> Unit = {}): CloudWatchDestination {
            return CloudWatchDestination().also {
                it.init()
            }
        }
        /**
        * [DimensionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html)
        */
        fun dimensionConfiguration(init: DimensionConfiguration.() -> Unit = {}): DimensionConfiguration {
            return DimensionConfiguration().also {
                it.init()
            }
        }
        /**
        * [EventDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html)
        */
        fun eventDestination(init: EventDestination.() -> Unit = {}): EventDestination {
            return EventDestination().also {
                it.init()
            }
        }
        /**
        * [KinesisFirehoseDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html)
        */
        fun kinesisFirehoseDestination(init: KinesisFirehoseDestination.() -> Unit = {}): KinesisFirehoseDestination {
            return KinesisFirehoseDestination().also {
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
    class CloudWatchDestination {
            /**
         * [dimensionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<DimensionConfiguration>
         */
        var dimensionConfigurations: Any? = null

        /**
         * [dimensionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<DimensionConfiguration>
         */
        fun dimensionConfigurations(value: List<DimensionConfiguration>) {
          this.dimensionConfigurations = value
        }
        
        /**
         * [dimensionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html#cfn-ses-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<DimensionConfiguration>
         */
        fun dimensionConfigurations(vararg value: IntrinsicFunction) {
          this.dimensionConfigurations = value
        }

    }

    @CloudFormationMarker
    class DimensionConfiguration {
            /**
         * [defaultDimensionValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var defaultDimensionValue: Any? = null

        /**
         * [defaultDimensionValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun defaultDimensionValue(value: String) {
          this.defaultDimensionValue = value
        }
        
        /**
         * [defaultDimensionValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun defaultDimensionValue(value: IntrinsicFunction) {
          this.defaultDimensionValue = value
        }

        /**
         * [dimensionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dimensionName: Any? = null

        /**
         * [dimensionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dimensionName(value: String) {
          this.dimensionName = value
        }
        
        /**
         * [dimensionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dimensionName(value: IntrinsicFunction) {
          this.dimensionName = value
        }

        /**
         * [dimensionValueSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dimensionValueSource: Any? = null

        /**
         * [dimensionValueSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dimensionValueSource(value: String) {
          this.dimensionValueSource = value
        }
        
        /**
         * [dimensionValueSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-dimensionconfiguration.html#cfn-ses-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dimensionValueSource(value: IntrinsicFunction) {
          this.dimensionValueSource = value
        }

    }

    @CloudFormationMarker
    class EventDestination {
            /**
         * [cloudWatchDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchDestination
         */
        var cloudWatchDestination: Any? = null

        /**
         * [cloudWatchDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchDestination
         */
        fun cloudWatchDestination(value: CloudWatchDestination) {
          this.cloudWatchDestination = value
        }
        
        /**
         * [cloudWatchDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-cloudwatchdestination)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchDestination
         */
        fun cloudWatchDestination(value: IntrinsicFunction) {
          this.cloudWatchDestination = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [kinesisFirehoseDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseDestination
         */
        var kinesisFirehoseDestination: Any? = null

        /**
         * [kinesisFirehoseDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseDestination
         */
        fun kinesisFirehoseDestination(value: KinesisFirehoseDestination) {
          this.kinesisFirehoseDestination = value
        }
        
        /**
         * [kinesisFirehoseDestination](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
         *
         * _Required_: no
         *
         * _Type_: KinesisFirehoseDestination
         */
        fun kinesisFirehoseDestination(value: IntrinsicFunction) {
          this.kinesisFirehoseDestination = value
        }

        /**
         * [matchingEventTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var matchingEventTypes: Any? = null

        /**
         * [matchingEventTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun matchingEventTypes(value: List<String>) {
          this.matchingEventTypes = value
        }
        
        /**
         * [matchingEventTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun matchingEventTypes(vararg value: IntrinsicFunction) {
          this.matchingEventTypes = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class KinesisFirehoseDestination {
            /**
         * [deliveryStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var deliveryStreamARN: Any? = null

        /**
         * [deliveryStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deliveryStreamARN(value: String) {
          this.deliveryStreamARN = value
        }
        
        /**
         * [deliveryStreamARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deliveryStreamARN(value: IntrinsicFunction) {
          this.deliveryStreamARN = value
        }

        /**
         * [iAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var iAMRoleARN: Any? = null

        /**
         * [iAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iAMRoleARN(value: String) {
          this.iAMRoleARN = value
        }
        
        /**
         * [iAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iAMRoleARN(value: IntrinsicFunction) {
          this.iAMRoleARN = value
        }

    }

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
