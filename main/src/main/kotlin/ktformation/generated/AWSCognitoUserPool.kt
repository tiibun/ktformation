
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPool - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
 */
@CloudFormationMarker
class AWSCognitoUserPool(logicalId: String) : Resource<AWSCognitoUserPool.Properties>(logicalId, "AWS::Cognito::UserPool") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var adminCreateUserConfig: Any? = null

        fun adminCreateUserConfig(value: AdminCreateUserConfig) {
          this.adminCreateUserConfig = value
        }
        fun adminCreateUserConfig(value: IntrinsicFunction) {
  this.adminCreateUserConfig = value
}
        @JvmField
        var aliasAttributes: Any? = null

        fun aliasAttributes(value: List<String>) {
          this.aliasAttributes = value
        }
        fun aliasAttributes(vararg value: IntrinsicFunction) {
  this.aliasAttributes = value
}
        @JvmField
        var autoVerifiedAttributes: Any? = null

        fun autoVerifiedAttributes(value: List<String>) {
          this.autoVerifiedAttributes = value
        }
        fun autoVerifiedAttributes(vararg value: IntrinsicFunction) {
  this.autoVerifiedAttributes = value
}
        @JvmField
        var deviceConfiguration: Any? = null

        fun deviceConfiguration(value: DeviceConfiguration) {
          this.deviceConfiguration = value
        }
        fun deviceConfiguration(value: IntrinsicFunction) {
  this.deviceConfiguration = value
}
        @JvmField
        var emailConfiguration: Any? = null

        fun emailConfiguration(value: EmailConfiguration) {
          this.emailConfiguration = value
        }
        fun emailConfiguration(value: IntrinsicFunction) {
  this.emailConfiguration = value
}
        @JvmField
        var emailVerificationMessage: Any? = null

        fun emailVerificationMessage(value: String) {
          this.emailVerificationMessage = value
        }
        fun emailVerificationMessage(value: IntrinsicFunction) {
  this.emailVerificationMessage = value
}
        @JvmField
        var emailVerificationSubject: Any? = null

        fun emailVerificationSubject(value: String) {
          this.emailVerificationSubject = value
        }
        fun emailVerificationSubject(value: IntrinsicFunction) {
  this.emailVerificationSubject = value
}
        @JvmField
        var lambdaConfig: Any? = null

        fun lambdaConfig(value: LambdaConfig) {
          this.lambdaConfig = value
        }
        fun lambdaConfig(value: IntrinsicFunction) {
  this.lambdaConfig = value
}
        @JvmField
        var mfaConfiguration: Any? = null

        fun mfaConfiguration(value: String) {
          this.mfaConfiguration = value
        }
        fun mfaConfiguration(value: IntrinsicFunction) {
  this.mfaConfiguration = value
}
        @JvmField
        var policies: Any? = null

        fun policies(value: Policies) {
          this.policies = value
        }
        fun policies(value: IntrinsicFunction) {
  this.policies = value
}
        @JvmField
        var schema: Any? = null

        fun schema(value: List<SchemaAttribute>) {
          this.schema = value
        }
        fun schema(vararg value: IntrinsicFunction) {
  this.schema = value
}
        @JvmField
        var smsAuthenticationMessage: Any? = null

        fun smsAuthenticationMessage(value: String) {
          this.smsAuthenticationMessage = value
        }
        fun smsAuthenticationMessage(value: IntrinsicFunction) {
  this.smsAuthenticationMessage = value
}
        @JvmField
        var smsConfiguration: Any? = null

        fun smsConfiguration(value: SmsConfiguration) {
          this.smsConfiguration = value
        }
        fun smsConfiguration(value: IntrinsicFunction) {
  this.smsConfiguration = value
}
        @JvmField
        var smsVerificationMessage: Any? = null

        fun smsVerificationMessage(value: String) {
          this.smsVerificationMessage = value
        }
        fun smsVerificationMessage(value: IntrinsicFunction) {
  this.smsVerificationMessage = value
}
        @JvmField
        var userPoolName: Any? = null

        fun userPoolName(value: String) {
          this.userPoolName = value
        }
        fun userPoolName(value: IntrinsicFunction) {
  this.userPoolName = value
}
        @JvmField
        var userPoolTags: Any? = null

        fun userPoolTags(value: Json) {
          this.userPoolTags = value
        }
        fun userPoolTags(value: IntrinsicFunction) {
  this.userPoolTags = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AdminCreateUserConfig(
            val allowAdminCreateUserOnly: Boolean? = null,
            val inviteMessageTemplate: InviteMessageTemplate? = null,
            val unusedAccountValidityDays: Double? = null
    )

    class DeviceConfiguration(
            val challengeRequiredOnNewDevice: Boolean? = null,
            val deviceOnlyRememberedOnUserPrompt: Boolean? = null
    )

    class EmailConfiguration(
            val replyToEmailAddress: String? = null,
            val sourceArn: String? = null
    )

    class InviteMessageTemplate(
            val emailMessage: String? = null,
            val emailSubject: String? = null,
            val sMSMessage: String? = null
    )

    class LambdaConfig(
            val createAuthChallenge: String? = null,
            val customMessage: String? = null,
            val defineAuthChallenge: String? = null,
            val postAuthentication: String? = null,
            val postConfirmation: String? = null,
            val preAuthentication: String? = null,
            val preSignUp: String? = null,
            val verifyAuthChallengeResponse: String? = null
    )

    class NumberAttributeConstraints(
            val maxValue: String? = null,
            val minValue: String? = null
    )

    class PasswordPolicy(
            val minimumLength: Int? = null,
            val requireLowercase: Boolean? = null,
            val requireNumbers: Boolean? = null,
            val requireSymbols: Boolean? = null,
            val requireUppercase: Boolean? = null
    )

    class Policies(
            val passwordPolicy: PasswordPolicy? = null
    )

    class SchemaAttribute(
            val attributeDataType: String? = null,
            val developerOnlyAttribute: Boolean? = null,
            val mutable: Boolean? = null,
            val name: String? = null,
            val numberAttributeConstraints: NumberAttributeConstraints? = null,
            val required: Boolean? = null,
            val stringAttributeConstraints: StringAttributeConstraints? = null
    )

    class SmsConfiguration(
            val externalId: String? = null,
            val snsCallerArn: String? = null
    )

    class StringAttributeConstraints(
            val maxLength: String? = null,
            val minLength: String? = null
    )

}

fun Resources.awsCognitoUserPool(logicalId: String, init: AWSCognitoUserPool.() -> Unit = {}): AWSCognitoUserPool {
    return AWSCognitoUserPool(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
