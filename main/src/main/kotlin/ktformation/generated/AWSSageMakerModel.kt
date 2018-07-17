
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ContainerDefinition(
            /**
             * [ContainerHostname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val containerHostname: String? = null,
            /**
             * [Environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val environment: Json? = null,
            /**
             * [Image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val image: String,
            /**
             * [ModelDataUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val modelDataUrl: String? = null
    )

    class VpcConfig(
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>,
            /**
             * [Subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnets: List<String>
    )

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
