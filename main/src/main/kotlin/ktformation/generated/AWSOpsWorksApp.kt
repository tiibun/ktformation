
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::App - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html)
 */
@CloudFormationMarker
class AWSOpsWorksApp(logicalId: String) : Resource<AWSOpsWorksApp.Properties>(logicalId, "AWS::OpsWorks::App") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var appSource: Any? = null
        fun appSource(value: Source?) { this.appSource = value }
        fun appSource(value: IntrinsicFunction) { this.appSource = value }
        @JvmField var attributes: Any? = null
        fun attributes(value: Map<String, String>?) { this.attributes = value }
        fun attributes(value: IntrinsicFunction) { this.attributes = value }
        @JvmField var dataSources: Any? = null
        fun dataSources(value: List<DataSource>?) { this.dataSources = value }
        fun dataSources(vararg value: IntrinsicFunction) { this.dataSources = value }
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var domains: Any? = null
        fun domains(value: List<String>?) { this.domains = value }
        fun domains(vararg value: IntrinsicFunction) { this.domains = value }
        @JvmField var enableSsl: Any? = null
        fun enableSsl(value: Boolean?) { this.enableSsl = value }
        fun enableSsl(value: IntrinsicFunction) { this.enableSsl = value }
        @JvmField var environment: Any? = null
        fun environment(value: List<EnvironmentVariable>?) { this.environment = value }
        fun environment(vararg value: IntrinsicFunction) { this.environment = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var shortname: Any? = null
        fun shortname(value: String?) { this.shortname = value }
        fun shortname(value: IntrinsicFunction) { this.shortname = value }
        @JvmField var sslConfiguration: Any? = null
        fun sslConfiguration(value: SslConfiguration?) { this.sslConfiguration = value }
        fun sslConfiguration(value: IntrinsicFunction) { this.sslConfiguration = value }
        @JvmField var stackId: Any? = null
        fun stackId(value: String) { this.stackId = value }
        fun stackId(value: IntrinsicFunction) { this.stackId = value }
        @JvmField var type: Any? = null
        fun type(value: String) { this.type = value }
        fun type(value: IntrinsicFunction) { this.type = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DataSource(
            val arn: String? = null,
            val databaseName: String? = null,
            val type: String? = null
    )

    class EnvironmentVariable(
            val key: String,
            val secure: Boolean? = null,
            val value: String
    )

    class Source(
            val password: String? = null,
            val revision: String? = null,
            val sshKey: String? = null,
            val type: String? = null,
            val url: String? = null,
            val username: String? = null
    )

    class SslConfiguration(
            val certificate: String? = null,
            val chain: String? = null,
            val privateKey: String? = null
    )

}

fun Resources.awsOpsWorksApp(logicalId: String, init: AWSOpsWorksApp.() -> Unit = {}): AWSOpsWorksApp {
    return AWSOpsWorksApp(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
