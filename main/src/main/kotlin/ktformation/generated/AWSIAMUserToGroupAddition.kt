
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::UserToGroupAddition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html)
 */
@CloudFormationMarker
class AWSIAMUserToGroupAddition(logicalId: String) : Resource<AWSIAMUserToGroupAddition.Properties>(logicalId, "AWS::IAM::UserToGroupAddition") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var groupName: Any? = null

        fun groupName(value: String) {
          this.groupName = value
        }
        fun groupName(value: IntrinsicFunction) {
  this.groupName = value
}
        @JvmField
        var users: Any? = null

        fun users(value: List<String>) {
          this.users = value
        }
        fun users(vararg value: IntrinsicFunction) {
  this.users = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIAMUserToGroupAddition(logicalId: String, init: AWSIAMUserToGroupAddition.() -> Unit = {}): AWSIAMUserToGroupAddition {
    return AWSIAMUserToGroupAddition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
