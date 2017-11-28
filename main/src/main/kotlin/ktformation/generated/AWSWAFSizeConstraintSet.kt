
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::SizeConstraintSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html)
 */
@CloudFormationMarker
class AWSWAFSizeConstraintSet(logicalId: String) : Resource<AWSWAFSizeConstraintSet.Properties>(logicalId, "AWS::WAF::SizeConstraintSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var sizeConstraints: Any? = null
        fun sizeConstraints(value: List<SizeConstraint>) { this.sizeConstraints = value }
        fun sizeConstraints(vararg value: IntrinsicFunction) { this.sizeConstraints = value }
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

    class SizeConstraint(
            val comparisonOperator: String,
            val fieldToMatch: FieldToMatch,
            val size: Int,
            val textTransformation: String
    )

}

fun Resources.awsWAFSizeConstraintSet(logicalId: String, init: AWSWAFSizeConstraintSet.() -> Unit = {}): AWSWAFSizeConstraintSet {
    return AWSWAFSizeConstraintSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
