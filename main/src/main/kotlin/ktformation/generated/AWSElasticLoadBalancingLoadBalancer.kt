
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

        /**
        * [AccessLoggingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html)
        */
        fun accessLoggingPolicy(init: AccessLoggingPolicy.() -> Unit = {}): AccessLoggingPolicy {
            return AccessLoggingPolicy().also {
                it.init()
            }
        }
        /**
        * [AppCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html)
        */
        fun appCookieStickinessPolicy(init: AppCookieStickinessPolicy.() -> Unit = {}): AppCookieStickinessPolicy {
            return AppCookieStickinessPolicy().also {
                it.init()
            }
        }
        /**
        * [ConnectionDrainingPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html)
        */
        fun connectionDrainingPolicy(init: ConnectionDrainingPolicy.() -> Unit = {}): ConnectionDrainingPolicy {
            return ConnectionDrainingPolicy().also {
                it.init()
            }
        }
        /**
        * [ConnectionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html)
        */
        fun connectionSettings(init: ConnectionSettings.() -> Unit = {}): ConnectionSettings {
            return ConnectionSettings().also {
                it.init()
            }
        }
        /**
        * [HealthCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html)
        */
        fun healthCheck(init: HealthCheck.() -> Unit = {}): HealthCheck {
            return HealthCheck().also {
                it.init()
            }
        }
        /**
        * [LBCookieStickinessPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html)
        */
        fun lBCookieStickinessPolicy(init: LBCookieStickinessPolicy.() -> Unit = {}): LBCookieStickinessPolicy {
            return LBCookieStickinessPolicy().also {
                it.init()
            }
        }
        /**
        * [Listeners](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html)
        */
        fun listeners(init: Listeners.() -> Unit = {}): Listeners {
            return Listeners().also {
                it.init()
            }
        }
        /**
        * [Policies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html)
        */
        fun policies(init: Policies.() -> Unit = {}): Policies {
            return Policies().also {
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
    class AccessLoggingPolicy {
            /**
         * [emitInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var emitInterval: Any? = null

        /**
         * [emitInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun emitInterval(value: Int) {
          this.emitInterval = value
        }
        
        /**
         * [emitInterval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun emitInterval(value: IntrinsicFunction) {
          this.emitInterval = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var s3BucketName: Any? = null

        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BucketName(value: String) {
          this.s3BucketName = value
        }
        
        /**
         * [s3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3BucketName(value: IntrinsicFunction) {
          this.s3BucketName = value
        }

        /**
         * [s3BucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var s3BucketPrefix: Any? = null

        /**
         * [s3BucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3BucketPrefix(value: String) {
          this.s3BucketPrefix = value
        }
        
        /**
         * [s3BucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun s3BucketPrefix(value: IntrinsicFunction) {
          this.s3BucketPrefix = value
        }

    }

    @CloudFormationMarker
    class AppCookieStickinessPolicy {
            /**
         * [cookieName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var cookieName: Any? = null

        /**
         * [cookieName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cookieName(value: String) {
          this.cookieName = value
        }
        
        /**
         * [cookieName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cookieName(value: IntrinsicFunction) {
          this.cookieName = value
        }

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }

    }

    @CloudFormationMarker
    class ConnectionDrainingPolicy {
            /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var timeout: Any? = null

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: Int) {
          this.timeout = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectiondrainingpolicy.html#cfn-elb-connectiondrainingpolicy-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
        }

    }

    @CloudFormationMarker
    class ConnectionSettings {
            /**
         * [idleTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var idleTimeout: Any? = null

        /**
         * [idleTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun idleTimeout(value: Int) {
          this.idleTimeout = value
        }
        
        /**
         * [idleTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-connectionsettings.html#cfn-elb-connectionsettings-idletimeout)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun idleTimeout(value: IntrinsicFunction) {
          this.idleTimeout = value
        }

    }

    @CloudFormationMarker
    class HealthCheck {
            /**
         * [healthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var healthyThreshold: Any? = null

        /**
         * [healthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun healthyThreshold(value: String) {
          this.healthyThreshold = value
        }
        
        /**
         * [healthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-healthythreshold)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun healthyThreshold(value: IntrinsicFunction) {
          this.healthyThreshold = value
        }

        /**
         * [interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var interval: Any? = null

        /**
         * [interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun interval(value: String) {
          this.interval = value
        }
        
        /**
         * [interval](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-interval)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun interval(value: IntrinsicFunction) {
          this.interval = value
        }

        /**
         * [target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var target: Any? = null

        /**
         * [target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun target(value: String) {
          this.target = value
        }
        
        /**
         * [target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-target)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun target(value: IntrinsicFunction) {
          this.target = value
        }

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var timeout: Any? = null

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeout(value: String) {
          this.timeout = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-timeout)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
        }

        /**
         * [unhealthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var unhealthyThreshold: Any? = null

        /**
         * [unhealthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun unhealthyThreshold(value: String) {
          this.unhealthyThreshold = value
        }
        
        /**
         * [unhealthyThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-health-check.html#cfn-elb-healthcheck-unhealthythreshold)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun unhealthyThreshold(value: IntrinsicFunction) {
          this.unhealthyThreshold = value
        }

    }

    @CloudFormationMarker
    class LBCookieStickinessPolicy {
            /**
         * [cookieExpirationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var cookieExpirationPeriod: Any? = null

        /**
         * [cookieExpirationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cookieExpirationPeriod(value: String) {
          this.cookieExpirationPeriod = value
        }
        
        /**
         * [cookieExpirationPeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cookieExpirationPeriod(value: IntrinsicFunction) {
          this.cookieExpirationPeriod = value
        }

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }

    }

    @CloudFormationMarker
    class Listeners {
            /**
         * [instancePort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instancePort: Any? = null

        /**
         * [instancePort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instancePort(value: String) {
          this.instancePort = value
        }
        
        /**
         * [instancePort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instancePort(value: IntrinsicFunction) {
          this.instancePort = value
        }

        /**
         * [instanceProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var instanceProtocol: Any? = null

        /**
         * [instanceProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceProtocol(value: String) {
          this.instanceProtocol = value
        }
        
        /**
         * [instanceProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceProtocol(value: IntrinsicFunction) {
          this.instanceProtocol = value
        }

        /**
         * [loadBalancerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var loadBalancerPort: Any? = null

        /**
         * [loadBalancerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun loadBalancerPort(value: String) {
          this.loadBalancerPort = value
        }
        
        /**
         * [loadBalancerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun loadBalancerPort(value: IntrinsicFunction) {
          this.loadBalancerPort = value
        }

        /**
         * [policyNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var policyNames: Any? = null

        /**
         * [policyNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun policyNames(value: List<String>) {
          this.policyNames = value
        }
        
        /**
         * [policyNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun policyNames(vararg value: IntrinsicFunction) {
          this.policyNames = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

        /**
         * [sSLCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sSLCertificateId: Any? = null

        /**
         * [sSLCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sSLCertificateId(value: String) {
          this.sSLCertificateId = value
        }
        
        /**
         * [sSLCertificateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sSLCertificateId(value: IntrinsicFunction) {
          this.sSLCertificateId = value
        }

    }

    @CloudFormationMarker
    class Policies {
            /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes)
         *
         * _Required_: yes
         *
         * _Type_: List<Json>
         */
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes)
         *
         * _Required_: yes
         *
         * _Type_: List<Json>
         */
        fun attributes(value: List<Json>) {
          this.attributes = value
        }
        
        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes)
         *
         * _Required_: yes
         *
         * _Type_: List<Json>
         */
        fun attributes(vararg value: IntrinsicFunction) {
          this.attributes = value
        }

        /**
         * [instancePorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var instancePorts: Any? = null

        /**
         * [instancePorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun instancePorts(value: List<String>) {
          this.instancePorts = value
        }
        
        /**
         * [instancePorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun instancePorts(vararg value: IntrinsicFunction) {
          this.instancePorts = value
        }

        /**
         * [loadBalancerPorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var loadBalancerPorts: Any? = null

        /**
         * [loadBalancerPorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun loadBalancerPorts(value: List<String>) {
          this.loadBalancerPorts = value
        }
        
        /**
         * [loadBalancerPorts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun loadBalancerPorts(vararg value: IntrinsicFunction) {
          this.loadBalancerPorts = value
        }

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var policyName: Any? = null

        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: String) {
          this.policyName = value
        }
        
        /**
         * [policyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyName(value: IntrinsicFunction) {
          this.policyName = value
        }

        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var policyType: Any? = null

        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyType(value: String) {
          this.policyType = value
        }
        
        /**
         * [policyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun policyType(value: IntrinsicFunction) {
          this.policyType = value
        }

    }

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
