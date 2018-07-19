
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

        /**
        * [ByteMatchTuple](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html)
        */
        fun byteMatchTuple(init: ByteMatchTuple.() -> Unit = {}): ByteMatchTuple {
            return ByteMatchTuple().also {
                it.init()
            }
        }
        /**
        * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html)
        */
        fun fieldToMatch(init: FieldToMatch.() -> Unit = {}): FieldToMatch {
            return FieldToMatch().also {
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
    class ByteMatchTuple {
            /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        var fieldToMatch: Any? = null

        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: FieldToMatch) {
          this.fieldToMatch = value
        }
        
        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: IntrinsicFunction) {
          this.fieldToMatch = value
        }

        /**
         * [positionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-positionalconstraint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var positionalConstraint: Any? = null

        /**
         * [positionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-positionalconstraint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun positionalConstraint(value: String) {
          this.positionalConstraint = value
        }
        
        /**
         * [positionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-positionalconstraint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun positionalConstraint(value: IntrinsicFunction) {
          this.positionalConstraint = value
        }

        /**
         * [targetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var targetString: Any? = null

        /**
         * [targetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetString(value: String) {
          this.targetString = value
        }
        
        /**
         * [targetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetString(value: IntrinsicFunction) {
          this.targetString = value
        }

        /**
         * [targetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstringbase64)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var targetStringBase64: Any? = null

        /**
         * [targetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstringbase64)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetStringBase64(value: String) {
          this.targetStringBase64 = value
        }
        
        /**
         * [targetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-targetstringbase64)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetStringBase64(value: IntrinsicFunction) {
          this.targetStringBase64 = value
        }

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var textTransformation: Any? = null

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: String) {
          this.textTransformation = value
        }
        
        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-bytematchtuple.html#cfn-wafregional-bytematchset-bytematchtuple-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: IntrinsicFunction) {
          this.textTransformation = value
        }

    }

    @CloudFormationMarker
    class FieldToMatch {
            /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var data: Any? = null

        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: String) {
          this.data = value
        }
        
        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: IntrinsicFunction) {
          this.data = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html#cfn-wafregional-bytematchset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

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
