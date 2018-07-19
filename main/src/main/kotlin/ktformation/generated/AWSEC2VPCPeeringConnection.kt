
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCPeeringConnection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
 */
@CloudFormationMarker
class AWSEC2VPCPeeringConnection(logicalId: String) : Resource<AWSEC2VPCPeeringConnection.Properties>(logicalId, "AWS::EC2::VPCPeeringConnection") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [peerOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var peerOwnerId: Any? = null

        /**
         * [peerOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun peerOwnerId(value: String) {
          this.peerOwnerId = value
        }
        
        /**
         * [peerOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun peerOwnerId(value: IntrinsicFunction) {
          this.peerOwnerId = value
        }

        /**
         * [peerRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var peerRoleArn: Any? = null

        /**
         * [peerRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun peerRoleArn(value: String) {
          this.peerRoleArn = value
        }
        
        /**
         * [peerRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun peerRoleArn(value: IntrinsicFunction) {
          this.peerRoleArn = value
        }

        /**
         * [peerVpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var peerVpcId: Any? = null

        /**
         * [peerVpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun peerVpcId(value: String) {
          this.peerVpcId = value
        }
        
        /**
         * [peerVpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun peerVpcId(value: IntrinsicFunction) {
          this.peerVpcId = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
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
 * [AWS::EC2::VPCPeeringConnection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
 */
fun Resources.awsEC2VPCPeeringConnection(logicalId: String, init: AWSEC2VPCPeeringConnection.() -> Unit = {}): AWSEC2VPCPeeringConnection {
    return AWSEC2VPCPeeringConnection(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
