
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AutoScalingThresholds(
            /**
             * [CpuThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val cpuThreshold: Double? = null,
            /**
             * [IgnoreMetricsTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val ignoreMetricsTime: Int? = null,
            /**
             * [InstanceCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val instanceCount: Int? = null,
            /**
             * [LoadThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val loadThreshold: Double? = null,
            /**
             * [MemoryThreshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold)
             *
             * _Required_: no
             *
             * _Type_: Double
             */
            val memoryThreshold: Double? = null,
            /**
             * [ThresholdsWaitTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val thresholdsWaitTime: Int? = null
    )

    class LifecycleEventConfiguration(
            /**
             * [ShutdownEventConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration)
             *
             * _Required_: no
             *
             * _Type_: ShutdownEventConfiguration
             */
            val shutdownEventConfiguration: ShutdownEventConfiguration? = null
    )

    class LoadBasedAutoScaling(
            /**
             * [DownScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-downscaling)
             *
             * _Required_: no
             *
             * _Type_: AutoScalingThresholds
             */
            val downScaling: AutoScalingThresholds? = null,
            /**
             * [Enable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enable: Boolean? = null,
            /**
             * [UpScaling](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-upscaling)
             *
             * _Required_: no
             *
             * _Type_: AutoScalingThresholds
             */
            val upScaling: AutoScalingThresholds? = null
    )

    class Recipes(
            /**
             * [Configure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-configure)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val configure: List<String>? = null,
            /**
             * [Deploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-deploy)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val deploy: List<String>? = null,
            /**
             * [Setup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-setup)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val setup: List<String>? = null,
            /**
             * [Shutdown](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-shutdown)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val shutdown: List<String>? = null,
            /**
             * [Undeploy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html#cfn-opsworks-layer-customrecipes-undeploy)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val undeploy: List<String>? = null
    )

    class ShutdownEventConfiguration(
            /**
             * [DelayUntilElbConnectionsDrained](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-delayuntilelbconnectionsdrained)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val delayUntilElbConnectionsDrained: Boolean? = null,
            /**
             * [ExecutionTimeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration-shutdowneventconfiguration.html#cfn-opsworks-layer-lifecycleconfiguration-shutdowneventconfiguration-executiontimeout)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val executionTimeout: Int? = null
    )

    class VolumeConfiguration(
            /**
             * [Iops](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-iops)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val iops: Int? = null,
            /**
             * [MountPoint](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-mountpoint)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val mountPoint: String? = null,
            /**
             * [NumberOfDisks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-numberofdisks)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val numberOfDisks: Int? = null,
            /**
             * [RaidLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-raidlevel)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val raidLevel: Int? = null,
            /**
             * [Size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-size)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val size: Int? = null,
            /**
             * [VolumeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html#cfn-opsworks-layer-volconfig-volumetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val volumeType: String? = null
    )

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
