
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeDeploy::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html)
 */
@CloudFormationMarker
class AWSCodeDeployApplication(logicalId: String) : Resource<AWSCodeDeployApplication.Properties>(logicalId, "AWS::CodeDeploy::Application") {

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
        var computePlatform: Any? = null

        fun computePlatform(value: String) {
          this.computePlatform = value
        }
        
        fun computePlatform(value: IntrinsicFunction) {
          this.computePlatform = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsCodeDeployApplication(logicalId: String, init: AWSCodeDeployApplication.() -> Unit = {}): AWSCodeDeployApplication {
    return AWSCodeDeployApplication(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
