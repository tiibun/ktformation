
package ktformation.generated

import ktformation.*

/**
 * [AWS::Kinesis::Stream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
 */
@CloudFormationMarker
class AWSKinesisStream(logicalId: String) : Resource<AWSKinesisStream.Properties>(logicalId, "AWS::Kinesis::Stream") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [retentionPeriodHours](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var retentionPeriodHours: Any? = null

        /**
         * [retentionPeriodHours](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retentionPeriodHours(value: Int) {
          this.retentionPeriodHours = value
        }
        
        /**
         * [retentionPeriodHours](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retentionPeriodHours(value: IntrinsicFunction) {
          this.retentionPeriodHours = value
        }
        
        /**
         * [shardCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var shardCount: Any? = null

        /**
         * [shardCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun shardCount(value: Int) {
          this.shardCount = value
        }
        
        /**
         * [shardCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun shardCount(value: IntrinsicFunction) {
          this.shardCount = value
        }
        
        /**
         * [streamEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
         *
         * _Required_: no
         *
         * _Type_: StreamEncryption
         */
        @JvmField
        var streamEncryption: Any? = null

        /**
         * [streamEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
         *
         * _Required_: no
         *
         * _Type_: StreamEncryption
         */
        fun streamEncryption(value: StreamEncryption) {
          this.streamEncryption = value
        }
        
        /**
         * [streamEncryption](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
         *
         * _Required_: no
         *
         * _Type_: StreamEncryption
         */
        fun streamEncryption(value: IntrinsicFunction) {
          this.streamEncryption = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
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


    class StreamEncryption(
            /**
             * [EncryptionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val encryptionType: String,
            /**
             * [KeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val keyId: String
    )

}

/**
 * [AWS::Kinesis::Stream - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
 */
fun Resources.awsKinesisStream(logicalId: String, init: AWSKinesisStream.() -> Unit = {}): AWSKinesisStream {
    return AWSKinesisStream(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
