
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::SecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html)
 */
@CloudFormationMarker
class AWSElastiCacheSecurityGroupIngress(logicalId: String) : Resource<AWSElastiCacheSecurityGroupIngress.Properties>(logicalId, "AWS::ElastiCache::SecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cacheSecurityGroupName: Any? = null

        fun cacheSecurityGroupName(value: String) {
          this.cacheSecurityGroupName = value
        }
        fun cacheSecurityGroupName(value: IntrinsicFunction) {
  this.cacheSecurityGroupName = value
}
        @JvmField
        var eC2SecurityGroupName: Any? = null

        fun eC2SecurityGroupName(value: String) {
          this.eC2SecurityGroupName = value
        }
        fun eC2SecurityGroupName(value: IntrinsicFunction) {
  this.eC2SecurityGroupName = value
}
        @JvmField
        var eC2SecurityGroupOwnerId: Any? = null

        fun eC2SecurityGroupOwnerId(value: String) {
          this.eC2SecurityGroupOwnerId = value
        }
        fun eC2SecurityGroupOwnerId(value: IntrinsicFunction) {
  this.eC2SecurityGroupOwnerId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsElastiCacheSecurityGroupIngress(logicalId: String, init: AWSElastiCacheSecurityGroupIngress.() -> Unit = {}): AWSElastiCacheSecurityGroupIngress {
    return AWSElastiCacheSecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
