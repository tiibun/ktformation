
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::SecurityConfiguration - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
@CloudFormationMarker
class AWSEMRSecurityConfiguration(logicalId: String) : Resource<AWSEMRSecurityConfiguration.Properties>(logicalId, "AWS::EMR::SecurityConfiguration") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [securityConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var securityConfiguration: Any? = null

        /**
         * [securityConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun securityConfiguration(value: Json) {
          this.securityConfiguration = value
        }
        
        /**
         * [securityConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun securityConfiguration(value: IntrinsicFunction) {
          this.securityConfiguration = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::EMR::SecurityConfiguration - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
fun Resources.awsEMRSecurityConfiguration(logicalId: String, init: AWSEMRSecurityConfiguration.() -> Unit = {}): AWSEMRSecurityConfiguration {
    return AWSEMRSecurityConfiguration(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
