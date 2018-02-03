
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::RecordSetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html)
 */
@CloudFormationMarker
class AWSRoute53RecordSetGroup(logicalId: String) : Resource<AWSRoute53RecordSetGroup.Properties>(logicalId, "AWS::Route53::RecordSetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }
        
        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostedZoneId: Any? = null

        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneId(value: String) {
          this.hostedZoneId = value
        }
        
        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneId(value: IntrinsicFunction) {
          this.hostedZoneId = value
        }
        
        /**
         * [hostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostedZoneName: Any? = null

        /**
         * [hostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneName(value: String) {
          this.hostedZoneName = value
        }
        
        /**
         * [hostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneName(value: IntrinsicFunction) {
          this.hostedZoneName = value
        }
        
        /**
         * [recordSets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
         *
         * _Required_: no
         *
         * _Type_: List<RecordSet>
         */
        @JvmField
        var recordSets: Any? = null

        /**
         * [recordSets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
         *
         * _Required_: no
         *
         * _Type_: List<RecordSet>
         */
        fun recordSets(value: List<RecordSet>) {
          this.recordSets = value
        }
        
        /**
         * [recordSets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
         *
         * _Required_: no
         *
         * _Type_: List<RecordSet>
         */
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
            /**
             * [DNSName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dNSName: String,
            /**
             * [EvaluateTargetHealth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val evaluateTargetHealth: Boolean? = null,
            /**
             * [HostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val hostedZoneId: String
    )

    class GeoLocation(
            /**
             * [ContinentCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val continentCode: String? = null,
            /**
             * [CountryCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val countryCode: String? = null,
            /**
             * [SubdivisionCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subdivisionCode: String? = null
    )

    class RecordSet(
            /**
             * [AliasTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-aliastarget)
             *
             * _Required_: no
             *
             * _Type_: AliasTarget
             */
            val aliasTarget: AliasTarget? = null,
            /**
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val comment: String? = null,
            /**
             * [Failover](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val failover: String? = null,
            /**
             * [GeoLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-geolocation)
             *
             * _Required_: no
             *
             * _Type_: GeoLocation
             */
            val geoLocation: GeoLocation? = null,
            /**
             * [HealthCheckId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val healthCheckId: String? = null,
            /**
             * [HostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hostedZoneId: String? = null,
            /**
             * [HostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val hostedZoneName: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val region: String? = null,
            /**
             * [ResourceRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val resourceRecords: List<String>? = null,
            /**
             * [SetIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val setIdentifier: String? = null,
            /**
             * [TTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tTL: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String,
            /**
             * [Weight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val weight: Int? = null
    )

}

/**
 * [AWS::Route53::RecordSetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html)
 */
fun Resources.awsRoute53RecordSetGroup(logicalId: String, init: AWSRoute53RecordSetGroup.() -> Unit = {}): AWSRoute53RecordSetGroup {
    return AWSRoute53RecordSetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
