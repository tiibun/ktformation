
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFront::StreamingDistribution - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
 */
@CloudFormationMarker
class AWSCloudFrontStreamingDistribution(logicalId: String) : Resource<AWSCloudFrontStreamingDistribution.Properties>(logicalId, "AWS::CloudFront::StreamingDistribution") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var streamingDistributionConfig: Any? = null

        fun streamingDistributionConfig(value: StreamingDistributionConfig) {
          this.streamingDistributionConfig = value
        }
        fun streamingDistributionConfig(value: IntrinsicFunction) {
  this.streamingDistributionConfig = value
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


    class Logging(
            val bucket: String,
            val enabled: Boolean,
            val prefix: String
    )

    class S3Origin(
            val domainName: String,
            val originAccessIdentity: String
    )

    class StreamingDistributionConfig(
            val aliases: List<String>? = null,
            val comment: String,
            val enabled: Boolean,
            val logging: Logging? = null,
            val priceClass: String? = null,
            val s3Origin: S3Origin,
            val trustedSigners: TrustedSigners
    )

    class TrustedSigners(
            val awsAccountNumbers: List<String>? = null,
            val enabled: Boolean
    )

}

fun Resources.awsCloudFrontStreamingDistribution(logicalId: String, init: AWSCloudFrontStreamingDistribution.() -> Unit = {}): AWSCloudFrontStreamingDistribution {
    return AWSCloudFrontStreamingDistribution(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
