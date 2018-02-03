
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConfigurationOptionSetting(
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-namespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namespace: String,
            /**
             * [OptionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-optionname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val optionName: String,
            /**
             * [ResourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-resourcename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceName: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-configurationoptionsetting.html#cfn-elasticbeanstalk-configurationtemplate-configurationoptionsetting-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class SourceConfiguration(
            /**
             * [ApplicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-applicationname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val applicationName: String,
            /**
             * [TemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-configurationtemplate-sourceconfiguration.html#cfn-elasticbeanstalk-configurationtemplate-sourceconfiguration-templatename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val templateName: String
    )

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
