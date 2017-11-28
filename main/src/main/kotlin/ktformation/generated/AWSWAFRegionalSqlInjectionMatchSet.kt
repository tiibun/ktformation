
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::SqlInjectionMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalSqlInjectionMatchSet(logicalId: String) : Resource<AWSWAFRegionalSqlInjectionMatchSet.Properties>(logicalId, "AWS::WAFRegional::SqlInjectionMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var sqlInjectionMatchTuples: Any? = null
        fun sqlInjectionMatchTuples(value: List<SqlInjectionMatchTuple>?) { this.sqlInjectionMatchTuples = value }
        fun sqlInjectionMatchTuples(vararg value: IntrinsicFunction) { this.sqlInjectionMatchTuples = value }
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

    class SqlInjectionMatchTuple(
            val fieldToMatch: FieldToMatch,
            val textTransformation: String
    )

}

fun Resources.awsWAFRegionalSqlInjectionMatchSet(logicalId: String, init: AWSWAFRegionalSqlInjectionMatchSet.() -> Unit = {}): AWSWAFRegionalSqlInjectionMatchSet {
    return AWSWAFRegionalSqlInjectionMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
