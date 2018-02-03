
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeBuild::Project - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 */
@CloudFormationMarker
class AWSCodeBuildProject(logicalId: String) : Resource<AWSCodeBuildProject.Properties>(logicalId, "AWS::CodeBuild::Project") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var artifacts: Any? = null

        fun artifacts(value: Artifacts) {
          this.artifacts = value
        }
        fun artifacts(value: IntrinsicFunction) {
  this.artifacts = value
}
        @JvmField
        var badgeEnabled: Any? = null

        fun badgeEnabled(value: Boolean) {
          this.badgeEnabled = value
        }
        fun badgeEnabled(value: IntrinsicFunction) {
  this.badgeEnabled = value
}
        @JvmField
        var cache: Any? = null

        fun cache(value: ProjectCache) {
          this.cache = value
        }
        fun cache(value: IntrinsicFunction) {
  this.cache = value
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
        var encryptionKey: Any? = null

        fun encryptionKey(value: String) {
          this.encryptionKey = value
        }
        fun encryptionKey(value: IntrinsicFunction) {
  this.encryptionKey = value
}
        @JvmField
        var environment: Any? = null

        fun environment(value: Environment) {
          this.environment = value
        }
        fun environment(value: IntrinsicFunction) {
  this.environment = value
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
        var serviceRole: Any? = null

        fun serviceRole(value: String) {
          this.serviceRole = value
        }
        fun serviceRole(value: IntrinsicFunction) {
  this.serviceRole = value
}
        @JvmField
        var source: Any? = null

        fun source(value: Source) {
          this.source = value
        }
        fun source(value: IntrinsicFunction) {
  this.source = value
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
        var timeoutInMinutes: Any? = null

        fun timeoutInMinutes(value: Int) {
          this.timeoutInMinutes = value
        }
        fun timeoutInMinutes(value: IntrinsicFunction) {
  this.timeoutInMinutes = value
}
        @JvmField
        var vpcConfig: Any? = null

        fun vpcConfig(value: VpcConfig) {
          this.vpcConfig = value
        }
        fun vpcConfig(value: IntrinsicFunction) {
  this.vpcConfig = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Artifacts(
            val location: String? = null,
            val name: String? = null,
            val namespaceType: String? = null,
            val packaging: String? = null,
            val path: String? = null,
            val type: String
    )

    class Environment(
            val computeType: String,
            val environmentVariables: List<EnvironmentVariable>? = null,
            val image: String,
            val privilegedMode: Boolean? = null,
            val type: String
    )

    class EnvironmentVariable(
            val name: String,
            val type: String? = null,
            val value: String
    )

    class ProjectCache(
            val location: String? = null,
            val type: String
    )

    class Source(
            val auth: SourceAuth? = null,
            val buildSpec: String? = null,
            val gitCloneDepth: Int? = null,
            val insecureSsl: Boolean? = null,
            val location: String? = null,
            val type: String
    )

    class SourceAuth(
            val resource: String? = null,
            val type: String
    )

    class VpcConfig(
            val securityGroupIds: List<String>,
            val subnets: List<String>,
            val vpcId: String
    )

}

fun Resources.awsCodeBuildProject(logicalId: String, init: AWSCodeBuildProject.() -> Unit = {}): AWSCodeBuildProject {
    return AWSCodeBuildProject(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
