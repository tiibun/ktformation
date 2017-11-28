
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::WebACLAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
 */
@CloudFormationMarker
class AWSWAFRegionalWebACLAssociation(logicalId: String) : Resource<AWSWAFRegionalWebACLAssociation.Properties>(logicalId, "AWS::WAFRegional::WebACLAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var resourceArn: Any? = null
        fun resourceArn(value: String) { this.resourceArn = value }
        fun resourceArn(value: IntrinsicFunction) { this.resourceArn = value }
        @JvmField var webACLId: Any? = null
        fun webACLId(value: String) { this.webACLId = value }
        fun webACLId(value: IntrinsicFunction) { this.webACLId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsWAFRegionalWebACLAssociation(logicalId: String, init: AWSWAFRegionalWebACLAssociation.() -> Unit = {}): AWSWAFRegionalWebACLAssociation {
    return AWSWAFRegionalWebACLAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
