
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
 */
@CloudFormationMarker
class AWSLambdaAlias(logicalId: String) : Resource<AWSLambdaAlias.Properties>(logicalId, "AWS::Lambda::Alias") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
        @JvmField
        var functionName: Any? = null

        fun functionName(value: String) {
          this.functionName = value
        }
        fun functionName(value: IntrinsicFunction) {
  this.functionName = value
}
        @JvmField
        var functionVersion: Any? = null

        fun functionVersion(value: String) {
          this.functionVersion = value
        }
        fun functionVersion(value: IntrinsicFunction) {
  this.functionVersion = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var routingConfig: Any? = null

        fun routingConfig(value: AliasRoutingConfiguration) {
          this.routingConfig = value
        }
        fun routingConfig(value: IntrinsicFunction) {
  this.routingConfig = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AliasRoutingConfiguration(
            val additionalVersionWeights: List<VersionWeight>
    )

    class VersionWeight(
            val functionVersion: String,
            val functionWeight: Double
    )

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

fun Resources.awsLambdaAlias(logicalId: String, init: AWSLambdaAlias.() -> Unit = {}): AWSLambdaAlias {
    return AWSLambdaAlias(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
