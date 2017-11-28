
package ktformation.generated

import ktformation.*

/**
 * [AWS::SDB::Domain - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simpledb.html)
 */
@CloudFormationMarker
class AWSSDBDomain(logicalId: String) : Resource<AWSSDBDomain.Properties>(logicalId, "AWS::SDB::Domain") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSDBDomain(logicalId: String, init: AWSSDBDomain.() -> Unit = {}): AWSSDBDomain {
    return AWSSDBDomain(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
