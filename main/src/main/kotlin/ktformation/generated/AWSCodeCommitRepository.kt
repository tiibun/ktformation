
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeCommit::Repository - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html)
 */
@CloudFormationMarker
class AWSCodeCommitRepository(logicalId: String) : Resource<AWSCodeCommitRepository.Properties>(logicalId, "AWS::CodeCommit::Repository") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [repositoryDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var repositoryDescription: Any? = null

        /**
         * [repositoryDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun repositoryDescription(value: String) {
          this.repositoryDescription = value
        }
        
        /**
         * [repositoryDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun repositoryDescription(value: IntrinsicFunction) {
          this.repositoryDescription = value
        }
        
        /**
         * [repositoryName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var repositoryName: Any? = null

        /**
         * [repositoryName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun repositoryName(value: String) {
          this.repositoryName = value
        }
        
        /**
         * [repositoryName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun repositoryName(value: IntrinsicFunction) {
          this.repositoryName = value
        }
        
        /**
         * [triggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
         *
         * _Required_: no
         *
         * _Type_: List<RepositoryTrigger>
         */
        @JvmField
        var triggers: Any? = null

        /**
         * [triggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
         *
         * _Required_: no
         *
         * _Type_: List<RepositoryTrigger>
         */
        fun triggers(value: List<RepositoryTrigger>) {
          this.triggers = value
        }
        
        /**
         * [triggers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
         *
         * _Required_: no
         *
         * _Type_: List<RepositoryTrigger>
         */
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
            /**
             * [Branches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-branches)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val branches: List<String>? = null,
            /**
             * [CustomData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-customdata)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val customData: String? = null,
            /**
             * [DestinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-destinationarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val destinationArn: String? = null,
            /**
             * [Events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-events)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val events: List<String>? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

}

/**
 * [AWS::CodeCommit::Repository - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html)
 */
fun Resources.awsCodeCommitRepository(logicalId: String, init: AWSCodeCommitRepository.() -> Unit = {}): AWSCodeCommitRepository {
    return AWSCodeCommitRepository(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
