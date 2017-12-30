
package ktformation.generated

import ktformation.*

/**
 * [AWS::Elasticsearch::Domain - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html)
 */
@CloudFormationMarker
class AWSElasticsearchDomain(logicalId: String) : Resource<AWSElasticsearchDomain.Properties>(logicalId, "AWS::Elasticsearch::Domain") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var accessPolicies: Any? = null
        fun accessPolicies(value: Json) {
            this.accessPolicies = value
        }
        fun accessPolicies(value: IntrinsicFunction) { this.accessPolicies = value }
        @JvmField var advancedOptions: Any? = null
        fun advancedOptions(value: Map<String, Any>) {
            this.advancedOptions = value
        }

        @JvmField var domainName: Any? = null
        fun domainName(value: String) {
            this.domainName = value
        }
        fun domainName(value: IntrinsicFunction) { this.domainName = value }
        @JvmField var eBSOptions: Any? = null
        fun eBSOptions(value: EBSOptions) {
            this.eBSOptions = value
        }
        fun eBSOptions(value: IntrinsicFunction) { this.eBSOptions = value }
        @JvmField var elasticsearchClusterConfig: Any? = null
        fun elasticsearchClusterConfig(value: ElasticsearchClusterConfig) {
            this.elasticsearchClusterConfig = value
        }
        fun elasticsearchClusterConfig(value: IntrinsicFunction) { this.elasticsearchClusterConfig = value }
        @JvmField var elasticsearchVersion: Any? = null
        fun elasticsearchVersion(value: String) {
            this.elasticsearchVersion = value
        }
        fun elasticsearchVersion(value: IntrinsicFunction) { this.elasticsearchVersion = value }
        @JvmField var snapshotOptions: Any? = null
        fun snapshotOptions(value: SnapshotOptions) {
            this.snapshotOptions = value
        }
        fun snapshotOptions(value: IntrinsicFunction) { this.snapshotOptions = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var vPCOptions: Any? = null
        fun vPCOptions(value: VPCOptions) {
            this.vPCOptions = value
        }
        fun vPCOptions(value: IntrinsicFunction) { this.vPCOptions = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class EBSOptions(
            val eBSEnabled: Boolean? = null,
            val iops: Int? = null,
            val volumeSize: Int? = null,
            val volumeType: String? = null
    )

    class ElasticsearchClusterConfig(
            val dedicatedMasterCount: Int? = null,
            val dedicatedMasterEnabled: Boolean? = null,
            val dedicatedMasterType: String? = null,
            val instanceCount: Int? = null,
            val instanceType: String? = null,
            val zoneAwarenessEnabled: Boolean? = null
    )

    class SnapshotOptions(
            val automatedSnapshotStartHour: Int? = null
    )

    class VPCOptions(
            val securityGroupIds: List<String>? = null,
            val subnetIds: List<String>? = null
    )

}

fun Resources.awsElasticsearchDomain(logicalId: String, init: AWSElasticsearchDomain.() -> Unit = {}): AWSElasticsearchDomain {
    return AWSElasticsearchDomain(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
