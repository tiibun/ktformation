
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFormation::Stack - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html)
 */
@CloudFormationMarker
class AWSCloudFormationStack(logicalId: String) : Resource<AWSCloudFormationStack.Properties>(logicalId, "AWS::CloudFormation::Stack") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [notificationARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var notificationARNs: Any? = null

        /**
         * [notificationARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationARNs(value: List<String>) {
          this.notificationARNs = value
        }
        
        /**
         * [notificationARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-notificationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationARNs(vararg value: IntrinsicFunction) {
          this.notificationARNs = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-parameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-parameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun parameters(value: Map<String, Any>) {
          this.parameters = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [templateURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var templateURL: Any? = null

        /**
         * [templateURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun templateURL(value: String) {
          this.templateURL = value
        }
        
        /**
         * [templateURL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-templateurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun templateURL(value: IntrinsicFunction) {
          this.templateURL = value
        }
        
        /**
         * [timeoutInMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var timeoutInMinutes: Any? = null

        /**
         * [timeoutInMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutInMinutes(value: Int) {
          this.timeoutInMinutes = value
        }
        
        /**
         * [timeoutInMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html#cfn-cloudformation-stack-timeoutinminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutInMinutes(value: IntrinsicFunction) {
          this.timeoutInMinutes = value
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
 * [AWS::CloudFormation::Stack - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html)
 */
fun Resources.awsCloudFormationStack(logicalId: String, init: AWSCloudFormationStack.() -> Unit = {}): AWSCloudFormationStack {
    return AWSCloudFormationStack(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
