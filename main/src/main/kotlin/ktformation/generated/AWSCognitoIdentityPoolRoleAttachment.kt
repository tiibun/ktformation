
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::IdentityPoolRoleAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 */
@CloudFormationMarker
class AWSCognitoIdentityPoolRoleAttachment(logicalId: String) : Resource<AWSCognitoIdentityPoolRoleAttachment.Properties>(logicalId, "AWS::Cognito::IdentityPoolRoleAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [identityPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var identityPoolId: Any? = null

        /**
         * [identityPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun identityPoolId(value: String) {
          this.identityPoolId = value
        }
        
        /**
         * [identityPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-identitypoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun identityPoolId(value: IntrinsicFunction) {
          this.identityPoolId = value
        }
        
        /**
         * [roleMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var roleMappings: Any? = null

        /**
         * [roleMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun roleMappings(value: Json) {
          this.roleMappings = value
        }
        
        /**
         * [roleMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-rolemappings)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun roleMappings(value: IntrinsicFunction) {
          this.roleMappings = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var roles: Any? = null

        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun roles(value: Json) {
          this.roles = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html#cfn-cognito-identitypoolroleattachment-roles)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun roles(value: IntrinsicFunction) {
          this.roles = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class MappingRule(
            /**
             * [Claim](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val claim: String,
            /**
             * [MatchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val matchType: String,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleARN: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class RoleMapping(
            /**
             * [AmbiguousRoleResolution](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ambiguousRoleResolution: String? = null,
            /**
             * [RulesConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-rulesconfiguration)
             *
             * _Required_: no
             *
             * _Type_: RulesConfigurationType
             */
            val rulesConfiguration: RulesConfigurationType? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class RulesConfigurationType(
            /**
             * [Rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules)
             *
             * _Required_: yes
             *
             * _Type_: List<MappingRule>
             */
            val rules: List<MappingRule>
    )

}

/**
 * [AWS::Cognito::IdentityPoolRoleAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 */
fun Resources.awsCognitoIdentityPoolRoleAttachment(logicalId: String, init: AWSCognitoIdentityPoolRoleAttachment.() -> Unit = {}): AWSCognitoIdentityPoolRoleAttachment {
    return AWSCognitoIdentityPoolRoleAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
