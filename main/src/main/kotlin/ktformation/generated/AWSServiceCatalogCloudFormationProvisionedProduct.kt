
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::CloudFormationProvisionedProduct - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
 */
@CloudFormationMarker
class AWSServiceCatalogCloudFormationProvisionedProduct(logicalId: String) : Resource<AWSServiceCatalogCloudFormationProvisionedProduct.Properties>(logicalId, "AWS::ServiceCatalog::CloudFormationProvisionedProduct") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [notificationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var notificationArns: Any? = null

        /**
         * [notificationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationArns(value: List<String>) {
          this.notificationArns = value
        }
        
        /**
         * [notificationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationArns(vararg value: IntrinsicFunction) {
          this.notificationArns = value
        }
        
        /**
         * [pathId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var pathId: Any? = null

        /**
         * [pathId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun pathId(value: String) {
          this.pathId = value
        }
        
        /**
         * [pathId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun pathId(value: IntrinsicFunction) {
          this.pathId = value
        }
        
        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var productId: Any? = null

        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun productId(value: String) {
          this.productId = value
        }
        
        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun productId(value: IntrinsicFunction) {
          this.productId = value
        }
        
        /**
         * [productName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var productName: Any? = null

        /**
         * [productName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun productName(value: String) {
          this.productName = value
        }
        
        /**
         * [productName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun productName(value: IntrinsicFunction) {
          this.productName = value
        }
        
        /**
         * [provisionedProductName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var provisionedProductName: Any? = null

        /**
         * [provisionedProductName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun provisionedProductName(value: String) {
          this.provisionedProductName = value
        }
        
        /**
         * [provisionedProductName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun provisionedProductName(value: IntrinsicFunction) {
          this.provisionedProductName = value
        }
        
        /**
         * [provisioningArtifactId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var provisioningArtifactId: Any? = null

        /**
         * [provisioningArtifactId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun provisioningArtifactId(value: String) {
          this.provisioningArtifactId = value
        }
        
        /**
         * [provisioningArtifactId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun provisioningArtifactId(value: IntrinsicFunction) {
          this.provisioningArtifactId = value
        }
        
        /**
         * [provisioningArtifactName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var provisioningArtifactName: Any? = null

        /**
         * [provisioningArtifactName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun provisioningArtifactName(value: String) {
          this.provisioningArtifactName = value
        }
        
        /**
         * [provisioningArtifactName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun provisioningArtifactName(value: IntrinsicFunction) {
          this.provisioningArtifactName = value
        }
        
        /**
         * [provisioningParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
         *
         * _Required_: no
         *
         * _Type_: List<ProvisioningParameter>
         */
        @JvmField
        var provisioningParameters: Any? = null

        /**
         * [provisioningParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
         *
         * _Required_: no
         *
         * _Type_: List<ProvisioningParameter>
         */
        fun provisioningParameters(value: List<ProvisioningParameter>) {
          this.provisioningParameters = value
        }
        
        /**
         * [provisioningParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
         *
         * _Required_: no
         *
         * _Type_: List<ProvisioningParameter>
         */
        fun provisioningParameters(vararg value: IntrinsicFunction) {
          this.provisioningParameters = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
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


    class ProvisioningParameter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameter-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameter-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

}

/**
 * [AWS::ServiceCatalog::CloudFormationProvisionedProduct - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
 */
fun Resources.awsServiceCatalogCloudFormationProvisionedProduct(logicalId: String, init: AWSServiceCatalogCloudFormationProvisionedProduct.() -> Unit = {}): AWSServiceCatalogCloudFormationProvisionedProduct {
    return AWSServiceCatalogCloudFormationProvisionedProduct(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
