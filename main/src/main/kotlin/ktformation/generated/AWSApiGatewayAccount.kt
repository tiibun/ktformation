
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Account - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
 */
@CloudFormationMarker
class AWSApiGatewayAccount(logicalId: String) : Resource<AWSApiGatewayAccount.Properties>(logicalId, "AWS::ApiGateway::Account") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cloudWatchRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cloudWatchRoleArn: Any? = null

        /**
         * [cloudWatchRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchRoleArn(value: String) {
          this.cloudWatchRoleArn = value
        }
        
        /**
         * [cloudWatchRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cloudWatchRoleArn(value: IntrinsicFunction) {
          this.cloudWatchRoleArn = value
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
 * [AWS::ApiGateway::Account - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
 */
fun Resources.awsApiGatewayAccount(logicalId: String, init: AWSApiGatewayAccount.() -> Unit = {}): AWSApiGatewayAccount {
    return AWSApiGatewayAccount(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
