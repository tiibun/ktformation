
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPoolUserToGroupAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
 */
@CloudFormationMarker
class AWSCognitoUserPoolUserToGroupAttachment(logicalId: String) : Resource<AWSCognitoUserPoolUserToGroupAttachment.Properties>(logicalId, "AWS::Cognito::UserPoolUserToGroupAttachment") {

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
        var userPoolId: Any? = null

        fun userPoolId(value: String) {
          this.userPoolId = value
        }
        
        fun userPoolId(value: IntrinsicFunction) {
          this.userPoolId = value
        }
        
        @JvmField
        var username: Any? = null

        fun username(value: String) {
          this.username = value
        }
        
        fun username(value: IntrinsicFunction) {
          this.username = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsCognitoUserPoolUserToGroupAttachment(logicalId: String, init: AWSCognitoUserPoolUserToGroupAttachment.() -> Unit = {}): AWSCognitoUserPoolUserToGroupAttachment {
    return AWSCognitoUserPoolUserToGroupAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
