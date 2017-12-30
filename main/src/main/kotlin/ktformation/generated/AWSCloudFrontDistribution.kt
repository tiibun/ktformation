
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFront::Distribution - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 */
@CloudFormationMarker
class AWSCloudFrontDistribution(logicalId: String) : Resource<AWSCloudFrontDistribution.Properties>(logicalId, "AWS::CloudFront::Distribution") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var distributionConfig: Any? = null
        fun distributionConfig(value: DistributionConfig) { this.distributionConfig = value }
        fun distributionConfig(value: IntrinsicFunction) { this.distributionConfig = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CacheBehavior(
            val allowedMethods: List<String>? = null,
            val cachedMethods: List<String>? = null,
            val compress: Boolean? = null,
            val defaultTTL: Double? = null,
            val forwardedValues: ForwardedValues,
            val lambdaFunctionAssociations: List<LambdaFunctionAssociation>? = null,
            val maxTTL: Double? = null,
            val minTTL: Double? = null,
            val pathPattern: String,
            val smoothStreaming: Boolean? = null,
            val targetOriginId: String,
            val trustedSigners: List<String>? = null,
            val viewerProtocolPolicy: String
    )

    class Cookies(
            val forward: String,
            val whitelistedNames: List<String>? = null
    )

    class CustomErrorResponse(
            val errorCachingMinTTL: Double? = null,
            val errorCode: Int,
            val responseCode: Int? = null,
            val responsePagePath: String? = null
    )

    class CustomOriginConfig(
            val hTTPPort: Int? = null,
            val hTTPSPort: Int? = null,
            val originKeepaliveTimeout: Int? = null,
            val originProtocolPolicy: String,
            val originReadTimeout: Int? = null,
            val originSSLProtocols: List<String>? = null
    )

    class DefaultCacheBehavior(
            val allowedMethods: List<String>? = null,
            val cachedMethods: List<String>? = null,
            val compress: Boolean? = null,
            val defaultTTL: Double? = null,
            val forwardedValues: ForwardedValues,
            val lambdaFunctionAssociations: List<LambdaFunctionAssociation>? = null,
            val maxTTL: Double? = null,
            val minTTL: Double? = null,
            val smoothStreaming: Boolean? = null,
            val targetOriginId: String,
            val trustedSigners: List<String>? = null,
            val viewerProtocolPolicy: String
    )

    class DistributionConfig(
            val aliases: List<String>? = null,
            val cacheBehaviors: List<CacheBehavior>? = null,
            val comment: String? = null,
            val customErrorResponses: List<CustomErrorResponse>? = null,
            val defaultCacheBehavior: DefaultCacheBehavior? = null,
            val defaultRootObject: String? = null,
            val enabled: Boolean,
            val httpVersion: String? = null,
            val iPV6Enabled: Boolean? = null,
            val logging: Logging? = null,
            val origins: List<Origin>? = null,
            val priceClass: String? = null,
            val restrictions: Restrictions? = null,
            val viewerCertificate: ViewerCertificate? = null,
            val webACLId: String? = null
    )

    class ForwardedValues(
            val cookies: Cookies? = null,
            val headers: List<String>? = null,
            val queryString: Boolean,
            val queryStringCacheKeys: List<String>? = null
    )

    class GeoRestriction(
            val locations: List<String>? = null,
            val restrictionType: String
    )

    class LambdaFunctionAssociation(
            val eventType: String? = null,
            val lambdaFunctionARN: String? = null
    )

    class Logging(
            val bucket: String,
            val includeCookies: Boolean? = null,
            val prefix: String? = null
    )

    class Origin(
            val customOriginConfig: CustomOriginConfig? = null,
            val domainName: String,
            val id: String,
            val originCustomHeaders: List<OriginCustomHeader>? = null,
            val originPath: String? = null,
            val s3OriginConfig: S3OriginConfig? = null
    )

    class OriginCustomHeader(
            val headerName: String,
            val headerValue: String
    )

    class Restrictions(
            val geoRestriction: GeoRestriction
    )

    class S3OriginConfig(
            val originAccessIdentity: String? = null
    )

    class ViewerCertificate(
            val acmCertificateArn: String? = null,
            val cloudFrontDefaultCertificate: Boolean? = null,
            val iamCertificateId: String? = null,
            val minimumProtocolVersion: String? = null,
            val sslSupportMethod: String? = null
    )

}

fun Resources.awsCloudFrontDistribution(logicalId: String, init: AWSCloudFrontDistribution.() -> Unit = {}): AWSCloudFrontDistribution {
    return AWSCloudFrontDistribution(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
