
package ktformation.generated

import ktformation.*

/**
 * [AWS::AppSync::ApiKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
 */
@CloudFormationMarker
class AWSAppSyncApiKey(logicalId: String) : Resource<AWSAppSyncApiKey.Properties>(logicalId, "AWS::AppSync::ApiKey") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var apiId: Any? = null

        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: String) {
          this.apiId = value
        }
        
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: IntrinsicFunction) {
          this.apiId = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [expires](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        @JvmField
        var expires: Any? = null

        /**
         * [expires](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun expires(value: Double) {
          this.expires = value
        }
        
        /**
         * [expires](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun expires(value: IntrinsicFunction) {
          this.expires = value
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
 * [AWS::AppSync::ApiKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
 */
fun Resources.awsAppSyncApiKey(logicalId: String, init: AWSAppSyncApiKey.() -> Unit = {}): AWSAppSyncApiKey {
    return AWSAppSyncApiKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
