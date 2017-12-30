
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBSecurityGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group.html)
 */
@CloudFormationMarker
class AWSRDSDBSecurityGroup(logicalId: String) : Resource<AWSRDSDBSecurityGroup.Properties>(logicalId, "AWS::RDS::DBSecurityGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var dBSecurityGroupIngress: Any? = null
        fun dBSecurityGroupIngress(value: List<Ingress>) { this.dBSecurityGroupIngress = value }
        fun dBSecurityGroupIngress(vararg value: IntrinsicFunction) { this.dBSecurityGroupIngress = value }
        @JvmField var eC2VpcId: Any? = null
        fun eC2VpcId(value: String) {
            this.eC2VpcId = value
        }
        fun eC2VpcId(value: IntrinsicFunction) { this.eC2VpcId = value }
        @JvmField var groupDescription: Any? = null
        fun groupDescription(value: String) { this.groupDescription = value }
        fun groupDescription(value: IntrinsicFunction) { this.groupDescription = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Ingress(
            val cIDRIP: String? = null,
            val eC2SecurityGroupId: String? = null,
            val eC2SecurityGroupName: String? = null,
            val eC2SecurityGroupOwnerId: String? = null
    )

}

fun Resources.awsRDSDBSecurityGroup(logicalId: String, init: AWSRDSDBSecurityGroup.() -> Unit = {}): AWSRDSDBSecurityGroup {
    return AWSRDSDBSecurityGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
