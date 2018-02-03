
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ApplicationResourceLifecycleConfig(
            /**
             * [ServiceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serviceRole: String? = null,
            /**
             * [VersionLifecycleConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-versionlifecycleconfig)
             *
             * _Required_: no
             *
             * _Type_: ApplicationVersionLifecycleConfig
             */
            val versionLifecycleConfig: ApplicationVersionLifecycleConfig? = null
    )

    class ApplicationVersionLifecycleConfig(
            /**
             * [MaxAgeRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxagerule)
             *
             * _Required_: no
             *
             * _Type_: MaxAgeRule
             */
            val maxAgeRule: MaxAgeRule? = null,
            /**
             * [MaxCountRule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxcountrule)
             *
             * _Required_: no
             *
             * _Type_: MaxCountRule
             */
            val maxCountRule: MaxCountRule? = null
    )

    class MaxAgeRule(
            /**
             * [DeleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteSourceFromS3: Boolean? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [MaxAgeInDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val maxAgeInDays: Int? = null
    )

    class MaxCountRule(
            /**
             * [DeleteSourceFromS3](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val deleteSourceFromS3: Boolean? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [MaxCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val maxCount: Int? = null
    )

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
