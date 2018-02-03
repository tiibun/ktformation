
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Version - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
 */
@CloudFormationMarker
class AWSLambdaVersion(logicalId: String) : Resource<AWSLambdaVersion.Properties>(logicalId, "AWS::Lambda::Version") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var codeSha256: Any? = null

        fun codeSha256(value: String) {
          this.codeSha256 = value
        }
        
        fun codeSha256(value: IntrinsicFunction) {
          this.codeSha256 = value
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
        var functionName: Any? = null

        fun functionName(value: String) {
          this.functionName = value
        }
        
        fun functionName(value: IntrinsicFunction) {
          this.functionName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsLambdaVersion(logicalId: String, init: AWSLambdaVersion.() -> Unit = {}): AWSLambdaVersion {
    return AWSLambdaVersion(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
