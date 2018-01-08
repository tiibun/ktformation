
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::FlowLog - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html)
 */
@CloudFormationMarker
class AWSEC2FlowLog(logicalId: String) : Resource<AWSEC2FlowLog.Properties>(logicalId, "AWS::EC2::FlowLog") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var deliverLogsPermissionArn: Any? = null

        fun deliverLogsPermissionArn(value: String) {
          this.deliverLogsPermissionArn = value
        }
        fun deliverLogsPermissionArn(value: IntrinsicFunction) {
  this.deliverLogsPermissionArn = value
}
        @JvmField
        var logGroupName: Any? = null

        fun logGroupName(value: String) {
          this.logGroupName = value
        }
        fun logGroupName(value: IntrinsicFunction) {
  this.logGroupName = value
}
        @JvmField
        var resourceId: Any? = null

        fun resourceId(value: String) {
          this.resourceId = value
        }
        fun resourceId(value: IntrinsicFunction) {
  this.resourceId = value
}
        @JvmField
        var resourceType: Any? = null

        fun resourceType(value: String) {
          this.resourceType = value
        }
        fun resourceType(value: IntrinsicFunction) {
  this.resourceType = value
}
        @JvmField
        var trafficType: Any? = null

        fun trafficType(value: String) {
          this.trafficType = value
        }
        fun trafficType(value: IntrinsicFunction) {
  this.trafficType = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2FlowLog(logicalId: String, init: AWSEC2FlowLog.() -> Unit = {}): AWSEC2FlowLog {
    return AWSEC2FlowLog(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
