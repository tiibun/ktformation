
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceDiscovery::Service - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
 */
@CloudFormationMarker
class AWSServiceDiscoveryService(logicalId: String) : Resource<AWSServiceDiscoveryService.Properties>(logicalId, "AWS::ServiceDiscovery::Service") {

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
        @JvmField
        var dnsConfig: Any? = null

        fun dnsConfig(value: DnsConfig) {
          this.dnsConfig = value
        }
        fun dnsConfig(value: IntrinsicFunction) {
  this.dnsConfig = value
}
        @JvmField
        var healthCheckConfig: Any? = null

        fun healthCheckConfig(value: HealthCheckConfig) {
          this.healthCheckConfig = value
        }
        fun healthCheckConfig(value: IntrinsicFunction) {
  this.healthCheckConfig = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DnsConfig(
            val dnsRecords: List<DnsRecord>,
            val namespaceId: String
    )

    class DnsRecord(
            val tTL: String,
            val type: String
    )

    class HealthCheckConfig(
            val failureThreshold: Double? = null,
            val resourcePath: String? = null,
            val type: String
    )

}

fun Resources.awsServiceDiscoveryService(logicalId: String, init: AWSServiceDiscoveryService.() -> Unit = {}): AWSServiceDiscoveryService {
    return AWSServiceDiscoveryService(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
