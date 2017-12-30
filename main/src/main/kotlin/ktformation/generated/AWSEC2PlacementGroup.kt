
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::PlacementGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html)
 */
@CloudFormationMarker
class AWSEC2PlacementGroup(logicalId: String) : Resource<AWSEC2PlacementGroup.Properties>(logicalId, "AWS::EC2::PlacementGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var strategy: Any? = null
        fun strategy(value: String) {
            this.strategy = value
        }
        fun strategy(value: IntrinsicFunction) { this.strategy = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2PlacementGroup(logicalId: String, init: AWSEC2PlacementGroup.() -> Unit = {}): AWSEC2PlacementGroup {
    return AWSEC2PlacementGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
