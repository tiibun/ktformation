
package ktformation.generated

import ktformation.*

/**
 * [AWS::SageMaker::EndpointConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
 */
@CloudFormationMarker
class AWSSageMakerEndpointConfig(logicalId: String) : Resource<AWSSageMakerEndpointConfig.Properties>(logicalId, "AWS::SageMaker::EndpointConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [endpointConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var endpointConfigName: Any? = null

        /**
         * [endpointConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointConfigName(value: String) {
          this.endpointConfigName = value
        }
        
        /**
         * [endpointConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-endpointconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointConfigName(value: IntrinsicFunction) {
          this.endpointConfigName = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }
        
        /**
         * [productionVariants](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
         *
         * _Required_: yes
         *
         * _Type_: List<ProductionVariant>
         */
        @JvmField
        var productionVariants: Any? = null

        /**
         * [productionVariants](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
         *
         * _Required_: yes
         *
         * _Type_: List<ProductionVariant>
         */
        fun productionVariants(value: List<ProductionVariant>) {
          this.productionVariants = value
        }
        
        /**
         * [productionVariants](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-productionvariants)
         *
         * _Required_: yes
         *
         * _Type_: List<ProductionVariant>
         */
        fun productionVariants(vararg value: IntrinsicFunction) {
          this.productionVariants = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html#cfn-sagemaker-endpointconfig-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ProductionVariant(
            /**
             * [InitialInstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val initialInstanceCount: Int,
            /**
             * [InitialVariantWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val initialVariantWeight: Double,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instanceType: String,
            /**
             * [ModelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val modelName: String,
            /**
             * [VariantName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val variantName: String
    )

}

/**
 * [AWS::SageMaker::EndpointConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpointconfig.html)
 */
fun Resources.awsSageMakerEndpointConfig(logicalId: String, init: AWSSageMakerEndpointConfig.() -> Unit = {}): AWSSageMakerEndpointConfig {
    return AWSSageMakerEndpointConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
