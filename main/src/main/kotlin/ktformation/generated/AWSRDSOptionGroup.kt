
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::OptionGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
 */
@CloudFormationMarker
class AWSRDSOptionGroup(logicalId: String) : Resource<AWSRDSOptionGroup.Properties>(logicalId, "AWS::RDS::OptionGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var engineName: Any? = null

        fun engineName(value: String) {
          this.engineName = value
        }
        
        fun engineName(value: IntrinsicFunction) {
          this.engineName = value
        }
        
        @JvmField
        var majorEngineVersion: Any? = null

        fun majorEngineVersion(value: String) {
          this.majorEngineVersion = value
        }
        
        fun majorEngineVersion(value: IntrinsicFunction) {
          this.majorEngineVersion = value
        }
        
        @JvmField
        var optionConfigurations: Any? = null

        fun optionConfigurations(value: List<OptionConfiguration>) {
          this.optionConfigurations = value
        }
        
        fun optionConfigurations(vararg value: IntrinsicFunction) {
          this.optionConfigurations = value
        }
        
        @JvmField
        var optionGroupDescription: Any? = null

        fun optionGroupDescription(value: String) {
          this.optionGroupDescription = value
        }
        
        fun optionGroupDescription(value: IntrinsicFunction) {
          this.optionGroupDescription = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class OptionConfiguration(
            val dBSecurityGroupMemberships: List<String>? = null,
            val optionName: String,
            val optionSettings: OptionSetting? = null,
            val optionVersion: String? = null,
            val port: Int? = null,
            val vpcSecurityGroupMemberships: List<String>? = null
    )

    class OptionSetting(
            val name: String? = null,
            val value: String? = null
    )

}

fun Resources.awsRDSOptionGroup(logicalId: String, init: AWSRDSOptionGroup.() -> Unit = {}): AWSRDSOptionGroup {
    return AWSRDSOptionGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
