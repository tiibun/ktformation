
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::SecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html)
 */
@CloudFormationMarker
class AWSElastiCacheSecurityGroupIngress(logicalId: String) : Resource<AWSElastiCacheSecurityGroupIngress.Properties>(logicalId, "AWS::ElastiCache::SecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cacheSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var cacheSecurityGroupName: Any? = null

        /**
         * [cacheSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cacheSecurityGroupName(value: String) {
          this.cacheSecurityGroupName = value
        }
        
        /**
         * [cacheSecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cacheSecurityGroupName(value: IntrinsicFunction) {
          this.cacheSecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupName: Any? = null

        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: String) {
          this.eC2SecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eC2SecurityGroupName(value: IntrinsicFunction) {
          this.eC2SecurityGroupName = value
        }
        
        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eC2SecurityGroupOwnerId: Any? = null

        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eC2SecurityGroupOwnerId(value: String) {
          this.eC2SecurityGroupOwnerId = value
        }
        
        /**
         * [eC2SecurityGroupOwnerId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::ElastiCache::SecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html)
 */
fun Resources.awsElastiCacheSecurityGroupIngress(logicalId: String, init: AWSElastiCacheSecurityGroupIngress.() -> Unit = {}): AWSElastiCacheSecurityGroupIngress {
    return AWSElastiCacheSecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
