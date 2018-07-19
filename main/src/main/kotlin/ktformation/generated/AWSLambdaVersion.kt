
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Version - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
 */
@CloudFormationMarker
class AWSLambdaVersion(logicalId: String) : Resource<AWSLambdaVersion.Properties>(logicalId, "AWS::Lambda::Version") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [codeSha256](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var codeSha256: Any? = null

        /**
         * [codeSha256](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun codeSha256(value: String) {
          this.codeSha256 = value
        }
        
        /**
         * [codeSha256](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun codeSha256(value: IntrinsicFunction) {
          this.codeSha256 = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var functionName: Any? = null

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: String) {
          this.functionName = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::Lambda::Version - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
 */
fun Resources.awsLambdaVersion(logicalId: String, init: AWSLambdaVersion.() -> Unit = {}): AWSLambdaVersion {
    return AWSLambdaVersion(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
