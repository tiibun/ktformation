
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeBuild::Project - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 */
@CloudFormationMarker
class AWSCodeBuildProject(logicalId: String) : Resource<AWSCodeBuildProject.Properties>(logicalId, "AWS::CodeBuild::Project") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [artifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
         *
         * _Required_: yes
         *
         * _Type_: Artifacts
         */
        @JvmField
        var artifacts: Any? = null

        /**
         * [artifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
         *
         * _Required_: yes
         *
         * _Type_: Artifacts
         */
        fun artifacts(value: Artifacts) {
          this.artifacts = value
        }
        
        /**
         * [artifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
         *
         * _Required_: yes
         *
         * _Type_: Artifacts
         */
        fun artifacts(value: IntrinsicFunction) {
          this.artifacts = value
        }

        /**
         * [badgeEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var badgeEnabled: Any? = null

        /**
         * [badgeEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun badgeEnabled(value: Boolean) {
          this.badgeEnabled = value
        }
        
        /**
         * [badgeEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun badgeEnabled(value: IntrinsicFunction) {
          this.badgeEnabled = value
        }

        /**
         * [cache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
         *
         * _Required_: no
         *
         * _Type_: ProjectCache
         */
        @JvmField
        var cache: Any? = null

        /**
         * [cache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
         *
         * _Required_: no
         *
         * _Type_: ProjectCache
         */
        fun cache(value: ProjectCache) {
          this.cache = value
        }
        
        /**
         * [cache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
         *
         * _Required_: no
         *
         * _Type_: ProjectCache
         */
        fun cache(value: IntrinsicFunction) {
          this.cache = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [encryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var encryptionKey: Any? = null

        /**
         * [encryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun encryptionKey(value: String) {
          this.encryptionKey = value
        }
        
        /**
         * [encryptionKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun encryptionKey(value: IntrinsicFunction) {
          this.encryptionKey = value
        }

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
         *
         * _Required_: yes
         *
         * _Type_: Environment
         */
        @JvmField
        var environment: Any? = null

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
         *
         * _Required_: yes
         *
         * _Type_: Environment
         */
        fun environment(value: Environment) {
          this.environment = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
         *
         * _Required_: yes
         *
         * _Type_: Environment
         */
        fun environment(value: IntrinsicFunction) {
          this.environment = value
        }

        /**
         * [logsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
         *
         * _Required_: no
         *
         * _Type_: LogsConfig
         */
        @JvmField
        var logsConfig: Any? = null

        /**
         * [logsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
         *
         * _Required_: no
         *
         * _Type_: LogsConfig
         */
        fun logsConfig(value: LogsConfig) {
          this.logsConfig = value
        }
        
        /**
         * [logsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
         *
         * _Required_: no
         *
         * _Type_: LogsConfig
         */
        fun logsConfig(value: IntrinsicFunction) {
          this.logsConfig = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [secondaryArtifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
         *
         * _Required_: no
         *
         * _Type_: List<Artifacts>
         */
        @JvmField
        var secondaryArtifacts: Any? = null

        /**
         * [secondaryArtifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
         *
         * _Required_: no
         *
         * _Type_: List<Artifacts>
         */
        fun secondaryArtifacts(value: List<Artifacts>) {
          this.secondaryArtifacts = value
        }
        
        /**
         * [secondaryArtifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
         *
         * _Required_: no
         *
         * _Type_: List<Artifacts>
         */
        fun secondaryArtifacts(vararg value: IntrinsicFunction) {
          this.secondaryArtifacts = value
        }

        /**
         * [secondarySources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
         *
         * _Required_: no
         *
         * _Type_: List<Source>
         */
        @JvmField
        var secondarySources: Any? = null

        /**
         * [secondarySources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
         *
         * _Required_: no
         *
         * _Type_: List<Source>
         */
        fun secondarySources(value: List<Source>) {
          this.secondarySources = value
        }
        
        /**
         * [secondarySources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
         *
         * _Required_: no
         *
         * _Type_: List<Source>
         */
        fun secondarySources(vararg value: IntrinsicFunction) {
          this.secondarySources = value
        }

        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceRole: Any? = null

        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRole(value: String) {
          this.serviceRole = value
        }
        
        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRole(value: IntrinsicFunction) {
          this.serviceRole = value
        }

        /**
         * [source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
         *
         * _Required_: yes
         *
         * _Type_: Source
         */
        @JvmField
        var source: Any? = null

        /**
         * [source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
         *
         * _Required_: yes
         *
         * _Type_: Source
         */
        fun source(value: Source) {
          this.source = value
        }
        
        /**
         * [source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
         *
         * _Required_: yes
         *
         * _Type_: Source
         */
        fun source(value: IntrinsicFunction) {
          this.source = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [timeoutInMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var timeoutInMinutes: Any? = null

        /**
         * [timeoutInMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutInMinutes(value: Int) {
          this.timeoutInMinutes = value
        }
        
        /**
         * [timeoutInMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeoutInMinutes(value: IntrinsicFunction) {
          this.timeoutInMinutes = value
        }

        /**
         * [triggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
         *
         * _Required_: no
         *
         * _Type_: ProjectTriggers
         */
        @JvmField
        var triggers: Any? = null

        /**
         * [triggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
         *
         * _Required_: no
         *
         * _Type_: ProjectTriggers
         */
        fun triggers(value: ProjectTriggers) {
          this.triggers = value
        }
        
        /**
         * [triggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
         *
         * _Required_: no
         *
         * _Type_: ProjectTriggers
         */
        fun triggers(value: IntrinsicFunction) {
          this.triggers = value
        }

        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        @JvmField
        var vpcConfig: Any? = null

        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: VpcConfig) {
          this.vpcConfig = value
        }
        
        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: IntrinsicFunction) {
          this.vpcConfig = value
        }

        /**
        * [Artifacts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html)
        */
        fun artifacts(init: Artifacts.() -> Unit = {}): Artifacts {
            return Artifacts().also {
                it.init()
            }
        }
        /**
        * [CloudWatchLogsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html)
        */
        fun cloudWatchLogsConfig(init: CloudWatchLogsConfig.() -> Unit = {}): CloudWatchLogsConfig {
            return CloudWatchLogsConfig().also {
                it.init()
            }
        }
        /**
        * [Environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html)
        */
        fun environment(init: Environment.() -> Unit = {}): Environment {
            return Environment().also {
                it.init()
            }
        }
        /**
        * [EnvironmentVariable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html)
        */
        fun environmentVariable(init: EnvironmentVariable.() -> Unit = {}): EnvironmentVariable {
            return EnvironmentVariable().also {
                it.init()
            }
        }
        /**
        * [LogsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html)
        */
        fun logsConfig(init: LogsConfig.() -> Unit = {}): LogsConfig {
            return LogsConfig().also {
                it.init()
            }
        }
        /**
        * [ProjectCache](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html)
        */
        fun projectCache(init: ProjectCache.() -> Unit = {}): ProjectCache {
            return ProjectCache().also {
                it.init()
            }
        }
        /**
        * [ProjectTriggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html)
        */
        fun projectTriggers(init: ProjectTriggers.() -> Unit = {}): ProjectTriggers {
            return ProjectTriggers().also {
                it.init()
            }
        }
        /**
        * [S3LogsConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html)
        */
        fun s3LogsConfig(init: S3LogsConfig.() -> Unit = {}): S3LogsConfig {
            return S3LogsConfig().also {
                it.init()
            }
        }
        /**
        * [Source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
        */
        fun source(init: Source.() -> Unit = {}): Source {
            return Source().also {
                it.init()
            }
        }
        /**
        * [SourceAuth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html)
        */
        fun sourceAuth(init: SourceAuth.() -> Unit = {}): SourceAuth {
            return SourceAuth().also {
                it.init()
            }
        }
        /**
        * [VpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html)
        */
        fun vpcConfig(init: VpcConfig.() -> Unit = {}): VpcConfig {
            return VpcConfig().also {
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
    class Artifacts {
            /**
         * [artifactIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var artifactIdentifier: Any? = null

        /**
         * [artifactIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun artifactIdentifier(value: String) {
          this.artifactIdentifier = value
        }
        
        /**
         * [artifactIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun artifactIdentifier(value: IntrinsicFunction) {
          this.artifactIdentifier = value
        }

        /**
         * [encryptionDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var encryptionDisabled: Any? = null

        /**
         * [encryptionDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encryptionDisabled(value: Boolean) {
          this.encryptionDisabled = value
        }
        
        /**
         * [encryptionDisabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encryptionDisabled(value: IntrinsicFunction) {
          this.encryptionDisabled = value
        }

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [namespaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var namespaceType: Any? = null

        /**
         * [namespaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun namespaceType(value: String) {
          this.namespaceType = value
        }
        
        /**
         * [namespaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun namespaceType(value: IntrinsicFunction) {
          this.namespaceType = value
        }

        /**
         * [overrideArtifactName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var overrideArtifactName: Any? = null

        /**
         * [overrideArtifactName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun overrideArtifactName(value: Boolean) {
          this.overrideArtifactName = value
        }
        
        /**
         * [overrideArtifactName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun overrideArtifactName(value: IntrinsicFunction) {
          this.overrideArtifactName = value
        }

        /**
         * [packaging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var packaging: Any? = null

        /**
         * [packaging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun packaging(value: String) {
          this.packaging = value
        }
        
        /**
         * [packaging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun packaging(value: IntrinsicFunction) {
          this.packaging = value
        }

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class CloudWatchLogsConfig {
            /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var groupName: Any? = null

        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: String) {
          this.groupName = value
        }
        
        /**
         * [groupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun groupName(value: IntrinsicFunction) {
          this.groupName = value
        }

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }

        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var streamName: Any? = null

        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun streamName(value: String) {
          this.streamName = value
        }
        
        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun streamName(value: IntrinsicFunction) {
          this.streamName = value
        }

    }

    @CloudFormationMarker
    class Environment {
            /**
         * [certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var certificate: Any? = null

        /**
         * [certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificate(value: String) {
          this.certificate = value
        }
        
        /**
         * [certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificate(value: IntrinsicFunction) {
          this.certificate = value
        }

        /**
         * [computeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var computeType: Any? = null

        /**
         * [computeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun computeType(value: String) {
          this.computeType = value
        }
        
        /**
         * [computeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun computeType(value: IntrinsicFunction) {
          this.computeType = value
        }

        /**
         * [environmentVariables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables)
         *
         * _Required_: no
         *
         * _Type_: List<EnvironmentVariable>
         */
        var environmentVariables: Any? = null

        /**
         * [environmentVariables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables)
         *
         * _Required_: no
         *
         * _Type_: List<EnvironmentVariable>
         */
        fun environmentVariables(value: List<EnvironmentVariable>) {
          this.environmentVariables = value
        }
        
        /**
         * [environmentVariables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables)
         *
         * _Required_: no
         *
         * _Type_: List<EnvironmentVariable>
         */
        fun environmentVariables(vararg value: IntrinsicFunction) {
          this.environmentVariables = value
        }

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var image: Any? = null

        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun image(value: String) {
          this.image = value
        }
        
        /**
         * [image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun image(value: IntrinsicFunction) {
          this.image = value
        }

        /**
         * [privilegedMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var privilegedMode: Any? = null

        /**
         * [privilegedMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privilegedMode(value: Boolean) {
          this.privilegedMode = value
        }
        
        /**
         * [privilegedMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privilegedMode(value: IntrinsicFunction) {
          this.privilegedMode = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class EnvironmentVariable {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class LogsConfig {
            /**
         * [cloudWatchLogs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-cloudwatchlogs)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLogsConfig
         */
        var cloudWatchLogs: Any? = null

        /**
         * [cloudWatchLogs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-cloudwatchlogs)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLogsConfig
         */
        fun cloudWatchLogs(value: CloudWatchLogsConfig) {
          this.cloudWatchLogs = value
        }
        
        /**
         * [cloudWatchLogs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-cloudwatchlogs)
         *
         * _Required_: no
         *
         * _Type_: CloudWatchLogsConfig
         */
        fun cloudWatchLogs(value: IntrinsicFunction) {
          this.cloudWatchLogs = value
        }

        /**
         * [s3Logs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-s3logs)
         *
         * _Required_: no
         *
         * _Type_: S3LogsConfig
         */
        var s3Logs: Any? = null

        /**
         * [s3Logs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-s3logs)
         *
         * _Required_: no
         *
         * _Type_: S3LogsConfig
         */
        fun s3Logs(value: S3LogsConfig) {
          this.s3Logs = value
        }
        
        /**
         * [s3Logs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-s3logs)
         *
         * _Required_: no
         *
         * _Type_: S3LogsConfig
         */
        fun s3Logs(value: IntrinsicFunction) {
          this.s3Logs = value
        }

    }

    @CloudFormationMarker
    class ProjectCache {
            /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class ProjectTriggers {
            /**
         * [webhook](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var webhook: Any? = null

        /**
         * [webhook](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun webhook(value: Boolean) {
          this.webhook = value
        }
        
        /**
         * [webhook](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun webhook(value: IntrinsicFunction) {
          this.webhook = value
        }

    }

    @CloudFormationMarker
    class S3LogsConfig {
            /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
        }

    }

    @CloudFormationMarker
    class Source {
            /**
         * [auth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-auth)
         *
         * _Required_: no
         *
         * _Type_: SourceAuth
         */
        var auth: Any? = null

        /**
         * [auth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-auth)
         *
         * _Required_: no
         *
         * _Type_: SourceAuth
         */
        fun auth(value: SourceAuth) {
          this.auth = value
        }
        
        /**
         * [auth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-auth)
         *
         * _Required_: no
         *
         * _Type_: SourceAuth
         */
        fun auth(value: IntrinsicFunction) {
          this.auth = value
        }

        /**
         * [buildSpec](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var buildSpec: Any? = null

        /**
         * [buildSpec](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun buildSpec(value: String) {
          this.buildSpec = value
        }
        
        /**
         * [buildSpec](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun buildSpec(value: IntrinsicFunction) {
          this.buildSpec = value
        }

        /**
         * [gitCloneDepth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var gitCloneDepth: Any? = null

        /**
         * [gitCloneDepth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun gitCloneDepth(value: Int) {
          this.gitCloneDepth = value
        }
        
        /**
         * [gitCloneDepth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun gitCloneDepth(value: IntrinsicFunction) {
          this.gitCloneDepth = value
        }

        /**
         * [insecureSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var insecureSsl: Any? = null

        /**
         * [insecureSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun insecureSsl(value: Boolean) {
          this.insecureSsl = value
        }
        
        /**
         * [insecureSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun insecureSsl(value: IntrinsicFunction) {
          this.insecureSsl = value
        }

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }

        /**
         * [reportBuildStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var reportBuildStatus: Any? = null

        /**
         * [reportBuildStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun reportBuildStatus(value: Boolean) {
          this.reportBuildStatus = value
        }
        
        /**
         * [reportBuildStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun reportBuildStatus(value: IntrinsicFunction) {
          this.reportBuildStatus = value
        }

        /**
         * [sourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sourceIdentifier: Any? = null

        /**
         * [sourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceIdentifier(value: String) {
          this.sourceIdentifier = value
        }
        
        /**
         * [sourceIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceIdentifier(value: IntrinsicFunction) {
          this.sourceIdentifier = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class SourceAuth {
            /**
         * [resource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var resource: Any? = null

        /**
         * [resource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resource(value: String) {
          this.resource = value
        }
        
        /**
         * [resource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun resource(value: IntrinsicFunction) {
          this.resource = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class VpcConfig {
            /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var subnets: Any? = null

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-subnets)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }

    }

}

/**
 * [AWS::CodeBuild::Project - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 */
fun Resources.awsCodeBuildProject(logicalId: String, init: AWSCodeBuildProject.() -> Unit = {}): AWSCodeBuildProject {
    return AWSCodeBuildProject(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
