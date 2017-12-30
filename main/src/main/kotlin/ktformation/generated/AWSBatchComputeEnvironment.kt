
package ktformation.generated

import ktformation.*

/**
 * [AWS::Batch::ComputeEnvironment - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html)
 */
@CloudFormationMarker
class AWSBatchComputeEnvironment(logicalId: String) : Resource<AWSBatchComputeEnvironment.Properties>(logicalId, "AWS::Batch::ComputeEnvironment") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var computeEnvironmentName: Any? = null
        fun computeEnvironmentName(value: String) {
            this.computeEnvironmentName = value
        }
        fun computeEnvironmentName(value: IntrinsicFunction) { this.computeEnvironmentName = value }
        @JvmField var computeResources: Any? = null
        fun computeResources(value: ComputeResources) { this.computeResources = value }
        fun computeResources(value: IntrinsicFunction) { this.computeResources = value }
        @JvmField var serviceRole: Any? = null
        fun serviceRole(value: String) { this.serviceRole = value }
        fun serviceRole(value: IntrinsicFunction) { this.serviceRole = value }
        @JvmField var state: Any? = null
        fun state(value: String) {
            this.state = value
        }
        fun state(value: IntrinsicFunction) { this.state = value }
        @JvmField var type: Any? = null
        fun type(value: String) { this.type = value }
        fun type(value: IntrinsicFunction) { this.type = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ComputeResources(
            val bidPercentage: Int? = null,
            val desiredvCpus: Int? = null,
            val ec2KeyPair: String? = null,
            val imageId: String? = null,
            val instanceRole: String,
            val instanceTypes: List<String>,
            val maxvCpus: Int,
            val minvCpus: Int,
            val securityGroupIds: List<String>,
            val spotIamFleetRole: String? = null,
            val subnets: List<String>,
            val tags: Json? = null,
            val type: String
    )

}

fun Resources.awsBatchComputeEnvironment(logicalId: String, init: AWSBatchComputeEnvironment.() -> Unit = {}): AWSBatchComputeEnvironment {
    return AWSBatchComputeEnvironment(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
