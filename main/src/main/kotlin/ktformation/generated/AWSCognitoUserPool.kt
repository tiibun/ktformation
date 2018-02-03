
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPool - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
 */
@CloudFormationMarker
class AWSCognitoUserPool(logicalId: String) : Resource<AWSCognitoUserPool.Properties>(logicalId, "AWS::Cognito::UserPool") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [adminCreateUserConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * _Required_: no
         *
         * _Type_: AdminCreateUserConfig
         */
        @JvmField
        var adminCreateUserConfig: Any? = null

        /**
         * [adminCreateUserConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * _Required_: no
         *
         * _Type_: AdminCreateUserConfig
         */
        fun adminCreateUserConfig(value: AdminCreateUserConfig) {
          this.adminCreateUserConfig = value
        }
        
        /**
         * [adminCreateUserConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-admincreateuserconfig)
         *
         * _Required_: no
         *
         * _Type_: AdminCreateUserConfig
         */
        fun adminCreateUserConfig(value: IntrinsicFunction) {
          this.adminCreateUserConfig = value
        }
        
        /**
         * [aliasAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var aliasAttributes: Any? = null

        /**
         * [aliasAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun aliasAttributes(value: List<String>) {
          this.aliasAttributes = value
        }
        
        /**
         * [aliasAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun aliasAttributes(vararg value: IntrinsicFunction) {
          this.aliasAttributes = value
        }
        
        /**
         * [autoVerifiedAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var autoVerifiedAttributes: Any? = null

        /**
         * [autoVerifiedAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun autoVerifiedAttributes(value: List<String>) {
          this.autoVerifiedAttributes = value
        }
        
        /**
         * [autoVerifiedAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun autoVerifiedAttributes(vararg value: IntrinsicFunction) {
          this.autoVerifiedAttributes = value
        }
        
        /**
         * [deviceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DeviceConfiguration
         */
        @JvmField
        var deviceConfiguration: Any? = null

        /**
         * [deviceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DeviceConfiguration
         */
        fun deviceConfiguration(value: DeviceConfiguration) {
          this.deviceConfiguration = value
        }
        
        /**
         * [deviceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-deviceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DeviceConfiguration
         */
        fun deviceConfiguration(value: IntrinsicFunction) {
          this.deviceConfiguration = value
        }
        
        /**
         * [emailConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EmailConfiguration
         */
        @JvmField
        var emailConfiguration: Any? = null

        /**
         * [emailConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EmailConfiguration
         */
        fun emailConfiguration(value: EmailConfiguration) {
          this.emailConfiguration = value
        }
        
        /**
         * [emailConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailconfiguration)
         *
         * _Required_: no
         *
         * _Type_: EmailConfiguration
         */
        fun emailConfiguration(value: IntrinsicFunction) {
          this.emailConfiguration = value
        }
        
        /**
         * [emailVerificationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var emailVerificationMessage: Any? = null

        /**
         * [emailVerificationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailVerificationMessage(value: String) {
          this.emailVerificationMessage = value
        }
        
        /**
         * [emailVerificationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailVerificationMessage(value: IntrinsicFunction) {
          this.emailVerificationMessage = value
        }
        
        /**
         * [emailVerificationSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var emailVerificationSubject: Any? = null

        /**
         * [emailVerificationSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailVerificationSubject(value: String) {
          this.emailVerificationSubject = value
        }
        
        /**
         * [emailVerificationSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailVerificationSubject(value: IntrinsicFunction) {
          this.emailVerificationSubject = value
        }
        
        /**
         * [lambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: LambdaConfig
         */
        @JvmField
        var lambdaConfig: Any? = null

        /**
         * [lambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: LambdaConfig
         */
        fun lambdaConfig(value: LambdaConfig) {
          this.lambdaConfig = value
        }
        
        /**
         * [lambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-lambdaconfig)
         *
         * _Required_: no
         *
         * _Type_: LambdaConfig
         */
        fun lambdaConfig(value: IntrinsicFunction) {
          this.lambdaConfig = value
        }
        
        /**
         * [mfaConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var mfaConfiguration: Any? = null

        /**
         * [mfaConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mfaConfiguration(value: String) {
          this.mfaConfiguration = value
        }
        
        /**
         * [mfaConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mfaConfiguration(value: IntrinsicFunction) {
          this.mfaConfiguration = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * _Required_: no
         *
         * _Type_: Policies
         */
        @JvmField
        var policies: Any? = null

        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * _Required_: no
         *
         * _Type_: Policies
         */
        fun policies(value: Policies) {
          this.policies = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-policies)
         *
         * _Required_: no
         *
         * _Type_: Policies
         */
        fun policies(value: IntrinsicFunction) {
          this.policies = value
        }
        
        /**
         * [schema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * _Required_: no
         *
         * _Type_: List<SchemaAttribute>
         */
        @JvmField
        var schema: Any? = null

        /**
         * [schema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * _Required_: no
         *
         * _Type_: List<SchemaAttribute>
         */
        fun schema(value: List<SchemaAttribute>) {
          this.schema = value
        }
        
        /**
         * [schema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema)
         *
         * _Required_: no
         *
         * _Type_: List<SchemaAttribute>
         */
        fun schema(vararg value: IntrinsicFunction) {
          this.schema = value
        }
        
        /**
         * [smsAuthenticationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var smsAuthenticationMessage: Any? = null

        /**
         * [smsAuthenticationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun smsAuthenticationMessage(value: String) {
          this.smsAuthenticationMessage = value
        }
        
        /**
         * [smsAuthenticationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun smsAuthenticationMessage(value: IntrinsicFunction) {
          this.smsAuthenticationMessage = value
        }
        
        /**
         * [smsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SmsConfiguration
         */
        @JvmField
        var smsConfiguration: Any? = null

        /**
         * [smsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SmsConfiguration
         */
        fun smsConfiguration(value: SmsConfiguration) {
          this.smsConfiguration = value
        }
        
        /**
         * [smsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SmsConfiguration
         */
        fun smsConfiguration(value: IntrinsicFunction) {
          this.smsConfiguration = value
        }
        
        /**
         * [smsVerificationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var smsVerificationMessage: Any? = null

        /**
         * [smsVerificationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun smsVerificationMessage(value: String) {
          this.smsVerificationMessage = value
        }
        
        /**
         * [smsVerificationMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun smsVerificationMessage(value: IntrinsicFunction) {
          this.smsVerificationMessage = value
        }
        
        /**
         * [userPoolName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var userPoolName: Any? = null

        /**
         * [userPoolName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userPoolName(value: String) {
          this.userPoolName = value
        }
        
        /**
         * [userPoolName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userPoolName(value: IntrinsicFunction) {
          this.userPoolName = value
        }
        
        /**
         * [userPoolTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var userPoolTags: Any? = null

        /**
         * [userPoolTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun userPoolTags(value: Json) {
          this.userPoolTags = value
        }
        
        /**
         * [userPoolTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
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
            /**
             * [AllowAdminCreateUserOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val allowAdminCreateUserOnly: Boolean? = null,
            /**
             * [InviteMessageTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
             *
             * _Required_: no
             *
             * _Type_: InviteMessageTemplate
             */
            val inviteMessageTemplate: InviteMessageTemplate? = null,
            /**
             * [UnusedAccountValidityDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val unusedAccountValidityDays: Double? = null
    )

    class DeviceConfiguration(
            /**
             * [ChallengeRequiredOnNewDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val challengeRequiredOnNewDevice: Boolean? = null,
            /**
             * [DeviceOnlyRememberedOnUserPrompt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deviceOnlyRememberedOnUserPrompt: Boolean? = null
    )

    class EmailConfiguration(
            /**
             * [ReplyToEmailAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val replyToEmailAddress: String? = null,
            /**
             * [SourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sourceArn: String? = null
    )

    class InviteMessageTemplate(
            /**
             * [EmailMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val emailMessage: String? = null,
            /**
             * [EmailSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val emailSubject: String? = null,
            /**
             * [SMSMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sMSMessage: String? = null
    )

    class LambdaConfig(
            /**
             * [CreateAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val createAuthChallenge: String? = null,
            /**
             * [CustomMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val customMessage: String? = null,
            /**
             * [DefineAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val defineAuthChallenge: String? = null,
            /**
             * [PostAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val postAuthentication: String? = null,
            /**
             * [PostConfirmation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val postConfirmation: String? = null,
            /**
             * [PreAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val preAuthentication: String? = null,
            /**
             * [PreSignUp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val preSignUp: String? = null,
            /**
             * [VerifyAuthChallengeResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val verifyAuthChallengeResponse: String? = null
    )

    class NumberAttributeConstraints(
            /**
             * [MaxValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val maxValue: String? = null,
            /**
             * [MinValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val minValue: String? = null
    )

    class PasswordPolicy(
            /**
             * [MinimumLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val minimumLength: Int? = null,
            /**
             * [RequireLowercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val requireLowercase: Boolean? = null,
            /**
             * [RequireNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val requireNumbers: Boolean? = null,
            /**
             * [RequireSymbols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val requireSymbols: Boolean? = null,
            /**
             * [RequireUppercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val requireUppercase: Boolean? = null
    )

    class Policies(
            /**
             * [PasswordPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
             *
             * _Required_: no
             *
             * _Type_: PasswordPolicy
             */
            val passwordPolicy: PasswordPolicy? = null
    )

    class SchemaAttribute(
            /**
             * [AttributeDataType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val attributeDataType: String? = null,
            /**
             * [DeveloperOnlyAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val developerOnlyAttribute: Boolean? = null,
            /**
             * [Mutable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val mutable: Boolean? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [NumberAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
             *
             * _Required_: no
             *
             * _Type_: NumberAttributeConstraints
             */
            val numberAttributeConstraints: NumberAttributeConstraints? = null,
            /**
             * [Required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val required: Boolean? = null,
            /**
             * [StringAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
             *
             * _Required_: no
             *
             * _Type_: StringAttributeConstraints
             */
            val stringAttributeConstraints: StringAttributeConstraints? = null
    )

    class SmsConfiguration(
            /**
             * [ExternalId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val externalId: String? = null,
            /**
             * [SnsCallerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val snsCallerArn: String? = null
    )

    class StringAttributeConstraints(
            /**
             * [MaxLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val maxLength: String? = null,
            /**
             * [MinLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val minLength: String? = null
    )

}

/**
 * [AWS::Cognito::UserPool - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
 */
fun Resources.awsCognitoUserPool(logicalId: String, init: AWSCognitoUserPool.() -> Unit = {}): AWSCognitoUserPool {
    return AWSCognitoUserPool(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
