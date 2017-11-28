
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::IdentityPool - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 */
@CloudFormationMarker
class AWSCognitoIdentityPool(logicalId: String) : Resource<AWSCognitoIdentityPool.Properties>(logicalId, "AWS::Cognito::IdentityPool") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var allowUnauthenticatedIdentities: Any? = null
        fun allowUnauthenticatedIdentities(value: Boolean) { this.allowUnauthenticatedIdentities = value }
        fun allowUnauthenticatedIdentities(value: IntrinsicFunction) { this.allowUnauthenticatedIdentities = value }
        @JvmField var cognitoEvents: Any? = null
        fun cognitoEvents(value: Json?) { this.cognitoEvents = value }
        fun cognitoEvents(value: IntrinsicFunction) { this.cognitoEvents = value }
        @JvmField var cognitoIdentityProviders: Any? = null
        fun cognitoIdentityProviders(value: List<CognitoIdentityProvider>?) { this.cognitoIdentityProviders = value }
        fun cognitoIdentityProviders(vararg value: IntrinsicFunction) { this.cognitoIdentityProviders = value }
        @JvmField var cognitoStreams: Any? = null
        fun cognitoStreams(value: CognitoStreams?) { this.cognitoStreams = value }
        fun cognitoStreams(value: IntrinsicFunction) { this.cognitoStreams = value }
        @JvmField var developerProviderName: Any? = null
        fun developerProviderName(value: String?) { this.developerProviderName = value }
        fun developerProviderName(value: IntrinsicFunction) { this.developerProviderName = value }
        @JvmField var identityPoolName: Any? = null
        fun identityPoolName(value: String?) { this.identityPoolName = value }
        fun identityPoolName(value: IntrinsicFunction) { this.identityPoolName = value }
        @JvmField var openIdConnectProviderARNs: Any? = null
        fun openIdConnectProviderARNs(value: List<String>?) { this.openIdConnectProviderARNs = value }
        fun openIdConnectProviderARNs(vararg value: IntrinsicFunction) { this.openIdConnectProviderARNs = value }
        @JvmField var pushSync: Any? = null
        fun pushSync(value: PushSync?) { this.pushSync = value }
        fun pushSync(value: IntrinsicFunction) { this.pushSync = value }
        @JvmField var samlProviderARNs: Any? = null
        fun samlProviderARNs(value: List<String>?) { this.samlProviderARNs = value }
        fun samlProviderARNs(vararg value: IntrinsicFunction) { this.samlProviderARNs = value }
        @JvmField var supportedLoginProviders: Any? = null
        fun supportedLoginProviders(value: Json?) { this.supportedLoginProviders = value }
        fun supportedLoginProviders(value: IntrinsicFunction) { this.supportedLoginProviders = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class CognitoIdentityProvider(
            val clientId: String? = null,
            val providerName: String? = null,
            val serverSideTokenCheck: Boolean? = null
    )

    class CognitoStreams(
            val roleArn: String? = null,
            val streamName: String? = null,
            val streamingStatus: String? = null
    )

    class PushSync(
            val applicationArns: List<String>? = null,
            val roleArn: String? = null
    )

}

fun Resources.awsCognitoIdentityPool(logicalId: String, init: AWSCognitoIdentityPool.() -> Unit = {}): AWSCognitoIdentityPool {
    return AWSCognitoIdentityPool(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
