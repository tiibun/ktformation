
package ktformation.generated

import ktformation.*

/**
 * [AWS::KMS::Key - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
 */
@CloudFormationMarker
class AWSKMSKey(logicalId: String) : Resource<AWSKMSKey.Properties>(logicalId, "AWS::KMS::Key") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
        @JvmField
        var enableKeyRotation: Any? = null

        fun enableKeyRotation(value: Boolean) {
          this.enableKeyRotation = value
        }
        fun enableKeyRotation(value: IntrinsicFunction) {
  this.enableKeyRotation = value
}
        @JvmField
        var enabled: Any? = null

        fun enabled(value: Boolean) {
          this.enabled = value
        }
        fun enabled(value: IntrinsicFunction) {
  this.enabled = value
}
        @JvmField
        var keyPolicy: Any? = null

        fun keyPolicy(value: Json) {
          this.keyPolicy = value
        }
        fun keyPolicy(value: IntrinsicFunction) {
  this.keyPolicy = value
}
        @JvmField
        var keyUsage: Any? = null

        fun keyUsage(value: String) {
          this.keyUsage = value
        }
        fun keyUsage(value: IntrinsicFunction) {
  this.keyUsage = value
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



}

fun Resources.awsKMSKey(logicalId: String, init: AWSKMSKey.() -> Unit = {}): AWSKMSKey {
    return AWSKMSKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
