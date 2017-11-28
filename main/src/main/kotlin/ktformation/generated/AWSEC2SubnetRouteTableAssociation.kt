
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SubnetRouteTableAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html)
 */
@CloudFormationMarker
class AWSEC2SubnetRouteTableAssociation(logicalId: String) : Resource<AWSEC2SubnetRouteTableAssociation.Properties>(logicalId, "AWS::EC2::SubnetRouteTableAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var routeTableId: Any? = null
        fun routeTableId(value: String) { this.routeTableId = value }
        fun routeTableId(value: IntrinsicFunction) { this.routeTableId = value }
        @JvmField var subnetId: Any? = null
        fun subnetId(value: String) { this.subnetId = value }
        fun subnetId(value: IntrinsicFunction) { this.subnetId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2SubnetRouteTableAssociation(logicalId: String, init: AWSEC2SubnetRouteTableAssociation.() -> Unit = {}): AWSEC2SubnetRouteTableAssociation {
    return AWSEC2SubnetRouteTableAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
