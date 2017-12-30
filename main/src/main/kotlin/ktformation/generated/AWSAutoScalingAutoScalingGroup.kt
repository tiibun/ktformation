
package ktformation.generated

import ktformation.*

/**
 * [AWS::AutoScaling::AutoScalingGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 */
@CloudFormationMarker
class AWSAutoScalingAutoScalingGroup(logicalId: String) : Resource<AWSAutoScalingAutoScalingGroup.Properties>(logicalId, "AWS::AutoScaling::AutoScalingGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var availabilityZones: Any? = null
        fun availabilityZones(value: List<String>) {
            this.availabilityZones = value
        }
        fun availabilityZones(vararg value: IntrinsicFunction) { this.availabilityZones = value }
        @JvmField var cooldown: Any? = null
        fun cooldown(value: String) {
            this.cooldown = value
        }
        fun cooldown(value: IntrinsicFunction) { this.cooldown = value }
        @JvmField var desiredCapacity: Any? = null
        fun desiredCapacity(value: String) {
            this.desiredCapacity = value
        }
        fun desiredCapacity(value: IntrinsicFunction) { this.desiredCapacity = value }
        @JvmField var healthCheckGracePeriod: Any? = null
        fun healthCheckGracePeriod(value: Int) {
            this.healthCheckGracePeriod = value
        }
        fun healthCheckGracePeriod(value: IntrinsicFunction) { this.healthCheckGracePeriod = value }
        @JvmField var healthCheckType: Any? = null
        fun healthCheckType(value: String) {
            this.healthCheckType = value
        }
        fun healthCheckType(value: IntrinsicFunction) { this.healthCheckType = value }
        @JvmField var instanceId: Any? = null
        fun instanceId(value: String) {
            this.instanceId = value
        }
        fun instanceId(value: IntrinsicFunction) { this.instanceId = value }
        @JvmField var launchConfigurationName: Any? = null
        fun launchConfigurationName(value: String) {
            this.launchConfigurationName = value
        }
        fun launchConfigurationName(value: IntrinsicFunction) { this.launchConfigurationName = value }
        @JvmField var lifecycleHookSpecificationList: Any? = null
        fun lifecycleHookSpecificationList(value: List<LifecycleHookSpecification>) {
            this.lifecycleHookSpecificationList = value
        }
        fun lifecycleHookSpecificationList(vararg value: IntrinsicFunction) { this.lifecycleHookSpecificationList = value }
        @JvmField var loadBalancerNames: Any? = null
        fun loadBalancerNames(value: List<String>) {
            this.loadBalancerNames = value
        }
        fun loadBalancerNames(vararg value: IntrinsicFunction) { this.loadBalancerNames = value }
        @JvmField var maxSize: Any? = null
        fun maxSize(value: String) { this.maxSize = value }
        fun maxSize(value: IntrinsicFunction) { this.maxSize = value }
        @JvmField var metricsCollection: Any? = null
        fun metricsCollection(value: List<MetricsCollection>) {
            this.metricsCollection = value
        }
        fun metricsCollection(vararg value: IntrinsicFunction) { this.metricsCollection = value }
        @JvmField var minSize: Any? = null
        fun minSize(value: String) { this.minSize = value }
        fun minSize(value: IntrinsicFunction) { this.minSize = value }
        @JvmField var notificationConfigurations: Any? = null
        fun notificationConfigurations(value: List<NotificationConfiguration>) {
            this.notificationConfigurations = value
        }
        fun notificationConfigurations(vararg value: IntrinsicFunction) { this.notificationConfigurations = value }
        @JvmField var placementGroup: Any? = null
        fun placementGroup(value: String) {
            this.placementGroup = value
        }
        fun placementGroup(value: IntrinsicFunction) { this.placementGroup = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<TagProperty>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var targetGroupARNs: Any? = null
        fun targetGroupARNs(value: List<String>) {
            this.targetGroupARNs = value
        }
        fun targetGroupARNs(vararg value: IntrinsicFunction) { this.targetGroupARNs = value }
        @JvmField var terminationPolicies: Any? = null
        fun terminationPolicies(value: List<String>) {
            this.terminationPolicies = value
        }
        fun terminationPolicies(vararg value: IntrinsicFunction) { this.terminationPolicies = value }
        @JvmField var vPCZoneIdentifier: Any? = null
        fun vPCZoneIdentifier(value: List<String>) {
            this.vPCZoneIdentifier = value
        }
        fun vPCZoneIdentifier(vararg value: IntrinsicFunction) { this.vPCZoneIdentifier = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LifecycleHookSpecification(
            val defaultResult: String? = null,
            val heartbeatTimeout: Int? = null,
            val lifecycleHookName: String,
            val lifecycleTransition: String,
            val notificationMetadata: String? = null,
            val notificationTargetARN: String? = null,
            val roleARN: String? = null
    )

    class MetricsCollection(
            val granularity: String,
            val metrics: List<String>? = null
    )

    class NotificationConfiguration(
            val notificationTypes: List<String>? = null,
            val topicARN: String
    )

    class TagProperty(
            val key: String,
            val propagateAtLaunch: Boolean,
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

fun Resources.awsAutoScalingAutoScalingGroup(logicalId: String, init: AWSAutoScalingAutoScalingGroup.() -> Unit = {}): AWSAutoScalingAutoScalingGroup {
    return AWSAutoScalingAutoScalingGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
