
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

        /**
        * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html)
        */
        fun fieldToMatch(init: FieldToMatch.() -> Unit = {}): FieldToMatch {
            return FieldToMatch().also {
                it.init()
            }
        }
        /**
        * [SizeConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html)
        */
        fun sizeConstraint(init: SizeConstraint.() -> Unit = {}): SizeConstraint {
            return SizeConstraint().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class FieldToMatch {
            /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var data: Any? = null

        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: String) {
          this.data = value
        }
        
        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: IntrinsicFunction) {
          this.data = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-fieldtomatch.html#cfn-wafregional-sizeconstraintset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class SizeConstraint {
            /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var comparisonOperator: Any? = null

        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: String) {
          this.comparisonOperator = value
        }
        
        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: IntrinsicFunction) {
          this.comparisonOperator = value
        }

        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        var fieldToMatch: Any? = null

        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: FieldToMatch) {
          this.fieldToMatch = value
        }
        
        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: IntrinsicFunction) {
          this.fieldToMatch = value
        }

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var size: Any? = null

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun size(value: Int) {
          this.size = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun size(value: IntrinsicFunction) {
          this.size = value
        }

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var textTransformation: Any? = null

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: String) {
          this.textTransformation = value
        }
        
        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: IntrinsicFunction) {
          this.textTransformation = value
        }

    }

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
