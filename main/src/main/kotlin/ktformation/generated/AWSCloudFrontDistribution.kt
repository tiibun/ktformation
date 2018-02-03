
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CacheBehavior(
            /**
             * [AllowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val allowedMethods: List<String>? = null,
            /**
             * [CachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val cachedMethods: List<String>? = null,
            /**
             * [Compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val compress: Boolean? = null,
            /**
             * [DefaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val defaultTTL: Double? = null,
            /**
             * [ForwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-forwardedvalues)
             *
             * _Required_: yes
             *
             * _Type_: ForwardedValues
             */
            val forwardedValues: ForwardedValues,
            /**
             * [LambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations)
             *
             * _Required_: no
             *
             * _Type_: List<LambdaFunctionAssociation>
             */
            val lambdaFunctionAssociations: List<LambdaFunctionAssociation>? = null,
            /**
             * [MaxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val maxTTL: Double? = null,
            /**
             * [MinTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val minTTL: Double? = null,
            /**
             * [PathPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val pathPattern: String,
            /**
             * [SmoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val smoothStreaming: Boolean? = null,
            /**
             * [TargetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val targetOriginId: String,
            /**
             * [TrustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val trustedSigners: List<String>? = null,
            /**
             * [ViewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val viewerProtocolPolicy: String
    )

    class Cookies(
            /**
             * [Forward](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val forward: String,
            /**
             * [WhitelistedNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val whitelistedNames: List<String>? = null
    )

    class CustomErrorResponse(
            /**
             * [ErrorCachingMinTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val errorCachingMinTTL: Double? = null,
            /**
             * [ErrorCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val errorCode: Int,
            /**
             * [ResponseCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val responseCode: Int? = null,
            /**
             * [ResponsePagePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val responsePagePath: String? = null
    )

    class CustomOriginConfig(
            /**
             * [HTTPPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val hTTPPort: Int? = null,
            /**
             * [HTTPSPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val hTTPSPort: Int? = null,
            /**
             * [OriginKeepaliveTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val originKeepaliveTimeout: Int? = null,
            /**
             * [OriginProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val originProtocolPolicy: String,
            /**
             * [OriginReadTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val originReadTimeout: Int? = null,
            /**
             * [OriginSSLProtocols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val originSSLProtocols: List<String>? = null
    )

    class DefaultCacheBehavior(
            /**
             * [AllowedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val allowedMethods: List<String>? = null,
            /**
             * [CachedMethods](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val cachedMethods: List<String>? = null,
            /**
             * [Compress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val compress: Boolean? = null,
            /**
             * [DefaultTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val defaultTTL: Double? = null,
            /**
             * [ForwardedValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-forwardedvalues)
             *
             * _Required_: yes
             *
             * _Type_: ForwardedValues
             */
            val forwardedValues: ForwardedValues,
            /**
             * [LambdaFunctionAssociations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations)
             *
             * _Required_: no
             *
             * _Type_: List<LambdaFunctionAssociation>
             */
            val lambdaFunctionAssociations: List<LambdaFunctionAssociation>? = null,
            /**
             * [MaxTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val maxTTL: Double? = null,
            /**
             * [MinTTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val minTTL: Double? = null,
            /**
             * [SmoothStreaming](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val smoothStreaming: Boolean? = null,
            /**
             * [TargetOriginId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val targetOriginId: String,
            /**
             * [TrustedSigners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val trustedSigners: List<String>? = null,
            /**
             * [ViewerProtocolPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val viewerProtocolPolicy: String
    )

    class DistributionConfig(
            /**
             * [Aliases](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val aliases: List<String>? = null,
            /**
             * [CacheBehaviors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors)
             *
             * _Required_: no
             *
             * _Type_: List<CacheBehavior>
             */
            val cacheBehaviors: List<CacheBehavior>? = null,
            /**
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val comment: String? = null,
            /**
             * [CustomErrorResponses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses)
             *
             * _Required_: no
             *
             * _Type_: List<CustomErrorResponse>
             */
            val customErrorResponses: List<CustomErrorResponse>? = null,
            /**
             * [DefaultCacheBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultcachebehavior)
             *
             * _Required_: no
             *
             * _Type_: DefaultCacheBehavior
             */
            val defaultCacheBehavior: DefaultCacheBehavior? = null,
            /**
             * [DefaultRootObject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val defaultRootObject: String? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [HttpVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val httpVersion: String? = null,
            /**
             * [IPV6Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val iPV6Enabled: Boolean? = null,
            /**
             * [Logging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-logging)
             *
             * _Required_: no
             *
             * _Type_: Logging
             */
            val logging: Logging? = null,
            /**
             * [Origins](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins)
             *
             * _Required_: no
             *
             * _Type_: List<Origin>
             */
            val origins: List<Origin>? = null,
            /**
             * [PriceClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val priceClass: String? = null,
            /**
             * [Restrictions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
             *
             * _Required_: no
             *
             * _Type_: Restrictions
             */
            val restrictions: Restrictions? = null,
            /**
             * [ViewerCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-viewercertificate)
             *
             * _Required_: no
             *
             * _Type_: ViewerCertificate
             */
            val viewerCertificate: ViewerCertificate? = null,
            /**
             * [WebACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val webACLId: String? = null
    )

    class ForwardedValues(
            /**
             * [Cookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-cookies)
             *
             * _Required_: no
             *
             * _Type_: Cookies
             */
            val cookies: Cookies? = null,
            /**
             * [Headers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val headers: List<String>? = null,
            /**
             * [QueryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val queryString: Boolean,
            /**
             * [QueryStringCacheKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val queryStringCacheKeys: List<String>? = null
    )

    class GeoRestriction(
            /**
             * [Locations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val locations: List<String>? = null,
            /**
             * [RestrictionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val restrictionType: String
    )

    class LambdaFunctionAssociation(
            /**
             * [EventType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val eventType: String? = null,
            /**
             * [LambdaFunctionARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val lambdaFunctionARN: String? = null
    )

    class Logging(
            /**
             * [Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-bucket)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [IncludeCookies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-includecookies)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeCookies: Boolean? = null,
            /**
             * [Prefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-prefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val prefix: String? = null
    )

    class Origin(
            /**
             * [CustomOriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-customoriginconfig)
             *
             * _Required_: no
             *
             * _Type_: CustomOriginConfig
             */
            val customOriginConfig: CustomOriginConfig? = null,
            /**
             * [DomainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val domainName: String,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [OriginCustomHeaders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders)
             *
             * _Required_: no
             *
             * _Type_: List<OriginCustomHeader>
             */
            val originCustomHeaders: List<OriginCustomHeader>? = null,
            /**
             * [OriginPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val originPath: String? = null,
            /**
             * [S3OriginConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-s3originconfig)
             *
             * _Required_: no
             *
             * _Type_: S3OriginConfig
             */
            val s3OriginConfig: S3OriginConfig? = null
    )

    class OriginCustomHeader(
            /**
             * [HeaderName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val headerName: String,
            /**
             * [HeaderValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val headerValue: String
    )

    class Restrictions(
            /**
             * [GeoRestriction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html#cfn-cloudfront-distribution-restrictions-georestriction)
             *
             * _Required_: yes
             *
             * _Type_: GeoRestriction
             */
            val geoRestriction: GeoRestriction
    )

    class S3OriginConfig(
            /**
             * [OriginAccessIdentity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val originAccessIdentity: String? = null
    )

    class ViewerCertificate(
            /**
             * [AcmCertificateArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val acmCertificateArn: String? = null,
            /**
             * [CloudFrontDefaultCertificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val cloudFrontDefaultCertificate: Boolean? = null,
            /**
             * [IamCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val iamCertificateId: String? = null,
            /**
             * [MinimumProtocolVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val minimumProtocolVersion: String? = null,
            /**
             * [SslSupportMethod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sslSupportMethod: String? = null
    )

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
