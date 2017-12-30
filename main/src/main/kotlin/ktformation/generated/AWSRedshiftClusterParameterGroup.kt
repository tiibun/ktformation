
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::ClusterParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html)
 */
@CloudFormationMarker
class AWSRedshiftClusterParameterGroup(logicalId: String) : Resource<AWSRedshiftClusterParameterGroup.Properties>(logicalId, "AWS::Redshift::ClusterParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var parameterGroupFamily: Any? = null
        fun parameterGroupFamily(value: String) { this.parameterGroupFamily = value }
        fun parameterGroupFamily(value: IntrinsicFunction) { this.parameterGroupFamily = value }
        @JvmField var parameters: Any? = null
        fun parameters(value: List<Parameter>) {
            this.parameters = value
        }
        fun parameters(vararg value: IntrinsicFunction) { this.parameters = value }
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


    class Parameter(
            val parameterName: String,
            val parameterValue: String
    )

}

fun Resources.awsRedshiftClusterParameterGroup(logicalId: String, init: AWSRedshiftClusterParameterGroup.() -> Unit = {}): AWSRedshiftClusterParameterGroup {
    return AWSRedshiftClusterParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
