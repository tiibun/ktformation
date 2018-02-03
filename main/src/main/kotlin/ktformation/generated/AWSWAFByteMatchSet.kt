
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html)
 */
@CloudFormationMarker
class AWSWAFByteMatchSet(logicalId: String) : Resource<AWSWAFByteMatchSet.Properties>(logicalId, "AWS::WAF::ByteMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var byteMatchTuples: Any? = null

        fun byteMatchTuples(value: List<ByteMatchTuple>) {
          this.byteMatchTuples = value
        }
        
        fun byteMatchTuples(vararg value: IntrinsicFunction) {
          this.byteMatchTuples = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
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

fun Resources.awsWAFByteMatchSet(logicalId: String, init: AWSWAFByteMatchSet.() -> Unit = {}): AWSWAFByteMatchSet {
    return AWSWAFByteMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
