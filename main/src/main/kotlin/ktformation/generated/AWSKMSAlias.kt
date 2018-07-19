
package ktformation.generated

import ktformation.*

/**
 * [AWS::KMS::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html)
 */
@CloudFormationMarker
class AWSKMSAlias(logicalId: String) : Resource<AWSKMSAlias.Properties>(logicalId, "AWS::KMS::Alias") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [aliasName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var aliasName: Any? = null

        /**
         * [aliasName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun aliasName(value: String) {
          this.aliasName = value
        }
        
        /**
         * [aliasName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-aliasname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun aliasName(value: IntrinsicFunction) {
          this.aliasName = value
        }

        /**
         * [targetKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var targetKeyId: Any? = null

        /**
         * [targetKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetKeyId(value: String) {
          this.targetKeyId = value
        }
        
        /**
         * [targetKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html#cfn-kms-alias-targetkeyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetKeyId(value: IntrinsicFunction) {
          this.targetKeyId = value
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
 * [AWS::KMS::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html)
 */
fun Resources.awsKMSAlias(logicalId: String, init: AWSKMSAlias.() -> Unit = {}): AWSKMSAlias {
    return AWSKMSAlias(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
