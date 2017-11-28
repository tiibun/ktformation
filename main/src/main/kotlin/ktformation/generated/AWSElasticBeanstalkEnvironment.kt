
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::Environment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkEnvironment(logicalId: String) : Resource<AWSElasticBeanstalkEnvironment.Properties>(logicalId, "AWS::ElasticBeanstalk::Environment") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var applicationName: Any? = null
        fun applicationName(value: String) { this.applicationName = value }
        fun applicationName(value: IntrinsicFunction) { this.applicationName = value }
        @JvmField var cNAMEPrefix: Any? = null
        fun cNAMEPrefix(value: String?) { this.cNAMEPrefix = value }
        fun cNAMEPrefix(value: IntrinsicFunction) { this.cNAMEPrefix = value }
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var environmentName: Any? = null
        fun environmentName(value: String?) { this.environmentName = value }
        fun environmentName(value: IntrinsicFunction) { this.environmentName = value }
        @JvmField var optionSettings: Any? = null
        fun optionSettings(value: List<OptionSetting>?) { this.optionSettings = value }
        fun optionSettings(vararg value: IntrinsicFunction) { this.optionSettings = value }
        @JvmField var platformArn: Any? = null
        fun platformArn(value: String?) { this.platformArn = value }
        fun platformArn(value: IntrinsicFunction) { this.platformArn = value }
        @JvmField var solutionStackName: Any? = null
        fun solutionStackName(value: String?) { this.solutionStackName = value }
        fun solutionStackName(value: IntrinsicFunction) { this.solutionStackName = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var templateName: Any? = null
        fun templateName(value: String?) { this.templateName = value }
        fun templateName(value: IntrinsicFunction) { this.templateName = value }
        @JvmField var tier: Any? = null
        fun tier(value: Tier?) { this.tier = value }
        fun tier(value: IntrinsicFunction) { this.tier = value }
        @JvmField var versionLabel: Any? = null
        fun versionLabel(value: String?) { this.versionLabel = value }
        fun versionLabel(value: IntrinsicFunction) { this.versionLabel = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class OptionSetting(
            val namespace: String,
            val optionName: String,
            val resourceName: String? = null,
            val value: String? = null
    )

    class Tier(
            val name: String? = null,
            val type: String? = null,
            val version: String? = null
    )

}

fun Resources.awsElasticBeanstalkEnvironment(logicalId: String, init: AWSElasticBeanstalkEnvironment.() -> Unit = {}): AWSElasticBeanstalkEnvironment {
    return AWSElasticBeanstalkEnvironment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
