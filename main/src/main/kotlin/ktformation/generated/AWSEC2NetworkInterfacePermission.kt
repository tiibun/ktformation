
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkInterfacePermission - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfacepermission.html)
 */
@CloudFormationMarker
class AWSEC2NetworkInterfacePermission(logicalId: String) : Resource<AWSEC2NetworkInterfacePermission.Properties>(logicalId, "AWS::EC2::NetworkInterfacePermission") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var awsAccountId: Any? = null

        fun awsAccountId(value: String) {
          this.awsAccountId = value
        }
        
        fun awsAccountId(value: IntrinsicFunction) {
          this.awsAccountId = value
        }
        
        @JvmField
        var networkInterfaceId: Any? = null

        fun networkInterfaceId(value: String) {
          this.networkInterfaceId = value
        }
        
        fun networkInterfaceId(value: IntrinsicFunction) {
          this.networkInterfaceId = value
        }
        
        @JvmField
        var permission: Any? = null

        fun permission(value: String) {
          this.permission = value
        }
        
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

fun Resources.awsEC2NetworkInterfacePermission(logicalId: String, init: AWSEC2NetworkInterfacePermission.() -> Unit = {}): AWSEC2NetworkInterfacePermission {
    return AWSEC2NetworkInterfacePermission(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
