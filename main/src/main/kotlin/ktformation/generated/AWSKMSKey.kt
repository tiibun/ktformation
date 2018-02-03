
package ktformation.generated

import ktformation.*

/**
 * [AWS::KMS::Key - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
 */
@CloudFormationMarker
class AWSKMSKey(logicalId: String) : Resource<AWSKMSKey.Properties>(logicalId, "AWS::KMS::Key") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [enableKeyRotation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableKeyRotation: Any? = null

        /**
         * [enableKeyRotation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableKeyRotation(value: Boolean) {
          this.enableKeyRotation = value
        }
        
        /**
         * [enableKeyRotation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enablekeyrotation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableKeyRotation(value: IntrinsicFunction) {
          this.enableKeyRotation = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }
        
        /**
         * [keyPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keypolicy)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var keyPolicy: Any? = null

        /**
         * [keyPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keypolicy)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun keyPolicy(value: Json) {
          this.keyPolicy = value
        }
        
        /**
         * [keyPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keypolicy)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun keyPolicy(value: IntrinsicFunction) {
          this.keyPolicy = value
        }
        
        /**
         * [keyUsage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyusage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var keyUsage: Any? = null

        /**
         * [keyUsage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyusage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyUsage(value: String) {
          this.keyUsage = value
        }
        
        /**
         * [keyUsage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-keyusage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun keyUsage(value: IntrinsicFunction) {
          this.keyUsage = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
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
 * [AWS::KMS::Key - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
 */
fun Resources.awsKMSKey(logicalId: String, init: AWSKMSKey.() -> Unit = {}): AWSKMSKey {
    return AWSKMSKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
