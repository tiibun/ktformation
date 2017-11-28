
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::CustomerGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html)
 */
@CloudFormationMarker
class AWSEC2CustomerGateway(logicalId: String) : Resource<AWSEC2CustomerGateway.Properties>(logicalId, "AWS::EC2::CustomerGateway") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var bgpAsn: Any? = null
        fun bgpAsn(value: Int) { this.bgpAsn = value }
        fun bgpAsn(value: IntrinsicFunction) { this.bgpAsn = value }
        @JvmField var ipAddress: Any? = null
        fun ipAddress(value: String) { this.ipAddress = value }
        fun ipAddress(value: IntrinsicFunction) { this.ipAddress = value }
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

fun Resources.awsEC2CustomerGateway(logicalId: String, init: AWSEC2CustomerGateway.() -> Unit = {}): AWSEC2CustomerGateway {
    return AWSEC2CustomerGateway(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
