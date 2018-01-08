
package ktformation.generated

import ktformation.*

/**
 * [AWS::GameLift::Fleet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
 */
@CloudFormationMarker
class AWSGameLiftFleet(logicalId: String) : Resource<AWSGameLiftFleet.Properties>(logicalId, "AWS::GameLift::Fleet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var buildId: Any? = null

        fun buildId(value: String) {
          this.buildId = value
        }
        fun buildId(value: IntrinsicFunction) {
  this.buildId = value
}
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
        @JvmField
        var desiredEC2Instances: Any? = null

        fun desiredEC2Instances(value: Int) {
          this.desiredEC2Instances = value
        }
        fun desiredEC2Instances(value: IntrinsicFunction) {
  this.desiredEC2Instances = value
}
        @JvmField
        var eC2InboundPermissions: Any? = null

        fun eC2InboundPermissions(value: List<IpPermission>) {
          this.eC2InboundPermissions = value
        }
        fun eC2InboundPermissions(vararg value: IntrinsicFunction) {
  this.eC2InboundPermissions = value
}
        @JvmField
        var eC2InstanceType: Any? = null

        fun eC2InstanceType(value: String) {
          this.eC2InstanceType = value
        }
        fun eC2InstanceType(value: IntrinsicFunction) {
  this.eC2InstanceType = value
}
        @JvmField
        var logPaths: Any? = null

        fun logPaths(value: List<String>) {
          this.logPaths = value
        }
        fun logPaths(vararg value: IntrinsicFunction) {
  this.logPaths = value
}
        @JvmField
        var maxSize: Any? = null

        fun maxSize(value: Int) {
          this.maxSize = value
        }
        fun maxSize(value: IntrinsicFunction) {
  this.maxSize = value
}
        @JvmField
        var minSize: Any? = null

        fun minSize(value: Int) {
          this.minSize = value
        }
        fun minSize(value: IntrinsicFunction) {
  this.minSize = value
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
        var serverLaunchParameters: Any? = null

        fun serverLaunchParameters(value: String) {
          this.serverLaunchParameters = value
        }
        fun serverLaunchParameters(value: IntrinsicFunction) {
  this.serverLaunchParameters = value
}
        @JvmField
        var serverLaunchPath: Any? = null

        fun serverLaunchPath(value: String) {
          this.serverLaunchPath = value
        }
        fun serverLaunchPath(value: IntrinsicFunction) {
  this.serverLaunchPath = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class IpPermission(
            val fromPort: Int,
            val ipRange: String,
            val protocol: String,
            val toPort: Int
    )

}

fun Resources.awsGameLiftFleet(logicalId: String, init: AWSGameLiftFleet.() -> Unit = {}): AWSGameLiftFleet {
    return AWSGameLiftFleet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
