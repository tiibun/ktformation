
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::LaunchNotificationConstraint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html)
 */
@CloudFormationMarker
class AWSServiceCatalogLaunchNotificationConstraint(logicalId: String) : Resource<AWSServiceCatalogLaunchNotificationConstraint.Properties>(logicalId, "AWS::ServiceCatalog::LaunchNotificationConstraint") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var acceptLanguage: Any? = null

        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: String) {
          this.acceptLanguage = value
        }
        
        /**
         * [acceptLanguage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-acceptlanguage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun acceptLanguage(value: IntrinsicFunction) {
          this.acceptLanguage = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [notificationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var notificationArns: Any? = null

        /**
         * [notificationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun notificationArns(value: List<String>) {
          this.notificationArns = value
        }
        
        /**
         * [notificationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-notificationarns)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun notificationArns(vararg value: IntrinsicFunction) {
          this.notificationArns = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var portfolioId: Any? = null

        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: String) {
          this.portfolioId = value
        }
        
        /**
         * [portfolioId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-portfolioid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun portfolioId(value: IntrinsicFunction) {
          this.portfolioId = value
        }
        
        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var productId: Any? = null

        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun productId(value: String) {
          this.productId = value
        }
        
        /**
         * [productId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html#cfn-servicecatalog-launchnotificationconstraint-productid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun productId(value: IntrinsicFunction) {
          this.productId = value
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
 * [AWS::ServiceCatalog::LaunchNotificationConstraint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html)
 */
fun Resources.awsServiceCatalogLaunchNotificationConstraint(logicalId: String, init: AWSServiceCatalogLaunchNotificationConstraint.() -> Unit = {}): AWSServiceCatalogLaunchNotificationConstraint {
    return AWSServiceCatalogLaunchNotificationConstraint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
