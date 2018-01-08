
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCEndpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
 */
@CloudFormationMarker
class AWSEC2VPCEndpoint(logicalId: String) : Resource<AWSEC2VPCEndpoint.Properties>(logicalId, "AWS::EC2::VPCEndpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var policyDocument: Any? = null

        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        fun policyDocument(value: IntrinsicFunction) {
  this.policyDocument = value
}
        @JvmField
        var routeTableIds: Any? = null

        fun routeTableIds(value: List<String>) {
          this.routeTableIds = value
        }
        fun routeTableIds(vararg value: IntrinsicFunction) {
  this.routeTableIds = value
}
        @JvmField
        var serviceName: Any? = null

        fun serviceName(value: String) {
          this.serviceName = value
        }
        fun serviceName(value: IntrinsicFunction) {
  this.serviceName = value
}
        @JvmField
        var vpcId: Any? = null

        fun vpcId(value: String) {
          this.vpcId = value
        }
        fun vpcId(value: IntrinsicFunction) {
  this.vpcId = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2VPCEndpoint(logicalId: String, init: AWSEC2VPCEndpoint.() -> Unit = {}): AWSEC2VPCEndpoint {
    return AWSEC2VPCEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
