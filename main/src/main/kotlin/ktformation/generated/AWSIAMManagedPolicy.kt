
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::ManagedPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
 */
@CloudFormationMarker
class AWSIAMManagedPolicy(logicalId: String) : Resource<AWSIAMManagedPolicy.Properties>(logicalId, "AWS::IAM::ManagedPolicy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var groups: Any? = null

        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(value: List<String>) {
          this.groups = value
        }
        
        /**
         * [groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-groups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groups(vararg value: IntrinsicFunction) {
          this.groups = value
        }
        
        /**
         * [managedPolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var managedPolicyName: Any? = null

        /**
         * [managedPolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun managedPolicyName(value: String) {
          this.managedPolicyName = value
        }
        
        /**
         * [managedPolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-managedpolicyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun managedPolicyName(value: IntrinsicFunction) {
          this.managedPolicyName = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-ec2-dhcpoptions-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var policyDocument: Any? = null

        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var roles: Any? = null

        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun roles(value: List<String>) {
          this.roles = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-roles)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun roles(vararg value: IntrinsicFunction) {
          this.roles = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var users: Any? = null

        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun users(value: List<String>) {
          this.users = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html#cfn-iam-managedpolicy-users)
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
 * [AWS::IAM::ManagedPolicy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-managedpolicy.html)
 */
fun Resources.awsIAMManagedPolicy(logicalId: String, init: AWSIAMManagedPolicy.() -> Unit = {}): AWSIAMManagedPolicy {
    return AWSIAMManagedPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
