
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBSubnetGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnet-group.html)
 */
@CloudFormationMarker
class AWSRDSDBSubnetGroup(logicalId: String) : Resource<AWSRDSDBSubnetGroup.Properties>(logicalId, "AWS::RDS::DBSubnetGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var dBSubnetGroupDescription: Any? = null
        fun dBSubnetGroupDescription(value: String) { this.dBSubnetGroupDescription = value }
        fun dBSubnetGroupDescription(value: IntrinsicFunction) { this.dBSubnetGroupDescription = value }
        @JvmField var subnetIds: Any? = null
        fun subnetIds(value: List<String>) { this.subnetIds = value }
        fun subnetIds(vararg value: IntrinsicFunction) { this.subnetIds = value }
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



}

fun Resources.awsRDSDBSubnetGroup(logicalId: String, init: AWSRDSDBSubnetGroup.() -> Unit = {}): AWSRDSDBSubnetGroup {
    return AWSRDSDBSubnetGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
