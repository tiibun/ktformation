
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::Permission - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
 */
@CloudFormationMarker
class AWSLambdaPermission(logicalId: String) : Resource<AWSLambdaPermission.Properties>(logicalId, "AWS::Lambda::Permission") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var action: Any? = null

        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun action(value: String) {
          this.action = value
        }
        
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun action(value: IntrinsicFunction) {
          this.action = value
        }
        
        /**
         * [eventSourceToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var eventSourceToken: Any? = null

        /**
         * [eventSourceToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eventSourceToken(value: String) {
          this.eventSourceToken = value
        }
        
        /**
         * [eventSourceToken](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun eventSourceToken(value: IntrinsicFunction) {
          this.eventSourceToken = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var functionName: Any? = null

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: String) {
          this.functionName = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: IntrinsicFunction) {
          this.functionName = value
        }
        
        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var principal: Any? = null

        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principal(value: String) {
          this.principal = value
        }
        
        /**
         * [principal](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun principal(value: IntrinsicFunction) {
          this.principal = value
        }
        
        /**
         * [sourceAccount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceAccount: Any? = null

        /**
         * [sourceAccount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceAccount(value: String) {
          this.sourceAccount = value
        }
        
        /**
         * [sourceAccount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceAccount(value: IntrinsicFunction) {
          this.sourceAccount = value
        }
        
        /**
         * [sourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceArn: Any? = null

        /**
         * [sourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceArn(value: String) {
          this.sourceArn = value
        }
        
        /**
         * [sourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceArn(value: IntrinsicFunction) {
          this.sourceArn = value
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
 * [AWS::Lambda::Permission - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
 */
fun Resources.awsLambdaPermission(logicalId: String, init: AWSLambdaPermission.() -> Unit = {}): AWSLambdaPermission {
    return AWSLambdaPermission(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
