
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::User - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html)
 */
@CloudFormationMarker
class AWSIAMUser(logicalId: String) : Resource<AWSIAMUser.Properties>(logicalId, "AWS::IAM::User") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var groups: Any? = null

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(value: List<String>) {
          this.groups = value
        }
        
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }
        
        /**
         * [loginProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-loginprofile)
         *
         * _Required_: no
         *
         * _Type_: LoginProfile
         */
        @JvmField
        var loginProfile: Any? = null

        /**
         * [loginProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-loginprofile)
         *
         * _Required_: no
         *
         * _Type_: LoginProfile
         */
        fun loginProfile(value: LoginProfile) {
          this.loginProfile = value
        }
        
        /**
         * [loginProfile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-loginprofile)
         *
         * _Required_: no
         *
         * _Type_: LoginProfile
         */
        fun loginProfile(value: IntrinsicFunction) {
          this.loginProfile = value
        }
        
        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var managedPolicyArns: Any? = null

        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun managedPolicyArns(value: List<String>) {
          this.managedPolicyArns = value
        }
        
        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun managedPolicyArns(vararg value: IntrinsicFunction) {
          this.managedPolicyArns = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        @JvmField
        var policies: Any? = null

        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        fun policies(value: List<Policy>) {
          this.policies = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        fun policies(vararg value: IntrinsicFunction) {
          this.policies = value
        }
        
        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var userName: Any? = null

        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userName(value: String) {
          this.userName = value
        }
        
        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html#cfn-iam-user-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun userName(value: IntrinsicFunction) {
          this.userName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LoginProfile(
            /**
             * [Password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val password: String,
            /**
             * [PasswordResetRequired](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val passwordResetRequired: Boolean? = null
    )

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
 * [AWS::IAM::User - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html)
 */
fun Resources.awsIAMUser(logicalId: String, init: AWSIAMUser.() -> Unit = {}): AWSIAMUser {
    return AWSIAMUser(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
