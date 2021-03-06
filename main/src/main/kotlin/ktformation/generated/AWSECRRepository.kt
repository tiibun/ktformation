
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

        /**
        * [LifecyclePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html)
        */
        fun lifecyclePolicy(init: LifecyclePolicy.() -> Unit = {}): LifecyclePolicy {
            return LifecyclePolicy().also {
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
    class LifecyclePolicy {
            /**
         * [lifecyclePolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var lifecyclePolicyText: Any? = null

        /**
         * [lifecyclePolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun lifecyclePolicyText(value: String) {
          this.lifecyclePolicyText = value
        }
        
        /**
         * [lifecyclePolicyText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun lifecyclePolicyText(value: IntrinsicFunction) {
          this.lifecyclePolicyText = value
        }

        /**
         * [registryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var registryId: Any? = null

        /**
         * [registryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun registryId(value: String) {
          this.registryId = value
        }
        
        /**
         * [registryId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun registryId(value: IntrinsicFunction) {
          this.registryId = value
        }

    }

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
