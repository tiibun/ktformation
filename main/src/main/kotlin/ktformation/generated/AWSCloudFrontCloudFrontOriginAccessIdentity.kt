
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFront::CloudFrontOriginAccessIdentity - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
@CloudFormationMarker
class AWSCloudFrontCloudFrontOriginAccessIdentity(logicalId: String) : Resource<AWSCloudFrontCloudFrontOriginAccessIdentity.Properties>(logicalId, "AWS::CloudFront::CloudFrontOriginAccessIdentity") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cloudFrontOriginAccessIdentityConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
         *
         * _Required_: yes
         *
         * _Type_: CloudFrontOriginAccessIdentityConfig
         */
        @JvmField
        var cloudFrontOriginAccessIdentityConfig: Any? = null

        /**
         * [cloudFrontOriginAccessIdentityConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
         *
         * _Required_: yes
         *
         * _Type_: CloudFrontOriginAccessIdentityConfig
         */
        fun cloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig) {
          this.cloudFrontOriginAccessIdentityConfig = value
        }
        
        /**
         * [cloudFrontOriginAccessIdentityConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
         *
         * _Required_: yes
         *
         * _Type_: CloudFrontOriginAccessIdentityConfig
         */
        fun cloudFrontOriginAccessIdentityConfig(value: IntrinsicFunction) {
          this.cloudFrontOriginAccessIdentityConfig = value
        }

        /**
        * [CloudFrontOriginAccessIdentityConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html)
        */
        fun cloudFrontOriginAccessIdentityConfig(init: CloudFrontOriginAccessIdentityConfig.() -> Unit = {}): CloudFrontOriginAccessIdentityConfig {
            return CloudFrontOriginAccessIdentityConfig().also {
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
    class CloudFrontOriginAccessIdentityConfig {
            /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

    }

}

/**
 * [AWS::CloudFront::CloudFrontOriginAccessIdentity - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
fun Resources.awsCloudFrontCloudFrontOriginAccessIdentity(logicalId: String, init: AWSCloudFrontCloudFrontOriginAccessIdentity.() -> Unit = {}): AWSCloudFrontCloudFrontOriginAccessIdentity {
    return AWSCloudFrontCloudFrontOriginAccessIdentity(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
