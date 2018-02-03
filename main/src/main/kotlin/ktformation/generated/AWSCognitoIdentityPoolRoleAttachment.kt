
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::IdentityPoolRoleAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 */
@CloudFormationMarker
class AWSCognitoIdentityPoolRoleAttachment(logicalId: String) : Resource<AWSCognitoIdentityPoolRoleAttachment.Properties>(logicalId, "AWS::Cognito::IdentityPoolRoleAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var identityPoolId: Any? = null

        fun identityPoolId(value: String) {
          this.identityPoolId = value
        }
        
        fun identityPoolId(value: IntrinsicFunction) {
          this.identityPoolId = value
        }
        
        @JvmField
        var roleMappings: Any? = null

        fun roleMappings(value: Json) {
          this.roleMappings = value
        }
        
        fun roleMappings(value: IntrinsicFunction) {
          this.roleMappings = value
        }
        
        @JvmField
        var roles: Any? = null

        fun roles(value: Json) {
          this.roles = value
        }
        
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
            val claim: String,
            val matchType: String,
            val roleARN: String,
            val value: String
    )

    class RoleMapping(
            val ambiguousRoleResolution: String? = null,
            val rulesConfiguration: RulesConfigurationType? = null,
            val type: String
    )

    class RulesConfigurationType(
            val rules: List<MappingRule>
    )

}

fun Resources.awsCognitoIdentityPoolRoleAttachment(logicalId: String, init: AWSCognitoIdentityPoolRoleAttachment.() -> Unit = {}): AWSCognitoIdentityPoolRoleAttachment {
    return AWSCognitoIdentityPoolRoleAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
