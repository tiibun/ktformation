
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPoolClient - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
 */
@CloudFormationMarker
class AWSCognitoUserPoolClient(logicalId: String) : Resource<AWSCognitoUserPoolClient.Properties>(logicalId, "AWS::Cognito::UserPoolClient") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [clientName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clientName: Any? = null

        /**
         * [clientName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientName(value: String) {
          this.clientName = value
        }
        
        /**
         * [clientName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientName(value: IntrinsicFunction) {
          this.clientName = value
        }
        
        /**
         * [explicitAuthFlows](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var explicitAuthFlows: Any? = null

        /**
         * [explicitAuthFlows](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun explicitAuthFlows(value: List<String>) {
          this.explicitAuthFlows = value
        }
        
        /**
         * [explicitAuthFlows](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun explicitAuthFlows(vararg value: IntrinsicFunction) {
          this.explicitAuthFlows = value
        }
        
        /**
         * [generateSecret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var generateSecret: Any? = null

        /**
         * [generateSecret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun generateSecret(value: Boolean) {
          this.generateSecret = value
        }
        
        /**
         * [generateSecret](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun generateSecret(value: IntrinsicFunction) {
          this.generateSecret = value
        }
        
        /**
         * [readAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var readAttributes: Any? = null

        /**
         * [readAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun readAttributes(value: List<String>) {
          this.readAttributes = value
        }
        
        /**
         * [readAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun readAttributes(vararg value: IntrinsicFunction) {
          this.readAttributes = value
        }
        
        /**
         * [refreshTokenValidity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        @JvmField
        var refreshTokenValidity: Any? = null

        /**
         * [refreshTokenValidity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun refreshTokenValidity(value: Double) {
          this.refreshTokenValidity = value
        }
        
        /**
         * [refreshTokenValidity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun refreshTokenValidity(value: IntrinsicFunction) {
          this.refreshTokenValidity = value
        }
        
        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var userPoolId: Any? = null

        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userPoolId(value: String) {
          this.userPoolId = value
        }
        
        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userPoolId(value: IntrinsicFunction) {
          this.userPoolId = value
        }
        
        /**
         * [writeAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var writeAttributes: Any? = null

        /**
         * [writeAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun writeAttributes(value: List<String>) {
          this.writeAttributes = value
        }
        
        /**
         * [writeAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun writeAttributes(vararg value: IntrinsicFunction) {
          this.writeAttributes = value
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
 * [AWS::Cognito::UserPoolClient - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
 */
fun Resources.awsCognitoUserPoolClient(logicalId: String, init: AWSCognitoUserPoolClient.() -> Unit = {}): AWSCognitoUserPoolClient {
    return AWSCognitoUserPoolClient(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
