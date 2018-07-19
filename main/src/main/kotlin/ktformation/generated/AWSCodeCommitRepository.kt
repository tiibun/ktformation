
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

        /**
        * [RepositoryTrigger](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html)
        */
        fun repositoryTrigger(init: RepositoryTrigger.() -> Unit = {}): RepositoryTrigger {
            return RepositoryTrigger().also {
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
    class RepositoryTrigger {
            /**
         * [branches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-branches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var branches: Any? = null

        /**
         * [branches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-branches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun branches(value: List<String>) {
          this.branches = value
        }
        
        /**
         * [branches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-branches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun branches(vararg value: IntrinsicFunction) {
          this.branches = value
        }

        /**
         * [customData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-customdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var customData: Any? = null

        /**
         * [customData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-customdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customData(value: String) {
          this.customData = value
        }
        
        /**
         * [customData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-customdata)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customData(value: IntrinsicFunction) {
          this.customData = value
        }

        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-destinationarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var destinationArn: Any? = null

        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-destinationarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationArn(value: String) {
          this.destinationArn = value
        }
        
        /**
         * [destinationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-destinationarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun destinationArn(value: IntrinsicFunction) {
          this.destinationArn = value
        }

        /**
         * [events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-events)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var events: Any? = null

        /**
         * [events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-events)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun events(value: List<String>) {
          this.events = value
        }
        
        /**
         * [events](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-events)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun events(vararg value: IntrinsicFunction) {
          this.events = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-repositorytrigger.html#cfn-codecommit-repository-repositorytrigger-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

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
