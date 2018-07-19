
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::XssMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalXssMatchSet(logicalId: String) : Resource<AWSWAFRegionalXssMatchSet.Properties>(logicalId, "AWS::WAFRegional::XssMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [xssMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<XssMatchTuple>
         */
        @JvmField
        var xssMatchTuples: Any? = null

        /**
         * [xssMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<XssMatchTuple>
         */
        fun xssMatchTuples(value: List<XssMatchTuple>) {
          this.xssMatchTuples = value
        }
        
        /**
         * [xssMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<XssMatchTuple>
         */
        fun xssMatchTuples(vararg value: IntrinsicFunction) {
          this.xssMatchTuples = value
        }

        /**
        * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html)
        */
        fun fieldToMatch(init: FieldToMatch.() -> Unit = {}): FieldToMatch {
            return FieldToMatch().also {
                it.init()
            }
        }
        /**
        * [XssMatchTuple](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html)
        */
        fun xssMatchTuple(init: XssMatchTuple.() -> Unit = {}): XssMatchTuple {
            return XssMatchTuple().also {
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
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var data: Any? = null

        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: String) {
          this.data = value
        }
        
        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: IntrinsicFunction) {
          this.data = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-type)
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
    class XssMatchTuple {
            /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        var fieldToMatch: Any? = null

        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: FieldToMatch) {
          this.fieldToMatch = value
        }
        
        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: IntrinsicFunction) {
          this.fieldToMatch = value
        }

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var textTransformation: Any? = null

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: String) {
          this.textTransformation = value
        }
        
        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation)
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
 * [AWS::WAFRegional::XssMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html)
 */
fun Resources.awsWAFRegionalXssMatchSet(logicalId: String, init: AWSWAFRegionalXssMatchSet.() -> Unit = {}): AWSWAFRegionalXssMatchSet {
    return AWSWAFRegionalXssMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
