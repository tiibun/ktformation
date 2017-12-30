
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkAcl - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl.html)
 */
@CloudFormationMarker
class AWSEC2NetworkAcl(logicalId: String) : Resource<AWSEC2NetworkAcl.Properties>(logicalId, "AWS::EC2::NetworkAcl") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var vpcId: Any? = null
        fun vpcId(value: String) { this.vpcId = value }
        fun vpcId(value: IntrinsicFunction) { this.vpcId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2NetworkAcl(logicalId: String, init: AWSEC2NetworkAcl.() -> Unit = {}): AWSEC2NetworkAcl {
    return AWSEC2NetworkAcl(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
