
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBSecurityGroupIngress - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html)
 */
@CloudFormationMarker
class AWSRDSDBSecurityGroupIngress(logicalId: String) : Resource<AWSRDSDBSecurityGroupIngress.Properties>(logicalId, "AWS::RDS::DBSecurityGroupIngress") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var cIDRIP: Any? = null
        fun cIDRIP(value: String?) { this.cIDRIP = value }
        fun cIDRIP(value: IntrinsicFunction) { this.cIDRIP = value }
        @JvmField var dBSecurityGroupName: Any? = null
        fun dBSecurityGroupName(value: String) { this.dBSecurityGroupName = value }
        fun dBSecurityGroupName(value: IntrinsicFunction) { this.dBSecurityGroupName = value }
        @JvmField var eC2SecurityGroupId: Any? = null
        fun eC2SecurityGroupId(value: String?) { this.eC2SecurityGroupId = value }
        fun eC2SecurityGroupId(value: IntrinsicFunction) { this.eC2SecurityGroupId = value }
        @JvmField var eC2SecurityGroupName: Any? = null
        fun eC2SecurityGroupName(value: String?) { this.eC2SecurityGroupName = value }
        fun eC2SecurityGroupName(value: IntrinsicFunction) { this.eC2SecurityGroupName = value }
        @JvmField var eC2SecurityGroupOwnerId: Any? = null
        fun eC2SecurityGroupOwnerId(value: String?) { this.eC2SecurityGroupOwnerId = value }
        fun eC2SecurityGroupOwnerId(value: IntrinsicFunction) { this.eC2SecurityGroupOwnerId = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsRDSDBSecurityGroupIngress(logicalId: String, init: AWSRDSDBSecurityGroupIngress.() -> Unit = {}): AWSRDSDBSecurityGroupIngress {
    return AWSRDSDBSecurityGroupIngress(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
