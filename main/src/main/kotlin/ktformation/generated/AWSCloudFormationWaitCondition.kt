
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFormation::WaitCondition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html)
 */
@CloudFormationMarker
class AWSCloudFormationWaitCondition(logicalId: String) : Resource<AWSCloudFormationWaitCondition.Properties>(logicalId, "AWS::CloudFormation::WaitCondition") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var count: Any? = null

        /**
         * [count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun count(value: Int) {
          this.count = value
        }
        
        /**
         * [count](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-count)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun count(value: IntrinsicFunction) {
          this.count = value
        }
        
        /**
         * [handle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var handle: Any? = null

        /**
         * [handle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun handle(value: String) {
          this.handle = value
        }
        
        /**
         * [handle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-handle)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun handle(value: IntrinsicFunction) {
          this.handle = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var timeout: Any? = null

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeout(value: String) {
          this.timeout = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html#cfn-waitcondition-timeout)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
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
 * [AWS::CloudFormation::WaitCondition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitcondition.html)
 */
fun Resources.awsCloudFormationWaitCondition(logicalId: String, init: AWSCloudFormationWaitCondition.() -> Unit = {}): AWSCloudFormationWaitCondition {
    return AWSCloudFormationWaitCondition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
