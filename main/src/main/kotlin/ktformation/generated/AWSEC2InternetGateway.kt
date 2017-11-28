
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::InternetGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html)
 */
@CloudFormationMarker
class AWSEC2InternetGateway(logicalId: String) : Resource<AWSEC2InternetGateway.Properties>(logicalId, "AWS::EC2::InternetGateway") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2InternetGateway(logicalId: String, init: AWSEC2InternetGateway.() -> Unit = {}): AWSEC2InternetGateway {
    return AWSEC2InternetGateway(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
