
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

        /**
        * [Field](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html)
        */
        fun field(init: Field.() -> Unit = {}): Field {
            return Field().also {
                it.init()
            }
        }
        /**
        * [ParameterAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html)
        */
        fun parameterAttribute(init: ParameterAttribute.() -> Unit = {}): ParameterAttribute {
            return ParameterAttribute().also {
                it.init()
            }
        }
        /**
        * [ParameterObject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html)
        */
        fun parameterObject(init: ParameterObject.() -> Unit = {}): ParameterObject {
            return ParameterObject().also {
                it.init()
            }
        }
        /**
        * [ParameterValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html)
        */
        fun parameterValue(init: ParameterValue.() -> Unit = {}): ParameterValue {
            return ParameterValue().also {
                it.init()
            }
        }
        /**
        * [PipelineObject](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html)
        */
        fun pipelineObject(init: PipelineObject.() -> Unit = {}): PipelineObject {
            return PipelineObject().also {
                it.init()
            }
        }
        /**
        * [PipelineTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html)
        */
        fun pipelineTag(init: PipelineTag.() -> Unit = {}): PipelineTag {
            return PipelineTag().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class Field {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [refValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-refvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var refValue: Any? = null

        /**
         * [refValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-refvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun refValue(value: String) {
          this.refValue = value
        }
        
        /**
         * [refValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-refvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun refValue(value: IntrinsicFunction) {
          this.refValue = value
        }

        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-stringvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var stringValue: Any? = null

        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-stringvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stringValue(value: String) {
          this.stringValue = value
        }
        
        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects-fields.html#cfn-datapipeline-pipeline-pipelineobjects-fields-stringvalue)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stringValue(value: IntrinsicFunction) {
          this.stringValue = value
        }

    }

    @CloudFormationMarker
    class ParameterAttribute {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var stringValue: Any? = null

        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stringValue(value: String) {
          this.stringValue = value
        }
        
        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects-attributes.html#cfn-datapipeline-pipeline-parameterobjects-attribtues-stringvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stringValue(value: IntrinsicFunction) {
          this.stringValue = value
        }

    }

    @CloudFormationMarker
    class ParameterObject {
            /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes)
         *
         * _Required_: yes
         *
         * _Type_: List<ParameterAttribute>
         */
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes)
         *
         * _Required_: yes
         *
         * _Type_: List<ParameterAttribute>
         */
        fun attributes(value: List<ParameterAttribute>) {
          this.attributes = value
        }
        
        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-attributes)
         *
         * _Required_: yes
         *
         * _Type_: List<ParameterAttribute>
         */
        fun attributes(vararg value: IntrinsicFunction) {
          this.attributes = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobjects.html#cfn-datapipeline-pipeline-parameterobjects-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

    }

    @CloudFormationMarker
    class ParameterValue {
            /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var stringValue: Any? = null

        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stringValue(value: String) {
          this.stringValue = value
        }
        
        /**
         * [stringValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalues.html#cfn-datapipeline-pipeline-parametervalues-stringvalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stringValue(value: IntrinsicFunction) {
          this.stringValue = value
        }

    }

    @CloudFormationMarker
    class PipelineObject {
            /**
         * [fields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields)
         *
         * _Required_: yes
         *
         * _Type_: List<Field>
         */
        var fields: Any? = null

        /**
         * [fields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields)
         *
         * _Required_: yes
         *
         * _Type_: List<Field>
         */
        fun fields(value: List<Field>) {
          this.fields = value
        }
        
        /**
         * [fields](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields)
         *
         * _Required_: yes
         *
         * _Type_: List<Field>
         */
        fun fields(vararg value: IntrinsicFunction) {
          this.fields = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class PipelineTag {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetags.html#cfn-datapipeline-pipeline-pipelinetags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

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
