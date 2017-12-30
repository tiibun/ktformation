
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Function - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html)
 */
@CloudFormationMarker
class AWSLambdaFunction(logicalId: String) : Resource<AWSLambdaFunction.Properties>(logicalId, "AWS::Lambda::Function") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var code: Any? = null
        fun code(value: Code) { this.code = value }
        fun code(value: IntrinsicFunction) { this.code = value }
        @JvmField var deadLetterConfig: Any? = null
        fun deadLetterConfig(value: DeadLetterConfig) {
            this.deadLetterConfig = value
        }
        fun deadLetterConfig(value: IntrinsicFunction) { this.deadLetterConfig = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var environment: Any? = null
        fun environment(value: Environment) {
            this.environment = value
        }
        fun environment(value: IntrinsicFunction) { this.environment = value }
        @JvmField var functionName: Any? = null
        fun functionName(value: String) {
            this.functionName = value
        }
        fun functionName(value: IntrinsicFunction) { this.functionName = value }
        @JvmField var handler: Any? = null
        fun handler(value: String) { this.handler = value }
        fun handler(value: IntrinsicFunction) { this.handler = value }
        @JvmField var kmsKeyArn: Any? = null
        fun kmsKeyArn(value: String) {
            this.kmsKeyArn = value
        }
        fun kmsKeyArn(value: IntrinsicFunction) { this.kmsKeyArn = value }
        @JvmField var memorySize: Any? = null
        fun memorySize(value: Int) {
            this.memorySize = value
        }
        fun memorySize(value: IntrinsicFunction) { this.memorySize = value }
        @JvmField var role: Any? = null
        fun role(value: String) { this.role = value }
        fun role(value: IntrinsicFunction) { this.role = value }
        @JvmField var runtime: Any? = null
        fun runtime(value: String) { this.runtime = value }
        fun runtime(value: IntrinsicFunction) { this.runtime = value }
        @JvmField var tags: Any? = null
        fun tags(value: List<Tag>) {
            this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) { this.tags = value }
        @JvmField var timeout: Any? = null
        fun timeout(value: Int) {
            this.timeout = value
        }
        fun timeout(value: IntrinsicFunction) { this.timeout = value }
        @JvmField var tracingConfig: Any? = null
        fun tracingConfig(value: TracingConfig) {
            this.tracingConfig = value
        }
        fun tracingConfig(value: IntrinsicFunction) { this.tracingConfig = value }
        @JvmField var vpcConfig: Any? = null
        fun vpcConfig(value: VpcConfig) {
            this.vpcConfig = value
        }
        fun vpcConfig(value: IntrinsicFunction) { this.vpcConfig = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Code(
            val s3Bucket: String? = null,
            val s3Key: String? = null,
            val s3ObjectVersion: String? = null,
            val zipFile: String? = null
    )

    class DeadLetterConfig(
            val targetArn: String? = null
    )

    class Environment(
            val variables: Map<String, Any>? = null
    )

    class TracingConfig(
            val mode: String? = null
    )

    class VpcConfig(
            val securityGroupIds: List<String>,
            val subnetIds: List<String>
    )

}

fun Resources.awsLambdaFunction(logicalId: String, init: AWSLambdaFunction.() -> Unit = {}): AWSLambdaFunction {
    return AWSLambdaFunction(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
