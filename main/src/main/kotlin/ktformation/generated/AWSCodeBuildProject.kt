
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Artifacts(
            /**
             * [Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val location: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [NamespaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val namespaceType: String? = null,
            /**
             * [Packaging](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val packaging: String? = null,
            /**
             * [Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val path: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class Environment(
            /**
             * [ComputeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val computeType: String,
            /**
             * [EnvironmentVariables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables)
             *
             * _Required_: no
             *
             * _Type_: List<EnvironmentVariable>
             */
            val environmentVariables: List<EnvironmentVariable>? = null,
            /**
             * [Image](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val image: String,
            /**
             * [PrivilegedMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val privilegedMode: Boolean? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class EnvironmentVariable(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class ProjectCache(
            /**
             * [Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-location)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val location: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class Source(
            /**
             * [Auth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-auth)
             *
             * _Required_: no
             *
             * _Type_: SourceAuth
             */
            val auth: SourceAuth? = null,
            /**
             * [BuildSpec](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val buildSpec: String? = null,
            /**
             * [GitCloneDepth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val gitCloneDepth: Int? = null,
            /**
             * [InsecureSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val insecureSsl: Boolean? = null,
            /**
             * [Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val location: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class SourceAuth(
            /**
             * [Resource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val resource: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class VpcConfig(
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-securitygroupids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>,
            /**
             * [Subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-subnets)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnets: List<String>,
            /**
             * [VpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-vpcid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val vpcId: String
    )

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
