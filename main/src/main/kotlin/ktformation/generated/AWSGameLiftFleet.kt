
package ktformation.generated

import ktformation.*

/**
 * [AWS::GameLift::Fleet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
 */
@CloudFormationMarker
class AWSGameLiftFleet(logicalId: String) : Resource<AWSGameLiftFleet.Properties>(logicalId, "AWS::GameLift::Fleet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [buildId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var buildId: Any? = null

        /**
         * [buildId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun buildId(value: String) {
          this.buildId = value
        }
        
        /**
         * [buildId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun buildId(value: IntrinsicFunction) {
          this.buildId = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [desiredEC2Instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var desiredEC2Instances: Any? = null

        /**
         * [desiredEC2Instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun desiredEC2Instances(value: Int) {
          this.desiredEC2Instances = value
        }
        
        /**
         * [desiredEC2Instances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun desiredEC2Instances(value: IntrinsicFunction) {
          this.desiredEC2Instances = value
        }

        /**
         * [eC2InboundPermissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
         *
         * _Required_: no
         *
         * _Type_: List<IpPermission>
         */
        @JvmField
        var eC2InboundPermissions: Any? = null

        /**
         * [eC2InboundPermissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
         *
         * _Required_: no
         *
         * _Type_: List<IpPermission>
         */
        fun eC2InboundPermissions(value: List<IpPermission>) {
          this.eC2InboundPermissions = value
        }
        
        /**
         * [eC2InboundPermissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
         *
         * _Required_: no
         *
         * _Type_: List<IpPermission>
         */
        fun eC2InboundPermissions(vararg value: IntrinsicFunction) {
          this.eC2InboundPermissions = value
        }

        /**
         * [eC2InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var eC2InstanceType: Any? = null

        /**
         * [eC2InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eC2InstanceType(value: String) {
          this.eC2InstanceType = value
        }
        
        /**
         * [eC2InstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eC2InstanceType(value: IntrinsicFunction) {
          this.eC2InstanceType = value
        }

        /**
         * [logPaths](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var logPaths: Any? = null

        /**
         * [logPaths](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun logPaths(value: List<String>) {
          this.logPaths = value
        }
        
        /**
         * [logPaths](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun logPaths(vararg value: IntrinsicFunction) {
          this.logPaths = value
        }

        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var maxSize: Any? = null

        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxSize(value: Int) {
          this.maxSize = value
        }
        
        /**
         * [maxSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun maxSize(value: IntrinsicFunction) {
          this.maxSize = value
        }

        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var minSize: Any? = null

        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minSize(value: Int) {
          this.minSize = value
        }
        
        /**
         * [minSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun minSize(value: IntrinsicFunction) {
          this.minSize = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [serverLaunchParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var serverLaunchParameters: Any? = null

        /**
         * [serverLaunchParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serverLaunchParameters(value: String) {
          this.serverLaunchParameters = value
        }
        
        /**
         * [serverLaunchParameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serverLaunchParameters(value: IntrinsicFunction) {
          this.serverLaunchParameters = value
        }

        /**
         * [serverLaunchPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serverLaunchPath: Any? = null

        /**
         * [serverLaunchPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serverLaunchPath(value: String) {
          this.serverLaunchPath = value
        }
        
        /**
         * [serverLaunchPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serverLaunchPath(value: IntrinsicFunction) {
          this.serverLaunchPath = value
        }

        /**
        * [IpPermission](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html)
        */
        fun ipPermission(init: IpPermission.() -> Unit = {}): IpPermission {
            return IpPermission().also {
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
    class IpPermission {
            /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var fromPort: Any? = null

        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun fromPort(value: Int) {
          this.fromPort = value
        }
        
        /**
         * [fromPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-fromport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun fromPort(value: IntrinsicFunction) {
          this.fromPort = value
        }

        /**
         * [ipRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ipRange: Any? = null

        /**
         * [ipRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipRange(value: String) {
          this.ipRange = value
        }
        
        /**
         * [ipRange](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-iprange)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipRange(value: IntrinsicFunction) {
          this.ipRange = value
        }

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var protocol: Any? = null

        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: String) {
          this.protocol = value
        }
        
        /**
         * [protocol](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-protocol)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun protocol(value: IntrinsicFunction) {
          this.protocol = value
        }

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var toPort: Any? = null

        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun toPort(value: Int) {
          this.toPort = value
        }
        
        /**
         * [toPort](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ec2inboundpermission.html#cfn-gamelift-fleet-ec2inboundpermissions-toport)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun toPort(value: IntrinsicFunction) {
          this.toPort = value
        }

    }

}

/**
 * [AWS::GameLift::Fleet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
 */
fun Resources.awsGameLiftFleet(logicalId: String, init: AWSGameLiftFleet.() -> Unit = {}): AWSGameLiftFleet {
    return AWSGameLiftFleet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
