
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFormation::Stack - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html)
 */
@CloudFormationMarker
class AWSCloudFormationStack(logicalId: String) : Resource<AWSCloudFormationStack.Properties>(logicalId, "AWS::CloudFormation::Stack") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var notificationARNs: Any? = null

        fun notificationARNs(value: List<String>) {
          this.notificationARNs = value
        }
        
        fun notificationARNs(vararg value: IntrinsicFunction) {
          this.notificationARNs = value
        }
        
        @JvmField
        var parameters: Any? = null

        fun parameters(value: Map<String, Any>) {
          this.parameters = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        @JvmField
        var templateURL: Any? = null

        fun templateURL(value: String) {
          this.templateURL = value
        }
        
        fun templateURL(value: IntrinsicFunction) {
          this.templateURL = value
        }
        
        @JvmField
        var timeoutInMinutes: Any? = null

        fun timeoutInMinutes(value: Int) {
          this.timeoutInMinutes = value
        }
        
        fun timeoutInMinutes(value: IntrinsicFunction) {
          this.timeoutInMinutes = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsCloudFormationStack(logicalId: String, init: AWSCloudFormationStack.() -> Unit = {}): AWSCloudFormationStack {
    return AWSCloudFormationStack(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
