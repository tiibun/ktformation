
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPNGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-gateway.html)
 */
@CloudFormationMarker
class AWSEC2VPNGateway(logicalId: String) : Resource<AWSEC2VPNGateway.Properties>(logicalId, "AWS::EC2::VPNGateway") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var amazonSideAsn: Any? = null
        fun amazonSideAsn(value: Long?) { this.amazonSideAsn = value }
        fun amazonSideAsn(value: IntrinsicFunction) { this.amazonSideAsn = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var type: Any? = null
        fun type(value: String) { this.type = value }
        fun type(value: IntrinsicFunction) { this.type = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2VPNGateway(logicalId: String, init: AWSEC2VPNGateway.() -> Unit = {}): AWSEC2VPNGateway {
    return AWSEC2VPNGateway(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
