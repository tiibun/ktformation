
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAFRegional::WebACLAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
 */
@CloudFormationMarker
class AWSWAFRegionalWebACLAssociation(logicalId: String) : Resource<AWSWAFRegionalWebACLAssociation.Properties>(logicalId, "AWS::WAFRegional::WebACLAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [resourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceArn: Any? = null

        /**
         * [resourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceArn(value: String) {
          this.resourceArn = value
        }
        
        /**
         * [resourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceArn(value: IntrinsicFunction) {
          this.resourceArn = value
        }
        
        /**
         * [webACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var webACLId: Any? = null

        /**
         * [webACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun webACLId(value: String) {
          this.webACLId = value
        }
        
        /**
         * [webACLId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun webACLId(value: IntrinsicFunction) {
          this.webACLId = value
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
 * [AWS::WAFRegional::WebACLAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html)
 */
fun Resources.awsWAFRegionalWebACLAssociation(logicalId: String, init: AWSWAFRegionalWebACLAssociation.() -> Unit = {}): AWSWAFRegionalWebACLAssociation {
    return AWSWAFRegionalWebACLAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
