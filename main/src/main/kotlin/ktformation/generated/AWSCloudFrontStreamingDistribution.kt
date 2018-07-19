
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

        /**
        * [Logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html)
        */
        fun logging(init: Logging.() -> Unit = {}): Logging {
            return Logging().also {
                it.init()
            }
        }
        /**
        * [S3Origin](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html)
        */
        fun s3Origin(init: S3Origin.() -> Unit = {}): S3Origin {
            return S3Origin().also {
                it.init()
            }
        }
        /**
        * [StreamingDistributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html)
        */
        fun streamingDistributionConfig(init: StreamingDistributionConfig.() -> Unit = {}): StreamingDistributionConfig {
            return StreamingDistributionConfig().also {
                it.init()
            }
        }
        /**
        * [TrustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html)
        */
        fun trustedSigners(init: TrustedSigners.() -> Unit = {}): TrustedSigners {
            return TrustedSigners().also {
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
    class Logging {
            /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

    }

    @CloudFormationMarker
    class S3Origin {
            /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }

        /**
         * [originAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var originAccessIdentity: Any? = null

        /**
         * [originAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun originAccessIdentity(value: String) {
          this.originAccessIdentity = value
        }
        
        /**
         * [originAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun originAccessIdentity(value: IntrinsicFunction) {
          this.originAccessIdentity = value
        }

    }

    @CloudFormationMarker
    class StreamingDistributionConfig {
            /**
         * [aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var aliases: Any? = null

        /**
         * [aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun aliases(value: List<String>) {
          this.aliases = value
        }
        
        /**
         * [aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun aliases(vararg value: IntrinsicFunction) {
          this.aliases = value
        }

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-logging)
         *
         * _Required_: no
         *
         * _Type_: Logging
         */
        var logging: Any? = null

        /**
         * [logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-logging)
         *
         * _Required_: no
         *
         * _Type_: Logging
         */
        fun logging(value: Logging) {
          this.logging = value
        }
        
        /**
         * [logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-logging)
         *
         * _Required_: no
         *
         * _Type_: Logging
         */
        fun logging(value: IntrinsicFunction) {
          this.logging = value
        }

        /**
         * [priceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var priceClass: Any? = null

        /**
         * [priceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun priceClass(value: String) {
          this.priceClass = value
        }
        
        /**
         * [priceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun priceClass(value: IntrinsicFunction) {
          this.priceClass = value
        }

        /**
         * [s3Origin](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-s3origin)
         *
         * _Required_: yes
         *
         * _Type_: S3Origin
         */
        var s3Origin: Any? = null

        /**
         * [s3Origin](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-s3origin)
         *
         * _Required_: yes
         *
         * _Type_: S3Origin
         */
        fun s3Origin(value: S3Origin) {
          this.s3Origin = value
        }
        
        /**
         * [s3Origin](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-s3origin)
         *
         * _Required_: yes
         *
         * _Type_: S3Origin
         */
        fun s3Origin(value: IntrinsicFunction) {
          this.s3Origin = value
        }

        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-trustedsigners)
         *
         * _Required_: yes
         *
         * _Type_: TrustedSigners
         */
        var trustedSigners: Any? = null

        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-trustedsigners)
         *
         * _Required_: yes
         *
         * _Type_: TrustedSigners
         */
        fun trustedSigners(value: TrustedSigners) {
          this.trustedSigners = value
        }
        
        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-trustedsigners)
         *
         * _Required_: yes
         *
         * _Type_: TrustedSigners
         */
        fun trustedSigners(value: IntrinsicFunction) {
          this.trustedSigners = value
        }

    }

    @CloudFormationMarker
    class TrustedSigners {
            /**
         * [awsAccountNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var awsAccountNumbers: Any? = null

        /**
         * [awsAccountNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun awsAccountNumbers(value: List<String>) {
          this.awsAccountNumbers = value
        }
        
        /**
         * [awsAccountNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun awsAccountNumbers(vararg value: IntrinsicFunction) {
          this.awsAccountNumbers = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

    }

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
