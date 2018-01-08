
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudWatch::Dashboard - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
 */
@CloudFormationMarker
class AWSCloudWatchDashboard(logicalId: String) : Resource<AWSCloudWatchDashboard.Properties>(logicalId, "AWS::CloudWatch::Dashboard") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var dashboardBody: Any? = null

        fun dashboardBody(value: String) {
          this.dashboardBody = value
        }
        fun dashboardBody(value: IntrinsicFunction) {
  this.dashboardBody = value
}
        @JvmField
        var dashboardName: Any? = null

        fun dashboardName(value: String) {
          this.dashboardName = value
        }
        fun dashboardName(value: IntrinsicFunction) {
  this.dashboardName = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsCloudWatchDashboard(logicalId: String, init: AWSCloudWatchDashboard.() -> Unit = {}): AWSCloudWatchDashboard {
    return AWSCloudWatchDashboard(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
