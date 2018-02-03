
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class FieldToMatch(
            /**
             * [Data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-data)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val data: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-fieldtomatch.html#cfn-wafregional-xssmatchset-fieldtomatch-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class XssMatchTuple(
            /**
             * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-fieldtomatch)
             *
             * _Required_: yes
             *
             * _Type_: FieldToMatch
             */
            val fieldToMatch: FieldToMatch,
            /**
             * [TextTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val textTransformation: String
    )

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
