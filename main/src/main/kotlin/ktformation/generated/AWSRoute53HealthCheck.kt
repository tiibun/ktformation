
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AlarmIdentifier(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html#cfn-route53-healthcheck-alarmidentifier-region)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val region: String
    )

    class HealthCheckConfig(
            /**
             * [AlarmIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-alarmidentifier)
             *
             * _Required_: no
             *
             * _Type_: AlarmIdentifier
             */
            val alarmIdentifier: AlarmIdentifier? = null,
            /**
             * [ChildHealthChecks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-childhealthchecks)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val childHealthChecks: List<String>? = null,
            /**
             * [EnableSNI](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-enablesni)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enableSNI: Boolean? = null,
            /**
             * [FailureThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-failurethreshold)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val failureThreshold: Int? = null,
            /**
             * [FullyQualifiedDomainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-fullyqualifieddomainname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val fullyQualifiedDomainName: String? = null,
            /**
             * [HealthThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-healththreshold)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val healthThreshold: Int? = null,
            /**
             * [IPAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-ipaddress)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val iPAddress: String? = null,
            /**
             * [InsufficientDataHealthStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-insufficientdatahealthstatus)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val insufficientDataHealthStatus: String? = null,
            /**
             * [Inverted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-inverted)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val inverted: Boolean? = null,
            /**
             * [MeasureLatency](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-measurelatency)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val measureLatency: Boolean? = null,
            /**
             * [Port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-port)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val port: Int? = null,
            /**
             * [RequestInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-requestinterval)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val requestInterval: Int? = null,
            /**
             * [ResourcePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-resourcepath)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resourcePath: String? = null,
            /**
             * [SearchString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-searchstring)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val searchString: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthcheckconfig.html#cfn-route53-healthcheck-healthcheckconfig-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class HealthCheckTag(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-healthchecktag.html#cfn-route53-healthchecktags-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

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
