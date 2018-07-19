
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::UserToGroupAddition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html)
 */
@CloudFormationMarker
class AWSIAMUserToGroupAddition(logicalId: String) : Resource<AWSIAMUserToGroupAddition.Properties>(logicalId, "AWS::IAM::UserToGroupAddition") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-groupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }

        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var users: Any? = null

        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun users(value: List<String>) {
          this.users = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html#cfn-iam-addusertogroup-users)
         *
         * _Required_: yes
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
 * [AWS::IAM::UserToGroupAddition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html)
 */
fun Resources.awsIAMUserToGroupAddition(logicalId: String, init: AWSIAMUserToGroupAddition.() -> Unit = {}): AWSIAMUserToGroupAddition {
    return AWSIAMUserToGroupAddition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
