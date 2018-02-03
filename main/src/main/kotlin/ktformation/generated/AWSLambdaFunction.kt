
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Function - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html)
 */
@CloudFormationMarker
class AWSLambdaFunction(logicalId: String) : Resource<AWSLambdaFunction.Properties>(logicalId, "AWS::Lambda::Function") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [code](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * _Required_: yes
         *
         * _Type_: Code
         */
        @JvmField
        var code: Any? = null

        /**
         * [code](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * _Required_: yes
         *
         * _Type_: Code
         */
        fun code(value: Code) {
          this.code = value
        }
        
        /**
         * [code](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * _Required_: yes
         *
         * _Type_: Code
         */
        fun code(value: IntrinsicFunction) {
          this.code = value
        }
        
        /**
         * [deadLetterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
         *
         * _Required_: no
         *
         * _Type_: DeadLetterConfig
         */
        @JvmField
        var deadLetterConfig: Any? = null

        /**
         * [deadLetterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
         *
         * _Required_: no
         *
         * _Type_: DeadLetterConfig
         */
        fun deadLetterConfig(value: DeadLetterConfig) {
          this.deadLetterConfig = value
        }
        
        /**
         * [deadLetterConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
         *
         * _Required_: no
         *
         * _Type_: DeadLetterConfig
         */
        fun deadLetterConfig(value: IntrinsicFunction) {
          this.deadLetterConfig = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * _Required_: no
         *
         * _Type_: Environment
         */
        @JvmField
        var environment: Any? = null

        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * _Required_: no
         *
         * _Type_: Environment
         */
        fun environment(value: Environment) {
          this.environment = value
        }
        
        /**
         * [environment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * _Required_: no
         *
         * _Type_: Environment
         */
        fun environment(value: IntrinsicFunction) {
          this.environment = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var functionName: Any? = null

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun functionName(value: String) {
          this.functionName = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun functionName(value: IntrinsicFunction) {
          this.functionName = value
        }
        
        /**
         * [handler](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var handler: Any? = null

        /**
         * [handler](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun handler(value: String) {
          this.handler = value
        }
        
        /**
         * [handler](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun handler(value: IntrinsicFunction) {
          this.handler = value
        }
        
        /**
         * [kmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyArn: Any? = null

        /**
         * [kmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyArn(value: String) {
          this.kmsKeyArn = value
        }
        
        /**
         * [kmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyArn(value: IntrinsicFunction) {
          this.kmsKeyArn = value
        }
        
        /**
         * [memorySize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var memorySize: Any? = null

        /**
         * [memorySize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memorySize(value: Int) {
          this.memorySize = value
        }
        
        /**
         * [memorySize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun memorySize(value: IntrinsicFunction) {
          this.memorySize = value
        }
        
        /**
         * [reservedConcurrentExecutions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var reservedConcurrentExecutions: Any? = null

        /**
         * [reservedConcurrentExecutions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun reservedConcurrentExecutions(value: Int) {
          this.reservedConcurrentExecutions = value
        }
        
        /**
         * [reservedConcurrentExecutions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun reservedConcurrentExecutions(value: IntrinsicFunction) {
          this.reservedConcurrentExecutions = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var role: Any? = null

        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: String) {
          this.role = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: IntrinsicFunction) {
          this.role = value
        }
        
        /**
         * [runtime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var runtime: Any? = null

        /**
         * [runtime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun runtime(value: String) {
          this.runtime = value
        }
        
        /**
         * [runtime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun runtime(value: IntrinsicFunction) {
          this.runtime = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var timeout: Any? = null

        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: Int) {
          this.timeout = value
        }
        
        /**
         * [timeout](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun timeout(value: IntrinsicFunction) {
          this.timeout = value
        }
        
        /**
         * [tracingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * _Required_: no
         *
         * _Type_: TracingConfig
         */
        @JvmField
        var tracingConfig: Any? = null

        /**
         * [tracingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * _Required_: no
         *
         * _Type_: TracingConfig
         */
        fun tracingConfig(value: TracingConfig) {
          this.tracingConfig = value
        }
        
        /**
         * [tracingConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * _Required_: no
         *
         * _Type_: TracingConfig
         */
        fun tracingConfig(value: IntrinsicFunction) {
          this.tracingConfig = value
        }
        
        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        @JvmField
        var vpcConfig: Any? = null

        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: VpcConfig) {
          this.vpcConfig = value
        }
        
        /**
         * [vpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * _Required_: no
         *
         * _Type_: VpcConfig
         */
        fun vpcConfig(value: IntrinsicFunction) {
          this.vpcConfig = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Code(
            /**
             * [S3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3Bucket: String? = null,
            /**
             * [S3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3Key: String? = null,
            /**
             * [S3ObjectVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val s3ObjectVersion: String? = null,
            /**
             * [ZipFile](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val zipFile: String? = null
    )

    class DeadLetterConfig(
            /**
             * [TargetArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val targetArn: String? = null
    )

    class Environment(
            /**
             * [Variables](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables)
             *
             * _Required_: no
             *
             * _Type_: Map<String, Any>
             */
            val variables: Map<String, Any>? = null
    )

    class TracingConfig(
            /**
             * [Mode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val mode: String? = null
    )

    class VpcConfig(
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>,
            /**
             * [SubnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnetIds: List<String>
    )

}

/**
 * [AWS::Lambda::Function - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html)
 */
fun Resources.awsLambdaFunction(logicalId: String, init: AWSLambdaFunction.() -> Unit = {}): AWSLambdaFunction {
    return AWSLambdaFunction(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
