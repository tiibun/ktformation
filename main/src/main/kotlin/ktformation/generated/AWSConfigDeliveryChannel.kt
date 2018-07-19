
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::DeliveryChannel - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
 */
@CloudFormationMarker
class AWSConfigDeliveryChannel(logicalId: String) : Resource<AWSConfigDeliveryChannel.Properties>(logicalId, "AWS::Config::DeliveryChannel") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [configSnapshotDeliveryProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
         *
         * _Required_: no
         *
         * _Type_: ConfigSnapshotDeliveryProperties
         */
        @JvmField
        var configSnapshotDeliveryProperties: Any? = null

        /**
         * [configSnapshotDeliveryProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
         *
         * _Required_: no
         *
         * _Type_: ConfigSnapshotDeliveryProperties
         */
        fun configSnapshotDeliveryProperties(value: ConfigSnapshotDeliveryProperties) {
          this.configSnapshotDeliveryProperties = value
        }
        
        /**
         * [configSnapshotDeliveryProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
         *
         * _Required_: no
         *
         * _Type_: ConfigSnapshotDeliveryProperties
         */
        fun configSnapshotDeliveryProperties(value: IntrinsicFunction) {
          this.configSnapshotDeliveryProperties = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var s3BucketName: Any? = null

        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BucketName(value: String) {
          this.s3BucketName = value
        }
        
        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BucketName(value: IntrinsicFunction) {
          this.s3BucketName = value
        }

        /**
         * [s3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var s3KeyPrefix: Any? = null

        /**
         * [s3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3KeyPrefix(value: String) {
          this.s3KeyPrefix = value
        }
        
        /**
         * [s3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3KeyPrefix(value: IntrinsicFunction) {
          this.s3KeyPrefix = value
        }

        /**
         * [snsTopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var snsTopicARN: Any? = null

        /**
         * [snsTopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snsTopicARN(value: String) {
          this.snsTopicARN = value
        }
        
        /**
         * [snsTopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snsTopicARN(value: IntrinsicFunction) {
          this.snsTopicARN = value
        }

        /**
        * [ConfigSnapshotDeliveryProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html)
        */
        fun configSnapshotDeliveryProperties(init: ConfigSnapshotDeliveryProperties.() -> Unit = {}): ConfigSnapshotDeliveryProperties {
            return ConfigSnapshotDeliveryProperties().also {
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
    class ConfigSnapshotDeliveryProperties {
            /**
         * [deliveryFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deliveryFrequency: Any? = null

        /**
         * [deliveryFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deliveryFrequency(value: String) {
          this.deliveryFrequency = value
        }
        
        /**
         * [deliveryFrequency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deliveryFrequency(value: IntrinsicFunction) {
          this.deliveryFrequency = value
        }

    }

}

/**
 * [AWS::Config::DeliveryChannel - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
 */
fun Resources.awsConfigDeliveryChannel(logicalId: String, init: AWSConfigDeliveryChannel.() -> Unit = {}): AWSConfigDeliveryChannel {
    return AWSConfigDeliveryChannel(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
