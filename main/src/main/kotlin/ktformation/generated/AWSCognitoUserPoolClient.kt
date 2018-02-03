
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPoolClient - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
 */
@CloudFormationMarker
class AWSCognitoUserPoolClient(logicalId: String) : Resource<AWSCognitoUserPoolClient.Properties>(logicalId, "AWS::Cognito::UserPoolClient") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var clientName: Any? = null

        fun clientName(value: String) {
          this.clientName = value
        }
        
        fun clientName(value: IntrinsicFunction) {
          this.clientName = value
        }
        
        @JvmField
        var explicitAuthFlows: Any? = null

        fun explicitAuthFlows(value: List<String>) {
          this.explicitAuthFlows = value
        }
        
        fun explicitAuthFlows(vararg value: IntrinsicFunction) {
          this.explicitAuthFlows = value
        }
        
        @JvmField
        var generateSecret: Any? = null

        fun generateSecret(value: Boolean) {
          this.generateSecret = value
        }
        
        fun generateSecret(value: IntrinsicFunction) {
          this.generateSecret = value
        }
        
        @JvmField
        var readAttributes: Any? = null

        fun readAttributes(value: List<String>) {
          this.readAttributes = value
        }
        
        fun readAttributes(vararg value: IntrinsicFunction) {
          this.readAttributes = value
        }
        
        @JvmField
        var refreshTokenValidity: Any? = null

        fun refreshTokenValidity(value: Double) {
          this.refreshTokenValidity = value
        }
        
        fun refreshTokenValidity(value: IntrinsicFunction) {
          this.refreshTokenValidity = value
        }
        
        @JvmField
        var userPoolId: Any? = null

        fun userPoolId(value: String) {
          this.userPoolId = value
        }
        
        fun userPoolId(value: IntrinsicFunction) {
          this.userPoolId = value
        }
        
        @JvmField
        var writeAttributes: Any? = null

        fun writeAttributes(value: List<String>) {
          this.writeAttributes = value
        }
        
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

fun Resources.awsCognitoUserPoolClient(logicalId: String, init: AWSCognitoUserPoolClient.() -> Unit = {}): AWSCognitoUserPoolClient {
    return AWSCognitoUserPoolClient(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
