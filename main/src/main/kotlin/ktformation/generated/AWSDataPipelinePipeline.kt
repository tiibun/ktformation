
package ktformation.generated

import ktformation.*

/**
 * [AWS::DataPipeline::Pipeline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html)
 */
@CloudFormationMarker
class AWSDataPipelinePipeline(logicalId: String) : Resource<AWSDataPipelinePipeline.Properties>(logicalId, "AWS::DataPipeline::Pipeline") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [activate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var activate: Any? = null

        /**
         * [activate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun activate(value: Boolean) {
          this.activate = value
        }
        
        /**
         * [activate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun activate(value: IntrinsicFunction) {
          this.activate = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [parameterObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
         *
         * _Required_: yes
         *
         * _Type_: List<ParameterObject>
         */
        @JvmField
        var parameterObjects: Any? = null

        /**
         * [parameterObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
         *
         * _Required_: yes
         *
         * _Type_: List<ParameterObject>
         */
        fun parameterObjects(value: List<ParameterObject>) {
          this.parameterObjects = value
        }
        
        /**
         * [parameterObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
         *
         * _Required_: yes
         *
         * _Type_: List<ParameterObject>
         */
        fun parameterObjects(vararg value: IntrinsicFunction) {
          this.parameterObjects = value
        }
        
        /**
         * [parameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
         *
         * _Required_: no
         *
         * _Type_: List<ParameterValue>
         */
        @JvmField
        var parameterValues: Any? = null

        /**
         * [parameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
         *
         * _Required_: no
         *
         * _Type_: List<ParameterValue>
         */
        fun parameterValues(value: List<ParameterValue>) {
          this.parameterValues = value
        }
        
        /**
         * [parameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
         *
         * _Required_: no
         *
         * _Type_: List<ParameterValue>
         */
        fun parameterValues(vararg value: IntrinsicFunction) {
          this.parameterValues = value
        }
        
        /**
         * [pipelineObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
         *
         * _Required_: no
         *
         * _Type_: List<PipelineObject>
         */
        @JvmField
        var pipelineObjects: Any? = null

        /**
         * [pipelineObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
         *
         * _Required_: no
         *
         * _Type_: List<PipelineObject>
         */
        fun pipelineObjects(value: List<PipelineObject>) {
          this.pipelineObjects = value
        }
        
        /**
         * [pipelineObjects](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
         *
         * _Required_: no
         *
         * _Type_: List<PipelineObject>
         */
        fun pipelineObjects(vararg value: IntrinsicFunction) {
          this.pipelineObjects = value
        }
        
        /**
         * [pipelineTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
         *
         * _Required_: no
         *
         * _Type_: List<PipelineTag>
         */
        @JvmField
        var pipelineTags: Any? = null

        /**
         * [pipelineTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
         *
         * _Required_: no
         *
         * _Type_: List<PipelineTag>
         */
        fun pipelineTags(value: List<PipelineTag>) {
          this.pipelineTags = value
        }
        
        /**
         * [pipelineTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
         *
         * _Required_: no
         *
         * _Type_: List<PipelineTag>
         */
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
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [RefValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-refvalue)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val refValue: String? = null,
            /**
             * [StringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-stringvalue)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val stringValue: String? = null
    )

    class ParameterAttribute(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [StringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stringValue: String
    )

    class ParameterObject(
            /**
             * [Attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes)
             *
             * _Required_: yes
             *
             * _Type_: List<ParameterAttribute>
             */
            val attributes: List<ParameterAttribute>,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String
    )

    class ParameterValue(
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [StringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val stringValue: String
    )

    class PipelineObject(
            /**
             * [Fields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields)
             *
             * _Required_: yes
             *
             * _Type_: List<Field>
             */
            val fields: List<Field>,
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String
    )

    class PipelineTag(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

}

/**
 * [AWS::DataPipeline::Pipeline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html)
 */
fun Resources.awsDataPipelinePipeline(logicalId: String, init: AWSDataPipelinePipeline.() -> Unit = {}): AWSDataPipelinePipeline {
    return AWSDataPipelinePipeline(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
