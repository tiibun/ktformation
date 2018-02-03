
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::SubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
 */
@CloudFormationMarker
class AWSElastiCacheSubnetGroup(logicalId: String) : Resource<AWSElastiCacheSubnetGroup.Properties>(logicalId, "AWS::ElastiCache::SubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheSubnetGroupName: Any? = null

        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheSubnetGroupName(value: String) {
          this.cacheSubnetGroupName = value
        }
        
        /**
         * [cacheSubnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheSubnetGroupName(value: IntrinsicFunction) {
          this.cacheSubnetGroupName = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
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
 * [AWS::ElastiCache::SubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
 */
fun Resources.awsElastiCacheSubnetGroup(logicalId: String, init: AWSElastiCacheSubnetGroup.() -> Unit = {}): AWSElastiCacheSubnetGroup {
    return AWSElastiCacheSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
