
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::PortfolioShare - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html)
 */
@CloudFormationMarker
class AWSServiceCatalogPortfolioShare(logicalId: String) : Resource<AWSServiceCatalogPortfolioShare.Properties>(logicalId, "AWS::ServiceCatalog::PortfolioShare") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }

        /**
         * [accountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var accountId: Any? = null

        /**
         * [accountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun accountId(value: String) {
          this.accountId = value
        }
        
        /**
         * [accountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun accountId(value: IntrinsicFunction) {
          this.accountId = value
        }

        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var portfolioId: Any? = null

        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: String) {
          this.portfolioId = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: IntrinsicFunction) {
          this.portfolioId = value
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
 * [AWS::ServiceCatalog::PortfolioShare - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html)
 */
fun Resources.awsServiceCatalogPortfolioShare(logicalId: String, init: AWSServiceCatalogPortfolioShare.() -> Unit = {}): AWSServiceCatalogPortfolioShare {
    return AWSServiceCatalogPortfolioShare(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
