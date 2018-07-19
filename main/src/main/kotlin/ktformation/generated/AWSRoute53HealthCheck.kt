
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::HealthCheck - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html)
 */
@CloudFormationMarker
class AWSRoute53HealthCheck(logicalId: String) : Resource<AWSRoute53HealthCheck.Properties>(logicalId, "AWS::Route53::HealthCheck") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [healthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
         *
         * _Required_: yes
         *
         * _Type_: HealthCheckConfig
         */
        @JvmField
        var healthCheckConfig: Any? = null

        /**
         * [healthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
         *
         * _Required_: yes
         *
         * _Type_: HealthCheckConfig
         */
        fun healthCheckConfig(value: HealthCheckConfig) {
          this.healthCheckConfig = value
        }
        
        /**
         * [healthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthcheckconfig)
         *
         * _Required_: yes
         *
         * _Type_: HealthCheckConfig
         */
        fun healthCheckConfig(value: IntrinsicFunction) {
          this.healthCheckConfig = value
        }

        /**
         * [healthCheckTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
         *
         * _Required_: no
         *
         * _Type_: List<HealthCheckTag>
         */
        @JvmField
        var healthCheckTags: Any? = null

        /**
         * [healthCheckTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
         *
         * _Required_: no
         *
         * _Type_: List<HealthCheckTag>
         */
        fun healthCheckTags(value: List<HealthCheckTag>) {
          this.healthCheckTags = value
        }
        
        /**
         * [healthCheckTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html#cfn-route53-healthcheck-healthchecktags)
         *
         * _Required_: no
         *
         * _Type_: List<HealthCheckTag>
         */
        fun healthCheckTags(vararg value: IntrinsicFunction) {
          this.healthCheckTags = value
        }

        /**
        * [AlarmIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html)
        */
        fun alarmIdentifier(init: AlarmIdentifier.() -> Unit = {}): AlarmIdentifier {
            return AlarmIdentifier().also {
                it.init()
            }
        }
        /**
        * [HealthCheckConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html)
        */
        fun healthCheckConfig(init: HealthCheckConfig.() -> Unit = {}): HealthCheckConfig {
            return HealthCheckConfig().also {
                it.init()
            }
        }
        /**
        * [HealthCheckTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html)
        */
        fun healthCheckTag(init: HealthCheckTag.() -> Unit = {}): HealthCheckTag {
            return HealthCheckTag().also {
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
    class AlarmIdentifier {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var region: Any? = null

        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun region(value: String) {
          this.region = value
        }
        
        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun region(value: IntrinsicFunction) {
          this.region = value
        }

    }

    @CloudFormationMarker
    class HealthCheckConfig {
            /**
         * [alarmIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-alarmidentifier)
         *
         * _Required_: no
         *
         * _Type_: AlarmIdentifier
         */
        var alarmIdentifier: Any? = null

        /**
         * [alarmIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-alarmidentifier)
         *
         * _Required_: no
         *
         * _Type_: AlarmIdentifier
         */
        fun alarmIdentifier(value: AlarmIdentifier) {
          this.alarmIdentifier = value
        }
        
        /**
         * [alarmIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-alarmidentifier)
         *
         * _Required_: no
         *
         * _Type_: AlarmIdentifier
         */
        fun alarmIdentifier(value: IntrinsicFunction) {
          this.alarmIdentifier = value
        }

        /**
         * [childHealthChecks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var childHealthChecks: Any? = null

        /**
         * [childHealthChecks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun childHealthChecks(value: List<String>) {
          this.childHealthChecks = value
        }
        
        /**
         * [childHealthChecks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun childHealthChecks(vararg value: IntrinsicFunction) {
          this.childHealthChecks = value
        }

        /**
         * [enableSNI](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enableSNI: Any? = null

        /**
         * [enableSNI](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSNI(value: Boolean) {
          this.enableSNI = value
        }
        
        /**
         * [enableSNI](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSNI(value: IntrinsicFunction) {
          this.enableSNI = value
        }

        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var failureThreshold: Any? = null

        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun failureThreshold(value: Int) {
          this.failureThreshold = value
        }
        
        /**
         * [failureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun failureThreshold(value: IntrinsicFunction) {
          this.failureThreshold = value
        }

        /**
         * [fullyQualifiedDomainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var fullyQualifiedDomainName: Any? = null

        /**
         * [fullyQualifiedDomainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fullyQualifiedDomainName(value: String) {
          this.fullyQualifiedDomainName = value
        }
        
        /**
         * [fullyQualifiedDomainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun fullyQualifiedDomainName(value: IntrinsicFunction) {
          this.fullyQualifiedDomainName = value
        }

        /**
         * [healthThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var healthThreshold: Any? = null

        /**
         * [healthThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthThreshold(value: Int) {
          this.healthThreshold = value
        }
        
        /**
         * [healthThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthThreshold(value: IntrinsicFunction) {
          this.healthThreshold = value
        }

        /**
         * [iPAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var iPAddress: Any? = null

        /**
         * [iPAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iPAddress(value: String) {
          this.iPAddress = value
        }
        
        /**
         * [iPAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun iPAddress(value: IntrinsicFunction) {
          this.iPAddress = value
        }

        /**
         * [insufficientDataHealthStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var insufficientDataHealthStatus: Any? = null

        /**
         * [insufficientDataHealthStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun insufficientDataHealthStatus(value: String) {
          this.insufficientDataHealthStatus = value
        }
        
        /**
         * [insufficientDataHealthStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun insufficientDataHealthStatus(value: IntrinsicFunction) {
          this.insufficientDataHealthStatus = value
        }

        /**
         * [inverted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var inverted: Any? = null

        /**
         * [inverted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun inverted(value: Boolean) {
          this.inverted = value
        }
        
        /**
         * [inverted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun inverted(value: IntrinsicFunction) {
          this.inverted = value
        }

        /**
         * [measureLatency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var measureLatency: Any? = null

        /**
         * [measureLatency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun measureLatency(value: Boolean) {
          this.measureLatency = value
        }
        
        /**
         * [measureLatency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun measureLatency(value: IntrinsicFunction) {
          this.measureLatency = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [regions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var regions: Any? = null

        /**
         * [regions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun regions(value: List<String>) {
          this.regions = value
        }
        
        /**
         * [regions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-regions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun regions(vararg value: IntrinsicFunction) {
          this.regions = value
        }

        /**
         * [requestInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var requestInterval: Any? = null

        /**
         * [requestInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun requestInterval(value: Int) {
          this.requestInterval = value
        }
        
        /**
         * [requestInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun requestInterval(value: IntrinsicFunction) {
          this.requestInterval = value
        }

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resourcePath: Any? = null

        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: String) {
          this.resourcePath = value
        }
        
        /**
         * [resourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resourcePath(value: IntrinsicFunction) {
          this.resourcePath = value
        }

        /**
         * [searchString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var searchString: Any? = null

        /**
         * [searchString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun searchString(value: String) {
          this.searchString = value
        }
        
        /**
         * [searchString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun searchString(value: IntrinsicFunction) {
          this.searchString = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type)
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
    class HealthCheckTag {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

}

/**
 * [AWS::Route53::HealthCheck - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html)
 */
fun Resources.awsRoute53HealthCheck(logicalId: String, init: AWSRoute53HealthCheck.() -> Unit = {}): AWSRoute53HealthCheck {
    return AWSRoute53HealthCheck(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
