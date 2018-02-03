
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFront::CloudFrontOriginAccessIdentity - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
@CloudFormationMarker
class AWSCloudFrontCloudFrontOriginAccessIdentity(logicalId: String) : Resource<AWSCloudFrontCloudFrontOriginAccessIdentity.Properties>(logicalId, "AWS::CloudFront::CloudFrontOriginAccessIdentity") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cloudFrontOriginAccessIdentityConfig: Any? = null

        fun cloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig) {
          this.cloudFrontOriginAccessIdentityConfig = value
        }
        
        fun cloudFrontOriginAccessIdentityConfig(value: IntrinsicFunction) {
          this.cloudFrontOriginAccessIdentityConfig = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CloudFrontOriginAccessIdentityConfig(
            val comment: String
    )

}

fun Resources.awsCloudFrontCloudFrontOriginAccessIdentity(logicalId: String, init: AWSCloudFrontCloudFrontOriginAccessIdentity.() -> Unit = {}): AWSCloudFrontCloudFrontOriginAccessIdentity {
    return AWSCloudFrontCloudFrontOriginAccessIdentity(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
