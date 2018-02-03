
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::XssMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html)
 */
@CloudFormationMarker
class AWSWAFXssMatchSet(logicalId: String) : Resource<AWSWAFXssMatchSet.Properties>(logicalId, "AWS::WAF::XssMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [xssMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
         *
         * _Required_: yes
         *
         * _Type_: List<XssMatchTuple>
         */
        @JvmField
        var xssMatchTuples: Any? = null

        /**
         * [xssMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
         *
         * _Required_: yes
         *
         * _Type_: List<XssMatchTuple>
         */
        fun xssMatchTuples(value: List<XssMatchTuple>) {
          this.xssMatchTuples = value
        }
        
        /**
         * [xssMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
         *
         * _Required_: yes
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
             * [Data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-xssmatchtuple-fieldtomatch.html#cfn-waf-xssmatchset-xssmatchtuple-fieldtomatch-data)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val data: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-xssmatchtuple-fieldtomatch.html#cfn-waf-xssmatchset-xssmatchtuple-fieldtomatch-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class XssMatchTuple(
            /**
             * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-xssmatchtuple.html#cfn-waf-xssmatchset-xssmatchtuple-fieldtomatch)
             *
             * _Required_: yes
             *
             * _Type_: FieldToMatch
             */
            val fieldToMatch: FieldToMatch,
            /**
             * [TextTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-xssmatchtuple.html#cfn-waf-xssmatchset-xssmatchtuple-texttransformation)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val textTransformation: String
    )

}

/**
 * [AWS::WAF::XssMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html)
 */
fun Resources.awsWAFXssMatchSet(logicalId: String, init: AWSWAFXssMatchSet.() -> Unit = {}): AWSWAFXssMatchSet {
    return AWSWAFXssMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
