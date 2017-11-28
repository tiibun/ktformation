
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPoolUser - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html)
 */
@CloudFormationMarker
class AWSCognitoUserPoolUser(logicalId: String) : Resource<AWSCognitoUserPoolUser.Properties>(logicalId, "AWS::Cognito::UserPoolUser") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var desiredDeliveryMediums: Any? = null
        fun desiredDeliveryMediums(value: List<String>?) { this.desiredDeliveryMediums = value }
        fun desiredDeliveryMediums(vararg value: IntrinsicFunction) { this.desiredDeliveryMediums = value }
        @JvmField var forceAliasCreation: Any? = null
        fun forceAliasCreation(value: Boolean?) { this.forceAliasCreation = value }
        fun forceAliasCreation(value: IntrinsicFunction) { this.forceAliasCreation = value }
        @JvmField var messageAction: Any? = null
        fun messageAction(value: String?) { this.messageAction = value }
        fun messageAction(value: IntrinsicFunction) { this.messageAction = value }
        @JvmField var userAttributes: Any? = null
        fun userAttributes(value: List<AttributeType>?) { this.userAttributes = value }
        fun userAttributes(vararg value: IntrinsicFunction) { this.userAttributes = value }
        @JvmField var userPoolId: Any? = null
        fun userPoolId(value: String) { this.userPoolId = value }
        fun userPoolId(value: IntrinsicFunction) { this.userPoolId = value }
        @JvmField var username: Any? = null
        fun username(value: String?) { this.username = value }
        fun username(value: IntrinsicFunction) { this.username = value }
        @JvmField var validationData: Any? = null
        fun validationData(value: List<AttributeType>?) { this.validationData = value }
        fun validationData(vararg value: IntrinsicFunction) { this.validationData = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AttributeType(
            val name: String? = null,
            val value: String? = null
    )

}

fun Resources.awsCognitoUserPoolUser(logicalId: String, init: AWSCognitoUserPoolUser.() -> Unit = {}): AWSCognitoUserPoolUser {
    return AWSCognitoUserPoolUser(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
