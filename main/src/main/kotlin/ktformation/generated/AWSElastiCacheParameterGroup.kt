
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::ParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html)
 */
@CloudFormationMarker
class AWSElastiCacheParameterGroup(logicalId: String) : Resource<AWSElastiCacheParameterGroup.Properties>(logicalId, "AWS::ElastiCache::ParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cacheParameterGroupFamily: Any? = null

        fun cacheParameterGroupFamily(value: String) {
          this.cacheParameterGroupFamily = value
        }
        
        fun cacheParameterGroupFamily(value: IntrinsicFunction) {
          this.cacheParameterGroupFamily = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var properties: Any? = null

        fun properties(value: Map<String, Any>) {
          this.properties = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsElastiCacheParameterGroup(logicalId: String, init: AWSElastiCacheParameterGroup.() -> Unit = {}): AWSElastiCacheParameterGroup {
    return AWSElastiCacheParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
