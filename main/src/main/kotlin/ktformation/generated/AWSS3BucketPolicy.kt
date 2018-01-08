
package ktformation.generated

import ktformation.*

/**
 * [AWS::S3::BucketPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html)
 */
@CloudFormationMarker
class AWSS3BucketPolicy(logicalId: String) : Resource<AWSS3BucketPolicy.Properties>(logicalId, "AWS::S3::BucketPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var bucket: Any? = null

        fun bucket(value: String) {
          this.bucket = value
        }
        fun bucket(value: IntrinsicFunction) {
  this.bucket = value
}
        @JvmField
        var policyDocument: Any? = null

        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        fun policyDocument(value: IntrinsicFunction) {
  this.policyDocument = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsS3BucketPolicy(logicalId: String, init: AWSS3BucketPolicy.() -> Unit = {}): AWSS3BucketPolicy {
    return AWSS3BucketPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
