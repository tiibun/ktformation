
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::TrunkInterfaceAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html)
 */
@CloudFormationMarker
class AWSEC2TrunkInterfaceAssociation(logicalId: String) : Resource<AWSEC2TrunkInterfaceAssociation.Properties>(logicalId, "AWS::EC2::TrunkInterfaceAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [branchInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var branchInterfaceId: Any? = null

        /**
         * [branchInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun branchInterfaceId(value: String) {
          this.branchInterfaceId = value
        }
        
        /**
         * [branchInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun branchInterfaceId(value: IntrinsicFunction) {
          this.branchInterfaceId = value
        }
        
        /**
         * [gREKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var gREKey: Any? = null

        /**
         * [gREKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun gREKey(value: Int) {
          this.gREKey = value
        }
        
        /**
         * [gREKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun gREKey(value: IntrinsicFunction) {
          this.gREKey = value
        }
        
        /**
         * [trunkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var trunkInterfaceId: Any? = null

        /**
         * [trunkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun trunkInterfaceId(value: String) {
          this.trunkInterfaceId = value
        }
        
        /**
         * [trunkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun trunkInterfaceId(value: IntrinsicFunction) {
          this.trunkInterfaceId = value
        }
        
        /**
         * [vLANId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var vLANId: Any? = null

        /**
         * [vLANId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun vLANId(value: Int) {
          this.vLANId = value
        }
        
        /**
         * [vLANId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun vLANId(value: IntrinsicFunction) {
          this.vLANId = value
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
 * [AWS::EC2::TrunkInterfaceAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html)
 */
fun Resources.awsEC2TrunkInterfaceAssociation(logicalId: String, init: AWSEC2TrunkInterfaceAssociation.() -> Unit = {}): AWSEC2TrunkInterfaceAssociation {
    return AWSEC2TrunkInterfaceAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
