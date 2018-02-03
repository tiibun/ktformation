
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::Group - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html)
 */
@CloudFormationMarker
class AWSIAMGroup(logicalId: String) : Resource<AWSIAMGroup.Properties>(logicalId, "AWS::IAM::Group") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }
        
        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var managedPolicyArns: Any? = null

        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun managedPolicyArns(value: List<String>) {
          this.managedPolicyArns = value
        }
        
        /**
         * [managedPolicyArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-managepolicyarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun managedPolicyArns(vararg value: IntrinsicFunction) {
          this.managedPolicyArns = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        @JvmField
        var policies: Any? = null

        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        fun policies(value: List<Policy>) {
          this.policies = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html#cfn-iam-group-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policy>
         */
        fun policies(vararg value: IntrinsicFunction) {
          this.policies = value
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
 * [AWS::IAM::Group - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html)
 */
fun Resources.awsIAMGroup(logicalId: String, init: AWSIAMGroup.() -> Unit = {}): AWSIAMGroup {
    return AWSIAMGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
