
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::RecordSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html)
 */
@CloudFormationMarker
class AWSRoute53RecordSet(logicalId: String) : Resource<AWSRoute53RecordSet.Properties>(logicalId, "AWS::Route53::RecordSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [aliasTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-aliastarget)
         *
         * _Required_: no
         *
         * _Type_: AliasTarget
         */
        @JvmField
        var aliasTarget: Any? = null

        /**
         * [aliasTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-aliastarget)
         *
         * _Required_: no
         *
         * _Type_: AliasTarget
         */
        fun aliasTarget(value: AliasTarget) {
          this.aliasTarget = value
        }
        
        /**
         * [aliasTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-aliastarget)
         *
         * _Required_: no
         *
         * _Type_: AliasTarget
         */
        fun aliasTarget(value: IntrinsicFunction) {
          this.aliasTarget = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }
        
        /**
         * [failover](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var failover: Any? = null

        /**
         * [failover](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun failover(value: String) {
          this.failover = value
        }
        
        /**
         * [failover](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-failover)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun failover(value: IntrinsicFunction) {
          this.failover = value
        }
        
        /**
         * [geoLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-geolocation)
         *
         * _Required_: no
         *
         * _Type_: GeoLocation
         */
        @JvmField
        var geoLocation: Any? = null

        /**
         * [geoLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-geolocation)
         *
         * _Required_: no
         *
         * _Type_: GeoLocation
         */
        fun geoLocation(value: GeoLocation) {
          this.geoLocation = value
        }
        
        /**
         * [geoLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-geolocation)
         *
         * _Required_: no
         *
         * _Type_: GeoLocation
         */
        fun geoLocation(value: IntrinsicFunction) {
          this.geoLocation = value
        }
        
        /**
         * [healthCheckId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var healthCheckId: Any? = null

        /**
         * [healthCheckId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckId(value: String) {
          this.healthCheckId = value
        }
        
        /**
         * [healthCheckId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-healthcheckid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckId(value: IntrinsicFunction) {
          this.healthCheckId = value
        }
        
        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostedZoneId: Any? = null

        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneId(value: String) {
          this.hostedZoneId = value
        }
        
        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzoneid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneId(value: IntrinsicFunction) {
          this.hostedZoneId = value
        }
        
        /**
         * [hostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostedZoneName: Any? = null

        /**
         * [hostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneName(value: String) {
          this.hostedZoneName = value
        }
        
        /**
         * [hostedZoneName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-hostedzonename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostedZoneName(value: IntrinsicFunction) {
          this.hostedZoneName = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var region: Any? = null

        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun region(value: String) {
          this.region = value
        }
        
        /**
         * [region](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-region)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun region(value: IntrinsicFunction) {
          this.region = value
        }
        
        /**
         * [resourceRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var resourceRecords: Any? = null

        /**
         * [resourceRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun resourceRecords(value: List<String>) {
          this.resourceRecords = value
        }
        
        /**
         * [resourceRecords](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-resourcerecords)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun resourceRecords(vararg value: IntrinsicFunction) {
          this.resourceRecords = value
        }
        
        /**
         * [setIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var setIdentifier: Any? = null

        /**
         * [setIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun setIdentifier(value: String) {
          this.setIdentifier = value
        }
        
        /**
         * [setIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-setidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun setIdentifier(value: IntrinsicFunction) {
          this.setIdentifier = value
        }
        
        /**
         * [tTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var tTL: Any? = null

        /**
         * [tTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tTL(value: String) {
          this.tTL = value
        }
        
        /**
         * [tTL](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-ttl)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tTL(value: IntrinsicFunction) {
          this.tTL = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
        /**
         * [weight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var weight: Any? = null

        /**
         * [weight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun weight(value: Int) {
          this.weight = value
        }
        
        /**
         * [weight](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-weight)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun weight(value: IntrinsicFunction) {
          this.weight = value
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
             * [ContinentCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-continentcode)
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

}

/**
 * [AWS::Route53::RecordSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html)
 */
fun Resources.awsRoute53RecordSet(logicalId: String, init: AWSRoute53RecordSet.() -> Unit = {}): AWSRoute53RecordSet {
    return AWSRoute53RecordSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
