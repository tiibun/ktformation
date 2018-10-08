
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
         * [schedulingStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var schedulingStrategy: Any? = null

        /**
         * [schedulingStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun schedulingStrategy(value: String) {
          this.schedulingStrategy = value
        }
        
        /**
         * [schedulingStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun schedulingStrategy(value: IntrinsicFunction) {
          this.schedulingStrategy = value
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

        /**
        * [AwsVpcConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html)
        */
        fun awsVpcConfiguration(init: AwsVpcConfiguration.() -> Unit = {}): AwsVpcConfiguration {
            return AwsVpcConfiguration().also {
                it.init()
            }
        }
        /**
        * [DeploymentConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html)
        */
        fun deploymentConfiguration(init: DeploymentConfiguration.() -> Unit = {}): DeploymentConfiguration {
            return DeploymentConfiguration().also {
                it.init()
            }
        }
        /**
        * [LoadBalancer](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html)
        */
        fun loadBalancer(init: LoadBalancer.() -> Unit = {}): LoadBalancer {
            return LoadBalancer().also {
                it.init()
            }
        }
        /**
        * [NetworkConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html)
        */
        fun networkConfiguration(init: NetworkConfiguration.() -> Unit = {}): NetworkConfiguration {
            return NetworkConfiguration().also {
                it.init()
            }
        }
        /**
        * [PlacementConstraint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html)
        */
        fun placementConstraint(init: PlacementConstraint.() -> Unit = {}): PlacementConstraint {
            return PlacementConstraint().also {
                it.init()
            }
        }
        /**
        * [PlacementStrategy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html)
        */
        fun placementStrategy(init: PlacementStrategy.() -> Unit = {}): PlacementStrategy {
            return PlacementStrategy().also {
                it.init()
            }
        }
        /**
        * [ServiceRegistry](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html)
        */
        fun serviceRegistry(init: ServiceRegistry.() -> Unit = {}): ServiceRegistry {
            return ServiceRegistry().also {
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
    class AwsVpcConfiguration {
            /**
         * [assignPublicIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var assignPublicIp: Any? = null

        /**
         * [assignPublicIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun assignPublicIp(value: String) {
          this.assignPublicIp = value
        }
        
        /**
         * [assignPublicIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun assignPublicIp(value: IntrinsicFunction) {
          this.assignPublicIp = value
        }

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var subnets: Any? = null

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }

    }

    @CloudFormationMarker
    class DeploymentConfiguration {
            /**
         * [maximumPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var maximumPercent: Any? = null

        /**
         * [maximumPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maximumPercent(value: Int) {
          this.maximumPercent = value
        }
        
        /**
         * [maximumPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-maximumpercent)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maximumPercent(value: IntrinsicFunction) {
          this.maximumPercent = value
        }

        /**
         * [minimumHealthyPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var minimumHealthyPercent: Any? = null

        /**
         * [minimumHealthyPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minimumHealthyPercent(value: Int) {
          this.minimumHealthyPercent = value
        }
        
        /**
         * [minimumHealthyPercent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html#cfn-ecs-service-deploymentconfiguration-minimumhealthypercent)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minimumHealthyPercent(value: IntrinsicFunction) {
          this.minimumHealthyPercent = value
        }

    }

    @CloudFormationMarker
    class LoadBalancer {
            /**
         * [containerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerName: Any? = null

        /**
         * [containerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerName(value: String) {
          this.containerName = value
        }
        
        /**
         * [containerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerName(value: IntrinsicFunction) {
          this.containerName = value
        }

        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var containerPort: Any? = null

        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun containerPort(value: Int) {
          this.containerPort = value
        }
        
        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun containerPort(value: IntrinsicFunction) {
          this.containerPort = value
        }

        /**
         * [loadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var loadBalancerName: Any? = null

        /**
         * [loadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loadBalancerName(value: String) {
          this.loadBalancerName = value
        }
        
        /**
         * [loadBalancerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun loadBalancerName(value: IntrinsicFunction) {
          this.loadBalancerName = value
        }

        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var targetGroupArn: Any? = null

        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetGroupArn(value: String) {
          this.targetGroupArn = value
        }
        
        /**
         * [targetGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetGroupArn(value: IntrinsicFunction) {
          this.targetGroupArn = value
        }

    }

    @CloudFormationMarker
    class NetworkConfiguration {
            /**
         * [awsvpcConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html#cfn-ecs-service-networkconfiguration-awsvpcconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AwsVpcConfiguration
         */
        var awsvpcConfiguration: Any? = null

        /**
         * [awsvpcConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html#cfn-ecs-service-networkconfiguration-awsvpcconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AwsVpcConfiguration
         */
        fun awsvpcConfiguration(value: AwsVpcConfiguration) {
          this.awsvpcConfiguration = value
        }
        
        /**
         * [awsvpcConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html#cfn-ecs-service-networkconfiguration-awsvpcconfiguration)
         *
         * _Required_: no
         *
         * _Type_: AwsVpcConfiguration
         */
        fun awsvpcConfiguration(value: IntrinsicFunction) {
          this.awsvpcConfiguration = value
        }

    }

    @CloudFormationMarker
    class PlacementConstraint {
            /**
         * [expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var expression: Any? = null

        /**
         * [expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun expression(value: String) {
          this.expression = value
        }
        
        /**
         * [expression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-expression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun expression(value: IntrinsicFunction) {
          this.expression = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html#cfn-ecs-service-placementconstraint-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class PlacementStrategy {
            /**
         * [field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var field: Any? = null

        /**
         * [field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun field(value: String) {
          this.field = value
        }
        
        /**
         * [field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-field)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun field(value: IntrinsicFunction) {
          this.field = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html#cfn-ecs-service-placementstrategy-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class ServiceRegistry {
            /**
         * [containerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var containerName: Any? = null

        /**
         * [containerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerName(value: String) {
          this.containerName = value
        }
        
        /**
         * [containerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun containerName(value: IntrinsicFunction) {
          this.containerName = value
        }

        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var containerPort: Any? = null

        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun containerPort(value: Int) {
          this.containerPort = value
        }
        
        /**
         * [containerPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun containerPort(value: IntrinsicFunction) {
          this.containerPort = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [registryArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var registryArn: Any? = null

        /**
         * [registryArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun registryArn(value: String) {
          this.registryArn = value
        }
        
        /**
         * [registryArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun registryArn(value: IntrinsicFunction) {
          this.registryArn = value
        }

    }

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
