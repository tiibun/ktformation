
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalByteMatchSet(logicalId: String) : Resource<AWSWAFRegionalByteMatchSet.Properties>(logicalId, "AWS::WAFRegional::ByteMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var byteMatchTuples: Any? = null
        fun byteMatchTuples(value: List<ByteMatchTuple>?) { this.byteMatchTuples = value }
        fun byteMatchTuples(vararg value: IntrinsicFunction) { this.byteMatchTuples = value }
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


    class ByteMatchTuple(
            val fieldToMatch: FieldToMatch,
            val positionalConstraint: String,
            val targetString: String? = null,
            val targetStringBase64: String? = null,
            val textTransformation: String
    )

    class FieldToMatch(
            val data: String? = null,
            val type: String
    )

}

fun Resources.awsWAFRegionalByteMatchSet(logicalId: String, init: AWSWAFRegionalByteMatchSet.() -> Unit = {}): AWSWAFRegionalByteMatchSet {
    return AWSWAFRegionalByteMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
