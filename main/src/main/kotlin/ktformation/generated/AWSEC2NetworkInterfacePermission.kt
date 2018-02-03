
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkInterfacePermission - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
 */
@CloudFormationMarker
class AWSEC2NetworkInterfacePermission(logicalId: String) : Resource<AWSEC2NetworkInterfacePermission.Properties>(logicalId, "AWS::EC2::NetworkInterfacePermission") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [awsAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var awsAccountId: Any? = null

        /**
         * [awsAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun awsAccountId(value: String) {
          this.awsAccountId = value
        }
        
        /**
         * [awsAccountId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-awsaccountid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun awsAccountId(value: IntrinsicFunction) {
          this.awsAccountId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var networkInterfaceId: Any? = null

        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        /**
         * [networkInterfaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-networkinterfaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }
        
        /**
         * [permission](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var permission: Any? = null

        /**
         * [permission](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun permission(value: String) {
          this.permission = value
        }
        
        /**
         * [permission](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html#cfn-ec2-networkinterfacepermission-permission)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun permission(value: IntrinsicFunction) {
          this.permission = value
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
 * [AWS::EC2::NetworkInterfacePermission - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
 */
fun Resources.awsEC2NetworkInterfacePermission(logicalId: String, init: AWSEC2NetworkInterfacePermission.() -> Unit = {}): AWSEC2NetworkInterfacePermission {
    return AWSEC2NetworkInterfacePermission(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
