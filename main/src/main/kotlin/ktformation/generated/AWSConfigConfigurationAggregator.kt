
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

        /**
        * [AccountAggregationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html)
        */
        fun accountAggregationSource(init: AccountAggregationSource.() -> Unit = {}): AccountAggregationSource {
            return AccountAggregationSource().also {
                it.init()
            }
        }
        /**
        * [OrganizationAggregationSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html)
        */
        fun organizationAggregationSource(init: OrganizationAggregationSource.() -> Unit = {}): OrganizationAggregationSource {
            return OrganizationAggregationSource().also {
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
    class AccountAggregationSource {
            /**
         * [accountIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var accountIds: Any? = null

        /**
         * [accountIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun accountIds(value: List<String>) {
          this.accountIds = value
        }
        
        /**
         * [accountIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun accountIds(vararg value: IntrinsicFunction) {
          this.accountIds = value
        }

        /**
         * [allAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var allAwsRegions: Any? = null

        /**
         * [allAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allAwsRegions(value: Boolean) {
          this.allAwsRegions = value
        }
        
        /**
         * [allAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allAwsRegions(value: IntrinsicFunction) {
          this.allAwsRegions = value
        }

        /**
         * [awsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var awsRegions: Any? = null

        /**
         * [awsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun awsRegions(value: List<String>) {
          this.awsRegions = value
        }
        
        /**
         * [awsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun awsRegions(vararg value: IntrinsicFunction) {
          this.awsRegions = value
        }

    }

    @CloudFormationMarker
    class OrganizationAggregationSource {
            /**
         * [allAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var allAwsRegions: Any? = null

        /**
         * [allAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allAwsRegions(value: Boolean) {
          this.allAwsRegions = value
        }
        
        /**
         * [allAwsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allAwsRegions(value: IntrinsicFunction) {
          this.allAwsRegions = value
        }

        /**
         * [awsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var awsRegions: Any? = null

        /**
         * [awsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun awsRegions(value: List<String>) {
          this.awsRegions = value
        }
        
        /**
         * [awsRegions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun awsRegions(vararg value: IntrinsicFunction) {
          this.awsRegions = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

    }

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
