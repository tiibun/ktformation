
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
 */
@CloudFormationMarker
class AWSLambdaAlias(logicalId: String) : Resource<AWSLambdaAlias.Properties>(logicalId, "AWS::Lambda::Alias") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var functionName: Any? = null

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: String) {
          this.functionName = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: IntrinsicFunction) {
          this.functionName = value
        }

        /**
         * [functionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var functionVersion: Any? = null

        /**
         * [functionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionVersion(value: String) {
          this.functionVersion = value
        }
        
        /**
         * [functionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionVersion(value: IntrinsicFunction) {
          this.functionVersion = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [routingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
         *
         * _Required_: no
         *
         * _Type_: AliasRoutingConfiguration
         */
        @JvmField
        var routingConfig: Any? = null

        /**
         * [routingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
         *
         * _Required_: no
         *
         * _Type_: AliasRoutingConfiguration
         */
        fun routingConfig(value: AliasRoutingConfiguration) {
          this.routingConfig = value
        }
        
        /**
         * [routingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
         *
         * _Required_: no
         *
         * _Type_: AliasRoutingConfiguration
         */
        fun routingConfig(value: IntrinsicFunction) {
          this.routingConfig = value
        }

        /**
        * [AliasRoutingConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html)
        */
        fun aliasRoutingConfiguration(init: AliasRoutingConfiguration.() -> Unit = {}): AliasRoutingConfiguration {
            return AliasRoutingConfiguration().also {
                it.init()
            }
        }
        /**
        * [VersionWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html)
        */
        fun versionWeight(init: VersionWeight.() -> Unit = {}): VersionWeight {
            return VersionWeight().also {
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
    class AliasRoutingConfiguration {
            /**
         * [additionalVersionWeights](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights)
         *
         * _Required_: yes
         *
         * _Type_: List<VersionWeight>
         */
        var additionalVersionWeights: Any? = null

        /**
         * [additionalVersionWeights](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights)
         *
         * _Required_: yes
         *
         * _Type_: List<VersionWeight>
         */
        fun additionalVersionWeights(value: List<VersionWeight>) {
          this.additionalVersionWeights = value
        }
        
        /**
         * [additionalVersionWeights](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-aliasroutingconfiguration.html#cfn-lambda-alias-aliasroutingconfiguration-additionalversionweights)
         *
         * _Required_: yes
         *
         * _Type_: List<VersionWeight>
         */
        fun additionalVersionWeights(vararg value: IntrinsicFunction) {
          this.additionalVersionWeights = value
        }

    }

    @CloudFormationMarker
    class VersionWeight {
            /**
         * [functionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var functionVersion: Any? = null

        /**
         * [functionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionVersion(value: String) {
          this.functionVersion = value
        }
        
        /**
         * [functionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionVersion(value: IntrinsicFunction) {
          this.functionVersion = value
        }

        /**
         * [functionWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var functionWeight: Any? = null

        /**
         * [functionWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun functionWeight(value: Double) {
          this.functionWeight = value
        }
        
        /**
         * [functionWeight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html#cfn-lambda-alias-versionweight-functionweight)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun functionWeight(value: IntrinsicFunction) {
          this.functionWeight = value
        }

    }

    class UpdatePolicy(
            var codeDeployLambdaAliasUpdate: CodeDeployLambdaAliasUpdate? = null
    ) : Resource.UpdatePolicy {

        class CodeDeployLambdaAliasUpdate {
            var afterAllowTrafficHook: String? = null
            lateinit var applicationName: String
            var beforeAllowTrafficHook: String? = null
            lateinit var deploymentGroupName: String
        }

        fun codeDeployLambdaAliasUpdate(init: CodeDeployLambdaAliasUpdate.() -> Unit): CodeDeployLambdaAliasUpdate {
            return CodeDeployLambdaAliasUpdate().also {
                it.init()
                codeDeployLambdaAliasUpdate = it
            }
        }
    }

    fun updatePolicy(init: UpdatePolicy.() -> Unit): UpdatePolicy {
        return UpdatePolicy().also {
            it.init()
            updatePolicy = it
        }
    }

}

/**
 * [AWS::Lambda::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
 */
fun Resources.awsLambdaAlias(logicalId: String, init: AWSLambdaAlias.() -> Unit = {}): AWSLambdaAlias {
    return AWSLambdaAlias(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
