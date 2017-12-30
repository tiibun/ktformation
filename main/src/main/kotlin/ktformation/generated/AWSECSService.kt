
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECS::Service - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
 */
@CloudFormationMarker
class AWSECSService(logicalId: String) : Resource<AWSECSService.Properties>(logicalId, "AWS::ECS::Service") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cluster: Any? = null
        fun cluster(value: String) {
            this.cluster = value
        }
        fun cluster(value: IntrinsicFunction) { this.cluster = value }
        @JvmField var deploymentConfiguration: Any? = null
        fun deploymentConfiguration(value: DeploymentConfiguration) {
            this.deploymentConfiguration = value
        }
        fun deploymentConfiguration(value: IntrinsicFunction) { this.deploymentConfiguration = value }
        @JvmField var desiredCount: Any? = null
        fun desiredCount(value: Int) {
            this.desiredCount = value
        }
        fun desiredCount(value: IntrinsicFunction) { this.desiredCount = value }
        @JvmField var launchType: Any? = null
        fun launchType(value: String) {
            this.launchType = value
        }
        fun launchType(value: IntrinsicFunction) { this.launchType = value }
        @JvmField var loadBalancers: Any? = null
        fun loadBalancers(value: List<LoadBalancer>) {
            this.loadBalancers = value
        }
        fun loadBalancers(vararg value: IntrinsicFunction) { this.loadBalancers = value }
        @JvmField var networkConfiguration: Any? = null
        fun networkConfiguration(value: NetworkConfiguration) {
            this.networkConfiguration = value
        }
        fun networkConfiguration(value: IntrinsicFunction) { this.networkConfiguration = value }
        @JvmField var placementConstraints: Any? = null
        fun placementConstraints(value: List<PlacementConstraint>) {
            this.placementConstraints = value
        }
        fun placementConstraints(vararg value: IntrinsicFunction) { this.placementConstraints = value }
        @JvmField var placementStrategies: Any? = null
        fun placementStrategies(value: List<PlacementStrategy>) {
            this.placementStrategies = value
        }
        fun placementStrategies(vararg value: IntrinsicFunction) { this.placementStrategies = value }
        @JvmField var platformVersion: Any? = null
        fun platformVersion(value: String) {
            this.platformVersion = value
        }
        fun platformVersion(value: IntrinsicFunction) { this.platformVersion = value }
        @JvmField var role: Any? = null
        fun role(value: String) {
            this.role = value
        }
        fun role(value: IntrinsicFunction) { this.role = value }
        @JvmField var serviceName: Any? = null
        fun serviceName(value: String) {
            this.serviceName = value
        }
        fun serviceName(value: IntrinsicFunction) { this.serviceName = value }
        @JvmField var taskDefinition: Any? = null
        fun taskDefinition(value: String) { this.taskDefinition = value }
        fun taskDefinition(value: IntrinsicFunction) { this.taskDefinition = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AwsVpcConfiguration(
            val assignPublicIp: String? = null,
            val securityGroups: List<String>? = null,
            val subnets: List<String>
    )

    class DeploymentConfiguration(
            val maximumPercent: Int? = null,
            val minimumHealthyPercent: Int? = null
    )

    class LoadBalancer(
            val containerName: String? = null,
            val containerPort: Int,
            val loadBalancerName: String? = null,
            val targetGroupArn: String? = null
    )

    class NetworkConfiguration(
            val awsvpcConfiguration: AwsVpcConfiguration? = null
    )

    class PlacementConstraint(
            val expression: String? = null,
            val type: String
    )

    class PlacementStrategy(
            val field: String? = null,
            val type: String
    )

}

fun Resources.awsECSService(logicalId: String, init: AWSECSService.() -> Unit = {}): AWSECSService {
    return AWSECSService(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
