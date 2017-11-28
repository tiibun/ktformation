package ktformation.generate

fun customMembers(className: String): String {
    return when (className) {
        "AWSAutoScalingAutoScalingGroup" -> """
    class UpdatePolicy(
            var autoScalingReplacingUpdate: AutoScalingReplacingUpdate? = null,
            var autoScalingRollingUpdate: AutoScalingRollingUpdate? = null
    ) : Resource.UpdatePolicy {

        class AutoScalingReplacingUpdate(var willReplace: Boolean? = null)

        class AutoScalingRollingUpdate(
                var maxBatchSize: Int? = null,
                var minInstancesInService: Int? = null,
                var minSuccessfulInstancesPercent: Int? = null,
                var pauseTime: String? = null,
                var suspendProcesses: List<String>? = null,
                var waitOnResourceSignals: Boolean? = null
        )

        fun autoScalingReplacingUpdate(init: AutoScalingReplacingUpdate.() -> Unit): AutoScalingReplacingUpdate {
            return AutoScalingReplacingUpdate().also {
                it.init()
                autoScalingReplacingUpdate = it
            }
        }

        fun autoScalingRollingUpdate(init: AutoScalingRollingUpdate.() -> Unit): AutoScalingRollingUpdate {
            return AutoScalingRollingUpdate().also {
                it.init()
                autoScalingRollingUpdate = it
            }
        }
    }

    fun updatePolicy(init: UpdatePolicy.() -> Unit): UpdatePolicy {
        return UpdatePolicy().also {
            it.init()
            updatePolicy = it
        }
    }
"""
        "AWSLambdaAlias" -> """
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
"""
        else -> ""
    }
}
