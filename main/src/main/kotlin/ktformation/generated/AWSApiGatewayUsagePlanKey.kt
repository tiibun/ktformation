
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::UsagePlanKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
@CloudFormationMarker
class AWSApiGatewayUsagePlanKey(logicalId: String) : Resource<AWSApiGatewayUsagePlanKey.Properties>(logicalId, "AWS::ApiGateway::UsagePlanKey") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [keyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var keyId: Any? = null

        /**
         * [keyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun keyId(value: String) {
          this.keyId = value
        }
        
        /**
         * [keyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keyid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun keyId(value: IntrinsicFunction) {
          this.keyId = value
        }
        
        /**
         * [keyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var keyType: Any? = null

        /**
         * [keyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun keyType(value: String) {
          this.keyType = value
        }
        
        /**
         * [keyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-keytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun keyType(value: IntrinsicFunction) {
          this.keyType = value
        }
        
        /**
         * [usagePlanId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var usagePlanId: Any? = null

        /**
         * [usagePlanId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun usagePlanId(value: String) {
          this.usagePlanId = value
        }
        
        /**
         * [usagePlanId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html#cfn-apigateway-usageplankey-usageplanid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun usagePlanId(value: IntrinsicFunction) {
          this.usagePlanId = value
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
 * [AWS::ApiGateway::UsagePlanKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplankey.html)
 */
fun Resources.awsApiGatewayUsagePlanKey(logicalId: String, init: AWSApiGatewayUsagePlanKey.() -> Unit = {}): AWSApiGatewayUsagePlanKey {
    return AWSApiGatewayUsagePlanKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
