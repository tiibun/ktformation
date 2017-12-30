
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::HealthCheck - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-healthcheck.html)
 */
@CloudFormationMarker
class AWSRoute53HealthCheck(logicalId: String) : Resource<AWSRoute53HealthCheck.Properties>(logicalId, "AWS::Route53::HealthCheck") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var healthCheckConfig: Any? = null
        fun healthCheckConfig(value: HealthCheckConfig) { this.healthCheckConfig = value }
        fun healthCheckConfig(value: IntrinsicFunction) { this.healthCheckConfig = value }
        @JvmField var healthCheckTags: Any? = null
        fun healthCheckTags(value: List<HealthCheckTag>) {
            this.healthCheckTags = value
        }
        fun healthCheckTags(vararg value: IntrinsicFunction) { this.healthCheckTags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AlarmIdentifier(
            val name: String,
            val region: String
    )

    class HealthCheckConfig(
            val alarmIdentifier: AlarmIdentifier? = null,
            val childHealthChecks: List<String>? = null,
            val enableSNI: Boolean? = null,
            val failureThreshold: Int? = null,
            val fullyQualifiedDomainName: String? = null,
            val healthThreshold: Int? = null,
            val iPAddress: String? = null,
            val insufficientDataHealthStatus: String? = null,
            val inverted: Boolean? = null,
            val measureLatency: Boolean? = null,
            val port: Int? = null,
            val requestInterval: Int? = null,
            val resourcePath: String? = null,
            val searchString: String? = null,
            val type: String
    )

    class HealthCheckTag(
            val key: String,
            val value: String
    )

}

fun Resources.awsRoute53HealthCheck(logicalId: String, init: AWSRoute53HealthCheck.() -> Unit = {}): AWSRoute53HealthCheck {
    return AWSRoute53HealthCheck(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
