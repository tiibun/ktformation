
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::Document - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
 */
@CloudFormationMarker
class AWSSSMDocument(logicalId: String) : Resource<AWSSSMDocument.Properties>(logicalId, "AWS::SSM::Document") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var content: Any? = null
        fun content(value: Json) { this.content = value }
        fun content(value: IntrinsicFunction) { this.content = value }
        @JvmField var documentType: Any? = null
        fun documentType(value: String?) { this.documentType = value }
        fun documentType(value: IntrinsicFunction) { this.documentType = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSSMDocument(logicalId: String, init: AWSSSMDocument.() -> Unit = {}): AWSSSMDocument {
    return AWSSSMDocument(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
