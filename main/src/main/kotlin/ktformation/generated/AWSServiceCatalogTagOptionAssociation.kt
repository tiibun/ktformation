
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::TagOptionAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html)
 */
@CloudFormationMarker
class AWSServiceCatalogTagOptionAssociation(logicalId: String) : Resource<AWSServiceCatalogTagOptionAssociation.Properties>(logicalId, "AWS::ServiceCatalog::TagOptionAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var resourceId: Any? = null

        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: String) {
          this.resourceId = value
        }
        
        /**
         * [resourceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun resourceId(value: IntrinsicFunction) {
          this.resourceId = value
        }
        
        /**
         * [tagOptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var tagOptionId: Any? = null

        /**
         * [tagOptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tagOptionId(value: String) {
          this.tagOptionId = value
        }
        
        /**
         * [tagOptionId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tagOptionId(value: IntrinsicFunction) {
          this.tagOptionId = value
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
 * [AWS::ServiceCatalog::TagOptionAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html)
 */
fun Resources.awsServiceCatalogTagOptionAssociation(logicalId: String, init: AWSServiceCatalogTagOptionAssociation.() -> Unit = {}): AWSServiceCatalogTagOptionAssociation {
    return AWSServiceCatalogTagOptionAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
