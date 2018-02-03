
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkApplication(logicalId: String) : Resource<AWSElasticBeanstalkApplication.Properties>(logicalId, "AWS::ElasticBeanstalk::Application") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var applicationName: Any? = null

        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var resourceLifecycleConfig: Any? = null

        fun resourceLifecycleConfig(value: ApplicationResourceLifecycleConfig) {
          this.resourceLifecycleConfig = value
        }
        
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
            val serviceRole: String? = null,
            val versionLifecycleConfig: ApplicationVersionLifecycleConfig? = null
    )

    class ApplicationVersionLifecycleConfig(
            val maxAgeRule: MaxAgeRule? = null,
            val maxCountRule: MaxCountRule? = null
    )

    class MaxAgeRule(
            val deleteSourceFromS3: Boolean? = null,
            val enabled: Boolean? = null,
            val maxAgeInDays: Int? = null
    )

    class MaxCountRule(
            val deleteSourceFromS3: Boolean? = null,
            val enabled: Boolean? = null,
            val maxCount: Int? = null
    )

}

fun Resources.awsElasticBeanstalkApplication(logicalId: String, init: AWSElasticBeanstalkApplication.() -> Unit = {}): AWSElasticBeanstalkApplication {
    return AWSElasticBeanstalkApplication(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
