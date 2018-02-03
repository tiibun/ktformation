
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECR::Repository - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
 */
@CloudFormationMarker
class AWSECRRepository(logicalId: String) : Resource<AWSECRRepository.Properties>(logicalId, "AWS::ECR::Repository") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [lifecyclePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
         *
         * _Required_: no
         *
         * _Type_: LifecyclePolicy
         */
        @JvmField
        var lifecyclePolicy: Any? = null

        /**
         * [lifecyclePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
         *
         * _Required_: no
         *
         * _Type_: LifecyclePolicy
         */
        fun lifecyclePolicy(value: LifecyclePolicy) {
          this.lifecyclePolicy = value
        }
        
        /**
         * [lifecyclePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
         *
         * _Required_: no
         *
         * _Type_: LifecyclePolicy
         */
        fun lifecyclePolicy(value: IntrinsicFunction) {
          this.lifecyclePolicy = value
        }
        
        /**
         * [repositoryName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var repositoryName: Any? = null

        /**
         * [repositoryName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun repositoryName(value: String) {
          this.repositoryName = value
        }
        
        /**
         * [repositoryName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun repositoryName(value: IntrinsicFunction) {
          this.repositoryName = value
        }
        
        /**
         * [repositoryPolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var repositoryPolicyText: Any? = null

        /**
         * [repositoryPolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun repositoryPolicyText(value: Json) {
          this.repositoryPolicyText = value
        }
        
        /**
         * [repositoryPolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
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
            /**
             * [LifecyclePolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val lifecyclePolicyText: String? = null,
            /**
             * [RegistryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val registryId: String? = null
    )

}

/**
 * [AWS::ECR::Repository - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
 */
fun Resources.awsECRRepository(logicalId: String, init: AWSECRRepository.() -> Unit = {}): AWSECRRepository {
    return AWSECRRepository(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
