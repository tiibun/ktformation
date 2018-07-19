
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

        /**
        * [ArtifactDetails](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html)
        */
        fun artifactDetails(init: ArtifactDetails.() -> Unit = {}): ArtifactDetails {
            return ArtifactDetails().also {
                it.init()
            }
        }
        /**
        * [ConfigurationProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html)
        */
        fun configurationProperties(init: ConfigurationProperties.() -> Unit = {}): ConfigurationProperties {
            return ConfigurationProperties().also {
                it.init()
            }
        }
        /**
        * [Settings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html)
        */
        fun settings(init: Settings.() -> Unit = {}): Settings {
            return Settings().also {
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
    class ArtifactDetails {
            /**
         * [maximumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var maximumCount: Any? = null

        /**
         * [maximumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maximumCount(value: Int) {
          this.maximumCount = value
        }
        
        /**
         * [maximumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-maximumcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maximumCount(value: IntrinsicFunction) {
          this.maximumCount = value
        }

        /**
         * [minimumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var minimumCount: Any? = null

        /**
         * [minimumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minimumCount(value: Int) {
          this.minimumCount = value
        }
        
        /**
         * [minimumCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html#cfn-codepipeline-customactiontype-artifactdetails-minimumcount)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minimumCount(value: IntrinsicFunction) {
          this.minimumCount = value
        }

    }

    @CloudFormationMarker
    class ConfigurationProperties {
            /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun key(value: Boolean) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [queryable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var queryable: Any? = null

        /**
         * [queryable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun queryable(value: Boolean) {
          this.queryable = value
        }
        
        /**
         * [queryable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun queryable(value: IntrinsicFunction) {
          this.queryable = value
        }

        /**
         * [required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var required: Any? = null

        /**
         * [required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun required(value: Boolean) {
          this.required = value
        }
        
        /**
         * [required](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-required)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun required(value: IntrinsicFunction) {
          this.required = value
        }

        /**
         * [secret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var secret: Any? = null

        /**
         * [secret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun secret(value: Boolean) {
          this.secret = value
        }
        
        /**
         * [secret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-secret)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun secret(value: IntrinsicFunction) {
          this.secret = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class Settings {
            /**
         * [entityUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var entityUrlTemplate: Any? = null

        /**
         * [entityUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun entityUrlTemplate(value: String) {
          this.entityUrlTemplate = value
        }
        
        /**
         * [entityUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-entityurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun entityUrlTemplate(value: IntrinsicFunction) {
          this.entityUrlTemplate = value
        }

        /**
         * [executionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var executionUrlTemplate: Any? = null

        /**
         * [executionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun executionUrlTemplate(value: String) {
          this.executionUrlTemplate = value
        }
        
        /**
         * [executionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-executionurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun executionUrlTemplate(value: IntrinsicFunction) {
          this.executionUrlTemplate = value
        }

        /**
         * [revisionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var revisionUrlTemplate: Any? = null

        /**
         * [revisionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revisionUrlTemplate(value: String) {
          this.revisionUrlTemplate = value
        }
        
        /**
         * [revisionUrlTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-revisionurltemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revisionUrlTemplate(value: IntrinsicFunction) {
          this.revisionUrlTemplate = value
        }

        /**
         * [thirdPartyConfigurationUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var thirdPartyConfigurationUrl: Any? = null

        /**
         * [thirdPartyConfigurationUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun thirdPartyConfigurationUrl(value: String) {
          this.thirdPartyConfigurationUrl = value
        }
        
        /**
         * [thirdPartyConfigurationUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html#cfn-codepipeline-customactiontype-settings-thirdpartyconfigurationurl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun thirdPartyConfigurationUrl(value: IntrinsicFunction) {
          this.thirdPartyConfigurationUrl = value
        }

    }

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
