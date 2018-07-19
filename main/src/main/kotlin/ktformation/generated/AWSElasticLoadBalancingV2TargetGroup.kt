
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticLoadBalancingV2::TargetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html)
 */
@CloudFormationMarker
class AWSElasticLoadBalancingV2TargetGroup(logicalId: String) : Resource<AWSElasticLoadBalancingV2TargetGroup.Properties>(logicalId, "AWS::ElasticLoadBalancingV2::TargetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [healthCheckIntervalSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var healthCheckIntervalSeconds: Any? = null

        /**
         * [healthCheckIntervalSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckIntervalSeconds(value: Int) {
          this.healthCheckIntervalSeconds = value
        }
        
        /**
         * [healthCheckIntervalSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckIntervalSeconds(value: IntrinsicFunction) {
          this.healthCheckIntervalSeconds = value
        }

        /**
         * [healthCheckPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var healthCheckPath: Any? = null

        /**
         * [healthCheckPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckPath(value: String) {
          this.healthCheckPath = value
        }
        
        /**
         * [healthCheckPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckPath(value: IntrinsicFunction) {
          this.healthCheckPath = value
        }

        /**
         * [healthCheckPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var healthCheckPort: Any? = null

        /**
         * [healthCheckPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckPort(value: String) {
          this.healthCheckPort = value
        }
        
        /**
         * [healthCheckPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckPort(value: IntrinsicFunction) {
          this.healthCheckPort = value
        }

        /**
         * [healthCheckProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var healthCheckProtocol: Any? = null

        /**
         * [healthCheckProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckProtocol(value: String) {
          this.healthCheckProtocol = value
        }
        
        /**
         * [healthCheckProtocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun healthCheckProtocol(value: IntrinsicFunction) {
          this.healthCheckProtocol = value
        }

        /**
         * [healthCheckTimeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var healthCheckTimeoutSeconds: Any? = null

        /**
         * [healthCheckTimeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckTimeoutSeconds(value: Int) {
          this.healthCheckTimeoutSeconds = value
        }
        
        /**
         * [healthCheckTimeoutSeconds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthCheckTimeoutSeconds(value: IntrinsicFunction) {
          this.healthCheckTimeoutSeconds = value
        }

        /**
         * [healthyThresholdCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var healthyThresholdCount: Any? = null

        /**
         * [healthyThresholdCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthyThresholdCount(value: Int) {
          this.healthyThresholdCount = value
        }
        
        /**
         * [healthyThresholdCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun healthyThresholdCount(value: IntrinsicFunction) {
          this.healthyThresholdCount = value
        }

        /**
         * [matcher](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
         *
         * _Required_: no
         *
         * _Type_: Matcher
         */
        @JvmField
        var matcher: Any? = null

        /**
         * [matcher](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
         *
         * _Required_: no
         *
         * _Type_: Matcher
         */
        fun matcher(value: Matcher) {
          this.matcher = value
        }
        
        /**
         * [matcher](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
         *
         * _Required_: no
         *
         * _Type_: Matcher
         */
        fun matcher(value: IntrinsicFunction) {
          this.matcher = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [targetGroupAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
         *
         * _Required_: no
         *
         * _Type_: List<TargetGroupAttribute>
         */
        @JvmField
        var targetGroupAttributes: Any? = null

        /**
         * [targetGroupAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
         *
         * _Required_: no
         *
         * _Type_: List<TargetGroupAttribute>
         */
        fun targetGroupAttributes(value: List<TargetGroupAttribute>) {
          this.targetGroupAttributes = value
        }
        
        /**
         * [targetGroupAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
         *
         * _Required_: no
         *
         * _Type_: List<TargetGroupAttribute>
         */
        fun targetGroupAttributes(vararg value: IntrinsicFunction) {
          this.targetGroupAttributes = value
        }

        /**
         * [targetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var targetType: Any? = null

        /**
         * [targetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetType(value: String) {
          this.targetType = value
        }
        
        /**
         * [targetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun targetType(value: IntrinsicFunction) {
          this.targetType = value
        }

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
         *
         * _Required_: no
         *
         * _Type_: List<TargetDescription>
         */
        @JvmField
        var targets: Any? = null

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
         *
         * _Required_: no
         *
         * _Type_: List<TargetDescription>
         */
        fun targets(value: List<TargetDescription>) {
          this.targets = value
        }
        
        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
         *
         * _Required_: no
         *
         * _Type_: List<TargetDescription>
         */
        fun targets(vararg value: IntrinsicFunction) {
          this.targets = value
        }

        /**
         * [unhealthyThresholdCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var unhealthyThresholdCount: Any? = null

        /**
         * [unhealthyThresholdCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun unhealthyThresholdCount(value: Int) {
          this.unhealthyThresholdCount = value
        }
        
        /**
         * [unhealthyThresholdCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun unhealthyThresholdCount(value: IntrinsicFunction) {
          this.unhealthyThresholdCount = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }

        /**
        * [Matcher](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html)
        */
        fun matcher(init: Matcher.() -> Unit = {}): Matcher {
            return Matcher().also {
                it.init()
            }
        }
        /**
        * [TargetDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html)
        */
        fun targetDescription(init: TargetDescription.() -> Unit = {}): TargetDescription {
            return TargetDescription().also {
                it.init()
            }
        }
        /**
        * [TargetGroupAttribute](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html)
        */
        fun targetGroupAttribute(init: TargetGroupAttribute.() -> Unit = {}): TargetGroupAttribute {
            return TargetGroupAttribute().also {
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
    class Matcher {
            /**
         * [httpCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var httpCode: Any? = null

        /**
         * [httpCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun httpCode(value: String) {
          this.httpCode = value
        }
        
        /**
         * [httpCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun httpCode(value: IntrinsicFunction) {
          this.httpCode = value
        }

    }

    @CloudFormationMarker
    class TargetDescription {
            /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var id: Any? = null

        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: String) {
          this.id = value
        }
        
        /**
         * [id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-id)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun id(value: IntrinsicFunction) {
          this.id = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

    }

    @CloudFormationMarker
    class TargetGroupAttribute {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

}

/**
 * [AWS::ElasticLoadBalancingV2::TargetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html)
 */
fun Resources.awsElasticLoadBalancingV2TargetGroup(logicalId: String, init: AWSElasticLoadBalancingV2TargetGroup.() -> Unit = {}): AWSElasticLoadBalancingV2TargetGroup {
    return AWSElasticLoadBalancingV2TargetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
