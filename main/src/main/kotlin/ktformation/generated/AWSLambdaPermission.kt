
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Permission - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
 */
@CloudFormationMarker
class AWSLambdaPermission(logicalId: String) : Resource<AWSLambdaPermission.Properties>(logicalId, "AWS::Lambda::Permission") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var action: Any? = null
        fun action(value: String) { this.action = value }
        fun action(value: IntrinsicFunction) { this.action = value }
        @JvmField var eventSourceToken: Any? = null
        fun eventSourceToken(value: String?) { this.eventSourceToken = value }
        fun eventSourceToken(value: IntrinsicFunction) { this.eventSourceToken = value }
        @JvmField var functionName: Any? = null
        fun functionName(value: String) { this.functionName = value }
        fun functionName(value: IntrinsicFunction) { this.functionName = value }
        @JvmField var principal: Any? = null
        fun principal(value: String) { this.principal = value }
        fun principal(value: IntrinsicFunction) { this.principal = value }
        @JvmField var sourceAccount: Any? = null
        fun sourceAccount(value: String?) { this.sourceAccount = value }
        fun sourceAccount(value: IntrinsicFunction) { this.sourceAccount = value }
        @JvmField var sourceArn: Any? = null
        fun sourceArn(value: String?) { this.sourceArn = value }
        fun sourceArn(value: IntrinsicFunction) { this.sourceArn = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLambdaPermission(logicalId: String, init: AWSLambdaPermission.() -> Unit = {}): AWSLambdaPermission {
    return AWSLambdaPermission(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
