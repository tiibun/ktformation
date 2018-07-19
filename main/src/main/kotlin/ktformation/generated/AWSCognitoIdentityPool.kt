
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::IdentityPool - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 */
@CloudFormationMarker
class AWSCognitoIdentityPool(logicalId: String) : Resource<AWSCognitoIdentityPool.Properties>(logicalId, "AWS::Cognito::IdentityPool") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allowUnauthenticatedIdentities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var allowUnauthenticatedIdentities: Any? = null

        /**
         * [allowUnauthenticatedIdentities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun allowUnauthenticatedIdentities(value: Boolean) {
          this.allowUnauthenticatedIdentities = value
        }
        
        /**
         * [allowUnauthenticatedIdentities](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun allowUnauthenticatedIdentities(value: IntrinsicFunction) {
          this.allowUnauthenticatedIdentities = value
        }

        /**
         * [cognitoEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var cognitoEvents: Any? = null

        /**
         * [cognitoEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun cognitoEvents(value: Json) {
          this.cognitoEvents = value
        }
        
        /**
         * [cognitoEvents](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun cognitoEvents(value: IntrinsicFunction) {
          this.cognitoEvents = value
        }

        /**
         * [cognitoIdentityProviders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
         *
         * _Required_: no
         *
         * _Type_: List<CognitoIdentityProvider>
         */
        @JvmField
        var cognitoIdentityProviders: Any? = null

        /**
         * [cognitoIdentityProviders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
         *
         * _Required_: no
         *
         * _Type_: List<CognitoIdentityProvider>
         */
        fun cognitoIdentityProviders(value: List<CognitoIdentityProvider>) {
          this.cognitoIdentityProviders = value
        }
        
        /**
         * [cognitoIdentityProviders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
         *
         * _Required_: no
         *
         * _Type_: List<CognitoIdentityProvider>
         */
        fun cognitoIdentityProviders(vararg value: IntrinsicFunction) {
          this.cognitoIdentityProviders = value
        }

        /**
         * [cognitoStreams](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
         *
         * _Required_: no
         *
         * _Type_: CognitoStreams
         */
        @JvmField
        var cognitoStreams: Any? = null

        /**
         * [cognitoStreams](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
         *
         * _Required_: no
         *
         * _Type_: CognitoStreams
         */
        fun cognitoStreams(value: CognitoStreams) {
          this.cognitoStreams = value
        }
        
        /**
         * [cognitoStreams](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
         *
         * _Required_: no
         *
         * _Type_: CognitoStreams
         */
        fun cognitoStreams(value: IntrinsicFunction) {
          this.cognitoStreams = value
        }

        /**
         * [developerProviderName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var developerProviderName: Any? = null

        /**
         * [developerProviderName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun developerProviderName(value: String) {
          this.developerProviderName = value
        }
        
        /**
         * [developerProviderName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun developerProviderName(value: IntrinsicFunction) {
          this.developerProviderName = value
        }

        /**
         * [identityPoolName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var identityPoolName: Any? = null

        /**
         * [identityPoolName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun identityPoolName(value: String) {
          this.identityPoolName = value
        }
        
        /**
         * [identityPoolName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun identityPoolName(value: IntrinsicFunction) {
          this.identityPoolName = value
        }

        /**
         * [openIdConnectProviderARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var openIdConnectProviderARNs: Any? = null

        /**
         * [openIdConnectProviderARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun openIdConnectProviderARNs(value: List<String>) {
          this.openIdConnectProviderARNs = value
        }
        
        /**
         * [openIdConnectProviderARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun openIdConnectProviderARNs(vararg value: IntrinsicFunction) {
          this.openIdConnectProviderARNs = value
        }

        /**
         * [pushSync](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
         *
         * _Required_: no
         *
         * _Type_: PushSync
         */
        @JvmField
        var pushSync: Any? = null

        /**
         * [pushSync](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
         *
         * _Required_: no
         *
         * _Type_: PushSync
         */
        fun pushSync(value: PushSync) {
          this.pushSync = value
        }
        
        /**
         * [pushSync](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
         *
         * _Required_: no
         *
         * _Type_: PushSync
         */
        fun pushSync(value: IntrinsicFunction) {
          this.pushSync = value
        }

        /**
         * [samlProviderARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var samlProviderARNs: Any? = null

        /**
         * [samlProviderARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun samlProviderARNs(value: List<String>) {
          this.samlProviderARNs = value
        }
        
        /**
         * [samlProviderARNs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun samlProviderARNs(vararg value: IntrinsicFunction) {
          this.samlProviderARNs = value
        }

        /**
         * [supportedLoginProviders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var supportedLoginProviders: Any? = null

        /**
         * [supportedLoginProviders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun supportedLoginProviders(value: Json) {
          this.supportedLoginProviders = value
        }
        
        /**
         * [supportedLoginProviders](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun supportedLoginProviders(value: IntrinsicFunction) {
          this.supportedLoginProviders = value
        }

        /**
        * [CognitoIdentityProvider](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
        */
        fun cognitoIdentityProvider(init: CognitoIdentityProvider.() -> Unit = {}): CognitoIdentityProvider {
            return CognitoIdentityProvider().also {
                it.init()
            }
        }
        /**
        * [CognitoStreams](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html)
        */
        fun cognitoStreams(init: CognitoStreams.() -> Unit = {}): CognitoStreams {
            return CognitoStreams().also {
                it.init()
            }
        }
        /**
        * [PushSync](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html)
        */
        fun pushSync(init: PushSync.() -> Unit = {}): PushSync {
            return PushSync().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class CognitoIdentityProvider {
            /**
         * [clientId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var clientId: Any? = null

        /**
         * [clientId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientId(value: String) {
          this.clientId = value
        }
        
        /**
         * [clientId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clientId(value: IntrinsicFunction) {
          this.clientId = value
        }

        /**
         * [providerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var providerName: Any? = null

        /**
         * [providerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun providerName(value: String) {
          this.providerName = value
        }
        
        /**
         * [providerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun providerName(value: IntrinsicFunction) {
          this.providerName = value
        }

        /**
         * [serverSideTokenCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var serverSideTokenCheck: Any? = null

        /**
         * [serverSideTokenCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun serverSideTokenCheck(value: Boolean) {
          this.serverSideTokenCheck = value
        }
        
        /**
         * [serverSideTokenCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun serverSideTokenCheck(value: IntrinsicFunction) {
          this.serverSideTokenCheck = value
        }

    }

    @CloudFormationMarker
    class CognitoStreams {
            /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var streamName: Any? = null

        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun streamName(value: String) {
          this.streamName = value
        }
        
        /**
         * [streamName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun streamName(value: IntrinsicFunction) {
          this.streamName = value
        }

        /**
         * [streamingStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var streamingStatus: Any? = null

        /**
         * [streamingStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun streamingStatus(value: String) {
          this.streamingStatus = value
        }
        
        /**
         * [streamingStatus](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun streamingStatus(value: IntrinsicFunction) {
          this.streamingStatus = value
        }

    }

    @CloudFormationMarker
    class PushSync {
            /**
         * [applicationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var applicationArns: Any? = null

        /**
         * [applicationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun applicationArns(value: List<String>) {
          this.applicationArns = value
        }
        
        /**
         * [applicationArns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun applicationArns(vararg value: IntrinsicFunction) {
          this.applicationArns = value
        }

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }

    }

}

/**
 * [AWS::Cognito::IdentityPool - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 */
fun Resources.awsCognitoIdentityPool(logicalId: String, init: AWSCognitoIdentityPool.() -> Unit = {}): AWSCognitoIdentityPool {
    return AWSCognitoIdentityPool(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
