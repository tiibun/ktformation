
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SubnetNetworkAclAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html)
 */
@CloudFormationMarker
class AWSEC2SubnetNetworkAclAssociation(logicalId: String) : Resource<AWSEC2SubnetNetworkAclAssociation.Properties>(logicalId, "AWS::EC2::SubnetNetworkAclAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var networkAclId: Any? = null

        fun networkAclId(value: String) {
          this.networkAclId = value
        }
        fun networkAclId(value: IntrinsicFunction) {
  this.networkAclId = value
}
        @JvmField
        var subnetId: Any? = null

        fun subnetId(value: String) {
          this.subnetId = value
        }
        fun subnetId(value: IntrinsicFunction) {
  this.subnetId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2SubnetNetworkAclAssociation(logicalId: String, init: AWSEC2SubnetNetworkAclAssociation.() -> Unit = {}): AWSEC2SubnetNetworkAclAssociation {
    return AWSEC2SubnetNetworkAclAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
