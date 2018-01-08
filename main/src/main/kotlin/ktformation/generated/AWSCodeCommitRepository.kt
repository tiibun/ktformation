
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeCommit::Repository - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html)
 */
@CloudFormationMarker
class AWSCodeCommitRepository(logicalId: String) : Resource<AWSCodeCommitRepository.Properties>(logicalId, "AWS::CodeCommit::Repository") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var repositoryDescription: Any? = null

        fun repositoryDescription(value: String) {
          this.repositoryDescription = value
        }
        fun repositoryDescription(value: IntrinsicFunction) {
  this.repositoryDescription = value
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
        var triggers: Any? = null

        fun triggers(value: List<RepositoryTrigger>) {
          this.triggers = value
        }
        fun triggers(vararg value: IntrinsicFunction) {
  this.triggers = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class RepositoryTrigger(
            val branches: List<String>? = null,
            val customData: String? = null,
            val destinationArn: String? = null,
            val events: List<String>? = null,
            val name: String? = null
    )

}

fun Resources.awsCodeCommitRepository(logicalId: String, init: AWSCodeCommitRepository.() -> Unit = {}): AWSCodeCommitRepository {
    return AWSCodeCommitRepository(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
