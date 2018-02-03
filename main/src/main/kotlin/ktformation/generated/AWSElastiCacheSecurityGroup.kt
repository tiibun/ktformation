
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::SecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group.html)
 */
@CloudFormationMarker
class AWSElastiCacheSecurityGroup(logicalId: String) : Resource<AWSElastiCacheSecurityGroup.Properties>(logicalId, "AWS::ElastiCache::SecurityGroup") {

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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsElastiCacheSecurityGroup(logicalId: String, init: AWSElastiCacheSecurityGroup.() -> Unit = {}): AWSElastiCacheSecurityGroup {
    return AWSElastiCacheSecurityGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
