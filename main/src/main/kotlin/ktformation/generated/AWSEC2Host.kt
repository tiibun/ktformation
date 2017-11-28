
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Host - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
 */
@CloudFormationMarker
class AWSEC2Host(logicalId: String) : Resource<AWSEC2Host.Properties>(logicalId, "AWS::EC2::Host") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var autoPlacement: Any? = null
        fun autoPlacement(value: String?) { this.autoPlacement = value }
        fun autoPlacement(value: IntrinsicFunction) { this.autoPlacement = value }
        @JvmField var availabilityZone: Any? = null
        fun availabilityZone(value: String) { this.availabilityZone = value }
        fun availabilityZone(value: IntrinsicFunction) { this.availabilityZone = value }
        @JvmField var instanceType: Any? = null
        fun instanceType(value: String) { this.instanceType = value }
        fun instanceType(value: IntrinsicFunction) { this.instanceType = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2Host(logicalId: String, init: AWSEC2Host.() -> Unit = {}): AWSEC2Host {
    return AWSEC2Host(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
