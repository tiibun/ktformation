
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPoolGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html)
 */
@CloudFormationMarker
class AWSCognitoUserPoolGroup(logicalId: String) : Resource<AWSCognitoUserPoolGroup.Properties>(logicalId, "AWS::Cognito::UserPoolGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var groupName: Any? = null
        fun groupName(value: String) {
            this.groupName = value
        }
        fun groupName(value: IntrinsicFunction) { this.groupName = value }
        @JvmField var precedence: Any? = null
        fun precedence(value: Double) {
            this.precedence = value
        }
        fun precedence(value: IntrinsicFunction) { this.precedence = value }
        @JvmField var roleArn: Any? = null
        fun roleArn(value: String) {
            this.roleArn = value
        }
        fun roleArn(value: IntrinsicFunction) { this.roleArn = value }
        @JvmField var userPoolId: Any? = null
        fun userPoolId(value: String) { this.userPoolId = value }
        fun userPoolId(value: IntrinsicFunction) { this.userPoolId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsCognitoUserPoolGroup(logicalId: String, init: AWSCognitoUserPoolGroup.() -> Unit = {}): AWSCognitoUserPoolGroup {
    return AWSCognitoUserPoolGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
