
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::EIP - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html)
 */
@CloudFormationMarker
class AWSEC2EIP(logicalId: String) : Resource<AWSEC2EIP.Properties>(logicalId, "AWS::EC2::EIP") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var domain: Any? = null

        fun domain(value: String) {
          this.domain = value
        }
        
        fun domain(value: IntrinsicFunction) {
          this.domain = value
        }
        
        @JvmField
        var instanceId: Any? = null

        fun instanceId(value: String) {
          this.instanceId = value
        }
        
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

fun Resources.awsEC2EIP(logicalId: String, init: AWSEC2EIP.() -> Unit = {}): AWSEC2EIP {
    return AWSEC2EIP(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
