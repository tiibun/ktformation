
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::Role - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
 */
@CloudFormationMarker
class AWSIAMRole(logicalId: String) : Resource<AWSIAMRole.Properties>(logicalId, "AWS::IAM::Role") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var assumeRolePolicyDocument: Any? = null
        fun assumeRolePolicyDocument(value: Json) { this.assumeRolePolicyDocument = value }
        fun assumeRolePolicyDocument(value: IntrinsicFunction) { this.assumeRolePolicyDocument = value }
        @JvmField var managedPolicyArns: Any? = null
        fun managedPolicyArns(value: List<String>) {
            this.managedPolicyArns = value
        }
        fun managedPolicyArns(vararg value: IntrinsicFunction) { this.managedPolicyArns = value }
        @JvmField var path: Any? = null
        fun path(value: String) {
            this.path = value
        }
        fun path(value: IntrinsicFunction) { this.path = value }
        @JvmField var policies: Any? = null
        fun policies(value: List<Policy>) {
            this.policies = value
        }
        fun policies(vararg value: IntrinsicFunction) { this.policies = value }
        @JvmField var roleName: Any? = null
        fun roleName(value: String) {
            this.roleName = value
        }
        fun roleName(value: IntrinsicFunction) { this.roleName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Policy(
            val policyDocument: Json,
            val policyName: String
    )

}

fun Resources.awsIAMRole(logicalId: String, init: AWSIAMRole.() -> Unit = {}): AWSIAMRole {
    return AWSIAMRole(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
