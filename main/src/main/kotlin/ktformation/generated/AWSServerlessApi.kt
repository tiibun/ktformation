
package ktformation.generated

import ktformation.*

/**
 * [AWS::Serverless::Api - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
 */
@CloudFormationMarker
class AWSServerlessApi(logicalId: String) : Resource<AWSServerlessApi.Properties>(logicalId, "AWS::Serverless::Api") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cacheClusterEnabled](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var cacheClusterEnabled: Any? = null

        /**
         * [cacheClusterEnabled](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheClusterEnabled(value: Boolean) {
          this.cacheClusterEnabled = value
        }
        
        /**
         * [cacheClusterEnabled](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun cacheClusterEnabled(value: IntrinsicFunction) {
          this.cacheClusterEnabled = value
        }
        
        /**
         * [cacheClusterSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var cacheClusterSize: Any? = null

        /**
         * [cacheClusterSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheClusterSize(value: String) {
          this.cacheClusterSize = value
        }
        
        /**
         * [cacheClusterSize](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun cacheClusterSize(value: IntrinsicFunction) {
          this.cacheClusterSize = value
        }
        
        /**
         * [definitionBody](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var definitionBody: Any? = null

        /**
         * [definitionBody](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun definitionBody(value: Json) {
          this.definitionBody = value
        }
        
        /**
         * [definitionBody](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun definitionBody(value: IntrinsicFunction) {
          this.definitionBody = value
        }
        
        /**
         * [definitionUri](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: S3LocationOrString
         */
        @JvmField
        var definitionUri: Any? = null

        /**
         * [definitionUri](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: S3LocationOrString
         */
        fun definitionUri(value: S3LocationOrString) {
          this.definitionUri = value
        }
        
        /**
         * [definitionUri](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: S3LocationOrString
         */
        fun definitionUri(value: IntrinsicFunction) {
          this.definitionUri = value
        }
        
        /**
         * [name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [stageName](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var stageName: Any? = null

        /**
         * [stageName](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stageName(value: String) {
          this.stageName = value
        }
        
        /**
         * [stageName](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun stageName(value: IntrinsicFunction) {
          this.stageName = value
        }
        
        /**
         * [variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var variables: Any? = null

        /**
         * [variables](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun variables(value: Map<String, Any>) {
          this.variables = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class S3Location(
            /**
             * [Bucket](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [Key](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Version](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessfunction)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val version: Int
    )

}

/**
 * [AWS::Serverless::Api - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
 */
fun Resources.awsServerlessApi(logicalId: String, init: AWSServerlessApi.() -> Unit = {}): AWSServerlessApi {
    return AWSServerlessApi(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
