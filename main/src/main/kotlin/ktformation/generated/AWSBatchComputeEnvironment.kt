
package ktformation.generated

import ktformation.*

/**
 * [AWS::Batch::ComputeEnvironment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html)
 */
@CloudFormationMarker
class AWSBatchComputeEnvironment(logicalId: String) : Resource<AWSBatchComputeEnvironment.Properties>(logicalId, "AWS::Batch::ComputeEnvironment") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [computeEnvironmentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var computeEnvironmentName: Any? = null

        /**
         * [computeEnvironmentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun computeEnvironmentName(value: String) {
          this.computeEnvironmentName = value
        }
        
        /**
         * [computeEnvironmentName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeenvironmentname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun computeEnvironmentName(value: IntrinsicFunction) {
          this.computeEnvironmentName = value
        }
        
        /**
         * [computeResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
         *
         * _Required_: yes
         *
         * _Type_: ComputeResources
         */
        @JvmField
        var computeResources: Any? = null

        /**
         * [computeResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
         *
         * _Required_: yes
         *
         * _Type_: ComputeResources
         */
        fun computeResources(value: ComputeResources) {
          this.computeResources = value
        }
        
        /**
         * [computeResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
         *
         * _Required_: yes
         *
         * _Type_: ComputeResources
         */
        fun computeResources(value: IntrinsicFunction) {
          this.computeResources = value
        }
        
        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceRole: Any? = null

        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRole(value: String) {
          this.serviceRole = value
        }
        
        /**
         * [serviceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-servicerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRole(value: IntrinsicFunction) {
          this.serviceRole = value
        }
        
        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var state: Any? = null

        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: String) {
          this.state = value
        }
        
        /**
         * [state](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-state)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun state(value: IntrinsicFunction) {
          this.state = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ComputeResources(
            /**
             * [BidPercentage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val bidPercentage: Int? = null,
            /**
             * [DesiredvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val desiredvCpus: Int? = null,
            /**
             * [Ec2KeyPair](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val ec2KeyPair: String? = null,
            /**
             * [ImageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val imageId: String? = null,
            /**
             * [InstanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val instanceRole: String,
            /**
             * [InstanceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val instanceTypes: List<String>,
            /**
             * [MaxvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val maxvCpus: Int,
            /**
             * [MinvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val minvCpus: Int,
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>,
            /**
             * [SpotIamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val spotIamFleetRole: String? = null,
            /**
             * [Subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnets: List<String>,
            /**
             * [Tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val tags: Json? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

}

/**
 * [AWS::Batch::ComputeEnvironment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html)
 */
fun Resources.awsBatchComputeEnvironment(logicalId: String, init: AWSBatchComputeEnvironment.() -> Unit = {}): AWSBatchComputeEnvironment {
    return AWSBatchComputeEnvironment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
