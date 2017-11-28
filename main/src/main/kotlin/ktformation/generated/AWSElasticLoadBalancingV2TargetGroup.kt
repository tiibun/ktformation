
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::TargetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2TargetGroup(logicalId: String) : Resource<AWSElasticLoadBalancingV2TargetGroup.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::TargetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var healthCheckIntervalSeconds: Any? = null
        fun healthCheckIntervalSeconds(value: Int?) { this.healthCheckIntervalSeconds = value }
        fun healthCheckIntervalSeconds(value: IntrinsicFunction) { this.healthCheckIntervalSeconds = value }
        @JvmField var healthCheckPath: Any? = null
        fun healthCheckPath(value: String?) { this.healthCheckPath = value }
        fun healthCheckPath(value: IntrinsicFunction) { this.healthCheckPath = value }
        @JvmField var healthCheckPort: Any? = null
        fun healthCheckPort(value: String?) { this.healthCheckPort = value }
        fun healthCheckPort(value: IntrinsicFunction) { this.healthCheckPort = value }
        @JvmField var healthCheckProtocol: Any? = null
        fun healthCheckProtocol(value: String?) { this.healthCheckProtocol = value }
        fun healthCheckProtocol(value: IntrinsicFunction) { this.healthCheckProtocol = value }
        @JvmField var healthCheckTimeoutSeconds: Any? = null
        fun healthCheckTimeoutSeconds(value: Int?) { this.healthCheckTimeoutSeconds = value }
        fun healthCheckTimeoutSeconds(value: IntrinsicFunction) { this.healthCheckTimeoutSeconds = value }
        @JvmField var healthyThresholdCount: Any? = null
        fun healthyThresholdCount(value: Int?) { this.healthyThresholdCount = value }
        fun healthyThresholdCount(value: IntrinsicFunction) { this.healthyThresholdCount = value }
        @JvmField var matcher: Any? = null
        fun matcher(value: Matcher?) { this.matcher = value }
        fun matcher(value: IntrinsicFunction) { this.matcher = value }
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var port: Any? = null
        fun port(value: Int) { this.port = value }
        fun port(value: IntrinsicFunction) { this.port = value }
        @JvmField var protocol: Any? = null
        fun protocol(value: String) { this.protocol = value }
        fun protocol(value: IntrinsicFunction) { this.protocol = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var targetGroupAttributes: Any? = null
        fun targetGroupAttributes(value: List<TargetGroupAttribute>?) { this.targetGroupAttributes = value }
        fun targetGroupAttributes(vararg value: IntrinsicFunction) { this.targetGroupAttributes = value }
        @JvmField var targetType: Any? = null
        fun targetType(value: String?) { this.targetType = value }
        fun targetType(value: IntrinsicFunction) { this.targetType = value }
        @JvmField var targets: Any? = null
        fun targets(value: List<TargetDescription>?) { this.targets = value }
        fun targets(vararg value: IntrinsicFunction) { this.targets = value }
        @JvmField var unhealthyThresholdCount: Any? = null
        fun unhealthyThresholdCount(value: Int?) { this.unhealthyThresholdCount = value }
        fun unhealthyThresholdCount(value: IntrinsicFunction) { this.unhealthyThresholdCount = value }
        @JvmField var vpcId: Any? = null
        fun vpcId(value: String) { this.vpcId = value }
        fun vpcId(value: IntrinsicFunction) { this.vpcId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Matcher(
            val httpCode: String
    )

    class TargetDescription(
            val availabilityZone: String? = null,
            val id: String,
            val port: Int? = null
    )

    class TargetGroupAttribute(
            val key: String? = null,
            val value: String? = null
    )

}

fun Resources.awsElasticLoadBalancingV2TargetGroup(logicalId: String, init: AWSElasticLoadBalancingV2TargetGroup.() -> Unit = {}): AWSElasticLoadBalancingV2TargetGroup {
    return AWSElasticLoadBalancingV2TargetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
