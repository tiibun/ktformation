
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::User - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html)
 */
@CloudFormationMarker
class AWSIAMUser(logicalId: String) : Resource<AWSIAMUser.Properties>(logicalId, "AWS::IAM::User") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var groups: Any? = null
        fun groups(value: List<String>?) { this.groups = value }
        fun groups(vararg value: IntrinsicFunction) { this.groups = value }
        @JvmField var loginProfile: Any? = null
        fun loginProfile(value: LoginProfile?) { this.loginProfile = value }
        fun loginProfile(value: IntrinsicFunction) { this.loginProfile = value }
        @JvmField var managedPolicyArns: Any? = null
        fun managedPolicyArns(value: List<String>?) { this.managedPolicyArns = value }
        fun managedPolicyArns(vararg value: IntrinsicFunction) { this.managedPolicyArns = value }
        @JvmField var path: Any? = null
        fun path(value: String?) { this.path = value }
        fun path(value: IntrinsicFunction) { this.path = value }
        @JvmField var policies: Any? = null
        fun policies(value: List<Policy>?) { this.policies = value }
        fun policies(vararg value: IntrinsicFunction) { this.policies = value }
        @JvmField var userName: Any? = null
        fun userName(value: String?) { this.userName = value }
        fun userName(value: IntrinsicFunction) { this.userName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LoginProfile(
            val password: String,
            val passwordResetRequired: Boolean? = null
    )

    class Policy(
            val policyDocument: Json,
            val policyName: String
    )

}

fun Resources.awsIAMUser(logicalId: String, init: AWSIAMUser.() -> Unit = {}): AWSIAMUser {
    return AWSIAMUser(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
