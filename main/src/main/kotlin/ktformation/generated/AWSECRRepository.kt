
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECR::Repository - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
 */
@CloudFormationMarker
class AWSECRRepository(logicalId: String) : Resource<AWSECRRepository.Properties>(logicalId, "AWS::ECR::Repository") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var lifecyclePolicy: Any? = null

        fun lifecyclePolicy(value: LifecyclePolicy) {
          this.lifecyclePolicy = value
        }
        fun lifecyclePolicy(value: IntrinsicFunction) {
  this.lifecyclePolicy = value
}
        @JvmField
        var repositoryName: Any? = null

        fun repositoryName(value: String) {
          this.repositoryName = value
        }
        fun repositoryName(value: IntrinsicFunction) {
  this.repositoryName = value
}
        @JvmField
        var repositoryPolicyText: Any? = null

        fun repositoryPolicyText(value: Json) {
          this.repositoryPolicyText = value
        }
        fun repositoryPolicyText(value: IntrinsicFunction) {
  this.repositoryPolicyText = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class LifecyclePolicy(
            val lifecyclePolicyText: String? = null,
            val registryId: String? = null
    )

}

fun Resources.awsECRRepository(logicalId: String, init: AWSECRRepository.() -> Unit = {}): AWSECRRepository {
    return AWSECRRepository(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
