
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeDeploy::DeploymentConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
 */
@CloudFormationMarker
class AWSCodeDeployDeploymentConfig(logicalId: String) : Resource<AWSCodeDeployDeploymentConfig.Properties>(logicalId, "AWS::CodeDeploy::DeploymentConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [deploymentConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var deploymentConfigName: Any? = null

        /**
         * [deploymentConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentConfigName(value: String) {
          this.deploymentConfigName = value
        }
        
        /**
         * [deploymentConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-deploymentconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deploymentConfigName(value: IntrinsicFunction) {
          this.deploymentConfigName = value
        }
        
        /**
         * [minimumHealthyHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts)
         *
         * _Required_: no
         *
         * _Type_: MinimumHealthyHosts
         */
        @JvmField
        var minimumHealthyHosts: Any? = null

        /**
         * [minimumHealthyHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts)
         *
         * _Required_: no
         *
         * _Type_: MinimumHealthyHosts
         */
        fun minimumHealthyHosts(value: MinimumHealthyHosts) {
          this.minimumHealthyHosts = value
        }
        
        /**
         * [minimumHealthyHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts)
         *
         * _Required_: no
         *
         * _Type_: MinimumHealthyHosts
         */
        fun minimumHealthyHosts(value: IntrinsicFunction) {
          this.minimumHealthyHosts = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class MinimumHealthyHosts(
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val value: Int
    )

}

/**
 * [AWS::CodeDeploy::DeploymentConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentconfig.html)
 */
fun Resources.awsCodeDeployDeploymentConfig(logicalId: String, init: AWSCodeDeployDeploymentConfig.() -> Unit = {}): AWSCodeDeployDeploymentConfig {
    return AWSCodeDeployDeploymentConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
