
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFront::Distribution - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 */
@CloudFormationMarker
class AWSCloudFrontDistribution(logicalId: String) : Resource<AWSCloudFrontDistribution.Properties>(logicalId, "AWS::CloudFront::Distribution") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [distributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
         *
         * _Required_: yes
         *
         * _Type_: DistributionConfig
         */
        @JvmField
        var distributionConfig: Any? = null

        /**
         * [distributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
         *
         * _Required_: yes
         *
         * _Type_: DistributionConfig
         */
        fun distributionConfig(value: DistributionConfig) {
          this.distributionConfig = value
        }
        
        /**
         * [distributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
         *
         * _Required_: yes
         *
         * _Type_: DistributionConfig
         */
        fun distributionConfig(value: IntrinsicFunction) {
          this.distributionConfig = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
        * [CacheBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html)
        */
        fun cacheBehavior(init: CacheBehavior.() -> Unit = {}): CacheBehavior {
            return CacheBehavior().also {
                it.init()
            }
        }
        /**
        * [Cookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html)
        */
        fun cookies(init: Cookies.() -> Unit = {}): Cookies {
            return Cookies().also {
                it.init()
            }
        }
        /**
        * [CustomErrorResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html)
        */
        fun customErrorResponse(init: CustomErrorResponse.() -> Unit = {}): CustomErrorResponse {
            return CustomErrorResponse().also {
                it.init()
            }
        }
        /**
        * [CustomOriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html)
        */
        fun customOriginConfig(init: CustomOriginConfig.() -> Unit = {}): CustomOriginConfig {
            return CustomOriginConfig().also {
                it.init()
            }
        }
        /**
        * [DefaultCacheBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html)
        */
        fun defaultCacheBehavior(init: DefaultCacheBehavior.() -> Unit = {}): DefaultCacheBehavior {
            return DefaultCacheBehavior().also {
                it.init()
            }
        }
        /**
        * [DistributionConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html)
        */
        fun distributionConfig(init: DistributionConfig.() -> Unit = {}): DistributionConfig {
            return DistributionConfig().also {
                it.init()
            }
        }
        /**
        * [ForwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html)
        */
        fun forwardedValues(init: ForwardedValues.() -> Unit = {}): ForwardedValues {
            return ForwardedValues().also {
                it.init()
            }
        }
        /**
        * [GeoRestriction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html)
        */
        fun geoRestriction(init: GeoRestriction.() -> Unit = {}): GeoRestriction {
            return GeoRestriction().also {
                it.init()
            }
        }
        /**
        * [LambdaFunctionAssociation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html)
        */
        fun lambdaFunctionAssociation(init: LambdaFunctionAssociation.() -> Unit = {}): LambdaFunctionAssociation {
            return LambdaFunctionAssociation().also {
                it.init()
            }
        }
        /**
        * [Logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html)
        */
        fun logging(init: Logging.() -> Unit = {}): Logging {
            return Logging().also {
                it.init()
            }
        }
        /**
        * [Origin](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html)
        */
        fun origin(init: Origin.() -> Unit = {}): Origin {
            return Origin().also {
                it.init()
            }
        }
        /**
        * [OriginCustomHeader](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html)
        */
        fun originCustomHeader(init: OriginCustomHeader.() -> Unit = {}): OriginCustomHeader {
            return OriginCustomHeader().also {
                it.init()
            }
        }
        /**
        * [Restrictions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html)
        */
        fun restrictions(init: Restrictions.() -> Unit = {}): Restrictions {
            return Restrictions().also {
                it.init()
            }
        }
        /**
        * [S3OriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html)
        */
        fun s3OriginConfig(init: S3OriginConfig.() -> Unit = {}): S3OriginConfig {
            return S3OriginConfig().also {
                it.init()
            }
        }
        /**
        * [ViewerCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html)
        */
        fun viewerCertificate(init: ViewerCertificate.() -> Unit = {}): ViewerCertificate {
            return ViewerCertificate().also {
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
    class CacheBehavior {
            /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var allowedMethods: Any? = null

        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedMethods(value: List<String>) {
          this.allowedMethods = value
        }
        
        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedMethods(vararg value: IntrinsicFunction) {
          this.allowedMethods = value
        }

        /**
         * [cachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var cachedMethods: Any? = null

        /**
         * [cachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cachedMethods(value: List<String>) {
          this.cachedMethods = value
        }
        
        /**
         * [cachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cachedMethods(vararg value: IntrinsicFunction) {
          this.cachedMethods = value
        }

        /**
         * [compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var compress: Any? = null

        /**
         * [compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compress(value: Boolean) {
          this.compress = value
        }
        
        /**
         * [compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compress(value: IntrinsicFunction) {
          this.compress = value
        }

        /**
         * [defaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var defaultTTL: Any? = null

        /**
         * [defaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun defaultTTL(value: Double) {
          this.defaultTTL = value
        }
        
        /**
         * [defaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun defaultTTL(value: IntrinsicFunction) {
          this.defaultTTL = value
        }

        /**
         * [fieldLevelEncryptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var fieldLevelEncryptionId: Any? = null

        /**
         * [fieldLevelEncryptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fieldLevelEncryptionId(value: String) {
          this.fieldLevelEncryptionId = value
        }
        
        /**
         * [fieldLevelEncryptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fieldLevelEncryptionId(value: IntrinsicFunction) {
          this.fieldLevelEncryptionId = value
        }

        /**
         * [forwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-forwardedvalues)
         *
         * _Required_: yes
         *
         * _Type_: ForwardedValues
         */
        var forwardedValues: Any? = null

        /**
         * [forwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-forwardedvalues)
         *
         * _Required_: yes
         *
         * _Type_: ForwardedValues
         */
        fun forwardedValues(value: ForwardedValues) {
          this.forwardedValues = value
        }
        
        /**
         * [forwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-forwardedvalues)
         *
         * _Required_: yes
         *
         * _Type_: ForwardedValues
         */
        fun forwardedValues(value: IntrinsicFunction) {
          this.forwardedValues = value
        }

        /**
         * [lambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaFunctionAssociation>
         */
        var lambdaFunctionAssociations: Any? = null

        /**
         * [lambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaFunctionAssociation>
         */
        fun lambdaFunctionAssociations(value: List<LambdaFunctionAssociation>) {
          this.lambdaFunctionAssociations = value
        }
        
        /**
         * [lambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaFunctionAssociation>
         */
        fun lambdaFunctionAssociations(vararg value: IntrinsicFunction) {
          this.lambdaFunctionAssociations = value
        }

        /**
         * [maxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var maxTTL: Any? = null

        /**
         * [maxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun maxTTL(value: Double) {
          this.maxTTL = value
        }
        
        /**
         * [maxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun maxTTL(value: IntrinsicFunction) {
          this.maxTTL = value
        }

        /**
         * [minTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var minTTL: Any? = null

        /**
         * [minTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun minTTL(value: Double) {
          this.minTTL = value
        }
        
        /**
         * [minTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun minTTL(value: IntrinsicFunction) {
          this.minTTL = value
        }

        /**
         * [pathPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var pathPattern: Any? = null

        /**
         * [pathPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun pathPattern(value: String) {
          this.pathPattern = value
        }
        
        /**
         * [pathPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun pathPattern(value: IntrinsicFunction) {
          this.pathPattern = value
        }

        /**
         * [smoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var smoothStreaming: Any? = null

        /**
         * [smoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun smoothStreaming(value: Boolean) {
          this.smoothStreaming = value
        }
        
        /**
         * [smoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun smoothStreaming(value: IntrinsicFunction) {
          this.smoothStreaming = value
        }

        /**
         * [targetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var targetOriginId: Any? = null

        /**
         * [targetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetOriginId(value: String) {
          this.targetOriginId = value
        }
        
        /**
         * [targetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetOriginId(value: IntrinsicFunction) {
          this.targetOriginId = value
        }

        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var trustedSigners: Any? = null

        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun trustedSigners(value: List<String>) {
          this.trustedSigners = value
        }
        
        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun trustedSigners(vararg value: IntrinsicFunction) {
          this.trustedSigners = value
        }

        /**
         * [viewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var viewerProtocolPolicy: Any? = null

        /**
         * [viewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun viewerProtocolPolicy(value: String) {
          this.viewerProtocolPolicy = value
        }
        
        /**
         * [viewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun viewerProtocolPolicy(value: IntrinsicFunction) {
          this.viewerProtocolPolicy = value
        }

    }

    @CloudFormationMarker
    class Cookies {
            /**
         * [forward](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var forward: Any? = null

        /**
         * [forward](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun forward(value: String) {
          this.forward = value
        }
        
        /**
         * [forward](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun forward(value: IntrinsicFunction) {
          this.forward = value
        }

        /**
         * [whitelistedNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var whitelistedNames: Any? = null

        /**
         * [whitelistedNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun whitelistedNames(value: List<String>) {
          this.whitelistedNames = value
        }
        
        /**
         * [whitelistedNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun whitelistedNames(vararg value: IntrinsicFunction) {
          this.whitelistedNames = value
        }

    }

    @CloudFormationMarker
    class CustomErrorResponse {
            /**
         * [errorCachingMinTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var errorCachingMinTTL: Any? = null

        /**
         * [errorCachingMinTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun errorCachingMinTTL(value: Double) {
          this.errorCachingMinTTL = value
        }
        
        /**
         * [errorCachingMinTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun errorCachingMinTTL(value: IntrinsicFunction) {
          this.errorCachingMinTTL = value
        }

        /**
         * [errorCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var errorCode: Any? = null

        /**
         * [errorCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun errorCode(value: Int) {
          this.errorCode = value
        }
        
        /**
         * [errorCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun errorCode(value: IntrinsicFunction) {
          this.errorCode = value
        }

        /**
         * [responseCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var responseCode: Any? = null

        /**
         * [responseCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun responseCode(value: Int) {
          this.responseCode = value
        }
        
        /**
         * [responseCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun responseCode(value: IntrinsicFunction) {
          this.responseCode = value
        }

        /**
         * [responsePagePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var responsePagePath: Any? = null

        /**
         * [responsePagePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun responsePagePath(value: String) {
          this.responsePagePath = value
        }
        
        /**
         * [responsePagePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun responsePagePath(value: IntrinsicFunction) {
          this.responsePagePath = value
        }

    }

    @CloudFormationMarker
    class CustomOriginConfig {
            /**
         * [hTTPPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var hTTPPort: Any? = null

        /**
         * [hTTPPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hTTPPort(value: Int) {
          this.hTTPPort = value
        }
        
        /**
         * [hTTPPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hTTPPort(value: IntrinsicFunction) {
          this.hTTPPort = value
        }

        /**
         * [hTTPSPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var hTTPSPort: Any? = null

        /**
         * [hTTPSPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hTTPSPort(value: Int) {
          this.hTTPSPort = value
        }
        
        /**
         * [hTTPSPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun hTTPSPort(value: IntrinsicFunction) {
          this.hTTPSPort = value
        }

        /**
         * [originKeepaliveTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var originKeepaliveTimeout: Any? = null

        /**
         * [originKeepaliveTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun originKeepaliveTimeout(value: Int) {
          this.originKeepaliveTimeout = value
        }
        
        /**
         * [originKeepaliveTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun originKeepaliveTimeout(value: IntrinsicFunction) {
          this.originKeepaliveTimeout = value
        }

        /**
         * [originProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var originProtocolPolicy: Any? = null

        /**
         * [originProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun originProtocolPolicy(value: String) {
          this.originProtocolPolicy = value
        }
        
        /**
         * [originProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun originProtocolPolicy(value: IntrinsicFunction) {
          this.originProtocolPolicy = value
        }

        /**
         * [originReadTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var originReadTimeout: Any? = null

        /**
         * [originReadTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun originReadTimeout(value: Int) {
          this.originReadTimeout = value
        }
        
        /**
         * [originReadTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun originReadTimeout(value: IntrinsicFunction) {
          this.originReadTimeout = value
        }

        /**
         * [originSSLProtocols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var originSSLProtocols: Any? = null

        /**
         * [originSSLProtocols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun originSSLProtocols(value: List<String>) {
          this.originSSLProtocols = value
        }
        
        /**
         * [originSSLProtocols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun originSSLProtocols(vararg value: IntrinsicFunction) {
          this.originSSLProtocols = value
        }

    }

    @CloudFormationMarker
    class DefaultCacheBehavior {
            /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var allowedMethods: Any? = null

        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedMethods(value: List<String>) {
          this.allowedMethods = value
        }
        
        /**
         * [allowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedMethods(vararg value: IntrinsicFunction) {
          this.allowedMethods = value
        }

        /**
         * [cachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var cachedMethods: Any? = null

        /**
         * [cachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cachedMethods(value: List<String>) {
          this.cachedMethods = value
        }
        
        /**
         * [cachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cachedMethods(vararg value: IntrinsicFunction) {
          this.cachedMethods = value
        }

        /**
         * [compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var compress: Any? = null

        /**
         * [compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compress(value: Boolean) {
          this.compress = value
        }
        
        /**
         * [compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compress(value: IntrinsicFunction) {
          this.compress = value
        }

        /**
         * [defaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var defaultTTL: Any? = null

        /**
         * [defaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun defaultTTL(value: Double) {
          this.defaultTTL = value
        }
        
        /**
         * [defaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun defaultTTL(value: IntrinsicFunction) {
          this.defaultTTL = value
        }

        /**
         * [fieldLevelEncryptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var fieldLevelEncryptionId: Any? = null

        /**
         * [fieldLevelEncryptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fieldLevelEncryptionId(value: String) {
          this.fieldLevelEncryptionId = value
        }
        
        /**
         * [fieldLevelEncryptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fieldLevelEncryptionId(value: IntrinsicFunction) {
          this.fieldLevelEncryptionId = value
        }

        /**
         * [forwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-forwardedvalues)
         *
         * _Required_: yes
         *
         * _Type_: ForwardedValues
         */
        var forwardedValues: Any? = null

        /**
         * [forwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-forwardedvalues)
         *
         * _Required_: yes
         *
         * _Type_: ForwardedValues
         */
        fun forwardedValues(value: ForwardedValues) {
          this.forwardedValues = value
        }
        
        /**
         * [forwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-forwardedvalues)
         *
         * _Required_: yes
         *
         * _Type_: ForwardedValues
         */
        fun forwardedValues(value: IntrinsicFunction) {
          this.forwardedValues = value
        }

        /**
         * [lambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaFunctionAssociation>
         */
        var lambdaFunctionAssociations: Any? = null

        /**
         * [lambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaFunctionAssociation>
         */
        fun lambdaFunctionAssociations(value: List<LambdaFunctionAssociation>) {
          this.lambdaFunctionAssociations = value
        }
        
        /**
         * [lambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations)
         *
         * _Required_: no
         *
         * _Type_: List<LambdaFunctionAssociation>
         */
        fun lambdaFunctionAssociations(vararg value: IntrinsicFunction) {
          this.lambdaFunctionAssociations = value
        }

        /**
         * [maxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var maxTTL: Any? = null

        /**
         * [maxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun maxTTL(value: Double) {
          this.maxTTL = value
        }
        
        /**
         * [maxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun maxTTL(value: IntrinsicFunction) {
          this.maxTTL = value
        }

        /**
         * [minTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var minTTL: Any? = null

        /**
         * [minTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun minTTL(value: Double) {
          this.minTTL = value
        }
        
        /**
         * [minTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun minTTL(value: IntrinsicFunction) {
          this.minTTL = value
        }

        /**
         * [smoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var smoothStreaming: Any? = null

        /**
         * [smoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun smoothStreaming(value: Boolean) {
          this.smoothStreaming = value
        }
        
        /**
         * [smoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun smoothStreaming(value: IntrinsicFunction) {
          this.smoothStreaming = value
        }

        /**
         * [targetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var targetOriginId: Any? = null

        /**
         * [targetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetOriginId(value: String) {
          this.targetOriginId = value
        }
        
        /**
         * [targetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetOriginId(value: IntrinsicFunction) {
          this.targetOriginId = value
        }

        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var trustedSigners: Any? = null

        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun trustedSigners(value: List<String>) {
          this.trustedSigners = value
        }
        
        /**
         * [trustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun trustedSigners(vararg value: IntrinsicFunction) {
          this.trustedSigners = value
        }

        /**
         * [viewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var viewerProtocolPolicy: Any? = null

        /**
         * [viewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun viewerProtocolPolicy(value: String) {
          this.viewerProtocolPolicy = value
        }
        
        /**
         * [viewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun viewerProtocolPolicy(value: IntrinsicFunction) {
          this.viewerProtocolPolicy = value
        }

    }

    @CloudFormationMarker
    class DistributionConfig {
            /**
         * [aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var aliases: Any? = null

        /**
         * [aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun aliases(value: List<String>) {
          this.aliases = value
        }
        
        /**
         * [aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun aliases(vararg value: IntrinsicFunction) {
          this.aliases = value
        }

        /**
         * [cacheBehaviors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors)
         *
         * _Required_: no
         *
         * _Type_: List<CacheBehavior>
         */
        var cacheBehaviors: Any? = null

        /**
         * [cacheBehaviors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors)
         *
         * _Required_: no
         *
         * _Type_: List<CacheBehavior>
         */
        fun cacheBehaviors(value: List<CacheBehavior>) {
          this.cacheBehaviors = value
        }
        
        /**
         * [cacheBehaviors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors)
         *
         * _Required_: no
         *
         * _Type_: List<CacheBehavior>
         */
        fun cacheBehaviors(vararg value: IntrinsicFunction) {
          this.cacheBehaviors = value
        }

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

        /**
         * [customErrorResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses)
         *
         * _Required_: no
         *
         * _Type_: List<CustomErrorResponse>
         */
        var customErrorResponses: Any? = null

        /**
         * [customErrorResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses)
         *
         * _Required_: no
         *
         * _Type_: List<CustomErrorResponse>
         */
        fun customErrorResponses(value: List<CustomErrorResponse>) {
          this.customErrorResponses = value
        }
        
        /**
         * [customErrorResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses)
         *
         * _Required_: no
         *
         * _Type_: List<CustomErrorResponse>
         */
        fun customErrorResponses(vararg value: IntrinsicFunction) {
          this.customErrorResponses = value
        }

        /**
         * [defaultCacheBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultcachebehavior)
         *
         * _Required_: no
         *
         * _Type_: DefaultCacheBehavior
         */
        var defaultCacheBehavior: Any? = null

        /**
         * [defaultCacheBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultcachebehavior)
         *
         * _Required_: no
         *
         * _Type_: DefaultCacheBehavior
         */
        fun defaultCacheBehavior(value: DefaultCacheBehavior) {
          this.defaultCacheBehavior = value
        }
        
        /**
         * [defaultCacheBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultcachebehavior)
         *
         * _Required_: no
         *
         * _Type_: DefaultCacheBehavior
         */
        fun defaultCacheBehavior(value: IntrinsicFunction) {
          this.defaultCacheBehavior = value
        }

        /**
         * [defaultRootObject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var defaultRootObject: Any? = null

        /**
         * [defaultRootObject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultRootObject(value: String) {
          this.defaultRootObject = value
        }
        
        /**
         * [defaultRootObject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultRootObject(value: IntrinsicFunction) {
          this.defaultRootObject = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [httpVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var httpVersion: Any? = null

        /**
         * [httpVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpVersion(value: String) {
          this.httpVersion = value
        }
        
        /**
         * [httpVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun httpVersion(value: IntrinsicFunction) {
          this.httpVersion = value
        }

        /**
         * [iPV6Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var iPV6Enabled: Any? = null

        /**
         * [iPV6Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun iPV6Enabled(value: Boolean) {
          this.iPV6Enabled = value
        }
        
        /**
         * [iPV6Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun iPV6Enabled(value: IntrinsicFunction) {
          this.iPV6Enabled = value
        }

        /**
         * [logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-logging)
         *
         * _Required_: no
         *
         * _Type_: Logging
         */
        var logging: Any? = null

        /**
         * [logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-logging)
         *
         * _Required_: no
         *
         * _Type_: Logging
         */
        fun logging(value: Logging) {
          this.logging = value
        }
        
        /**
         * [logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-logging)
         *
         * _Required_: no
         *
         * _Type_: Logging
         */
        fun logging(value: IntrinsicFunction) {
          this.logging = value
        }

        /**
         * [origins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins)
         *
         * _Required_: no
         *
         * _Type_: List<Origin>
         */
        var origins: Any? = null

        /**
         * [origins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins)
         *
         * _Required_: no
         *
         * _Type_: List<Origin>
         */
        fun origins(value: List<Origin>) {
          this.origins = value
        }
        
        /**
         * [origins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins)
         *
         * _Required_: no
         *
         * _Type_: List<Origin>
         */
        fun origins(vararg value: IntrinsicFunction) {
          this.origins = value
        }

        /**
         * [priceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var priceClass: Any? = null

        /**
         * [priceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun priceClass(value: String) {
          this.priceClass = value
        }
        
        /**
         * [priceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun priceClass(value: IntrinsicFunction) {
          this.priceClass = value
        }

        /**
         * [restrictions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
         *
         * _Required_: no
         *
         * _Type_: Restrictions
         */
        var restrictions: Any? = null

        /**
         * [restrictions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
         *
         * _Required_: no
         *
         * _Type_: Restrictions
         */
        fun restrictions(value: Restrictions) {
          this.restrictions = value
        }
        
        /**
         * [restrictions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
         *
         * _Required_: no
         *
         * _Type_: Restrictions
         */
        fun restrictions(value: IntrinsicFunction) {
          this.restrictions = value
        }

        /**
         * [viewerCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-viewercertificate)
         *
         * _Required_: no
         *
         * _Type_: ViewerCertificate
         */
        var viewerCertificate: Any? = null

        /**
         * [viewerCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-viewercertificate)
         *
         * _Required_: no
         *
         * _Type_: ViewerCertificate
         */
        fun viewerCertificate(value: ViewerCertificate) {
          this.viewerCertificate = value
        }
        
        /**
         * [viewerCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-viewercertificate)
         *
         * _Required_: no
         *
         * _Type_: ViewerCertificate
         */
        fun viewerCertificate(value: IntrinsicFunction) {
          this.viewerCertificate = value
        }

        /**
         * [webACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var webACLId: Any? = null

        /**
         * [webACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun webACLId(value: String) {
          this.webACLId = value
        }
        
        /**
         * [webACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun webACLId(value: IntrinsicFunction) {
          this.webACLId = value
        }

    }

    @CloudFormationMarker
    class ForwardedValues {
            /**
         * [cookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-cookies)
         *
         * _Required_: no
         *
         * _Type_: Cookies
         */
        var cookies: Any? = null

        /**
         * [cookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-cookies)
         *
         * _Required_: no
         *
         * _Type_: Cookies
         */
        fun cookies(value: Cookies) {
          this.cookies = value
        }
        
        /**
         * [cookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-cookies)
         *
         * _Required_: no
         *
         * _Type_: Cookies
         */
        fun cookies(value: IntrinsicFunction) {
          this.cookies = value
        }

        /**
         * [headers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var headers: Any? = null

        /**
         * [headers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun headers(value: List<String>) {
          this.headers = value
        }
        
        /**
         * [headers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun headers(vararg value: IntrinsicFunction) {
          this.headers = value
        }

        /**
         * [queryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var queryString: Any? = null

        /**
         * [queryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun queryString(value: Boolean) {
          this.queryString = value
        }
        
        /**
         * [queryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun queryString(value: IntrinsicFunction) {
          this.queryString = value
        }

        /**
         * [queryStringCacheKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var queryStringCacheKeys: Any? = null

        /**
         * [queryStringCacheKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun queryStringCacheKeys(value: List<String>) {
          this.queryStringCacheKeys = value
        }
        
        /**
         * [queryStringCacheKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun queryStringCacheKeys(vararg value: IntrinsicFunction) {
          this.queryStringCacheKeys = value
        }

    }

    @CloudFormationMarker
    class GeoRestriction {
            /**
         * [locations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var locations: Any? = null

        /**
         * [locations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun locations(value: List<String>) {
          this.locations = value
        }
        
        /**
         * [locations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun locations(vararg value: IntrinsicFunction) {
          this.locations = value
        }

        /**
         * [restrictionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var restrictionType: Any? = null

        /**
         * [restrictionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restrictionType(value: String) {
          this.restrictionType = value
        }
        
        /**
         * [restrictionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restrictionType(value: IntrinsicFunction) {
          this.restrictionType = value
        }

    }

    @CloudFormationMarker
    class LambdaFunctionAssociation {
            /**
         * [eventType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var eventType: Any? = null

        /**
         * [eventType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eventType(value: String) {
          this.eventType = value
        }
        
        /**
         * [eventType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eventType(value: IntrinsicFunction) {
          this.eventType = value
        }

        /**
         * [lambdaFunctionARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var lambdaFunctionARN: Any? = null

        /**
         * [lambdaFunctionARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun lambdaFunctionARN(value: String) {
          this.lambdaFunctionARN = value
        }
        
        /**
         * [lambdaFunctionARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun lambdaFunctionARN(value: IntrinsicFunction) {
          this.lambdaFunctionARN = value
        }

    }

    @CloudFormationMarker
    class Logging {
            /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucket: Any? = null

        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: String) {
          this.bucket = value
        }
        
        /**
         * [bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucket(value: IntrinsicFunction) {
          this.bucket = value
        }

        /**
         * [includeCookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-includecookies)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeCookies: Any? = null

        /**
         * [includeCookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-includecookies)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeCookies(value: Boolean) {
          this.includeCookies = value
        }
        
        /**
         * [includeCookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-includecookies)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeCookies(value: IntrinsicFunction) {
          this.includeCookies = value
        }

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var prefix: Any? = null

        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: String) {
          this.prefix = value
        }
        
        /**
         * [prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-prefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun prefix(value: IntrinsicFunction) {
          this.prefix = value
        }

    }

    @CloudFormationMarker
    class Origin {
            /**
         * [customOriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-customoriginconfig)
         *
         * _Required_: no
         *
         * _Type_: CustomOriginConfig
         */
        var customOriginConfig: Any? = null

        /**
         * [customOriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-customoriginconfig)
         *
         * _Required_: no
         *
         * _Type_: CustomOriginConfig
         */
        fun customOriginConfig(value: CustomOriginConfig) {
          this.customOriginConfig = value
        }
        
        /**
         * [customOriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-customoriginconfig)
         *
         * _Required_: no
         *
         * _Type_: CustomOriginConfig
         */
        fun customOriginConfig(value: IntrinsicFunction) {
          this.customOriginConfig = value
        }

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [originCustomHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders)
         *
         * _Required_: no
         *
         * _Type_: List<OriginCustomHeader>
         */
        var originCustomHeaders: Any? = null

        /**
         * [originCustomHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders)
         *
         * _Required_: no
         *
         * _Type_: List<OriginCustomHeader>
         */
        fun originCustomHeaders(value: List<OriginCustomHeader>) {
          this.originCustomHeaders = value
        }
        
        /**
         * [originCustomHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders)
         *
         * _Required_: no
         *
         * _Type_: List<OriginCustomHeader>
         */
        fun originCustomHeaders(vararg value: IntrinsicFunction) {
          this.originCustomHeaders = value
        }

        /**
         * [originPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var originPath: Any? = null

        /**
         * [originPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun originPath(value: String) {
          this.originPath = value
        }
        
        /**
         * [originPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun originPath(value: IntrinsicFunction) {
          this.originPath = value
        }

        /**
         * [s3OriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-s3originconfig)
         *
         * _Required_: no
         *
         * _Type_: S3OriginConfig
         */
        var s3OriginConfig: Any? = null

        /**
         * [s3OriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-s3originconfig)
         *
         * _Required_: no
         *
         * _Type_: S3OriginConfig
         */
        fun s3OriginConfig(value: S3OriginConfig) {
          this.s3OriginConfig = value
        }
        
        /**
         * [s3OriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-s3originconfig)
         *
         * _Required_: no
         *
         * _Type_: S3OriginConfig
         */
        fun s3OriginConfig(value: IntrinsicFunction) {
          this.s3OriginConfig = value
        }

    }

    @CloudFormationMarker
    class OriginCustomHeader {
            /**
         * [headerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var headerName: Any? = null

        /**
         * [headerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerName(value: String) {
          this.headerName = value
        }
        
        /**
         * [headerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerName(value: IntrinsicFunction) {
          this.headerName = value
        }

        /**
         * [headerValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var headerValue: Any? = null

        /**
         * [headerValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerValue(value: String) {
          this.headerValue = value
        }
        
        /**
         * [headerValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerValue(value: IntrinsicFunction) {
          this.headerValue = value
        }

    }

    @CloudFormationMarker
    class Restrictions {
            /**
         * [geoRestriction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html#cfn-cloudfront-distribution-restrictions-georestriction)
         *
         * _Required_: yes
         *
         * _Type_: GeoRestriction
         */
        var geoRestriction: Any? = null

        /**
         * [geoRestriction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html#cfn-cloudfront-distribution-restrictions-georestriction)
         *
         * _Required_: yes
         *
         * _Type_: GeoRestriction
         */
        fun geoRestriction(value: GeoRestriction) {
          this.geoRestriction = value
        }
        
        /**
         * [geoRestriction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html#cfn-cloudfront-distribution-restrictions-georestriction)
         *
         * _Required_: yes
         *
         * _Type_: GeoRestriction
         */
        fun geoRestriction(value: IntrinsicFunction) {
          this.geoRestriction = value
        }

    }

    @CloudFormationMarker
    class S3OriginConfig {
            /**
         * [originAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var originAccessIdentity: Any? = null

        /**
         * [originAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun originAccessIdentity(value: String) {
          this.originAccessIdentity = value
        }
        
        /**
         * [originAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun originAccessIdentity(value: IntrinsicFunction) {
          this.originAccessIdentity = value
        }

    }

    @CloudFormationMarker
    class ViewerCertificate {
            /**
         * [acmCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var acmCertificateArn: Any? = null

        /**
         * [acmCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acmCertificateArn(value: String) {
          this.acmCertificateArn = value
        }
        
        /**
         * [acmCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acmCertificateArn(value: IntrinsicFunction) {
          this.acmCertificateArn = value
        }

        /**
         * [cloudFrontDefaultCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var cloudFrontDefaultCertificate: Any? = null

        /**
         * [cloudFrontDefaultCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cloudFrontDefaultCertificate(value: Boolean) {
          this.cloudFrontDefaultCertificate = value
        }
        
        /**
         * [cloudFrontDefaultCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cloudFrontDefaultCertificate(value: IntrinsicFunction) {
          this.cloudFrontDefaultCertificate = value
        }

        /**
         * [iamCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var iamCertificateId: Any? = null

        /**
         * [iamCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iamCertificateId(value: String) {
          this.iamCertificateId = value
        }
        
        /**
         * [iamCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iamCertificateId(value: IntrinsicFunction) {
          this.iamCertificateId = value
        }

        /**
         * [minimumProtocolVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var minimumProtocolVersion: Any? = null

        /**
         * [minimumProtocolVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun minimumProtocolVersion(value: String) {
          this.minimumProtocolVersion = value
        }
        
        /**
         * [minimumProtocolVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun minimumProtocolVersion(value: IntrinsicFunction) {
          this.minimumProtocolVersion = value
        }

        /**
         * [sslSupportMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sslSupportMethod: Any? = null

        /**
         * [sslSupportMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sslSupportMethod(value: String) {
          this.sslSupportMethod = value
        }
        
        /**
         * [sslSupportMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sslSupportMethod(value: IntrinsicFunction) {
          this.sslSupportMethod = value
        }

    }

}

/**
 * [AWS::CloudFront::Distribution - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 */
fun Resources.awsCloudFrontDistribution(logicalId: String, init: AWSCloudFrontDistribution.() -> Unit = {}): AWSCloudFrontDistribution {
    return AWSCloudFrontDistribution(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
