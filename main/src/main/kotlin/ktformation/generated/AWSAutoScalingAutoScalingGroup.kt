
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::AutoScalingGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 */
@CloudFormationMarker
class AWSAutoScalingAutoScalingGroup(logicalId: String) : Resource<AWSAutoScalingAutoScalingGroup.Properties>(logicalId, "AWS::AutoScaling::AutoScalingGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var autoScalingGroupName: Any? = null

        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: String) {
          this.autoScalingGroupName = value
        }
        
        /**
         * [autoScalingGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun autoScalingGroupName(value: IntrinsicFunction) {
          this.autoScalingGroupName = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var availabilityZones: Any? = null

        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(value: List<String>) {
          this.availabilityZones = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(vararg value: IntrinsicFunction) {
          this.availabilityZones = value
        }
        
        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cooldown: Any? = null

        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cooldown(value: String) {
          this.cooldown = value
        }
        
        /**
         * [cooldown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cooldown(value: IntrinsicFunction) {
          this.cooldown = value
        }
        
        /**
         * [desiredCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var desiredCapacity: Any? = null

        /**
         * [desiredCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun desiredCapacity(value: String) {
          this.desiredCapacity = value
        }
        
        /**
         * [desiredCapacity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun desiredCapacity(value: IntrinsicFunction) {
          this.desiredCapacity = value
        }
        
        /**
         * [healthCheckGracePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var healthCheckGracePeriod: Any? = null

        /**
         * [healthCheckGracePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckGracePeriod(value: Int) {
          this.healthCheckGracePeriod = value
        }
        
        /**
         * [healthCheckGracePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckGracePeriod(value: IntrinsicFunction) {
          this.healthCheckGracePeriod = value
        }
        
        /**
         * [healthCheckType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var healthCheckType: Any? = null

        /**
         * [healthCheckType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckType(value: String) {
          this.healthCheckType = value
        }
        
        /**
         * [healthCheckType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckType(value: IntrinsicFunction) {
          this.healthCheckType = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }
        
        /**
         * [launchConfigurationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var launchConfigurationName: Any? = null

        /**
         * [launchConfigurationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchConfigurationName(value: String) {
          this.launchConfigurationName = value
        }
        
        /**
         * [launchConfigurationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchConfigurationName(value: IntrinsicFunction) {
          this.launchConfigurationName = value
        }
        
        /**
         * [lifecycleHookSpecificationList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
         *
         * _Required_: no
         *
         * _Type_: List<LifecycleHookSpecification>
         */
        @JvmField
        var lifecycleHookSpecificationList: Any? = null

        /**
         * [lifecycleHookSpecificationList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
         *
         * _Required_: no
         *
         * _Type_: List<LifecycleHookSpecification>
         */
        fun lifecycleHookSpecificationList(value: List<LifecycleHookSpecification>) {
          this.lifecycleHookSpecificationList = value
        }
        
        /**
         * [lifecycleHookSpecificationList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
         *
         * _Required_: no
         *
         * _Type_: List<LifecycleHookSpecification>
         */
        fun lifecycleHookSpecificationList(vararg value: IntrinsicFunction) {
          this.lifecycleHookSpecificationList = value
        }
        
        /**
         * [loadBalancerNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var loadBalancerNames: Any? = null

        /**
         * [loadBalancerNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun loadBalancerNames(value: List<String>) {
          this.loadBalancerNames = value
        }
        
        /**
         * [loadBalancerNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun loadBalancerNames(vararg value: IntrinsicFunction) {
          this.loadBalancerNames = value
        }
        
        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var maxSize: Any? = null

        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun maxSize(value: String) {
          this.maxSize = value
        }
        
        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun maxSize(value: IntrinsicFunction) {
          this.maxSize = value
        }
        
        /**
         * [metricsCollection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection)
         *
         * _Required_: no
         *
         * _Type_: List<MetricsCollection>
         */
        @JvmField
        var metricsCollection: Any? = null

        /**
         * [metricsCollection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection)
         *
         * _Required_: no
         *
         * _Type_: List<MetricsCollection>
         */
        fun metricsCollection(value: List<MetricsCollection>) {
          this.metricsCollection = value
        }
        
        /**
         * [metricsCollection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection)
         *
         * _Required_: no
         *
         * _Type_: List<MetricsCollection>
         */
        fun metricsCollection(vararg value: IntrinsicFunction) {
          this.metricsCollection = value
        }
        
        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var minSize: Any? = null

        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun minSize(value: String) {
          this.minSize = value
        }
        
        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun minSize(value: IntrinsicFunction) {
          this.minSize = value
        }
        
        /**
         * [notificationConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<NotificationConfiguration>
         */
        @JvmField
        var notificationConfigurations: Any? = null

        /**
         * [notificationConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<NotificationConfiguration>
         */
        fun notificationConfigurations(value: List<NotificationConfiguration>) {
          this.notificationConfigurations = value
        }
        
        /**
         * [notificationConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<NotificationConfiguration>
         */
        fun notificationConfigurations(vararg value: IntrinsicFunction) {
          this.notificationConfigurations = value
        }
        
        /**
         * [placementGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var placementGroup: Any? = null

        /**
         * [placementGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun placementGroup(value: String) {
          this.placementGroup = value
        }
        
        /**
         * [placementGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun placementGroup(value: IntrinsicFunction) {
          this.placementGroup = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags)
         *
         * _Required_: no
         *
         * _Type_: List<TagProperty>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags)
         *
         * _Required_: no
         *
         * _Type_: List<TagProperty>
         */
        fun tags(value: List<TagProperty>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags)
         *
         * _Required_: no
         *
         * _Type_: List<TagProperty>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [targetGroupARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var targetGroupARNs: Any? = null

        /**
         * [targetGroupARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun targetGroupARNs(value: List<String>) {
          this.targetGroupARNs = value
        }
        
        /**
         * [targetGroupARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun targetGroupARNs(vararg value: IntrinsicFunction) {
          this.targetGroupARNs = value
        }
        
        /**
         * [terminationPolicies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var terminationPolicies: Any? = null

        /**
         * [terminationPolicies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun terminationPolicies(value: List<String>) {
          this.terminationPolicies = value
        }
        
        /**
         * [terminationPolicies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun terminationPolicies(vararg value: IntrinsicFunction) {
          this.terminationPolicies = value
        }
        
        /**
         * [vPCZoneIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var vPCZoneIdentifier: Any? = null

        /**
         * [vPCZoneIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vPCZoneIdentifier(value: List<String>) {
          this.vPCZoneIdentifier = value
        }
        
        /**
         * [vPCZoneIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vPCZoneIdentifier(vararg value: IntrinsicFunction) {
          this.vPCZoneIdentifier = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LifecycleHookSpecification(
            /**
             * [DefaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val defaultResult: String? = null,
            /**
             * [HeartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val heartbeatTimeout: Int? = null,
            /**
             * [LifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val lifecycleHookName: String,
            /**
             * [LifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val lifecycleTransition: String,
            /**
             * [NotificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val notificationMetadata: String? = null,
            /**
             * [NotificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val notificationTargetARN: String? = null,
            /**
             * [RoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val roleARN: String? = null
    )

    class MetricsCollection(
            /**
             * [Granularity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val granularity: String,
            /**
             * [Metrics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val metrics: List<String>? = null
    )

    class NotificationConfiguration(
            /**
             * [NotificationTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val notificationTypes: List<String>? = null,
            /**
             * [TopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val topicARN: String
    )

    class TagProperty(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [PropagateAtLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val propagateAtLaunch: Boolean,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class UpdatePolicy(
            var autoScalingReplacingUpdate: AutoScalingReplacingUpdate? = null,
            var autoScalingRollingUpdate: AutoScalingRollingUpdate? = null
    ) : Resource.UpdatePolicy {

        class AutoScalingReplacingUpdate(var willReplace: Boolean? = null)

        class AutoScalingRollingUpdate(
                var maxBatchSize: Int? = null,
                var minInstancesInService: Int? = null,
                var minSuccessfulInstancesPercent: Int? = null,
                var pauseTime: String? = null,
                var suspendProcesses: List<String>? = null,
                var waitOnResourceSignals: Boolean? = null
        )

        fun autoScalingReplacingUpdate(init: AutoScalingReplacingUpdate.() -> Unit): AutoScalingReplacingUpdate {
            return AutoScalingReplacingUpdate().also {
                it.init()
                autoScalingReplacingUpdate = it
            }
        }

        fun autoScalingRollingUpdate(init: AutoScalingRollingUpdate.() -> Unit): AutoScalingRollingUpdate {
            return AutoScalingRollingUpdate().also {
                it.init()
                autoScalingRollingUpdate = it
            }
        }
    }

    fun updatePolicy(init: UpdatePolicy.() -> Unit): UpdatePolicy {
        return UpdatePolicy().also {
            it.init()
            updatePolicy = it
        }
    }

}

/**
 * [AWS::AutoScaling::AutoScalingGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 */
fun Resources.awsAutoScalingAutoScalingGroup(logicalId: String, init: AWSAutoScalingAutoScalingGroup.() -> Unit = {}): AWSAutoScalingAutoScalingGroup {
    return AWSAutoScalingAutoScalingGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
