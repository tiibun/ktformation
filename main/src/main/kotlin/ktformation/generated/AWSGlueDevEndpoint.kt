
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::DevEndpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html)
 */
@CloudFormationMarker
class AWSGlueDevEndpoint(logicalId: String) : Resource<AWSGlueDevEndpoint.Properties>(logicalId, "AWS::Glue::DevEndpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var endpointName: Any? = null
        fun endpointName(value: String?) { this.endpointName = value }
        fun endpointName(value: IntrinsicFunction) { this.endpointName = value }
        @JvmField var extraJarsS3Path: Any? = null
        fun extraJarsS3Path(value: String?) { this.extraJarsS3Path = value }
        fun extraJarsS3Path(value: IntrinsicFunction) { this.extraJarsS3Path = value }
        @JvmField var extraPythonLibsS3Path: Any? = null
        fun extraPythonLibsS3Path(value: String?) { this.extraPythonLibsS3Path = value }
        fun extraPythonLibsS3Path(value: IntrinsicFunction) { this.extraPythonLibsS3Path = value }
        @JvmField var numberOfNodes: Any? = null
        fun numberOfNodes(value: Int?) { this.numberOfNodes = value }
        fun numberOfNodes(value: IntrinsicFunction) { this.numberOfNodes = value }
        @JvmField var publicKey: Any? = null
        fun publicKey(value: String) { this.publicKey = value }
        fun publicKey(value: IntrinsicFunction) { this.publicKey = value }
        @JvmField var roleArn: Any? = null
        fun roleArn(value: String) { this.roleArn = value }
        fun roleArn(value: IntrinsicFunction) { this.roleArn = value }
        @JvmField var securityGroupIds: Any? = null
        fun securityGroupIds(value: List<String>?) { this.securityGroupIds = value }
        fun securityGroupIds(vararg value: IntrinsicFunction) { this.securityGroupIds = value }
        @JvmField var subnetId: Any? = null
        fun subnetId(value: String?) { this.subnetId = value }
        fun subnetId(value: IntrinsicFunction) { this.subnetId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsGlueDevEndpoint(logicalId: String, init: AWSGlueDevEndpoint.() -> Unit = {}): AWSGlueDevEndpoint {
    return AWSGlueDevEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
