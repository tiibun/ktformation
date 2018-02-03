
package ktformation.generated

import ktformation.*

/**
 * [AWS::ApiGateway::BasePathMapping - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
 */
@CloudFormationMarker
class AWSApiGatewayBasePathMapping(logicalId: String) : Resource<AWSApiGatewayBasePathMapping.Properties>(logicalId, "AWS::ApiGateway::BasePathMapping") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [basePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var basePath: Any? = null

        /**
         * [basePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun basePath(value: String) {
          this.basePath = value
        }
        
        /**
         * [basePath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun basePath(value: IntrinsicFunction) {
          this.basePath = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var restApiId: Any? = null

        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun restApiId(value: String) {
          this.restApiId = value
        }
        
        /**
         * [restApiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun restApiId(value: IntrinsicFunction) {
          this.restApiId = value
        }
        
        /**
         * [stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var stage: Any? = null

        /**
         * [stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stage(value: String) {
          this.stage = value
        }
        
        /**
         * [stage](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun stage(value: IntrinsicFunction) {
          this.stage = value
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
 * [AWS::ApiGateway::BasePathMapping - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
 */
fun Resources.awsApiGatewayBasePathMapping(logicalId: String, init: AWSApiGatewayBasePathMapping.() -> Unit = {}): AWSApiGatewayBasePathMapping {
    return AWSApiGatewayBasePathMapping(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
