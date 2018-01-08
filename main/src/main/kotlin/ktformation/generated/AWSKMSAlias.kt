
package ktformation.generated

import ktformation.*

/**
 * [AWS::KMS::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html)
 */
@CloudFormationMarker
class AWSKMSAlias(logicalId: String) : Resource<AWSKMSAlias.Properties>(logicalId, "AWS::KMS::Alias") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var aliasName: Any? = null

        fun aliasName(value: String) {
          this.aliasName = value
        }
        fun aliasName(value: IntrinsicFunction) {
  this.aliasName = value
}
        @JvmField
        var targetKeyId: Any? = null

        fun targetKeyId(value: String) {
          this.targetKeyId = value
        }
        fun targetKeyId(value: IntrinsicFunction) {
  this.targetKeyId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsKMSAlias(logicalId: String, init: AWSKMSAlias.() -> Unit = {}): AWSKMSAlias {
    return AWSKMSAlias(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
