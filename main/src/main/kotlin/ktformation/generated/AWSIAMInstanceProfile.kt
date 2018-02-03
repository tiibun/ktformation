
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::InstanceProfile - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
 */
@CloudFormationMarker
class AWSIAMInstanceProfile(logicalId: String) : Resource<AWSIAMInstanceProfile.Properties>(logicalId, "AWS::IAM::InstanceProfile") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [instanceProfileName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceProfileName: Any? = null

        /**
         * [instanceProfileName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceProfileName(value: String) {
          this.instanceProfileName = value
        }
        
        /**
         * [instanceProfileName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-instanceprofilename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceProfileName(value: IntrinsicFunction) {
          this.instanceProfileName = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var roles: Any? = null

        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun roles(value: List<String>) {
          this.roles = value
        }
        
        /**
         * [roles](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html#cfn-iam-instanceprofile-roles)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun roles(vararg value: IntrinsicFunction) {
          this.roles = value
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
 * [AWS::IAM::InstanceProfile - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
 */
fun Resources.awsIAMInstanceProfile(logicalId: String, init: AWSIAMInstanceProfile.() -> Unit = {}): AWSIAMInstanceProfile {
    return AWSIAMInstanceProfile(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
