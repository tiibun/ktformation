
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkApplication(logicalId: String) : Resource<AWSElasticBeanstalkApplication.Properties>(logicalId, "AWS::ElasticBeanstalk::Application") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [resourceLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: ApplicationResourceLifecycleConfig
         */
        @JvmField
        var resourceLifecycleConfig: Any? = null

        /**
         * [resourceLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: ApplicationResourceLifecycleConfig
         */
        fun resourceLifecycleConfig(value: ApplicationResourceLifecycleConfig) {
          this.resourceLifecycleConfig = value
        }
        
        /**
         * [resourceLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: ApplicationResourceLifecycleConfig
         */
        fun resourceLifecycleConfig(value: IntrinsicFunction) {
          this.resourceLifecycleConfig = value
        }

        /**
        * [ApplicationResourceLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
        */
        fun applicationResourceLifecycleConfig(init: ApplicationResourceLifecycleConfig.() -> Unit = {}): ApplicationResourceLifecycleConfig {
            return ApplicationResourceLifecycleConfig().also {
                it.init()
            }
        }
        /**
        * [ApplicationVersionLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
        */
        fun applicationVersionLifecycleConfig(init: ApplicationVersionLifecycleConfig.() -> Unit = {}): ApplicationVersionLifecycleConfig {
            return ApplicationVersionLifecycleConfig().also {
                it.init()
            }
        }
        /**
        * [MaxAgeRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html)
        */
        fun maxAgeRule(init: MaxAgeRule.() -> Unit = {}): MaxAgeRule {
            return MaxAgeRule().also {
                it.init()
            }
        }
        /**
        * [MaxCountRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html)
        */
        fun maxCountRule(init: MaxCountRule.() -> Unit = {}): MaxCountRule {
            return MaxCountRule().also {
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
    class ApplicationResourceLifecycleConfig {
            /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serviceRole: Any? = null

        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceRole(value: String) {
          this.serviceRole = value
        }
        
        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceRole(value: IntrinsicFunction) {
          this.serviceRole = value
        }

        /**
         * [versionLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-versionlifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: ApplicationVersionLifecycleConfig
         */
        var versionLifecycleConfig: Any? = null

        /**
         * [versionLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-versionlifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: ApplicationVersionLifecycleConfig
         */
        fun versionLifecycleConfig(value: ApplicationVersionLifecycleConfig) {
          this.versionLifecycleConfig = value
        }
        
        /**
         * [versionLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-versionlifecycleconfig)
         *
         * _Required_: no
         *
         * _Type_: ApplicationVersionLifecycleConfig
         */
        fun versionLifecycleConfig(value: IntrinsicFunction) {
          this.versionLifecycleConfig = value
        }

    }

    @CloudFormationMarker
    class ApplicationVersionLifecycleConfig {
            /**
         * [maxAgeRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxagerule)
         *
         * _Required_: no
         *
         * _Type_: MaxAgeRule
         */
        var maxAgeRule: Any? = null

        /**
         * [maxAgeRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxagerule)
         *
         * _Required_: no
         *
         * _Type_: MaxAgeRule
         */
        fun maxAgeRule(value: MaxAgeRule) {
          this.maxAgeRule = value
        }
        
        /**
         * [maxAgeRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxagerule)
         *
         * _Required_: no
         *
         * _Type_: MaxAgeRule
         */
        fun maxAgeRule(value: IntrinsicFunction) {
          this.maxAgeRule = value
        }

        /**
         * [maxCountRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxcountrule)
         *
         * _Required_: no
         *
         * _Type_: MaxCountRule
         */
        var maxCountRule: Any? = null

        /**
         * [maxCountRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxcountrule)
         *
         * _Required_: no
         *
         * _Type_: MaxCountRule
         */
        fun maxCountRule(value: MaxCountRule) {
          this.maxCountRule = value
        }
        
        /**
         * [maxCountRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxcountrule)
         *
         * _Required_: no
         *
         * _Type_: MaxCountRule
         */
        fun maxCountRule(value: IntrinsicFunction) {
          this.maxCountRule = value
        }

    }

    @CloudFormationMarker
    class MaxAgeRule {
            /**
         * [deleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteSourceFromS3: Any? = null

        /**
         * [deleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteSourceFromS3(value: Boolean) {
          this.deleteSourceFromS3 = value
        }
        
        /**
         * [deleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteSourceFromS3(value: IntrinsicFunction) {
          this.deleteSourceFromS3 = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [maxAgeInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var maxAgeInDays: Any? = null

        /**
         * [maxAgeInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxAgeInDays(value: Int) {
          this.maxAgeInDays = value
        }
        
        /**
         * [maxAgeInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxAgeInDays(value: IntrinsicFunction) {
          this.maxAgeInDays = value
        }

    }

    @CloudFormationMarker
    class MaxCountRule {
            /**
         * [deleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var deleteSourceFromS3: Any? = null

        /**
         * [deleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteSourceFromS3(value: Boolean) {
          this.deleteSourceFromS3 = value
        }
        
        /**
         * [deleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun deleteSourceFromS3(value: IntrinsicFunction) {
          this.deleteSourceFromS3 = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [maxCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var maxCount: Any? = null

        /**
         * [maxCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxCount(value: Int) {
          this.maxCount = value
        }
        
        /**
         * [maxCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxCount(value: IntrinsicFunction) {
          this.maxCount = value
        }

    }

}

/**
 * [AWS::ElasticBeanstalk::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html)
 */
fun Resources.awsElasticBeanstalkApplication(logicalId: String, init: AWSElasticBeanstalkApplication.() -> Unit = {}): AWSElasticBeanstalkApplication {
    return AWSElasticBeanstalkApplication(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
