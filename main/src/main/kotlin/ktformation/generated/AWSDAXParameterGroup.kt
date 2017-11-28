
package ktformation.generated

import ktformation.*

/**
 * [AWS::DAX::ParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
 */
@CloudFormationMarker
class AWSDAXParameterGroup(logicalId: String) : Resource<AWSDAXParameterGroup.Properties>(logicalId, "AWS::DAX::ParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var description: Any? = null
        fun description(value: String?) { this.description = value }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var parameterGroupName: Any? = null
        fun parameterGroupName(value: String?) { this.parameterGroupName = value }
        fun parameterGroupName(value: IntrinsicFunction) { this.parameterGroupName = value }
        @JvmField var parameterNameValues: Any? = null
        fun parameterNameValues(value: Json?) { this.parameterNameValues = value }
        fun parameterNameValues(value: IntrinsicFunction) { this.parameterNameValues = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsDAXParameterGroup(logicalId: String, init: AWSDAXParameterGroup.() -> Unit = {}): AWSDAXParameterGroup {
    return AWSDAXParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
