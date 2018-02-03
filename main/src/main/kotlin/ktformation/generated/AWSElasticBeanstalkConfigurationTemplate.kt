
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::ConfigurationTemplate - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-configurationtemplate.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkConfigurationTemplate(logicalId: String) : Resource<AWSElasticBeanstalkConfigurationTemplate.Properties>(logicalId, "AWS::ElasticBeanstalk::ConfigurationTemplate") {

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
        var environmentId: Any? = null

        fun environmentId(value: String) {
          this.environmentId = value
        }
        
        fun environmentId(value: IntrinsicFunction) {
          this.environmentId = value
        }
        
        @JvmField
        var optionSettings: Any? = null

        fun optionSettings(value: List<ConfigurationOptionSetting>) {
          this.optionSettings = value
        }
        
        fun optionSettings(vararg value: IntrinsicFunction) {
          this.optionSettings = value
        }
        
        @JvmField
        var platformArn: Any? = null

        fun platformArn(value: String) {
          this.platformArn = value
        }
        
        fun platformArn(value: IntrinsicFunction) {
          this.platformArn = value
        }
        
        @JvmField
        var solutionStackName: Any? = null

        fun solutionStackName(value: String) {
          this.solutionStackName = value
        }
        
        fun solutionStackName(value: IntrinsicFunction) {
          this.solutionStackName = value
        }
        
        @JvmField
        var sourceConfiguration: Any? = null

        fun sourceConfiguration(value: SourceConfiguration) {
          this.sourceConfiguration = value
        }
        
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
            val namespace: String,
            val optionName: String,
            val resourceName: String? = null,
            val value: String? = null
    )

    class SourceConfiguration(
            val applicationName: String,
            val templateName: String
    )

}

fun Resources.awsElasticBeanstalkConfigurationTemplate(logicalId: String, init: AWSElasticBeanstalkConfigurationTemplate.() -> Unit = {}): AWSElasticBeanstalkConfigurationTemplate {
    return AWSElasticBeanstalkConfigurationTemplate(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
