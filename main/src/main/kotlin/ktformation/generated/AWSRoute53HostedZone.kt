
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::HostedZone - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html)
 */
@CloudFormationMarker
class AWSRoute53HostedZone(logicalId: String) : Resource<AWSRoute53HostedZone.Properties>(logicalId, "AWS::Route53::HostedZone") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var hostedZoneConfig: Any? = null

        fun hostedZoneConfig(value: HostedZoneConfig) {
          this.hostedZoneConfig = value
        }
        fun hostedZoneConfig(value: IntrinsicFunction) {
  this.hostedZoneConfig = value
}
        @JvmField
        var hostedZoneTags: Any? = null

        fun hostedZoneTags(value: List<HostedZoneTag>) {
          this.hostedZoneTags = value
        }
        fun hostedZoneTags(vararg value: IntrinsicFunction) {
  this.hostedZoneTags = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var queryLoggingConfig: Any? = null

        fun queryLoggingConfig(value: QueryLoggingConfig) {
          this.queryLoggingConfig = value
        }
        fun queryLoggingConfig(value: IntrinsicFunction) {
  this.queryLoggingConfig = value
}
        @JvmField
        var vPCs: Any? = null

        fun vPCs(value: List<VPC>) {
          this.vPCs = value
        }
        fun vPCs(vararg value: IntrinsicFunction) {
  this.vPCs = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class HostedZoneConfig(
            val comment: String? = null
    )

    class HostedZoneTag(
            val key: String,
            val value: String
    )

    class QueryLoggingConfig(
            val cloudWatchLogsLogGroupArn: String
    )

    class VPC(
            val vPCId: String,
            val vPCRegion: String
    )

}

fun Resources.awsRoute53HostedZone(logicalId: String, init: AWSRoute53HostedZone.() -> Unit = {}): AWSRoute53HostedZone {
    return AWSRoute53HostedZone(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
