
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html)
 */
@CloudFormationMarker
class AWSWAFByteMatchSet(logicalId: String) : Resource<AWSWAFByteMatchSet.Properties>(logicalId, "AWS::WAF::ByteMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [byteMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<ByteMatchTuple>
         */
        @JvmField
        var byteMatchTuples: Any? = null

        /**
         * [byteMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<ByteMatchTuple>
         */
        fun byteMatchTuples(value: List<ByteMatchTuple>) {
          this.byteMatchTuples = value
        }
        
        /**
         * [byteMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<ByteMatchTuple>
         */
        fun byteMatchTuples(vararg value: IntrinsicFunction) {
          this.byteMatchTuples = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
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
             * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch)
             *
             * _Required_: yes
             *
             * _Type_: FieldToMatch
             */
            val fieldToMatch: FieldToMatch,
            /**
             * [PositionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val positionalConstraint: String,
            /**
             * [TargetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val targetString: String? = null,
            /**
             * [TargetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val targetStringBase64: String? = null,
            /**
             * [TextTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val textTransformation: String
    )

    class FieldToMatch(
            /**
             * [Data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-data)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val data: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

}

/**
 * [AWS::WAF::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html)
 */
fun Resources.awsWAFByteMatchSet(logicalId: String, init: AWSWAFByteMatchSet.() -> Unit = {}): AWSWAFByteMatchSet {
    return AWSWAFByteMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
