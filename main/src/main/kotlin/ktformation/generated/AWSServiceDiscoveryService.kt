
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceDiscovery::Service - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
 */
@CloudFormationMarker
class AWSServiceDiscoveryService(logicalId: String) : Resource<AWSServiceDiscoveryService.Properties>(logicalId, "AWS::ServiceDiscovery::Service") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [dnsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-dnsconfig)
         *
         * _Required_: yes
         *
         * _Type_: DnsConfig
         */
        @JvmField
        var dnsConfig: Any? = null

        /**
         * [dnsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-dnsconfig)
         *
         * _Required_: yes
         *
         * _Type_: DnsConfig
         */
        fun dnsConfig(value: DnsConfig) {
          this.dnsConfig = value
        }
        
        /**
         * [dnsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-dnsconfig)
         *
         * _Required_: yes
         *
         * _Type_: DnsConfig
         */
        fun dnsConfig(value: IntrinsicFunction) {
          this.dnsConfig = value
        }
        
        /**
         * [healthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
         *
         * _Required_: no
         *
         * _Type_: HealthCheckConfig
         */
        @JvmField
        var healthCheckConfig: Any? = null

        /**
         * [healthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
         *
         * _Required_: no
         *
         * _Type_: HealthCheckConfig
         */
        fun healthCheckConfig(value: HealthCheckConfig) {
          this.healthCheckConfig = value
        }
        
        /**
         * [healthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
         *
         * _Required_: no
         *
         * _Type_: HealthCheckConfig
         */
        fun healthCheckConfig(value: IntrinsicFunction) {
          this.healthCheckConfig = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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
            /**
             * [DnsRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords)
             *
             * _Required_: yes
             *
             * _Type_: List<DnsRecord>
             */
            val dnsRecords: List<DnsRecord>,
            /**
             * [NamespaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val namespaceId: String
    )

    class DnsRecord(
            /**
             * [TTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val tTL: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class HealthCheckConfig(
            /**
             * [FailureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val failureThreshold: Double? = null,
            /**
             * [ResourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourcePath: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

}

/**
 * [AWS::ServiceDiscovery::Service - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
 */
fun Resources.awsServiceDiscoveryService(logicalId: String, init: AWSServiceDiscoveryService.() -> Unit = {}): AWSServiceDiscoveryService {
    return AWSServiceDiscoveryService(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
