
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::InstanceProfile - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
 */
@CloudFormationMarker
class AWSIAMInstanceProfile(logicalId: String) : Resource<AWSIAMInstanceProfile.Properties>(logicalId, "AWS::IAM::InstanceProfile") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var instanceProfileName: Any? = null
        fun instanceProfileName(value: String?) { this.instanceProfileName = value }
        fun instanceProfileName(value: IntrinsicFunction) { this.instanceProfileName = value }
        @JvmField var path: Any? = null
        fun path(value: String?) { this.path = value }
        fun path(value: IntrinsicFunction) { this.path = value }
        @JvmField var roles: Any? = null
        fun roles(value: List<String>) { this.roles = value }
        fun roles(vararg value: IntrinsicFunction) { this.roles = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIAMInstanceProfile(logicalId: String, init: AWSIAMInstanceProfile.() -> Unit = {}): AWSIAMInstanceProfile {
    return AWSIAMInstanceProfile(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
