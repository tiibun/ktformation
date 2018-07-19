
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

        /**
        * [MappingRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html)
        */
        fun mappingRule(init: MappingRule.() -> Unit = {}): MappingRule {
            return MappingRule().also {
                it.init()
            }
        }
        /**
        * [RoleMapping](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
        */
        fun roleMapping(init: RoleMapping.() -> Unit = {}): RoleMapping {
            return RoleMapping().also {
                it.init()
            }
        }
        /**
        * [RulesConfigurationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html)
        */
        fun rulesConfigurationType(init: RulesConfigurationType.() -> Unit = {}): RulesConfigurationType {
            return RulesConfigurationType().also {
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
    class MappingRule {
            /**
         * [claim](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var claim: Any? = null

        /**
         * [claim](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun claim(value: String) {
          this.claim = value
        }
        
        /**
         * [claim](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-claim)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun claim(value: IntrinsicFunction) {
          this.claim = value
        }

        /**
         * [matchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var matchType: Any? = null

        /**
         * [matchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun matchType(value: String) {
          this.matchType = value
        }
        
        /**
         * [matchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-matchtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun matchType(value: IntrinsicFunction) {
          this.matchType = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html#cfn-cognito-identitypoolroleattachment-mappingrule-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class RoleMapping {
            /**
         * [ambiguousRoleResolution](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ambiguousRoleResolution: Any? = null

        /**
         * [ambiguousRoleResolution](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ambiguousRoleResolution(value: String) {
          this.ambiguousRoleResolution = value
        }
        
        /**
         * [ambiguousRoleResolution](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-ambiguousroleresolution)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ambiguousRoleResolution(value: IntrinsicFunction) {
          this.ambiguousRoleResolution = value
        }

        /**
         * [rulesConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-rulesconfiguration)
         *
         * _Required_: no
         *
         * _Type_: RulesConfigurationType
         */
        var rulesConfiguration: Any? = null

        /**
         * [rulesConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-rulesconfiguration)
         *
         * _Required_: no
         *
         * _Type_: RulesConfigurationType
         */
        fun rulesConfiguration(value: RulesConfigurationType) {
          this.rulesConfiguration = value
        }
        
        /**
         * [rulesConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-rulesconfiguration)
         *
         * _Required_: no
         *
         * _Type_: RulesConfigurationType
         */
        fun rulesConfiguration(value: IntrinsicFunction) {
          this.rulesConfiguration = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html#cfn-cognito-identitypoolroleattachment-rolemapping-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class RulesConfigurationType {
            /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<MappingRule>
         */
        var rules: Any? = null

        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<MappingRule>
         */
        fun rules(value: List<MappingRule>) {
          this.rules = value
        }
        
        /**
         * [rules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html#cfn-cognito-identitypoolroleattachment-rulesconfigurationtype-rules)
         *
         * _Required_: yes
         *
         * _Type_: List<MappingRule>
         */
        fun rules(vararg value: IntrinsicFunction) {
          this.rules = value
        }

    }

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
