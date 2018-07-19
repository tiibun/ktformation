
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::EIPAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html)
 */
@CloudFormationMarker
class AWSEC2EIPAssociation(logicalId: String) : Resource<AWSEC2EIPAssociation.Properties>(logicalId, "AWS::EC2::EIPAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allocationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var allocationId: Any? = null

        /**
         * [allocationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allocationId(value: String) {
          this.allocationId = value
        }
        
        /**
         * [allocationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun allocationId(value: IntrinsicFunction) {
          this.allocationId = value
        }

        /**
         * [eIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eIP: Any? = null

        /**
         * [eIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eIP(value: String) {
          this.eIP = value
        }
        
        /**
         * [eIP](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eIP(value: IntrinsicFunction) {
          this.eIP = value
        }

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
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
 * [AWS::EC2::EIPAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html)
 */
fun Resources.awsEC2EIPAssociation(logicalId: String, init: AWSEC2EIPAssociation.() -> Unit = {}): AWSEC2EIPAssociation {
    return AWSEC2EIPAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
