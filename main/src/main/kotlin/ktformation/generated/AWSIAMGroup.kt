
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::Group - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html)
 */
@CloudFormationMarker
class AWSIAMGroup(logicalId: String) : Resource<AWSIAMGroup.Properties>(logicalId, "AWS::IAM::Group") {

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
        var managedPolicyArns: Any? = null

        fun managedPolicyArns(value: List<String>) {
          this.managedPolicyArns = value
        }
        
        fun managedPolicyArns(vararg value: IntrinsicFunction) {
          this.managedPolicyArns = value
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
        var policies: Any? = null

        fun policies(value: List<Policy>) {
          this.policies = value
        }
        
        fun policies(vararg value: IntrinsicFunction) {
          this.policies = value
        }
        
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

fun Resources.awsIAMGroup(logicalId: String, init: AWSIAMGroup.() -> Unit = {}): AWSIAMGroup {
    return AWSIAMGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
