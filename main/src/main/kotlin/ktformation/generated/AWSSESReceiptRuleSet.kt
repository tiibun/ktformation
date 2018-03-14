
package ktformation.generated

import ktformation.*

/**
 * [AWS::SES::ReceiptRuleSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
 */
@CloudFormationMarker
class AWSSESReceiptRuleSet(logicalId: String) : Resource<AWSSESReceiptRuleSet.Properties>(logicalId, "AWS::SES::ReceiptRuleSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [ruleSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ruleSetName: Any? = null

        /**
         * [ruleSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ruleSetName(value: String) {
          this.ruleSetName = value
        }
        
        /**
         * [ruleSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ruleSetName(value: IntrinsicFunction) {
          this.ruleSetName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::SES::ReceiptRuleSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
 */
fun Resources.awsSESReceiptRuleSet(logicalId: String, init: AWSSESReceiptRuleSet.() -> Unit = {}): AWSSESReceiptRuleSet {
    return AWSSESReceiptRuleSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
