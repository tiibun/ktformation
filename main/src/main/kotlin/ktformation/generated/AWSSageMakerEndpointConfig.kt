
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

        /**
        * [ProductionVariant](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html)
        */
        fun productionVariant(init: ProductionVariant.() -> Unit = {}): ProductionVariant {
            return ProductionVariant().also {
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
    class ProductionVariant {
            /**
         * [initialInstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var initialInstanceCount: Any? = null

        /**
         * [initialInstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun initialInstanceCount(value: Int) {
          this.initialInstanceCount = value
        }
        
        /**
         * [initialInstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialinstancecount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun initialInstanceCount(value: IntrinsicFunction) {
          this.initialInstanceCount = value
        }

        /**
         * [initialVariantWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var initialVariantWeight: Any? = null

        /**
         * [initialVariantWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun initialVariantWeight(value: Double) {
          this.initialVariantWeight = value
        }
        
        /**
         * [initialVariantWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-initialvariantweight)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun initialVariantWeight(value: IntrinsicFunction) {
          this.initialVariantWeight = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [modelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var modelName: Any? = null

        /**
         * [modelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun modelName(value: String) {
          this.modelName = value
        }
        
        /**
         * [modelName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-modelname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun modelName(value: IntrinsicFunction) {
          this.modelName = value
        }

        /**
         * [variantName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var variantName: Any? = null

        /**
         * [variantName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun variantName(value: String) {
          this.variantName = value
        }
        
        /**
         * [variantName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-productionvariant.html#cfn-sagemaker-endpointconfig-productionvariant-variantname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun variantName(value: IntrinsicFunction) {
          this.variantName = value
        }

    }

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
