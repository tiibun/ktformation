
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodePipeline::Pipeline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
 */
@CloudFormationMarker
class AWSCodePipelinePipeline(logicalId: String) : Resource<AWSCodePipelinePipeline.Properties>(logicalId, "AWS::CodePipeline::Pipeline") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var artifactStore: Any? = null

        fun artifactStore(value: ArtifactStore) {
          this.artifactStore = value
        }
        
        fun artifactStore(value: IntrinsicFunction) {
          this.artifactStore = value
        }
        
        @JvmField
        var disableInboundStageTransitions: Any? = null

        fun disableInboundStageTransitions(value: List<StageTransition>) {
          this.disableInboundStageTransitions = value
        }
        
        fun disableInboundStageTransitions(vararg value: IntrinsicFunction) {
          this.disableInboundStageTransitions = value
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
        var restartExecutionOnUpdate: Any? = null

        fun restartExecutionOnUpdate(value: Boolean) {
          this.restartExecutionOnUpdate = value
        }
        
        fun restartExecutionOnUpdate(value: IntrinsicFunction) {
          this.restartExecutionOnUpdate = value
        }
        
        @JvmField
        var roleArn: Any? = null

        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
        @JvmField
        var stages: Any? = null

        fun stages(value: List<StageDeclaration>) {
          this.stages = value
        }
        
        fun stages(vararg value: IntrinsicFunction) {
          this.stages = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ActionDeclaration(
            val actionTypeId: ActionTypeId,
            val configuration: Json? = null,
            val inputArtifacts: List<InputArtifact>? = null,
            val name: String,
            val outputArtifacts: List<OutputArtifact>? = null,
            val roleArn: String? = null,
            val runOrder: Int? = null
    )

    class ActionTypeId(
            val category: String,
            val owner: String,
            val provider: String,
            val version: String
    )

    class ArtifactStore(
            val encryptionKey: EncryptionKey? = null,
            val location: String,
            val type: String
    )

    class BlockerDeclaration(
            val name: String,
            val type: String
    )

    class EncryptionKey(
            val id: String,
            val type: String
    )

    class InputArtifact(
            val name: String
    )

    class OutputArtifact(
            val name: String
    )

    class StageDeclaration(
            val actions: List<ActionDeclaration>,
            val blockers: List<BlockerDeclaration>? = null,
            val name: String
    )

    class StageTransition(
            val reason: String,
            val stageName: String
    )

}

fun Resources.awsCodePipelinePipeline(logicalId: String, init: AWSCodePipelinePipeline.() -> Unit = {}): AWSCodePipelinePipeline {
    return AWSCodePipelinePipeline(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
