
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html)
 */
@CloudFormationMarker
class AWSWAFRegionalIPSet(logicalId: String) : Resource<AWSWAFRegionalIPSet.Properties>(logicalId, "AWS::WAFRegional::IPSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [iPSetDescriptors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
         *
         * _Required_: no
         *
         * _Type_: List<IPSetDescriptor>
         */
        @JvmField
        var iPSetDescriptors: Any? = null

        /**
         * [iPSetDescriptors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
         *
         * _Required_: no
         *
         * _Type_: List<IPSetDescriptor>
         */
        fun iPSetDescriptors(value: List<IPSetDescriptor>) {
          this.iPSetDescriptors = value
        }
        
        /**
         * [iPSetDescriptors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
         *
         * _Required_: no
         *
         * _Type_: List<IPSetDescriptor>
         */
        fun iPSetDescriptors(vararg value: IntrinsicFunction) {
          this.iPSetDescriptors = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
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


    class IPSetDescriptor(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html#cfn-wafregional-ipset-ipsetdescriptor-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html#cfn-wafregional-ipset-ipsetdescriptor-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

}

/**
 * [AWS::WAFRegional::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html)
 */
fun Resources.awsWAFRegionalIPSet(logicalId: String, init: AWSWAFRegionalIPSet.() -> Unit = {}): AWSWAFRegionalIPSet {
    return AWSWAFRegionalIPSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
