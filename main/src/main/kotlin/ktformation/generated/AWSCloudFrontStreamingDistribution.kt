
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFront::StreamingDistribution - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
 */
@CloudFormationMarker
class AWSCloudFrontStreamingDistribution(logicalId: String) : Resource<AWSCloudFrontStreamingDistribution.Properties>(logicalId, "AWS::CloudFront::StreamingDistribution") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [streamingDistributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
         *
         * _Required_: yes
         *
         * _Type_: StreamingDistributionConfig
         */
        @JvmField
        var streamingDistributionConfig: Any? = null

        /**
         * [streamingDistributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
         *
         * _Required_: yes
         *
         * _Type_: StreamingDistributionConfig
         */
        fun streamingDistributionConfig(value: StreamingDistributionConfig) {
          this.streamingDistributionConfig = value
        }
        
        /**
         * [streamingDistributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
         *
         * _Required_: yes
         *
         * _Type_: StreamingDistributionConfig
         */
        fun streamingDistributionConfig(value: IntrinsicFunction) {
          this.streamingDistributionConfig = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
         *
         * _Required_: yes
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
         *
         * _Required_: yes
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
         *
         * _Required_: yes
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


    class Logging(
            /**
             * [Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val prefix: String
    )

    class S3Origin(
            /**
             * [DomainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val domainName: String,
            /**
             * [OriginAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val originAccessIdentity: String
    )

    class StreamingDistributionConfig(
            /**
             * [Aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val aliases: List<String>? = null,
            /**
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val comment: String,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [Logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-logging)
             *
             * _Required_: no
             *
             * _Type_: Logging
             */
            val logging: Logging? = null,
            /**
             * [PriceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val priceClass: String? = null,
            /**
             * [S3Origin](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-s3origin)
             *
             * _Required_: yes
             *
             * _Type_: S3Origin
             */
            val s3Origin: S3Origin,
            /**
             * [TrustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-trustedsigners)
             *
             * _Required_: yes
             *
             * _Type_: TrustedSigners
             */
            val trustedSigners: TrustedSigners
    )

    class TrustedSigners(
            /**
             * [AwsAccountNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val awsAccountNumbers: List<String>? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean
    )

}

/**
 * [AWS::CloudFront::StreamingDistribution - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
 */
fun Resources.awsCloudFrontStreamingDistribution(logicalId: String, init: AWSCloudFrontStreamingDistribution.() -> Unit = {}): AWSCloudFrontStreamingDistribution {
    return AWSCloudFrontStreamingDistribution(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
