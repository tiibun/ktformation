
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodePipeline::CustomActionType - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
 */
@CloudFormationMarker
class AWSCodePipelineCustomActionType(logicalId: String) : Resource<AWSCodePipelineCustomActionType.Properties>(logicalId, "AWS::CodePipeline::CustomActionType") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var category: Any? = null

        fun category(value: String) {
          this.category = value
        }
        fun category(value: IntrinsicFunction) {
  this.category = value
}
        @JvmField
        var configurationProperties: Any? = null

        fun configurationProperties(value: List<ConfigurationProperties>) {
          this.configurationProperties = value
        }
        fun configurationProperties(vararg value: IntrinsicFunction) {
  this.configurationProperties = value
}
        @JvmField
        var inputArtifactDetails: Any? = null

        fun inputArtifactDetails(value: ArtifactDetails) {
          this.inputArtifactDetails = value
        }
        fun inputArtifactDetails(value: IntrinsicFunction) {
  this.inputArtifactDetails = value
}
        @JvmField
        var outputArtifactDetails: Any? = null

        fun outputArtifactDetails(value: ArtifactDetails) {
          this.outputArtifactDetails = value
        }
        fun outputArtifactDetails(value: IntrinsicFunction) {
  this.outputArtifactDetails = value
}
        @JvmField
        var provider: Any? = null

        fun provider(value: String) {
          this.provider = value
        }
        fun provider(value: IntrinsicFunction) {
  this.provider = value
}
        @JvmField
        var settings: Any? = null

        fun settings(value: Settings) {
          this.settings = value
        }
        fun settings(value: IntrinsicFunction) {
  this.settings = value
}
        @JvmField
        var version: Any? = null

        fun version(value: String) {
          this.version = value
        }
        fun version(value: IntrinsicFunction) {
  this.version = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ArtifactDetails(
            val maximumCount: Int,
            val minimumCount: Int
    )

    class ConfigurationProperties(
            val description: String? = null,
            val key: Boolean,
            val name: String,
            val queryable: Boolean? = null,
            val required: Boolean,
            val secret: Boolean,
            val type: String? = null
    )

    class Settings(
            val entityUrlTemplate: String? = null,
            val executionUrlTemplate: String? = null,
            val revisionUrlTemplate: String? = null,
            val thirdPartyConfigurationUrl: String? = null
    )

}

fun Resources.awsCodePipelineCustomActionType(logicalId: String, init: AWSCodePipelineCustomActionType.() -> Unit = {}): AWSCodePipelineCustomActionType {
    return AWSCodePipelineCustomActionType(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
