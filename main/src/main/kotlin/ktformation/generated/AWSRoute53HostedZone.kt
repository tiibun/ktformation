
package ktformation.generated

import ktformation.*

/**
 * [AWS::Route53::HostedZone - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html)
 */
@CloudFormationMarker
class AWSRoute53HostedZone(logicalId: String) : Resource<AWSRoute53HostedZone.Properties>(logicalId, "AWS::Route53::HostedZone") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [hostedZoneConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
         *
         * _Required_: no
         *
         * _Type_: HostedZoneConfig
         */
        @JvmField
        var hostedZoneConfig: Any? = null

        /**
         * [hostedZoneConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
         *
         * _Required_: no
         *
         * _Type_: HostedZoneConfig
         */
        fun hostedZoneConfig(value: HostedZoneConfig) {
          this.hostedZoneConfig = value
        }
        
        /**
         * [hostedZoneConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
         *
         * _Required_: no
         *
         * _Type_: HostedZoneConfig
         */
        fun hostedZoneConfig(value: IntrinsicFunction) {
          this.hostedZoneConfig = value
        }

        /**
         * [hostedZoneTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
         *
         * _Required_: no
         *
         * _Type_: List<HostedZoneTag>
         */
        @JvmField
        var hostedZoneTags: Any? = null

        /**
         * [hostedZoneTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
         *
         * _Required_: no
         *
         * _Type_: List<HostedZoneTag>
         */
        fun hostedZoneTags(value: List<HostedZoneTag>) {
          this.hostedZoneTags = value
        }
        
        /**
         * [hostedZoneTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
         *
         * _Required_: no
         *
         * _Type_: List<HostedZoneTag>
         */
        fun hostedZoneTags(vararg value: IntrinsicFunction) {
          this.hostedZoneTags = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [queryLoggingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
         *
         * _Required_: no
         *
         * _Type_: QueryLoggingConfig
         */
        @JvmField
        var queryLoggingConfig: Any? = null

        /**
         * [queryLoggingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
         *
         * _Required_: no
         *
         * _Type_: QueryLoggingConfig
         */
        fun queryLoggingConfig(value: QueryLoggingConfig) {
          this.queryLoggingConfig = value
        }
        
        /**
         * [queryLoggingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
         *
         * _Required_: no
         *
         * _Type_: QueryLoggingConfig
         */
        fun queryLoggingConfig(value: IntrinsicFunction) {
          this.queryLoggingConfig = value
        }

        /**
         * [vPCs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
         *
         * _Required_: no
         *
         * _Type_: List<VPC>
         */
        @JvmField
        var vPCs: Any? = null

        /**
         * [vPCs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
         *
         * _Required_: no
         *
         * _Type_: List<VPC>
         */
        fun vPCs(value: List<VPC>) {
          this.vPCs = value
        }
        
        /**
         * [vPCs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
         *
         * _Required_: no
         *
         * _Type_: List<VPC>
         */
        fun vPCs(vararg value: IntrinsicFunction) {
          this.vPCs = value
        }

        /**
        * [HostedZoneConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html)
        */
        fun hostedZoneConfig(init: HostedZoneConfig.() -> Unit = {}): HostedZoneConfig {
            return HostedZoneConfig().also {
                it.init()
            }
        }
        /**
        * [HostedZoneTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html)
        */
        fun hostedZoneTag(init: HostedZoneTag.() -> Unit = {}): HostedZoneTag {
            return HostedZoneTag().also {
                it.init()
            }
        }
        /**
        * [QueryLoggingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html)
        */
        fun queryLoggingConfig(init: QueryLoggingConfig.() -> Unit = {}): QueryLoggingConfig {
            return QueryLoggingConfig().also {
                it.init()
            }
        }
        /**
        * [VPC](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html)
        */
        fun vPC(init: VPC.() -> Unit = {}): VPC {
            return VPC().also {
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
    class HostedZoneConfig {
            /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html#cfn-route53-hostedzone-hostedzoneconfig-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html#cfn-route53-hostedzone-hostedzoneconfig-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html#cfn-route53-hostedzone-hostedzoneconfig-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

    }

    @CloudFormationMarker
    class HostedZoneTag {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

    @CloudFormationMarker
    class QueryLoggingConfig {
            /**
         * [cloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var cloudWatchLogsLogGroupArn: Any? = null

        /**
         * [cloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cloudWatchLogsLogGroupArn(value: String) {
          this.cloudWatchLogsLogGroupArn = value
        }
        
        /**
         * [cloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cloudWatchLogsLogGroupArn(value: IntrinsicFunction) {
          this.cloudWatchLogsLogGroupArn = value
        }

    }

    @CloudFormationMarker
    class VPC {
            /**
         * [vPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var vPCId: Any? = null

        /**
         * [vPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vPCId(value: String) {
          this.vPCId = value
        }
        
        /**
         * [vPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vPCId(value: IntrinsicFunction) {
          this.vPCId = value
        }

        /**
         * [vPCRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var vPCRegion: Any? = null

        /**
         * [vPCRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vPCRegion(value: String) {
          this.vPCRegion = value
        }
        
        /**
         * [vPCRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vPCRegion(value: IntrinsicFunction) {
          this.vPCRegion = value
        }

    }

}

/**
 * [AWS::Route53::HostedZone - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html)
 */
fun Resources.awsRoute53HostedZone(logicalId: String, init: AWSRoute53HostedZone.() -> Unit = {}): AWSRoute53HostedZone {
    return AWSRoute53HostedZone(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
