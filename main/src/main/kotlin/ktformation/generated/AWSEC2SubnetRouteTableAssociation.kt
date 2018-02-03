
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::SubnetRouteTableAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html)
 */
@CloudFormationMarker
class AWSEC2SubnetRouteTableAssociation(logicalId: String) : Resource<AWSEC2SubnetRouteTableAssociation.Properties>(logicalId, "AWS::EC2::SubnetRouteTableAssociation") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [routeTableId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var routeTableId: Any? = null

        /**
         * [routeTableId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun routeTableId(value: String) {
          this.routeTableId = value
        }
        
        /**
         * [routeTableId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun routeTableId(value: IntrinsicFunction) {
          this.routeTableId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
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
 * [AWS::EC2::SubnetRouteTableAssociation - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html)
 */
fun Resources.awsEC2SubnetRouteTableAssociation(logicalId: String, init: AWSEC2SubnetRouteTableAssociation.() -> Unit = {}): AWSEC2SubnetRouteTableAssociation {
    return AWSEC2SubnetRouteTableAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
