
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::RouteTable - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html)
 */
@CloudFormationMarker
class AWSEC2RouteTable(logicalId: String) : Resource<AWSEC2RouteTable.Properties>(logicalId, "AWS::EC2::RouteTable") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html#cfn-ec2-routetable-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html#cfn-ec2-routetable-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html#cfn-ec2-routetable-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html#cfn-ec2-routetable-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html#cfn-ec2-routetable-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html#cfn-ec2-routetable-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
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
 * [AWS::EC2::RouteTable - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route-table.html)
 */
fun Resources.awsEC2RouteTable(logicalId: String, init: AWSEC2RouteTable.() -> Unit = {}): AWSEC2RouteTable {
    return AWSEC2RouteTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
