
package ktformation.generated

import ktformation.*

/**
 * [AWS::DAX::SubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
 */
@CloudFormationMarker
class AWSDAXSubnetGroup(logicalId: String) : Resource<AWSDAXSubnetGroup.Properties>(logicalId, "AWS::DAX::SubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [subnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subnetGroupName: Any? = null

        /**
         * [subnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetGroupName(value: String) {
          this.subnetGroupName = value
        }
        
        /**
         * [subnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetGroupName(value: IntrinsicFunction) {
          this.subnetGroupName = value
        }

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html#cfn-dax-subnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
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

/**
 * [AWS::DAX::SubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
 */
fun Resources.awsDAXSubnetGroup(logicalId: String, init: AWSDAXSubnetGroup.() -> Unit = {}): AWSDAXSubnetGroup {
    return AWSDAXSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
