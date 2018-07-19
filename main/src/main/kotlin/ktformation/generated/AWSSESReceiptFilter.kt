
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

        /**
        * [Filter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html)
        */
        fun filter(init: Filter.() -> Unit = {}): Filter {
            return Filter().also {
                it.init()
            }
        }
        /**
        * [IpFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html)
        */
        fun ipFilter(init: IpFilter.() -> Unit = {}): IpFilter {
            return IpFilter().also {
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
    class Filter {
            /**
         * [ipFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-ipfilter)
         *
         * _Required_: yes
         *
         * _Type_: IpFilter
         */
        var ipFilter: Any? = null

        /**
         * [ipFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-ipfilter)
         *
         * _Required_: yes
         *
         * _Type_: IpFilter
         */
        fun ipFilter(value: IpFilter) {
          this.ipFilter = value
        }
        
        /**
         * [ipFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-ipfilter)
         *
         * _Required_: yes
         *
         * _Type_: IpFilter
         */
        fun ipFilter(value: IntrinsicFunction) {
          this.ipFilter = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class IpFilter {
            /**
         * [cidr](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var cidr: Any? = null

        /**
         * [cidr](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidr(value: String) {
          this.cidr = value
        }
        
        /**
         * [cidr](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidr(value: IntrinsicFunction) {
          this.cidr = value
        }

        /**
         * [policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var policy: Any? = null

        /**
         * [policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policy(value: String) {
          this.policy = value
        }
        
        /**
         * [policy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policy(value: IntrinsicFunction) {
          this.policy = value
        }

    }

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
