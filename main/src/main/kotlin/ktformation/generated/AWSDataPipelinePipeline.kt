
package ktformation.generated

import ktformation.*

/**
 * [AWS::DataPipeline::Pipeline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html)
 */
@CloudFormationMarker
class AWSDataPipelinePipeline(logicalId: String) : Resource<AWSDataPipelinePipeline.Properties>(logicalId, "AWS::DataPipeline::Pipeline") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var activate: Any? = null

        fun activate(value: Boolean) {
          this.activate = value
        }
        fun activate(value: IntrinsicFunction) {
  this.activate = value
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
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var parameterObjects: Any? = null

        fun parameterObjects(value: List<ParameterObject>) {
          this.parameterObjects = value
        }
        fun parameterObjects(vararg value: IntrinsicFunction) {
  this.parameterObjects = value
}
        @JvmField
        var parameterValues: Any? = null

        fun parameterValues(value: List<ParameterValue>) {
          this.parameterValues = value
        }
        fun parameterValues(vararg value: IntrinsicFunction) {
  this.parameterValues = value
}
        @JvmField
        var pipelineObjects: Any? = null

        fun pipelineObjects(value: List<PipelineObject>) {
          this.pipelineObjects = value
        }
        fun pipelineObjects(vararg value: IntrinsicFunction) {
  this.pipelineObjects = value
}
        @JvmField
        var pipelineTags: Any? = null

        fun pipelineTags(value: List<PipelineTag>) {
          this.pipelineTags = value
        }
        fun pipelineTags(vararg value: IntrinsicFunction) {
  this.pipelineTags = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Field(
            val key: String,
            val refValue: String? = null,
            val stringValue: String? = null
    )

    class ParameterAttribute(
            val key: String,
            val stringValue: String
    )

    class ParameterObject(
            val attributes: List<ParameterAttribute>,
            val id: String
    )

    class ParameterValue(
            val id: String,
            val stringValue: String
    )

    class PipelineObject(
            val fields: List<Field>,
            val id: String,
            val name: String
    )

    class PipelineTag(
            val key: String,
            val value: String
    )

}

fun Resources.awsDataPipelinePipeline(logicalId: String, init: AWSDataPipelinePipeline.() -> Unit = {}): AWSDataPipelinePipeline {
    return AWSDataPipelinePipeline(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
