
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElastiCache::ParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html)
 */
@CloudFormationMarker
class AWSElastiCacheParameterGroup(logicalId: String) : Resource<AWSElastiCacheParameterGroup.Properties>(logicalId, "AWS::ElastiCache::ParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cacheParameterGroupFamily](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var cacheParameterGroupFamily: Any? = null

        /**
         * [cacheParameterGroupFamily](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cacheParameterGroupFamily(value: String) {
          this.cacheParameterGroupFamily = value
        }
        
        /**
         * [cacheParameterGroupFamily](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cacheParameterGroupFamily(value: IntrinsicFunction) {
          this.cacheParameterGroupFamily = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [properties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-properties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var properties: Any? = null

        /**
         * [properties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html#cfn-elasticache-parametergroup-properties)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
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

/**
 * [AWS::ElastiCache::ParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-parameter-group.html)
 */
fun Resources.awsElastiCacheParameterGroup(logicalId: String, init: AWSElastiCacheParameterGroup.() -> Unit = {}): AWSElastiCacheParameterGroup {
    return AWSElastiCacheParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
