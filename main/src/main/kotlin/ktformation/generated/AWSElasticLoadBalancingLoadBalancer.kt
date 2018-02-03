
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancing::LoadBalancer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingLoadBalancer(logicalId: String) : Resource<AWSElasticLoadBalancingLoadBalancer.Properties>(logicalId, "AWS::ElasticLoadBalancing::LoadBalancer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [accessLoggingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-accessloggingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AccessLoggingPolicy
         */
        @JvmField
        var accessLoggingPolicy: Any? = null

        /**
         * [accessLoggingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-accessloggingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AccessLoggingPolicy
         */
        fun accessLoggingPolicy(value: AccessLoggingPolicy) {
          this.accessLoggingPolicy = value
        }
        
        /**
         * [accessLoggingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-accessloggingpolicy)
         *
         * _Required_: no
         *
         * _Type_: AccessLoggingPolicy
         */
        fun accessLoggingPolicy(value: IntrinsicFunction) {
          this.accessLoggingPolicy = value
        }
        
        /**
         * [appCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy)
         *
         * _Required_: no
         *
         * _Type_: List<AppCookieStickinessPolicy>
         */
        @JvmField
        var appCookieStickinessPolicy: Any? = null

        /**
         * [appCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy)
         *
         * _Required_: no
         *
         * _Type_: List<AppCookieStickinessPolicy>
         */
        fun appCookieStickinessPolicy(value: List<AppCookieStickinessPolicy>) {
          this.appCookieStickinessPolicy = value
        }
        
        /**
         * [appCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-appcookiestickinesspolicy)
         *
         * _Required_: no
         *
         * _Type_: List<AppCookieStickinessPolicy>
         */
        fun appCookieStickinessPolicy(vararg value: IntrinsicFunction) {
          this.appCookieStickinessPolicy = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var availabilityZones: Any? = null

        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(value: List<String>) {
          this.availabilityZones = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(vararg value: IntrinsicFunction) {
          this.availabilityZones = value
        }
        
        /**
         * [connectionDrainingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-connectiondrainingpolicy)
         *
         * _Required_: no
         *
         * _Type_: ConnectionDrainingPolicy
         */
        @JvmField
        var connectionDrainingPolicy: Any? = null

        /**
         * [connectionDrainingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-connectiondrainingpolicy)
         *
         * _Required_: no
         *
         * _Type_: ConnectionDrainingPolicy
         */
        fun connectionDrainingPolicy(value: ConnectionDrainingPolicy) {
          this.connectionDrainingPolicy = value
        }
        
        /**
         * [connectionDrainingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-connectiondrainingpolicy)
         *
         * _Required_: no
         *
         * _Type_: ConnectionDrainingPolicy
         */
        fun connectionDrainingPolicy(value: IntrinsicFunction) {
          this.connectionDrainingPolicy = value
        }
        
        /**
         * [connectionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-connectionsettings)
         *
         * _Required_: no
         *
         * _Type_: ConnectionSettings
         */
        @JvmField
        var connectionSettings: Any? = null

        /**
         * [connectionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-connectionsettings)
         *
         * _Required_: no
         *
         * _Type_: ConnectionSettings
         */
        fun connectionSettings(value: ConnectionSettings) {
          this.connectionSettings = value
        }
        
        /**
         * [connectionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-connectionsettings)
         *
         * _Required_: no
         *
         * _Type_: ConnectionSettings
         */
        fun connectionSettings(value: IntrinsicFunction) {
          this.connectionSettings = value
        }
        
        /**
         * [crossZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var crossZone: Any? = null

        /**
         * [crossZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun crossZone(value: Boolean) {
          this.crossZone = value
        }
        
        /**
         * [crossZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-crosszone)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun crossZone(value: IntrinsicFunction) {
          this.crossZone = value
        }
        
        /**
         * [healthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-healthcheck)
         *
         * _Required_: no
         *
         * _Type_: HealthCheck
         */
        @JvmField
        var healthCheck: Any? = null

        /**
         * [healthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-healthcheck)
         *
         * _Required_: no
         *
         * _Type_: HealthCheck
         */
        fun healthCheck(value: HealthCheck) {
          this.healthCheck = value
        }
        
        /**
         * [healthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-healthcheck)
         *
         * _Required_: no
         *
         * _Type_: HealthCheck
         */
        fun healthCheck(value: IntrinsicFunction) {
          this.healthCheck = value
        }
        
        /**
         * [instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var instances: Any? = null

        /**
         * [instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun instances(value: List<String>) {
          this.instances = value
        }
        
        /**
         * [instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-instances)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun instances(vararg value: IntrinsicFunction) {
          this.instances = value
        }
        
        /**
         * [lBCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy)
         *
         * _Required_: no
         *
         * _Type_: List<LBCookieStickinessPolicy>
         */
        @JvmField
        var lBCookieStickinessPolicy: Any? = null

        /**
         * [lBCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy)
         *
         * _Required_: no
         *
         * _Type_: List<LBCookieStickinessPolicy>
         */
        fun lBCookieStickinessPolicy(value: List<LBCookieStickinessPolicy>) {
          this.lBCookieStickinessPolicy = value
        }
        
        /**
         * [lBCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-lbcookiestickinesspolicy)
         *
         * _Required_: no
         *
         * _Type_: List<LBCookieStickinessPolicy>
         */
        fun lBCookieStickinessPolicy(vararg value: IntrinsicFunction) {
          this.lBCookieStickinessPolicy = value
        }
        
        /**
         * [listeners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners)
         *
         * _Required_: yes
         *
         * _Type_: List<Listeners>
         */
        @JvmField
        var listeners: Any? = null

        /**
         * [listeners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners)
         *
         * _Required_: yes
         *
         * _Type_: List<Listeners>
         */
        fun listeners(value: List<Listeners>) {
          this.listeners = value
        }
        
        /**
         * [listeners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-listeners)
         *
         * _Required_: yes
         *
         * _Type_: List<Listeners>
         */
        fun listeners(vararg value: IntrinsicFunction) {
          this.listeners = value
        }
        
        /**
         * [loadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var loadBalancerName: Any? = null

        /**
         * [loadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loadBalancerName(value: String) {
          this.loadBalancerName = value
        }
        
        /**
         * [loadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-elbname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loadBalancerName(value: IntrinsicFunction) {
          this.loadBalancerName = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policies>
         */
        @JvmField
        var policies: Any? = null

        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policies>
         */
        fun policies(value: List<Policies>) {
          this.policies = value
        }
        
        /**
         * [policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-policies)
         *
         * _Required_: no
         *
         * _Type_: List<Policies>
         */
        fun policies(vararg value: IntrinsicFunction) {
          this.policies = value
        }
        
        /**
         * [scheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scheme: Any? = null

        /**
         * [scheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheme(value: String) {
          this.scheme = value
        }
        
        /**
         * [scheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-scheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheme(value: IntrinsicFunction) {
          this.scheme = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnets: Any? = null

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-ec2-elb-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#cfn-elasticloadbalancing-loadbalancer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AccessLoggingPolicy(
            /**
             * [EmitInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val emitInterval: Int? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [S3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val s3BucketName: String,
            /**
             * [S3BucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3BucketPrefix: String? = null
    )

    class AppCookieStickinessPolicy(
            /**
             * [CookieName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val cookieName: String,
            /**
             * [PolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val policyName: String
    )

    class ConnectionDrainingPolicy(
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean,
            /**
             * [Timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val timeout: Int? = null
    )

    class ConnectionSettings(
            /**
             * [IdleTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val idleTimeout: Int
    )

    class HealthCheck(
            /**
             * [HealthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val healthyThreshold: String,
            /**
             * [Interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val interval: String,
            /**
             * [Target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val target: String,
            /**
             * [Timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val timeout: String,
            /**
             * [UnhealthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val unhealthyThreshold: String
    )

    class LBCookieStickinessPolicy(
            /**
             * [CookieExpirationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val cookieExpirationPeriod: String? = null,
            /**
             * [PolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val policyName: String? = null
    )

    class Listeners(
            /**
             * [InstancePort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instancePort: String,
            /**
             * [InstanceProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val instanceProtocol: String? = null,
            /**
             * [LoadBalancerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val loadBalancerPort: String,
            /**
             * [PolicyNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val policyNames: List<String>? = null,
            /**
             * [Protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val protocol: String,
            /**
             * [SSLCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sSLCertificateId: String? = null
    )

    class Policies(
            /**
             * [Attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes)
             *
             * _Required_: yes
             *
             * _Type_: List<Json>
             */
            val attributes: List<Json>,
            /**
             * [InstancePorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val instancePorts: List<String>? = null,
            /**
             * [LoadBalancerPorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val loadBalancerPorts: List<String>? = null,
            /**
             * [PolicyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val policyName: String,
            /**
             * [PolicyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val policyType: String
    )

}

/**
 * [AWS::ElasticLoadBalancing::LoadBalancer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html)
 */
fun Resources.awsElasticLoadBalancingLoadBalancer(logicalId: String, init: AWSElasticLoadBalancingLoadBalancer.() -> Unit = {}): AWSElasticLoadBalancingLoadBalancer {
    return AWSElasticLoadBalancingLoadBalancer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
