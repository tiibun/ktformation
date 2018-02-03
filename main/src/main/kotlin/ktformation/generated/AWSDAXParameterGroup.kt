
package ktformation.generated

import ktformation.*

/**
 * [AWS::DAX::ParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
 */
@CloudFormationMarker
class AWSDAXParameterGroup(logicalId: String) : Resource<AWSDAXParameterGroup.Properties>(logicalId, "AWS::DAX::ParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [parameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var parameterGroupName: Any? = null

        /**
         * [parameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun parameterGroupName(value: String) {
          this.parameterGroupName = value
        }
        
        /**
         * [parameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun parameterGroupName(value: IntrinsicFunction) {
          this.parameterGroupName = value
        }
        
        /**
         * [parameterNameValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var parameterNameValues: Any? = null

        /**
         * [parameterNameValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameterNameValues(value: Json) {
          this.parameterNameValues = value
        }
        
        /**
         * [parameterNameValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameterNameValues(value: IntrinsicFunction) {
          this.parameterNameValues = value
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
 * [AWS::DAX::ParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
 */
fun Resources.awsDAXParameterGroup(logicalId: String, init: AWSDAXParameterGroup.() -> Unit = {}): AWSDAXParameterGroup {
    return AWSDAXParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
