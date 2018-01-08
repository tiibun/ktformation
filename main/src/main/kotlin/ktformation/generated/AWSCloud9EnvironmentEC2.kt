
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cloud9::EnvironmentEC2 - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html)
 */
@CloudFormationMarker
class AWSCloud9EnvironmentEC2(logicalId: String) : Resource<AWSCloud9EnvironmentEC2.Properties>(logicalId, "AWS::Cloud9::EnvironmentEC2") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var automaticStopTimeMinutes: Any? = null

        fun automaticStopTimeMinutes(value: Int) {
          this.automaticStopTimeMinutes = value
        }
        fun automaticStopTimeMinutes(value: IntrinsicFunction) {
  this.automaticStopTimeMinutes = value
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
        var instanceType: Any? = null

        fun instanceType(value: String) {
          this.instanceType = value
        }
        fun instanceType(value: IntrinsicFunction) {
  this.instanceType = value
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
        var ownerArn: Any? = null

        fun ownerArn(value: String) {
          this.ownerArn = value
        }
        fun ownerArn(value: IntrinsicFunction) {
  this.ownerArn = value
}
        @JvmField
        var repositories: Any? = null

        fun repositories(value: List<Repository>) {
          this.repositories = value
        }
        fun repositories(vararg value: IntrinsicFunction) {
  this.repositories = value
}
        @JvmField
        var subnetId: Any? = null

        fun subnetId(value: String) {
          this.subnetId = value
        }
        fun subnetId(value: IntrinsicFunction) {
  this.subnetId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Repository(
            val pathComponent: String,
            val repositoryUrl: String
    )

}

fun Resources.awsCloud9EnvironmentEC2(logicalId: String, init: AWSCloud9EnvironmentEC2.() -> Unit = {}): AWSCloud9EnvironmentEC2 {
    return AWSCloud9EnvironmentEC2(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
