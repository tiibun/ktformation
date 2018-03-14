
package ktformation.generated

import ktformation.*

/**
 * [AWS::SES::ReceiptFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html)
 */
@CloudFormationMarker
class AWSSESReceiptFilter(logicalId: String) : Resource<AWSSESReceiptFilter.Properties>(logicalId, "AWS::SES::ReceiptFilter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
         *
         * _Required_: yes
         *
         * _Type_: Filter
         */
        @JvmField
        var filter: Any? = null

        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
         *
         * _Required_: yes
         *
         * _Type_: Filter
         */
        fun filter(value: Filter) {
          this.filter = value
        }
        
        /**
         * [filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
         *
         * _Required_: yes
         *
         * _Type_: Filter
         */
        fun filter(value: IntrinsicFunction) {
          this.filter = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Filter(
            /**
             * [IpFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-ipfilter)
             *
             * _Required_: yes
             *
             * _Type_: IpFilter
             */
            val ipFilter: IpFilter,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class IpFilter(
            /**
             * [Cidr](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val cidr: String,
            /**
             * [Policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val policy: String
    )

}

/**
 * [AWS::SES::ReceiptFilter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html)
 */
fun Resources.awsSESReceiptFilter(logicalId: String, init: AWSSESReceiptFilter.() -> Unit = {}): AWSSESReceiptFilter {
    return AWSSESReceiptFilter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
