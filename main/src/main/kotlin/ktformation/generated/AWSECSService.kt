
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECS::Service - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
 */
@CloudFormationMarker
class AWSECSService(logicalId: String) : Resource<AWSECSService.Properties>(logicalId, "AWS::ECS::Service") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cluster](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cluster: Any? = null

        /**
         * [cluster](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cluster(value: String) {
          this.cluster = value
        }
        
        /**
         * [cluster](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cluster(value: IntrinsicFunction) {
          this.cluster = value
        }
        
        /**
         * [deploymentConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DeploymentConfiguration
         */
        @JvmField
        var deploymentConfiguration: Any? = null

        /**
         * [deploymentConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DeploymentConfiguration
         */
        fun deploymentConfiguration(value: DeploymentConfiguration) {
          this.deploymentConfiguration = value
        }
        
        /**
         * [deploymentConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
         *
         * _Required_: no
         *
         * _Type_: DeploymentConfiguration
         */
        fun deploymentConfiguration(value: IntrinsicFunction) {
          this.deploymentConfiguration = value
        }
        
        /**
         * [desiredCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var desiredCount: Any? = null

        /**
         * [desiredCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun desiredCount(value: Int) {
          this.desiredCount = value
        }
        
        /**
         * [desiredCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun desiredCount(value: IntrinsicFunction) {
          this.desiredCount = value
        }
        
        /**
         * [healthCheckGracePeriodSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var healthCheckGracePeriodSeconds: Any? = null

        /**
         * [healthCheckGracePeriodSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckGracePeriodSeconds(value: Int) {
          this.healthCheckGracePeriodSeconds = value
        }
        
        /**
         * [healthCheckGracePeriodSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckGracePeriodSeconds(value: IntrinsicFunction) {
          this.healthCheckGracePeriodSeconds = value
        }
        
        /**
         * [launchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var launchType: Any? = null

        /**
         * [launchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchType(value: String) {
          this.launchType = value
        }
        
        /**
         * [launchType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun launchType(value: IntrinsicFunction) {
          this.launchType = value
        }
        
        /**
         * [loadBalancers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
         *
         * _Required_: no
         *
         * _Type_: List<LoadBalancer>
         */
        @JvmField
        var loadBalancers: Any? = null

        /**
         * [loadBalancers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
         *
         * _Required_: no
         *
         * _Type_: List<LoadBalancer>
         */
        fun loadBalancers(value: List<LoadBalancer>) {
          this.loadBalancers = value
        }
        
        /**
         * [loadBalancers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
         *
         * _Required_: no
         *
         * _Type_: List<LoadBalancer>
         */
        fun loadBalancers(vararg value: IntrinsicFunction) {
          this.loadBalancers = value
        }
        
        /**
         * [networkConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
         *
         * _Required_: no
         *
         * _Type_: NetworkConfiguration
         */
        @JvmField
        var networkConfiguration: Any? = null

        /**
         * [networkConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
         *
         * _Required_: no
         *
         * _Type_: NetworkConfiguration
         */
        fun networkConfiguration(value: NetworkConfiguration) {
          this.networkConfiguration = value
        }
        
        /**
         * [networkConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
         *
         * _Required_: no
         *
         * _Type_: NetworkConfiguration
         */
        fun networkConfiguration(value: IntrinsicFunction) {
          this.networkConfiguration = value
        }
        
        /**
         * [placementConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<PlacementConstraint>
         */
        @JvmField
        var placementConstraints: Any? = null

        /**
         * [placementConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<PlacementConstraint>
         */
        fun placementConstraints(value: List<PlacementConstraint>) {
          this.placementConstraints = value
        }
        
        /**
         * [placementConstraints](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
         *
         * _Required_: no
         *
         * _Type_: List<PlacementConstraint>
         */
        fun placementConstraints(vararg value: IntrinsicFunction) {
          this.placementConstraints = value
        }
        
        /**
         * [placementStrategies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
         *
         * _Required_: no
         *
         * _Type_: List<PlacementStrategy>
         */
        @JvmField
        var placementStrategies: Any? = null

        /**
         * [placementStrategies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
         *
         * _Required_: no
         *
         * _Type_: List<PlacementStrategy>
         */
        fun placementStrategies(value: List<PlacementStrategy>) {
          this.placementStrategies = value
        }
        
        /**
         * [placementStrategies](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
         *
         * _Required_: no
         *
         * _Type_: List<PlacementStrategy>
         */
        fun placementStrategies(vararg value: IntrinsicFunction) {
          this.placementStrategies = value
        }
        
        /**
         * [platformVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var platformVersion: Any? = null

        /**
         * [platformVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun platformVersion(value: String) {
          this.platformVersion = value
        }
        
        /**
         * [platformVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun platformVersion(value: IntrinsicFunction) {
          this.platformVersion = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var role: Any? = null

        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun role(value: String) {
          this.role = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun role(value: IntrinsicFunction) {
          this.role = value
        }
        
        /**
         * [serviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serviceName: Any? = null

        /**
         * [serviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceName(value: String) {
          this.serviceName = value
        }
        
        /**
         * [serviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serviceName(value: IntrinsicFunction) {
          this.serviceName = value
        }
        
        /**
         * [serviceRegistries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
         *
         * _Required_: no
         *
         * _Type_: List<ServiceRegistry>
         */
        @JvmField
        var serviceRegistries: Any? = null

        /**
         * [serviceRegistries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
         *
         * _Required_: no
         *
         * _Type_: List<ServiceRegistry>
         */
        fun serviceRegistries(value: List<ServiceRegistry>) {
          this.serviceRegistries = value
        }
        
        /**
         * [serviceRegistries](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
         *
         * _Required_: no
         *
         * _Type_: List<ServiceRegistry>
         */
        fun serviceRegistries(vararg value: IntrinsicFunction) {
          this.serviceRegistries = value
        }
        
        /**
         * [taskDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var taskDefinition: Any? = null

        /**
         * [taskDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskDefinition(value: String) {
          this.taskDefinition = value
        }
        
        /**
         * [taskDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun taskDefinition(value: IntrinsicFunction) {
          this.taskDefinition = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AwsVpcConfiguration(
            /**
             * [AssignPublicIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val assignPublicIp: String? = null,
            /**
             * [SecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val securityGroups: List<String>? = null,
            /**
             * [Subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnets: List<String>
    )

    class DeploymentConfiguration(
            /**
             * [MaximumPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val maximumPercent: Int? = null,
            /**
             * [MinimumHealthyPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val minimumHealthyPercent: Int? = null
    )

    class LoadBalancer(
            /**
             * [ContainerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val containerName: String? = null,
            /**
             * [ContainerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val containerPort: Int,
            /**
             * [LoadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val loadBalancerName: String? = null,
            /**
             * [TargetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val targetGroupArn: String? = null
    )

    class NetworkConfiguration(
            /**
             * [AwsvpcConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html#cfn-ecs-service-networkconfiguration-awsvpcconfiguration)
             *
             * _Required_: no
             *
             * _Type_: AwsVpcConfiguration
             */
            val awsvpcConfiguration: AwsVpcConfiguration? = null
    )

    class PlacementConstraint(
            /**
             * [Expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val expression: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class PlacementStrategy(
            /**
             * [Field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val field: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class ServiceRegistry(
            /**
             * [Port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val port: Int? = null,
            /**
             * [RegistryArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val registryArn: String? = null
    )

}

/**
 * [AWS::ECS::Service - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
 */
fun Resources.awsECSService(logicalId: String, init: AWSECSService.() -> Unit = {}): AWSECSService {
    return AWSECSService(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
