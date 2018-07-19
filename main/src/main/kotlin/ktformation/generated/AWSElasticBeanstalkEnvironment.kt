
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

        /**
        * [OptionSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html)
        */
        fun optionSetting(init: OptionSetting.() -> Unit = {}): OptionSetting {
            return OptionSetting().also {
                it.init()
            }
        }
        /**
        * [Tier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html)
        */
        fun tier(init: Tier.() -> Unit = {}): Tier {
            return Tier().also {
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
    class OptionSetting {
            /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namespace: Any? = null

        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: String) {
          this.namespace = value
        }
        
        /**
         * [namespace](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-namespace)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespace(value: IntrinsicFunction) {
          this.namespace = value
        }

        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var optionName: Any? = null

        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionName(value: String) {
          this.optionName = value
        }
        
        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionName(value: IntrinsicFunction) {
          this.optionName = value
        }

        /**
         * [resourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourceName: Any? = null

        /**
         * [resourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceName(value: String) {
          this.resourceName = value
        }
        
        /**
         * [resourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-elasticbeanstalk-environment-optionsetting-resourcename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourceName(value: IntrinsicFunction) {
          this.resourceName = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-option-settings.html#cfn-beanstalk-optionsettings-value)
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
    class Tier {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html#cfn-beanstalk-env-tier-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

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
