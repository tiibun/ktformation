
package ktformation.generated

import ktformation.*

/**
 * [AWS::Elasticsearch::Domain - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html)
 */
@CloudFormationMarker
class AWSElasticsearchDomain(logicalId: String) : Resource<AWSElasticsearchDomain.Properties>(logicalId, "AWS::Elasticsearch::Domain") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [accessPolicies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var accessPolicies: Any? = null

        /**
         * [accessPolicies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun accessPolicies(value: Json) {
          this.accessPolicies = value
        }
        
        /**
         * [accessPolicies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun accessPolicies(value: IntrinsicFunction) {
          this.accessPolicies = value
        }
        
        /**
         * [advancedOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var advancedOptions: Any? = null

        /**
         * [advancedOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun advancedOptions(value: Map<String, Any>) {
          this.advancedOptions = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }
        
        /**
         * [eBSOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
         *
         * _Required_: no
         *
         * _Type_: EBSOptions
         */
        @JvmField
        var eBSOptions: Any? = null

        /**
         * [eBSOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
         *
         * _Required_: no
         *
         * _Type_: EBSOptions
         */
        fun eBSOptions(value: EBSOptions) {
          this.eBSOptions = value
        }
        
        /**
         * [eBSOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
         *
         * _Required_: no
         *
         * _Type_: EBSOptions
         */
        fun eBSOptions(value: IntrinsicFunction) {
          this.eBSOptions = value
        }
        
        /**
         * [elasticsearchClusterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchClusterConfig
         */
        @JvmField
        var elasticsearchClusterConfig: Any? = null

        /**
         * [elasticsearchClusterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchClusterConfig
         */
        fun elasticsearchClusterConfig(value: ElasticsearchClusterConfig) {
          this.elasticsearchClusterConfig = value
        }
        
        /**
         * [elasticsearchClusterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
         *
         * _Required_: no
         *
         * _Type_: ElasticsearchClusterConfig
         */
        fun elasticsearchClusterConfig(value: IntrinsicFunction) {
          this.elasticsearchClusterConfig = value
        }
        
        /**
         * [elasticsearchVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var elasticsearchVersion: Any? = null

        /**
         * [elasticsearchVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun elasticsearchVersion(value: String) {
          this.elasticsearchVersion = value
        }
        
        /**
         * [elasticsearchVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun elasticsearchVersion(value: IntrinsicFunction) {
          this.elasticsearchVersion = value
        }
        
        /**
         * [snapshotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
         *
         * _Required_: no
         *
         * _Type_: SnapshotOptions
         */
        @JvmField
        var snapshotOptions: Any? = null

        /**
         * [snapshotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
         *
         * _Required_: no
         *
         * _Type_: SnapshotOptions
         */
        fun snapshotOptions(value: SnapshotOptions) {
          this.snapshotOptions = value
        }
        
        /**
         * [snapshotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
         *
         * _Required_: no
         *
         * _Type_: SnapshotOptions
         */
        fun snapshotOptions(value: IntrinsicFunction) {
          this.snapshotOptions = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [vPCOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
         *
         * _Required_: no
         *
         * _Type_: VPCOptions
         */
        @JvmField
        var vPCOptions: Any? = null

        /**
         * [vPCOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
         *
         * _Required_: no
         *
         * _Type_: VPCOptions
         */
        fun vPCOptions(value: VPCOptions) {
          this.vPCOptions = value
        }
        
        /**
         * [vPCOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
         *
         * _Required_: no
         *
         * _Type_: VPCOptions
         */
        fun vPCOptions(value: IntrinsicFunction) {
          this.vPCOptions = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EBSOptions(
            /**
             * [EBSEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val eBSEnabled: Boolean? = null,
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [VolumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val volumeSize: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

    class ElasticsearchClusterConfig(
            /**
             * [DedicatedMasterCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val dedicatedMasterCount: Int? = null,
            /**
             * [DedicatedMasterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val dedicatedMasterEnabled: Boolean? = null,
            /**
             * [DedicatedMasterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val dedicatedMasterType: String? = null,
            /**
             * [InstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val instanceCount: Int? = null,
            /**
             * [InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val instanceType: String? = null,
            /**
             * [ZoneAwarenessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val zoneAwarenessEnabled: Boolean? = null
    )

    class SnapshotOptions(
            /**
             * [AutomatedSnapshotStartHour](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val automatedSnapshotStartHour: Int? = null
    )

    class VPCOptions(
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>? = null,
            /**
             * [SubnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val subnetIds: List<String>? = null
    )

}

/**
 * [AWS::Elasticsearch::Domain - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html)
 */
fun Resources.awsElasticsearchDomain(logicalId: String, init: AWSElasticsearchDomain.() -> Unit = {}): AWSElasticsearchDomain {
    return AWSElasticsearchDomain(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
