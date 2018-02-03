
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodePipeline::CustomActionType - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
 */
@CloudFormationMarker
class AWSCodePipelineCustomActionType(logicalId: String) : Resource<AWSCodePipelineCustomActionType.Properties>(logicalId, "AWS::CodePipeline::CustomActionType") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [category](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var category: Any? = null

        /**
         * [category](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun category(value: String) {
          this.category = value
        }
        
        /**
         * [category](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun category(value: IntrinsicFunction) {
          this.category = value
        }
        
        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: List<ConfigurationProperties>
         */
        @JvmField
        var configurationProperties: Any? = null

        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: List<ConfigurationProperties>
         */
        fun configurationProperties(value: List<ConfigurationProperties>) {
          this.configurationProperties = value
        }
        
        /**
         * [configurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
         *
         * _Required_: no
         *
         * _Type_: List<ConfigurationProperties>
         */
        fun configurationProperties(vararg value: IntrinsicFunction) {
          this.configurationProperties = value
        }
        
        /**
         * [inputArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactDetails
         */
        @JvmField
        var inputArtifactDetails: Any? = null

        /**
         * [inputArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactDetails
         */
        fun inputArtifactDetails(value: ArtifactDetails) {
          this.inputArtifactDetails = value
        }
        
        /**
         * [inputArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactDetails
         */
        fun inputArtifactDetails(value: IntrinsicFunction) {
          this.inputArtifactDetails = value
        }
        
        /**
         * [outputArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactDetails
         */
        @JvmField
        var outputArtifactDetails: Any? = null

        /**
         * [outputArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactDetails
         */
        fun outputArtifactDetails(value: ArtifactDetails) {
          this.outputArtifactDetails = value
        }
        
        /**
         * [outputArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
         *
         * _Required_: yes
         *
         * _Type_: ArtifactDetails
         */
        fun outputArtifactDetails(value: IntrinsicFunction) {
          this.outputArtifactDetails = value
        }
        
        /**
         * [provider](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var provider: Any? = null

        /**
         * [provider](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun provider(value: String) {
          this.provider = value
        }
        
        /**
         * [provider](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun provider(value: IntrinsicFunction) {
          this.provider = value
        }
        
        /**
         * [settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
         *
         * _Required_: no
         *
         * _Type_: Settings
         */
        @JvmField
        var settings: Any? = null

        /**
         * [settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
         *
         * _Required_: no
         *
         * _Type_: Settings
         */
        fun settings(value: Settings) {
          this.settings = value
        }
        
        /**
         * [settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
         *
         * _Required_: no
         *
         * _Type_: Settings
         */
        fun settings(value: IntrinsicFunction) {
          this.settings = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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
            /**
             * [MaximumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val maximumCount: Int,
            /**
             * [MinimumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val minimumCount: Int
    )

    class ConfigurationProperties(
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val key: Boolean,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Queryable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val queryable: Boolean? = null,
            /**
             * [Required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val required: Boolean,
            /**
             * [Secret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val secret: Boolean,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null
    )

    class Settings(
            /**
             * [EntityUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val entityUrlTemplate: String? = null,
            /**
             * [ExecutionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val executionUrlTemplate: String? = null,
            /**
             * [RevisionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val revisionUrlTemplate: String? = null,
            /**
             * [ThirdPartyConfigurationUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val thirdPartyConfigurationUrl: String? = null
    )

}

/**
 * [AWS::CodePipeline::CustomActionType - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
 */
fun Resources.awsCodePipelineCustomActionType(logicalId: String, init: AWSCodePipelineCustomActionType.() -> Unit = {}): AWSCodePipelineCustomActionType {
    return AWSCodePipelineCustomActionType(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
