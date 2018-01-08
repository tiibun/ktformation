
package ktformation.generated

import ktformation.*

/**
 * [AWS::Kinesis::Stream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
 */
@CloudFormationMarker
class AWSKinesisStream(logicalId: String) : Resource<AWSKinesisStream.Properties>(logicalId, "AWS::Kinesis::Stream") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var retentionPeriodHours: Any? = null

        fun retentionPeriodHours(value: Int) {
          this.retentionPeriodHours = value
        }
        fun retentionPeriodHours(value: IntrinsicFunction) {
  this.retentionPeriodHours = value
}
        @JvmField
        var shardCount: Any? = null

        fun shardCount(value: Int) {
          this.shardCount = value
        }
        fun shardCount(value: IntrinsicFunction) {
  this.shardCount = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsKinesisStream(logicalId: String, init: AWSKinesisStream.() -> Unit = {}): AWSKinesisStream {
    return AWSKinesisStream(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
