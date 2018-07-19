
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

        /**
        * [ByteMatchTuple](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html)
        */
        fun byteMatchTuple(init: ByteMatchTuple.() -> Unit = {}): ByteMatchTuple {
            return ByteMatchTuple().also {
                it.init()
            }
        }
        /**
        * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html)
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
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        var fieldToMatch: Any? = null

        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: FieldToMatch) {
          this.fieldToMatch = value
        }
        
        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: IntrinsicFunction) {
          this.fieldToMatch = value
        }

        /**
         * [positionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var positionalConstraint: Any? = null

        /**
         * [positionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun positionalConstraint(value: String) {
          this.positionalConstraint = value
        }
        
        /**
         * [positionalConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun positionalConstraint(value: IntrinsicFunction) {
          this.positionalConstraint = value
        }

        /**
         * [targetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var targetString: Any? = null

        /**
         * [targetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetString(value: String) {
          this.targetString = value
        }
        
        /**
         * [targetString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetString(value: IntrinsicFunction) {
          this.targetString = value
        }

        /**
         * [targetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var targetStringBase64: Any? = null

        /**
         * [targetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetStringBase64(value: String) {
          this.targetStringBase64 = value
        }
        
        /**
         * [targetStringBase64](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetStringBase64(value: IntrinsicFunction) {
          this.targetStringBase64 = value
        }

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var textTransformation: Any? = null

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: String) {
          this.textTransformation = value
        }
        
        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation)
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
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var data: Any? = null

        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: String) {
          this.data = value
        }
        
        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: IntrinsicFunction) {
          this.data = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-bytematchset-bytematchtuples-fieldtomatch-type)
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
 * [AWS::WAF::ByteMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html)
 */
fun Resources.awsWAFByteMatchSet(logicalId: String, init: AWSWAFByteMatchSet.() -> Unit = {}): AWSWAFByteMatchSet {
    return AWSWAFByteMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
