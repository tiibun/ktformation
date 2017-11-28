
package ktformation.generated

import ktformation.*

/**
 * [AWS::ECS::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html)
 */
@CloudFormationMarker
class AWSECSCluster(logicalId: String) : Resource<AWSECSCluster.Properties>(logicalId, "AWS::ECS::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var clusterName: Any? = null
        fun clusterName(value: String?) { this.clusterName = value }
        fun clusterName(value: IntrinsicFunction) { this.clusterName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsECSCluster(logicalId: String, init: AWSECSCluster.() -> Unit = {}): AWSECSCluster {
    return AWSECSCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
