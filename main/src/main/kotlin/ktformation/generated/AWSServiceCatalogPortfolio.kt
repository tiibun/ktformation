
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::Portfolio - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html)
 */
@CloudFormationMarker
class AWSServiceCatalogPortfolio(logicalId: String) : Resource<AWSServiceCatalogPortfolio.Properties>(logicalId, "AWS::ServiceCatalog::Portfolio") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [displayName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var displayName: Any? = null

        /**
         * [displayName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun displayName(value: String) {
          this.displayName = value
        }
        
        /**
         * [displayName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-displayname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun displayName(value: IntrinsicFunction) {
          this.displayName = value
        }
        
        /**
         * [providerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var providerName: Any? = null

        /**
         * [providerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun providerName(value: String) {
          this.providerName = value
        }
        
        /**
         * [providerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-providername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun providerName(value: IntrinsicFunction) {
          this.providerName = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html#cfn-servicecatalog-portfolio-tags)
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



}

/**
 * [AWS::ServiceCatalog::Portfolio - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html)
 */
fun Resources.awsServiceCatalogPortfolio(logicalId: String, init: AWSServiceCatalogPortfolio.() -> Unit = {}): AWSServiceCatalogPortfolio {
    return AWSServiceCatalogPortfolio(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
