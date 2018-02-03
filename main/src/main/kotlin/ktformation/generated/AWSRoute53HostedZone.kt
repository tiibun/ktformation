
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class HostedZoneConfig(
            /**
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html#cfn-route53-hostedzone-hostedzoneconfig-comment)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val comment: String? = null
    )

    class HostedZoneTag(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetags.html#cfn-route53-hostedzonetags-value)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val value: String
    )

    class QueryLoggingConfig(
            /**
             * [CloudWatchLogsLogGroupArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val cloudWatchLogsLogGroupArn: String
    )

    class VPC(
            /**
             * [VPCId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val vPCId: String,
            /**
             * [VPCRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val vPCRegion: String
    )

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
