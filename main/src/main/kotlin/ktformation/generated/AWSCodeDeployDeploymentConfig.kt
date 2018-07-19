
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

        /**
        * [MinimumHealthyHosts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html)
        */
        fun minimumHealthyHosts(init: MinimumHealthyHosts.() -> Unit = {}): MinimumHealthyHosts {
            return MinimumHealthyHosts().also {
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
    class MinimumHealthyHosts {
            /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun value(value: Int) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhosts.html#cfn-codedeploy-deploymentconfig-minimumhealthyhosts-value)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

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
