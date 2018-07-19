
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
         * [encryptionAtRestOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
         *
         * _Required_: no
         *
         * _Type_: EncryptionAtRestOptions
         */
        @JvmField
        var encryptionAtRestOptions: Any? = null

        /**
         * [encryptionAtRestOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
         *
         * _Required_: no
         *
         * _Type_: EncryptionAtRestOptions
         */
        fun encryptionAtRestOptions(value: EncryptionAtRestOptions) {
          this.encryptionAtRestOptions = value
        }
        
        /**
         * [encryptionAtRestOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
         *
         * _Required_: no
         *
         * _Type_: EncryptionAtRestOptions
         */
        fun encryptionAtRestOptions(value: IntrinsicFunction) {
          this.encryptionAtRestOptions = value
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

        /**
        * [EBSOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html)
        */
        fun eBSOptions(init: EBSOptions.() -> Unit = {}): EBSOptions {
            return EBSOptions().also {
                it.init()
            }
        }
        /**
        * [ElasticsearchClusterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html)
        */
        fun elasticsearchClusterConfig(init: ElasticsearchClusterConfig.() -> Unit = {}): ElasticsearchClusterConfig {
            return ElasticsearchClusterConfig().also {
                it.init()
            }
        }
        /**
        * [EncryptionAtRestOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html)
        */
        fun encryptionAtRestOptions(init: EncryptionAtRestOptions.() -> Unit = {}): EncryptionAtRestOptions {
            return EncryptionAtRestOptions().also {
                it.init()
            }
        }
        /**
        * [SnapshotOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html)
        */
        fun snapshotOptions(init: SnapshotOptions.() -> Unit = {}): SnapshotOptions {
            return SnapshotOptions().also {
                it.init()
            }
        }
        /**
        * [VPCOptions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html)
        */
        fun vPCOptions(init: VPCOptions.() -> Unit = {}): VPCOptions {
            return VPCOptions().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class EBSOptions {
            /**
         * [eBSEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var eBSEnabled: Any? = null

        /**
         * [eBSEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun eBSEnabled(value: Boolean) {
          this.eBSEnabled = value
        }
        
        /**
         * [eBSEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun eBSEnabled(value: IntrinsicFunction) {
          this.eBSEnabled = value
        }

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var volumeSize: Any? = null

        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: Int) {
          this.volumeSize = value
        }
        
        /**
         * [volumeSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun volumeSize(value: IntrinsicFunction) {
          this.volumeSize = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: IntrinsicFunction) {
          this.volumeType = value
        }

    }

    @CloudFormationMarker
    class ElasticsearchClusterConfig {
            /**
         * [dedicatedMasterCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var dedicatedMasterCount: Any? = null

        /**
         * [dedicatedMasterCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun dedicatedMasterCount(value: Int) {
          this.dedicatedMasterCount = value
        }
        
        /**
         * [dedicatedMasterCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastercount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun dedicatedMasterCount(value: IntrinsicFunction) {
          this.dedicatedMasterCount = value
        }

        /**
         * [dedicatedMasterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var dedicatedMasterEnabled: Any? = null

        /**
         * [dedicatedMasterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dedicatedMasterEnabled(value: Boolean) {
          this.dedicatedMasterEnabled = value
        }
        
        /**
         * [dedicatedMasterEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmasterenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun dedicatedMasterEnabled(value: IntrinsicFunction) {
          this.dedicatedMasterEnabled = value
        }

        /**
         * [dedicatedMasterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var dedicatedMasterType: Any? = null

        /**
         * [dedicatedMasterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dedicatedMasterType(value: String) {
          this.dedicatedMasterType = value
        }
        
        /**
         * [dedicatedMasterType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-dedicatedmastertype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dedicatedMasterType(value: IntrinsicFunction) {
          this.dedicatedMasterType = value
        }

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var instanceCount: Any? = null

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun instanceCount(value: Int) {
          this.instanceCount = value
        }
        
        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instancecount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun instanceCount(value: IntrinsicFunction) {
          this.instanceCount = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-instnacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [zoneAwarenessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var zoneAwarenessEnabled: Any? = null

        /**
         * [zoneAwarenessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun zoneAwarenessEnabled(value: Boolean) {
          this.zoneAwarenessEnabled = value
        }
        
        /**
         * [zoneAwarenessEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticseachclusterconfig-zoneawarenessenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun zoneAwarenessEnabled(value: IntrinsicFunction) {
          this.zoneAwarenessEnabled = value
        }

    }

    @CloudFormationMarker
    class EncryptionAtRestOptions {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }

    }

    @CloudFormationMarker
    class SnapshotOptions {
            /**
         * [automatedSnapshotStartHour](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var automatedSnapshotStartHour: Any? = null

        /**
         * [automatedSnapshotStartHour](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun automatedSnapshotStartHour(value: Int) {
          this.automatedSnapshotStartHour = value
        }
        
        /**
         * [automatedSnapshotStartHour](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun automatedSnapshotStartHour(value: IntrinsicFunction) {
          this.automatedSnapshotStartHour = value
        }

    }

    @CloudFormationMarker
    class VPCOptions {
            /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }

    }

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
