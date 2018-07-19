
package ktformation.generated

import ktformation.*

/**
 * [AWS::SageMaker::Model - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html)
 */
@CloudFormationMarker
class AWSSageMakerModel(logicalId: String) : Resource<AWSSageMakerModel.Properties>(logicalId, "AWS::SageMaker::Model") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [executionRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var executionRoleArn: Any? = null

        /**
         * [executionRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun executionRoleArn(value: String) {
          this.executionRoleArn = value
        }
        
        /**
         * [executionRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun executionRoleArn(value: IntrinsicFunction) {
          this.executionRoleArn = value
        }

        /**
         * [modelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var modelName: Any? = null

        /**
         * [modelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun modelName(value: String) {
          this.modelName = value
        }
        
        /**
         * [modelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun modelName(value: IntrinsicFunction) {
          this.modelName = value
        }

        /**
         * [primaryContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
         *
         * _Required_: yes
         *
         * _Type_: ContainerDefinition
         */
        @JvmField
        var primaryContainer: Any? = null

        /**
         * [primaryContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
         *
         * _Required_: yes
         *
         * _Type_: ContainerDefinition
         */
        fun primaryContainer(value: ContainerDefinition) {
          this.primaryContainer = value
        }
        
        /**
         * [primaryContainer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
         *
         * _Required_: yes
         *
         * _Type_: ContainerDefinition
         */
        fun primaryContainer(value: IntrinsicFunction) {
          this.primaryContainer = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        @JvmField
        var vpcConfig: Any? = null

        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: VpcConfig) {
          this.vpcConfig = value
        }
        
        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: IntrinsicFunction) {
          this.vpcConfig = value
        }

        /**
        * [ContainerDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html)
        */
        fun containerDefinition(init: ContainerDefinition.() -> Unit = {}): ContainerDefinition {
            return ContainerDefinition().also {
                it.init()
            }
        }
        /**
        * [VpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html)
        */
        fun vpcConfig(init: VpcConfig.() -> Unit = {}): VpcConfig {
            return VpcConfig().also {
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
    class ContainerDefinition {
            /**
         * [containerHostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerHostname: Any? = null

        /**
         * [containerHostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerHostname(value: String) {
          this.containerHostname = value
        }
        
        /**
         * [containerHostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerHostname(value: IntrinsicFunction) {
          this.containerHostname = value
        }

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var environment: Any? = null

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun environment(value: Json) {
          this.environment = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun environment(value: IntrinsicFunction) {
          this.environment = value
        }

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var image: Any? = null

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun image(value: String) {
          this.image = value
        }
        
        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun image(value: IntrinsicFunction) {
          this.image = value
        }

        /**
         * [modelDataUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var modelDataUrl: Any? = null

        /**
         * [modelDataUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun modelDataUrl(value: String) {
          this.modelDataUrl = value
        }
        
        /**
         * [modelDataUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun modelDataUrl(value: IntrinsicFunction) {
          this.modelDataUrl = value
        }

    }

    @CloudFormationMarker
    class VpcConfig {
            /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var subnets: Any? = null

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }

    }

}

/**
 * [AWS::SageMaker::Model - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html)
 */
fun Resources.awsSageMakerModel(logicalId: String, init: AWSSageMakerModel.() -> Unit = {}): AWSSageMakerModel {
    return AWSSageMakerModel(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
