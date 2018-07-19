
package ktformation.generated

import ktformation.*

/**
 * [AWS::IoT::PolicyPrincipalAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
 */
@CloudFormationMarker
class AWSIoTPolicyPrincipalAttachment(logicalId: String) : Resource<AWSIoTPolicyPrincipalAttachment.Properties>(logicalId, "AWS::IoT::PolicyPrincipalAttachment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }

        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var principal: Any? = null

        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principal(value: String) {
          this.principal = value
        }
        
        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principal(value: IntrinsicFunction) {
          this.principal = value
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
 * [AWS::IoT::PolicyPrincipalAttachment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
 */
fun Resources.awsIoTPolicyPrincipalAttachment(logicalId: String, init: AWSIoTPolicyPrincipalAttachment.() -> Unit = {}): AWSIoTPolicyPrincipalAttachment {
    return AWSIoTPolicyPrincipalAttachment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
