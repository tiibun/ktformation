
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html)
 */
@CloudFormationMarker
class AWSWAFIPSet(logicalId: String) : Resource<AWSWAFIPSet.Properties>(logicalId, "AWS::WAF::IPSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [iPSetDescriptors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * _Required_: no
         *
         * _Type_: List<IPSetDescriptor>
         */
        @JvmField
        var iPSetDescriptors: Any? = null

        /**
         * [iPSetDescriptors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * _Required_: no
         *
         * _Type_: List<IPSetDescriptor>
         */
        fun iPSetDescriptors(value: List<IPSetDescriptor>) {
          this.iPSetDescriptors = value
        }
        
        /**
         * [iPSetDescriptors](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
         *
         * _Required_: no
         *
         * _Type_: List<IPSetDescriptor>
         */
        fun iPSetDescriptors(vararg value: IntrinsicFunction) {
          this.iPSetDescriptors = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
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
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

}

/**
 * [AWS::WAF::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html)
 */
fun Resources.awsWAFIPSet(logicalId: String, init: AWSWAFIPSet.() -> Unit = {}): AWSWAFIPSet {
    return AWSWAFIPSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
