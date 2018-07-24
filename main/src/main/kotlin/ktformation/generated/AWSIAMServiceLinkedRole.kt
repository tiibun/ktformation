
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::ServiceLinkedRole - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html)
 */
@CloudFormationMarker
class AWSIAMServiceLinkedRole(logicalId: String) : Resource<AWSIAMServiceLinkedRole.Properties>(logicalId, "AWS::IAM::ServiceLinkedRole") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [aWSServiceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var aWSServiceName: Any? = null

        /**
         * [aWSServiceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun aWSServiceName(value: String) {
          this.aWSServiceName = value
        }
        
        /**
         * [aWSServiceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun aWSServiceName(value: IntrinsicFunction) {
          this.aWSServiceName = value
        }

        /**
         * [customSuffix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var customSuffix: Any? = null

        /**
         * [customSuffix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customSuffix(value: String) {
          this.customSuffix = value
        }
        
        /**
         * [customSuffix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customSuffix(value: IntrinsicFunction) {
          this.customSuffix = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
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
 * [AWS::IAM::ServiceLinkedRole - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html)
 */
fun Resources.awsIAMServiceLinkedRole(logicalId: String, init: AWSIAMServiceLinkedRole.() -> Unit = {}): AWSIAMServiceLinkedRole {
    return AWSIAMServiceLinkedRole(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
