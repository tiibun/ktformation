
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::UserProfile - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html)
 */
@CloudFormationMarker
class AWSOpsWorksUserProfile(logicalId: String) : Resource<AWSOpsWorksUserProfile.Properties>(logicalId, "AWS::OpsWorks::UserProfile") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var allowSelfManagement: Any? = null

        fun allowSelfManagement(value: Boolean) {
          this.allowSelfManagement = value
        }
        fun allowSelfManagement(value: IntrinsicFunction) {
  this.allowSelfManagement = value
}
        @JvmField
        var iamUserArn: Any? = null

        fun iamUserArn(value: String) {
          this.iamUserArn = value
        }
        fun iamUserArn(value: IntrinsicFunction) {
  this.iamUserArn = value
}
        @JvmField
        var sshPublicKey: Any? = null

        fun sshPublicKey(value: String) {
          this.sshPublicKey = value
        }
        fun sshPublicKey(value: IntrinsicFunction) {
  this.sshPublicKey = value
}
        @JvmField
        var sshUsername: Any? = null

        fun sshUsername(value: String) {
          this.sshUsername = value
        }
        fun sshUsername(value: IntrinsicFunction) {
  this.sshUsername = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsOpsWorksUserProfile(logicalId: String, init: AWSOpsWorksUserProfile.() -> Unit = {}): AWSOpsWorksUserProfile {
    return AWSOpsWorksUserProfile(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
