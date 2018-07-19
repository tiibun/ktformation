
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
         * _Required_: no
         *
         * _Type_: ComputeResources
         */
        @JvmField
        var computeResources: Any? = null

        /**
         * [computeResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
         *
         * _Required_: no
         *
         * _Type_: ComputeResources
         */
        fun computeResources(value: ComputeResources) {
          this.computeResources = value
        }
        
        /**
         * [computeResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html#cfn-batch-computeenvironment-computeresources)
         *
         * _Required_: no
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

        /**
        * [ComputeResources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
        */
        fun computeResources(init: ComputeResources.() -> Unit = {}): ComputeResources {
            return ComputeResources().also {
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
    class ComputeResources {
            /**
         * [bidPercentage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var bidPercentage: Any? = null

        /**
         * [bidPercentage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun bidPercentage(value: Int) {
          this.bidPercentage = value
        }
        
        /**
         * [bidPercentage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun bidPercentage(value: IntrinsicFunction) {
          this.bidPercentage = value
        }

        /**
         * [desiredvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var desiredvCpus: Any? = null

        /**
         * [desiredvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun desiredvCpus(value: Int) {
          this.desiredvCpus = value
        }
        
        /**
         * [desiredvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun desiredvCpus(value: IntrinsicFunction) {
          this.desiredvCpus = value
        }

        /**
         * [ec2KeyPair](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var ec2KeyPair: Any? = null

        /**
         * [ec2KeyPair](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ec2KeyPair(value: String) {
          this.ec2KeyPair = value
        }
        
        /**
         * [ec2KeyPair](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ec2KeyPair(value: IntrinsicFunction) {
          this.ec2KeyPair = value
        }

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var imageId: Any? = null

        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun imageId(value: String) {
          this.imageId = value
        }
        
        /**
         * [imageId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun imageId(value: IntrinsicFunction) {
          this.imageId = value
        }

        /**
         * [instanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var instanceRole: Any? = null

        /**
         * [instanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceRole(value: String) {
          this.instanceRole = value
        }
        
        /**
         * [instanceRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceRole(value: IntrinsicFunction) {
          this.instanceRole = value
        }

        /**
         * [instanceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var instanceTypes: Any? = null

        /**
         * [instanceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun instanceTypes(value: List<String>) {
          this.instanceTypes = value
        }
        
        /**
         * [instanceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun instanceTypes(vararg value: IntrinsicFunction) {
          this.instanceTypes = value
        }

        /**
         * [maxvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var maxvCpus: Any? = null

        /**
         * [maxvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxvCpus(value: Int) {
          this.maxvCpus = value
        }
        
        /**
         * [maxvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun maxvCpus(value: IntrinsicFunction) {
          this.maxvCpus = value
        }

        /**
         * [minvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var minvCpus: Any? = null

        /**
         * [minvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minvCpus(value: Int) {
          this.minvCpus = value
        }
        
        /**
         * [minvCpus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun minvCpus(value: IntrinsicFunction) {
          this.minvCpus = value
        }

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [spotIamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var spotIamFleetRole: Any? = null

        /**
         * [spotIamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotIamFleetRole(value: String) {
          this.spotIamFleetRole = value
        }
        
        /**
         * [spotIamFleetRole](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun spotIamFleetRole(value: IntrinsicFunction) {
          this.spotIamFleetRole = value
        }

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var subnets: Any? = null

        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnets(value: List<String>) {
          this.subnets = value
        }
        
        /**
         * [subnets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun subnets(vararg value: IntrinsicFunction) {
          this.subnets = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun tags(value: Json) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun tags(value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

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
