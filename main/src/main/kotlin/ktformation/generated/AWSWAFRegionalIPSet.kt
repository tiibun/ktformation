
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalIPSet(logicalId: String) : Resource<AWSWAFRegionalIPSet.Properties>(logicalId, "AWS::WAFRegional::IPSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var iPSetDescriptors: Any? = null
        fun iPSetDescriptors(value: List<IPSetDescriptor>?) { this.iPSetDescriptors = value }
        fun iPSetDescriptors(vararg value: IntrinsicFunction) { this.iPSetDescriptors = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class IPSetDescriptor(
            val type: String,
            val value: String
    )

}

fun Resources.awsWAFRegionalIPSet(logicalId: String, init: AWSWAFRegionalIPSet.() -> Unit = {}): AWSWAFRegionalIPSet {
    return AWSWAFRegionalIPSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
