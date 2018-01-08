
package ktformation.generated

import ktformation.*

/**
 * [AWS::Serverless::Api - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi)
 */
@CloudFormationMarker
class AWSServerlessApi(logicalId: String) : Resource<AWSServerlessApi.Properties>(logicalId, "AWS::Serverless::Api") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cacheClusterEnabled: Any? = null

        fun cacheClusterEnabled(value: Boolean) {
          this.cacheClusterEnabled = value
        }
        fun cacheClusterEnabled(value: IntrinsicFunction) {
  this.cacheClusterEnabled = value
}
        @JvmField
        var cacheClusterSize: Any? = null

        fun cacheClusterSize(value: String) {
          this.cacheClusterSize = value
        }
        fun cacheClusterSize(value: IntrinsicFunction) {
  this.cacheClusterSize = value
}
        @JvmField
        var definitionBody: Any? = null

        fun definitionBody(value: Json) {
          this.definitionBody = value
        }
        fun definitionBody(value: IntrinsicFunction) {
  this.definitionBody = value
}
        @JvmField
        var definitionUri: Any? = null

        fun definitionUri(value: S3LocationOrString) {
          this.definitionUri = value
        }
        fun definitionUri(value: IntrinsicFunction) {
  this.definitionUri = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var stageName: Any? = null

        fun stageName(value: String) {
          this.stageName = value
        }
        fun stageName(value: IntrinsicFunction) {
  this.stageName = value
}
        @JvmField
        var variables: Any? = null

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
            val bucket: String,
            val key: String,
            val version: Int
    )

}

fun Resources.awsServerlessApi(logicalId: String, init: AWSServerlessApi.() -> Unit = {}): AWSServerlessApi {
    return AWSServerlessApi(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
