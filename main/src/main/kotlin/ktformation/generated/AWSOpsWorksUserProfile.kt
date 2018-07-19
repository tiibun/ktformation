
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::UserProfile - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html)
 */
@CloudFormationMarker
class AWSOpsWorksUserProfile(logicalId: String) : Resource<AWSOpsWorksUserProfile.Properties>(logicalId, "AWS::OpsWorks::UserProfile") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allowSelfManagement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var allowSelfManagement: Any? = null

        /**
         * [allowSelfManagement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowSelfManagement(value: Boolean) {
          this.allowSelfManagement = value
        }
        
        /**
         * [allowSelfManagement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allowSelfManagement(value: IntrinsicFunction) {
          this.allowSelfManagement = value
        }

        /**
         * [iamUserArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var iamUserArn: Any? = null

        /**
         * [iamUserArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iamUserArn(value: String) {
          this.iamUserArn = value
        }
        
        /**
         * [iamUserArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iamUserArn(value: IntrinsicFunction) {
          this.iamUserArn = value
        }

        /**
         * [sshPublicKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sshPublicKey: Any? = null

        /**
         * [sshPublicKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshPublicKey(value: String) {
          this.sshPublicKey = value
        }
        
        /**
         * [sshPublicKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshPublicKey(value: IntrinsicFunction) {
          this.sshPublicKey = value
        }

        /**
         * [sshUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sshUsername: Any? = null

        /**
         * [sshUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshUsername(value: String) {
          this.sshUsername = value
        }
        
        /**
         * [sshUsername](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshUsername(value: IntrinsicFunction) {
          this.sshUsername = value
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
 * [AWS::OpsWorks::UserProfile - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html)
 */
fun Resources.awsOpsWorksUserProfile(logicalId: String, init: AWSOpsWorksUserProfile.() -> Unit = {}): AWSOpsWorksUserProfile {
    return AWSOpsWorksUserProfile(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
