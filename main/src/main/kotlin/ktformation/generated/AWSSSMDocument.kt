
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::Document - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
 */
@CloudFormationMarker
class AWSSSMDocument(logicalId: String) : Resource<AWSSSMDocument.Properties>(logicalId, "AWS::SSM::Document") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [content](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-content)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var content: Any? = null

        /**
         * [content](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-content)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun content(value: Json) {
          this.content = value
        }
        
        /**
         * [content](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-content)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun content(value: IntrinsicFunction) {
          this.content = value
        }
        
        /**
         * [documentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var documentType: Any? = null

        /**
         * [documentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentType(value: String) {
          this.documentType = value
        }
        
        /**
         * [documentType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-documenttype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentType(value: IntrinsicFunction) {
          this.documentType = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html#cfn-ssm-document-tags)
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
 * [AWS::SSM::Document - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
 */
fun Resources.awsSSMDocument(logicalId: String, init: AWSSSMDocument.() -> Unit = {}): AWSSSMDocument {
    return AWSSSMDocument(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
