
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::AccessKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html)
 */
@CloudFormationMarker
class AWSIAMAccessKey(logicalId: String) : Resource<AWSIAMAccessKey.Properties>(logicalId, "AWS::IAM::AccessKey") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [serial](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var serial: Any? = null

        /**
         * [serial](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun serial(value: Int) {
          this.serial = value
        }
        
        /**
         * [serial](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-serial)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun serial(value: IntrinsicFunction) {
          this.serial = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-status)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }
        
        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var userName: Any? = null

        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userName(value: String) {
          this.userName = value
        }
        
        /**
         * [userName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html#cfn-iam-accesskey-username)
         *
         * _Required_: yes
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



}

/**
 * [AWS::IAM::AccessKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html)
 */
fun Resources.awsIAMAccessKey(logicalId: String, init: AWSIAMAccessKey.() -> Unit = {}): AWSIAMAccessKey {
    return AWSIAMAccessKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
