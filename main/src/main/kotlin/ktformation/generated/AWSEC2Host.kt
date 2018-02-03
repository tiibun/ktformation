
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Host - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
 */
@CloudFormationMarker
class AWSEC2Host(logicalId: String) : Resource<AWSEC2Host.Properties>(logicalId, "AWS::EC2::Host") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoPlacement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var autoPlacement: Any? = null

        /**
         * [autoPlacement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoPlacement(value: String) {
          this.autoPlacement = value
        }
        
        /**
         * [autoPlacement](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoPlacement(value: IntrinsicFunction) {
          this.autoPlacement = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
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
 * [AWS::EC2::Host - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
 */
fun Resources.awsEC2Host(logicalId: String, init: AWSEC2Host.() -> Unit = {}): AWSEC2Host {
    return AWSEC2Host(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
