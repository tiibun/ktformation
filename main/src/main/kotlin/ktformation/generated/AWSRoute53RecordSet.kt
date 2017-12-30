
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::RecordSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html)
 */
@CloudFormationMarker
class AWSRoute53RecordSet(logicalId: String) : Resource<AWSRoute53RecordSet.Properties>(logicalId, "AWS::Route53::RecordSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var aliasTarget: Any? = null
        fun aliasTarget(value: AliasTarget) {
            this.aliasTarget = value
        }
        fun aliasTarget(value: IntrinsicFunction) { this.aliasTarget = value }
        @JvmField var comment: Any? = null
        fun comment(value: String) {
            this.comment = value
        }
        fun comment(value: IntrinsicFunction) { this.comment = value }
        @JvmField var failover: Any? = null
        fun failover(value: String) {
            this.failover = value
        }
        fun failover(value: IntrinsicFunction) { this.failover = value }
        @JvmField var geoLocation: Any? = null
        fun geoLocation(value: GeoLocation) {
            this.geoLocation = value
        }
        fun geoLocation(value: IntrinsicFunction) { this.geoLocation = value }
        @JvmField var healthCheckId: Any? = null
        fun healthCheckId(value: String) {
            this.healthCheckId = value
        }
        fun healthCheckId(value: IntrinsicFunction) { this.healthCheckId = value }
        @JvmField var hostedZoneId: Any? = null
        fun hostedZoneId(value: String) {
            this.hostedZoneId = value
        }
        fun hostedZoneId(value: IntrinsicFunction) { this.hostedZoneId = value }
        @JvmField var hostedZoneName: Any? = null
        fun hostedZoneName(value: String) {
            this.hostedZoneName = value
        }
        fun hostedZoneName(value: IntrinsicFunction) { this.hostedZoneName = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var region: Any? = null
        fun region(value: String) {
            this.region = value
        }
        fun region(value: IntrinsicFunction) { this.region = value }
        @JvmField var resourceRecords: Any? = null
        fun resourceRecords(value: List<String>) {
            this.resourceRecords = value
        }
        fun resourceRecords(vararg value: IntrinsicFunction) { this.resourceRecords = value }
        @JvmField var setIdentifier: Any? = null
        fun setIdentifier(value: String) {
            this.setIdentifier = value
        }
        fun setIdentifier(value: IntrinsicFunction) { this.setIdentifier = value }
        @JvmField var tTL: Any? = null
        fun tTL(value: String) {
            this.tTL = value
        }
        fun tTL(value: IntrinsicFunction) { this.tTL = value }
        @JvmField var type: Any? = null
        fun type(value: String) { this.type = value }
        fun type(value: IntrinsicFunction) { this.type = value }
        @JvmField var weight: Any? = null
        fun weight(value: Int) {
            this.weight = value
        }
        fun weight(value: IntrinsicFunction) { this.weight = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AliasTarget(
            val dNSName: String,
            val evaluateTargetHealth: Boolean? = null,
            val hostedZoneId: String
    )

    class GeoLocation(
            val continentCode: String? = null,
            val countryCode: String? = null,
            val subdivisionCode: String? = null
    )

}

fun Resources.awsRoute53RecordSet(logicalId: String, init: AWSRoute53RecordSet.() -> Unit = {}): AWSRoute53RecordSet {
    return AWSRoute53RecordSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
