
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::AggregationAuthorization - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
 */
@CloudFormationMarker
class AWSConfigAggregationAuthorization(logicalId: String) : Resource<AWSConfigAggregationAuthorization.Properties>(logicalId, "AWS::Config::AggregationAuthorization") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [authorizedAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var authorizedAccountId: Any? = null

        /**
         * [authorizedAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authorizedAccountId(value: String) {
          this.authorizedAccountId = value
        }
        
        /**
         * [authorizedAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authorizedAccountId(value: IntrinsicFunction) {
          this.authorizedAccountId = value
        }

        /**
         * [authorizedAwsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var authorizedAwsRegion: Any? = null

        /**
         * [authorizedAwsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authorizedAwsRegion(value: String) {
          this.authorizedAwsRegion = value
        }
        
        /**
         * [authorizedAwsRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun authorizedAwsRegion(value: IntrinsicFunction) {
          this.authorizedAwsRegion = value
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
 * [AWS::Config::AggregationAuthorization - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
 */
fun Resources.awsConfigAggregationAuthorization(logicalId: String, init: AWSConfigAggregationAuthorization.() -> Unit = {}): AWSConfigAggregationAuthorization {
    return AWSConfigAggregationAuthorization(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
