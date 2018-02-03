
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::Environment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkEnvironment(logicalId: String) : Resource<AWSElasticBeanstalkEnvironment.Properties>(logicalId, "AWS::ElasticBeanstalk::Environment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        /**
         * [cNAMEPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cNAMEPrefix: Any? = null

        /**
         * [cNAMEPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cNAMEPrefix(value: String) {
          this.cNAMEPrefix = value
        }
        
        /**
         * [cNAMEPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-cnameprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cNAMEPrefix(value: IntrinsicFunction) {
          this.cNAMEPrefix = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [environmentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var environmentName: Any? = null

        /**
         * [environmentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun environmentName(value: String) {
          this.environmentName = value
        }
        
        /**
         * [environmentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun environmentName(value: IntrinsicFunction) {
          this.environmentName = value
        }
        
        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<OptionSetting>
         */
        @JvmField
        var optionSettings: Any? = null

        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<OptionSetting>
         */
        fun optionSettings(value: List<OptionSetting>) {
          this.optionSettings = value
        }
        
        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<OptionSetting>
         */
        fun optionSettings(vararg value: IntrinsicFunction) {
          this.optionSettings = value
        }
        
        /**
         * [platformArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var platformArn: Any? = null

        /**
         * [platformArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun platformArn(value: String) {
          this.platformArn = value
        }
        
        /**
         * [platformArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun platformArn(value: IntrinsicFunction) {
          this.platformArn = value
        }
        
        /**
         * [solutionStackName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var solutionStackName: Any? = null

        /**
         * [solutionStackName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun solutionStackName(value: String) {
          this.solutionStackName = value
        }
        
        /**
         * [solutionStackName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-solutionstackname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun solutionStackName(value: IntrinsicFunction) {
          this.solutionStackName = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-elasticbeanstalk-environment-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var templateName: Any? = null

        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun templateName(value: String) {
          this.templateName = value
        }
        
        /**
         * [templateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-templatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun templateName(value: IntrinsicFunction) {
          this.templateName = value
        }
        
        /**
         * [tier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-tier)
         *
         * _Required_: no
         *
         * _Type_: Tier
         */
        @JvmField
        var tier: Any? = null

        /**
         * [tier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-tier)
         *
         * _Required_: no
         *
         * _Type_: Tier
         */
        fun tier(value: Tier) {
          this.tier = value
        }
        
        /**
         * [tier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-tier)
         *
         * _Required_: no
         *
         * _Type_: Tier
         */
        fun tier(value: IntrinsicFunction) {
          this.tier = value
        }
        
        /**
         * [versionLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var versionLabel: Any? = null

        /**
         * [versionLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun versionLabel(value: String) {
          this.versionLabel = value
        }
        
        /**
         * [versionLabel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-versionlabel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun versionLabel(value: IntrinsicFunction) {
          this.versionLabel = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class OptionSetting(
            /**
             * [Namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namespace: String,
            /**
             * [OptionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val optionName: String,
            /**
             * [ResourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourceName: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

    class Tier(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-version)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val version: String? = null
    )

}

/**
 * [AWS::ElasticBeanstalk::Environment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html)
 */
fun Resources.awsElasticBeanstalkEnvironment(logicalId: String, init: AWSElasticBeanstalkEnvironment.() -> Unit = {}): AWSElasticBeanstalkEnvironment {
    return AWSElasticBeanstalkEnvironment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
