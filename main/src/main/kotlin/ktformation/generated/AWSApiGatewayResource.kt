
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::Resource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
 */
@CloudFormationMarker
class AWSApiGatewayResource(logicalId: String) : Resource<AWSApiGatewayResource.Properties>(logicalId, "AWS::ApiGateway::Resource") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [parentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var parentId: Any? = null

        /**
         * [parentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parentId(value: String) {
          this.parentId = value
        }
        
        /**
         * [parentId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parentId(value: IntrinsicFunction) {
          this.parentId = value
        }

        /**
         * [pathPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var pathPart: Any? = null

        /**
         * [pathPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun pathPart(value: String) {
          this.pathPart = value
        }
        
        /**
         * [pathPart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun pathPart(value: IntrinsicFunction) {
          this.pathPart = value
        }

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
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
 * [AWS::ApiGateway::Resource - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
 */
fun Resources.awsApiGatewayResource(logicalId: String, init: AWSApiGatewayResource.() -> Unit = {}): AWSApiGatewayResource {
    return AWSApiGatewayResource(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
