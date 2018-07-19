
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::EIP - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html)
 */
@CloudFormationMarker
class AWSEC2EIP(logicalId: String) : Resource<AWSEC2EIP.Properties>(logicalId, "AWS::EC2::EIP") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [domain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var domain: Any? = null

        /**
         * [domain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domain(value: String) {
          this.domain = value
        }
        
        /**
         * [domain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domain(value: IntrinsicFunction) {
          this.domain = value
        }

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
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
 * [AWS::EC2::EIP - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html)
 */
fun Resources.awsEC2EIP(logicalId: String, init: AWSEC2EIP.() -> Unit = {}): AWSEC2EIP {
    return AWSEC2EIP(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
