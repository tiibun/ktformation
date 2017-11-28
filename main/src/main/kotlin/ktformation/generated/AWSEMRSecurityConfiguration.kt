
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::SecurityConfiguration - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
@CloudFormationMarker
class AWSEMRSecurityConfiguration(logicalId: String) : Resource<AWSEMRSecurityConfiguration.Properties>(logicalId, "AWS::EMR::SecurityConfiguration") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var securityConfiguration: Any? = null
        fun securityConfiguration(value: Json) { this.securityConfiguration = value }
        fun securityConfiguration(value: IntrinsicFunction) { this.securityConfiguration = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEMRSecurityConfiguration(logicalId: String, init: AWSEMRSecurityConfiguration.() -> Unit = {}): AWSEMRSecurityConfiguration {
    return AWSEMRSecurityConfiguration(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
