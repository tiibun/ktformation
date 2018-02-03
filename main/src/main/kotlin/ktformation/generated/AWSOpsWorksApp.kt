
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DataSource(
            /**
             * [Arn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-arn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val arn: String? = null,
            /**
             * [DatabaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-databasename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val databaseName: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null
    )

    class EnvironmentVariable(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Secure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#cfn-opsworks-app-environment-secure)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val secure: Boolean? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environment.html#value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class Source(
            /**
             * [Password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-pw)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val password: String? = null,
            /**
             * [Revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val revision: String? = null,
            /**
             * [SshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sshKey: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val url: String? = null,
            /**
             * [Username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val username: String? = null
    )

    class SslConfiguration(
            /**
             * [Certificate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-certificate)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val certificate: String? = null,
            /**
             * [Chain](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-chain)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val chain: String? = null,
            /**
             * [PrivateKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfig-privatekey)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val privateKey: String? = null
    )

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
