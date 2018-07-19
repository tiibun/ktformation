
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

        /**
         * [usernameAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var usernameAttributes: Any? = null

        /**
         * [usernameAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun usernameAttributes(value: List<String>) {
          this.usernameAttributes = value
        }
        
        /**
         * [usernameAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun usernameAttributes(vararg value: IntrinsicFunction) {
          this.usernameAttributes = value
        }

        /**
        * [AdminCreateUserConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html)
        */
        fun adminCreateUserConfig(init: AdminCreateUserConfig.() -> Unit = {}): AdminCreateUserConfig {
            return AdminCreateUserConfig().also {
                it.init()
            }
        }
        /**
        * [DeviceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html)
        */
        fun deviceConfiguration(init: DeviceConfiguration.() -> Unit = {}): DeviceConfiguration {
            return DeviceConfiguration().also {
                it.init()
            }
        }
        /**
        * [EmailConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html)
        */
        fun emailConfiguration(init: EmailConfiguration.() -> Unit = {}): EmailConfiguration {
            return EmailConfiguration().also {
                it.init()
            }
        }
        /**
        * [InviteMessageTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html)
        */
        fun inviteMessageTemplate(init: InviteMessageTemplate.() -> Unit = {}): InviteMessageTemplate {
            return InviteMessageTemplate().also {
                it.init()
            }
        }
        /**
        * [LambdaConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html)
        */
        fun lambdaConfig(init: LambdaConfig.() -> Unit = {}): LambdaConfig {
            return LambdaConfig().also {
                it.init()
            }
        }
        /**
        * [NumberAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html)
        */
        fun numberAttributeConstraints(init: NumberAttributeConstraints.() -> Unit = {}): NumberAttributeConstraints {
            return NumberAttributeConstraints().also {
                it.init()
            }
        }
        /**
        * [PasswordPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html)
        */
        fun passwordPolicy(init: PasswordPolicy.() -> Unit = {}): PasswordPolicy {
            return PasswordPolicy().also {
                it.init()
            }
        }
        /**
        * [Policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html)
        */
        fun policies(init: Policies.() -> Unit = {}): Policies {
            return Policies().also {
                it.init()
            }
        }
        /**
        * [SchemaAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html)
        */
        fun schemaAttribute(init: SchemaAttribute.() -> Unit = {}): SchemaAttribute {
            return SchemaAttribute().also {
                it.init()
            }
        }
        /**
        * [SmsConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html)
        */
        fun smsConfiguration(init: SmsConfiguration.() -> Unit = {}): SmsConfiguration {
            return SmsConfiguration().also {
                it.init()
            }
        }
        /**
        * [StringAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html)
        */
        fun stringAttributeConstraints(init: StringAttributeConstraints.() -> Unit = {}): StringAttributeConstraints {
            return StringAttributeConstraints().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class AdminCreateUserConfig {
            /**
         * [allowAdminCreateUserOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var allowAdminCreateUserOnly: Any? = null

        /**
         * [allowAdminCreateUserOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowAdminCreateUserOnly(value: Boolean) {
          this.allowAdminCreateUserOnly = value
        }
        
        /**
         * [allowAdminCreateUserOnly](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowAdminCreateUserOnly(value: IntrinsicFunction) {
          this.allowAdminCreateUserOnly = value
        }

        /**
         * [inviteMessageTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
         *
         * _Required_: no
         *
         * _Type_: InviteMessageTemplate
         */
        var inviteMessageTemplate: Any? = null

        /**
         * [inviteMessageTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
         *
         * _Required_: no
         *
         * _Type_: InviteMessageTemplate
         */
        fun inviteMessageTemplate(value: InviteMessageTemplate) {
          this.inviteMessageTemplate = value
        }
        
        /**
         * [inviteMessageTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-invitemessagetemplate)
         *
         * _Required_: no
         *
         * _Type_: InviteMessageTemplate
         */
        fun inviteMessageTemplate(value: IntrinsicFunction) {
          this.inviteMessageTemplate = value
        }

        /**
         * [unusedAccountValidityDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var unusedAccountValidityDays: Any? = null

        /**
         * [unusedAccountValidityDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun unusedAccountValidityDays(value: Double) {
          this.unusedAccountValidityDays = value
        }
        
        /**
         * [unusedAccountValidityDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun unusedAccountValidityDays(value: IntrinsicFunction) {
          this.unusedAccountValidityDays = value
        }

    }

    @CloudFormationMarker
    class DeviceConfiguration {
            /**
         * [challengeRequiredOnNewDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var challengeRequiredOnNewDevice: Any? = null

        /**
         * [challengeRequiredOnNewDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun challengeRequiredOnNewDevice(value: Boolean) {
          this.challengeRequiredOnNewDevice = value
        }
        
        /**
         * [challengeRequiredOnNewDevice](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun challengeRequiredOnNewDevice(value: IntrinsicFunction) {
          this.challengeRequiredOnNewDevice = value
        }

        /**
         * [deviceOnlyRememberedOnUserPrompt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deviceOnlyRememberedOnUserPrompt: Any? = null

        /**
         * [deviceOnlyRememberedOnUserPrompt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deviceOnlyRememberedOnUserPrompt(value: Boolean) {
          this.deviceOnlyRememberedOnUserPrompt = value
        }
        
        /**
         * [deviceOnlyRememberedOnUserPrompt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deviceOnlyRememberedOnUserPrompt(value: IntrinsicFunction) {
          this.deviceOnlyRememberedOnUserPrompt = value
        }

    }

    @CloudFormationMarker
    class EmailConfiguration {
            /**
         * [replyToEmailAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var replyToEmailAddress: Any? = null

        /**
         * [replyToEmailAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replyToEmailAddress(value: String) {
          this.replyToEmailAddress = value
        }
        
        /**
         * [replyToEmailAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-replytoemailaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replyToEmailAddress(value: IntrinsicFunction) {
          this.replyToEmailAddress = value
        }

        /**
         * [sourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceArn: Any? = null

        /**
         * [sourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceArn(value: String) {
          this.sourceArn = value
        }
        
        /**
         * [sourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html#cfn-cognito-userpool-emailconfiguration-sourcearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceArn(value: IntrinsicFunction) {
          this.sourceArn = value
        }

    }

    @CloudFormationMarker
    class InviteMessageTemplate {
            /**
         * [emailMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var emailMessage: Any? = null

        /**
         * [emailMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailMessage(value: String) {
          this.emailMessage = value
        }
        
        /**
         * [emailMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailMessage(value: IntrinsicFunction) {
          this.emailMessage = value
        }

        /**
         * [emailSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var emailSubject: Any? = null

        /**
         * [emailSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailSubject(value: String) {
          this.emailSubject = value
        }
        
        /**
         * [emailSubject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-emailsubject)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun emailSubject(value: IntrinsicFunction) {
          this.emailSubject = value
        }

        /**
         * [sMSMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sMSMessage: Any? = null

        /**
         * [sMSMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sMSMessage(value: String) {
          this.sMSMessage = value
        }
        
        /**
         * [sMSMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html#cfn-cognito-userpool-invitemessagetemplate-smsmessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sMSMessage(value: IntrinsicFunction) {
          this.sMSMessage = value
        }

    }

    @CloudFormationMarker
    class LambdaConfig {
            /**
         * [createAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var createAuthChallenge: Any? = null

        /**
         * [createAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun createAuthChallenge(value: String) {
          this.createAuthChallenge = value
        }
        
        /**
         * [createAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-createauthchallenge)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun createAuthChallenge(value: IntrinsicFunction) {
          this.createAuthChallenge = value
        }

        /**
         * [customMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var customMessage: Any? = null

        /**
         * [customMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customMessage(value: String) {
          this.customMessage = value
        }
        
        /**
         * [customMessage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-custommessage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customMessage(value: IntrinsicFunction) {
          this.customMessage = value
        }

        /**
         * [defineAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var defineAuthChallenge: Any? = null

        /**
         * [defineAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defineAuthChallenge(value: String) {
          this.defineAuthChallenge = value
        }
        
        /**
         * [defineAuthChallenge](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-defineauthchallenge)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defineAuthChallenge(value: IntrinsicFunction) {
          this.defineAuthChallenge = value
        }

        /**
         * [postAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var postAuthentication: Any? = null

        /**
         * [postAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun postAuthentication(value: String) {
          this.postAuthentication = value
        }
        
        /**
         * [postAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postauthentication)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun postAuthentication(value: IntrinsicFunction) {
          this.postAuthentication = value
        }

        /**
         * [postConfirmation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var postConfirmation: Any? = null

        /**
         * [postConfirmation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun postConfirmation(value: String) {
          this.postConfirmation = value
        }
        
        /**
         * [postConfirmation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-postconfirmation)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun postConfirmation(value: IntrinsicFunction) {
          this.postConfirmation = value
        }

        /**
         * [preAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var preAuthentication: Any? = null

        /**
         * [preAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preAuthentication(value: String) {
          this.preAuthentication = value
        }
        
        /**
         * [preAuthentication](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-preauthentication)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preAuthentication(value: IntrinsicFunction) {
          this.preAuthentication = value
        }

        /**
         * [preSignUp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var preSignUp: Any? = null

        /**
         * [preSignUp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preSignUp(value: String) {
          this.preSignUp = value
        }
        
        /**
         * [preSignUp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-presignup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preSignUp(value: IntrinsicFunction) {
          this.preSignUp = value
        }

        /**
         * [verifyAuthChallengeResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var verifyAuthChallengeResponse: Any? = null

        /**
         * [verifyAuthChallengeResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun verifyAuthChallengeResponse(value: String) {
          this.verifyAuthChallengeResponse = value
        }
        
        /**
         * [verifyAuthChallengeResponse](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html#cfn-cognito-userpool-lambdaconfig-verifyauthchallengeresponse)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun verifyAuthChallengeResponse(value: IntrinsicFunction) {
          this.verifyAuthChallengeResponse = value
        }

    }

    @CloudFormationMarker
    class NumberAttributeConstraints {
            /**
         * [maxValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var maxValue: Any? = null

        /**
         * [maxValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maxValue(value: String) {
          this.maxValue = value
        }
        
        /**
         * [maxValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-maxvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maxValue(value: IntrinsicFunction) {
          this.maxValue = value
        }

        /**
         * [minValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var minValue: Any? = null

        /**
         * [minValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun minValue(value: String) {
          this.minValue = value
        }
        
        /**
         * [minValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html#cfn-cognito-userpool-numberattributeconstraints-minvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun minValue(value: IntrinsicFunction) {
          this.minValue = value
        }

    }

    @CloudFormationMarker
    class PasswordPolicy {
            /**
         * [minimumLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var minimumLength: Any? = null

        /**
         * [minimumLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minimumLength(value: Int) {
          this.minimumLength = value
        }
        
        /**
         * [minimumLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-minimumlength)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minimumLength(value: IntrinsicFunction) {
          this.minimumLength = value
        }

        /**
         * [requireLowercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var requireLowercase: Any? = null

        /**
         * [requireLowercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireLowercase(value: Boolean) {
          this.requireLowercase = value
        }
        
        /**
         * [requireLowercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirelowercase)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireLowercase(value: IntrinsicFunction) {
          this.requireLowercase = value
        }

        /**
         * [requireNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var requireNumbers: Any? = null

        /**
         * [requireNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireNumbers(value: Boolean) {
          this.requireNumbers = value
        }
        
        /**
         * [requireNumbers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requirenumbers)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireNumbers(value: IntrinsicFunction) {
          this.requireNumbers = value
        }

        /**
         * [requireSymbols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var requireSymbols: Any? = null

        /**
         * [requireSymbols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireSymbols(value: Boolean) {
          this.requireSymbols = value
        }
        
        /**
         * [requireSymbols](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requiresymbols)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireSymbols(value: IntrinsicFunction) {
          this.requireSymbols = value
        }

        /**
         * [requireUppercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var requireUppercase: Any? = null

        /**
         * [requireUppercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireUppercase(value: Boolean) {
          this.requireUppercase = value
        }
        
        /**
         * [requireUppercase](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html#cfn-cognito-userpool-passwordpolicy-requireuppercase)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun requireUppercase(value: IntrinsicFunction) {
          this.requireUppercase = value
        }

    }

    @CloudFormationMarker
    class Policies {
            /**
         * [passwordPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
         *
         * _Required_: no
         *
         * _Type_: PasswordPolicy
         */
        var passwordPolicy: Any? = null

        /**
         * [passwordPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
         *
         * _Required_: no
         *
         * _Type_: PasswordPolicy
         */
        fun passwordPolicy(value: PasswordPolicy) {
          this.passwordPolicy = value
        }
        
        /**
         * [passwordPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html#cfn-cognito-userpool-policies-passwordpolicy)
         *
         * _Required_: no
         *
         * _Type_: PasswordPolicy
         */
        fun passwordPolicy(value: IntrinsicFunction) {
          this.passwordPolicy = value
        }

    }

    @CloudFormationMarker
    class SchemaAttribute {
            /**
         * [attributeDataType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var attributeDataType: Any? = null

        /**
         * [attributeDataType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun attributeDataType(value: String) {
          this.attributeDataType = value
        }
        
        /**
         * [attributeDataType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-attributedatatype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun attributeDataType(value: IntrinsicFunction) {
          this.attributeDataType = value
        }

        /**
         * [developerOnlyAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var developerOnlyAttribute: Any? = null

        /**
         * [developerOnlyAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun developerOnlyAttribute(value: Boolean) {
          this.developerOnlyAttribute = value
        }
        
        /**
         * [developerOnlyAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-developeronlyattribute)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun developerOnlyAttribute(value: IntrinsicFunction) {
          this.developerOnlyAttribute = value
        }

        /**
         * [mutable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var mutable: Any? = null

        /**
         * [mutable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun mutable(value: Boolean) {
          this.mutable = value
        }
        
        /**
         * [mutable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-mutable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun mutable(value: IntrinsicFunction) {
          this.mutable = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [numberAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
         *
         * _Required_: no
         *
         * _Type_: NumberAttributeConstraints
         */
        var numberAttributeConstraints: Any? = null

        /**
         * [numberAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
         *
         * _Required_: no
         *
         * _Type_: NumberAttributeConstraints
         */
        fun numberAttributeConstraints(value: NumberAttributeConstraints) {
          this.numberAttributeConstraints = value
        }
        
        /**
         * [numberAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-numberattributeconstraints)
         *
         * _Required_: no
         *
         * _Type_: NumberAttributeConstraints
         */
        fun numberAttributeConstraints(value: IntrinsicFunction) {
          this.numberAttributeConstraints = value
        }

        /**
         * [required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var required: Any? = null

        /**
         * [required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun required(value: Boolean) {
          this.required = value
        }
        
        /**
         * [required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-required)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun required(value: IntrinsicFunction) {
          this.required = value
        }

        /**
         * [stringAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
         *
         * _Required_: no
         *
         * _Type_: StringAttributeConstraints
         */
        var stringAttributeConstraints: Any? = null

        /**
         * [stringAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
         *
         * _Required_: no
         *
         * _Type_: StringAttributeConstraints
         */
        fun stringAttributeConstraints(value: StringAttributeConstraints) {
          this.stringAttributeConstraints = value
        }
        
        /**
         * [stringAttributeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html#cfn-cognito-userpool-schemaattribute-stringattributeconstraints)
         *
         * _Required_: no
         *
         * _Type_: StringAttributeConstraints
         */
        fun stringAttributeConstraints(value: IntrinsicFunction) {
          this.stringAttributeConstraints = value
        }

    }

    @CloudFormationMarker
    class SmsConfiguration {
            /**
         * [externalId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var externalId: Any? = null

        /**
         * [externalId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun externalId(value: String) {
          this.externalId = value
        }
        
        /**
         * [externalId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun externalId(value: IntrinsicFunction) {
          this.externalId = value
        }

        /**
         * [snsCallerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var snsCallerArn: Any? = null

        /**
         * [snsCallerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snsCallerArn(value: String) {
          this.snsCallerArn = value
        }
        
        /**
         * [snsCallerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun snsCallerArn(value: IntrinsicFunction) {
          this.snsCallerArn = value
        }

    }

    @CloudFormationMarker
    class StringAttributeConstraints {
            /**
         * [maxLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var maxLength: Any? = null

        /**
         * [maxLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maxLength(value: String) {
          this.maxLength = value
        }
        
        /**
         * [maxLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-maxlength)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun maxLength(value: IntrinsicFunction) {
          this.maxLength = value
        }

        /**
         * [minLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var minLength: Any? = null

        /**
         * [minLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun minLength(value: String) {
          this.minLength = value
        }
        
        /**
         * [minLength](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html#cfn-cognito-userpool-stringattributeconstraints-minlength)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun minLength(value: IntrinsicFunction) {
          this.minLength = value
        }

    }

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
