
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SubnetNetworkAclAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html)
 */
@CloudFormationMarker
class AWSEC2SubnetNetworkAclAssociation(logicalId: String) : Resource<AWSEC2SubnetNetworkAclAssociation.Properties>(logicalId, "AWS::EC2::SubnetNetworkAclAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [networkAclId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var networkAclId: Any? = null

        /**
         * [networkAclId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkAclId(value: String) {
          this.networkAclId = value
        }
        
        /**
         * [networkAclId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkAclId(value: IntrinsicFunction) {
          this.networkAclId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html#cfn-ec2-subnetnetworkaclassociation-associationid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::EC2::SubnetNetworkAclAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html)
 */
fun Resources.awsEC2SubnetNetworkAclAssociation(logicalId: String, init: AWSEC2SubnetNetworkAclAssociation.() -> Unit = {}): AWSEC2SubnetNetworkAclAssociation {
    return AWSEC2SubnetNetworkAclAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
