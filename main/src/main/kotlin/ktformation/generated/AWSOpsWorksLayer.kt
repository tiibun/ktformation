
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Layer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
 */
@CloudFormationMarker
class AWSOpsWorksLayer(logicalId: String) : Resource<AWSOpsWorksLayer.Properties>(logicalId, "AWS::OpsWorks::Layer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun attributes(value: Map<String, Any>) {
          this.attributes = value
        }
        
        /**
         * [autoAssignElasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoAssignElasticIps: Any? = null

        /**
         * [autoAssignElasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun autoAssignElasticIps(value: Boolean) {
          this.autoAssignElasticIps = value
        }
        
        /**
         * [autoAssignElasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun autoAssignElasticIps(value: IntrinsicFunction) {
          this.autoAssignElasticIps = value
        }

        /**
         * [autoAssignPublicIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoAssignPublicIps: Any? = null

        /**
         * [autoAssignPublicIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun autoAssignPublicIps(value: Boolean) {
          this.autoAssignPublicIps = value
        }
        
        /**
         * [autoAssignPublicIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun autoAssignPublicIps(value: IntrinsicFunction) {
          this.autoAssignPublicIps = value
        }

        /**
         * [customInstanceProfileArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var customInstanceProfileArn: Any? = null

        /**
         * [customInstanceProfileArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customInstanceProfileArn(value: String) {
          this.customInstanceProfileArn = value
        }
        
        /**
         * [customInstanceProfileArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customInstanceProfileArn(value: IntrinsicFunction) {
          this.customInstanceProfileArn = value
        }

        /**
         * [customJson](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var customJson: Any? = null

        /**
         * [customJson](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun customJson(value: Json) {
          this.customJson = value
        }
        
        /**
         * [customJson](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun customJson(value: IntrinsicFunction) {
          this.customJson = value
        }

        /**
         * [customRecipes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
         *
         * _Required_: no
         *
         * _Type_: Recipes
         */
        @JvmField
        var customRecipes: Any? = null

        /**
         * [customRecipes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
         *
         * _Required_: no
         *
         * _Type_: Recipes
         */
        fun customRecipes(value: Recipes) {
          this.customRecipes = value
        }
        
        /**
         * [customRecipes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
         *
         * _Required_: no
         *
         * _Type_: Recipes
         */
        fun customRecipes(value: IntrinsicFunction) {
          this.customRecipes = value
        }

        /**
         * [customSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var customSecurityGroupIds: Any? = null

        /**
         * [customSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun customSecurityGroupIds(value: List<String>) {
          this.customSecurityGroupIds = value
        }
        
        /**
         * [customSecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun customSecurityGroupIds(vararg value: IntrinsicFunction) {
          this.customSecurityGroupIds = value
        }

        /**
         * [enableAutoHealing](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableAutoHealing: Any? = null

        /**
         * [enableAutoHealing](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enableAutoHealing(value: Boolean) {
          this.enableAutoHealing = value
        }
        
        /**
         * [enableAutoHealing](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enableAutoHealing(value: IntrinsicFunction) {
          this.enableAutoHealing = value
        }

        /**
         * [installUpdatesOnBoot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var installUpdatesOnBoot: Any? = null

        /**
         * [installUpdatesOnBoot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun installUpdatesOnBoot(value: Boolean) {
          this.installUpdatesOnBoot = value
        }
        
        /**
         * [installUpdatesOnBoot](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun installUpdatesOnBoot(value: IntrinsicFunction) {
          this.installUpdatesOnBoot = value
        }

        /**
         * [lifecycleEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
         *
         * _Required_: no
         *
         * _Type_: LifecycleEventConfiguration
         */
        @JvmField
        var lifecycleEventConfiguration: Any? = null

        /**
         * [lifecycleEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
         *
         * _Required_: no
         *
         * _Type_: LifecycleEventConfiguration
         */
        fun lifecycleEventConfiguration(value: LifecycleEventConfiguration) {
          this.lifecycleEventConfiguration = value
        }
        
        /**
         * [lifecycleEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
         *
         * _Required_: no
         *
         * _Type_: LifecycleEventConfiguration
         */
        fun lifecycleEventConfiguration(value: IntrinsicFunction) {
          this.lifecycleEventConfiguration = value
        }

        /**
         * [loadBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
         *
         * _Required_: no
         *
         * _Type_: LoadBasedAutoScaling
         */
        @JvmField
        var loadBasedAutoScaling: Any? = null

        /**
         * [loadBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
         *
         * _Required_: no
         *
         * _Type_: LoadBasedAutoScaling
         */
        fun loadBasedAutoScaling(value: LoadBasedAutoScaling) {
          this.loadBasedAutoScaling = value
        }
        
        /**
         * [loadBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
         *
         * _Required_: no
         *
         * _Type_: LoadBasedAutoScaling
         */
        fun loadBasedAutoScaling(value: IntrinsicFunction) {
          this.loadBasedAutoScaling = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [packages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var packages: Any? = null

        /**
         * [packages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun packages(value: List<String>) {
          this.packages = value
        }
        
        /**
         * [packages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun packages(vararg value: IntrinsicFunction) {
          this.packages = value
        }

        /**
         * [shortname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var shortname: Any? = null

        /**
         * [shortname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun shortname(value: String) {
          this.shortname = value
        }
        
        /**
         * [shortname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun shortname(value: IntrinsicFunction) {
          this.shortname = value
        }

        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var stackId: Any? = null

        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: String) {
          this.stackId = value
        }
        
        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: IntrinsicFunction) {
          this.stackId = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [useEbsOptimizedInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var useEbsOptimizedInstances: Any? = null

        /**
         * [useEbsOptimizedInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useEbsOptimizedInstances(value: Boolean) {
          this.useEbsOptimizedInstances = value
        }
        
        /**
         * [useEbsOptimizedInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useEbsOptimizedInstances(value: IntrinsicFunction) {
          this.useEbsOptimizedInstances = value
        }

        /**
         * [volumeConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<VolumeConfiguration>
         */
        @JvmField
        var volumeConfigurations: Any? = null

        /**
         * [volumeConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<VolumeConfiguration>
         */
        fun volumeConfigurations(value: List<VolumeConfiguration>) {
          this.volumeConfigurations = value
        }
        
        /**
         * [volumeConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
         *
         * _Required_: no
         *
         * _Type_: List<VolumeConfiguration>
         */
        fun volumeConfigurations(vararg value: IntrinsicFunction) {
          this.volumeConfigurations = value
        }

        /**
        * [AutoScalingThresholds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html)
        */
        fun autoScalingThresholds(init: AutoScalingThresholds.() -> Unit = {}): AutoScalingThresholds {
            return AutoScalingThresholds().also {
                it.init()
            }
        }
        /**
        * [LifecycleEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html)
        */
        fun lifecycleEventConfiguration(init: LifecycleEventConfiguration.() -> Unit = {}): LifecycleEventConfiguration {
            return LifecycleEventConfiguration().also {
                it.init()
            }
        }
        /**
        * [LoadBasedAutoScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html)
        */
        fun loadBasedAutoScaling(init: LoadBasedAutoScaling.() -> Unit = {}): LoadBasedAutoScaling {
            return LoadBasedAutoScaling().also {
                it.init()
            }
        }
        /**
        * [Recipes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html)
        */
        fun recipes(init: Recipes.() -> Unit = {}): Recipes {
            return Recipes().also {
                it.init()
            }
        }
        /**
        * [ShutdownEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html)
        */
        fun shutdownEventConfiguration(init: ShutdownEventConfiguration.() -> Unit = {}): ShutdownEventConfiguration {
            return ShutdownEventConfiguration().also {
                it.init()
            }
        }
        /**
        * [VolumeConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html)
        */
        fun volumeConfiguration(init: VolumeConfiguration.() -> Unit = {}): VolumeConfiguration {
            return VolumeConfiguration().also {
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
    class AutoScalingThresholds {
            /**
         * [cpuThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var cpuThreshold: Any? = null

        /**
         * [cpuThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun cpuThreshold(value: Double) {
          this.cpuThreshold = value
        }
        
        /**
         * [cpuThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun cpuThreshold(value: IntrinsicFunction) {
          this.cpuThreshold = value
        }

        /**
         * [ignoreMetricsTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var ignoreMetricsTime: Any? = null

        /**
         * [ignoreMetricsTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ignoreMetricsTime(value: Int) {
          this.ignoreMetricsTime = value
        }
        
        /**
         * [ignoreMetricsTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ignoreMetricsTime(value: IntrinsicFunction) {
          this.ignoreMetricsTime = value
        }

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var instanceCount: Any? = null

        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun instanceCount(value: Int) {
          this.instanceCount = value
        }
        
        /**
         * [instanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun instanceCount(value: IntrinsicFunction) {
          this.instanceCount = value
        }

        /**
         * [loadThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var loadThreshold: Any? = null

        /**
         * [loadThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun loadThreshold(value: Double) {
          this.loadThreshold = value
        }
        
        /**
         * [loadThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun loadThreshold(value: IntrinsicFunction) {
          this.loadThreshold = value
        }

        /**
         * [memoryThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        var memoryThreshold: Any? = null

        /**
         * [memoryThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun memoryThreshold(value: Double) {
          this.memoryThreshold = value
        }
        
        /**
         * [memoryThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun memoryThreshold(value: IntrinsicFunction) {
          this.memoryThreshold = value
        }

        /**
         * [thresholdsWaitTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var thresholdsWaitTime: Any? = null

        /**
         * [thresholdsWaitTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun thresholdsWaitTime(value: Int) {
          this.thresholdsWaitTime = value
        }
        
        /**
         * [thresholdsWaitTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun thresholdsWaitTime(value: IntrinsicFunction) {
          this.thresholdsWaitTime = value
        }

    }

    @CloudFormationMarker
    class LifecycleEventConfiguration {
            /**
         * [shutdownEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ShutdownEventConfiguration
         */
        var shutdownEventConfiguration: Any? = null

        /**
         * [shutdownEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ShutdownEventConfiguration
         */
        fun shutdownEventConfiguration(value: ShutdownEventConfiguration) {
          this.shutdownEventConfiguration = value
        }
        
        /**
         * [shutdownEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ShutdownEventConfiguration
         */
        fun shutdownEventConfiguration(value: IntrinsicFunction) {
          this.shutdownEventConfiguration = value
        }

    }

    @CloudFormationMarker
    class LoadBasedAutoScaling {
            /**
         * [downScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-downscaling)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingThresholds
         */
        var downScaling: Any? = null

        /**
         * [downScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-downscaling)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingThresholds
         */
        fun downScaling(value: AutoScalingThresholds) {
          this.downScaling = value
        }
        
        /**
         * [downScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-downscaling)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingThresholds
         */
        fun downScaling(value: IntrinsicFunction) {
          this.downScaling = value
        }

        /**
         * [enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enable: Any? = null

        /**
         * [enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enable(value: Boolean) {
          this.enable = value
        }
        
        /**
         * [enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enable(value: IntrinsicFunction) {
          this.enable = value
        }

        /**
         * [upScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-upscaling)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingThresholds
         */
        var upScaling: Any? = null

        /**
         * [upScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-upscaling)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingThresholds
         */
        fun upScaling(value: AutoScalingThresholds) {
          this.upScaling = value
        }
        
        /**
         * [upScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-upscaling)
         *
         * _Required_: no
         *
         * _Type_: AutoScalingThresholds
         */
        fun upScaling(value: IntrinsicFunction) {
          this.upScaling = value
        }

    }

    @CloudFormationMarker
    class Recipes {
            /**
         * [configure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var configure: Any? = null

        /**
         * [configure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun configure(value: List<String>) {
          this.configure = value
        }
        
        /**
         * [configure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun configure(vararg value: IntrinsicFunction) {
          this.configure = value
        }

        /**
         * [deploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var deploy: Any? = null

        /**
         * [deploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun deploy(value: List<String>) {
          this.deploy = value
        }
        
        /**
         * [deploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun deploy(vararg value: IntrinsicFunction) {
          this.deploy = value
        }

        /**
         * [setup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var setup: Any? = null

        /**
         * [setup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun setup(value: List<String>) {
          this.setup = value
        }
        
        /**
         * [setup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun setup(vararg value: IntrinsicFunction) {
          this.setup = value
        }

        /**
         * [shutdown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var shutdown: Any? = null

        /**
         * [shutdown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun shutdown(value: List<String>) {
          this.shutdown = value
        }
        
        /**
         * [shutdown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun shutdown(vararg value: IntrinsicFunction) {
          this.shutdown = value
        }

        /**
         * [undeploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var undeploy: Any? = null

        /**
         * [undeploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun undeploy(value: List<String>) {
          this.undeploy = value
        }
        
        /**
         * [undeploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun undeploy(vararg value: IntrinsicFunction) {
          this.undeploy = value
        }

    }

    @CloudFormationMarker
    class ShutdownEventConfiguration {
            /**
         * [delayUntilElbConnectionsDrained](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var delayUntilElbConnectionsDrained: Any? = null

        /**
         * [delayUntilElbConnectionsDrained](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun delayUntilElbConnectionsDrained(value: Boolean) {
          this.delayUntilElbConnectionsDrained = value
        }
        
        /**
         * [delayUntilElbConnectionsDrained](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun delayUntilElbConnectionsDrained(value: IntrinsicFunction) {
          this.delayUntilElbConnectionsDrained = value
        }

        /**
         * [executionTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var executionTimeout: Any? = null

        /**
         * [executionTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun executionTimeout(value: Int) {
          this.executionTimeout = value
        }
        
        /**
         * [executionTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun executionTimeout(value: IntrinsicFunction) {
          this.executionTimeout = value
        }

    }

    @CloudFormationMarker
    class VolumeConfiguration {
            /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var iops: Any? = null

        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: Int) {
          this.iops = value
        }
        
        /**
         * [iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun iops(value: IntrinsicFunction) {
          this.iops = value
        }

        /**
         * [mountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var mountPoint: Any? = null

        /**
         * [mountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mountPoint(value: String) {
          this.mountPoint = value
        }
        
        /**
         * [mountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mountPoint(value: IntrinsicFunction) {
          this.mountPoint = value
        }

        /**
         * [numberOfDisks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var numberOfDisks: Any? = null

        /**
         * [numberOfDisks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfDisks(value: Int) {
          this.numberOfDisks = value
        }
        
        /**
         * [numberOfDisks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfDisks(value: IntrinsicFunction) {
          this.numberOfDisks = value
        }

        /**
         * [raidLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var raidLevel: Any? = null

        /**
         * [raidLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun raidLevel(value: Int) {
          this.raidLevel = value
        }
        
        /**
         * [raidLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun raidLevel(value: IntrinsicFunction) {
          this.raidLevel = value
        }

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var size: Any? = null

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun size(value: Int) {
          this.size = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun size(value: IntrinsicFunction) {
          this.size = value
        }

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var volumeType: Any? = null

        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: String) {
          this.volumeType = value
        }
        
        /**
         * [volumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun volumeType(value: IntrinsicFunction) {
          this.volumeType = value
        }

    }

}

/**
 * [AWS::OpsWorks::Layer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
 */
fun Resources.awsOpsWorksLayer(logicalId: String, init: AWSOpsWorksLayer.() -> Unit = {}): AWSOpsWorksLayer {
    return AWSOpsWorksLayer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
