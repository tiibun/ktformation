
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCPeeringConnection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
 */
@CloudFormationMarker
class AWSEC2VPCPeeringConnection(logicalId: String) : Resource<AWSEC2VPCPeeringConnection.Properties>(logicalId, "AWS::EC2::VPCPeeringConnection") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var peerOwnerId: Any? = null
        fun peerOwnerId(value: String) {
            this.peerOwnerId = value
        }
        fun peerOwnerId(value: IntrinsicFunction) { this.peerOwnerId = value }
        @JvmField var peerRoleArn: Any? = null
        fun peerRoleArn(value: String) {
            this.peerRoleArn = value
        }
        fun peerRoleArn(value: IntrinsicFunction) { this.peerRoleArn = value }
        @JvmField var peerVpcId: Any? = null
        fun peerVpcId(value: String) { this.peerVpcId = value }
        fun peerVpcId(value: IntrinsicFunction) { this.peerVpcId = value }
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

fun Resources.awsEC2VPCPeeringConnection(logicalId: String, init: AWSEC2VPCPeeringConnection.() -> Unit = {}): AWSEC2VPCPeeringConnection {
    return AWSEC2VPCPeeringConnection(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
