
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::PortfolioPrincipalAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
 */
@CloudFormationMarker
class AWSServiceCatalogPortfolioPrincipalAssociation(logicalId: String) : Resource<AWSServiceCatalogPortfolioPrincipalAssociation.Properties>(logicalId, "AWS::ServiceCatalog::PortfolioPrincipalAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var portfolioId: Any? = null

        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: String) {
          this.portfolioId = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: IntrinsicFunction) {
          this.portfolioId = value
        }
        
        /**
         * [principalARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var principalARN: Any? = null

        /**
         * [principalARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principalARN(value: String) {
          this.principalARN = value
        }
        
        /**
         * [principalARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principalARN(value: IntrinsicFunction) {
          this.principalARN = value
        }
        
        /**
         * [principalType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var principalType: Any? = null

        /**
         * [principalType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principalType(value: String) {
          this.principalType = value
        }
        
        /**
         * [principalType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principalType(value: IntrinsicFunction) {
          this.principalType = value
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
 * [AWS::ServiceCatalog::PortfolioPrincipalAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
 */
fun Resources.awsServiceCatalogPortfolioPrincipalAssociation(logicalId: String, init: AWSServiceCatalogPortfolioPrincipalAssociation.() -> Unit = {}): AWSServiceCatalogPortfolioPrincipalAssociation {
    return AWSServiceCatalogPortfolioPrincipalAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
