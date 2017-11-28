
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeDeploy::DeploymentConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
 */
@CloudFormationMarker
class AWSCodeDeployDeploymentConfig(logicalId: String) : Resource<AWSCodeDeployDeploymentConfig.Properties>(logicalId, "AWS::CodeDeploy::DeploymentConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var deploymentConfigName: Any? = null
        fun deploymentConfigName(value: String?) { this.deploymentConfigName = value }
        fun deploymentConfigName(value: IntrinsicFunction) { this.deploymentConfigName = value }
        @JvmField var minimumHealthyHosts: Any? = null
        fun minimumHealthyHosts(value: MinimumHealthyHosts?) { this.minimumHealthyHosts = value }
        fun minimumHealthyHosts(value: IntrinsicFunction) { this.minimumHealthyHosts = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class MinimumHealthyHosts(
            val type: String,
            val value: Int
    )

}

fun Resources.awsCodeDeployDeploymentConfig(logicalId: String, init: AWSCodeDeployDeploymentConfig.() -> Unit = {}): AWSCodeDeployDeploymentConfig {
    return AWSCodeDeployDeploymentConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
