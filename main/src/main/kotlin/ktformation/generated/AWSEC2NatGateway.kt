
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NatGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html)
 */
@CloudFormationMarker
class AWSEC2NatGateway(logicalId: String) : Resource<AWSEC2NatGateway.Properties>(logicalId, "AWS::EC2::NatGateway") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var allocationId: Any? = null

        fun allocationId(value: String) {
          this.allocationId = value
        }
        fun allocationId(value: IntrinsicFunction) {
  this.allocationId = value
}
        @JvmField
        var subnetId: Any? = null

        fun subnetId(value: String) {
          this.subnetId = value
        }
        fun subnetId(value: IntrinsicFunction) {
  this.subnetId = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2NatGateway(logicalId: String, init: AWSEC2NatGateway.() -> Unit = {}): AWSEC2NatGateway {
    return AWSEC2NatGateway(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
