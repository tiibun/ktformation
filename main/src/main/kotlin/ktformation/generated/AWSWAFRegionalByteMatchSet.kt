
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalByteMatchSet(logicalId: String) : Resource<AWSWAFRegionalByteMatchSet.Properties>(logicalId, "AWS::WAFRegional::ByteMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [byteMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<ByteMatchTuple>
         */
        @JvmField
        var byteMatchTuples: Any? = null

        /**
         * [byteMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<ByteMatchTuple>
         */
        fun byteMatchTuples(value: List<ByteMatchTuple>) {
          this.byteMatchTuples = value
        }
        
        /**
         * [byteMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<ByteMatchTuple>
         */
        fun byteMatchTuples(vararg value: IntrinsicFunction) {
          this.byteMatchTuples = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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
            /**
             * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-fieldtomatch)
             *
             * _Required_: yes
             *
             * _Type_: FieldToMatch
             */
            val fieldToMatch: FieldToMatch,
            /**
             * [PositionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-positionalconstraint)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val positionalConstraint: String,
            /**
             * [TargetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstring)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val targetString: String? = null,
            /**
             * [TargetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstringbase64)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val targetStringBase64: String? = null,
            /**
             * [TextTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-texttransformation)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val textTransformation: String
    )

    class FieldToMatch(
            /**
             * [Data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-data)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val data: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

}

/**
 * [AWS::WAFRegional::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html)
 */
fun Resources.awsWAFRegionalByteMatchSet(logicalId: String, init: AWSWAFRegionalByteMatchSet.() -> Unit = {}): AWSWAFRegionalByteMatchSet {
    return AWSWAFRegionalByteMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
