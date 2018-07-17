
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::ConfigurationAggregator - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html)
 */
@CloudFormationMarker
class AWSConfigConfigurationAggregator(logicalId: String) : Resource<AWSConfigConfigurationAggregator.Properties>(logicalId, "AWS::Config::ConfigurationAggregator") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [accountAggregationSources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
         *
         * _Required_: no
         *
         * _Type_: List<AccountAggregationSource>
         */
        @JvmField
        var accountAggregationSources: Any? = null

        /**
         * [accountAggregationSources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
         *
         * _Required_: no
         *
         * _Type_: List<AccountAggregationSource>
         */
        fun accountAggregationSources(value: List<AccountAggregationSource>) {
          this.accountAggregationSources = value
        }
        
        /**
         * [accountAggregationSources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
         *
         * _Required_: no
         *
         * _Type_: List<AccountAggregationSource>
         */
        fun accountAggregationSources(vararg value: IntrinsicFunction) {
          this.accountAggregationSources = value
        }
        
        /**
         * [configurationAggregatorName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var configurationAggregatorName: Any? = null

        /**
         * [configurationAggregatorName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun configurationAggregatorName(value: String) {
          this.configurationAggregatorName = value
        }
        
        /**
         * [configurationAggregatorName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun configurationAggregatorName(value: IntrinsicFunction) {
          this.configurationAggregatorName = value
        }
        
        /**
         * [organizationAggregationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
         *
         * _Required_: no
         *
         * _Type_: OrganizationAggregationSource
         */
        @JvmField
        var organizationAggregationSource: Any? = null

        /**
         * [organizationAggregationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
         *
         * _Required_: no
         *
         * _Type_: OrganizationAggregationSource
         */
        fun organizationAggregationSource(value: OrganizationAggregationSource) {
          this.organizationAggregationSource = value
        }
        
        /**
         * [organizationAggregationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
         *
         * _Required_: no
         *
         * _Type_: OrganizationAggregationSource
         */
        fun organizationAggregationSource(value: IntrinsicFunction) {
          this.organizationAggregationSource = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AccountAggregationSource(
            /**
             * [AccountIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val accountIds: List<String>,
            /**
             * [AllAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val allAwsRegions: Boolean? = null,
            /**
             * [AwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val awsRegions: List<String>? = null
    )

    class OrganizationAggregationSource(
            /**
             * [AllAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val allAwsRegions: Boolean? = null,
            /**
             * [AwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val awsRegions: List<String>? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String
    )

}

/**
 * [AWS::Config::ConfigurationAggregator - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html)
 */
fun Resources.awsConfigConfigurationAggregator(logicalId: String, init: AWSConfigConfigurationAggregator.() -> Unit = {}): AWSConfigConfigurationAggregator {
    return AWSConfigConfigurationAggregator(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
