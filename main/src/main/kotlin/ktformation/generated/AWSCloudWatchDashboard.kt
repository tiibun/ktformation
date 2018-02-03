
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudWatch::Dashboard - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
 */
@CloudFormationMarker
class AWSCloudWatchDashboard(logicalId: String) : Resource<AWSCloudWatchDashboard.Properties>(logicalId, "AWS::CloudWatch::Dashboard") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [dashboardBody](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dashboardBody: Any? = null

        /**
         * [dashboardBody](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dashboardBody(value: String) {
          this.dashboardBody = value
        }
        
        /**
         * [dashboardBody](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dashboardBody(value: IntrinsicFunction) {
          this.dashboardBody = value
        }
        
        /**
         * [dashboardName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var dashboardName: Any? = null

        /**
         * [dashboardName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun dashboardName(value: String) {
          this.dashboardName = value
        }
        
        /**
         * [dashboardName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
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

/**
 * [AWS::CloudWatch::Dashboard - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
 */
fun Resources.awsCloudWatchDashboard(logicalId: String, init: AWSCloudWatchDashboard.() -> Unit = {}): AWSCloudWatchDashboard {
    return AWSCloudWatchDashboard(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
