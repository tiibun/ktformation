
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::RecordSetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html)
 */
@CloudFormationMarker
class AWSRoute53RecordSetGroup(logicalId: String) : Resource<AWSRoute53RecordSetGroup.Properties>(logicalId, "AWS::Route53::RecordSetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var comment: Any? = null

        fun comment(value: String) {
          this.comment = value
        }
        
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }
        
        @JvmField
        var hostedZoneId: Any? = null

        fun hostedZoneId(value: String) {
          this.hostedZoneId = value
        }
        
        fun hostedZoneId(value: IntrinsicFunction) {
          this.hostedZoneId = value
        }
        
        @JvmField
        var hostedZoneName: Any? = null

        fun hostedZoneName(value: String) {
          this.hostedZoneName = value
        }
        
        fun hostedZoneName(value: IntrinsicFunction) {
          this.hostedZoneName = value
        }
        
        @JvmField
        var recordSets: Any? = null

        fun recordSets(value: List<RecordSet>) {
          this.recordSets = value
        }
        
        fun recordSets(vararg value: IntrinsicFunction) {
          this.recordSets = value
        }
        
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

    class RecordSet(
            val aliasTarget: AliasTarget? = null,
            val comment: String? = null,
            val failover: String? = null,
            val geoLocation: GeoLocation? = null,
            val healthCheckId: String? = null,
            val hostedZoneId: String? = null,
            val hostedZoneName: String? = null,
            val name: String,
            val region: String? = null,
            val resourceRecords: List<String>? = null,
            val setIdentifier: String? = null,
            val tTL: String? = null,
            val type: String,
            val weight: Int? = null
    )

}

fun Resources.awsRoute53RecordSetGroup(logicalId: String, init: AWSRoute53RecordSetGroup.() -> Unit = {}): AWSRoute53RecordSetGroup {
    return AWSRoute53RecordSetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
