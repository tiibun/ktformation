
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::ManagedPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
 */
@CloudFormationMarker
class AWSIAMManagedPolicy(logicalId: String) : Resource<AWSIAMManagedPolicy.Properties>(logicalId, "AWS::IAM::ManagedPolicy") {

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
        var groups: Any? = null

        fun groups(value: List<String>) {
          this.groups = value
        }
        
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }
        
        @JvmField
        var managedPolicyName: Any? = null

        fun managedPolicyName(value: String) {
          this.managedPolicyName = value
        }
        
        fun managedPolicyName(value: IntrinsicFunction) {
          this.managedPolicyName = value
        }
        
        @JvmField
        var path: Any? = null

        fun path(value: String) {
          this.path = value
        }
        
        fun path(value: IntrinsicFunction) {
          this.path = value
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

fun Resources.awsIAMManagedPolicy(logicalId: String, init: AWSIAMManagedPolicy.() -> Unit = {}): AWSIAMManagedPolicy {
    return AWSIAMManagedPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
