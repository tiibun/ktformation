
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::AcceptedPortfolioShare - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html)
 */
@CloudFormationMarker
class AWSServiceCatalogAcceptedPortfolioShare(logicalId: String) : Resource<AWSServiceCatalogAcceptedPortfolioShare.Properties>(logicalId, "AWS::ServiceCatalog::AcceptedPortfolioShare") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var portfolioId: Any? = null

        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: String) {
          this.portfolioId = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid)
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
 * [AWS::ServiceCatalog::AcceptedPortfolioShare - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html)
 */
fun Resources.awsServiceCatalogAcceptedPortfolioShare(logicalId: String, init: AWSServiceCatalogAcceptedPortfolioShare.() -> Unit = {}): AWSServiceCatalogAcceptedPortfolioShare {
    return AWSServiceCatalogAcceptedPortfolioShare(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
