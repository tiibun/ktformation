
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::App - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html)
 */
@CloudFormationMarker
class AWSOpsWorksApp(logicalId: String) : Resource<AWSOpsWorksApp.Properties>(logicalId, "AWS::OpsWorks::App") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [appSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
         *
         * _Required_: no
         *
         * _Type_: Source
         */
        @JvmField
        var appSource: Any? = null

        /**
         * [appSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
         *
         * _Required_: no
         *
         * _Type_: Source
         */
        fun appSource(value: Source) {
          this.appSource = value
        }
        
        /**
         * [appSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
         *
         * _Required_: no
         *
         * _Type_: Source
         */
        fun appSource(value: IntrinsicFunction) {
          this.appSource = value
        }

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun attributes(value: Map<String, Any>) {
          this.attributes = value
        }
        
        /**
         * [dataSources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
         *
         * _Required_: no
         *
         * _Type_: List<DataSource>
         */
        @JvmField
        var dataSources: Any? = null

        /**
         * [dataSources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
         *
         * _Required_: no
         *
         * _Type_: List<DataSource>
         */
        fun dataSources(value: List<DataSource>) {
          this.dataSources = value
        }
        
        /**
         * [dataSources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
         *
         * _Required_: no
         *
         * _Type_: List<DataSource>
         */
        fun dataSources(vararg value: IntrinsicFunction) {
          this.dataSources = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [domains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var domains: Any? = null

        /**
         * [domains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun domains(value: List<String>) {
          this.domains = value
        }
        
        /**
         * [domains](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun domains(vararg value: IntrinsicFunction) {
          this.domains = value
        }

        /**
         * [enableSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableSsl: Any? = null

        /**
         * [enableSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSsl(value: Boolean) {
          this.enableSsl = value
        }
        
        /**
         * [enableSsl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSsl(value: IntrinsicFunction) {
          this.enableSsl = value
        }

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment)
         *
         * _Required_: no
         *
         * _Type_: List<EnvironmentVariable>
         */
        @JvmField
        var environment: Any? = null

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment)
         *
         * _Required_: no
         *
         * _Type_: List<EnvironmentVariable>
         */
        fun environment(value: List<EnvironmentVariable>) {
          this.environment = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment)
         *
         * _Required_: no
         *
         * _Type_: List<EnvironmentVariable>
         */
        fun environment(vararg value: IntrinsicFunction) {
          this.environment = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [shortname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var shortname: Any? = null

        /**
         * [shortname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun shortname(value: String) {
          this.shortname = value
        }
        
        /**
         * [shortname](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun shortname(value: IntrinsicFunction) {
          this.shortname = value
        }

        /**
         * [sslConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SslConfiguration
         */
        @JvmField
        var sslConfiguration: Any? = null

        /**
         * [sslConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SslConfiguration
         */
        fun sslConfiguration(value: SslConfiguration) {
          this.sslConfiguration = value
        }
        
        /**
         * [sslConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
         *
         * _Required_: no
         *
         * _Type_: SslConfiguration
         */
        fun sslConfiguration(value: IntrinsicFunction) {
          this.sslConfiguration = value
        }

        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var stackId: Any? = null

        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: String) {
          this.stackId = value
        }
        
        /**
         * [stackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stackId(value: IntrinsicFunction) {
          this.stackId = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
        * [DataSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html)
        */
        fun dataSource(init: DataSource.() -> Unit = {}): DataSource {
            return DataSource().also {
                it.init()
            }
        }
        /**
        * [EnvironmentVariable](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html)
        */
        fun environmentVariable(init: EnvironmentVariable.() -> Unit = {}): EnvironmentVariable {
            return EnvironmentVariable().also {
                it.init()
            }
        }
        /**
        * [Source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html)
        */
        fun source(init: Source.() -> Unit = {}): Source {
            return Source().also {
                it.init()
            }
        }
        /**
        * [SslConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html)
        */
        fun sslConfiguration(init: SslConfiguration.() -> Unit = {}): SslConfiguration {
            return SslConfiguration().also {
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
    class DataSource {
            /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var arn: Any? = null

        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun arn(value: String) {
          this.arn = value
        }
        
        /**
         * [arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-arn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun arn(value: IntrinsicFunction) {
          this.arn = value
        }

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-databasename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-type)
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
    class EnvironmentVariable {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [secure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var secure: Any? = null

        /**
         * [secure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun secure(value: Boolean) {
          this.secure = value
        }
        
        /**
         * [secure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun secure(value: IntrinsicFunction) {
          this.secure = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value)
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
    class Source {
            /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }

        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var revision: Any? = null

        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revision(value: String) {
          this.revision = value
        }
        
        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revision(value: IntrinsicFunction) {
          this.revision = value
        }

        /**
         * [sshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sshKey: Any? = null

        /**
         * [sshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshKey(value: String) {
          this.sshKey = value
        }
        
        /**
         * [sshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshKey(value: IntrinsicFunction) {
          this.sshKey = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var url: Any? = null

        /**
         * [url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun url(value: String) {
          this.url = value
        }
        
        /**
         * [url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun url(value: IntrinsicFunction) {
          this.url = value
        }

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var username: Any? = null

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: String) {
          this.username = value
        }
        
        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: IntrinsicFunction) {
          this.username = value
        }

    }

    @CloudFormationMarker
    class SslConfiguration {
            /**
         * [certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var certificate: Any? = null

        /**
         * [certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificate(value: String) {
          this.certificate = value
        }
        
        /**
         * [certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun certificate(value: IntrinsicFunction) {
          this.certificate = value
        }

        /**
         * [chain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var chain: Any? = null

        /**
         * [chain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun chain(value: String) {
          this.chain = value
        }
        
        /**
         * [chain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun chain(value: IntrinsicFunction) {
          this.chain = value
        }

        /**
         * [privateKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var privateKey: Any? = null

        /**
         * [privateKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateKey(value: String) {
          this.privateKey = value
        }
        
        /**
         * [privateKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateKey(value: IntrinsicFunction) {
          this.privateKey = value
        }

    }

}

/**
 * [AWS::OpsWorks::App - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html)
 */
fun Resources.awsOpsWorksApp(logicalId: String, init: AWSOpsWorksApp.() -> Unit = {}): AWSOpsWorksApp {
    return AWSOpsWorksApp(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
