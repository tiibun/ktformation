
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodePipeline::Pipeline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
 */
@CloudFormationMarker
class AWSCodePipelinePipeline(logicalId: String) : Resource<AWSCodePipelinePipeline.Properties>(logicalId, "AWS::CodePipeline::Pipeline") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [artifactStore](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactStore
         */
        @JvmField
        var artifactStore: Any? = null

        /**
         * [artifactStore](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactStore
         */
        fun artifactStore(value: ArtifactStore) {
          this.artifactStore = value
        }
        
        /**
         * [artifactStore](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstore)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactStore
         */
        fun artifactStore(value: IntrinsicFunction) {
          this.artifactStore = value
        }
        
        /**
         * [disableInboundStageTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
         *
         * _Required_: no
         *
         * _Type_: List<StageTransition>
         */
        @JvmField
        var disableInboundStageTransitions: Any? = null

        /**
         * [disableInboundStageTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
         *
         * _Required_: no
         *
         * _Type_: List<StageTransition>
         */
        fun disableInboundStageTransitions(value: List<StageTransition>) {
          this.disableInboundStageTransitions = value
        }
        
        /**
         * [disableInboundStageTransitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions)
         *
         * _Required_: no
         *
         * _Type_: List<StageTransition>
         */
        fun disableInboundStageTransitions(vararg value: IntrinsicFunction) {
          this.disableInboundStageTransitions = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [restartExecutionOnUpdate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var restartExecutionOnUpdate: Any? = null

        /**
         * [restartExecutionOnUpdate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun restartExecutionOnUpdate(value: Boolean) {
          this.restartExecutionOnUpdate = value
        }
        
        /**
         * [restartExecutionOnUpdate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun restartExecutionOnUpdate(value: IntrinsicFunction) {
          this.restartExecutionOnUpdate = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
        /**
         * [stages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
         *
         * _Required_: yes
         *
         * _Type_: List<StageDeclaration>
         */
        @JvmField
        var stages: Any? = null

        /**
         * [stages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
         *
         * _Required_: yes
         *
         * _Type_: List<StageDeclaration>
         */
        fun stages(value: List<StageDeclaration>) {
          this.stages = value
        }
        
        /**
         * [stages](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages)
         *
         * _Required_: yes
         *
         * _Type_: List<StageDeclaration>
         */
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
            /**
             * [ActionTypeId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid)
             *
             * _Required_: yes
             *
             * _Type_: ActionTypeId
             */
            val actionTypeId: ActionTypeId,
            /**
             * [Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-configuration)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val configuration: Json? = null,
            /**
             * [InputArtifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-inputartifacts)
             *
             * _Required_: no
             *
             * _Type_: List<InputArtifact>
             */
            val inputArtifacts: List<InputArtifact>? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [OutputArtifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-outputartifacts)
             *
             * _Required_: no
             *
             * _Type_: List<OutputArtifact>
             */
            val outputArtifacts: List<OutputArtifact>? = null,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-rolearn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val roleArn: String? = null,
            /**
             * [RunOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html#cfn-codepipeline-pipeline-stages-actions-runorder)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val runOrder: Int? = null
    )

    class ActionTypeId(
            /**
             * [Category](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-category)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val category: String,
            /**
             * [Owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-owner)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val owner: String,
            /**
             * [Provider](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-provider)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val provider: String,
            /**
             * [Version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-actiontypeid.html#cfn-codepipeline-pipeline-stages-actions-actiontypeid-version)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val version: String
    )

    class ArtifactStore(
            /**
             * [EncryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey)
             *
             * _Required_: no
             *
             * _Type_: EncryptionKey
             */
            val encryptionKey: EncryptionKey? = null,
            /**
             * [Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val location: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class BlockerDeclaration(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html#cfn-codepipeline-pipeline-stages-blockers-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class EncryptionKey(
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class InputArtifact(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-inputartifacts.html#cfn-codepipeline-pipeline-stages-actions-inputartifacts-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String
    )

    class OutputArtifact(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-outputartifacts.html#cfn-codepipeline-pipeline-stages-actions-outputartifacts-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String
    )

    class StageDeclaration(
            /**
             * [Actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-actions)
             *
             * _Required_: yes
             *
             * _Type_: List<ActionDeclaration>
             */
            val actions: List<ActionDeclaration>,
            /**
             * [Blockers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-blockers)
             *
             * _Required_: no
             *
             * _Type_: List<BlockerDeclaration>
             */
            val blockers: List<BlockerDeclaration>? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html#cfn-codepipeline-pipeline-stages-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String
    )

    class StageTransition(
            /**
             * [Reason](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-reason)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val reason: String,
            /**
             * [StageName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-stagename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stageName: String
    )

}

/**
 * [AWS::CodePipeline::Pipeline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
 */
fun Resources.awsCodePipelinePipeline(logicalId: String, init: AWSCodePipelinePipeline.() -> Unit = {}): AWSCodePipelinePipeline {
    return AWSCodePipelinePipeline(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
