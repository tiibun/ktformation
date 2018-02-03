
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::TrunkInterfaceAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html)
 */
@CloudFormationMarker
class AWSEC2TrunkInterfaceAssociation(logicalId: String) : Resource<AWSEC2TrunkInterfaceAssociation.Properties>(logicalId, "AWS::EC2::TrunkInterfaceAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var branchInterfaceId: Any? = null

        fun branchInterfaceId(value: String) {
          this.branchInterfaceId = value
        }
        
        fun branchInterfaceId(value: IntrinsicFunction) {
          this.branchInterfaceId = value
        }
        
        @JvmField
        var gREKey: Any? = null

        fun gREKey(value: Int) {
          this.gREKey = value
        }
        
        fun gREKey(value: IntrinsicFunction) {
          this.gREKey = value
        }
        
        @JvmField
        var trunkInterfaceId: Any? = null

        fun trunkInterfaceId(value: String) {
          this.trunkInterfaceId = value
        }
        
        fun trunkInterfaceId(value: IntrinsicFunction) {
          this.trunkInterfaceId = value
        }
        
        @JvmField
        var vLANId: Any? = null

        fun vLANId(value: Int) {
          this.vLANId = value
        }
        
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

fun Resources.awsEC2TrunkInterfaceAssociation(logicalId: String, init: AWSEC2TrunkInterfaceAssociation.() -> Unit = {}): AWSEC2TrunkInterfaceAssociation {
    return AWSEC2TrunkInterfaceAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
