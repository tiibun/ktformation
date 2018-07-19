
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::ConfigurationTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkConfigurationTemplate(logicalId: String) : Resource<AWSElasticBeanstalkConfigurationTemplate.Properties>(logicalId, "AWS::ElasticBeanstalk::ConfigurationTemplate") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [environmentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var environmentId: Any? = null

        /**
         * [environmentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun environmentId(value: String) {
          this.environmentId = value
        }
        
        /**
         * [environmentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-environmentid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun environmentId(value: IntrinsicFunction) {
          this.environmentId = value
        }

        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<ConfigurationOptionSetting>
         */
        @JvmField
        var optionSettings: Any? = null

        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<ConfigurationOptionSetting>
         */
        fun optionSettings(value: List<ConfigurationOptionSetting>) {
          this.optionSettings = value
        }
        
        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<ConfigurationOptionSetting>
         */
        fun optionSettings(vararg value: IntrinsicFunction) {
          this.optionSettings = value
        }

        /**
         * [platformArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var platformArn: Any? = null

        /**
         * [platformArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun platformArn(value: String) {
          this.platformArn = value
        }
        
        /**
         * [platformArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-platformarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun platformArn(value: IntrinsicFunction) {
          this.platformArn = value
        }

        /**
         * [solutionStackName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var solutionStackName: Any? = null

        /**
         * [solutionStackName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun solutionStackName(value: String) {
          this.solutionStackName = value
        }
        
        /**
         * [solutionStackName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-solutionstackname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun solutionStackName(value: IntrinsicFunction) {
          this.solutionStackName = value
        }

        /**
         * [sourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SourceConfiguration
         */
        @JvmField
        var sourceConfiguration: Any? = null

        /**
         * [sourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SourceConfiguration
         */
        fun sourceConfiguration(value: SourceConfiguration) {
          this.sourceConfiguration = value
        }
        
        /**
         * [sourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SourceConfiguration
         */
        fun sourceConfiguration(value: IntrinsicFunction) {
          this.sourceConfiguration = value
        }

        /**
        * [ConfigurationOptionSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html)
        */
        fun configurationOptionSetting(init: ConfigurationOptionSetting.() -> Unit = {}): ConfigurationOptionSetting {
            return ConfigurationOptionSetting().also {
                it.init()
            }
        }
        /**
        * [SourceConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html)
        */
        fun sourceConfiguration(init: SourceConfiguration.() -> Unit = {}): SourceConfiguration {
            return SourceConfiguration().also {
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
    class ConfigurationOptionSetting {
            /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var optionName: Any? = null

        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionName(value: String) {
          this.optionName = value
        }
        
        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionName(value: IntrinsicFunction) {
          this.optionName = value
        }

        /**
         * [resourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceName: Any? = null

        /**
         * [resourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceName(value: String) {
          this.resourceName = value
        }
        
        /**
         * [resourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceName(value: IntrinsicFunction) {
          this.resourceName = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class SourceConfiguration {
            /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }

        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var templateName: Any? = null

        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun templateName(value: String) {
          this.templateName = value
        }
        
        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun templateName(value: IntrinsicFunction) {
          this.templateName = value
        }

    }

}

/**
 * [AWS::ElasticBeanstalk::ConfigurationTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html)
 */
fun Resources.awsElasticBeanstalkConfigurationTemplate(logicalId: String, init: AWSElasticBeanstalkConfigurationTemplate.() -> Unit = {}): AWSElasticBeanstalkConfigurationTemplate {
    return AWSElasticBeanstalkConfigurationTemplate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
