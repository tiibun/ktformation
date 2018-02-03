
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::Policy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html)
 */
@CloudFormationMarker
class AWSIoTPolicy(logicalId: String) : Resource<AWSIoTPolicy.Properties>(logicalId, "AWS::IoT::Policy") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html#cfn-iot-policy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var policyDocument: Any? = null

        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html#cfn-iot-policy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html#cfn-iot-policy-policydocument)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html#cfn-iot-policy-policyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html#cfn-iot-policy-policyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html#cfn-iot-policy-policyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
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
 * [AWS::IoT::Policy - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html)
 */
fun Resources.awsIoTPolicy(logicalId: String, init: AWSIoTPolicy.() -> Unit = {}): AWSIoTPolicy {
    return AWSIoTPolicy(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
