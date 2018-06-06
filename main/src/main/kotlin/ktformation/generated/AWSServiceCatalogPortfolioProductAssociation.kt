
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::PortfolioProductAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html)
 */
@CloudFormationMarker
class AWSServiceCatalogPortfolioProductAssociation(logicalId: String) : Resource<AWSServiceCatalogPortfolioProductAssociation.Properties>(logicalId, "AWS::ServiceCatalog::PortfolioProductAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var portfolioId: Any? = null

        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: String) {
          this.portfolioId = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: IntrinsicFunction) {
          this.portfolioId = value
        }
        
        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var productId: Any? = null

        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun productId(value: String) {
          this.productId = value
        }
        
        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun productId(value: IntrinsicFunction) {
          this.productId = value
        }
        
        /**
         * [sourcePortfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourcePortfolioId: Any? = null

        /**
         * [sourcePortfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourcePortfolioId(value: String) {
          this.sourcePortfolioId = value
        }
        
        /**
         * [sourcePortfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourcePortfolioId(value: IntrinsicFunction) {
          this.sourcePortfolioId = value
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
 * [AWS::ServiceCatalog::PortfolioProductAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html)
 */
fun Resources.awsServiceCatalogPortfolioProductAssociation(logicalId: String, init: AWSServiceCatalogPortfolioProductAssociation.() -> Unit = {}): AWSServiceCatalogPortfolioProductAssociation {
    return AWSServiceCatalogPortfolioProductAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
