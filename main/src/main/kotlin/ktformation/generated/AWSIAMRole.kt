
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::Role - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
 */
@CloudFormationMarker
class AWSIAMRole(logicalId: String) : Resource<AWSIAMRole.Properties>(logicalId, "AWS::IAM::Role") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [assumeRolePolicyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var assumeRolePolicyDocument: Any? = null

        /**
         * [assumeRolePolicyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun assumeRolePolicyDocument(value: Json) {
          this.assumeRolePolicyDocument = value
        }
        
        /**
         * [assumeRolePolicyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun assumeRolePolicyDocument(value: IntrinsicFunction) {
          this.assumeRolePolicyDocument = value
        }
        
        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var managedPolicyArns: Any? = null

        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun managedPolicyArns(value: List<String>) {
          this.managedPolicyArns = value
        }
        
        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun managedPolicyArns(vararg value: IntrinsicFunction) {
          this.managedPolicyArns = value
        }
        
        /**
         * [maxSessionDuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var maxSessionDuration: Any? = null

        /**
         * [maxSessionDuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxSessionDuration(value: Int) {
          this.maxSessionDuration = value
        }
        
        /**
         * [maxSessionDuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxSessionDuration(value: IntrinsicFunction) {
          this.maxSessionDuration = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        @JvmField
        var policies: Any? = null

        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        fun policies(value: List<Policy>) {
          this.policies = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        fun policies(vararg value: IntrinsicFunction) {
          this.policies = value
        }
        
        /**
         * [roleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var roleName: Any? = null

        /**
         * [roleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleName(value: String) {
          this.roleName = value
        }
        
        /**
         * [roleName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleName(value: IntrinsicFunction) {
          this.roleName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Policy(
            /**
             * [PolicyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html#cfn-iam-policies-policydocument)
             *
             * _Required_: yes
             *
             * _Type_: Json
             */
            val policyDocument: Json,
            /**
             * [PolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html#cfn-iam-policies-policyname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val policyName: String
    )

}

/**
 * [AWS::IAM::Role - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
 */
fun Resources.awsIAMRole(logicalId: String, init: AWSIAMRole.() -> Unit = {}): AWSIAMRole {
    return AWSIAMRole(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
