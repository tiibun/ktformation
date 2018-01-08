
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::XssMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalXssMatchSet(logicalId: String) : Resource<AWSWAFRegionalXssMatchSet.Properties>(logicalId, "AWS::WAFRegional::XssMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var xssMatchTuples: Any? = null

        fun xssMatchTuples(value: List<XssMatchTuple>) {
          this.xssMatchTuples = value
        }
        fun xssMatchTuples(vararg value: IntrinsicFunction) {
  this.xssMatchTuples = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class FieldToMatch(
            val data: String? = null,
            val type: String
    )

    class XssMatchTuple(
            val fieldToMatch: FieldToMatch,
            val textTransformation: String
    )

}

fun Resources.awsWAFRegionalXssMatchSet(logicalId: String, init: AWSWAFRegionalXssMatchSet.() -> Unit = {}): AWSWAFRegionalXssMatchSet {
    return AWSWAFRegionalXssMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
