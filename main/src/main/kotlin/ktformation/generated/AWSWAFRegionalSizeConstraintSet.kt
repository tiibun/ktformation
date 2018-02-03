
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::SizeConstraintSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalSizeConstraintSet(logicalId: String) : Resource<AWSWAFRegionalSizeConstraintSet.Properties>(logicalId, "AWS::WAFRegional::SizeConstraintSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [sizeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<SizeConstraint>
         */
        @JvmField
        var sizeConstraints: Any? = null

        /**
         * [sizeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<SizeConstraint>
         */
        fun sizeConstraints(value: List<SizeConstraint>) {
          this.sizeConstraints = value
        }
        
        /**
         * [sizeConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<SizeConstraint>
         */
        fun sizeConstraints(vararg value: IntrinsicFunction) {
          this.sizeConstraints = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class FieldToMatch(
            /**
             * [Data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-data)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val data: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class SizeConstraint(
            /**
             * [ComparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val comparisonOperator: String,
            /**
             * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-fieldtomatch)
             *
             * _Required_: yes
             *
             * _Type_: FieldToMatch
             */
            val fieldToMatch: FieldToMatch,
            /**
             * [Size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val size: Int,
            /**
             * [TextTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val textTransformation: String
    )

}

/**
 * [AWS::WAFRegional::SizeConstraintSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html)
 */
fun Resources.awsWAFRegionalSizeConstraintSet(logicalId: String, init: AWSWAFRegionalSizeConstraintSet.() -> Unit = {}): AWSWAFRegionalSizeConstraintSet {
    return AWSWAFRegionalSizeConstraintSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
