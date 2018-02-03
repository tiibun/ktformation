
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::Policy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
 */
@CloudFormationMarker
class AWSIAMPolicy(logicalId: String) : Resource<AWSIAMPolicy.Properties>(logicalId, "AWS::IAM::Policy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var groups: Any? = null

        fun groups(value: List<String>) {
          this.groups = value
        }
        
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }
        
        @JvmField
        var policyDocument: Any? = null

        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }
        
        @JvmField
        var policyName: Any? = null

        fun policyName(value: String) {
          this.policyName = value
        }
        
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }
        
        @JvmField
        var roles: Any? = null

        fun roles(value: List<String>) {
          this.roles = value
        }
        
        fun roles(vararg value: IntrinsicFunction) {
          this.roles = value
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

fun Resources.awsIAMPolicy(logicalId: String, init: AWSIAMPolicy.() -> Unit = {}): AWSIAMPolicy {
    return AWSIAMPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
