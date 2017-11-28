
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBClusterParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html)
 */
@CloudFormationMarker
class AWSRDSDBClusterParameterGroup(logicalId: String) : Resource<AWSRDSDBClusterParameterGroup.Properties>(logicalId, "AWS::RDS::DBClusterParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var family: Any? = null
        fun family(value: String) { this.family = value }
        fun family(value: IntrinsicFunction) { this.family = value }
        @JvmField var parameters: Any? = null
        fun parameters(value: Json) { this.parameters = value }
        fun parameters(value: IntrinsicFunction) { this.parameters = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>?) { this.tags = value }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsRDSDBClusterParameterGroup(logicalId: String, init: AWSRDSDBClusterParameterGroup.() -> Unit = {}): AWSRDSDBClusterParameterGroup {
    return AWSRDSDBClusterParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
