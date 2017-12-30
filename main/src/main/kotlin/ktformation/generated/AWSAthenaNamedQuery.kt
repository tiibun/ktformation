
package ktformation.generated

import ktformation.*

/**
 * [AWS::Athena::NamedQuery - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
 */
@CloudFormationMarker
class AWSAthenaNamedQuery(logicalId: String) : Resource<AWSAthenaNamedQuery.Properties>(logicalId, "AWS::Athena::NamedQuery") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var database: Any? = null
        fun database(value: String) { this.database = value }
        fun database(value: IntrinsicFunction) { this.database = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var name: Any? = null
        fun name(value: String) {
            this.name = value
        }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var queryString: Any? = null
        fun queryString(value: String) { this.queryString = value }
        fun queryString(value: IntrinsicFunction) { this.queryString = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsAthenaNamedQuery(logicalId: String, init: AWSAthenaNamedQuery.() -> Unit = {}): AWSAthenaNamedQuery {
    return AWSAthenaNamedQuery(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
