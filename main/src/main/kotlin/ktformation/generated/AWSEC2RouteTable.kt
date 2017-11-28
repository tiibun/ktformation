
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::RouteTable - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html)
 */
@CloudFormationMarker
class AWSEC2RouteTable(logicalId: String) : Resource<AWSEC2RouteTable.Properties>(logicalId, "AWS::EC2::RouteTable") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var vpcId: Any? = null
        fun vpcId(value: String) { this.vpcId = value }
        fun vpcId(value: IntrinsicFunction) { this.vpcId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2RouteTable(logicalId: String, init: AWSEC2RouteTable.() -> Unit = {}): AWSEC2RouteTable {
    return AWSEC2RouteTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
