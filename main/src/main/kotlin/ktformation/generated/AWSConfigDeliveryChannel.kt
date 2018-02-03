
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::DeliveryChannel - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
 */
@CloudFormationMarker
class AWSConfigDeliveryChannel(logicalId: String) : Resource<AWSConfigDeliveryChannel.Properties>(logicalId, "AWS::Config::DeliveryChannel") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var configSnapshotDeliveryProperties: Any? = null

        fun configSnapshotDeliveryProperties(value: ConfigSnapshotDeliveryProperties) {
          this.configSnapshotDeliveryProperties = value
        }
        
        fun configSnapshotDeliveryProperties(value: IntrinsicFunction) {
          this.configSnapshotDeliveryProperties = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var s3BucketName: Any? = null

        fun s3BucketName(value: String) {
          this.s3BucketName = value
        }
        
        fun s3BucketName(value: IntrinsicFunction) {
          this.s3BucketName = value
        }
        
        @JvmField
        var s3KeyPrefix: Any? = null

        fun s3KeyPrefix(value: String) {
          this.s3KeyPrefix = value
        }
        
        fun s3KeyPrefix(value: IntrinsicFunction) {
          this.s3KeyPrefix = value
        }
        
        @JvmField
        var snsTopicARN: Any? = null

        fun snsTopicARN(value: String) {
          this.snsTopicARN = value
        }
        
        fun snsTopicARN(value: IntrinsicFunction) {
          this.snsTopicARN = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConfigSnapshotDeliveryProperties(
            val deliveryFrequency: String? = null
    )

}

fun Resources.awsConfigDeliveryChannel(logicalId: String, init: AWSConfigDeliveryChannel.() -> Unit = {}): AWSConfigDeliveryChannel {
    return AWSConfigDeliveryChannel(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
