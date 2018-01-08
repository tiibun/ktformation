
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::EventSourceMapping - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
 */
@CloudFormationMarker
class AWSLambdaEventSourceMapping(logicalId: String) : Resource<AWSLambdaEventSourceMapping.Properties>(logicalId, "AWS::Lambda::EventSourceMapping") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var batchSize: Any? = null

        fun batchSize(value: Int) {
          this.batchSize = value
        }
        fun batchSize(value: IntrinsicFunction) {
  this.batchSize = value
}
        @JvmField
        var enabled: Any? = null

        fun enabled(value: Boolean) {
          this.enabled = value
        }
        fun enabled(value: IntrinsicFunction) {
  this.enabled = value
}
        @JvmField
        var eventSourceArn: Any? = null

        fun eventSourceArn(value: String) {
          this.eventSourceArn = value
        }
        fun eventSourceArn(value: IntrinsicFunction) {
  this.eventSourceArn = value
}
        @JvmField
        var functionName: Any? = null

        fun functionName(value: String) {
          this.functionName = value
        }
        fun functionName(value: IntrinsicFunction) {
  this.functionName = value
}
        @JvmField
        var startingPosition: Any? = null

        fun startingPosition(value: String) {
          this.startingPosition = value
        }
        fun startingPosition(value: IntrinsicFunction) {
  this.startingPosition = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLambdaEventSourceMapping(logicalId: String, init: AWSLambdaEventSourceMapping.() -> Unit = {}): AWSLambdaEventSourceMapping {
    return AWSLambdaEventSourceMapping(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
