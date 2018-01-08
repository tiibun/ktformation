
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Stack - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
 */
@CloudFormationMarker
class AWSOpsWorksStack(logicalId: String) : Resource<AWSOpsWorksStack.Properties>(logicalId, "AWS::OpsWorks::Stack") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var agentVersion: Any? = null

        fun agentVersion(value: String) {
          this.agentVersion = value
        }
        fun agentVersion(value: IntrinsicFunction) {
  this.agentVersion = value
}
        @JvmField
        var attributes: Any? = null

        fun attributes(value: Map<String, Any>) {
          this.attributes = value
        }
        
        @JvmField
        var chefConfiguration: Any? = null

        fun chefConfiguration(value: ChefConfiguration) {
          this.chefConfiguration = value
        }
        fun chefConfiguration(value: IntrinsicFunction) {
  this.chefConfiguration = value
}
        @JvmField
        var cloneAppIds: Any? = null

        fun cloneAppIds(value: List<String>) {
          this.cloneAppIds = value
        }
        fun cloneAppIds(vararg value: IntrinsicFunction) {
  this.cloneAppIds = value
}
        @JvmField
        var clonePermissions: Any? = null

        fun clonePermissions(value: Boolean) {
          this.clonePermissions = value
        }
        fun clonePermissions(value: IntrinsicFunction) {
  this.clonePermissions = value
}
        @JvmField
        var configurationManager: Any? = null

        fun configurationManager(value: StackConfigurationManager) {
          this.configurationManager = value
        }
        fun configurationManager(value: IntrinsicFunction) {
  this.configurationManager = value
}
        @JvmField
        var customCookbooksSource: Any? = null

        fun customCookbooksSource(value: Source) {
          this.customCookbooksSource = value
        }
        fun customCookbooksSource(value: IntrinsicFunction) {
  this.customCookbooksSource = value
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
        var defaultAvailabilityZone: Any? = null

        fun defaultAvailabilityZone(value: String) {
          this.defaultAvailabilityZone = value
        }
        fun defaultAvailabilityZone(value: IntrinsicFunction) {
  this.defaultAvailabilityZone = value
}
        @JvmField
        var defaultInstanceProfileArn: Any? = null

        fun defaultInstanceProfileArn(value: String) {
          this.defaultInstanceProfileArn = value
        }
        fun defaultInstanceProfileArn(value: IntrinsicFunction) {
  this.defaultInstanceProfileArn = value
}
        @JvmField
        var defaultOs: Any? = null

        fun defaultOs(value: String) {
          this.defaultOs = value
        }
        fun defaultOs(value: IntrinsicFunction) {
  this.defaultOs = value
}
        @JvmField
        var defaultRootDeviceType: Any? = null

        fun defaultRootDeviceType(value: String) {
          this.defaultRootDeviceType = value
        }
        fun defaultRootDeviceType(value: IntrinsicFunction) {
  this.defaultRootDeviceType = value
}
        @JvmField
        var defaultSshKeyName: Any? = null

        fun defaultSshKeyName(value: String) {
          this.defaultSshKeyName = value
        }
        fun defaultSshKeyName(value: IntrinsicFunction) {
  this.defaultSshKeyName = value
}
        @JvmField
        var defaultSubnetId: Any? = null

        fun defaultSubnetId(value: String) {
          this.defaultSubnetId = value
        }
        fun defaultSubnetId(value: IntrinsicFunction) {
  this.defaultSubnetId = value
}
        @JvmField
        var ecsClusterArn: Any? = null

        fun ecsClusterArn(value: String) {
          this.ecsClusterArn = value
        }
        fun ecsClusterArn(value: IntrinsicFunction) {
  this.ecsClusterArn = value
}
        @JvmField
        var elasticIps: Any? = null

        fun elasticIps(value: List<ElasticIp>) {
          this.elasticIps = value
        }
        fun elasticIps(vararg value: IntrinsicFunction) {
  this.elasticIps = value
}
        @JvmField
        var hostnameTheme: Any? = null

        fun hostnameTheme(value: String) {
          this.hostnameTheme = value
        }
        fun hostnameTheme(value: IntrinsicFunction) {
  this.hostnameTheme = value
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
        var rdsDbInstances: Any? = null

        fun rdsDbInstances(value: List<RdsDbInstance>) {
          this.rdsDbInstances = value
        }
        fun rdsDbInstances(vararg value: IntrinsicFunction) {
  this.rdsDbInstances = value
}
        @JvmField
        var serviceRoleArn: Any? = null

        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        fun serviceRoleArn(value: IntrinsicFunction) {
  this.serviceRoleArn = value
}
        @JvmField
        var sourceStackId: Any? = null

        fun sourceStackId(value: String) {
          this.sourceStackId = value
        }
        fun sourceStackId(value: IntrinsicFunction) {
  this.sourceStackId = value
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
        var useCustomCookbooks: Any? = null

        fun useCustomCookbooks(value: Boolean) {
          this.useCustomCookbooks = value
        }
        fun useCustomCookbooks(value: IntrinsicFunction) {
  this.useCustomCookbooks = value
}
        @JvmField
        var useOpsworksSecurityGroups: Any? = null

        fun useOpsworksSecurityGroups(value: Boolean) {
          this.useOpsworksSecurityGroups = value
        }
        fun useOpsworksSecurityGroups(value: IntrinsicFunction) {
  this.useOpsworksSecurityGroups = value
}
        @JvmField
        var vpcId: Any? = null

        fun vpcId(value: String) {
          this.vpcId = value
        }
        fun vpcId(value: IntrinsicFunction) {
  this.vpcId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ChefConfiguration(
            val berkshelfVersion: String? = null,
            val manageBerkshelf: Boolean? = null
    )

    class ElasticIp(
            val ip: String,
            val name: String? = null
    )

    class RdsDbInstance(
            val dbPassword: String,
            val dbUser: String,
            val rdsDbInstanceArn: String
    )

    class Source(
            val password: String? = null,
            val revision: String? = null,
            val sshKey: String? = null,
            val type: String? = null,
            val url: String? = null,
            val username: String? = null
    )

    class StackConfigurationManager(
            val name: String? = null,
            val version: String? = null
    )

}

fun Resources.awsOpsWorksStack(logicalId: String, init: AWSOpsWorksStack.() -> Unit = {}): AWSOpsWorksStack {
    return AWSOpsWorksStack(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
