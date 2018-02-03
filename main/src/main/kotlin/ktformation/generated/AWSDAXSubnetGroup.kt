
package ktformation.generated

import ktformation.*

/**
 * [AWS::DAX::SubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
 */
@CloudFormationMarker
class AWSDAXSubnetGroup(logicalId: String) : Resource<AWSDAXSubnetGroup.Properties>(logicalId, "AWS::DAX::SubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var subnetGroupName: Any? = null

        fun subnetGroupName(value: String) {
          this.subnetGroupName = value
        }
        
        fun subnetGroupName(value: IntrinsicFunction) {
          this.subnetGroupName = value
        }
        
        @JvmField
        var subnetIds: Any? = null

        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsDAXSubnetGroup(logicalId: String, init: AWSDAXSubnetGroup.() -> Unit = {}): AWSDAXSubnetGroup {
    return AWSDAXSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
