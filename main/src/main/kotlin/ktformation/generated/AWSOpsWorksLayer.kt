
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Layer - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
 */
@CloudFormationMarker
class AWSOpsWorksLayer(logicalId: String) : Resource<AWSOpsWorksLayer.Properties>(logicalId, "AWS::OpsWorks::Layer") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var attributes: Any? = null

        fun attributes(value: Map<String, Any>) {
          this.attributes = value
        }
        
        @JvmField
        var autoAssignElasticIps: Any? = null

        fun autoAssignElasticIps(value: Boolean) {
          this.autoAssignElasticIps = value
        }
        fun autoAssignElasticIps(value: IntrinsicFunction) {
  this.autoAssignElasticIps = value
}
        @JvmField
        var autoAssignPublicIps: Any? = null

        fun autoAssignPublicIps(value: Boolean) {
          this.autoAssignPublicIps = value
        }
        fun autoAssignPublicIps(value: IntrinsicFunction) {
  this.autoAssignPublicIps = value
}
        @JvmField
        var customInstanceProfileArn: Any? = null

        fun customInstanceProfileArn(value: String) {
          this.customInstanceProfileArn = value
        }
        fun customInstanceProfileArn(value: IntrinsicFunction) {
  this.customInstanceProfileArn = value
}
        @JvmField
        var customJson: Any? = null

        fun customJson(value: Json) {
          this.customJson = value
        }
        fun customJson(value: IntrinsicFunction) {
  this.customJson = value
}
        @JvmField
        var customRecipes: Any? = null

        fun customRecipes(value: Recipes) {
          this.customRecipes = value
        }
        fun customRecipes(value: IntrinsicFunction) {
  this.customRecipes = value
}
        @JvmField
        var customSecurityGroupIds: Any? = null

        fun customSecurityGroupIds(value: List<String>) {
          this.customSecurityGroupIds = value
        }
        fun customSecurityGroupIds(vararg value: IntrinsicFunction) {
  this.customSecurityGroupIds = value
}
        @JvmField
        var enableAutoHealing: Any? = null

        fun enableAutoHealing(value: Boolean) {
          this.enableAutoHealing = value
        }
        fun enableAutoHealing(value: IntrinsicFunction) {
  this.enableAutoHealing = value
}
        @JvmField
        var installUpdatesOnBoot: Any? = null

        fun installUpdatesOnBoot(value: Boolean) {
          this.installUpdatesOnBoot = value
        }
        fun installUpdatesOnBoot(value: IntrinsicFunction) {
  this.installUpdatesOnBoot = value
}
        @JvmField
        var lifecycleEventConfiguration: Any? = null

        fun lifecycleEventConfiguration(value: LifecycleEventConfiguration) {
          this.lifecycleEventConfiguration = value
        }
        fun lifecycleEventConfiguration(value: IntrinsicFunction) {
  this.lifecycleEventConfiguration = value
}
        @JvmField
        var loadBasedAutoScaling: Any? = null

        fun loadBasedAutoScaling(value: LoadBasedAutoScaling) {
          this.loadBasedAutoScaling = value
        }
        fun loadBasedAutoScaling(value: IntrinsicFunction) {
  this.loadBasedAutoScaling = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var packages: Any? = null

        fun packages(value: List<String>) {
          this.packages = value
        }
        fun packages(vararg value: IntrinsicFunction) {
  this.packages = value
}
        @JvmField
        var shortname: Any? = null

        fun shortname(value: String) {
          this.shortname = value
        }
        fun shortname(value: IntrinsicFunction) {
  this.shortname = value
}
        @JvmField
        var stackId: Any? = null

        fun stackId(value: String) {
          this.stackId = value
        }
        fun stackId(value: IntrinsicFunction) {
  this.stackId = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
        @JvmField
        var type: Any? = null

        fun type(value: String) {
          this.type = value
        }
        fun type(value: IntrinsicFunction) {
  this.type = value
}
        @JvmField
        var useEbsOptimizedInstances: Any? = null

        fun useEbsOptimizedInstances(value: Boolean) {
          this.useEbsOptimizedInstances = value
        }
        fun useEbsOptimizedInstances(value: IntrinsicFunction) {
  this.useEbsOptimizedInstances = value
}
        @JvmField
        var volumeConfigurations: Any? = null

        fun volumeConfigurations(value: List<VolumeConfiguration>) {
          this.volumeConfigurations = value
        }
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
            val cpuThreshold: Double? = null,
            val ignoreMetricsTime: Int? = null,
            val instanceCount: Int? = null,
            val loadThreshold: Double? = null,
            val memoryThreshold: Double? = null,
            val thresholdsWaitTime: Int? = null
    )

    class LifecycleEventConfiguration(
            val shutdownEventConfiguration: ShutdownEventConfiguration? = null
    )

    class LoadBasedAutoScaling(
            val downScaling: AutoScalingThresholds? = null,
            val enable: Boolean? = null,
            val upScaling: AutoScalingThresholds? = null
    )

    class Recipes(
            val configure: List<String>? = null,
            val deploy: List<String>? = null,
            val setup: List<String>? = null,
            val shutdown: List<String>? = null,
            val undeploy: List<String>? = null
    )

    class ShutdownEventConfiguration(
            val delayUntilElbConnectionsDrained: Boolean? = null,
            val executionTimeout: Int? = null
    )

    class VolumeConfiguration(
            val iops: Int? = null,
            val mountPoint: String? = null,
            val numberOfDisks: Int? = null,
            val raidLevel: Int? = null,
            val size: Int? = null,
            val volumeType: String? = null
    )

}

fun Resources.awsOpsWorksLayer(logicalId: String, init: AWSOpsWorksLayer.() -> Unit = {}): AWSOpsWorksLayer {
    return AWSOpsWorksLayer(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
