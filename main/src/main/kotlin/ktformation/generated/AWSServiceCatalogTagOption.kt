
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceCatalog::TagOption - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html)
 */
@CloudFormationMarker
class AWSServiceCatalogTagOption(logicalId: String) : Resource<AWSServiceCatalogTagOption.Properties>(logicalId, "AWS::ServiceCatalog::TagOption") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [active](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var active: Any? = null

        /**
         * [active](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun active(value: Boolean) {
          this.active = value
        }
        
        /**
         * [active](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun active(value: IntrinsicFunction) {
          this.active = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
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
 * [AWS::ServiceCatalog::TagOption - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html)
 */
fun Resources.awsServiceCatalogTagOption(logicalId: String, init: AWSServiceCatalogTagOption.() -> Unit = {}): AWSServiceCatalogTagOption {
    return AWSServiceCatalogTagOption(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
