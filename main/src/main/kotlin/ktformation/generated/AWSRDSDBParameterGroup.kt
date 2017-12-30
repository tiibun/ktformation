
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::DBParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html)
 */
@CloudFormationMarker
class AWSRDSDBParameterGroup(logicalId: String) : Resource<AWSRDSDBParameterGroup.Properties>(logicalId, "AWS::RDS::DBParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var family: Any? = null
        fun family(value: String) { this.family = value }
        fun family(value: IntrinsicFunction) { this.family = value }
        @JvmField var parameters: Any? = null
        fun parameters(value: Map<String, Any>) {
            this.parameters = value
        }

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

fun Resources.awsRDSDBParameterGroup(logicalId: String, init: AWSRDSDBParameterGroup.() -> Unit = {}): AWSRDSDBParameterGroup {
    return AWSRDSDBParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
