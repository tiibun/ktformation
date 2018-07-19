
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFormation::CustomResource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html)
 */
@CloudFormationMarker
class AWSCloudFormationCustomResource(logicalId: String) : Resource<AWSCloudFormationCustomResource.Properties>(logicalId, "AWS::CloudFormation::CustomResource") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [serviceToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceToken: Any? = null

        /**
         * [serviceToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceToken(value: String) {
          this.serviceToken = value
        }
        
        /**
         * [serviceToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceToken(value: IntrinsicFunction) {
          this.serviceToken = value
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
 * [AWS::CloudFormation::CustomResource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html)
 */
fun Resources.awsCloudFormationCustomResource(logicalId: String, init: AWSCloudFormationCustomResource.() -> Unit = {}): AWSCloudFormationCustomResource {
    return AWSCloudFormationCustomResource(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
