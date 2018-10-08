
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
         * [launchTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchtemplate)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateSpecification
         */
        @JvmField
        var launchTemplate: Any? = null

        /**
         * [launchTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchtemplate)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateSpecification
         */
        fun launchTemplate(value: LaunchTemplateSpecification) {
          this.launchTemplate = value
        }
        
        /**
         * [launchTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchtemplate)
         *
         * _Required_: no
         *
         * _Type_: LaunchTemplateSpecification
         */
        fun launchTemplate(value: IntrinsicFunction) {
          this.launchTemplate = value
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
         * [serviceLinkedRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serviceLinkedRoleARN: Any? = null

        /**
         * [serviceLinkedRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceLinkedRoleARN(value: String) {
          this.serviceLinkedRoleARN = value
        }
        
        /**
         * [serviceLinkedRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceLinkedRoleARN(value: IntrinsicFunction) {
          this.serviceLinkedRoleARN = value
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

        /**
        * [LaunchTemplateSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html)
        */
        fun launchTemplateSpecification(init: LaunchTemplateSpecification.() -> Unit = {}): LaunchTemplateSpecification {
            return LaunchTemplateSpecification().also {
                it.init()
            }
        }
        /**
        * [LifecycleHookSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html)
        */
        fun lifecycleHookSpecification(init: LifecycleHookSpecification.() -> Unit = {}): LifecycleHookSpecification {
            return LifecycleHookSpecification().also {
                it.init()
            }
        }
        /**
        * [MetricsCollection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html)
        */
        fun metricsCollection(init: MetricsCollection.() -> Unit = {}): MetricsCollection {
            return MetricsCollection().also {
                it.init()
            }
        }
        /**
        * [NotificationConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html)
        */
        fun notificationConfiguration(init: NotificationConfiguration.() -> Unit = {}): NotificationConfiguration {
            return NotificationConfiguration().also {
                it.init()
            }
        }
        /**
        * [TagProperty](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html)
        */
        fun tagProperty(init: TagProperty.() -> Unit = {}): TagProperty {
            return TagProperty().also {
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
    class LaunchTemplateSpecification {
            /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var launchTemplateId: Any? = null

        /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateId(value: String) {
          this.launchTemplateId = value
        }
        
        /**
         * [launchTemplateId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateId(value: IntrinsicFunction) {
          this.launchTemplateId = value
        }

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var launchTemplateName: Any? = null

        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: String) {
          this.launchTemplateName = value
        }
        
        /**
         * [launchTemplateName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchTemplateName(value: IntrinsicFunction) {
          this.launchTemplateName = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

    @CloudFormationMarker
    class LifecycleHookSpecification {
            /**
         * [defaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var defaultResult: Any? = null

        /**
         * [defaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultResult(value: String) {
          this.defaultResult = value
        }
        
        /**
         * [defaultResult](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultResult(value: IntrinsicFunction) {
          this.defaultResult = value
        }

        /**
         * [heartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var heartbeatTimeout: Any? = null

        /**
         * [heartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun heartbeatTimeout(value: Int) {
          this.heartbeatTimeout = value
        }
        
        /**
         * [heartbeatTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun heartbeatTimeout(value: IntrinsicFunction) {
          this.heartbeatTimeout = value
        }

        /**
         * [lifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var lifecycleHookName: Any? = null

        /**
         * [lifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lifecycleHookName(value: String) {
          this.lifecycleHookName = value
        }
        
        /**
         * [lifecycleHookName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lifecycleHookName(value: IntrinsicFunction) {
          this.lifecycleHookName = value
        }

        /**
         * [lifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var lifecycleTransition: Any? = null

        /**
         * [lifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lifecycleTransition(value: String) {
          this.lifecycleTransition = value
        }
        
        /**
         * [lifecycleTransition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun lifecycleTransition(value: IntrinsicFunction) {
          this.lifecycleTransition = value
        }

        /**
         * [notificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var notificationMetadata: Any? = null

        /**
         * [notificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationMetadata(value: String) {
          this.notificationMetadata = value
        }
        
        /**
         * [notificationMetadata](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationMetadata(value: IntrinsicFunction) {
          this.notificationMetadata = value
        }

        /**
         * [notificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var notificationTargetARN: Any? = null

        /**
         * [notificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTargetARN(value: String) {
          this.notificationTargetARN = value
        }
        
        /**
         * [notificationTargetARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTargetARN(value: IntrinsicFunction) {
          this.notificationTargetARN = value
        }

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }

    }

    @CloudFormationMarker
    class MetricsCollection {
            /**
         * [granularity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var granularity: Any? = null

        /**
         * [granularity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun granularity(value: String) {
          this.granularity = value
        }
        
        /**
         * [granularity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-granularity)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun granularity(value: IntrinsicFunction) {
          this.granularity = value
        }

        /**
         * [metrics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var metrics: Any? = null

        /**
         * [metrics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun metrics(value: List<String>) {
          this.metrics = value
        }
        
        /**
         * [metrics](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-metricscollection.html#cfn-as-metricscollection-metrics)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun metrics(vararg value: IntrinsicFunction) {
          this.metrics = value
        }

    }

    @CloudFormationMarker
    class NotificationConfiguration {
            /**
         * [notificationTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var notificationTypes: Any? = null

        /**
         * [notificationTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationTypes(value: List<String>) {
          this.notificationTypes = value
        }
        
        /**
         * [notificationTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-as-group-notificationconfigurations-notificationtypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun notificationTypes(vararg value: IntrinsicFunction) {
          this.notificationTypes = value
        }

        /**
         * [topicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var topicARN: Any? = null

        /**
         * [topicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topicARN(value: String) {
          this.topicARN = value
        }
        
        /**
         * [topicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-notificationconfigurations.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations-topicarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun topicARN(value: IntrinsicFunction) {
          this.topicARN = value
        }

    }

    @CloudFormationMarker
    class TagProperty {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [propagateAtLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var propagateAtLaunch: Any? = null

        /**
         * [propagateAtLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun propagateAtLaunch(value: Boolean) {
          this.propagateAtLaunch = value
        }
        
        /**
         * [propagateAtLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-PropagateAtLaunch)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun propagateAtLaunch(value: IntrinsicFunction) {
          this.propagateAtLaunch = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-tags.html#cfn-as-tags-Value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

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
