
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::CloudFormationProduct - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html)
 */
@CloudFormationMarker
class AWSServiceCatalogCloudFormationProduct(logicalId: String) : Resource<AWSServiceCatalogCloudFormationProduct.Properties>(logicalId, "AWS::ServiceCatalog::CloudFormationProduct") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [distributor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var distributor: Any? = null

        /**
         * [distributor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun distributor(value: String) {
          this.distributor = value
        }
        
        /**
         * [distributor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-distributor)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun distributor(value: IntrinsicFunction) {
          this.distributor = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var owner: Any? = null

        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun owner(value: String) {
          this.owner = value
        }
        
        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-owner)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun owner(value: IntrinsicFunction) {
          this.owner = value
        }
        
        /**
         * [provisioningArtifactParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
         *
         * _Required_: yes
         *
         * _Type_: List<ProvisioningArtifactProperties>
         */
        @JvmField
        var provisioningArtifactParameters: Any? = null

        /**
         * [provisioningArtifactParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
         *
         * _Required_: yes
         *
         * _Type_: List<ProvisioningArtifactProperties>
         */
        fun provisioningArtifactParameters(value: List<ProvisioningArtifactProperties>) {
          this.provisioningArtifactParameters = value
        }
        
        /**
         * [provisioningArtifactParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactparameters)
         *
         * _Required_: yes
         *
         * _Type_: List<ProvisioningArtifactProperties>
         */
        fun provisioningArtifactParameters(vararg value: IntrinsicFunction) {
          this.provisioningArtifactParameters = value
        }
        
        /**
         * [supportDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var supportDescription: Any? = null

        /**
         * [supportDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun supportDescription(value: String) {
          this.supportDescription = value
        }
        
        /**
         * [supportDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportdescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun supportDescription(value: IntrinsicFunction) {
          this.supportDescription = value
        }
        
        /**
         * [supportEmail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var supportEmail: Any? = null

        /**
         * [supportEmail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun supportEmail(value: String) {
          this.supportEmail = value
        }
        
        /**
         * [supportEmail](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supportemail)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun supportEmail(value: IntrinsicFunction) {
          this.supportEmail = value
        }
        
        /**
         * [supportUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var supportUrl: Any? = null

        /**
         * [supportUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun supportUrl(value: String) {
          this.supportUrl = value
        }
        
        /**
         * [supportUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-supporturl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun supportUrl(value: IntrinsicFunction) {
          this.supportUrl = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html#cfn-servicecatalog-cloudformationproduct-tags)
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


    class ProvisioningArtifactProperties(
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [Info](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-info)
             *
             * _Required_: yes
             *
             * _Type_: Json
             */
            val info: Json,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html#cfn-servicecatalog-cloudformationproduct-provisioningartifactproperties-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

}

/**
 * [AWS::ServiceCatalog::CloudFormationProduct - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html)
 */
fun Resources.awsServiceCatalogCloudFormationProduct(logicalId: String, init: AWSServiceCatalogCloudFormationProduct.() -> Unit = {}): AWSServiceCatalogCloudFormationProduct {
    return AWSServiceCatalogCloudFormationProduct(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
