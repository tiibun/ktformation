
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancing::LoadBalancer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingLoadBalancer(logicalId: String) : Resource<AWSElasticLoadBalancingLoadBalancer.Properties>(logicalId, "AWS::ElasticLoadBalancing::LoadBalancer") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var accessLoggingPolicy: Any? = null
        fun accessLoggingPolicy(value: AccessLoggingPolicy) {
            this.accessLoggingPolicy = value
        }
        fun accessLoggingPolicy(value: IntrinsicFunction) { this.accessLoggingPolicy = value }
        @JvmField var appCookieStickinessPolicy: Any? = null
        fun appCookieStickinessPolicy(value: List<AppCookieStickinessPolicy>) {
            this.appCookieStickinessPolicy = value
        }
        fun appCookieStickinessPolicy(vararg value: IntrinsicFunction) { this.appCookieStickinessPolicy = value }
        @JvmField var availabilityZones: Any? = null
        fun availabilityZones(value: List<String>) {
            this.availabilityZones = value
        }
        fun availabilityZones(vararg value: IntrinsicFunction) { this.availabilityZones = value }
        @JvmField var connectionDrainingPolicy: Any? = null
        fun connectionDrainingPolicy(value: ConnectionDrainingPolicy) {
            this.connectionDrainingPolicy = value
        }
        fun connectionDrainingPolicy(value: IntrinsicFunction) { this.connectionDrainingPolicy = value }
        @JvmField var connectionSettings: Any? = null
        fun connectionSettings(value: ConnectionSettings) {
            this.connectionSettings = value
        }
        fun connectionSettings(value: IntrinsicFunction) { this.connectionSettings = value }
        @JvmField var crossZone: Any? = null
        fun crossZone(value: Boolean) {
            this.crossZone = value
        }
        fun crossZone(value: IntrinsicFunction) { this.crossZone = value }
        @JvmField var healthCheck: Any? = null
        fun healthCheck(value: HealthCheck) {
            this.healthCheck = value
        }
        fun healthCheck(value: IntrinsicFunction) { this.healthCheck = value }
        @JvmField var instances: Any? = null
        fun instances(value: List<String>) {
            this.instances = value
        }
        fun instances(vararg value: IntrinsicFunction) { this.instances = value }
        @JvmField var lBCookieStickinessPolicy: Any? = null
        fun lBCookieStickinessPolicy(value: List<LBCookieStickinessPolicy>) {
            this.lBCookieStickinessPolicy = value
        }
        fun lBCookieStickinessPolicy(vararg value: IntrinsicFunction) { this.lBCookieStickinessPolicy = value }
        @JvmField var listeners: Any? = null
        fun listeners(value: List<Listeners>) { this.listeners = value }
        fun listeners(vararg value: IntrinsicFunction) { this.listeners = value }
        @JvmField var loadBalancerName: Any? = null
        fun loadBalancerName(value: String) {
            this.loadBalancerName = value
        }
        fun loadBalancerName(value: IntrinsicFunction) { this.loadBalancerName = value }
        @JvmField var policies: Any? = null
        fun policies(value: List<Policies>) {
            this.policies = value
        }
        fun policies(vararg value: IntrinsicFunction) { this.policies = value }
        @JvmField var scheme: Any? = null
        fun scheme(value: String) {
            this.scheme = value
        }
        fun scheme(value: IntrinsicFunction) { this.scheme = value }
        @JvmField var securityGroups: Any? = null
        fun securityGroups(value: List<String>) {
            this.securityGroups = value
        }
        fun securityGroups(vararg value: IntrinsicFunction) { this.securityGroups = value }
        @JvmField var subnets: Any? = null
        fun subnets(value: List<String>) {
            this.subnets = value
        }
        fun subnets(vararg value: IntrinsicFunction) { this.subnets = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AccessLoggingPolicy(
            val emitInterval: Int? = null,
            val enabled: Boolean,
            val s3BucketName: String,
            val s3BucketPrefix: String? = null
    )

    class AppCookieStickinessPolicy(
            val cookieName: String,
            val policyName: String
    )

    class ConnectionDrainingPolicy(
            val enabled: Boolean,
            val timeout: Int? = null
    )

    class ConnectionSettings(
            val idleTimeout: Int
    )

    class HealthCheck(
            val healthyThreshold: String,
            val interval: String,
            val target: String,
            val timeout: String,
            val unhealthyThreshold: String
    )

    class LBCookieStickinessPolicy(
            val cookieExpirationPeriod: String? = null,
            val policyName: String? = null
    )

    class Listeners(
            val instancePort: String,
            val instanceProtocol: String? = null,
            val loadBalancerPort: String,
            val policyNames: List<String>? = null,
            val protocol: String,
            val sSLCertificateId: String? = null
    )

    class Policies(
            val attributes: List<Json>,
            val instancePorts: List<String>? = null,
            val loadBalancerPorts: List<String>? = null,
            val policyName: String,
            val policyType: String
    )

}

fun Resources.awsElasticLoadBalancingLoadBalancer(logicalId: String, init: AWSElasticLoadBalancingLoadBalancer.() -> Unit = {}): AWSElasticLoadBalancingLoadBalancer {
    return AWSElasticLoadBalancingLoadBalancer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
