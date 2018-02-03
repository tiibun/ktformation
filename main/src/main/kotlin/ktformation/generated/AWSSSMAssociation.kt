
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::Association - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 */
@CloudFormationMarker
class AWSSSMAssociation(logicalId: String) : Resource<AWSSSMAssociation.Properties>(logicalId, "AWS::SSM::Association") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var associationName: Any? = null

        fun associationName(value: String) {
          this.associationName = value
        }
        
        fun associationName(value: IntrinsicFunction) {
          this.associationName = value
        }
        
        @JvmField
        var documentVersion: Any? = null

        fun documentVersion(value: String) {
          this.documentVersion = value
        }
        
        fun documentVersion(value: IntrinsicFunction) {
          this.documentVersion = value
        }
        
        @JvmField
        var instanceId: Any? = null

        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
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
        var parameters: Any? = null

        fun parameters(value: Map<String, Any>) {
          this.parameters = value
        }
        
        @JvmField
        var scheduleExpression: Any? = null

        fun scheduleExpression(value: String) {
          this.scheduleExpression = value
        }
        
        fun scheduleExpression(value: IntrinsicFunction) {
          this.scheduleExpression = value
        }
        
        @JvmField
        var targets: Any? = null

        fun targets(value: List<Target>) {
          this.targets = value
        }
        
        fun targets(vararg value: IntrinsicFunction) {
          this.targets = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ParameterValues(
            val parameterValues: List<String>
    )

    class Target(
            val key: String,
            val values: List<String>
    )

}

fun Resources.awsSSMAssociation(logicalId: String, init: AWSSSMAssociation.() -> Unit = {}): AWSSSMAssociation {
    return AWSSSMAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
