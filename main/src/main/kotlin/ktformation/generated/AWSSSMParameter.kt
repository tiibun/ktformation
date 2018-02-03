
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::Parameter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html)
 */
@CloudFormationMarker
class AWSSSMParameter(logicalId: String) : Resource<AWSSSMParameter.Properties>(logicalId, "AWS::SSM::Parameter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var allowedPattern: Any? = null

        fun allowedPattern(value: String) {
          this.allowedPattern = value
        }
        
        fun allowedPattern(value: IntrinsicFunction) {
          this.allowedPattern = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var type: Any? = null

        fun type(value: String) {
          this.type = value
        }
        
        fun type(value: IntrinsicFunction) {
          this.type = value
        }
        
        @JvmField
        var value: Any? = null

        fun value(value: String) {
          this.value = value
        }
        
        fun value(value: IntrinsicFunction) {
          this.value = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsSSMParameter(logicalId: String, init: AWSSSMParameter.() -> Unit = {}): AWSSSMParameter {
    return AWSSSMParameter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
