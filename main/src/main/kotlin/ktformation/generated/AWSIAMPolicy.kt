
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::Policy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
 */
@CloudFormationMarker
class AWSIAMPolicy(logicalId: String) : Resource<AWSIAMPolicy.Properties>(logicalId, "AWS::IAM::Policy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var groups: Any? = null

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(value: List<String>) {
          this.groups = value
        }
        
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var policyDocument: Any? = null

        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var roles: Any? = null

        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun roles(value: List<String>) {
          this.roles = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun roles(vararg value: IntrinsicFunction) {
          this.roles = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var users: Any? = null

        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun users(value: List<String>) {
          this.users = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun users(vararg value: IntrinsicFunction) {
          this.users = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::IAM::Policy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
 */
fun Resources.awsIAMPolicy(logicalId: String, init: AWSIAMPolicy.() -> Unit = {}): AWSIAMPolicy {
    return AWSIAMPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
