
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
         * [healthCheckCustomConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
         *
         * _Required_: no
         *
         * _Type_: HealthCheckCustomConfig
         */
        @JvmField
        var healthCheckCustomConfig: Any? = null

        /**
         * [healthCheckCustomConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
         *
         * _Required_: no
         *
         * _Type_: HealthCheckCustomConfig
         */
        fun healthCheckCustomConfig(value: HealthCheckCustomConfig) {
          this.healthCheckCustomConfig = value
        }
        
        /**
         * [healthCheckCustomConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
         *
         * _Required_: no
         *
         * _Type_: HealthCheckCustomConfig
         */
        fun healthCheckCustomConfig(value: IntrinsicFunction) {
          this.healthCheckCustomConfig = value
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

        /**
        * [DnsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
        */
        fun dnsConfig(init: DnsConfig.() -> Unit = {}): DnsConfig {
            return DnsConfig().also {
                it.init()
            }
        }
        /**
        * [DnsRecord](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html)
        */
        fun dnsRecord(init: DnsRecord.() -> Unit = {}): DnsRecord {
            return DnsRecord().also {
                it.init()
            }
        }
        /**
        * [HealthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html)
        */
        fun healthCheckConfig(init: HealthCheckConfig.() -> Unit = {}): HealthCheckConfig {
            return HealthCheckConfig().also {
                it.init()
            }
        }
        /**
        * [HealthCheckCustomConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html)
        */
        fun healthCheckCustomConfig(init: HealthCheckCustomConfig.() -> Unit = {}): HealthCheckCustomConfig {
            return HealthCheckCustomConfig().also {
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
    class DnsConfig {
            /**
         * [dnsRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords)
         *
         * _Required_: yes
         *
         * _Type_: List<DnsRecord>
         */
        var dnsRecords: Any? = null

        /**
         * [dnsRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords)
         *
         * _Required_: yes
         *
         * _Type_: List<DnsRecord>
         */
        fun dnsRecords(value: List<DnsRecord>) {
          this.dnsRecords = value
        }
        
        /**
         * [dnsRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords)
         *
         * _Required_: yes
         *
         * _Type_: List<DnsRecord>
         */
        fun dnsRecords(vararg value: IntrinsicFunction) {
          this.dnsRecords = value
        }

        /**
         * [namespaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var namespaceId: Any? = null

        /**
         * [namespaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespaceId(value: String) {
          this.namespaceId = value
        }
        
        /**
         * [namespaceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun namespaceId(value: IntrinsicFunction) {
          this.namespaceId = value
        }

        /**
         * [routingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var routingPolicy: Any? = null

        /**
         * [routingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun routingPolicy(value: String) {
          this.routingPolicy = value
        }
        
        /**
         * [routingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun routingPolicy(value: IntrinsicFunction) {
          this.routingPolicy = value
        }

    }

    @CloudFormationMarker
    class DnsRecord {
            /**
         * [tTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var tTL: Any? = null

        /**
         * [tTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tTL(value: String) {
          this.tTL = value
        }
        
        /**
         * [tTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tTL(value: IntrinsicFunction) {
          this.tTL = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class HealthCheckConfig {
            /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var failureThreshold: Any? = null

        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun failureThreshold(value: Double) {
          this.failureThreshold = value
        }
        
        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun failureThreshold(value: IntrinsicFunction) {
          this.failureThreshold = value
        }

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourcePath: Any? = null

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: String) {
          this.resourcePath = value
        }
        
        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: IntrinsicFunction) {
          this.resourcePath = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class HealthCheckCustomConfig {
            /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var failureThreshold: Any? = null

        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun failureThreshold(value: Double) {
          this.failureThreshold = value
        }
        
        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun failureThreshold(value: IntrinsicFunction) {
          this.failureThreshold = value
        }

    }

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
