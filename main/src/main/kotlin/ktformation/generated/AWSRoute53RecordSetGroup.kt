
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

        /**
        * [AliasTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html)
        */
        fun aliasTarget(init: AliasTarget.() -> Unit = {}): AliasTarget {
            return AliasTarget().also {
                it.init()
            }
        }
        /**
        * [GeoLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html)
        */
        fun geoLocation(init: GeoLocation.() -> Unit = {}): GeoLocation {
            return GeoLocation().also {
                it.init()
            }
        }
        /**
        * [RecordSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html)
        */
        fun recordSet(init: RecordSet.() -> Unit = {}): RecordSet {
            return RecordSet().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class AliasTarget {
            /**
         * [dNSName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dNSName: Any? = null

        /**
         * [dNSName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dNSName(value: String) {
          this.dNSName = value
        }
        
        /**
         * [dNSName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-dnshostname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dNSName(value: IntrinsicFunction) {
          this.dNSName = value
        }

        /**
         * [evaluateTargetHealth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var evaluateTargetHealth: Any? = null

        /**
         * [evaluateTargetHealth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun evaluateTargetHealth(value: Boolean) {
          this.evaluateTargetHealth = value
        }
        
        /**
         * [evaluateTargetHealth](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-evaluatetargethealth)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun evaluateTargetHealth(value: IntrinsicFunction) {
          this.evaluateTargetHealth = value
        }

        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var hostedZoneId: Any? = null

        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostedZoneId(value: String) {
          this.hostedZoneId = value
        }
        
        /**
         * [hostedZoneId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-aliastarget.html#cfn-route53-aliastarget-hostedzoneid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostedZoneId(value: IntrinsicFunction) {
          this.hostedZoneId = value
        }

    }

    @CloudFormationMarker
    class GeoLocation {
            /**
         * [continentCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var continentCode: Any? = null

        /**
         * [continentCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun continentCode(value: String) {
          this.continentCode = value
        }
        
        /**
         * [continentCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun continentCode(value: IntrinsicFunction) {
          this.continentCode = value
        }

        /**
         * [countryCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var countryCode: Any? = null

        /**
         * [countryCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun countryCode(value: String) {
          this.countryCode = value
        }
        
        /**
         * [countryCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-countrycode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun countryCode(value: IntrinsicFunction) {
          this.countryCode = value
        }

        /**
         * [subdivisionCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subdivisionCode: Any? = null

        /**
         * [subdivisionCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subdivisionCode(value: String) {
          this.subdivisionCode = value
        }
        
        /**
         * [subdivisionCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-geolocation.html#cfn-route53-recordset-geolocation-subdivisioncode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subdivisionCode(value: IntrinsicFunction) {
          this.subdivisionCode = value
        }

    }

    @CloudFormationMarker
    class RecordSet {
            /**
         * [aliasTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset.html#cfn-route53-recordset-aliastarget)
         *
         * _Required_: no
         *
         * _Type_: AliasTarget
         */
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
