
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::SqlInjectionMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html)
 */
@CloudFormationMarker
class AWSWAFSqlInjectionMatchSet(logicalId: String) : Resource<AWSWAFSqlInjectionMatchSet.Properties>(logicalId, "AWS::WAF::SqlInjectionMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var sqlInjectionMatchTuples: Any? = null
        fun sqlInjectionMatchTuples(value: List<SqlInjectionMatchTuple>) {
            this.sqlInjectionMatchTuples = value
        }
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

fun Resources.awsWAFSqlInjectionMatchSet(logicalId: String, init: AWSWAFSqlInjectionMatchSet.() -> Unit = {}): AWSWAFSqlInjectionMatchSet {
    return AWSWAFSqlInjectionMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
