
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::SubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
 */
@CloudFormationMarker
class AWSElastiCacheSubnetGroup(logicalId: String) : Resource<AWSElastiCacheSubnetGroup.Properties>(logicalId, "AWS::ElastiCache::SubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cacheSubnetGroupName: Any? = null
        fun cacheSubnetGroupName(value: String) {
            this.cacheSubnetGroupName = value
        }
        fun cacheSubnetGroupName(value: IntrinsicFunction) { this.cacheSubnetGroupName = value }
        @JvmField var description: Any? = null
        fun description(value: String) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var subnetIds: Any? = null
        fun subnetIds(value: List<String>) { this.subnetIds = value }
        fun subnetIds(vararg value: IntrinsicFunction) { this.subnetIds = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsElastiCacheSubnetGroup(logicalId: String, init: AWSElastiCacheSubnetGroup.() -> Unit = {}): AWSElastiCacheSubnetGroup {
    return AWSElastiCacheSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
